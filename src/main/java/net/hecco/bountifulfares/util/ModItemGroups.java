package net.hecco.bountifulfares.util;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.hecco.bountifulfares.BountifulFares;
import net.hecco.bountifulfares.block.ModBlocks;
import net.hecco.bountifulfares.item.ModItems;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static ItemGroup BOUNTIFUL_FARES = Registry.register(Registries.ITEM_GROUP, new Identifier(BountifulFares.MOD_ID, "bountiful_fares"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.bountiful_fares"))
                    .icon(() -> new ItemStack(ModItems.PASSION_FRUIT)).entries((displayContext, entries) -> {
                        entries.add(ModBlocks.APPLE_LOG);
                        entries.add(ModBlocks.APPLE_WOOD);
                        entries.add(ModBlocks.STRIPPED_APPLE_LOG);
                        entries.add(ModBlocks.STRIPPED_APPLE_WOOD);
                        entries.add(ModBlocks.APPLE_LEAVES);
                        entries.add(ModBlocks.FLOWERING_APPLE_LEAVES);
                        entries.add(Items.APPLE);
                        entries.add(ModBlocks.APPLE_BLOCK);
                        entries.add(ModBlocks.APPLE_SAPLING);
                        entries.add(ModBlocks.ORANGE_LOG);
                        entries.add(ModBlocks.ORANGE_WOOD);
                        entries.add(ModBlocks.STRIPPED_ORANGE_LOG);
                        entries.add(ModBlocks.STRIPPED_ORANGE_WOOD);
                        entries.add(ModBlocks.ORANGE_LEAVES);
                        entries.add(ModBlocks.FLOWERING_ORANGE_LEAVES);
                        entries.add(ModItems.ORANGE);
                        entries.add(ModBlocks.ORANGE_BLOCK);
                        entries.add(ModBlocks.ORANGE_SAPLING);
                        entries.add(ModBlocks.LEMON_LOG);
                        entries.add(ModBlocks.LEMON_WOOD);
                        entries.add(ModBlocks.STRIPPED_LEMON_LOG);
                        entries.add(ModBlocks.STRIPPED_LEMON_WOOD);
                        entries.add(ModBlocks.LEMON_LEAVES);
                        entries.add(ModBlocks.FLOWERING_LEMON_LEAVES);
                        entries.add(ModItems.LEMON);
                        entries.add(ModBlocks.LEMON_BLOCK);
                        entries.add(ModBlocks.LEMON_SAPLING);
                        entries.add(ModBlocks.PLUM_LOG);
                        entries.add(ModBlocks.PLUM_WOOD);
                        entries.add(ModBlocks.STRIPPED_PLUM_LOG);
                        entries.add(ModBlocks.STRIPPED_PLUM_WOOD);
                        entries.add(ModBlocks.PLUM_LEAVES);
                        entries.add(ModBlocks.FLOWERING_PLUM_LEAVES);
                        entries.add(ModItems.PLUM);
                        entries.add(ModBlocks.PLUM_BLOCK);
                        entries.add(ModBlocks.PLUM_SAPLING);
                        entries.add(ModBlocks.GOLDEN_APPLE_BLOCK);
                        entries.add(ModBlocks.HOARY_APPLE_SAPLING);
                        entries.add(ModBlocks.HOARY_LOG);
                        entries.add(ModBlocks.HOARY_WOOD);
                        entries.add(ModBlocks.STRIPPED_HOARY_LOG);
                        entries.add(ModBlocks.STRIPPED_HOARY_WOOD);
                        entries.add(ModBlocks.HOARY_PLANKS);
                        entries.add(ModBlocks.HOARY_STAIRS);
                        entries.add(ModBlocks.HOARY_SLAB);
                        entries.add(ModBlocks.HOARY_FENCE);
                        entries.add(ModBlocks.HOARY_FENCE_GATE);
                        entries.add(ModBlocks.HOARY_DOOR);
                        entries.add(ModBlocks.HOARY_TRAPDOOR);
                        entries.add(ModBlocks.HOARY_PRESSURE_PLATE);
                        entries.add(ModBlocks.HOARY_BUTTON);
                        entries.add(ModItems.HOARY_SIGN);
                        entries.add(ModItems.HOARY_HANGING_SIGN);
                        entries.add(ModItems.HOARY_BOAT);
                        entries.add(ModItems.HOARY_CHEST_BOAT);
                        entries.add(ModBlocks.HOARY_LEAVES);
                        entries.add(ModItems.HOARY_APPLE);
                        entries.add(ModBlocks.HOARY_APPLE_BLOCK);
                        entries.add(ModBlocks.WALNUT_SAPLING);
                        entries.add(ModBlocks.WALNUT_LOG);
                        entries.add(ModBlocks.WALNUT_WOOD);
                        entries.add(ModBlocks.STRIPPED_WALNUT_LOG);
                        entries.add(ModBlocks.STRIPPED_WALNUT_WOOD);
                        entries.add(ModBlocks.WALNUT_PLANKS);
                        entries.add(ModBlocks.WALNUT_STAIRS);
                        entries.add(ModBlocks.WALNUT_SLAB);
                        entries.add(ModBlocks.WALNUT_FENCE);
                        entries.add(ModBlocks.WALNUT_FENCE_GATE);
                        entries.add(ModBlocks.WALNUT_DOOR);
                        entries.add(ModBlocks.WALNUT_TRAPDOOR);
                        entries.add(ModBlocks.WALNUT_PRESSURE_PLATE);
                        entries.add(ModBlocks.WALNUT_BUTTON);
                        entries.add(ModItems.WALNUT_SIGN);
                        entries.add(ModItems.WALNUT_HANGING_SIGN);
                        entries.add(ModItems.WALNUT_BOAT);
                        entries.add(ModItems.WALNUT_CHEST_BOAT);
                        entries.add(ModBlocks.WALNUT_LEAVES);
                        entries.add(ModItems.WALNUT);
                        entries.add(ModBlocks.WALNUT_MULCH);
                        entries.add(ModBlocks.WALNUT_MULCH_BLOCK);
                        entries.add(ModBlocks.OAK_PICKETS);
                        entries.add(ModBlocks.SPRUCE_PICKETS);
                        entries.add(ModBlocks.BIRCH_PICKETS);
                        entries.add(ModBlocks.JUNGLE_PICKETS);
                        entries.add(ModBlocks.ACACIA_PICKETS);
                        entries.add(ModBlocks.DARK_OAK_PICKETS);
                        entries.add(ModBlocks.MANGROVE_PICKETS);
                        entries.add(ModBlocks.CHERRY_PICKETS);
                        entries.add(ModBlocks.BAMBOO_PICKETS);
                        entries.add(ModBlocks.WALNUT_PICKETS);
                        entries.add(ModBlocks.HOARY_PICKETS);
                        entries.add(ModBlocks.CRIMSON_PICKETS);
                        entries.add(ModBlocks.WARPED_PICKETS);
                        entries.add(ModItems.FELDSPAR);
                        entries.add(ModBlocks.FELDSPAR_BLOCK);
                        entries.add(ModBlocks.CUT_FELDSPAR_BLOCK);
                        entries.add(ModBlocks.FELDSPAR_BRICKS);
                        entries.add(ModBlocks.FELDSPAR_BRICK_STAIRS);
                        entries.add(ModBlocks.FELDSPAR_BRICK_SLAB);
                        entries.add(ModBlocks.FELDSPAR_LANTERN);
                        entries.add(ModBlocks.TINGED_GLASS);
                        entries.add(ModItems.CERAMIC_CLAY);
                        entries.add(ModBlocks.CERAMIC_CLAY_BLOCK);
                        entries.add(ModItems.CERAMIC_TILE);
                        entries.add(ModBlocks.CERAMIC_TILES);
                        entries.add(ModBlocks.CERAMIC_TILE_STAIRS);
                        entries.add(ModBlocks.CERAMIC_TILE_SLAB);
                        entries.add(ModBlocks.CHECKERED_CERAMIC_TILES);
                        entries.add(ModBlocks.CHECKERED_CERAMIC_TILE_STAIRS);
                        entries.add(ModBlocks.CHECKERED_CERAMIC_TILE_SLAB);
                        entries.add(ModBlocks.CERAMIC_PRESSURE_PLATE);
                        entries.add(ModBlocks.CERAMIC_BUTTON);
                        entries.add(ModBlocks.CERAMIC_LEVER);
                        entries.add(ModBlocks.CERAMIC_DISH);
                        entries.add(ModItems.ARTISAN_BRUSH);
                        entries.add(ModItems.SUN_HAT);
                        entries.add(ModBlocks.WHITE_JACK_O_STRAW);
                        entries.add(ModBlocks.LIGHT_GRAY_JACK_O_STRAW);
                        entries.add(ModBlocks.GRAY_JACK_O_STRAW);
                        entries.add(ModBlocks.BLACK_JACK_O_STRAW);
                        entries.add(ModBlocks.BROWN_JACK_O_STRAW);
                        entries.add(ModBlocks.RED_JACK_O_STRAW);
                        entries.add(ModBlocks.ORANGE_JACK_O_STRAW);
                        entries.add(ModBlocks.YELLOW_JACK_O_STRAW);
                        entries.add(ModBlocks.LIME_JACK_O_STRAW);
                        entries.add(ModBlocks.GREEN_JACK_O_STRAW);
                        entries.add(ModBlocks.CYAN_JACK_O_STRAW);
                        entries.add(ModBlocks.LIGHT_BLUE_JACK_O_STRAW);
                        entries.add(ModBlocks.BLUE_JACK_O_STRAW);
                        entries.add(ModBlocks.PURPLE_JACK_O_STRAW);
                        entries.add(ModBlocks.MAGENTA_JACK_O_STRAW);
                        entries.add(ModBlocks.PINK_JACK_O_STRAW);
                        entries.add(ModBlocks.WILD_WHEAT);
                        entries.add(ModBlocks.WILD_CARROTS);
                        entries.add(ModBlocks.WILD_POTATOES);
                        entries.add(ModBlocks.WILD_BEETROOTS);
                        entries.add(ModBlocks.WILD_MAIZE);
                        entries.add(ModBlocks.WILD_LEEKS);
                        entries.add(ModBlocks.WILD_PASSION_FRUIT_VINE);
                        entries.add(ModBlocks.WILD_ELDERBERRY_VINE);
//                        entries.add(ModItems.GRASS_SEEDS);
                        entries.add(ModItems.MAIZE_SEEDS);
                        entries.add(ModItems.LEEK_SEEDS);
                        entries.add(ModItems.SPONGEKIN_SEEDS);
                        entries.add(ModItems.LAPISBERRY_SEEDS);
                        entries.add(ModItems.HOARY_SEEDS);
                        entries.add(ModItems.MAIZE);
                        entries.add(ModItems.LEEK);
                        entries.add(ModBlocks.TRELLIS);
                        entries.add(ModItems.PASSION_FRUIT);
                        entries.add(ModItems.ELDERBERRIES);
                        entries.add(ModItems.LAPISBERRIES);
                        entries.add(ModItems.TEA_BERRIES);
                        entries.add(ModItems.TEA_LEAVES);
                        entries.add(ModItems.DRIED_TEA_LEAVES);
                        entries.add(ModBlocks.CHAMOMILE_FLOWERS);
                        entries.add(ModBlocks.HONEYSUCKLE);
                        entries.add(ModBlocks.VIOLET_BELLFLOWER);
                        entries.add(ModBlocks.SPONGEKIN);
                        entries.add(ModItems.SPONGEKIN_SLICE);
                        entries.add(ModBlocks.PRISMARINE_BLOSSOM);
                        entries.add(ModBlocks.GRISTMILL);
                        entries.add(ModItems.FLOUR);
                        entries.add(ModItems.GREEN_TEA_BLEND);
                        entries.add(ModItems.BLACK_TEA_BLEND);
                        entries.add(ModItems.CHAMOMILE_TEA_BLEND);
                        entries.add(ModItems.HONEYSUCKLE_TEA_BLEND);
                        entries.add(ModItems.BELLFLOWER_TEA_BLEND);
                        entries.add(ModItems.TORCHFLOWER_TEA_BLEND);
                        entries.add(ModItems.GREEN_TEA_BOTTLE);
                        entries.add(ModItems.BLACK_TEA_BOTTLE);
                        entries.add(ModItems.CHAMOMILE_TEA_BOTTLE);
                        entries.add(ModItems.HONEYSUCKLE_TEA_BOTTLE);
                        entries.add(ModItems.BELLFLOWER_TEA_BOTTLE);
                        entries.add(ModItems.TORCHFLOWER_TEA_BOTTLE);
                        entries.add(ModBlocks.GREEN_TEA_CANDLE);
                        entries.add(ModBlocks.BLACK_TEA_CANDLE);
                        entries.add(ModBlocks.CHAMOMILE_CANDLE);
                        entries.add(ModBlocks.HONEYSUCKLE_CANDLE);
                        entries.add(ModBlocks.BELLFLOWER_CANDLE);
                        entries.add(ModBlocks.TORCHFLOWER_CANDLE);
                        entries.add(ModBlocks.WALNUT_CANDLE);
                        entries.add(ModBlocks.FERMENTATION_VESSEL);
                        entries.add(ModItems.ELDERBERRY_WINE_BOTTLE);
                        entries.add(ModItems.LAPISBERRY_WINE_BOTTLE);
                        entries.add(ModItems.MEAD_BOTTLE);
                        entries.add(ModItems.JAR);
                        entries.add(ModItems.APPLE_CIDER_JAR);
                        entries.add(ModItems.PLUM_CIDER_JAR);
                        entries.add(ModItems.HOARY_CIDER_JAR);
                        entries.add(ModItems.APPLE_COMPOTE_JAR);
                        entries.add(ModItems.ORANGE_COMPOTE_JAR);
                        entries.add(ModItems.LEMON_COMPOTE_JAR);
                        entries.add(ModItems.PLUM_COMPOTE_JAR);
                        entries.add(ModItems.HOARY_COMPOTE_JAR);
                        entries.add(ModItems.CITRUS_ESSENCE);
//                        if (FabricLoader.getInstance().isModLoaded(BountifulFares.ELS_AND_LS_DYES_MOD_ID)) {
//                            entries.add(ModBlocks.WHITE_JACK_O_STRAW);
//                            entries.add(ModBlocks.LIGHT_GRAY_JACK_O_STRAW);
//                            entries.add(ModBlocks.GRAY_JACK_O_STRAW);
//                            entries.add(ModBlocks.BLACK_JACK_O_STRAW);
//                            entries.add(ModBlocks.ACORN_JACK_O_STRAW);
//                            entries.add(ModBlocks.BROWN_JACK_O_STRAW);
//                            entries.add(ModBlocks.MAROON_JACK_O_STRAW);
//                            entries.add(ModBlocks.RED_JACK_O_STRAW);
//                            entries.add(ModBlocks.PEACH_JACK_O_STRAW);
//                            entries.add(ModBlocks.VERMILION_JACK_O_STRAW);
//                            entries.add(ModBlocks.ORANGE_JACK_O_STRAW);
//                            entries.add(ModBlocks.AMBER_JACK_O_STRAW);
//                            entries.add(ModBlocks.YELLOW_JACK_O_STRAW);
//                            entries.add(ModBlocks.BANANA_JACK_O_STRAW);
//                            entries.add(ModBlocks.ARTICHOKE_JACK_O_STRAW);
//                            entries.add(ModBlocks.MOLD_JACK_O_STRAW);
//                            entries.add(ModBlocks.LIME_JACK_O_STRAW);
//                            entries.add(ModBlocks.SAGE_JACK_O_STRAW);
//                            entries.add(ModBlocks.SAP_JACK_O_STRAW);
//                            entries.add(ModBlocks.GREEN_JACK_O_STRAW);
//                            entries.add(ModBlocks.SHAMROCK_JACK_O_STRAW);
//                            entries.add(ModBlocks.MINT_JACK_O_STRAW);
//                            entries.add(ModBlocks.CYAN_JACK_O_STRAW);
//                            entries.add(ModBlocks.CERULEAN_JACK_O_STRAW);
//                            entries.add(ModBlocks.LIGHT_BLUE_JACK_O_STRAW);
//                            entries.add(ModBlocks.NAVY_JACK_O_STRAW);
//                            entries.add(ModBlocks.BLUE_JACK_O_STRAW);
//                            entries.add(ModBlocks.PERIWINKLE_JACK_O_STRAW);
//                            entries.add(ModBlocks.GRAPE_JACK_O_STRAW);
//                            entries.add(ModBlocks.PURPLE_JACK_O_STRAW);
//                            entries.add(ModBlocks.INDIGO_JACK_O_STRAW);
//                            entries.add(ModBlocks.MAGENTA_JACK_O_STRAW);
//                            entries.add(ModBlocks.MAUVE_JACK_O_STRAW);
//                            entries.add(ModBlocks.VELVET_JACK_O_STRAW);
//                            entries.add(ModBlocks.FUCHSIA_JACK_O_STRAW);
//                            entries.add(ModBlocks.PINK_JACK_O_STRAW);
//                        } else {
//                            entries.add(ModBlocks.WHITE_JACK_O_STRAW);
//                            entries.add(ModBlocks.LIGHT_GRAY_JACK_O_STRAW);
//                            entries.add(ModBlocks.GRAY_JACK_O_STRAW);
//                            entries.add(ModBlocks.BLACK_JACK_O_STRAW);
//                            entries.add(ModBlocks.BROWN_JACK_O_STRAW);
//                            entries.add(ModBlocks.RED_JACK_O_STRAW);
//                            entries.add(ModBlocks.ORANGE_JACK_O_STRAW);
//                            entries.add(ModBlocks.YELLOW_JACK_O_STRAW);
//                            entries.add(ModBlocks.LIME_JACK_O_STRAW);
//                            entries.add(ModBlocks.GREEN_JACK_O_STRAW);
//                            entries.add(ModBlocks.CYAN_JACK_O_STRAW);
//                            entries.add(ModBlocks.LIGHT_BLUE_JACK_O_STRAW);
//                            entries.add(ModBlocks.BLUE_JACK_O_STRAW);
//                            entries.add(ModBlocks.PURPLE_JACK_O_STRAW);
//                            entries.add(ModBlocks.MAGENTA_JACK_O_STRAW);
//                            entries.add(ModBlocks.PINK_JACK_O_STRAW);
//                        }
                        entries.add(ModBlocks.ARTISAN_BREAD);
                        entries.add(ModItems.ARTISAN_COOKIE);
                        entries.add(ModBlocks.APPLE_PIE);
                        entries.add(ModBlocks.ORANGE_PIE);
                        entries.add(ModBlocks.LEMON_PIE);
                        entries.add(ModBlocks.PLUM_PIE);
                        entries.add(ModBlocks.HOARY_PIE);
                        entries.add(ModBlocks.PASSION_FRUIT_TART);
                        entries.add(ModBlocks.ELDERBERRY_TART);
                        entries.add(ModBlocks.GLOW_BERRY_TART);
                        entries.add(ModBlocks.SWEET_BERRY_TART);
                        entries.add(ModBlocks.LAPISBERRY_TART);
                        entries.add(ModBlocks.COCOA_CAKE);
                        entries.add(ModItems.WALNUT_COOKIE);
                        entries.add(ModItems.MAIZE_BREAD);
                        entries.add(ModItems.FOREST_MEDLEY);
                        entries.add(ModItems.ARID_MEDLEY);
                        entries.add(ModItems.MEADOW_MEDLEY);
                        entries.add(ModItems.COASTAL_MEDLEY);
                        entries.add(ModItems.MUSHROOM_STUFFED_POTATO);
                        entries.add(ModItems.BERRY_STUFFED_POTATO);
                        entries.add(ModItems.MAIZE_STUFFED_POTATO);
                        entries.add(ModItems.LEEK_STEW);
                        entries.add(ModItems.FISH_STEW);
                        entries.add(ModItems.APPLE_STEW);
                        entries.add(ModItems.STONE_STEW);
                        entries.add(ModItems.BOUNTIFUL_STEW);
                        entries.add(ModItems.PASSION_GLAZED_SALMON);
                        entries.add(ModItems.CRUSTED_BEEF);
                        entries.add(ModItems.CRIMSON_CHOW);
                        entries.add(ModItems.WARPED_CHOW);
                        entries.add(ModItems.CUSTARD);
                        entries.add(ModItems.PIQUANT_CUSTARD);
                        entries.add(ModItems.PASSION_CUSTARD);
                        entries.add(ModItems.COCOA_CUSTARD);
                        entries.add(ModItems.GLOWING_CUSTARD);
                        entries.add(ModItems.ANCIENT_CUSTARD);
                        entries.add(ModItems.CANDY);
                        entries.add(ModItems.PIQUANT_CANDY);
                        entries.add(ModItems.SOUR_CANDY);
                        entries.add(ModItems.BITTER_CANDY);
                        entries.add(ModItems.CANDIED_APPLE);
                        entries.add(ModItems.CANDIED_PLUM);
                        entries.add(ModItems.CANDIED_ORANGE);
                        entries.add(ModItems.CANDIED_LEMON);
                    }).build());
    public static void registerItemGroups() {
        BountifulFares.LOGGER.info("Registering Item Group Entries for " + BountifulFares.MOD_ID);
    }
}
