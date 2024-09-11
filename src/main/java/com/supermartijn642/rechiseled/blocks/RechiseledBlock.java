package com.supermartijn642.rechiseled.blocks;

import com.supermartijn642.core.TextComponents;
import com.supermartijn642.core.block.BaseBlock;
import com.supermartijn642.core.block.BlockProperties;
import net.minecraft.block.BlockPlanks;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.IBlockAccess;

import java.util.Optional;
import java.util.function.Consumer;

import javax.annotation.Nullable;

/**
 * Created 22/12/2021 by SuperMartijn642
 */
public class RechiseledBlock extends BaseBlock {

    public final boolean connecting;
    public final Optional<BlockPlanks.EnumType> plankType;

    protected final void initPlankState() {
        if (plankType != null && plankType.isPresent())
            this.setDefaultState(this.getDefaultState().withProperty(BlockPlanks.VARIANT, plankType.get()));
    }

    public RechiseledBlock(boolean connecting, BlockProperties properties, Optional<BlockPlanks.EnumType> plankType){
        super(false, properties);
        this.connecting = connecting;
        this.plankType = plankType;
        //initPlankState();
    }

    public RechiseledBlock(boolean connecting, BlockProperties properties, BlockPlanks.EnumType plankType){
        super(false, properties);
        this.connecting = connecting;
        this.plankType = Optional.of(plankType);
        //initPlankState();
    }

    public RechiseledBlock(boolean connecting, BlockProperties properties){
        super(false, properties);
        this.connecting = connecting;
        this.plankType = Optional.empty();
        //initPlankState();
    }

    protected BlockStateContainer.Builder blockStateContainerBuilder() {
        BlockStateContainer.Builder builder = new BlockStateContainer.Builder(this);
        if (this.plankType != null && this.plankType.isPresent()) builder.add(BlockPlanks.VARIANT);
        return builder;
    }

    @Override
    protected BlockStateContainer createBlockState(){
        return this.blockStateContainerBuilder().build();
    }

    @Override
    public IBlockState getActualState(IBlockState state, IBlockAccess worldIn, BlockPos pos) {
        if (this.plankType != null && this.plankType.isPresent())
            state = state.withProperty(BlockPlanks.VARIANT, this.plankType.get());
        return state;
    }

    @Override
    protected void appendItemInformation(ItemStack stack, @Nullable IBlockAccess level, Consumer<ITextComponent> info, boolean advanced) {
        if (this.connecting)
            info.accept(TextComponents.translation("rechiseled.tooltip.connecting").color(TextFormatting.GRAY).get());
    }
}
