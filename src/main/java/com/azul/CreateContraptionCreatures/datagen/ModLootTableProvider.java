package com.azul.CreateContraptionCreatures.datagen;

import com.azul.CreateContraptionCreatures.block.ModBlocks;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate()
    {
		addDrop(ModBlocks.MECHANIC_TABLE);
		addDrop(ModBlocks.PLUMBER_TABLE);
        addDrop(ModBlocks.LOCOMOTIVE_TABLE);
    }
}
