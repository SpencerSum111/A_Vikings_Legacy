package net.Spencer.avikingslegacy.datagen;

import net.Spencer.avikingslegacy.AVikingsLegacy;
import net.Spencer.avikingslegacy.block.ModBlocks;
import net.Spencer.avikingslegacy.block.custom.CoffeeCropBlock;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ConfiguredModel;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Function;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, AVikingsLegacy.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.VIKINITE_ORE);
        blockWithItem(ModBlocks.BLOCK_OF_VIKINITE);
        blockWithItem(ModBlocks.DEEPSLATE_VIKINITE_ORE);
        blockWithItem(ModBlocks.MEIER_HALL_BRICKS);
        blockWithItem(ModBlocks.MEIER_HALL_LIGHT_GREEN_TILE);
        blockWithItem(ModBlocks.MEIER_HALL_GREEN_TILE);
        blockWithItem(ModBlocks.MEIER_HALL_DARK_GREEN_TILE);

        makeCoffeeCrop((CropBlock) ModBlocks.COFFEE_CROP.get(), "coffee_stage", "coffee_stage");
    }

    public void makeCoffeeCrop(CropBlock block, String modelName, String textureName) {
        Function<BlockState, ConfiguredModel[]> function = state -> coffeeStates(state, block, modelName, textureName);

        getVariantBuilder(block).forAllStates(function);
    }

    private ConfiguredModel[] coffeeStates(BlockState state, CropBlock block, String modelName, String textureName) {
        ConfiguredModel[] models = new ConfiguredModel[1];
        models[0] = new ConfiguredModel(models().crop(modelName + state.getValue(((CoffeeCropBlock) block).getAgeProperty()),
                new ResourceLocation(AVikingsLegacy.MOD_ID, "block/" + textureName + state.getValue(((CoffeeCropBlock) block).getAgeProperty()))).renderType("cutout"));

        return models;
    }
    private void blockWithItem (RegistryObject<Block> blockRegistryObject){
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}
