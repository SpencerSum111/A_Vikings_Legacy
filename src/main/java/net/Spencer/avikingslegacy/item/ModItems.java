package net.Spencer.avikingslegacy.item;

import net.Spencer.avikingslegacy.AVikingsLegacy;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, AVikingsLegacy.MOD_ID);

    public static final RegistryObject<Item> COFFEE_TREE_SEED = ITEMS.register("coffee_tree_seed",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> COFFEE_CHERRY = ITEMS.register("coffee_cherry",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> VIKINITECRYSTAL = ITEMS.register("vikinite_crystal",
            () -> new Item(new Item.Properties()));
    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
