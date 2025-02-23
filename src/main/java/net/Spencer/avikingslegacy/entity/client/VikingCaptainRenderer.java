package net.Spencer.avikingslegacy.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import net.Spencer.avikingslegacy.AVikingsLegacy;
import net.Spencer.avikingslegacy.entity.custom.VikingCaptainEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class VikingCaptainRenderer extends MobRenderer<VikingCaptainEntity, Viking_Captain_Model<VikingCaptainEntity>> {
    public VikingCaptainRenderer(EntityRendererProvider.Context pContext) {
        super(pContext, new Viking_Captain_Model<>(pContext.bakeLayer(ModModelLayers.VIKING_CAPTAIN_LAYER)), 1f);
    }

    @Override
    public ResourceLocation getTextureLocation(VikingCaptainEntity pEntity) {
        return new ResourceLocation(AVikingsLegacy.MOD_ID, "textures/entity/viking_captain.png");
    }

    @Override
    public void render(VikingCaptainEntity pEntity, float pEntityYaw, float pPartialTicks,
                       PoseStack pMatrixStack, MultiBufferSource pBuffer, int pPackedLight) {


        super.render(pEntity, pEntityYaw, pPartialTicks, pMatrixStack, pBuffer, pPackedLight);
    }
}
