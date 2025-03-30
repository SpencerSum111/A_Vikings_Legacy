package net.Spencer.avikingslegacy.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import net.Spencer.avikingslegacy.AVikingsLegacy;
import net.Spencer.avikingslegacy.entity.custom.BerserkerEntity;
import net.Spencer.avikingslegacy.entity.custom.VikingCaptainEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class BerserkerRenderer extends MobRenderer<BerserkerEntity, Berserk_Model<BerserkerEntity>> {
    public BerserkerRenderer(EntityRendererProvider.Context pContext) {
        super(pContext, new Berserk_Model<>(pContext.bakeLayer(ModModelLayers.BERSERKER_LAYER)), 1f);
    }

    @Override
    public ResourceLocation getTextureLocation(BerserkerEntity pEntity) {
        return new ResourceLocation(AVikingsLegacy.MOD_ID, "textures/entity/berserker.png");
    }

    @Override
    public void render(BerserkerEntity pEntity, float pEntityYaw, float pPartialTicks,
                       PoseStack pMatrixStack, MultiBufferSource pBuffer, int pPackedLight) {


        super.render(pEntity, pEntityYaw, pPartialTicks, pMatrixStack, pBuffer, pPackedLight);
    }
}