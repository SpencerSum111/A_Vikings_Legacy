package net.Spencer.avikingslegacy.potion;

import com.mojang.blaze3d.shaders.Effect;
import net.Spencer.avikingslegacy.AVikingsLegacy;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.item.alchemy.Potion;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModPotions {

    public static final DeferredRegister<Potion> POTIONS
            = DeferredRegister.create(ForgeRegistries.POTIONS, AVikingsLegacy.MOD_ID);

    public static void register(IEventBus eventBus) {
        POTIONS.register(eventBus);
    }

}
