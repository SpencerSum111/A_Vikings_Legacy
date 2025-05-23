package net.Spencer.avikingslegacy.event;

import net.Spencer.avikingslegacy.AVikingsLegacy;
import net.Spencer.avikingslegacy.entity.client.Berserker_Model;
import net.Spencer.avikingslegacy.entity.client.ModModelLayers;
import net.Spencer.avikingslegacy.entity.client.Viking_Captain_Model;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = AVikingsLegacy.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModEventBusClientEvents {

    @SubscribeEvent
    public static void registerLayer(EntityRenderersEvent.RegisterLayerDefinitions event){
        event.registerLayerDefinition(ModModelLayers.VIKING_CAPTAIN_LAYER, Viking_Captain_Model::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.BERSERKER_LAYER, Berserker_Model::createBodyLayer);
    }
}
