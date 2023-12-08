package net.owen.tutorialmod.util;

import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentLevelEntry;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.EnchantedBookItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.VillagerProfession;
import net.owen.tutorialmod.block.ModBlocks;
import net.owen.tutorialmod.item.ModItems;
import net.owen.tutorialmod.villager.ModVillagers;

public class ModCustomTrades {
    public static void registerCustomTrades() {
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.NITWIT, 1, factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(Items.EMERALD, 2),
                    new ItemStack(ModItems.TOMATO, 7),
                    6, 5, 0.05f));
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(Items.EMERALD, 5),
                    new ItemStack(ModItems.TOMATO_SEEDS, 2),
                    3, 7, 0.05f));
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(Items.EMERALD, 6),
                    new ItemStack(ModItems.CORN, 6),
                    6, 7, 0.05f));
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(Items.EMERALD, 8),
                    new ItemStack(ModItems.CORN_SEEDS, 1),
                    2, 7, 0.05f));
        });
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.LIBRARIAN, 1, factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(ModItems.RUBY, 25),
                    EnchantedBookItem.forEnchantment(new EnchantmentLevelEntry(Enchantments.SHARPNESS, 10)),
                    3, 15, 0.075f));
        });
        TradeOfferHelper.registerWanderingTraderOffers(1, factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(ModItems.RUBY, 64),
                    EnchantedBookItem.forEnchantment(new EnchantmentLevelEntry(Enchantments.UNBREAKING, 30)),
                    1, 115, 0.1f));
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(ModItems.RAW_RUBY, 16),
                    new ItemStack(ModItems.METAL_DETECTOR, 1),
                    1, 12, 0.075f));
        });TradeOfferHelper.registerWanderingTraderOffers(2, factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(ModItems.RAW_RUBY, 1),
                    new ItemStack(ModItems.COAL_BRIQUETTE, 1),
                    32, 12, 0.075f));
        });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.SOUND_MASTER, 1, factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(Items.EMERALD, 32),
                    new ItemStack(Items.MUSIC_DISC_OTHERSIDE, 1),
                    new ItemStack(ModItems.I_PROMISE_MUSIC_DISC, 1),
                    3, 15, 0.075f));
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(Items.EMERALD, 32),
                    new ItemStack(Items.MUSIC_DISC_OTHERSIDE, 1),
                    new ItemStack(ModItems.FAR_AWAY_MUSIC_DISC, 1),
                    3, 15, 0.075f));
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(Items.EMERALD, 6),
                    new ItemStack(ModItems.WORSHIP_ME_MUSIC_DISC, 6),
                    6, 7, 0.05f));
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(Items.EMERALD, 8),
                    new ItemStack(ModItems.WE_ALL_KNOW_MUSIC_DISC, 1),
                    2, 7, 0.05f));
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(Items.EMERALD, 8),
                    new ItemStack(ModItems.EDENS_DUST_MUSIC_DISC, 1),
                    2, 7, 0.05f));
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(Items.EMERALD, 8),
                    new ItemStack(ModItems.CHARMING_MUSIC_DISC, 1),
                    2, 7, 0.05f));
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(Items.EMERALD, 8),
                    new ItemStack(ModItems.JUST_BETTER_MUSIC_DISC, 1),
                    2, 7, 0.05f));
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(Items.EMERALD, 8),
                    new ItemStack(ModItems.KILL_ME_MUSIC_DISC, 1),
                    2, 7, 0.05f));
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(Items.EMERALD, 8),
                    new ItemStack(ModItems.FEELING_GOOD_MUSIC_DISC, 1),
                    2, 7, 0.05f));
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(Items.EMERALD, 8),
                    new ItemStack(ModItems.WE_ARE_ONE_MUSIC_DISC, 1),
                    2, 7, 0.05f));
        });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.SOUND_MASTER, 2, factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(ModItems.RUBY_PICKAXE, 1),
                    new ItemStack(ModItems.RUBY_AXE, 1),
                    23, 13, 0.075f));
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(ModItems.RUBY_AXE, 1),
                    new ItemStack(ModItems.RUBY_PICKAXE, 1),
                    23, 13, 0.075f));
        });
    }
}
