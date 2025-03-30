package net.Spencer.avikingslegacy.item;

import net.Spencer.avikingslegacy.AVikingsLegacy;
import net.Spencer.avikingslegacy.block.ModBlocks;
import net.Spencer.avikingslegacy.potion.ModPotions;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class AVLCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, AVikingsLegacy.MOD_ID);


    public static final RegistryObject<CreativeModeTab> AVL_TAB =
            CREATIVE_MODE_TABS.register("a_vikings_legacy_tab",
                    () -> CreativeModeTab.builder().icon(() ->
                            new ItemStack(ModItems.VIKINITECRYSTAL.get()))
                            .title(Component.translatable("creativetab.avl_tab"))
                            .displayItems((pParameters, pOutput) -> {
                                pOutput.accept(ModItems.COFFEE_TREE_SEED.get());
                                pOutput.accept(ModItems.COFFEE_CHERRY.get());
                                pOutput.accept(ModItems.COFFEE_BEANS.get());
                                pOutput.accept(ModItems.CUP_OF_COFFEE.get());

                                pOutput.accept(ModBlocks.VIKINITE_ORE.get());
                                pOutput.accept(ModBlocks.DEEPSLATE_VIKINITE_ORE.get());
                                pOutput.accept(ModBlocks.BLOCK_OF_VIKINITE.get());
                                pOutput.accept(ModBlocks.MEIER_HALL_BRICKS.get());
                                pOutput.accept(ModBlocks.MEIER_HALL_LIGHT_GREEN_TILE.get());
                                pOutput.accept(ModBlocks.MEIER_HALL_GREEN_TILE.get());
                                pOutput.accept(ModBlocks.MEIER_HALL_DARK_GREEN_TILE.get());

                                pOutput.accept(ModItems.VIKINITECRYSTAL.get());
                                pOutput.accept(ModItems.VIKINITEINGOT.get());
                                pOutput.accept(ModItems.VIKINITE_NUGGET.get());
                                pOutput.accept(ModItems.VIKING_GOLD.get());

                                pOutput.accept(ModItems.VIKINITE_SWORD.get());
                                pOutput.accept(ModItems.VIKINITE_AXE.get());
                                pOutput.accept(ModItems.VIKINITE_PICKAXE.get());
                                pOutput.accept(ModItems.VIKINITE_SHOVEL.get());
                                pOutput.accept(ModItems.VIKINITE_HOE.get());

                                pOutput.accept(ModItems.VIKINITE_HELMET.get());
                                pOutput.accept(ModItems.VIKINITE_CHESTPLATE.get());
                                pOutput.accept(ModItems.VIKINITE_LEGGINGS.get());
                                pOutput.accept(ModItems.VIKINITE_BOOTS.get());

                                pOutput.accept(ModItems.VIKING_EMBLEM_RED.get());
                                pOutput.accept(ModItems.VIKING_EMBLEM_BLUE.get());
                                pOutput.accept(ModItems.VIKING_EMBLEM_GREEN.get());
                                pOutput.accept(ModItems.VIKING_EMBLEM_ORANGE.get());

                                pOutput.accept(ModItems.ODD_LAPTOP.get());
                                pOutput.accept(ModItems.PLUSH_MONKEY.get());
                                pOutput.accept(ModItems.BROWN_FOX_KEYCHAIN.get());
                                pOutput.accept(ModItems.BUSINESS_CARD.get());


                                pOutput.accept(ModItems.VIKING_CAPTAIN_SPAWN_EGG.get());

                            })
                            .build());

    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }

}
