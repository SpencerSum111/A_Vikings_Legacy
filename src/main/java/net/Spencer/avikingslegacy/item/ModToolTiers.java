package net.Spencer.avikingslegacy.item;

import net.Spencer.avikingslegacy.AVikingsLegacy;
import net.Spencer.avikingslegacy.util.ModTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class ModToolTiers {
    public static final Tier VIKINITE = TierSortingRegistry.registerTier(
            new ForgeTier(5, 2025, 10f, 0f, 20,
                    ModTags.Blocks.NEEDS_VIKINITE_TOOL, () -> Ingredient.of(ModItems.VIKINITEINGOT.get())),
            new ResourceLocation(AVikingsLegacy.MOD_ID, "vikinite_ingot"), List.of(Tiers.NETHERITE), List.of());

    public static final Tier VIKING_SABER = TierSortingRegistry.registerTier(
            new ForgeTier(5, 2025, 10f, 0f, 20,
                    ModTags.Blocks.NEEDS_VIKING_SABER, () -> Ingredient.of(ModItems.VIKINITEINGOT.get())),
            new ResourceLocation(AVikingsLegacy.MOD_ID, "viking_saber"), List.of(Tiers.NETHERITE), List.of());
}
