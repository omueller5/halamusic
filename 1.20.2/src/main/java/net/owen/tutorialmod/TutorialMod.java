package net.owen.tutorialmod;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.owen.tutorialmod.block.ModBlocks;
import net.owen.tutorialmod.block.entity.ModBlockEntities;
import net.owen.tutorialmod.entity.ModBoats;
import net.owen.tutorialmod.entity.ModEntities;
import net.owen.tutorialmod.entity.custom.PorcupineEntity;
import net.owen.tutorialmod.item.ModItemGroups;
import net.owen.tutorialmod.item.ModItems;
import net.owen.tutorialmod.recipe.ModRecipes;
import net.owen.tutorialmod.screen.ModScreenHandlers;
import net.owen.tutorialmod.sound.ModSounds;
import net.owen.tutorialmod.util.ModCustomTrades;
import net.owen.tutorialmod.util.ModLootTableModifiers;
import net.owen.tutorialmod.villager.ModVillagers;
import net.owen.tutorialmod.world.gen.ModWorldGeneration;
import net.owen.tutorialmod.world.tree.ModFoliagePlacerTypes;
import net.owen.tutorialmod.world.tree.ModTrunkPlacerTypes;
import net.kyrptonaught.customportalapi.api.CustomPortalBuilder;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TutorialMod implements ModInitializer {
	public static final String MOD_ID = "tutorialmod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		ModLootTableModifiers.modifyLootTables();
		ModCustomTrades.registerCustomTrades();

		ModVillagers.registerVillagers();
		ModSounds.registerSounds();

		ModBlockEntities.registerBlockEntities();
		ModScreenHandlers.registerScreenHandlers();

		ModRecipes.registerRecipes();
		ModTrunkPlacerTypes.register();

		ModFoliagePlacerTypes.register();

		FuelRegistry.INSTANCE.add(ModItems.COAL_BRIQUETTE, 200);
		FabricDefaultAttributeRegistry.register(ModEntities.PORCUPINE, PorcupineEntity.createPorcupineAttributes());

		StrippableBlockRegistry.register(ModBlocks.CHESTNUT_LOG, ModBlocks.STRIPPED_CHESTNUT_LOG);
		StrippableBlockRegistry.register(ModBlocks.CHESTNUT_WOOD, ModBlocks.STRIPPED_CHESTNUT_WOOD);

		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.CHESTNUT_LOG, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.CHESTNUT_WOOD, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_CHESTNUT_LOG, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_CHESTNUT_WOOD, 5, 5);

		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.CHESTNUT_PLANKS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.CHESTNUT_LEAVES, 30, 60);

		ModBoats.registerBoats();
		ModWorldGeneration.generateModWorldGen();

		CustomPortalBuilder.beginPortal()
				.frameBlock(ModBlocks.RUBY_BLOCK)
				.lightWithItem(ModItems.CORN)
				.destDimID(new Identifier(TutorialMod.MOD_ID, "kaupendim"))
				.tintColor(0xc76efa)
				.registerPortal();
	}
}