package com.mott.registry;

import com.mott.util.Reference;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import static com.mott.listener.FoodListener.*;

public class FoodRegistry {

    public static void registerFood() {
        initFood("fried_egg", FRIED_EGG);
        initFood("moon_slime_jam", MOON_SLIME_JAM);
        initFood("moon_slime_sandwich", MOON_SLIME_SANDWICH);
        initFood("water_slime_jam", WATER_SLIME_JAM);
        initFood("water_slime_sandwich", WATER_SLIME_SANDWICH);
        initFood("jungle_slime_jam", JUNGLE_SLIME_JAM);
        initFood("jungle_slime_sandwich", JUNGLE_SLIME_SANDWICH);
        initFood("apple_pie", APPLE_PIE);
        initFood("berry_jelly", BERRY_JELLY);
        initFood("berry_pie", BERRY_PIE);
        initFood("burrito_beef", BURRITO_BEEF);
        initFood("dough", DOUGH);
        initFood("cheese", CHEESE);
        initFood("burrito_fish", BURRITO_FISH);
        initFood("burrito_veggie", BURRITO_VEGGIE);
        initFood("caramel", CARAMEL);
        initFood("berry", BERRY);
        initFood("caramel_donut", CARAMEL_DONUT);
        initFood("cheese_fries", CHEESE_FRIES);
        initFood("chocolate_pie", CHOCOLATE_PIE);
        initFood("cookie_cat", COOKIE_CAT);
        initFood("cream_cookie", CREAM_COOKIE);
        initFood("lion_licker", LION_LICKER);
        initFood("nigiri_cod", NIGIRI_COD);
        initFood("nigiri_salmon", NIGIRI_SALMON);
        initFood("nigiri_squid", NIGIRI_SQUID);
        initFood("nigiri_tropical", NIGIRI_TROPICAL);
        initFood("onigiri", ONIGIRI);
        initFood("roll_sea_pickle", ROLL_SEA_PICKLE);
        initFood("slime_pie", SLIME_PIE);
        initFood("squid_cooked", SQUID_COOKED);
        initFood("sugar_donut", SUGAR_DONUT);
        initFood("caramel_apple", CARAMEL_APPLE);
        initFood("squid_raw", SQUID_RAW);
        initFood("burger_bean", BURGER_BEAN);
        initFood("christmas_pudding", CHRISTMAS_PUDDING);
        initFood("fruitcake", FRUITCAKE);
        initFood("tofu", TOFU);
        initFood("nachos_cheese", NACHOS_CHEESE);
        initFood( "bacon", BACON);
        initFood("bacon_and_egg", BACON_AND_EGG);
        initFood("cooked_bacon", COOKED_BACON);
        initFood("beetroot_noodles", BEETROOT_NOODLES);
        initFood("bat_wing", BAT_WING);
        initFood("blaze_cream", BLAZE_CREAM);
        initFood("cactus_fruit", CACTUS_FRUIT);
        initFood("carrot_pie", CARROT_PIE);
        initFood("carrot_seed_soup", CARROT_SEED_SOUP);
        initFood("starving_fruit", STARVING_FRUIT);
        initFood("spider_soup", SPIDER_SOUP);
        initFood("nether_wart_soup", NETHER_WART_SOUP);
        initFood("cooked_bat_wing", COOKED_BAT_WING);
        initFood("horse_meat", HORSE_MEAT);
        initFood("cooked_horse_meat", COOKED_HORSE_MEAT);
        initFood("llama_meat", LLAMA_MEAT);
        initFood("cooked_llama_meat", COOKED_LLAMA_MEAT);
        initFood("wolf_meat", WOLF_MEAT);
        initFood("cooked_wolf_meat", COOKED_WOLF_MEAT);
        initFood("rice", RICE);
        initFood("tomato", TOMATO);
        initFood("shit_jam", SHIT_JAM);
        initFood("aromatic_milkshake", AROMATIC_MILKSHAKE);
    }

    private static void initFood(String path, Item item) {
        Registry.register(Registry.ITEM, new Identifier(Reference.MODID, path), item);
    }
}
