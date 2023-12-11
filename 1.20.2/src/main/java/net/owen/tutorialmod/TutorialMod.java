package net.owen.tutorialmod;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.owen.tutorialmod.block.ModBlocks;
import net.owen.tutorialmod.block.entity.ModBlockEntities;
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
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TutorialMod implements ModInitializer {
	public static final String MOD_ID = "tutorialmod";
    public static final Logger LOGGER = LoggerFactory.getLogger("tutorialmod");

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

		ModEntities.registerModEntities();
		ModScreenHandlers.registerScreenHandlers();

		ModRecipes.registerRecipes();

		FuelRegistry.INSTANCE.add(ModItems.COAL_BRIQUETTE, 200);
		FabricDefaultAttributeRegistry.register(ModEntities.PORCUPINE, PorcupineEntity.createPorcupineAttributes());
	}
}