package net.Spencer.avikingslegacy.datagen.loot;

import net.Spencer.avikingslegacy.block.ModBlocks;
import net.Spencer.avikingslegacy.block.custom.CoffeeCropBlock;
import net.Spencer.avikingslegacy.item.ModItems;
import net.minecraft.advancements.critereon.StatePropertiesPredicate;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {

    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }



    @Override
    protected void generate() {
        this.dropSelf(ModBlocks.BLOCK_OF_VIKINITE.get());
        this.dropSelf(ModBlocks.MEIER_HALL_BRICKS.get());
        this.dropSelf(ModBlocks.MEIER_HALL_LIGHT_GREEN_TILE.get());
        this.dropSelf(ModBlocks.MEIER_HALL_GREEN_TILE.get());
        this.dropSelf(ModBlocks.MEIER_HALL_DARK_GREEN_TILE.get());

        this.add(ModBlocks.VIKINITE_ORE.get(),
                block -> createOreDrop(ModBlocks.VIKINITE_ORE.get(), ModItems.VIKINITECRYSTAL.get()));
        this.add(ModBlocks.DEEPSLATE_VIKINITE_ORE.get(),
                block -> createOreDrop(ModBlocks.DEEPSLATE_VIKINITE_ORE.get(), ModItems.VIKINITECRYSTAL.get()));

        LootItemCondition.Builder lootitemcondition$builder = LootItemBlockStatePropertyCondition
                .hasBlockStateProperties(ModBlocks.COFFEE_CROP.get())
                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(CoffeeCropBlock.AGE, 5));

        this.add(ModBlocks.COFFEE_CROP.get(), createCropDrops(ModBlocks.COFFEE_CROP.get(), ModItems.COFFEE_CHERRY.get(),
                ModItems.COFFEE_TREE_SEED.get(), lootitemcondition$builder));
    }

    protected LootTable.Builder createOreDrop(Block pBlock, Item pItem) {
        return createSilkTouchDispatchTable(pBlock,
                this.applyExplosionDecay(pBlock,
                        LootItem.lootTableItem(pItem).apply(ApplyBonusCount
                                .addOreBonusCount(Enchantments.BLOCK_FORTUNE))));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
