package com.supermartijn642.rechiseled.screen;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.supermartijn642.core.gui.BaseContainerScreen;
import com.supermartijn642.core.gui.ScreenUtils;
import com.supermartijn642.rechiseled.Rechiseled;
import com.supermartijn642.rechiseled.chiseling.ChiselingEntry;
import com.supermartijn642.rechiseled.chiseling.ChiselingRecipe;
import com.supermartijn642.rechiseled.model.PreviewModeButtonWidget;
import com.supermartijn642.rechiseled.packet.PacketChiselAll;
import com.supermartijn642.rechiseled.packet.PacketSelectEntry;
import com.supermartijn642.rechiseled.packet.PacketToggleConnecting;
import net.minecraft.inventory.container.Slot;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;

/**
 * Created 23/12/2021 by SuperMartijn642
 */
public class BaseChiselingContainerScreen<T extends BaseChiselingContainer> extends BaseContainerScreen<T> {

    private static final ResourceLocation BACKGROUND = new ResourceLocation("rechiseled", "textures/screen/chiseling_background.png");

    /**
     * 0 - 1 block
     * 1 - row of 3 blocks
     * 2 - 3x3 blocks
     */
    public static int previewMode = 0;

    private ChiselAllWidget chiselAllWidget;

    public BaseChiselingContainerScreen(T screenContainer, ITextComponent title){
        super(screenContainer, title);
        this.setDrawSlots(false);
    }

    @Override
    protected int sizeX(){
        return 222;
    }

    @Override
    protected int sizeY(){
        return 226;
    }

    @Override
    protected void addWidgets(){
        for(int row = 0; row < 5; row++){
            for(int column = 0; column < 5; column++){
                int index = row * 5 + column;
                int x = 9 + 20 * column;
                int y = 17 + 22 * row;
                this.addWidget(new BlockButtonWidget(x, y, 20, 22,
                    () -> this.getEntry(index),
                    () -> this.container.currentEntry,
                    () -> this.selectEntry(index),
                    () -> this.container.connecting,
                    this::left,
                    this::top));
            }
        }

        this.addWidget(new BlockPreviewWidget(117, 17, 68, 69, () -> {
            ChiselingEntry entry = this.container.currentEntry;
            if(entry == null)
                return null;
            Item item = (this.container.connecting && entry.hasConnectingItem()) || !entry.hasRegularItem() ? entry.getConnectingItem() : entry.getRegularItem();
            return item instanceof BlockItem ? ((BlockItem)item).getBlock() : null;
        }, () -> previewMode, this::left, this::top));
        this.addWidget(new PreviewModeButtonWidget(193, 18, 19, 21, 2, () -> previewMode, () -> previewMode = 2));
        this.addWidget(new PreviewModeButtonWidget(193, 41, 19, 21, 1, () -> previewMode, () -> previewMode = 1));
        this.addWidget(new PreviewModeButtonWidget(193, 64, 19, 21, 0, () -> previewMode, () -> previewMode = 0));
        this.addWidget(new ConnectingToggleWidget(193, 99, 19, 21, () -> this.container.connecting, () -> this.container.currentEntry, this::toggleConnecting));
        this.chiselAllWidget = this.addWidget(new ChiselAllWidget(127, 99, 19, 21, () -> this.container.currentEntry, this::chiselAll));
    }

    @Override
    protected void renderBackground(MatrixStack matrixStack, int mouseX, int mouseY){
        ScreenUtils.bindTexture(BACKGROUND);
        ScreenUtils.drawTexture(matrixStack, 0, 0, this.sizeX(), this.sizeY());
    }

    @Override
    protected void renderForeground(MatrixStack matrixStack, int mouseX, int mouseY){
        // Render chisel all slot overlays
        if(this.container.currentRecipe != null && this.chiselAllWidget != null && this.chiselAllWidget.hovered){
            for(int index = 1; index < this.container.slots.size(); index++){
                Slot slot = this.container.getSlot(index);
                ItemStack stack = slot.getItem();

                for(ChiselingEntry entry : this.container.currentRecipe.getEntries()){
                    if((!stack.hasTag() || stack.getTag().isEmpty())
                        && ((entry.hasConnectingItem() && stack.getItem() == entry.getConnectingItem())
                        || (entry.hasRegularItem() && stack.getItem() == entry.getRegularItem()))){
                        ScreenUtils.fillRect(matrixStack, slot.x, slot.y, 16, 16, 0, 20, 100, 0.5f);
                    }
                }
            }
        }

        super.renderForeground(matrixStack, mouseX, mouseY);
        ScreenUtils.drawString(matrixStack, this.inventory.getDisplayName(), 31, 133);
    }

    private ChiselingEntry getEntry(int index){
        ChiselingRecipe recipe = this.container.currentRecipe;
        if(recipe == null)
            return null;
        return index >= 0 && index < recipe.getEntries().size() ? recipe.getEntries().get(index) : null;
    }

    private void selectEntry(int index){
        Rechiseled.CHANNEL.sendToServer(new PacketSelectEntry(index));
    }

    private void toggleConnecting(){
        Rechiseled.CHANNEL.sendToServer(new PacketToggleConnecting());
    }

    private void chiselAll(){
        Rechiseled.CHANNEL.sendToServer(new PacketChiselAll());
    }
}
