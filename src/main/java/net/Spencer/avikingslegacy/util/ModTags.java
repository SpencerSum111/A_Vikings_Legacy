package net.Spencer.avikingslegacy.util;

import net.Spencer.avikingslegacy.AVikingsLegacy;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Blocks{
        public static final TagKey<Block> NEEDS_VIKINITE_TOOL = tag("needs_vikinite_tool");

        private static TagKey<Block> tag(String name){
            return BlockTags.create (new ResourceLocation(AVikingsLegacy.MOD_ID, name));
        }
    }

    public static class Items{

    }
}
