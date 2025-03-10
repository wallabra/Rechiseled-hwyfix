package com.supermartijn642.rechiseled;

import com.supermartijn642.rechiseled.api.BaseChiselingRecipes;
import com.supermartijn642.rechiseled.api.blocks.BlockSpecification;
import com.supermartijn642.rechiseled.api.blocks.RechiseledBlockBuilder;
import com.supermartijn642.rechiseled.api.blocks.RechiseledBlockType;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPlanks;
import net.minecraft.init.Blocks;

import java.util.function.Supplier;

/**
 * Created 18/04/2023 by SuperMartijn642
 */
@SuppressWarnings("unused")
public class RechiseledBlocks {

    // Acacia planks
    public static final RechiseledBlockType ACACIA_PLANKS_BEAMS = create("acacia_planks_beams", "Acacia Plank Beams", () -> Blocks.PLANKS, BlockPlanks.EnumType.ACACIA).recipe(BaseChiselingRecipes.ACACIA_PLANKS).build();
    public static final RechiseledBlockType ACACIA_PLANKS_BRICK_PATTERN = create("acacia_planks_brick_pattern", "Acacia Plank Brick Pattern", () -> Blocks.PLANKS, BlockPlanks.EnumType.ACACIA).recipe(BaseChiselingRecipes.ACACIA_PLANKS).build();
    public static final RechiseledBlockType ACACIA_PLANKS_BRICK_PAVING = create("acacia_planks_brick_paving", "Acacia Plank Brick Paving", () -> Blocks.PLANKS, BlockPlanks.EnumType.ACACIA).recipe(BaseChiselingRecipes.ACACIA_PLANKS).build();
    public static final RechiseledBlockType ACACIA_PLANKS_BRICKS = create("acacia_planks_bricks", "Acacia Plank Bricks", () -> Blocks.PLANKS, BlockPlanks.EnumType.ACACIA).recipe(BaseChiselingRecipes.ACACIA_PLANKS).build();
    public static final RechiseledBlockType ACACIA_PLANKS_CRATE = create("acacia_planks_crate", "Acacia Planks Crate", () -> Blocks.PLANKS, BlockPlanks.EnumType.ACACIA).recipe(BaseChiselingRecipes.ACACIA_PLANKS).build();
    public static final RechiseledBlockType ACACIA_PLANKS_DIAGONAL_STRIPES = create("acacia_planks_diagonal_stripes", "Diagonal Acacia Plank Stripes", () -> Blocks.PLANKS, BlockPlanks.EnumType.ACACIA).recipe(BaseChiselingRecipes.ACACIA_PLANKS).build();
    public static final RechiseledBlockType ACACIA_PLANKS_DIAGONAL_TILES = create("acacia_planks_diagonal_tiles", "Diagonal Acacia Plank Tiles", () -> Blocks.PLANKS, BlockPlanks.EnumType.ACACIA).recipe(BaseChiselingRecipes.ACACIA_PLANKS).build();
    public static final RechiseledBlockType ACACIA_PLANKS_DOTTED = create("acacia_planks_dotted", "Dotted Acacia Planks", () -> Blocks.PLANKS, BlockPlanks.EnumType.ACACIA).recipe(BaseChiselingRecipes.ACACIA_PLANKS).build();
    public static final RechiseledBlockType ACACIA_PLANKS_FLOORING = create("acacia_planks_flooring", "Acacia Plank Flooring", () -> Blocks.PLANKS, BlockPlanks.EnumType.ACACIA).recipe(BaseChiselingRecipes.ACACIA_PLANKS).build();
    public static final RechiseledBlockType ACACIA_PLANKS_LARGE_TILES = create("acacia_planks_large_tiles", "Large Acacia Plank Tiles", () -> Blocks.PLANKS, BlockPlanks.EnumType.ACACIA).recipe(BaseChiselingRecipes.ACACIA_PLANKS).build();
    public static final RechiseledBlockType ACACIA_PLANKS_MOSAIC = create("acacia_planks_mosaic", "Acacia Plank Mosaic", () -> Blocks.PLANKS, BlockPlanks.EnumType.ACACIA).noConnectingVariant().recipe(BaseChiselingRecipes.ACACIA_PLANKS).build();
    public static final RechiseledBlockType ACACIA_PLANKS_PATTERN = create("acacia_planks_pattern", "Acacia Plank Pattern", () -> Blocks.PLANKS, BlockPlanks.EnumType.ACACIA).recipe(BaseChiselingRecipes.ACACIA_PLANKS).build();
    public static final RechiseledBlockType ACACIA_PLANKS_ROTATED_BRICKS = create("acacia_planks_rotated_bricks", "Rotated Acacia Plank Bricks", () -> Blocks.PLANKS, BlockPlanks.EnumType.ACACIA).recipe(BaseChiselingRecipes.ACACIA_PLANKS).build();
    public static final RechiseledBlockType ACACIA_PLANKS_SMALL_BRICKS = create("acacia_planks_small_bricks", "Small Acacia Plank Bricks", () -> Blocks.PLANKS, BlockPlanks.EnumType.ACACIA).recipe(BaseChiselingRecipes.ACACIA_PLANKS).build();
    public static final RechiseledBlockType ACACIA_PLANKS_SMALL_TILES = create("acacia_planks_small_tiles", "Small Acacia Plank Tiles", () -> Blocks.PLANKS, BlockPlanks.EnumType.ACACIA).recipe(BaseChiselingRecipes.ACACIA_PLANKS).build();
    public static final RechiseledBlockType ACACIA_PLANKS_SQUARES = create("acacia_planks_squares", "Acacia Plank Squares", () -> Blocks.PLANKS, BlockPlanks.EnumType.ACACIA).recipe(BaseChiselingRecipes.ACACIA_PLANKS).build();
    public static final RechiseledBlockType ACACIA_PLANKS_TILES = create("acacia_planks_tiles", "Acacia Plank Tiles", () -> Blocks.PLANKS, BlockPlanks.EnumType.ACACIA).recipe(BaseChiselingRecipes.ACACIA_PLANKS).build();
    public static final RechiseledBlockType ACACIA_PLANKS_WAVY = create("acacia_planks_wavy", "Wavy Acacia Planks", () -> Blocks.PLANKS, BlockPlanks.EnumType.ACACIA).recipe(BaseChiselingRecipes.ACACIA_PLANKS).build();
    public static final RechiseledBlockType ACACIA_PLANKS_WOVEN = create("acacia_planks_woven", "Woven Acacia Planks", () -> Blocks.PLANKS, BlockPlanks.EnumType.ACACIA).recipe(BaseChiselingRecipes.ACACIA_PLANKS).build();
    // Andesite
    public static final RechiseledBlockType ANDESITE_BRICK_PATTERN = create("andesite_brick_pattern", "Andesite Brick Pattern", () -> Blocks.STONE).recipe(BaseChiselingRecipes.ANDESITE).build();
    public static final RechiseledBlockType ANDESITE_BRICK_PAVING = create("andesite_brick_paving", "Andesite Brick Paving", () -> Blocks.STONE).recipe(BaseChiselingRecipes.ANDESITE).build();
    public static final RechiseledBlockType ANDESITE_BRICKS = create("andesite_bricks", "Andesite Bricks", () -> Blocks.STONE).recipe(BaseChiselingRecipes.ANDESITE).build();
    public static final RechiseledBlockType ANDESITE_DIAGONAL_BRICKS = create("andesite_diagonal_bricks", "Diagonal Andesite Bricks", () -> Blocks.STONE).recipe(BaseChiselingRecipes.ANDESITE).build();
    public static final RechiseledBlockType ANDESITE_DOTTED = create("andesite_dotted", "Dotted Andesite", () -> Blocks.STONE).recipe(BaseChiselingRecipes.ANDESITE).build();
    public static final RechiseledBlockType ANDESITE_PAVING = create("andesite_paving", "Andesite Paving", () -> Blocks.STONE).recipe(BaseChiselingRecipes.ANDESITE).build();
    public static final RechiseledBlockType ANDESITE_POLISHED = create("andesite_polished", "Polished Andesite", () -> Blocks.STONE).regularVariant(() -> Blocks.STONE, 6).recipe(BaseChiselingRecipes.ANDESITE).build();
    public static final RechiseledBlockType ANDESITE_ROTATED_BRICKS = create("andesite_rotated_bricks", "Rotated Andesite Bricks", () -> Blocks.STONE).recipe(BaseChiselingRecipes.ANDESITE).build();
    public static final RechiseledBlockType ANDESITE_SQUARES = create("andesite_squares", "Andesite Squares", () -> Blocks.STONE).recipe(BaseChiselingRecipes.ANDESITE).build();
    public static final RechiseledBlockType ANDESITE_TILES = create("andesite_tiles", "Andesite Tiles", () -> Blocks.STONE).recipe(BaseChiselingRecipes.ANDESITE).build();
    public static final RechiseledBlockType ANDESITE_WAVY = create("andesite_wavy", "Wavy Andesite", () -> Blocks.STONE).recipe(BaseChiselingRecipes.ANDESITE).build();
    // Birch planks
    public static final RechiseledBlockType BIRCH_PLANKS_BEAMS = create("birch_planks_beams", "Birch Plank Beams", () -> Blocks.PLANKS, BlockPlanks.EnumType.BIRCH).recipe(BaseChiselingRecipes.BIRCH_PLANKS).build();
    public static final RechiseledBlockType BIRCH_PLANKS_BRICK_PATTERN = create("birch_planks_brick_pattern", "Birch Plank Brick Pattern", () -> Blocks.PLANKS, BlockPlanks.EnumType.BIRCH).recipe(BaseChiselingRecipes.BIRCH_PLANKS).build();
    public static final RechiseledBlockType BIRCH_PLANKS_BRICK_PAVING = create("birch_planks_brick_paving", "Birch Plank Brick Paving", () -> Blocks.PLANKS, BlockPlanks.EnumType.BIRCH).recipe(BaseChiselingRecipes.BIRCH_PLANKS).build();
    public static final RechiseledBlockType BIRCH_PLANKS_BRICKS = create("birch_planks_bricks", "Birch Plank Bricks", () -> Blocks.PLANKS, BlockPlanks.EnumType.BIRCH).recipe(BaseChiselingRecipes.BIRCH_PLANKS).build();
    public static final RechiseledBlockType BIRCH_PLANKS_CRATE = create("birch_planks_crate", "Birch Planks Crate", () -> Blocks.PLANKS, BlockPlanks.EnumType.BIRCH).recipe(BaseChiselingRecipes.BIRCH_PLANKS).build();
    public static final RechiseledBlockType BIRCH_PLANKS_DIAGONAL_STRIPES = create("birch_planks_diagonal_stripes", "Diagonal Birch Plank Stripes", () -> Blocks.PLANKS, BlockPlanks.EnumType.BIRCH).recipe(BaseChiselingRecipes.BIRCH_PLANKS).build();
    public static final RechiseledBlockType BIRCH_PLANKS_DIAGONAL_TILES = create("birch_planks_diagonal_tiles", "Diagonal Birch Plank Tiles", () -> Blocks.PLANKS, BlockPlanks.EnumType.BIRCH).recipe(BaseChiselingRecipes.BIRCH_PLANKS).build();
    public static final RechiseledBlockType BIRCH_PLANKS_DOTTED = create("birch_planks_dotted", "Dotted Birch Planks", () -> Blocks.PLANKS, BlockPlanks.EnumType.BIRCH).recipe(BaseChiselingRecipes.BIRCH_PLANKS).build();
    public static final RechiseledBlockType BIRCH_PLANKS_FLOORING = create("birch_planks_flooring", "Birch Plank Flooring", () -> Blocks.PLANKS, BlockPlanks.EnumType.BIRCH).recipe(BaseChiselingRecipes.BIRCH_PLANKS).build();
    public static final RechiseledBlockType BIRCH_PLANKS_LARGE_TILES = create("birch_planks_large_tiles", "Large Birch Plank Tiles", () -> Blocks.PLANKS, BlockPlanks.EnumType.BIRCH).recipe(BaseChiselingRecipes.BIRCH_PLANKS).build();
    public static final RechiseledBlockType BIRCH_PLANKS_MOSAIC = create("birch_planks_mosaic", "Birch Plank Mosaic", () -> Blocks.PLANKS, BlockPlanks.EnumType.BIRCH).noConnectingVariant().recipe(BaseChiselingRecipes.BIRCH_PLANKS).build();
    public static final RechiseledBlockType BIRCH_PLANKS_PATTERN = create("birch_planks_pattern", "Birch Plank Pattern", () -> Blocks.PLANKS, BlockPlanks.EnumType.BIRCH).recipe(BaseChiselingRecipes.BIRCH_PLANKS).build();
    public static final RechiseledBlockType BIRCH_PLANKS_ROTATED_BRICKS = create("birch_planks_rotated_bricks", "Rotated Birch Plank Bricks", () -> Blocks.PLANKS, BlockPlanks.EnumType.BIRCH).recipe(BaseChiselingRecipes.BIRCH_PLANKS).build();
    public static final RechiseledBlockType BIRCH_PLANKS_SMALL_BRICKS = create("birch_planks_small_bricks", "Small Birch Plank Bricks", () -> Blocks.PLANKS, BlockPlanks.EnumType.BIRCH).recipe(BaseChiselingRecipes.BIRCH_PLANKS).build();
    public static final RechiseledBlockType BIRCH_PLANKS_SMALL_TILES = create("birch_planks_small_tiles", "Small Birch Plank Tiles", () -> Blocks.PLANKS, BlockPlanks.EnumType.BIRCH).recipe(BaseChiselingRecipes.BIRCH_PLANKS).build();
    public static final RechiseledBlockType BIRCH_PLANKS_SQUARES = create("birch_planks_squares", "Birch Plank Squares", () -> Blocks.PLANKS, BlockPlanks.EnumType.BIRCH).recipe(BaseChiselingRecipes.BIRCH_PLANKS).build();
    public static final RechiseledBlockType BIRCH_PLANKS_TILES = create("birch_planks_tiles", "Birch Plank Tiles", () -> Blocks.PLANKS, BlockPlanks.EnumType.BIRCH).recipe(BaseChiselingRecipes.BIRCH_PLANKS).build();
    public static final RechiseledBlockType BIRCH_PLANKS_WAVY = create("birch_planks_wavy", "Wavy Birch Planks", () -> Blocks.PLANKS, BlockPlanks.EnumType.BIRCH).recipe(BaseChiselingRecipes.BIRCH_PLANKS).build();
    public static final RechiseledBlockType BIRCH_PLANKS_WOVEN = create("birch_planks_woven", "Woven Birch Planks", () -> Blocks.PLANKS, BlockPlanks.EnumType.BIRCH).recipe(BaseChiselingRecipes.BIRCH_PLANKS).build();
    // Bone block
    public static final RechiseledBlockType BONE_BLOCK_BORDERED = create("bone_block_bordered", "Bordered Bone Block", () -> Blocks.BONE_BLOCK).recipe(BaseChiselingRecipes.BONE_BLOCK).build();
    public static final RechiseledBlockType BONE_BLOCK_BUNDLED = create("bone_block_bundled", "Bundled Bone Block", () -> Blocks.BONE_BLOCK).noConnectingVariant().recipe(BaseChiselingRecipes.BONE_BLOCK).build();
    public static final RechiseledBlockType BONE_BLOCK_CHISELED = create("bone_block_chiseled", "Chiseled Bone Block", () -> Blocks.BONE_BLOCK).recipe(BaseChiselingRecipes.BONE_BLOCK).build();
    public static final RechiseledBlockType BONE_BLOCK_CONNECTING = create("bone_block_connecting", "Bone Block", () -> Blocks.BONE_BLOCK).specification(BlockSpecification.PILLAR).regularVariant(() -> Blocks.BONE_BLOCK).recipe(BaseChiselingRecipes.BONE_BLOCK).build();
    public static final RechiseledBlockType BONE_BLOCK_CRACKED = create("bone_block_cracked", "Cracked Bone Block", () -> Blocks.BONE_BLOCK).noConnectingVariant().recipe(BaseChiselingRecipes.BONE_BLOCK).build();
    public static final RechiseledBlockType BONE_BLOCK_DECORATED = create("bone_block_decorated", "Decorated Bone Block", () -> Blocks.BONE_BLOCK).noConnectingVariant().recipe(BaseChiselingRecipes.BONE_BLOCK).build();
    public static final RechiseledBlockType BONE_BLOCK_DECORATED_BORDERED = create("bone_block_decorated_bordered", "Bordered Decorated Bone Block", () -> Blocks.BONE_BLOCK).recipe(BaseChiselingRecipes.BONE_BLOCK).build();
    public static final RechiseledBlockType BONE_BLOCK_INVERTED_TILES = create("bone_block_inverted_tiles", "Inverted Bone Block Tiles", () -> Blocks.BONE_BLOCK).recipe(BaseChiselingRecipes.BONE_BLOCK).build();
    public static final RechiseledBlockType BONE_BLOCK_PATTERNED = create("bone_block_patterned", "Patterned Bone Block", () -> Blocks.BONE_BLOCK).recipe(BaseChiselingRecipes.BONE_BLOCK).build();
    public static final RechiseledBlockType BONE_BLOCK_PILLAR = create("bone_block_pillar", "Bone Block Pillar", () -> Blocks.BONE_BLOCK).specification(BlockSpecification.PILLAR).recipe(BaseChiselingRecipes.BONE_BLOCK).build();
    public static final RechiseledBlockType BONE_BLOCK_RIB = create("bone_block_rib", "Bone Block Ribs", () -> Blocks.BONE_BLOCK).noConnectingVariant().recipe(BaseChiselingRecipes.BONE_BLOCK).build();
    public static final RechiseledBlockType BONE_BLOCK_SKULL = create("bone_block_skull", "Bone Block Skull", () -> Blocks.BONE_BLOCK).noConnectingVariant().recipe(BaseChiselingRecipes.BONE_BLOCK).build();
    public static final RechiseledBlockType BONE_BLOCK_SMOOTH = create("bone_block_smooth", "Smooth Bone Block", () -> Blocks.BONE_BLOCK).noConnectingVariant().recipe(BaseChiselingRecipes.BONE_BLOCK).build();
    // Coal block
    public static final RechiseledBlockType COAL_BLOCK_CARVED = create("coal_block_carved", "Carved Block of Coal", () -> Blocks.COAL_BLOCK).recipe(BaseChiselingRecipes.COAL_BLOCK).build();
    public static final RechiseledBlockType COAL_BLOCK_CHISELED = create("coal_block_chiseled", "Chiseled Block of Coal", () -> Blocks.COAL_BLOCK).recipe(BaseChiselingRecipes.COAL_BLOCK).build();
    public static final RechiseledBlockType COAL_BLOCK_CIRCLES = create("coal_block_circles", "Coal Block Circles", () -> Blocks.COAL_BLOCK).recipe(BaseChiselingRecipes.COAL_BLOCK).build();
    public static final RechiseledBlockType COAL_BLOCK_COMPACTED = create("coal_block_compacted", "Compacted Block of Coal", () -> Blocks.COAL_BLOCK).recipe(BaseChiselingRecipes.COAL_BLOCK).build();
    public static final RechiseledBlockType COAL_BLOCK_OVALS = create("coal_block_ovals", "Coal Block Ovals", () -> Blocks.COAL_BLOCK).recipe(BaseChiselingRecipes.COAL_BLOCK).build();
    public static final RechiseledBlockType COAL_BLOCK_PATTERN = create("coal_block_pattern", "Coal Block Pattern", () -> Blocks.COAL_BLOCK).recipe(BaseChiselingRecipes.COAL_BLOCK).build();
    public static final RechiseledBlockType COAL_BLOCK_PILLAR = create("coal_block_pillar", "Coal Block Pillar", () -> Blocks.COAL_BLOCK).specification(BlockSpecification.PILLAR).recipe(BaseChiselingRecipes.COAL_BLOCK).build();
    public static final RechiseledBlockType COAL_BLOCK_POLISHED = create("coal_block_polished", "Polished Block of Coal", () -> Blocks.COAL_BLOCK).noConnectingVariant().recipe(BaseChiselingRecipes.COAL_BLOCK).build();
    public static final RechiseledBlockType COAL_BLOCK_ROTATED_BRICKS = create("coal_block_rotated_bricks", "Rotated Coal Bricks", () -> Blocks.COAL_BLOCK).recipe(BaseChiselingRecipes.COAL_BLOCK).build();
    public static final RechiseledBlockType COAL_BLOCK_SMALL_TILES = create("coal_block_small_tiles", "Small Coal Block Tiles", () -> Blocks.COAL_BLOCK).recipe(BaseChiselingRecipes.COAL_BLOCK).build();
    public static final RechiseledBlockType COAL_BLOCK_STRIPES = create("coal_block_stripes", "Coal Block Stripes", () -> Blocks.COAL_BLOCK).recipe(BaseChiselingRecipes.COAL_BLOCK).build();
    // Cobblestone
    public static final RechiseledBlockType COBBLESTONE_BEAMS = create("cobblestone_beams", "Cobblestone Beams", () -> Blocks.COBBLESTONE).recipe(BaseChiselingRecipes.COBBLESTONE).build();
    public static final RechiseledBlockType COBBLESTONE_BRICK_PATTERN = create("cobblestone_brick_pattern", "Cobblestone Brick Pattern", () -> Blocks.COBBLESTONE).recipe(BaseChiselingRecipes.COBBLESTONE).build();
    public static final RechiseledBlockType COBBLESTONE_BRICK_PAVING = create("cobblestone_brick_paving", "Cobblestone Brick Paving", () -> Blocks.COBBLESTONE).recipe(BaseChiselingRecipes.COBBLESTONE).build();
    public static final RechiseledBlockType COBBLESTONE_CHISELED_BORDER = create("cobblestone_chiseled_border", "Chiseled Bordered Cobblestone", () -> Blocks.COBBLESTONE).recipe(BaseChiselingRecipes.COBBLESTONE).build();
    public static final RechiseledBlockType COBBLESTONE_CROSSES = create("cobblestone_crosses", "Cobblestone Crosses", () -> Blocks.COBBLESTONE).recipe(BaseChiselingRecipes.COBBLESTONE).build();
    public static final RechiseledBlockType COBBLESTONE_DENTED = create("cobblestone_dented", "Dented Cobblestone", () -> Blocks.COBBLESTONE).recipe(BaseChiselingRecipes.COBBLESTONE).build();
    public static final RechiseledBlockType COBBLESTONE_INVERTED_DENTED = create("cobblestone_inverted_dented", "Inverted Dented Cobblestone", () -> Blocks.COBBLESTONE).recipe(BaseChiselingRecipes.COBBLESTONE).build();
    public static final RechiseledBlockType COBBLESTONE_LARGE_SQUARES = create("cobblestone_large_squares", "Large Cobblestone Squares", () -> Blocks.COBBLESTONE).noConnectingVariant().recipe(BaseChiselingRecipes.COBBLESTONE).build();
    public static final RechiseledBlockType COBBLESTONE_PAVING = create("cobblestone_paving", "Cobblestone Paving", () -> Blocks.COBBLESTONE).recipe(BaseChiselingRecipes.COBBLESTONE).build();
    public static final RechiseledBlockType COBBLESTONE_PILLAR = create("cobblestone_pillar", "Cobblestone Pillar", () -> Blocks.COBBLESTONE).specification(BlockSpecification.PILLAR).recipe(BaseChiselingRecipes.COBBLESTONE).build();
    public static final RechiseledBlockType COBBLESTONE_POLISHED = create("cobblestone_polished", "Polished Cobblestone", () -> Blocks.COBBLESTONE).noConnectingVariant().recipe(BaseChiselingRecipes.COBBLESTONE).build();
    public static final RechiseledBlockType COBBLESTONE_PULVERIZED = create("cobblestone_pulverized", "Pulverized Cobblestone", () -> Blocks.COBBLESTONE).recipe(BaseChiselingRecipes.COBBLESTONE).build();
    public static final RechiseledBlockType COBBLESTONE_ROTATED_BRICKS = create("cobblestone_rotated_bricks", "Rotated Cobblestone Bricks", () -> Blocks.COBBLESTONE).recipe(BaseChiselingRecipes.COBBLESTONE).build();
    public static final RechiseledBlockType COBBLESTONE_SHEARED = create("cobblestone_sheared", "Sheared Cobblestone", () -> Blocks.COBBLESTONE).noConnectingVariant().recipe(BaseChiselingRecipes.COBBLESTONE).build();
    public static final RechiseledBlockType COBBLESTONE_SMALL_TILES = create("cobblestone_small_tiles", "Small Cobblestone Tiles", () -> Blocks.COBBLESTONE).recipe(BaseChiselingRecipes.COBBLESTONE).build();
    public static final RechiseledBlockType COBBLESTONE_SQUARES = create("cobblestone_squares", "Cobblestone Squares", () -> Blocks.COBBLESTONE).recipe(BaseChiselingRecipes.COBBLESTONE).build();
    public static final RechiseledBlockType COBBLESTONE_STRIPES = create("cobblestone_stripes", "Cobblestone Stripes", () -> Blocks.COBBLESTONE).recipe(BaseChiselingRecipes.COBBLESTONE).build();
    public static final RechiseledBlockType COBBLESTONE_TILES = create("cobblestone_tiles", "Cobblestone Tiles", () -> Blocks.COBBLESTONE).recipe(BaseChiselingRecipes.COBBLESTONE).build();
    public static final RechiseledBlockType COBBLESTONE_WORN_STRIPES = create("cobblestone_worn_stripes", "Weathered Cobblestone Stripes", () -> Blocks.COBBLESTONE).recipe(BaseChiselingRecipes.COBBLESTONE).build();
    // Dark oak planks
    public static final RechiseledBlockType DARK_OAK_PLANKS_BEAMS = create("dark_oak_planks_beams", "Dark Oak Plank Beams", () -> Blocks.PLANKS, BlockPlanks.EnumType.DARK_OAK).recipe(BaseChiselingRecipes.DARK_OAK_PLANKS).build();
    public static final RechiseledBlockType DARK_OAK_PLANKS_BRICK_PATTERN = create("dark_oak_planks_brick_pattern", "Dark Oak Plank Brick Pattern", () -> Blocks.PLANKS, BlockPlanks.EnumType.DARK_OAK).recipe(BaseChiselingRecipes.DARK_OAK_PLANKS).build();
    public static final RechiseledBlockType DARK_OAK_PLANKS_BRICK_PAVING = create("dark_oak_planks_brick_paving", "Dark Oak Plank Brick Paving", () -> Blocks.PLANKS, BlockPlanks.EnumType.DARK_OAK).recipe(BaseChiselingRecipes.DARK_OAK_PLANKS).build();
    public static final RechiseledBlockType DARK_OAK_PLANKS_BRICKS = create("dark_oak_planks_bricks", "Dark Oak Plank Bricks", () -> Blocks.PLANKS, BlockPlanks.EnumType.DARK_OAK).recipe(BaseChiselingRecipes.DARK_OAK_PLANKS).build();
    public static final RechiseledBlockType DARK_OAK_PLANKS_CRATE = create("dark_oak_planks_crate", "Dark Oak Planks Crate", () -> Blocks.PLANKS, BlockPlanks.EnumType.DARK_OAK).recipe(BaseChiselingRecipes.DARK_OAK_PLANKS).build();
    public static final RechiseledBlockType DARK_OAK_PLANKS_DIAGONAL_STRIPES = create("dark_oak_planks_diagonal_stripes", "Diagonal Dark Oak Plank Stripes", () -> Blocks.PLANKS, BlockPlanks.EnumType.DARK_OAK).recipe(BaseChiselingRecipes.DARK_OAK_PLANKS).build();
    public static final RechiseledBlockType DARK_OAK_PLANKS_DIAGONAL_TILES = create("dark_oak_planks_diagonal_tiles", "Diagonal Dark Oak Plank Tiles", () -> Blocks.PLANKS, BlockPlanks.EnumType.DARK_OAK).recipe(BaseChiselingRecipes.DARK_OAK_PLANKS).build();
    public static final RechiseledBlockType DARK_OAK_PLANKS_DOTTED = create("dark_oak_planks_dotted", "Dotted Dark Oak Planks", () -> Blocks.PLANKS, BlockPlanks.EnumType.DARK_OAK).recipe(BaseChiselingRecipes.DARK_OAK_PLANKS).build();
    public static final RechiseledBlockType DARK_OAK_PLANKS_FLOORING = create("dark_oak_planks_flooring", "Dark Oak Plank Flooring", () -> Blocks.PLANKS, BlockPlanks.EnumType.DARK_OAK).recipe(BaseChiselingRecipes.DARK_OAK_PLANKS).build();
    public static final RechiseledBlockType DARK_OAK_PLANKS_LARGE_TILES = create("dark_oak_planks_large_tiles", "Large Dark Oak Plank Tiles", () -> Blocks.PLANKS, BlockPlanks.EnumType.DARK_OAK).recipe(BaseChiselingRecipes.DARK_OAK_PLANKS).build();
    public static final RechiseledBlockType DARK_OAK_PLANKS_MOSAIC = create("dark_oak_planks_mosaic", "Dark Oak Plank Mosaic", () -> Blocks.PLANKS, BlockPlanks.EnumType.DARK_OAK).noConnectingVariant().recipe(BaseChiselingRecipes.DARK_OAK_PLANKS).build();
    public static final RechiseledBlockType DARK_OAK_PLANKS_PATTERN = create("dark_oak_planks_pattern", "Dark Oak Plank Pattern", () -> Blocks.PLANKS, BlockPlanks.EnumType.DARK_OAK).recipe(BaseChiselingRecipes.DARK_OAK_PLANKS).build();
    public static final RechiseledBlockType DARK_OAK_PLANKS_ROTATED_BRICKS = create("dark_oak_planks_rotated_bricks", "Rotated Dark Oak Plank Bricks", () -> Blocks.PLANKS, BlockPlanks.EnumType.DARK_OAK).recipe(BaseChiselingRecipes.DARK_OAK_PLANKS).build();
    public static final RechiseledBlockType DARK_OAK_PLANKS_SMALL_BRICKS = create("dark_oak_planks_small_bricks", "Small Dark Oak Plank Bricks", () -> Blocks.PLANKS, BlockPlanks.EnumType.DARK_OAK).recipe(BaseChiselingRecipes.DARK_OAK_PLANKS).build();
    public static final RechiseledBlockType DARK_OAK_PLANKS_SMALL_TILES = create("dark_oak_planks_small_tiles", "Small Dark Oak Plank Tiles", () -> Blocks.PLANKS, BlockPlanks.EnumType.DARK_OAK).recipe(BaseChiselingRecipes.DARK_OAK_PLANKS).build();
    public static final RechiseledBlockType DARK_OAK_PLANKS_SQUARES = create("dark_oak_planks_squares", "Dark Oak Plank Squares", () -> Blocks.PLANKS, BlockPlanks.EnumType.DARK_OAK).recipe(BaseChiselingRecipes.DARK_OAK_PLANKS).build();
    public static final RechiseledBlockType DARK_OAK_PLANKS_TILES = create("dark_oak_planks_tiles", "Dark Oak Plank Tiles", () -> Blocks.PLANKS, BlockPlanks.EnumType.DARK_OAK).recipe(BaseChiselingRecipes.DARK_OAK_PLANKS).build();
    public static final RechiseledBlockType DARK_OAK_PLANKS_WAVY = create("dark_oak_planks_wavy", "Wavy Dark Oak Planks", () -> Blocks.PLANKS, BlockPlanks.EnumType.DARK_OAK).recipe(BaseChiselingRecipes.DARK_OAK_PLANKS).build();
    public static final RechiseledBlockType DARK_OAK_PLANKS_WOVEN = create("dark_oak_planks_woven", "Woven Dark Oak Planks", () -> Blocks.PLANKS, BlockPlanks.EnumType.DARK_OAK).recipe(BaseChiselingRecipes.DARK_OAK_PLANKS).build();
    // Dark prismarine
    public static final RechiseledBlockType DARK_PRISMARINE_BEAMS = create("dark_prismarine_beams", "Dark Prismarine Beams", () -> Blocks.PRISMARINE).recipe(BaseChiselingRecipes.DARK_PRISMARINE).build();
    public static final RechiseledBlockType DARK_PRISMARINE_BRICK_PAVING = create("dark_prismarine_brick_paving", "Dark Prismarine Brick Paving", () -> Blocks.PRISMARINE).recipe(BaseChiselingRecipes.DARK_PRISMARINE).build();
    public static final RechiseledBlockType DARK_PRISMARINE_BRICKS = create("dark_prismarine_bricks", "Dark Prismarine Bricks", () -> Blocks.PRISMARINE).recipe(BaseChiselingRecipes.DARK_PRISMARINE).build();
    public static final RechiseledBlockType DARK_PRISMARINE_DOTTED = create("dark_prismarine_dotted", "Dotted Dark Prismarine", () -> Blocks.PRISMARINE).recipe(BaseChiselingRecipes.DARK_PRISMARINE).build();
    public static final RechiseledBlockType DARK_PRISMARINE_FABRIC = create("dark_prismarine_fabric", "Dark Prismarine Fabric", () -> Blocks.PRISMARINE).recipe(BaseChiselingRecipes.DARK_PRISMARINE).build();
    public static final RechiseledBlockType DARK_PRISMARINE_LARGE_TILES = create("dark_prismarine_large_tiles", "Large Dark Prismarine Tiles", () -> Blocks.PRISMARINE).recipe(BaseChiselingRecipes.DARK_PRISMARINE).build();
    public static final RechiseledBlockType DARK_PRISMARINE_ROTATED_BRICKS = create("dark_prismarine_rotated_bricks", "Rotated Dark Prismarine Bricks", () -> Blocks.PRISMARINE).recipe(BaseChiselingRecipes.DARK_PRISMARINE).build();
    public static final RechiseledBlockType DARK_PRISMARINE_ROWS = create("dark_prismarine_rows", "Dark Prismarine Rows", () -> Blocks.PRISMARINE).recipe(BaseChiselingRecipes.DARK_PRISMARINE).build();
    public static final RechiseledBlockType DARK_PRISMARINE_SQUARES = create("dark_prismarine_squares", "Dark Prismarine Squares", () -> Blocks.PRISMARINE).recipe(BaseChiselingRecipes.DARK_PRISMARINE).build();
    public static final RechiseledBlockType DARK_PRISMARINE_TILES = create("dark_prismarine_tiles", "Dark Prismarine Tiles", () -> Blocks.PRISMARINE).recipe(BaseChiselingRecipes.DARK_PRISMARINE).build();
    public static final RechiseledBlockType DARK_PRISMARINE_WAVY = create("dark_prismarine_wavy", "Wavy Dark Prismarine", () -> Blocks.PRISMARINE).recipe(BaseChiselingRecipes.DARK_PRISMARINE).build();
    public static final RechiseledBlockType DARK_PRISMARINE_WOVEN = create("dark_prismarine_woven", "Woven Dark Prismarine", () -> Blocks.PRISMARINE).recipe(BaseChiselingRecipes.DARK_PRISMARINE).build();
    // Diamond block
    public static final RechiseledBlockType DIAMOND_BLOCK_CHISELED = create("diamond_block_chiseled", "Chiseled Block of Diamond", () -> Blocks.DIAMOND_BLOCK).recipe(BaseChiselingRecipes.DIAMOND_BLOCK).build();
    public static final RechiseledBlockType DIAMOND_BLOCK_CHISELED_CUBES = create("diamond_block_chiseled_cubes", "Chiseled Diamond Block Cubes", () -> Blocks.DIAMOND_BLOCK).recipe(BaseChiselingRecipes.DIAMOND_BLOCK).build();
    public static final RechiseledBlockType DIAMOND_BLOCK_CONNECTING = create("diamond_block_connecting", "Block of Diamonds", () -> Blocks.DIAMOND_BLOCK).regularVariant(() -> Blocks.DIAMOND_BLOCK).recipe(BaseChiselingRecipes.DIAMOND_BLOCK).build();
    public static final RechiseledBlockType DIAMOND_BLOCK_DIAGONAL_TILES = create("diamond_block_diagonal_tiles", "Diagonal Diamond Tiles", () -> Blocks.DIAMOND_BLOCK).noConnectingVariant().recipe(BaseChiselingRecipes.DIAMOND_BLOCK).build();
    public static final RechiseledBlockType DIAMOND_BLOCK_GRID = create("diamond_block_grid", "Diamond Grid Block", () -> Blocks.DIAMOND_BLOCK).recipe(BaseChiselingRecipes.DIAMOND_BLOCK).build();
    public static final RechiseledBlockType DIAMOND_BLOCK_JEWEL_BLOCK = create("diamond_block_jewel_block", "Diamond Jewel Block", () -> Blocks.DIAMOND_BLOCK).recipe(BaseChiselingRecipes.DIAMOND_BLOCK).build();
    public static final RechiseledBlockType DIAMOND_BLOCK_POLISHED = create("diamond_block_polished", "Polished Block of Diamond", () -> Blocks.DIAMOND_BLOCK).recipe(BaseChiselingRecipes.DIAMOND_BLOCK).build();
    public static final RechiseledBlockType DIAMOND_BLOCK_RHOMBUSES = create("diamond_block_rhombuses", "Diamond Block Rhombuses", () -> Blocks.DIAMOND_BLOCK).recipe(BaseChiselingRecipes.DIAMOND_BLOCK).build();
    public static final RechiseledBlockType DIAMOND_BLOCK_SHINY = create("diamond_block_shiny", "Shiny Block of Diamond", () -> Blocks.DIAMOND_BLOCK).noConnectingVariant().recipe(BaseChiselingRecipes.DIAMOND_BLOCK).build();
    public static final RechiseledBlockType DIAMOND_BLOCK_SHINY_BORDERED = create("diamond_block_shiny_bordered", "Bordered Shiny Block of Diamond", () -> Blocks.DIAMOND_BLOCK).recipe(BaseChiselingRecipes.DIAMOND_BLOCK).build();
    public static final RechiseledBlockType DIAMOND_BLOCK_SMALL_TILES = create("diamond_block_small_tiles", "Small Diamond Tiles", () -> Blocks.DIAMOND_BLOCK).recipe(BaseChiselingRecipes.DIAMOND_BLOCK).build();
    public static final RechiseledBlockType DIAMOND_BLOCK_SMOOTH = create("diamond_block_smooth", "Smooth Block of Diamond", () -> Blocks.DIAMOND_BLOCK).noConnectingVariant().recipe(BaseChiselingRecipes.DIAMOND_BLOCK).build();
    // Diorite
    public static final RechiseledBlockType DIORITE_BRICK_PATTERN = create("diorite_brick_pattern", "Diorite Brick Pattern", () -> Blocks.STONE).recipe(BaseChiselingRecipes.DIORITE).build();
    public static final RechiseledBlockType DIORITE_BRICK_PAVING = create("diorite_brick_paving", "Diorite Brick Paving", () -> Blocks.STONE).recipe(BaseChiselingRecipes.DIORITE).build();
    public static final RechiseledBlockType DIORITE_BRICKS = create("diorite_bricks", "Diorite Bricks", () -> Blocks.STONE).recipe(BaseChiselingRecipes.DIORITE).build();
    public static final RechiseledBlockType DIORITE_DIAGONAL_BRICKS = create("diorite_diagonal_bricks", "Diagonal Diorite Bricks", () -> Blocks.STONE).recipe(BaseChiselingRecipes.DIORITE).build();
    public static final RechiseledBlockType DIORITE_DOTTED = create("diorite_dotted", "Dotted Diorite", () -> Blocks.STONE).recipe(BaseChiselingRecipes.DIORITE).build();
    public static final RechiseledBlockType DIORITE_PAVING = create("diorite_paving", "Diorite Paving", () -> Blocks.STONE).recipe(BaseChiselingRecipes.DIORITE).build();
    public static final RechiseledBlockType DIORITE_POLISHED = create("diorite_polished", "Polished Diorite", () -> Blocks.STONE).regularVariant(() -> Blocks.STONE, 4).recipe(BaseChiselingRecipes.DIORITE).build();
    public static final RechiseledBlockType DIORITE_ROTATED_BRICKS = create("diorite_rotated_bricks", "Rotated Diorite Bricks", () -> Blocks.STONE).recipe(BaseChiselingRecipes.DIORITE).build();
    public static final RechiseledBlockType DIORITE_SQUARES = create("diorite_squares", "Diorite Squares", () -> Blocks.STONE).recipe(BaseChiselingRecipes.DIORITE).build();
    public static final RechiseledBlockType DIORITE_TILES = create("diorite_tiles", "Diorite Tiles", () -> Blocks.STONE).recipe(BaseChiselingRecipes.DIORITE).build();
    public static final RechiseledBlockType DIORITE_WAVY = create("diorite_wavy", "Wavy Diorite", () -> Blocks.STONE).recipe(BaseChiselingRecipes.DIORITE).build();
    // Dirt
    public static final RechiseledBlockType DIRT_BLOBS = create("dirt_blobs", "Dirt Blobs", () -> Blocks.DIRT).recipe(BaseChiselingRecipes.DIRT).build();
    public static final RechiseledBlockType DIRT_BRICKS = create("dirt_bricks", "Dirt Bricks", () -> Blocks.DIRT).recipe(BaseChiselingRecipes.DIRT).build();
    public static final RechiseledBlockType DIRT_CHUNKS = create("dirt_chunks", "Dirt Chunks", () -> Blocks.DIRT).recipe(BaseChiselingRecipes.DIRT).build();
    public static final RechiseledBlockType DIRT_CLUMPS = create("dirt_clumps", "Dirt Clumps", () -> Blocks.DIRT).recipe(BaseChiselingRecipes.DIRT).build();
    public static final RechiseledBlockType DIRT_COBBLED = create("dirt_cobbled", "Cobbled Dirt", () -> Blocks.DIRT).noConnectingVariant().recipe(BaseChiselingRecipes.DIRT).build();
    public static final RechiseledBlockType DIRT_GROOVES = create("dirt_grooves", "Dirt Grooves", () -> Blocks.DIRT).noConnectingVariant().recipe(BaseChiselingRecipes.DIRT).build();
    public static final RechiseledBlockType DIRT_LARGE_TILES = create("dirt_large_tiles", "Large Dirt Tiles", () -> Blocks.DIRT).recipe(BaseChiselingRecipes.DIRT).build();
    public static final RechiseledBlockType DIRT_MUDDY = create("dirt_muddy", "Muddy Dirt", () -> Blocks.DIRT).noConnectingVariant().recipe(BaseChiselingRecipes.DIRT).build();
    public static final RechiseledBlockType DIRT_SMALL_BRICKS = create("dirt_small_bricks", "Small Dirt Bricks", () -> Blocks.DIRT).recipe(BaseChiselingRecipes.DIRT).build();
    public static final RechiseledBlockType DIRT_SMALL_TILES = create("dirt_small_tiles", "Small Dirt Tiles", () -> Blocks.DIRT).recipe(BaseChiselingRecipes.DIRT).build();
    public static final RechiseledBlockType DIRT_SMOOTH_CLUMPS = create("dirt_smooth_clumps", "Smooth Dirt Clumps", () -> Blocks.DIRT).recipe(BaseChiselingRecipes.DIRT).build();
    public static final RechiseledBlockType DIRT_SOIL = create("dirt_soil", "Dirt Soil", () -> Blocks.DIRT).recipe(BaseChiselingRecipes.DIRT).build();
    public static final RechiseledBlockType DIRT_SQUARES = create("dirt_squares", "Dirt Squares", () -> Blocks.DIRT).recipe(BaseChiselingRecipes.DIRT).build();
    public static final RechiseledBlockType DIRT_TILES = create("dirt_tiles", "Dirt Tiles", () -> Blocks.DIRT).recipe(BaseChiselingRecipes.DIRT).build();
    public static final RechiseledBlockType DIRT_TILLED = create("dirt_tilled", "Tilled Dirt", () -> Blocks.DIRT).recipe(BaseChiselingRecipes.DIRT).build();
    // Emerald block
    public static final RechiseledBlockType EMERALD_BLOCK_BORDERED_CROSSES = create("emerald_block_bordered_crosses", "Bordered Emerald Crosses Block", () -> Blocks.EMERALD_BLOCK).recipe(BaseChiselingRecipes.EMERALD_BLOCK).build();
    public static final RechiseledBlockType EMERALD_BLOCK_BORDERED_PLATING = create("emerald_block_bordered_plating", "Bordered Emerald Plating Block", () -> Blocks.EMERALD_BLOCK).recipe(BaseChiselingRecipes.EMERALD_BLOCK).build();
    public static final RechiseledBlockType EMERALD_BLOCK_CHISELED = create("emerald_block_chiseled", "Chiseled Block of Emerald", () -> Blocks.EMERALD_BLOCK).recipe(BaseChiselingRecipes.EMERALD_BLOCK).build();
    public static final RechiseledBlockType EMERALD_BLOCK_CLOVERS = create("emerald_block_clovers", "Emerald Clovers Block", () -> Blocks.EMERALD_BLOCK).recipe(BaseChiselingRecipes.EMERALD_BLOCK).build();
    public static final RechiseledBlockType EMERALD_BLOCK_CROSSES = create("emerald_block_crosses", "Emerald Crosses Block", () -> Blocks.EMERALD_BLOCK).noConnectingVariant().recipe(BaseChiselingRecipes.EMERALD_BLOCK).build();
    public static final RechiseledBlockType EMERALD_BLOCK_CRYSTAL = create("emerald_block_crystal", "Emerald Crystal Block", () -> Blocks.EMERALD_BLOCK).recipe(BaseChiselingRecipes.EMERALD_BLOCK).build();
    public static final RechiseledBlockType EMERALD_BLOCK_PATTERNED = create("emerald_block_patterned", "Patterned Block of Emerald", () -> Blocks.EMERALD_BLOCK).recipe(BaseChiselingRecipes.EMERALD_BLOCK).build();
    public static final RechiseledBlockType EMERALD_BLOCK_PATTERNED_SQUARES = create("emerald_block_patterned_squares", "Patterned Emerald Squares Block", () -> Blocks.EMERALD_BLOCK).recipe(BaseChiselingRecipes.EMERALD_BLOCK).build();
    public static final RechiseledBlockType EMERALD_BLOCK_PILLAR = create("emerald_block_pillar", "Emerald Block Pillar", () -> Blocks.EMERALD_BLOCK).specification(BlockSpecification.PILLAR).recipe(BaseChiselingRecipes.EMERALD_BLOCK).build();
    public static final RechiseledBlockType EMERALD_BLOCK_PLATING = create("emerald_block_plating", "Emerald Plating Block", () -> Blocks.EMERALD_BLOCK).noConnectingVariant().recipe(BaseChiselingRecipes.EMERALD_BLOCK).build();
    public static final RechiseledBlockType EMERALD_BLOCK_POLISHED = create("emerald_block_polished", "Polished Block of Emerald", () -> Blocks.EMERALD_BLOCK).recipe(BaseChiselingRecipes.EMERALD_BLOCK).build();
    public static final RechiseledBlockType EMERALD_BLOCK_SMOOTH = create("emerald_block_smooth", "Smooth Block of Emerald", () -> Blocks.EMERALD_BLOCK).noConnectingVariant().recipe(BaseChiselingRecipes.EMERALD_BLOCK).build();
    public static final RechiseledBlockType EMERALD_BLOCK_STRIPED = create("emerald_block_striped", "Striped Block of Emerald", () -> Blocks.EMERALD_BLOCK).recipe(BaseChiselingRecipes.EMERALD_BLOCK).build();
    public static final RechiseledBlockType EMERALD_BLOCK_WAXED = create("emerald_block_waxed", "Waxed Block of Emerald", () -> Blocks.EMERALD_BLOCK).recipe(BaseChiselingRecipes.EMERALD_BLOCK).build();
    // End stone
    public static final RechiseledBlockType END_STONE_BLOBS = create("end_stone_blobs", "End Stone Blobs", () -> Blocks.END_STONE).recipe(BaseChiselingRecipes.END_STONE).build();
    public static final RechiseledBlockType END_STONE_BRICK_PATTERN = create("end_stone_brick_pattern", "End Stone Brick Pattern", () -> Blocks.END_BRICKS).recipe(BaseChiselingRecipes.END_STONE).build();
    public static final RechiseledBlockType END_STONE_BRICK_PAVING = create("end_stone_brick_paving", "End Stone Brick Paving", () -> Blocks.END_BRICKS).recipe(BaseChiselingRecipes.END_STONE).build();
    public static final RechiseledBlockType END_STONE_CHISELED = create("end_stone_chiseled", "Chiseled End Stone", () -> Blocks.END_STONE).recipe(BaseChiselingRecipes.END_STONE).build();
    public static final RechiseledBlockType END_STONE_CRUSHED = create("end_stone_crushed", "Crushed End Stone", () -> Blocks.END_STONE).recipe(BaseChiselingRecipes.END_STONE).build();
    public static final RechiseledBlockType END_STONE_DIAGONAL_BRICKS = create("end_stone_diagonal_bricks", "Diagonal End Stone Bricks", () -> Blocks.END_BRICKS).recipe(BaseChiselingRecipes.END_STONE).build();
    public static final RechiseledBlockType END_STONE_MESH = create("end_stone_mesh", "End Stone Mesh", () -> Blocks.END_STONE).recipe(BaseChiselingRecipes.END_STONE).build();
    public static final RechiseledBlockType END_STONE_PAVING = create("end_stone_paving", "End Stone Paving", () -> Blocks.END_STONE).recipe(BaseChiselingRecipes.END_STONE).build();
    public static final RechiseledBlockType END_STONE_POLISHED = create("end_stone_polished", "Polished End Stone", () -> Blocks.END_BRICKS).recipe(BaseChiselingRecipes.END_STONE).build();
    public static final RechiseledBlockType END_STONE_ROTATED_BRICKS = create("end_stone_rotated_bricks", "Rotated End Stone Bricks", () -> Blocks.END_BRICKS).recipe(BaseChiselingRecipes.END_STONE).build();
    public static final RechiseledBlockType END_STONE_SCALES = create("end_stone_scales", "End Stone Scales", () -> Blocks.END_STONE).recipe(BaseChiselingRecipes.END_STONE).build();
    public static final RechiseledBlockType END_STONE_SMALL_TILES = create("end_stone_small_tiles", "Small End Stone Tiles", () -> Blocks.END_STONE).recipe(BaseChiselingRecipes.END_STONE).build();
    public static final RechiseledBlockType END_STONE_SPIRAL_PATTERN = create("end_stone_spiral_pattern", "Spiral End Stone Pattern", () -> Blocks.END_STONE).recipe(BaseChiselingRecipes.END_STONE).build();
    public static final RechiseledBlockType END_STONE_SQUARES = create("end_stone_squares", "End Stone Squares", () -> Blocks.END_STONE).recipe(BaseChiselingRecipes.END_STONE).build();
    public static final RechiseledBlockType END_STONE_TILES = create("end_stone_tiles", "End Stone Tiles", () -> Blocks.END_BRICKS).recipe(BaseChiselingRecipes.END_STONE).build();
    // Glowstone
    public static final RechiseledBlockType GLOWSTONE_BRICK_PATTERN = create("glowstone_brick_pattern", "Glowstone Brick Pattern", () -> Blocks.GLOWSTONE).recipe(BaseChiselingRecipes.GLOWSTONE).build();
    public static final RechiseledBlockType GLOWSTONE_BRICK_PAVING = create("glowstone_brick_paving", "Glowstone Brick Paving", () -> Blocks.GLOWSTONE).recipe(BaseChiselingRecipes.GLOWSTONE).build();
    public static final RechiseledBlockType GLOWSTONE_BRICKS = create("glowstone_bricks", "Glowstone Bricks", () -> Blocks.GLOWSTONE).recipe(BaseChiselingRecipes.GLOWSTONE).build();
    public static final RechiseledBlockType GLOWSTONE_CRUSHED = create("glowstone_crushed", "Crushed Glowstone", () -> Blocks.GLOWSTONE).recipe(BaseChiselingRecipes.GLOWSTONE).build();
    public static final RechiseledBlockType GLOWSTONE_LARGE_TILES = create("glowstone_large_tiles", "Large Glowstone Tiles", () -> Blocks.GLOWSTONE).recipe(BaseChiselingRecipes.GLOWSTONE).build();
    public static final RechiseledBlockType GLOWSTONE_ROTATED_BRICKS = create("glowstone_rotated_bricks", "Rotated Glowstone Bricks", () -> Blocks.GLOWSTONE).recipe(BaseChiselingRecipes.GLOWSTONE).build();
    public static final RechiseledBlockType GLOWSTONE_SMALL_TILES = create("glowstone_small_tiles", "Small Glowstone Tiles", () -> Blocks.GLOWSTONE).recipe(BaseChiselingRecipes.GLOWSTONE).build();
    public static final RechiseledBlockType GLOWSTONE_SMOOTH = create("glowstone_smooth", "Smooth Glowstone", () -> Blocks.GLOWSTONE).recipe(BaseChiselingRecipes.GLOWSTONE).build();
    public static final RechiseledBlockType GLOWSTONE_TILES = create("glowstone_tiles", "Glowstone Tiles", () -> Blocks.GLOWSTONE).recipe(BaseChiselingRecipes.GLOWSTONE).build();
    // Gold block
    public static final RechiseledBlockType GOLD_BLOCK_BEAMS = create("gold_block_beams", "Gold Beams Block", () -> Blocks.GOLD_BLOCK).recipe(BaseChiselingRecipes.GOLD_BLOCK).build();
    public static final RechiseledBlockType GOLD_BLOCK_BORDERED = create("gold_block_bordered", "Bordered Block of Gold", () -> Blocks.GOLD_BLOCK).recipe(BaseChiselingRecipes.GOLD_BLOCK).build();
    public static final RechiseledBlockType GOLD_BLOCK_LINES = create("gold_block_lines", "Gold Lines Block", () -> Blocks.GOLD_BLOCK).recipe(BaseChiselingRecipes.GOLD_BLOCK).build();
    public static final RechiseledBlockType GOLD_BLOCK_PATTERN = create("gold_block_pattern", "Gold Block Pattern", () -> Blocks.GOLD_BLOCK).recipe(BaseChiselingRecipes.GOLD_BLOCK).build();
    public static final RechiseledBlockType GOLD_BLOCK_POLISHED = create("gold_block_polished", "Polished Block of Gold", () -> Blocks.GOLD_BLOCK).recipe(BaseChiselingRecipes.GOLD_BLOCK).build();
    public static final RechiseledBlockType GOLD_BLOCK_SCALES = create("gold_block_scales", "Gold Scales Block", () -> Blocks.GOLD_BLOCK).recipe(BaseChiselingRecipes.GOLD_BLOCK).build();
    public static final RechiseledBlockType GOLD_BLOCK_SMALL_BRICKS = create("gold_block_small_bricks", "Small Gold Bricks", () -> Blocks.GOLD_BLOCK).recipe(BaseChiselingRecipes.GOLD_BLOCK).build();
    public static final RechiseledBlockType GOLD_BLOCK_SMALL_TILES = create("gold_block_small_tiles", "Small Gold Tiles", () -> Blocks.GOLD_BLOCK).recipe(BaseChiselingRecipes.GOLD_BLOCK).build();
    public static final RechiseledBlockType GOLD_BLOCK_STRIPED = create("gold_block_striped", "Striped Block of Gold", () -> Blocks.GOLD_BLOCK).recipe(BaseChiselingRecipes.GOLD_BLOCK).build();
    public static final RechiseledBlockType GOLD_BLOCK_SMOOTH = create("gold_block_smooth", "Smooth Block of Gold", () -> Blocks.GOLD_BLOCK).noConnectingVariant().recipe(BaseChiselingRecipes.GOLD_BLOCK).build();
    public static final RechiseledBlockType GOLD_BLOCK_TILES = create("gold_block_tiles", "Gold Tiles Block", () -> Blocks.GOLD_BLOCK).recipe(BaseChiselingRecipes.GOLD_BLOCK).build();
    // Granite
    public static final RechiseledBlockType GRANITE_BRICK_PATTERN = create("granite_brick_pattern", "Granite Brick Pattern", () -> Blocks.STONE).recipe(BaseChiselingRecipes.GRANITE).build();
    public static final RechiseledBlockType GRANITE_BRICK_PAVING = create("granite_brick_paving", "Granite Brick Paving", () -> Blocks.STONE).recipe(BaseChiselingRecipes.GRANITE).build();
    public static final RechiseledBlockType GRANITE_BRICKS = create("granite_bricks", "Granite Bricks", () -> Blocks.STONE).recipe(BaseChiselingRecipes.GRANITE).build();
    public static final RechiseledBlockType GRANITE_DIAGONAL_BRICKS = create("granite_diagonal_bricks", "Diagonal Granite Bricks", () -> Blocks.STONE).recipe(BaseChiselingRecipes.GRANITE).build();
    public static final RechiseledBlockType GRANITE_DOTTED = create("granite_dotted", "Dotted Granite", () -> Blocks.STONE).recipe(BaseChiselingRecipes.GRANITE).build();
    public static final RechiseledBlockType GRANITE_PAVING = create("granite_paving", "Granite Paving", () -> Blocks.STONE).recipe(BaseChiselingRecipes.GRANITE).build();
    public static final RechiseledBlockType GRANITE_POLISHED = create("granite_polished", "Polished Granite", () -> Blocks.STONE).regularVariant(() -> Blocks.STONE, 2).recipe(BaseChiselingRecipes.GRANITE).build();
    public static final RechiseledBlockType GRANITE_ROTATED_BRICKS = create("granite_rotated_bricks", "Rotated Granite Bricks", () -> Blocks.STONE).recipe(BaseChiselingRecipes.GRANITE).build();
    public static final RechiseledBlockType GRANITE_SQUARES = create("granite_squares", "Granite Squares", () -> Blocks.STONE).recipe(BaseChiselingRecipes.GRANITE).build();
    public static final RechiseledBlockType GRANITE_TILES = create("granite_tiles", "Granite Tiles", () -> Blocks.STONE).recipe(BaseChiselingRecipes.GRANITE).build();
    public static final RechiseledBlockType GRANITE_WAVY = create("granite_wavy", "Wavy Granite", () -> Blocks.STONE).recipe(BaseChiselingRecipes.GRANITE).build();
    // Iron block
    public static final RechiseledBlockType IRON_BLOCK_BORDERED = create("iron_block_bordered", "Bordered Block of Iron", () -> Blocks.IRON_BLOCK).recipe(BaseChiselingRecipes.IRON_BLOCK).build();
    public static final RechiseledBlockType IRON_BLOCK_CHISELED = create("iron_block_chiseled", "Chiseled Block of Iron", () -> Blocks.IRON_BLOCK).recipe(BaseChiselingRecipes.IRON_BLOCK).build();
    public static final RechiseledBlockType IRON_BLOCK_CONNECTING = create("iron_block_connecting", "Block of Iron", () -> Blocks.IRON_BLOCK).regularVariant(() -> Blocks.IRON_BLOCK).recipe(BaseChiselingRecipes.IRON_BLOCK).build();
    public static final RechiseledBlockType IRON_BLOCK_FRAMED = create("iron_block_framed", "Framed Block of Iron", () -> Blocks.IRON_BLOCK).recipe(BaseChiselingRecipes.IRON_BLOCK).build();
    public static final RechiseledBlockType IRON_BLOCK_GEARS = create("iron_block_gears", "Iron Gears Block", () -> Blocks.IRON_BLOCK).recipe(BaseChiselingRecipes.IRON_BLOCK).build();
    public static final RechiseledBlockType IRON_BLOCK_LINES = create("iron_block_lines", "Iron Block Lines", () -> Blocks.IRON_BLOCK).recipe(BaseChiselingRecipes.IRON_BLOCK).build();
    public static final RechiseledBlockType IRON_BLOCK_PATTERNED = create("iron_block_patterned", "Patterned Block of Iron", () -> Blocks.IRON_BLOCK).recipe(BaseChiselingRecipes.IRON_BLOCK).build();
    public static final RechiseledBlockType IRON_BLOCK_PIPES = create("iron_block_pipes", "Iron Block Pipes", () -> Blocks.IRON_BLOCK).recipe(BaseChiselingRecipes.IRON_BLOCK).build();
    public static final RechiseledBlockType IRON_BLOCK_PLATED = create("iron_block_plated", "Plated Block of Iron", () -> Blocks.IRON_BLOCK).noConnectingVariant().recipe(BaseChiselingRecipes.IRON_BLOCK).build();
    public static final RechiseledBlockType IRON_BLOCK_POLISHED = create("iron_block_polished", "Polished Block of Iron", () -> Blocks.IRON_BLOCK).recipe(BaseChiselingRecipes.IRON_BLOCK).build();
    public static final RechiseledBlockType IRON_BLOCK_PROCESSED = create("iron_block_processed", "Processed Block of Iron", () -> Blocks.IRON_BLOCK).recipe(BaseChiselingRecipes.IRON_BLOCK).build();
    public static final RechiseledBlockType IRON_BLOCK_PULVERIZED = create("iron_block_pulverized", "Pulverized Block of Iron", () -> Blocks.IRON_BLOCK).noConnectingVariant().recipe(BaseChiselingRecipes.IRON_BLOCK).build();
    public static final RechiseledBlockType IRON_BLOCK_REINFORCED = create("iron_block_reinforced", "Reinforced Block of Iron", () -> Blocks.IRON_BLOCK).noConnectingVariant().recipe(BaseChiselingRecipes.IRON_BLOCK).build();
    public static final RechiseledBlockType IRON_BLOCK_SHEETS = create("iron_block_sheets", "Block of Iron Sheets", () -> Blocks.IRON_BLOCK).noConnectingVariant().recipe(BaseChiselingRecipes.IRON_BLOCK).build();
    public static final RechiseledBlockType IRON_BLOCK_SMALL_BRICKS = create("iron_block_small_bricks", "Small Iron Block Tiles", () -> Blocks.IRON_BLOCK).recipe(BaseChiselingRecipes.IRON_BLOCK).build();
    public static final RechiseledBlockType IRON_BLOCK_SMOOTH = create("iron_block_smooth", "Smooth Block of Iron", () -> Blocks.IRON_BLOCK).noConnectingVariant().recipe(BaseChiselingRecipes.IRON_BLOCK).build();
    // Jungle planks
    public static final RechiseledBlockType JUNGLE_PLANKS_BEAMS = create("jungle_planks_beams", "Jungle Plank Beams", () -> Blocks.PLANKS, BlockPlanks.EnumType.JUNGLE).recipe(BaseChiselingRecipes.JUNGLE_PLANKS).build();
    public static final RechiseledBlockType JUNGLE_PLANKS_BRICK_PATTERN = create("jungle_planks_brick_pattern", "Jungle Plank Brick Pattern", () -> Blocks.PLANKS, BlockPlanks.EnumType.JUNGLE).recipe(BaseChiselingRecipes.JUNGLE_PLANKS).build();
    public static final RechiseledBlockType JUNGLE_PLANKS_BRICK_PAVING = create("jungle_planks_brick_paving", "Jungle Plank Brick Paving", () -> Blocks.PLANKS, BlockPlanks.EnumType.JUNGLE).recipe(BaseChiselingRecipes.JUNGLE_PLANKS).build();
    public static final RechiseledBlockType JUNGLE_PLANKS_BRICKS = create("jungle_planks_bricks", "Jungle Plank Bricks", () -> Blocks.PLANKS, BlockPlanks.EnumType.JUNGLE).recipe(BaseChiselingRecipes.JUNGLE_PLANKS).build();
    public static final RechiseledBlockType JUNGLE_PLANKS_CRATE = create("jungle_planks_crate", "Jungle Planks Crate", () -> Blocks.PLANKS, BlockPlanks.EnumType.JUNGLE).recipe(BaseChiselingRecipes.JUNGLE_PLANKS).build();
    public static final RechiseledBlockType JUNGLE_PLANKS_DIAGONAL_STRIPES = create("jungle_planks_diagonal_stripes", "Diagonal Jungle Plank Stripes", () -> Blocks.PLANKS, BlockPlanks.EnumType.JUNGLE).recipe(BaseChiselingRecipes.JUNGLE_PLANKS).build();
    public static final RechiseledBlockType JUNGLE_PLANKS_DIAGONAL_TILES = create("jungle_planks_diagonal_tiles", "Diagonal Jungle Plank Tiles", () -> Blocks.PLANKS, BlockPlanks.EnumType.JUNGLE).recipe(BaseChiselingRecipes.JUNGLE_PLANKS).build();
    public static final RechiseledBlockType JUNGLE_PLANKS_DOTTED = create("jungle_planks_dotted", "Dotted Jungle Planks", () -> Blocks.PLANKS, BlockPlanks.EnumType.JUNGLE).recipe(BaseChiselingRecipes.JUNGLE_PLANKS).build();
    public static final RechiseledBlockType JUNGLE_PLANKS_FLOORING = create("jungle_planks_flooring", "Jungle Plank Flooring", () -> Blocks.PLANKS, BlockPlanks.EnumType.JUNGLE).recipe(BaseChiselingRecipes.JUNGLE_PLANKS).build();
    public static final RechiseledBlockType JUNGLE_PLANKS_LARGE_TILES = create("jungle_planks_large_tiles", "Large Jungle Plank Tiles", () -> Blocks.PLANKS, BlockPlanks.EnumType.JUNGLE).recipe(BaseChiselingRecipes.JUNGLE_PLANKS).build();
    public static final RechiseledBlockType JUNGLE_PLANKS_MOSAIC = create("jungle_planks_mosaic", "Jungle Plank Mosaic", () -> Blocks.PLANKS, BlockPlanks.EnumType.JUNGLE).noConnectingVariant().recipe(BaseChiselingRecipes.JUNGLE_PLANKS).build();
    public static final RechiseledBlockType JUNGLE_PLANKS_PATTERN = create("jungle_planks_pattern", "Jungle Plank Pattern", () -> Blocks.PLANKS, BlockPlanks.EnumType.JUNGLE).recipe(BaseChiselingRecipes.JUNGLE_PLANKS).build();
    public static final RechiseledBlockType JUNGLE_PLANKS_ROTATED_BRICKS = create("jungle_planks_rotated_bricks", "Rotated Jungle Plank Bricks", () -> Blocks.PLANKS, BlockPlanks.EnumType.JUNGLE).recipe(BaseChiselingRecipes.JUNGLE_PLANKS).build();
    public static final RechiseledBlockType JUNGLE_PLANKS_SMALL_BRICKS = create("jungle_planks_small_bricks", "Small Jungle Plank Bricks", () -> Blocks.PLANKS, BlockPlanks.EnumType.JUNGLE).recipe(BaseChiselingRecipes.JUNGLE_PLANKS).build();
    public static final RechiseledBlockType JUNGLE_PLANKS_SMALL_TILES = create("jungle_planks_small_tiles", "Small Jungle Plank Tiles", () -> Blocks.PLANKS, BlockPlanks.EnumType.JUNGLE).recipe(BaseChiselingRecipes.JUNGLE_PLANKS).build();
    public static final RechiseledBlockType JUNGLE_PLANKS_SQUARES = create("jungle_planks_squares", "Jungle Plank Squares", () -> Blocks.PLANKS, BlockPlanks.EnumType.JUNGLE).recipe(BaseChiselingRecipes.JUNGLE_PLANKS).build();
    public static final RechiseledBlockType JUNGLE_PLANKS_TILES = create("jungle_planks_tiles", "Jungle Plank Tiles", () -> Blocks.PLANKS, BlockPlanks.EnumType.JUNGLE).recipe(BaseChiselingRecipes.JUNGLE_PLANKS).build();
    public static final RechiseledBlockType JUNGLE_PLANKS_WAVY = create("jungle_planks_wavy", "Wavy Jungle Planks", () -> Blocks.PLANKS, BlockPlanks.EnumType.JUNGLE).recipe(BaseChiselingRecipes.JUNGLE_PLANKS).build();
    public static final RechiseledBlockType JUNGLE_PLANKS_WOVEN = create("jungle_planks_woven", "Woven Jungle Planks", () -> Blocks.PLANKS, BlockPlanks.EnumType.JUNGLE).recipe(BaseChiselingRecipes.JUNGLE_PLANKS).build();
    // Lapis block
    public static final RechiseledBlockType LAPIS_BLOCK_BORDERED = create("lapis_block_bordered", "Bordered Block of Lapis Lazuli", () -> Blocks.LAPIS_BLOCK).recipe(BaseChiselingRecipes.LAPIS_BLOCK).build();
    public static final RechiseledBlockType LAPIS_BLOCK_CHISELED = create("lapis_block_chiseled", "Chiseled Block of Lapis Lazuli", () -> Blocks.LAPIS_BLOCK).recipe(BaseChiselingRecipes.LAPIS_BLOCK).build();
    public static final RechiseledBlockType LAPIS_BLOCK_COBBLED = create("lapis_block_cobbled", "Cobbled Block of Lapis Lazuli", () -> Blocks.LAPIS_BLOCK).noConnectingVariant().recipe(BaseChiselingRecipes.LAPIS_BLOCK).build();
    public static final RechiseledBlockType LAPIS_BLOCK_CONNECTING = create("lapis_block_connecting", "Block of Lapis Lazuli", () -> Blocks.LAPIS_BLOCK).regularVariant(() -> Blocks.LAPIS_BLOCK).recipe(BaseChiselingRecipes.LAPIS_BLOCK).build();
    public static final RechiseledBlockType LAPIS_BLOCK_CRUSHED = create("lapis_block_crushed", "Crushed Block of Lapis Lazuli", () -> Blocks.LAPIS_BLOCK).noConnectingVariant().recipe(BaseChiselingRecipes.LAPIS_BLOCK).build();
    public static final RechiseledBlockType LAPIS_BLOCK_DECORATED = create("lapis_block_decorated", "Decorated Block of Lapis Lazuli", () -> Blocks.LAPIS_BLOCK).recipe(BaseChiselingRecipes.LAPIS_BLOCK).build();
    public static final RechiseledBlockType LAPIS_BLOCK_GLOSSY = create("lapis_block_glossy", "Glossy Block of Lapis Lazuli", () -> Blocks.LAPIS_BLOCK).recipe(BaseChiselingRecipes.LAPIS_BLOCK).build();
    public static final RechiseledBlockType LAPIS_BLOCK_INVERTED_TILES = create("lapis_block_inverted_tiles", "Inverted Lapis Lazuli Block Tiles", () -> Blocks.LAPIS_BLOCK).recipe(BaseChiselingRecipes.LAPIS_BLOCK).build();
    public static final RechiseledBlockType LAPIS_BLOCK_MOSAIC = create("lapis_block_mosaic", "Mosaic Block of Lapis Lazuli", () -> Blocks.LAPIS_BLOCK).recipe(BaseChiselingRecipes.LAPIS_BLOCK).build();
    public static final RechiseledBlockType LAPIS_BLOCK_PATTERN = create("lapis_block_pattern", "Patterned Block of Lapis Lazuli", () -> Blocks.LAPIS_BLOCK).recipe(BaseChiselingRecipes.LAPIS_BLOCK).build();
    public static final RechiseledBlockType LAPIS_BLOCK_PILLAR = create("lapis_block_pillar", "Lapis Lazuli Block Pillar", () -> Blocks.LAPIS_BLOCK).specification(BlockSpecification.PILLAR).recipe(BaseChiselingRecipes.LAPIS_BLOCK).build();
    public static final RechiseledBlockType LAPIS_BLOCK_POLISHED = create("lapis_block_polished", "Polished Block of Lapis Lazuli", () -> Blocks.LAPIS_BLOCK).recipe(BaseChiselingRecipes.LAPIS_BLOCK).build();
    public static final RechiseledBlockType LAPIS_BLOCK_SCALES = create("lapis_block_scales", "Lapis Lazuli Block Scales", () -> Blocks.LAPIS_BLOCK).recipe(BaseChiselingRecipes.LAPIS_BLOCK).build();
    public static final RechiseledBlockType LAPIS_BLOCK_SMALL_TILES = create("lapis_block_small_tiles", "Small Lapis Lazuli Block Tiles", () -> Blocks.LAPIS_BLOCK).recipe(BaseChiselingRecipes.LAPIS_BLOCK).build();
    public static final RechiseledBlockType LAPIS_BLOCK_SMOOTH = create("lapis_block_smooth", "Smooth Block of Lapis Lazuli", () -> Blocks.LAPIS_BLOCK).noConnectingVariant().recipe(BaseChiselingRecipes.LAPIS_BLOCK).build();
    public static final RechiseledBlockType LAPIS_BLOCK_STRIPES = create("lapis_block_stripes", "Striped Block of Lapis Lazuli", () -> Blocks.LAPIS_BLOCK).recipe(BaseChiselingRecipes.LAPIS_BLOCK).build();
    public static final RechiseledBlockType LAPIS_BLOCK_SWIRLING = create("lapis_block_swirling", "Swirling Block of Lapis Lazuli", () -> Blocks.LAPIS_BLOCK).noConnectingVariant().recipe(BaseChiselingRecipes.LAPIS_BLOCK).build();
    public static final RechiseledBlockType LAPIS_BLOCK_TILES = create("lapis_block_tiles", "Lapis Lazuli Block Tiles", () -> Blocks.LAPIS_BLOCK).recipe(BaseChiselingRecipes.LAPIS_BLOCK).build();
    // Mossy cobblestone
    public static final RechiseledBlockType MOSSY_COBBLESTONE_BEAMS = create("mossy_cobblestone_beams", "Mossy Cobblestone Beams", () -> Blocks.MOSSY_COBBLESTONE).recipe(BaseChiselingRecipes.COBBLESTONE).build();
    public static final RechiseledBlockType MOSSY_COBBLESTONE_DENTED = create("mossy_cobblestone_dented", "Dented Mossy Cobblestone", () -> Blocks.MOSSY_COBBLESTONE).recipe(BaseChiselingRecipes.COBBLESTONE).build();
    public static final RechiseledBlockType MOSSY_COBBLESTONE_INVERTED_DENTED = create("mossy_cobblestone_inverted_dented", "Inverted Dented Mossy Cobblestone", () -> Blocks.MOSSY_COBBLESTONE).recipe(BaseChiselingRecipes.COBBLESTONE).build();
    public static final RechiseledBlockType MOSSY_COBBLESTONE_PAVING = create("mossy_cobblestone_paving", "Mossy Cobblestone Paving", () -> Blocks.MOSSY_COBBLESTONE).recipe(BaseChiselingRecipes.COBBLESTONE).build();
    public static final RechiseledBlockType MOSSY_COBBLESTONE_SMALL_TILES = create("mossy_cobblestone_small_tiles", "Small Mossy Cobblestone Tiles", () -> Blocks.MOSSY_COBBLESTONE).recipe(BaseChiselingRecipes.COBBLESTONE).build();
    public static final RechiseledBlockType MOSSY_COBBLESTONE_SQUARES = create("mossy_cobblestone_squares", "Mossy Cobblestone Squares", () -> Blocks.MOSSY_COBBLESTONE).recipe(BaseChiselingRecipes.COBBLESTONE).build();
    public static final RechiseledBlockType MOSSY_COBBLESTONE_STRIPES = create("mossy_cobblestone_stripes", "Mossy Cobblestone Stripes", () -> Blocks.MOSSY_COBBLESTONE).recipe(BaseChiselingRecipes.COBBLESTONE).build();
    public static final RechiseledBlockType MOSSY_COBBLESTONE_WORN_STRIPES = create("mossy_cobblestone_worn_stripes", "Weathered Mossy Cobblestone", () -> Blocks.MOSSY_COBBLESTONE).recipe(BaseChiselingRecipes.COBBLESTONE).build();
    // Netherrack
    public static final RechiseledBlockType NETHERRACK_BEAMS = create("netherrack_beams", "Netherrack Beams", () -> Blocks.NETHERRACK).recipe(BaseChiselingRecipes.NETHERRACK).build();
    public static final RechiseledBlockType NETHERRACK_BRICK_PATTERN = create("netherrack_brick_pattern", "Netherrack Brick Pattern", () -> Blocks.NETHERRACK).recipe(BaseChiselingRecipes.NETHERRACK).build();
    public static final RechiseledBlockType NETHERRACK_BRICK_PAVING = create("netherrack_brick_paving", "Netherrack Brick Paving", () -> Blocks.NETHERRACK).recipe(BaseChiselingRecipes.NETHERRACK).build();
    public static final RechiseledBlockType NETHERRACK_BRICKS = create("netherrack_bricks", "Netherrack Bricks", () -> Blocks.NETHERRACK).recipe(BaseChiselingRecipes.NETHERRACK).build();
    public static final RechiseledBlockType NETHERRACK_DENTED = create("netherrack_dented", "Dented Netherrack", () -> Blocks.NETHERRACK).recipe(BaseChiselingRecipes.NETHERRACK).build();
    public static final RechiseledBlockType NETHERRACK_ROTATED_BRICKS = create("netherrack_rotated_bricks", "Rotated Netherrack Bricks", () -> Blocks.NETHERRACK).recipe(BaseChiselingRecipes.NETHERRACK).build();
    public static final RechiseledBlockType NETHERRACK_SMALL_TILES = create("netherrack_small_tiles", "Small Netherrack Tiles", () -> Blocks.NETHERRACK).recipe(BaseChiselingRecipes.NETHERRACK).build();
    public static final RechiseledBlockType NETHERRACK_STRIPES = create("netherrack_stripes", "Netherrack Stripes", () -> Blocks.NETHERRACK).recipe(BaseChiselingRecipes.NETHERRACK).build();
    public static final RechiseledBlockType NETHERRACK_TILES = create("netherrack_tiles", "Netherrack Tiles", () -> Blocks.NETHERRACK).recipe(BaseChiselingRecipes.NETHERRACK).build();
    // Nether bricks
    public static final RechiseledBlockType NETHER_BRICKS_BEAMS = create("nether_bricks_beams", "Nether Brick Beams", () -> Blocks.NETHER_BRICK).recipe(BaseChiselingRecipes.NETHER_BRICKS).build();
    public static final RechiseledBlockType NETHER_BRICKS_BRICK_PATTERN = create("nether_bricks_brick_pattern", "Nether Brick Pattern", () -> Blocks.NETHER_BRICK).recipe(BaseChiselingRecipes.NETHER_BRICKS).build();
    public static final RechiseledBlockType NETHER_BRICKS_BRICK_PAVING = create("nether_bricks_brick_paving", "Nether Brick Paving", () -> Blocks.NETHER_BRICK).recipe(BaseChiselingRecipes.NETHER_BRICKS).build();
    public static final RechiseledBlockType NETHER_BRICKS_CHISELED_SQUARES = create("nether_bricks_chiseled_squares", "Chiseled Nether Brick Squares", () -> Blocks.NETHER_BRICK).recipe(BaseChiselingRecipes.NETHER_BRICKS).build();
    public static final RechiseledBlockType NETHER_BRICKS_DIAGONAL_BRICKS = create("nether_bricks_diagonal_bricks", "Diagonal Nether Bricks", () -> Blocks.NETHER_BRICK).recipe(BaseChiselingRecipes.NETHER_BRICKS).build();
    public static final RechiseledBlockType NETHER_BRICKS_LARGE_BRICKS = create("nether_bricks_large_bricks", "Large Nether Bricks", () -> Blocks.NETHER_BRICK).recipe(BaseChiselingRecipes.NETHER_BRICKS).build();
    public static final RechiseledBlockType NETHER_BRICKS_LARGE_TILES = create("nether_bricks_large_tiles", "Large Nether Brick Tiles", () -> Blocks.NETHER_BRICK).recipe(BaseChiselingRecipes.NETHER_BRICKS).build();
    public static final RechiseledBlockType NETHER_BRICKS_ROTATED_BRICKS = create("nether_bricks_rotated_bricks", "Rotated Nether Bricks", () -> Blocks.NETHER_BRICK).recipe(BaseChiselingRecipes.NETHER_BRICKS).build();
    public static final RechiseledBlockType NETHER_BRICKS_SMALL_TILES = create("nether_bricks_small_tiles", "Small Nether Brick Tiles", () -> Blocks.NETHER_BRICK).recipe(BaseChiselingRecipes.NETHER_BRICKS).build();
    public static final RechiseledBlockType NETHER_BRICKS_SMOOTH = create("nether_bricks_smooth", "Nether Bricks Smooth", () -> Blocks.NETHER_BRICK).recipe(BaseChiselingRecipes.NETHER_BRICKS).build();
    public static final RechiseledBlockType NETHER_BRICKS_SQUARES = create("nether_bricks_squares", "Nether Brick Squares", () -> Blocks.NETHER_BRICK).recipe(BaseChiselingRecipes.NETHER_BRICKS).build();
    public static final RechiseledBlockType NETHER_BRICKS_TILES = create("nether_bricks_tiles", "Nether Brick Tiles", () -> Blocks.NETHER_BRICK).recipe(BaseChiselingRecipes.NETHER_BRICKS).build();
    // Oak planks
    public static final RechiseledBlockType OAK_PLANKS_BEAMS = create("oak_planks_beams", "Oak Plank Beams", () -> Blocks.PLANKS, BlockPlanks.EnumType.OAK).recipe(BaseChiselingRecipes.OAK_PLANKS).build();
    public static final RechiseledBlockType OAK_PLANKS_BRICK_PATTERN = create("oak_planks_brick_pattern", "Oak Plank Brick Pattern", () -> Blocks.PLANKS, BlockPlanks.EnumType.OAK).recipe(BaseChiselingRecipes.OAK_PLANKS).build();
    public static final RechiseledBlockType OAK_PLANKS_BRICK_PAVING = create("oak_planks_brick_paving", "Oak Plank Brick Paving", () -> Blocks.PLANKS, BlockPlanks.EnumType.OAK).recipe(BaseChiselingRecipes.OAK_PLANKS).build();
    public static final RechiseledBlockType OAK_PLANKS_BRICKS = create("oak_planks_bricks", "Oak Plank Bricks", () -> Blocks.PLANKS, BlockPlanks.EnumType.OAK).recipe(BaseChiselingRecipes.OAK_PLANKS).build();
    public static final RechiseledBlockType OAK_PLANKS_CRATE = create("oak_planks_crate", "Oak Planks Crate", () -> Blocks.PLANKS, BlockPlanks.EnumType.OAK).recipe(BaseChiselingRecipes.OAK_PLANKS).build();
    public static final RechiseledBlockType OAK_PLANKS_DIAGONAL_STRIPES = create("oak_planks_diagonal_stripes", "Diagonal Oak Plank Stripes", () -> Blocks.PLANKS, BlockPlanks.EnumType.OAK).recipe(BaseChiselingRecipes.OAK_PLANKS).build();
    public static final RechiseledBlockType OAK_PLANKS_DIAGONAL_TILES = create("oak_planks_diagonal_tiles", "Diagonal Oak Plank Tiles", () -> Blocks.PLANKS, BlockPlanks.EnumType.OAK).recipe(BaseChiselingRecipes.OAK_PLANKS).build();
    public static final RechiseledBlockType OAK_PLANKS_DOTTED = create("oak_planks_dotted", "Dotted Oak Planks", () -> Blocks.PLANKS, BlockPlanks.EnumType.OAK).recipe(BaseChiselingRecipes.OAK_PLANKS).build();
    public static final RechiseledBlockType OAK_PLANKS_FLOORING = create("oak_planks_flooring", "Oak Plank Flooring", () -> Blocks.PLANKS, BlockPlanks.EnumType.OAK).recipe(BaseChiselingRecipes.OAK_PLANKS).build();
    public static final RechiseledBlockType OAK_PLANKS_LARGE_TILES = create("oak_planks_large_tiles", "Large Oak Plank Tiles", () -> Blocks.PLANKS, BlockPlanks.EnumType.OAK).recipe(BaseChiselingRecipes.OAK_PLANKS).build();
    public static final RechiseledBlockType OAK_PLANKS_MOSAIC = create("oak_planks_mosaic", "Oak Plank Mosaic", () -> Blocks.PLANKS, BlockPlanks.EnumType.OAK).noConnectingVariant().recipe(BaseChiselingRecipes.OAK_PLANKS).build();
    public static final RechiseledBlockType OAK_PLANKS_PATTERN = create("oak_planks_pattern", "Oak Plank Pattern", () -> Blocks.PLANKS, BlockPlanks.EnumType.OAK).recipe(BaseChiselingRecipes.OAK_PLANKS).build();
    public static final RechiseledBlockType OAK_PLANKS_ROTATED_BRICKS = create("oak_planks_rotated_bricks", "Rotated Oak Plank Bricks", () -> Blocks.PLANKS, BlockPlanks.EnumType.OAK).recipe(BaseChiselingRecipes.OAK_PLANKS).build();
    public static final RechiseledBlockType OAK_PLANKS_SMALL_BRICKS = create("oak_planks_small_bricks", "Small Oak Plank Bricks", () -> Blocks.PLANKS, BlockPlanks.EnumType.OAK).recipe(BaseChiselingRecipes.OAK_PLANKS).build();
    public static final RechiseledBlockType OAK_PLANKS_SMALL_TILES = create("oak_planks_small_tiles", "Small Oak Plank Tiles", () -> Blocks.PLANKS, BlockPlanks.EnumType.OAK).recipe(BaseChiselingRecipes.OAK_PLANKS).build();
    public static final RechiseledBlockType OAK_PLANKS_SQUARES = create("oak_planks_squares", "Oak Plank Squares", () -> Blocks.PLANKS, BlockPlanks.EnumType.OAK).recipe(BaseChiselingRecipes.OAK_PLANKS).build();
    public static final RechiseledBlockType OAK_PLANKS_TILES = create("oak_planks_tiles", "Oak Plank Tiles", () -> Blocks.PLANKS, BlockPlanks.EnumType.OAK).recipe(BaseChiselingRecipes.OAK_PLANKS).build();
    public static final RechiseledBlockType OAK_PLANKS_WAVY = create("oak_planks_wavy", "Wavy Oak Planks", () -> Blocks.PLANKS, BlockPlanks.EnumType.OAK).recipe(BaseChiselingRecipes.OAK_PLANKS).build();
    public static final RechiseledBlockType OAK_PLANKS_WOVEN = create("oak_planks_woven", "Woven Oak Planks", () -> Blocks.PLANKS, BlockPlanks.EnumType.OAK).recipe(BaseChiselingRecipes.OAK_PLANKS).build();
    // Obsidian
    public static final RechiseledBlockType OBSIDIAN_BORDERED = create("obsidian_bordered", "Bordered Obsidian", () -> Blocks.OBSIDIAN).recipe(BaseChiselingRecipes.OBSIDIAN).build();
    public static final RechiseledBlockType OBSIDIAN_BRICK_PATTERN = create("obsidian_brick_pattern", "Obsidian Brick Pattern", () -> Blocks.OBSIDIAN).recipe(BaseChiselingRecipes.OBSIDIAN).build();
    public static final RechiseledBlockType OBSIDIAN_BRICK_PAVING = create("obsidian_brick_paving", "Obsidian Brick Paving", () -> Blocks.OBSIDIAN).recipe(BaseChiselingRecipes.OBSIDIAN).build();
    public static final RechiseledBlockType OBSIDIAN_BRICKS = create("obsidian_bricks", "Obsidian Bricks", () -> Blocks.OBSIDIAN).recipe(BaseChiselingRecipes.OBSIDIAN).build();
    public static final RechiseledBlockType OBSIDIAN_CHISELED = create("obsidian_chiseled", "Chiseled Obsidian", () -> Blocks.OBSIDIAN).recipe(BaseChiselingRecipes.OBSIDIAN).build();
    public static final RechiseledBlockType OBSIDIAN_CHISELED_CIRCLES = create("obsidian_chiseled_circles", "Chiseled Obsidian Circles", () -> Blocks.OBSIDIAN).recipe(BaseChiselingRecipes.OBSIDIAN).build();
    public static final RechiseledBlockType OBSIDIAN_CHISELED_CREEPER = create("obsidian_chiseled_creeper", "Chiseled Obsidian Creeper Face", () -> Blocks.OBSIDIAN).noConnectingVariant().recipe(BaseChiselingRecipes.OBSIDIAN).build();
    public static final RechiseledBlockType OBSIDIAN_CHISELED_SKELETON = create("obsidian_chiseled_skeleton", "Chiseled Obsidian Skeleton Face", () -> Blocks.OBSIDIAN).noConnectingVariant().recipe(BaseChiselingRecipes.OBSIDIAN).build();
    public static final RechiseledBlockType OBSIDIAN_DARK = create("obsidian_dark", "Dark Obsidian", () -> Blocks.OBSIDIAN).recipe(BaseChiselingRecipes.OBSIDIAN).build();
    public static final RechiseledBlockType OBSIDIAN_LARGE_TILES = create("obsidian_large_tiles", "Large Obsidian Tiles", () -> Blocks.OBSIDIAN).noConnectingVariant().recipe(BaseChiselingRecipes.OBSIDIAN).build();
    public static final RechiseledBlockType OBSIDIAN_PILLARS = create("obsidian_pillars", "Obsidian Pillars", () -> Blocks.OBSIDIAN).recipe(BaseChiselingRecipes.OBSIDIAN).build();
    public static final RechiseledBlockType OBSIDIAN_ROTATED_BRICKS = create("obsidian_rotated_bricks", "Rotated Obsidian Bricks", () -> Blocks.OBSIDIAN).recipe(BaseChiselingRecipes.OBSIDIAN).build();
    public static final RechiseledBlockType OBSIDIAN_SPOTS = create("obsidian_spots", "Spotted Obsidian", () -> Blocks.OBSIDIAN).recipe(BaseChiselingRecipes.OBSIDIAN).build();
    public static final RechiseledBlockType OBSIDIAN_SQUARES = create("obsidian_squares", "Obsidian Squares", () -> Blocks.OBSIDIAN).recipe(BaseChiselingRecipes.OBSIDIAN).build();
    public static final RechiseledBlockType OBSIDIAN_STRIPES = create("obsidian_stripes", "Obsidian Stripes", () -> Blocks.OBSIDIAN).recipe(BaseChiselingRecipes.OBSIDIAN).build();
    public static final RechiseledBlockType OBSIDIAN_TILES = create("obsidian_tiles", "Obsidian Tiles", () -> Blocks.OBSIDIAN).recipe(BaseChiselingRecipes.OBSIDIAN).build();
    // Prismarine
    public static final RechiseledBlockType PRISMARINE_BRICKS_BEAMS = create("prismarine_bricks_beams", "Prismarine Brick Beams", () -> Blocks.PRISMARINE).recipe(BaseChiselingRecipes.PRISMARINE_BRICKS).build();
    public static final RechiseledBlockType PRISMARINE_BRICKS_BRICK_PATTERN = create("prismarine_bricks_brick_pattern", "Prismarine Brick Pattern", () -> Blocks.PRISMARINE).recipe(BaseChiselingRecipes.PRISMARINE_BRICKS).build();
    public static final RechiseledBlockType PRISMARINE_BRICKS_BRICK_PAVING = create("prismarine_bricks_brick_paving", "Prismarine Brick Paving", () -> Blocks.PRISMARINE).recipe(BaseChiselingRecipes.PRISMARINE_BRICKS).build();
    public static final RechiseledBlockType PRISMARINE_BRICKS_BRICKS = create("prismarine_bricks_bricks", "Prismarine Bricks", () -> Blocks.PRISMARINE).recipe(BaseChiselingRecipes.PRISMARINE_BRICKS).build();
    public static final RechiseledBlockType PRISMARINE_BRICKS_CHISELED_CIRCLES = create("prismarine_bricks_chiseled_circles", "Chiseled Prismarine Brick Circles", () -> Blocks.PRISMARINE).recipe(BaseChiselingRecipes.PRISMARINE_BRICKS).build();
    public static final RechiseledBlockType PRISMARINE_BRICKS_CHISELED_SQUARES = create("prismarine_bricks_chiseled_squares", "Chiseled Prismarine Brick Squares", () -> Blocks.PRISMARINE).recipe(BaseChiselingRecipes.PRISMARINE_BRICKS).build();
    public static final RechiseledBlockType PRISMARINE_BRICKS_DIAGONAL_BRICKS = create("prismarine_bricks_diagonal_bricks", "Diagonal Prismarine Bricks", () -> Blocks.PRISMARINE).recipe(BaseChiselingRecipes.PRISMARINE_BRICKS).build();
    public static final RechiseledBlockType PRISMARINE_BRICKS_DIAGONAL_TILES = create("prismarine_bricks_diagonal_tiles", "Diagonal Prismarine Brick Tiles", () -> Blocks.PRISMARINE).recipe(BaseChiselingRecipes.PRISMARINE_BRICKS).build();
    public static final RechiseledBlockType PRISMARINE_BRICKS_DOTTED = create("prismarine_bricks_dotted", "Dotted Prismarine Bricks", () -> Blocks.PRISMARINE).recipe(BaseChiselingRecipes.PRISMARINE_BRICKS).build();
    public static final RechiseledBlockType PRISMARINE_BRICKS_PILLARS = create("prismarine_bricks_pillars", "Prismarine Brick Pillars", () -> Blocks.PRISMARINE).recipe(BaseChiselingRecipes.PRISMARINE_BRICKS).build();
    public static final RechiseledBlockType PRISMARINE_BRICKS_POLISHED = create("prismarine_bricks_polished", "Polished Prismarine Bricks", () -> Blocks.PRISMARINE).recipe(BaseChiselingRecipes.PRISMARINE_BRICKS).build();
    public static final RechiseledBlockType PRISMARINE_BRICKS_ROTATED_BRICKS = create("prismarine_bricks_rotated_bricks", "Rotated Prismarine Bricks", () -> Blocks.PRISMARINE).recipe(BaseChiselingRecipes.PRISMARINE_BRICKS).build();
    public static final RechiseledBlockType PRISMARINE_BRICKS_ROWS = create("prismarine_bricks_rows", "Prismarine Brick Rows", () -> Blocks.PRISMARINE).recipe(BaseChiselingRecipes.PRISMARINE_BRICKS).build();
    public static final RechiseledBlockType PRISMARINE_BRICKS_SMALL_TILES = create("prismarine_bricks_small_tiles", "Small Prismarine Brick Tiles", () -> Blocks.PRISMARINE).recipe(BaseChiselingRecipes.PRISMARINE_BRICKS).build();
    public static final RechiseledBlockType PRISMARINE_BRICKS_SQUARES = create("prismarine_bricks_squares", "Prismarine Brick Squares", () -> Blocks.PRISMARINE).recipe(BaseChiselingRecipes.PRISMARINE_BRICKS).build();
    public static final RechiseledBlockType PRISMARINE_BRICKS_TILES = create("prismarine_bricks_tiles", "Prismarine Brick Tiles", () -> Blocks.PRISMARINE).recipe(BaseChiselingRecipes.PRISMARINE_BRICKS).build();
    public static final RechiseledBlockType PRISMARINE_BRICKS_WAVY = create("prismarine_bricks_wavy", "Wavy Prismarine Bricks", () -> Blocks.PRISMARINE).recipe(BaseChiselingRecipes.PRISMARINE_BRICKS).build();
    public static final RechiseledBlockType PRISMARINE_BRICKS_WOVEN = create("prismarine_bricks_woven", "Woven Prismarine Bricks", () -> Blocks.PRISMARINE).recipe(BaseChiselingRecipes.PRISMARINE_BRICKS).build();
    // Purpur
    public static final RechiseledBlockType PURPUR_BRICK_PATTERN = create("purpur_brick_pattern", "Purpur Brick Pattern", () -> Blocks.PURPUR_BLOCK).recipe(BaseChiselingRecipes.PURPUR_BLOCK).build();
    public static final RechiseledBlockType PURPUR_BRICK_PAVING = create("purpur_brick_paving", "Purpur Brick Paving", () -> Blocks.PURPUR_BLOCK).recipe(BaseChiselingRecipes.PURPUR_BLOCK).build();
    public static final RechiseledBlockType PURPUR_BRICKS = create("purpur_bricks", "Purpur Bricks", () -> Blocks.PURPUR_BLOCK).recipe(BaseChiselingRecipes.PURPUR_BLOCK).build();
    public static final RechiseledBlockType PURPUR_DIAGONAL_BRICKS = create("purpur_diagonal_bricks", "Diagonal Purpur Bricks", () -> Blocks.PURPUR_BLOCK).recipe(BaseChiselingRecipes.PURPUR_BLOCK).build();
    public static final RechiseledBlockType PURPUR_DIAGONAL_TILES = create("purpur_diagonal_tiles", "Diagonal Purpur Tiles", () -> Blocks.PURPUR_BLOCK).recipe(BaseChiselingRecipes.PURPUR_BLOCK).build();
    public static final RechiseledBlockType PURPUR_DOTTED = create("purpur_dotted", "Dotted Purpur Block", () -> Blocks.PURPUR_BLOCK).recipe(BaseChiselingRecipes.PURPUR_BLOCK).build();
    public static final RechiseledBlockType PURPUR_FABRIC = create("purpur_fabric", "Purpur Fabric", () -> Blocks.PURPUR_BLOCK).recipe(BaseChiselingRecipes.PURPUR_BLOCK).build();
    public static final RechiseledBlockType PURPUR_JAGGED_PATTERN = create("purpur_jagged_pattern", "Jagged Purpur Pattern", () -> Blocks.PURPUR_BLOCK).recipe(BaseChiselingRecipes.PURPUR_BLOCK).build();
    public static final RechiseledBlockType PURPUR_LARGE_TILES = create("purpur_large_tiles", "Large Purpur Tiles", () -> Blocks.PURPUR_BLOCK).recipe(BaseChiselingRecipes.PURPUR_BLOCK).build();
    public static final RechiseledBlockType PURPUR_ORGANIC_PATTERN = create("purpur_organic_pattern", "Organic Purpur Pattern", () -> Blocks.PURPUR_BLOCK).recipe(BaseChiselingRecipes.PURPUR_BLOCK).build();
    public static final RechiseledBlockType PURPUR_PILLAR = create("purpur_pillar", "Sided Purpur Pillar", () -> Blocks.PURPUR_BLOCK).recipe(BaseChiselingRecipes.PURPUR_BLOCK).build();
    public static final RechiseledBlockType PURPUR_ROTATED_BRICKS = create("purpur_rotated_bricks", "Rotated Purpur Bricks", () -> Blocks.PURPUR_BLOCK).recipe(BaseChiselingRecipes.PURPUR_BLOCK).build();
    public static final RechiseledBlockType PURPUR_SLANTED_TILES = create("purpur_slanted_tiles", "Slanted Purpur Tiles", () -> Blocks.PURPUR_BLOCK).recipe(BaseChiselingRecipes.PURPUR_BLOCK).build();
    public static final RechiseledBlockType PURPUR_SMALL_TILES = create("purpur_small_tiles", "Small Purpur Tiles", () -> Blocks.PURPUR_BLOCK).recipe(BaseChiselingRecipes.PURPUR_BLOCK).build();
    public static final RechiseledBlockType PURPUR_SPIRAL_PATTERN = create("purpur_spiral_pattern", "Spiral Purpur Pattern", () -> Blocks.PURPUR_BLOCK).recipe(BaseChiselingRecipes.PURPUR_BLOCK).build();
    public static final RechiseledBlockType PURPUR_SQUARES = create("purpur_squares", "Purpur Squares", () -> Blocks.PURPUR_BLOCK).recipe(BaseChiselingRecipes.PURPUR_BLOCK).build();
    public static final RechiseledBlockType PURPUR_TILES = create("purpur_tiles", "Purpur Block", () -> Blocks.PURPUR_BLOCK).regularVariant(() -> Blocks.PURPUR_BLOCK, 0).recipe(BaseChiselingRecipes.PURPUR_BLOCK).build();
    public static final RechiseledBlockType PURPUR_WOVEN = create("purpur_woven", "Woven Purpur Block", () -> Blocks.PURPUR_BLOCK).recipe(BaseChiselingRecipes.PURPUR_BLOCK).build();
    // Quartz block
    public static final RechiseledBlockType QUARTZ_BLOCK_BORDERED = create("quartz_block_bordered", "Bordered Quartz Block", () -> Blocks.QUARTZ_BLOCK).recipe(BaseChiselingRecipes.QUARTZ_BLOCK).build();
    public static final RechiseledBlockType QUARTZ_BLOCK_BRICK_PAVING = create("quartz_block_brick_paving", "Quartz Brick Paving", () -> Blocks.QUARTZ_BLOCK).recipe(BaseChiselingRecipes.QUARTZ_BLOCK).build();
    public static final RechiseledBlockType QUARTZ_BLOCK_CHISELED_PILLAR = create("quartz_block_chiseled_pillar", "Chiseled Quartz Pillar", () -> Blocks.QUARTZ_BLOCK).recipe(BaseChiselingRecipes.QUARTZ_BLOCK).build();
    public static final RechiseledBlockType QUARTZ_BLOCK_CHISELED_SQUARES = create("quartz_block_chiseled_squares", "Chiseled Quartz Block Squares", () -> Blocks.QUARTZ_BLOCK).noConnectingVariant().recipe(BaseChiselingRecipes.QUARTZ_BLOCK).build();
    public static final RechiseledBlockType QUARTZ_BLOCK_CONNECTING = create("quartz_block_connecting", "Quartz Block", () -> Blocks.QUARTZ_BLOCK).regularVariant(() -> Blocks.QUARTZ_BLOCK, 0).recipe(BaseChiselingRecipes.QUARTZ_BLOCK).build();
    public static final RechiseledBlockType QUARTZ_BLOCK_CROSSES = create("quartz_block_crosses", "Quartz Block Crosses", () -> Blocks.QUARTZ_BLOCK).recipe(BaseChiselingRecipes.QUARTZ_BLOCK).build();
    public static final RechiseledBlockType QUARTZ_BLOCK_DIAGONAL_TILES = create("quartz_block_diagonal_tiles", "Quartz Block", () -> Blocks.QUARTZ_BLOCK).recipe(BaseChiselingRecipes.QUARTZ_BLOCK).build();
    public static final RechiseledBlockType QUARTZ_BLOCK_PATTERN = create("quartz_block_pattern", "Quartz Block Pattern", () -> Blocks.QUARTZ_BLOCK).recipe(BaseChiselingRecipes.QUARTZ_BLOCK).build();
    public static final RechiseledBlockType QUARTZ_BLOCK_ROTATED_BRICKS = create("quartz_block_rotated_bricks", "Rotated Quartz Bricks", () -> Blocks.QUARTZ_BLOCK).recipe(BaseChiselingRecipes.QUARTZ_BLOCK).build();
    public static final RechiseledBlockType QUARTZ_BLOCK_ROWS = create("quartz_block_rows", "Quartz Block Rows", () -> Blocks.QUARTZ_BLOCK).recipe(BaseChiselingRecipes.QUARTZ_BLOCK).build();
    public static final RechiseledBlockType QUARTZ_BLOCK_SCALES = create("quartz_block_scales", "Quartz Block Scales", () -> Blocks.QUARTZ_BLOCK).recipe(BaseChiselingRecipes.QUARTZ_BLOCK).build();
    public static final RechiseledBlockType QUARTZ_BLOCK_SMALL_TILES = create("quartz_block_small_tiles", "Small Quartz Block Tiles", () -> Blocks.QUARTZ_BLOCK).recipe(BaseChiselingRecipes.QUARTZ_BLOCK).build();
    public static final RechiseledBlockType QUARTZ_BLOCK_SQUARES = create("quartz_block_squares", "Quartz Block Squares", () -> Blocks.QUARTZ_BLOCK).recipe(BaseChiselingRecipes.QUARTZ_BLOCK).build();
    public static final RechiseledBlockType QUARTZ_BLOCK_STRIPES = create("quartz_block_stripes", "Quartz Block Stripes", () -> Blocks.QUARTZ_BLOCK).recipe(BaseChiselingRecipes.QUARTZ_BLOCK).build();
    public static final RechiseledBlockType QUARTZ_BLOCK_TILES = create("quartz_block_tiles", "Quartz Block Tiles", () -> Blocks.QUARTZ_BLOCK).recipe(BaseChiselingRecipes.QUARTZ_BLOCK).build();
    // Red nether bricks
    public static final RechiseledBlockType RED_NETHER_BRICKS_BEAMS = create("red_nether_bricks_beams", "Red Nether Brick Beams", () -> Blocks.RED_NETHER_BRICK).recipe(BaseChiselingRecipes.RED_NETHER_BRICKS).build();
    public static final RechiseledBlockType RED_NETHER_BRICKS_BRICK_PATTERN = create("red_nether_bricks_brick_pattern", "Red Nether Brick Pattern", () -> Blocks.RED_NETHER_BRICK).recipe(BaseChiselingRecipes.RED_NETHER_BRICKS).build();
    public static final RechiseledBlockType RED_NETHER_BRICKS_BRICK_PAVING = create("red_nether_bricks_brick_paving", "Red Nether Brick Paving", () -> Blocks.RED_NETHER_BRICK).recipe(BaseChiselingRecipes.RED_NETHER_BRICKS).build();
    public static final RechiseledBlockType RED_NETHER_BRICKS_CHISELED_SQUARES = create("red_nether_bricks_chiseled_squares", "Chiseled Red Nether Brick Squares", () -> Blocks.RED_NETHER_BRICK).recipe(BaseChiselingRecipes.RED_NETHER_BRICKS).build();
    public static final RechiseledBlockType RED_NETHER_BRICKS_DIAGONAL_BRICKS = create("red_nether_bricks_diagonal_bricks", "Diagonal Red Nether Bricks", () -> Blocks.RED_NETHER_BRICK).recipe(BaseChiselingRecipes.RED_NETHER_BRICKS).build();
    public static final RechiseledBlockType RED_NETHER_BRICKS_LARGE_BRICKS = create("red_nether_bricks_large_bricks", "Large Red Nether Bricks", () -> Blocks.RED_NETHER_BRICK).recipe(BaseChiselingRecipes.RED_NETHER_BRICKS).build();
    public static final RechiseledBlockType RED_NETHER_BRICKS_LARGE_TILES = create("red_nether_bricks_large_tiles", "Large Red Nether Brick Tiles", () -> Blocks.RED_NETHER_BRICK).recipe(BaseChiselingRecipes.RED_NETHER_BRICKS).build();
    public static final RechiseledBlockType RED_NETHER_BRICKS_ROTATED_BRICKS = create("red_nether_bricks_rotated_bricks", "Rotated Red Nether Bricks", () -> Blocks.RED_NETHER_BRICK).recipe(BaseChiselingRecipes.RED_NETHER_BRICKS).build();
    public static final RechiseledBlockType RED_NETHER_BRICKS_SMALL_TILES = create("red_nether_bricks_small_tiles", "Small Red Nether Brick Tiles", () -> Blocks.RED_NETHER_BRICK).recipe(BaseChiselingRecipes.RED_NETHER_BRICKS).build();
    public static final RechiseledBlockType RED_NETHER_BRICKS_SMOOTH = create("red_nether_bricks_smooth", "Red Nether Bricks Smooth", () -> Blocks.RED_NETHER_BRICK).recipe(BaseChiselingRecipes.RED_NETHER_BRICKS).build();
    public static final RechiseledBlockType RED_NETHER_BRICKS_SQUARES = create("red_nether_bricks_squares", "Red Nether Brick Squares", () -> Blocks.RED_NETHER_BRICK).recipe(BaseChiselingRecipes.RED_NETHER_BRICKS).build();
    public static final RechiseledBlockType RED_NETHER_BRICKS_TILES = create("red_nether_bricks_tiles", "Red Nether Brick Tiles", () -> Blocks.RED_NETHER_BRICK).recipe(BaseChiselingRecipes.RED_NETHER_BRICKS).build();
    // Red sandstone
    public static final RechiseledBlockType RED_SANDSTONE_BRICK_PATTERN = create("red_sandstone_brick_pattern", "Red Sandstone Brick Pattern", () -> Blocks.RED_SANDSTONE).recipe(BaseChiselingRecipes.RED_SANDSTONE).build();
    public static final RechiseledBlockType RED_SANDSTONE_BRICK_PAVING = create("red_sandstone_brick_paving", "Red Sandstone Brick Paving", () -> Blocks.RED_SANDSTONE).recipe(BaseChiselingRecipes.RED_SANDSTONE).build();
    public static final RechiseledBlockType RED_SANDSTONE_BRICKS = create("red_sandstone_bricks", "Red Sandstone Bricks", () -> Blocks.RED_SANDSTONE).recipe(BaseChiselingRecipes.RED_SANDSTONE).build();
    public static final RechiseledBlockType RED_SANDSTONE_DIAGONAL_BRICKS = create("red_sandstone_diagonal_bricks", "Diagonal Red Sandstone Bricks", () -> Blocks.RED_SANDSTONE).recipe(BaseChiselingRecipes.RED_SANDSTONE).build();
    public static final RechiseledBlockType RED_SANDSTONE_LARGE_TILES = create("red_sandstone_large_tiles", "Large Red Sandstone Tiles", () -> Blocks.RED_SANDSTONE).recipe(BaseChiselingRecipes.RED_SANDSTONE).build();
    public static final RechiseledBlockType RED_SANDSTONE_POLISHED = create("red_sandstone_polished", "Polished Red Sandstone", () -> Blocks.RED_SANDSTONE).recipe(BaseChiselingRecipes.RED_SANDSTONE).build();
    public static final RechiseledBlockType RED_SANDSTONE_ROTATED_BRICKS = create("red_sandstone_rotated_bricks", "Rotated Red Sandstone Bricks", () -> Blocks.RED_SANDSTONE).recipe(BaseChiselingRecipes.RED_SANDSTONE).build();
    public static final RechiseledBlockType RED_SANDSTONE_TILES = create("red_sandstone_tiles", "Red Sandstone Tiles", () -> Blocks.RED_SANDSTONE).recipe(BaseChiselingRecipes.RED_SANDSTONE).build();
    // Redstone block
    public static final RechiseledBlockType REDSTONE_BLOCK_BORDERED = create("redstone_block_bordered", "Bordered Block of Redstone", () -> Blocks.REDSTONE_BLOCK).recipe(BaseChiselingRecipes.REDSTONE_BLOCK).build();
    public static final RechiseledBlockType REDSTONE_BLOCK_BRICKS = create("redstone_block_bricks", "Redstone Block Bricks", () -> Blocks.REDSTONE_BLOCK).recipe(BaseChiselingRecipes.REDSTONE_BLOCK).build();
    public static final RechiseledBlockType REDSTONE_BLOCK_BRICK_BORDERED = create("redstone_block_brick_bordered", "Brick Bordered Block of Redstone", () -> Blocks.REDSTONE_BLOCK).noConnectingVariant().recipe(BaseChiselingRecipes.REDSTONE_BLOCK).build();
    public static final RechiseledBlockType REDSTONE_BLOCK_CHISELED_CLOVERS = create("redstone_block_chiseled_clovers", "Chiseled Redstone Block Clovers", () -> Blocks.REDSTONE_BLOCK).recipe(BaseChiselingRecipes.REDSTONE_BLOCK).build();
    public static final RechiseledBlockType REDSTONE_BLOCK_CIRCLES = create("redstone_block_circles", "Redstone Block Circles", () -> Blocks.REDSTONE_BLOCK).recipe(BaseChiselingRecipes.REDSTONE_BLOCK).build();
    public static final RechiseledBlockType REDSTONE_BLOCK_COMPRESSED = create("redstone_block_compressed", "Compressed Block of Redstone", () -> Blocks.REDSTONE_BLOCK).recipe(BaseChiselingRecipes.REDSTONE_BLOCK).build();
    public static final RechiseledBlockType REDSTONE_BLOCK_CRUSHED = create("redstone_block_crushed", "Crushed Block of Redstone", () -> Blocks.REDSTONE_BLOCK).noConnectingVariant().recipe(BaseChiselingRecipes.REDSTONE_BLOCK).build();
    public static final RechiseledBlockType REDSTONE_BLOCK_DIAGONAL_TILES = create("redstone_block_diagonal_tiles", "Diagonal Redstone Block Tiles", () -> Blocks.REDSTONE_BLOCK).recipe(BaseChiselingRecipes.REDSTONE_BLOCK).build();
    public static final RechiseledBlockType REDSTONE_BLOCK_PATTERNED = create("redstone_block_patterned", "Patterned Block of Redstone", () -> Blocks.REDSTONE_BLOCK).recipe(BaseChiselingRecipes.REDSTONE_BLOCK).build();
    public static final RechiseledBlockType REDSTONE_BLOCK_PAVING = create("redstone_block_paving", "Redstone Block Paving", () -> Blocks.REDSTONE_BLOCK).recipe(BaseChiselingRecipes.REDSTONE_BLOCK).build();
    public static final RechiseledBlockType REDSTONE_BLOCK_PILLAR = create("redstone_block_pillar", "Redstone Block Pillar", () -> Blocks.REDSTONE_BLOCK).specification(BlockSpecification.PILLAR).recipe(BaseChiselingRecipes.REDSTONE_BLOCK).build();
    public static final RechiseledBlockType REDSTONE_BLOCK_POLISHED = create("redstone_block_polished", "Polished Block of Redstone", () -> Blocks.REDSTONE_BLOCK).recipe(BaseChiselingRecipes.REDSTONE_BLOCK).build();
    public static final RechiseledBlockType REDSTONE_BLOCK_SCALES = create("redstone_block_scales", "Redstone Block Scales", () -> Blocks.REDSTONE_BLOCK).recipe(BaseChiselingRecipes.REDSTONE_BLOCK).build();
    public static final RechiseledBlockType REDSTONE_BLOCK_SMALL_TILES = create("redstone_block_small_tiles", "Small Redstone Block Tiles", () -> Blocks.REDSTONE_BLOCK).recipe(BaseChiselingRecipes.REDSTONE_BLOCK).build();
    public static final RechiseledBlockType REDSTONE_BLOCK_SMOOTH = create("redstone_block_smooth", "Smooth Block of Redstone", () -> Blocks.REDSTONE_BLOCK).noConnectingVariant().recipe(BaseChiselingRecipes.REDSTONE_BLOCK).build();
    // Sandstone
    public static final RechiseledBlockType SANDSTONE_BRICK_PATTERN = create("sandstone_brick_pattern", "Sandstone Brick Pattern", () -> Blocks.SANDSTONE).recipe(BaseChiselingRecipes.SANDSTONE).build();
    public static final RechiseledBlockType SANDSTONE_BRICK_PAVING = create("sandstone_brick_paving", "Sandstone Brick Paving", () -> Blocks.SANDSTONE).recipe(BaseChiselingRecipes.SANDSTONE).build();
    public static final RechiseledBlockType SANDSTONE_BRICKS = create("sandstone_bricks", "Sandstone Bricks", () -> Blocks.SANDSTONE).recipe(BaseChiselingRecipes.SANDSTONE).build();
    public static final RechiseledBlockType SANDSTONE_DIAGONAL_BRICKS = create("sandstone_diagonal_bricks", "Diagonal Sandstone Bricks", () -> Blocks.SANDSTONE).recipe(BaseChiselingRecipes.SANDSTONE).build();
    public static final RechiseledBlockType SANDSTONE_LARGE_TILES = create("sandstone_large_tiles", "Large Sandstone Tiles", () -> Blocks.SANDSTONE).recipe(BaseChiselingRecipes.SANDSTONE).build();
    public static final RechiseledBlockType SANDSTONE_POLISHED = create("sandstone_polished", "Polished Sandstone", () -> Blocks.SANDSTONE).recipe(BaseChiselingRecipes.SANDSTONE).build();
    public static final RechiseledBlockType SANDSTONE_ROTATED_BRICKS = create("sandstone_rotated_bricks", "Rotated Sandstone Bricks", () -> Blocks.SANDSTONE).recipe(BaseChiselingRecipes.SANDSTONE).build();
    public static final RechiseledBlockType SANDSTONE_TILES = create("sandstone_tiles", "Sandstone Tiles", () -> Blocks.SANDSTONE).recipe(BaseChiselingRecipes.SANDSTONE).build();
    // Spruce planks
    public static final RechiseledBlockType SPRUCE_PLANKS_BEAMS = create("spruce_planks_beams", "Spruce Plank Beams", () -> Blocks.PLANKS, BlockPlanks.EnumType.SPRUCE).recipe(BaseChiselingRecipes.SPRUCE_PLANKS).build();
    public static final RechiseledBlockType SPRUCE_PLANKS_BRICK_PATTERN = create("spruce_planks_brick_pattern", "Spruce Plank Brick Pattern", () -> Blocks.PLANKS, BlockPlanks.EnumType.SPRUCE).recipe(BaseChiselingRecipes.SPRUCE_PLANKS).build();
    public static final RechiseledBlockType SPRUCE_PLANKS_BRICK_PAVING = create("spruce_planks_brick_paving", "Spruce Plank Brick Paving", () -> Blocks.PLANKS, BlockPlanks.EnumType.SPRUCE).recipe(BaseChiselingRecipes.SPRUCE_PLANKS).build();
    public static final RechiseledBlockType SPRUCE_PLANKS_BRICKS = create("spruce_planks_bricks", "Spruce Plank Bricks", () -> Blocks.PLANKS, BlockPlanks.EnumType.SPRUCE).recipe(BaseChiselingRecipes.SPRUCE_PLANKS).build();
    public static final RechiseledBlockType SPRUCE_PLANKS_CRATE = create("spruce_planks_crate", "Spruce Planks Crate", () -> Blocks.PLANKS, BlockPlanks.EnumType.SPRUCE).recipe(BaseChiselingRecipes.SPRUCE_PLANKS).build();
    public static final RechiseledBlockType SPRUCE_PLANKS_DIAGONAL_STRIPES = create("spruce_planks_diagonal_stripes", "Diagonal Spruce Plank Stripes", () -> Blocks.PLANKS, BlockPlanks.EnumType.SPRUCE).recipe(BaseChiselingRecipes.SPRUCE_PLANKS).build();
    public static final RechiseledBlockType SPRUCE_PLANKS_DIAGONAL_TILES = create("spruce_planks_diagonal_tiles", "Diagonal Spruce Plank Tiles", () -> Blocks.PLANKS, BlockPlanks.EnumType.SPRUCE).recipe(BaseChiselingRecipes.SPRUCE_PLANKS).build();
    public static final RechiseledBlockType SPRUCE_PLANKS_DOTTED = create("spruce_planks_dotted", "Dotted Spruce Planks", () -> Blocks.PLANKS, BlockPlanks.EnumType.SPRUCE).recipe(BaseChiselingRecipes.SPRUCE_PLANKS).build();
    public static final RechiseledBlockType SPRUCE_PLANKS_FLOORING = create("spruce_planks_flooring", "Spruce Plank Flooring", () -> Blocks.PLANKS, BlockPlanks.EnumType.SPRUCE).recipe(BaseChiselingRecipes.SPRUCE_PLANKS).build();
    public static final RechiseledBlockType SPRUCE_PLANKS_LARGE_TILES = create("spruce_planks_large_tiles", "Large Spruce Plank Tiles", () -> Blocks.PLANKS, BlockPlanks.EnumType.SPRUCE).recipe(BaseChiselingRecipes.SPRUCE_PLANKS).build();
    public static final RechiseledBlockType SPRUCE_PLANKS_MOSAIC = create("spruce_planks_mosaic", "Spruce Plank Mosaic", () -> Blocks.PLANKS, BlockPlanks.EnumType.SPRUCE).noConnectingVariant().recipe(BaseChiselingRecipes.SPRUCE_PLANKS).build();
    public static final RechiseledBlockType SPRUCE_PLANKS_PATTERN = create("spruce_planks_pattern", "Spruce Plank Pattern", () -> Blocks.PLANKS, BlockPlanks.EnumType.SPRUCE).recipe(BaseChiselingRecipes.SPRUCE_PLANKS).build();
    public static final RechiseledBlockType SPRUCE_PLANKS_ROTATED_BRICKS = create("spruce_planks_rotated_bricks", "Rotated Spruce Plank Bricks", () -> Blocks.PLANKS, BlockPlanks.EnumType.SPRUCE).recipe(BaseChiselingRecipes.SPRUCE_PLANKS).build();
    public static final RechiseledBlockType SPRUCE_PLANKS_SMALL_BRICKS = create("spruce_planks_small_bricks", "Small Spruce Plank Bricks", () -> Blocks.PLANKS, BlockPlanks.EnumType.SPRUCE).recipe(BaseChiselingRecipes.SPRUCE_PLANKS).build();
    public static final RechiseledBlockType SPRUCE_PLANKS_SMALL_TILES = create("spruce_planks_small_tiles", "Small Spruce Plank Tiles", () -> Blocks.PLANKS, BlockPlanks.EnumType.SPRUCE).recipe(BaseChiselingRecipes.SPRUCE_PLANKS).build();
    public static final RechiseledBlockType SPRUCE_PLANKS_SQUARES = create("spruce_planks_squares", "Spruce Plank Squares", () -> Blocks.PLANKS, BlockPlanks.EnumType.SPRUCE).recipe(BaseChiselingRecipes.SPRUCE_PLANKS).build();
    public static final RechiseledBlockType SPRUCE_PLANKS_TILES = create("spruce_planks_tiles", "Spruce Plank Tiles", () -> Blocks.PLANKS, BlockPlanks.EnumType.SPRUCE).recipe(BaseChiselingRecipes.SPRUCE_PLANKS).build();
    public static final RechiseledBlockType SPRUCE_PLANKS_WAVY = create("spruce_planks_wavy", "Wavy Spruce Planks", () -> Blocks.PLANKS, BlockPlanks.EnumType.SPRUCE).recipe(BaseChiselingRecipes.SPRUCE_PLANKS).build();
    public static final RechiseledBlockType SPRUCE_PLANKS_WOVEN = create("spruce_planks_woven", "Woven Spruce Planks", () -> Blocks.PLANKS, BlockPlanks.EnumType.SPRUCE).recipe(BaseChiselingRecipes.SPRUCE_PLANKS).build();
    // Stone
    public static final RechiseledBlockType STONE_BIG_TILES = create("stone_big_tiles", "Large Stone Tiles", () -> Blocks.STONE).recipe(BaseChiselingRecipes.STONE).build();
    public static final RechiseledBlockType STONE_BORDERED = create("stone_bordered", "Bordered Stone", () -> Blocks.STONE).recipe(BaseChiselingRecipes.STONE).build();
    public static final RechiseledBlockType STONE_BRICK_PATTERN = create("stone_brick_pattern", "Stone Brick Pattern", () -> Blocks.STONE).recipe(BaseChiselingRecipes.STONE).build();
    public static final RechiseledBlockType STONE_BRICK_PAVING = create("stone_brick_paving", "Stone Brick Paving", () -> Blocks.STONE).recipe(BaseChiselingRecipes.STONE).build();
    public static final RechiseledBlockType STONE_CHISELED_BRICKS = create("stone_chiseled_bricks", "Chiseled Stone Bricks", () -> Blocks.STONEBRICK).recipe(BaseChiselingRecipes.STONE).build();
    public static final RechiseledBlockType STONE_COBBLED = create("stone_cobbled", "Cobbled Stone", () -> Blocks.STONE).noConnectingVariant().recipe(BaseChiselingRecipes.STONE).build();
    public static final RechiseledBlockType STONE_CRUSHED = create("stone_crushed", "Crushed Stone", () -> Blocks.STONE).recipe(BaseChiselingRecipes.STONE).build();
    public static final RechiseledBlockType STONE_DIAGONAL_BRICKS = create("stone_diagonal_bricks", "Diagonal Stone Bricks", () -> Blocks.STONE).recipe(BaseChiselingRecipes.STONE).build();
    public static final RechiseledBlockType STONE_PATH = create("stone_path", "Stone Path", () -> Blocks.STONE).recipe(BaseChiselingRecipes.STONE).build();
    public static final RechiseledBlockType STONE_ROTATED_BRICKS = create("stone_rotated_bricks", "Rotated Stone Bricks", () -> Blocks.STONE).recipe(BaseChiselingRecipes.STONE).build();
    public static final RechiseledBlockType STONE_SLATED = create("stone_slated", "Slated Stone", () -> Blocks.STONE).specification(BlockSpecification.PILLAR).noConnectingVariant().recipe(BaseChiselingRecipes.STONE).build();
    public static final RechiseledBlockType STONE_SMALL_BRICKS = create("stone_small_bricks", "Small Stone Bricks", () -> Blocks.STONEBRICK).recipe(BaseChiselingRecipes.STONE).build();
    public static final RechiseledBlockType STONE_SMALL_TILES = create("stone_small_tiles", "Small Stone Tiles", () -> Blocks.STONE).recipe(BaseChiselingRecipes.STONE).build();
    public static final RechiseledBlockType STONE_SMOOTH = create("stone_smooth", "Smooth Stone", () -> Blocks.STONE).recipe(BaseChiselingRecipes.STONE).build();
    public static final RechiseledBlockType STONE_SMOOTH_BRICK_PAVING = create("stone_smooth_brick_paving", "Smooth Stone Brick Paving", () -> Blocks.STONE).recipe(BaseChiselingRecipes.STONE).build();
    public static final RechiseledBlockType STONE_SMOOTH_LARGE_TILES = create("stone_smooth_large_tiles", "Large Smooth Stone Tiles", () -> Blocks.STONE).recipe(BaseChiselingRecipes.STONE).build();
    public static final RechiseledBlockType STONE_SMOOTH_ROTATED_BRICKS = create("stone_smooth_rotated_bricks", "Rotated Smooth Stone Bricks", () -> Blocks.STONE).recipe(BaseChiselingRecipes.STONE).build();
    public static final RechiseledBlockType STONE_SMOOTH_TILES = create("stone_smooth_tiles", "Smooth Stone Tiles", () -> Blocks.STONE).recipe(BaseChiselingRecipes.STONE).build();
    public static final RechiseledBlockType STONE_SQUARES = create("stone_squares", "Stone Squares", () -> Blocks.STONE).recipe(BaseChiselingRecipes.STONE).build();
    public static final RechiseledBlockType STONE_TILES = create("stone_tiles", "Stone Tiles", () -> Blocks.STONE).recipe(BaseChiselingRecipes.STONE).build();
    public static final RechiseledBlockType STONE_WAVES = create("stone_waves", "Stone Waves", () -> Blocks.STONE).recipe(BaseChiselingRecipes.STONE).build();

    private static RechiseledBlockBuilder create(String identifier, String translation){
        return Rechiseled.REGISTRATION.block(identifier).translation(translation);
    }

    private static RechiseledBlockBuilder create(String identifier, String translation, Supplier<Block> parent){
        return Rechiseled.REGISTRATION.block(identifier).translation(translation).copyProperties(parent).miningTagsFrom(parent);
    }
    
    private static RechiseledBlockBuilder create(String identifier, String translation, Supplier<Block> parent, BlockPlanks.EnumType plankType){
        return Rechiseled.REGISTRATION.block(identifier).translation(translation).copyProperties(parent).miningTagsFrom(parent).withPlankType(plankType);
    }

    public static void init(){
        // Cause this class to be initialized
    }
}
