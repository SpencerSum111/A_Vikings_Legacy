package net.Spencer.avikingslegacy.item;

import net.Spencer.avikingslegacy.effect.ModEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties CUP_OF_COFFEE = new FoodProperties.Builder().nutrition(2)
            .saturationMod(0.2f)
            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 1200), 1f)
            .effect(() -> new MobEffectInstance(MobEffects.DIG_SPEED, 1200), 1f).build();
}
