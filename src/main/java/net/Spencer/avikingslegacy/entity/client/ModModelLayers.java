package net.Spencer.avikingslegacy.entity.client;

import com.ibm.icu.text.Normalizer;
import net.Spencer.avikingslegacy.AVikingsLegacy;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.resources.ResourceLocation;

public class ModModelLayers {
    public static final ModelLayerLocation VIKING_CAPTAIN_LAYER =
            new ModelLayerLocation(new ResourceLocation(AVikingsLegacy.MOD_ID,
                    "viking_captain_layer"), "main");

    public static final ModelLayerLocation BERSERKER_LAYER =
            new ModelLayerLocation(new ResourceLocation(AVikingsLegacy.MOD_ID,
                    "berserker_layer"), "main");
}
