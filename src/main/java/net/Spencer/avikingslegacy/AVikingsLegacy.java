package net.Spencer.avikingslegacy;

import com.mojang.logging.LogUtils;
import net.Spencer.avikingslegacy.block.ModBlocks;
//import net.Spencer.avikingslegacy.block.entity.ModBlockEntities;
import net.Spencer.avikingslegacy.effect.ModEffects;
import net.Spencer.avikingslegacy.entity.ModEntities;
import net.Spencer.avikingslegacy.entity.client.VikingCaptainRenderer;
import net.Spencer.avikingslegacy.item.AVLCreativeModeTabs;
import net.Spencer.avikingslegacy.item.ModItems;
import net.Spencer.avikingslegacy.potion.ModPotions;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.brewing.BrewingRecipe;
import net.minecraftforge.common.brewing.BrewingRecipeRegistry;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(AVikingsLegacy.MOD_ID)
public class AVikingsLegacy
{
    // Define mod id in a common place for everything to reference
    public static final String MOD_ID = "avikingslegacy";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();

    public AVikingsLegacy(){

        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        AVLCreativeModeTabs.register(modEventBus);

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);
        ModPotions.register(modEventBus);
        ModEffects.register(modEventBus);

        //ModBlockEntities.register(modEventBus);

        ModEntities.register(modEventBus);

        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);

        modEventBus.addListener(this::addCreative);

    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {

    }

    // Add the example block item to the building blocks tab
    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if(event.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {

        }
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event)
    {
    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            EntityRenderers.register(ModEntities.VIKING_CAPTAIN.get(), VikingCaptainRenderer::new);
        }
    }
}
