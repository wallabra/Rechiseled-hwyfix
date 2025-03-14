package com.supermartijn642.rechiseled.compat.jei;

import com.supermartijn642.core.TextComponents;
import com.supermartijn642.rechiseled.Rechiseled;
import com.supermartijn642.rechiseled.chiseling.ChiselingEntry;
import com.supermartijn642.rechiseled.chiseling.ChiselingRecipe;
import mezz.jei.api.IGuiHelper;
import mezz.jei.api.gui.IDrawable;
import mezz.jei.api.gui.IGuiItemStackGroup;
import mezz.jei.api.gui.IRecipeLayout;
import mezz.jei.api.ingredients.IIngredients;
import mezz.jei.api.ingredients.VanillaTypes;
import mezz.jei.api.recipe.IRecipeCategory;
import mezz.jei.api.recipe.IRecipeWrapper;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created 28/12/2021 by SuperMartijn642
 */
public class ChiselingRecipeCategory implements IRecipeCategory<ChiselingRecipeCategory.ChiselingRecipeWrapper> {

    private final IDrawable backgrounds;
    private final IDrawable icon;

    public ChiselingRecipeCategory(IGuiHelper guiHelper){
        this.backgrounds = guiHelper.createDrawable(new ResourceLocation("rechiseled", "textures/screen/jei_category_background.png"), 0, 0, 174, 72);
        this.icon = guiHelper.createDrawableIngredient(new ItemStack(Rechiseled.chisel));
    }

    @Override
    public String getModName(){
        return "Rechiseled";
    }

    @Override
    public String getUid(){
        return "rechiseled:chiseling";
    }

    @Override
    public String getTitle(){
        return TextComponents.translation("rechiseled.jei_category.title").format();
    }

    @Override
    public IDrawable getBackground(){
        return this.backgrounds;
    }

    @Override
    public IDrawable getIcon(){
        return this.icon;
    }

    @Override
    public void setRecipe(IRecipeLayout recipeLayout, ChiselingRecipeWrapper recipe, IIngredients ingredients){
        IGuiItemStackGroup guiItemStacks = recipeLayout.getItemStacks();
        guiItemStacks.init(0, true, 0, 27);
        guiItemStacks.set(0, ingredients.getInputs(VanillaTypes.ITEM).get(0));

        List<List<ItemStack>> outputs = ingredients.getOutputs(VanillaTypes.ITEM);
        for(int i = 0; i < outputs.size(); i++){
            int x = 48 + 18 * (i % 7);
            int y = 18 * (i / 7);
            guiItemStacks.init(i + 1, false, x, y);
            guiItemStacks.set(i + 1, outputs.get(i));
        }
    }

    public static class ChiselingRecipeWrapper implements IRecipeWrapper {

        private final ChiselingRecipe recipe;

        public ChiselingRecipeWrapper(ChiselingRecipe recipe){
            this.recipe = recipe;
        }

        @Override
        public void getIngredients(IIngredients ingredients){
            List<ItemStack> inputs = new ArrayList<>();
            List<List<ItemStack>> outputs = new ArrayList<>();

            for(ChiselingEntry entry : this.recipe.getEntries()){
                List<ItemStack> output = new ArrayList<>();
                if(entry.hasRegularItem()){
                    inputs.add(entry.getRegularItemStack());
                    output.add(entry.getRegularItemStack());
                }
                if(entry.hasConnectingItem()){
                    inputs.add(entry.getConnectingItemStack());
                    output.add(entry.getConnectingItemStack());
                }
                outputs.add(output);
            }

            ingredients.setInputLists(VanillaTypes.ITEM, Collections.singletonList(inputs));
            ingredients.setOutputLists(VanillaTypes.ITEM, outputs);
        }
    }
}
