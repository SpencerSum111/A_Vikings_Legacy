package net.Spencer.avikingslegacy.event;

import net.Spencer.avikingslegacy.AVikingsLegacy;
import net.Spencer.avikingslegacy.entity.ModEntities;
import net.Spencer.avikingslegacy.entity.client.ModModelLayers;
import net.Spencer.avikingslegacy.entity.client.Viking_Captain_Model;
import net.Spencer.avikingslegacy.entity.custom.VikingCaptainEntity;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = AVikingsLegacy.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {

    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event){
        event.put(ModEntities.VIKING_CAPTAIN.get(), VikingCaptainEntity.createAttributes().build());
    }
}
