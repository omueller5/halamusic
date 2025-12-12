package net.owen.tutorialmod.item;

import com.terraformersmc.terraform.boat.api.item.TerraformBoatItemHelper;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.owen.tutorialmod.TutorialMod;
import net.owen.tutorialmod.block.ModBlocks;
import net.owen.tutorialmod.entity.ModBoats;
import net.owen.tutorialmod.entity.ModEntities;
import net.owen.tutorialmod.item.custom.DiceItem;
import net.owen.tutorialmod.item.custom.MetalDetectorItem;
import net.owen.tutorialmod.item.custom.ModArmorItem;
import net.owen.tutorialmod.sound.ModSounds;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item RUBY = registerItem("ruby", new Item(new FabricItemSettings()));
    public static final Item RAW_RUBY = registerItem("raw_ruby", new Item(new FabricItemSettings()));

    public static final Item METAL_DETECTOR = registerItem("metal_detector",
            new MetalDetectorItem(new FabricItemSettings().maxDamage(64)));

    public static final Item TOMATO = registerItem("tomato", new Item(new FabricItemSettings().food(ModFoodComponents.TOMATO)));
    public static final Item COAL_BRIQUETTE = registerItem("coal_briquette",
            new Item(new FabricItemSettings()));


    public static final Item RUBY_STAFF = registerItem("ruby_staff",
            new Item(new FabricItemSettings().maxCount(1)));


    public static final Item RUBY_PICKAXE = registerItem("ruby_pickaxe",
            new PickaxeItem(ModToolMaterial.RUBY, 2, 2f, new FabricItemSettings()));
    public static final Item RUBY_AXE = registerItem("ruby_axe",
            new AxeItem(ModToolMaterial.RUBY, 3, 1f, new FabricItemSettings()));
    public static final Item RUBY_SHOVEL = registerItem("ruby_shovel",
            new ShovelItem(ModToolMaterial.RUBY, 0, 0f, new FabricItemSettings()));
    public static final Item RUBY_SWORD = registerItem("ruby_sword",
            new SwordItem(ModToolMaterial.RUBY, 5, 3f, new FabricItemSettings()));
    public static final Item RUBY_HOE = registerItem("ruby_hoe",
            new HoeItem(ModToolMaterial.RUBY, 0, 0f, new FabricItemSettings()));


    public static final Item RUBY_HELMET = registerItem("ruby_helmet",
            new ModArmorItem(ModArmorMaterials.RUBY, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item RUBY_CHESTPLATE = registerItem("ruby_chestplate",
            new ArmorItem(ModArmorMaterials.RUBY, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item RUBY_LEGGINGS = registerItem("ruby_leggings",
            new ArmorItem(ModArmorMaterials.RUBY, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item RUBY_BOOTS = registerItem("ruby_boots",
            new ArmorItem(ModArmorMaterials.RUBY, ArmorItem.Type.BOOTS, new FabricItemSettings()));

    public static final Item TOMATO_SEEDS = registerItem("tomato_seeds",
            new AliasedBlockItem(ModBlocks.TOMATO_CROP, new FabricItemSettings()));

    public static final Item CORN_SEEDS = registerItem("corn_seeds",
            new AliasedBlockItem(ModBlocks.CORN_CROP, new FabricItemSettings()));
    public static final Item CORN = registerItem("corn",
            new Item(new FabricItemSettings()));

    public static final Item BAR_BRAWL_MUSIC_DISC = registerItem("bar_brawl_music_disc",
            new MusicDiscItem(7, ModSounds.BAR_BRAWL, new FabricItemSettings().maxCount(1), 122));

    public static final Item I_PROMISE_MUSIC_DISC = registerItem("i_promise_music_disc", new MusicDiscItem(7, ModSounds.I_PROMISE,
            new FabricItemSettings().maxCount(1), 215));
    public static final Item FAR_AWAY_MUSIC_DISC = registerItem("far_away_music_disc", new MusicDiscItem(7, ModSounds.FAR_AWAY,
            new FabricItemSettings().maxCount(1), 225));
    public static final Item WORSHIP_ME_MUSIC_DISC = registerItem("worship_me_music_disc", new MusicDiscItem(7, ModSounds.WORSHIP_ME,
            new FabricItemSettings().maxCount(1), 248));
    public static final Item WE_ALL_KNOW_MUSIC_DISC = registerItem("we_all_know_music_disc", new MusicDiscItem(7, ModSounds.WE_ALL_KNOW,
            new FabricItemSettings().maxCount(1), 205));
    public static final Item EDENS_DUST_MUSIC_DISC = registerItem("edens_dust_music_disc", new MusicDiscItem(7, ModSounds.EDENS_DUST,
            new FabricItemSettings().maxCount(1), 256));
    public static final Item CHARMING_MUSIC_DISC = registerItem("charming_music_disc", new MusicDiscItem(7, ModSounds.CHARMING,
            new FabricItemSettings().maxCount(1), 186));
    public static final Item JUST_BETTER_MUSIC_DISC = registerItem("just_better_music_disc", new MusicDiscItem(7, ModSounds.JUST_BETTER,
            new FabricItemSettings().maxCount(1), 175));
    public static final Item KILL_ME_MUSIC_DISC = registerItem("kill_me_music_disc", new MusicDiscItem(7, ModSounds.KILL_ME,
            new FabricItemSettings().maxCount(1), 229));
    public static final Item FEELING_GOOD_MUSIC_DISC = registerItem("feeling_good_music_disc", new MusicDiscItem(7, ModSounds.FEELING_GOOD,
            new FabricItemSettings().maxCount(1), 77));
    public static final Item WE_ARE_ONE_MUSIC_DISC = registerItem("we_are_one_music_disc", new MusicDiscItem(7, ModSounds.WE_ARE_ONE,
            new FabricItemSettings().maxCount(1), 260));

    public static final Item PORCUPINE_SPAWN_EGG = registerItem("porcupine_spawn_egg",
            new SpawnEggItem(ModEntities.PORCUPINE, 0xa86518, 0x3b260f, new FabricItemSettings()));

    public static final Item CHESTNUT_SIGN = registerItem("chestnut_sign",
            new SignItem(new FabricItemSettings().maxCount(16), ModBlocks.STANDING_CHESTNUT_SIGN, ModBlocks.WALL_CHESTNUT_SIGN));
    public static final Item HANGING_CHESTNUT_SIGN = registerItem("chestnut_hanging_sign",
            new HangingSignItem(ModBlocks.HANGING_CHESTNUT_SIGN, ModBlocks.WALL_HANGING_CHESTNUT_SIGN, new FabricItemSettings().maxCount(16)));

    public static final Item CHESTNUT_BOAT = TerraformBoatItemHelper.registerBoatItem(ModBoats.CHESTNUT_BOAT_ID, ModBoats.CHESTNUT_BOAT_KEY, false);
    public static final Item CHESTNUT_CHEST_BOAT = TerraformBoatItemHelper.registerBoatItem(ModBoats.CHESTNUT_CHEST_BOAT_ID, ModBoats.CHESTNUT_BOAT_KEY, true);

    public static final Item DICE = registerItem("dice", new DiceItem(new FabricItemSettings()));


    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
        entries.add(RUBY);
        entries.add(RAW_RUBY);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(TutorialMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        TutorialMod.LOGGER.info("Registering Mod Items for " + TutorialMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
    }
}
