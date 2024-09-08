package com.supermartijn642.rechiseled.api.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockPlanks;
import net.minecraft.item.ItemBlock;

import java.util.Optional;

/**
 * Created 26/04/2023 by SuperMartijn642
 */
public interface RechiseledBlockType {

    boolean hasRegularVariant();

    Optional<BlockPlanks.EnumType> getPlankType();

    Block getRegularBlock();

    ItemBlock getRegularItem();

    boolean hasConnectingVariant();

    Block getConnectingBlock();

    ItemBlock getConnectingItem();
}
