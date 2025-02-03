package net.Spencer.avikingslegacy.item;

import net.Spencer.avikingslegacy.AVikingsLegacy;
import net.Spencer.avikingslegacy.block.ModBlocks;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, AVikingsLegacy.MOD_ID);

    public static final RegistryObject<Item> COFFEE_TREE_SEED = ITEMS.register("coffee_tree_seed",
            () -> new ItemNameBlockItem(ModBlocks.COFFEE_CROP.get(), new Item.Properties()));
    public static final RegistryObject<Item> COFFEE_CHERRY = ITEMS.register("coffee_cherry",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> COFFEE_BEANS = ITEMS.register("coffee_beans",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> COFFEE = ITEMS.register("coffee",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> VIKINITECRYSTAL = ITEMS.register("vikinite_crystal",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> VIKINITEINGOT = ITEMS.register("vikinite_ingot",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> VIKINITE_SWORD = ITEMS.register("vikinite_sword",
            () -> new SwordItem(ModToolTiers.VIKINITE, 14, -2F, new Item.Properties()));
    public static final RegistryObject<Item> VIKINITE_AXE = ITEMS.register("vikinite_axe",
            () -> new AxeItem(ModToolTiers.VIKINITE, 16, -2.5F, new Item.Properties()));
    public static final RegistryObject<Item> VIKINITE_PICKAXE = ITEMS.register("vikinite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.VIKINITE, 12 , -2.4F, new Item.Properties()));
    public static final RegistryObject<Item> VIKINITE_SHOVEL = ITEMS.register("vikinite_shovel",
            () -> new ShovelItem(ModToolTiers.VIKINITE, 12.5F, -2.5F, new Item.Properties()));
    public static final RegistryObject<Item> VIKINITE_HOE = ITEMS.register("vikinite_hoe",
            () -> new HoeItem(ModToolTiers.VIKINITE, 0, 0, new Item.Properties()));

    public static final RegistryObject<Item> VIKINITE_HELMET = ITEMS.register("vikinite_helmet",
            () -> new ArmorItem(ModArmorMaterials.VIKINITE, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> VIKINITE_CHESTPLATE = ITEMS.register("vikinite_chestplate",
            () -> new ArmorItem(ModArmorMaterials.VIKINITE, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> VIKINITE_LEGGINGS = ITEMS.register("vikinite_leggings",
            () -> new ArmorItem(ModArmorMaterials.VIKINITE, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> VIKINITE_BOOTS = ITEMS.register("vikinite_boots",
            () -> new ArmorItem(ModArmorMaterials.VIKINITE, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }

}

