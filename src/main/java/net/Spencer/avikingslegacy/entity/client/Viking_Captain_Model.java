package net.Spencer.avikingslegacy.entity.client;// Made with Blockbench 4.12.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.Spencer.avikingslegacy.entity.animations.ModAnimationDefinitions;
import net.Spencer.avikingslegacy.entity.custom.VikingCaptainEntity;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;

public class Viking_Captain_Model<T extends Entity> extends HierarchicalModel<T> {
	private final ModelPart waist;
	private final ModelPart body;
	private final ModelPart head;
	private final ModelPart nose;
	private final ModelPart leftLeg;
	private final ModelPart rightLeg;
	private final ModelPart rightarm;
	private final ModelPart leftarm;
	private final ModelPart rightItem;
	private final ModelPart leftItem;
	private final ModelPart beard;
	private final ModelPart helmet;

	public Viking_Captain_Model(ModelPart root) {
		this.waist = root.getChild("waist");
		this.body = this.waist.getChild("body");
		this.head = this.body.getChild("head");
		this.nose = this.head.getChild("nose");
		this.leftLeg = this.body.getChild("leftLeg");
		this.rightLeg = this.body.getChild("rightLeg");
		this.rightarm = this.body.getChild("rightarm");
		this.leftarm = this.body.getChild("leftarm");
		this.rightItem = root.getChild("rightItem");
		this.leftItem = root.getChild("leftItem");
		this.beard = root.getChild("beard");
		this.helmet = root.getChild("helmet");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition waist = partdefinition.addOrReplaceChild("waist", CubeListBuilder.create(), PartPose.offset(0.0F, 12.0F, 0.0F));

		PartDefinition body = waist.addOrReplaceChild("body", CubeListBuilder.create().texOffs(16, 20).addBox(-4.0F, -27.0F, -3.0F, 8.0F, 15.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(0, 38).addBox(-4.0F, -27.0F, -3.0F, 8.0F, 21.0F, 6.0F, new CubeDeformation(0.5F)), PartPose.offset(0.0F, 12.0F, 0.0F));

		PartDefinition head = body.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -11.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -24.0F, 0.0F));

		PartDefinition nose = head.addOrReplaceChild("nose", CubeListBuilder.create().texOffs(23, -1).addBox(-1.0F, -4.0F, -6.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -4.0F, 0.0F));

		PartDefinition leftLeg = body.addOrReplaceChild("leftLeg", CubeListBuilder.create().texOffs(0, 22).addBox(-2.0F, -3.0F, -2.0F, 4.0F, 15.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(2.0F, -12.0F, 0.0F));

		PartDefinition rightLeg = body.addOrReplaceChild("rightLeg", CubeListBuilder.create().texOffs(0, 22).mirror().addBox(-2.0F, -3.0F, -2.0F, 4.0F, 15.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-2.0F, -12.0F, 0.0F));

		PartDefinition rightarm = body.addOrReplaceChild("rightarm", CubeListBuilder.create().texOffs(40, 46).addBox(-3.0F, -5.0F, -2.0F, 4.0F, 15.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-5.0F, -22.0F, 0.0F));

		PartDefinition leftarm = body.addOrReplaceChild("leftarm", CubeListBuilder.create().texOffs(40, 46).mirror().addBox(-1.0F, -5.0F, -2.0F, 4.0F, 15.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(5.0F, -22.0F, 0.0F));

		PartDefinition rightItem = partdefinition.addOrReplaceChild("rightItem", CubeListBuilder.create(), PartPose.offset(-6.0F, 9.0F, 1.0F));

		PartDefinition leftItem = partdefinition.addOrReplaceChild("leftItem", CubeListBuilder.create(), PartPose.offset(6.0F, 9.0F, 1.0F));

		PartDefinition beard = partdefinition.addOrReplaceChild("beard", CubeListBuilder.create().texOffs(38, 1).addBox(-5.0F, -30.0F, -6.0F, 10.0F, 4.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(46, 2).addBox(-4.0F, -26.0F, -5.0F, 8.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(49, 3).addBox(-3.0F, -24.0F, -4.0F, 6.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition helmet = partdefinition.addOrReplaceChild("helmet", CubeListBuilder.create().texOffs(26, 8).addBox(-5.0F, -36.0F, -5.0F, 10.0F, 2.0F, 10.0F, new CubeDeformation(0.0F))
		.texOffs(40, 37).addBox(-3.0F, -38.0F, -3.0F, 6.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition horn_r1 = helmet.addOrReplaceChild("horn_r1", CubeListBuilder.create().texOffs(30, 42).addBox(-2.5F, -2.0F, -1.0F, 2.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.0F, -41.0F, 0.0F, 0.0F, 0.0F, -0.0873F));

		PartDefinition horn_r2 = helmet.addOrReplaceChild("horn_r2", CubeListBuilder.create().texOffs(30, 42).addBox(-2.0F, -2.0F, -1.0F, 2.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.0F, -37.0F, 0.0F, 0.0F, 0.0F, 0.8727F));

		PartDefinition horn_r3 = helmet.addOrReplaceChild("horn_r3", CubeListBuilder.create().texOffs(30, 42).addBox(-4.5F, -2.0F, -1.0F, 2.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0F, -41.0F, 0.0F, 0.0F, 0.0F, 0.0873F));

		PartDefinition horn_r4 = helmet.addOrReplaceChild("horn_r4", CubeListBuilder.create().texOffs(30, 42).addBox(-2.0F, -3.0F, -1.0F, 2.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0F, -38.0F, 0.0F, 0.0F, 0.0F, -0.8727F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.root().getAllParts().forEach(ModelPart::resetPose);
		this.applyHeadRotation(netHeadYaw, headPitch, ageInTicks);
		this.animateWalk(ModAnimationDefinitions.VIKING_CAPTAIN_WALK, limbSwing, limbSwingAmount, 2f, 2.5f);
		this.animate(((VikingCaptainEntity) entity).idleAnimationState, ModAnimationDefinitions.VIKING_CAPTAIN_BASE, ageInTicks, 1f);
	}

	private void applyHeadRotation(float pNetHeadYaw, float pHeadPitch, float pAgeInTicks) {
		pNetHeadYaw = Mth.clamp(pNetHeadYaw, -30.0F, 30.0F);
		pHeadPitch = Mth.clamp(pHeadPitch, -25.0F, 45.0F);

		this.head.yRot = pNetHeadYaw * ((float)Math.PI / 180F);
		this.head.xRot = pHeadPitch * ((float)Math.PI / 180F);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		waist.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		rightItem.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leftItem.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		beard.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		helmet.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	@Override
	public ModelPart root() {
		return body;
	}
}