package net.Spencer.avikingslegacy.item;

import net.Spencer.avikingslegacy.AVikingsLegacy;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
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
                                pOutput.accept(ModItems.VIKINITECRYSTAL.get());
                            })
                            .build());

    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
