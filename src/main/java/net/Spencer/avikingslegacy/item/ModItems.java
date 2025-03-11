package net.Spencer.avikingslegacy.item;

import net.Spencer.avikingslegacy.AVikingsLegacy;
import net.Spencer.avikingslegacy.block.ModBlocks;
import net.Spencer.avikingslegacy.entity.ModEntities;
import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.world.item.*;
import net.minecraftforge.common.ForgeSpawnEggItem;
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
    public static final RegistryObject<Item> CUP_OF_COFFEE = ITEMS.register("cup_of_coffee",
            () -> new Item(new Item.Properties().food(ModFoods.CUP_OF_COFFEE)));

    public static final RegistryObject<Item> VIKINITECRYSTAL = ITEMS.register("vikinite_crystal",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> VIKINITEINGOT = ITEMS.register("vikinite_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> VIKINITE_NUGGET = ITEMS.register("vikinite_nugget",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> VIKING_GOLD = ITEMS.register("viking_gold",
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

    public static final RegistryObject<Item> VIKING_EMBLEM_RED = ITEMS.register("viking_emblem_red",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> VIKING_EMBLEM_BLUE = ITEMS.register("viking_emblem_blue",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> VIKING_EMBLEM_GREEN = ITEMS.register("viking_emblem_green",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> VIKING_EMBLEM_ORANGE = ITEMS.register("viking_emblem_orange",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> ODD_LAPTOP = ITEMS.register("odd_laptop",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PLUSH_MONKEY = ITEMS.register("plush_monkey",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BROWN_FOX_KEYCHAIN = ITEMS.register("brown_fox_keychain",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BUSINESS_CARD = ITEMS.register("business_card",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> VIKING_CAPTAIN_SPAWN_EGG = ITEMS.register("viking_captain_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntities.VIKING_CAPTAIN, 0x3C39FF, 0xFFA649, new Item.Properties()));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }

}

