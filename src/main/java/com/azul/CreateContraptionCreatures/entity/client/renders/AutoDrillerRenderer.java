package com.azul.CreateContraptionCreatures.entity.client.renders;

import com.azul.CreateContraptionCreatures.entity.client.models.AutoDrillerModel;
import com.azul.CreateContraptionCreatures.entity.custom.Gatherers.AutoDrillerEntity;

import mod.azure.azurelib.renderer.GeoEntityRenderer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.*;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(value=EnvType.CLIENT)
public class AutoDrillerRenderer extends GeoEntityRenderer<AutoDrillerEntity>
{
		public AutoDrillerRenderer(EntityRendererFactory.Context renderManagerIn) {
			super(renderManagerIn, new AutoDrillerModel());
		}

		@Override
		protected float getDeathMaxRotation(AutoDrillerEntity entityLivingBaseIn) {
			return 0.0F;
		}

		@Override
		public Identifier getTextureLocation(AutoDrillerEntity object)
		{

			return this.getGeoModel().getTextureResource(object);
		}

		@Override
		public void render(AutoDrillerEntity entity, float entityYaw, float partialTick, MatrixStack poseStack,VertexConsumerProvider bufferSource, int packedLight) {
			super.render(entity, entityYaw, partialTick, poseStack, bufferSource, packedLight);
		}

}
