package com.supermartijn642.rechiseled.blocks;

import com.supermartijn642.core.block.BlockProperties;
import net.minecraft.block.BlockPlanks;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import java.util.Optional;

/**
 * Created 09/05/2023 by SuperMartijn642
 */
public class RechiseledGlassPillarBlock extends RechiseledPillarBlock {
    public RechiseledGlassPillarBlock(boolean connecting, BlockProperties properties) {
        super(connecting, properties);
    }
    
    public RechiseledGlassPillarBlock(boolean connecting, BlockProperties properties, Optional<BlockPlanks.EnumType> plankType) {
        super(connecting, properties, plankType);
    }

    @Override
    public boolean shouldSideBeRendered(IBlockState state, IBlockAccess level, BlockPos pos, EnumFacing side){
        IBlockState otherState = level.getBlockState(pos.offset(side));
        return otherState.getBlock() != this && super.shouldSideBeRendered(state, level, pos, side);
    }

    @Override
    public boolean causesSuffocation(IBlockState state){
        return false;
    }

    @Override
    public boolean canCreatureSpawn(IBlockState state, IBlockAccess world, BlockPos pos, EntityLiving.SpawnPlacementType type){
        return false;
    }

    @Override
    public boolean isFullCube(IBlockState state){
        return false;
    }

    @Override
    public boolean isOpaqueCube(IBlockState state){
        return false;
    }

    @Override
    public BlockRenderLayer getBlockLayer(){
        return BlockRenderLayer.TRANSLUCENT;
    }
}
