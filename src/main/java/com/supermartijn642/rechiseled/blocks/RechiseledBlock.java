package com.supermartijn642.rechiseled.blocks;

import com.supermartijn642.core.TextComponents;
import com.supermartijn642.core.block.BaseBlock;
import com.supermartijn642.core.block.BlockProperties;
import net.minecraft.block.BlockPlanks;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.IBlockAccess;

import javax.annotation.Nullable;
import java.util.Optional;
import java.util.function.Consumer;

/**
 * Created 22/12/2021 by SuperMartijn642
 */
public class RechiseledBlock extends BaseBlock {

    public final boolean connecting;
    public final Optional<BlockPlanks.EnumType> plankType;

    public RechiseledBlock(boolean connecting, BlockProperties properties, Optional<BlockPlanks.EnumType> plankType){
        super(false, properties);
        this.connecting = connecting;
        this.plankType = plankType;
    }

    public RechiseledBlock(boolean connecting, BlockProperties properties, BlockPlanks.EnumType plankType){
        super(false, properties);
        this.connecting = connecting;
        this.plankType = Optional.of(plankType);
    }
    
    public RechiseledBlock(boolean connecting, BlockProperties properties){
        super(false, properties);
        this.connecting = connecting;
        this.plankType = Optional.empty();
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

    public IBlockState getStateFromMeta(int meta){
        IBlockState state = this.getDefaultState();
        if (this.plankType != null && this.plankType.isPresent()) state = state.withProperty(BlockPlanks.VARIANT, plankType.get());
        return state;
    }
    
    public int getMetaFromState(IBlockState state){
        return 0;
    }
}
