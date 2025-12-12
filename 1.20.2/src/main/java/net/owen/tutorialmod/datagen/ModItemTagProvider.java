package net.owen.tutorialmod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.owen.tutorialmod.block.ModBlocks;
import net.owen.tutorialmod.block.entity.ModBlockEntities;
import net.owen.tutorialmod.item.ModItems;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.RUBY_HELMET, ModItems.RUBY_CHESTPLATE, ModItems.RUBY_LEGGINGS, ModItems.RUBY_BOOTS);

        getOrCreateTagBuilder(ItemTags.MUSIC_DISCS)
                .add(ModItems.BAR_BRAWL_MUSIC_DISC, ModItems.I_PROMISE_MUSIC_DISC, ModItems.FAR_AWAY_MUSIC_DISC, ModItems.WORSHIP_ME_MUSIC_DISC, ModItems.WE_ALL_KNOW_MUSIC_DISC,
                        ModItems.EDENS_DUST_MUSIC_DISC, ModItems.CHARMING_MUSIC_DISC, ModItems.JUST_BETTER_MUSIC_DISC, ModItems.KILL_ME_MUSIC_DISC,
                        ModItems.FEELING_GOOD_MUSIC_DISC, ModItems.WE_ARE_ONE_MUSIC_DISC);

        getOrCreateTagBuilder(ItemTags.CREEPER_DROP_MUSIC_DISCS)
                .add(ModItems.BAR_BRAWL_MUSIC_DISC, ModItems.I_PROMISE_MUSIC_DISC, ModItems.FAR_AWAY_MUSIC_DISC, ModItems.WORSHIP_ME_MUSIC_DISC, ModItems.WE_ALL_KNOW_MUSIC_DISC,
                        ModItems.EDENS_DUST_MUSIC_DISC, ModItems.CHARMING_MUSIC_DISC, ModItems.JUST_BETTER_MUSIC_DISC, ModItems.KILL_ME_MUSIC_DISC,
                        ModItems.FEELING_GOOD_MUSIC_DISC, ModItems.WE_ARE_ONE_MUSIC_DISC);

        getOrCreateTagBuilder(ItemTags.PLANKS)
                .add(ModBlocks.CHESTNUT_PLANKS.asItem());

        getOrCreateTagBuilder(ItemTags.LOGS_THAT_BURN)
                .add(ModBlocks.CHESTNUT_LOG.asItem())
                .add(ModBlocks.CHESTNUT_WOOD.asItem())
                .add(ModBlocks.STRIPPED_CHESTNUT_LOG.asItem())
                .add(ModBlocks.STRIPPED_CHESTNUT_WOOD.asItem());
    }
}
