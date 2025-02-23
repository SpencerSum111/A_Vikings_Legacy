package net.Spencer.avikingslegacy.entity;

import net.Spencer.avikingslegacy.AVikingsLegacy;
import net.Spencer.avikingslegacy.entity.custom.VikingCaptainEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, AVikingsLegacy.MOD_ID);

    public static final RegistryObject<EntityType<VikingCaptainEntity>> VIKING_CAPTAIN =
            ENTITY_TYPES.register("viking_captain", () -> EntityType.Builder.of(VikingCaptainEntity::new, MobCategory.MONSTER)
                    .sized(1f, 2f).build("viking_captain"));

    public static void register(IEventBus eventBus){
        ENTITY_TYPES.register(eventBus);
    }
}
