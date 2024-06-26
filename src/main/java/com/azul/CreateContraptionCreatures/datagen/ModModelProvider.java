package com.azul.CreateContraptionCreatures.datagen;

import com.azul.CreateContraptionCreatures.block.ModBlocks;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MECHANIC_TABLE);
		blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PLUMBER_TABLE);
		blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.LOCOMOTIVE_TABLE);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
    }
}
