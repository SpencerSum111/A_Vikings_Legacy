package net.Spencer.avikingslegacy.datagen;

import net.Spencer.avikingslegacy.AVikingsLegacy;
import net.Spencer.avikingslegacy.block.ModBlocks;
import net.Spencer.avikingslegacy.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    private static final List<ItemLike> VIKINITE_SMELTABLES = List.of(ModItems.VIKINITECRYSTAL.get(),
            ModBlocks.VIKINITE_ORE.get(), ModBlocks.DEEPSLATE_VIKINITE_ORE.get());

    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pWriter) {
        oreBlasting(pWriter, VIKINITE_SMELTABLES, RecipeCategory.MISC, ModItems.VIKINITEINGOT.get(),
                0.25f, 100, "vikinite");
        oreSmelting(pWriter, VIKINITE_SMELTABLES, RecipeCategory.MISC, ModItems.VIKINITEINGOT.get(),
                0.25f, 200, "vikinite");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.BLOCK_OF_VIKINITE.get())
                .pattern("VVV")
                .pattern("VVV")
                .pattern("VVV")
                .define('V', ModItems.VIKINITEINGOT.get())
                .unlockedBy(getHasName(ModItems.VIKINITEINGOT.get()), has(ModItems.VIKINITEINGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.VIKINITE_SWORD.get())
                .pattern(" V ")
                .pattern(" V ")
                .pattern(" S ")
                .define('V', ModItems.VIKINITEINGOT.get())
                .define('S', Items.STICK)
                .unlockedBy(getHasName(ModItems.VIKINITEINGOT.get()), has(ModItems.VIKINITEINGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.VIKINITE_AXE.get())
                .pattern(" VV")
                .pattern(" SV")
                .pattern(" S ")
                .define('V', ModItems.VIKINITEINGOT.get())
                .define('S', Items.STICK)
                .unlockedBy(getHasName(ModItems.VIKINITEINGOT.get()), has(ModItems.VIKINITEINGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.VIKINITE_PICKAXE.get())
                .pattern("VVV")
                .pattern(" S ")
                .pattern(" S ")
                .define('V', ModItems.VIKINITEINGOT.get())
                .define('S', Items.STICK)
                .unlockedBy(getHasName(ModItems.VIKINITEINGOT.get()), has(ModItems.VIKINITEINGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.VIKINITE_SHOVEL.get())
                .pattern(" V ")
                .pattern(" S ")
                .pattern(" S ")
                .define('V', ModItems.VIKINITEINGOT.get())
                .define('S', Items.STICK)
                .unlockedBy(getHasName(ModItems.VIKINITEINGOT.get()), has(ModItems.VIKINITEINGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.VIKINITE_HOE.get())
                .pattern("VV ")
                .pattern(" S ")
                .pattern(" S ")
                .define('V', ModItems.VIKINITEINGOT.get())
                .define('S', Items.STICK)
                .unlockedBy(getHasName(ModItems.VIKINITEINGOT.get()), has(ModItems.VIKINITEINGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.VIKINITE_HELMET.get())
                .pattern("VVV")
                .pattern("V V")
                .pattern("   ")
                .define('V', ModItems.VIKINITEINGOT.get())
                .unlockedBy(getHasName(ModItems.VIKINITEINGOT.get()), has(ModItems.VIKINITEINGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.VIKINITE_CHESTPLATE.get())
                .pattern("V V")
                .pattern("VVV")
                .pattern("VVV")
                .define('V', ModItems.VIKINITEINGOT.get())
                .unlockedBy(getHasName(ModItems.VIKINITEINGOT.get()), has(ModItems.VIKINITEINGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.VIKINITE_LEGGINGS.get())
                .pattern("VVV")
                .pattern("V V")
                .pattern("V V")
                .define('V', ModItems.VIKINITEINGOT.get())
                .unlockedBy(getHasName(ModItems.VIKINITEINGOT.get()), has(ModItems.VIKINITEINGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.VIKINITE_BOOTS.get())
                .pattern("V V")
                .pattern("V V")
                .pattern("   ")
                .define('V', ModItems.VIKINITEINGOT.get())
                .unlockedBy(getHasName(ModItems.VIKINITEINGOT.get()), has(ModItems.VIKINITEINGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.VIKING_GOLD.get())
                .pattern(" N ")
                .pattern("NGN")
                .pattern(" N ")
                .define('N', ModItems.VIKINITE_NUGGET.get())
                .define('G', Items.GOLD_NUGGET)
                .unlockedBy(getHasName(ModItems.VIKINITEINGOT.get()), has(ModItems.VIKINITEINGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.VIKINITEINGOT.get())
                .pattern("NNN")
                .pattern("NNN")
                .pattern("NNN")
                .define('N', ModItems.VIKINITE_NUGGET.get())
                .unlockedBy(getHasName(ModItems.VIKINITEINGOT.get()), has(ModItems.VIKINITEINGOT.get()))
                .save(pWriter, name("vikinite_ingot_from_nuggets"));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.VIKINITE_NUGGET.get(), 9)
                .requires(ModItems.VIKINITEINGOT.get())
                .unlockedBy(getHasName(ModItems.VIKINITEINGOT.get()), has(ModItems.VIKINITEINGOT.get()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.VIKINITEINGOT.get(), 9)
                .requires(ModBlocks.BLOCK_OF_VIKINITE.get())
                .unlockedBy(getHasName(ModBlocks.BLOCK_OF_VIKINITE.get()), has(ModBlocks.BLOCK_OF_VIKINITE.get()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.COFFEE_BEANS.get(), 3)
                .requires(ModItems.COFFEE_CHERRY.get())
                .unlockedBy(getHasName(ModItems.COFFEE_CHERRY.get()), has(ModItems.COFFEE_CHERRY.get()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.COFFEE_TREE_SEED.get())
                .requires(Items.WHEAT_SEEDS)
                .requires(Items.COCOA_BEANS)
                .unlockedBy(getHasName(Items.WHEAT_SEEDS), has(Items.WHEAT_SEEDS))
                .unlockedBy(getHasName(Items.COCOA_BEANS), has(Items.COCOA_BEANS))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, ModItems.CUP_OF_COFFEE.get())
                .pattern(" S ")
                .pattern(" C ")
                .pattern(" P ")
                .define('C', ModItems.COFFEE_BEANS.get())
                .define('P', Items.POTION)
                .define('S', Items.SUGAR)
                .unlockedBy(getHasName(ModItems.COFFEE_BEANS.get()), has(ModItems.COFFEE_BEANS.get()))
                .unlockedBy(getHasName(Items.GLASS_BOTTLE), has(Items.GLASS_BOTTLE))
                .save(pWriter);


    }
    protected static void oreSmelting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTIme, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.SMELTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTIme, pGroup, "_from_smelting");
    }

    protected static void oreBlasting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.BLASTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    protected static void oreCooking(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RecipeSerializer<? extends AbstractCookingRecipe> pCookingSerializer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pRecipeName) {
        for (ItemLike itemlike : pIngredients) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), pCategory, pResult,
                    pExperience, pCookingTime, pCookingSerializer)
                    .group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(pFinishedRecipeConsumer, AVikingsLegacy.MOD_ID + ":" + (pResult) + pRecipeName + "_" + getItemName(itemlike));
        }
    }
    private ResourceLocation name(String name) {
        return new ResourceLocation(AVikingsLegacy.MOD_ID, name);
    }
}
