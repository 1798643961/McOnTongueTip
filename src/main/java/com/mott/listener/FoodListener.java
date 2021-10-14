package com.mott.listener;

import com.mott.registry.ItemGroupRegistry;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.FoodComponents;
import net.minecraft.item.Item;

public class FoodListener {

    public static final Item FRIED_EGG = new Item(ofDefaultFoodSettings(FoodComponents.COOKED_CHICKEN));
    public static final Item TOMATO = new Item(ofDefaultFoodSettings(FoodComponents.APPLE));
    public static final Item RICE = new Item(ofDefaultFoodSettings(FoodComponents.APPLE));
    public static final Item MOON_SLIME_JAM = new Item(ofDefaultFoodSettings(FoodComponents.BEETROOT_SOUP));
    public static final Item MOON_SLIME_SANDWICH = new Item(ofDefaultFoodSettings(FoodComponents.COOKED_BEEF));
    public static final Item WATER_SLIME_JAM = new Item(ofDefaultFoodSettings(FoodComponents.BEETROOT_SOUP));
    public static final Item WATER_SLIME_SANDWICH = new Item(ofDefaultFoodSettings(FoodComponents.COOKED_BEEF));

    public static final Item APPLE_PIE = new Item (ofDefaultFoodSettings(FoodComponents.APPLE));
    public static final Item BERRY_JELLY = new Item (ofDefaultFoodSettings(FoodComponents.COOKED_CHICKEN));
    public static final Item BERRY_PIE = new Item (ofDefaultFoodSettings(FoodComponents.COOKED_BEEF));
    public static final Item BURRITO_BEEF = new Item (ofDefaultFoodSettings(FoodComponents.COOKED_BEEF));
    public static final Item DOUGH = new Item (ofDefaultFoodSettings(FoodComponents.BEETROOT));
    public static final Item CHEESE = new Item (ofDefaultFoodSettings(FoodComponents.COOKED_COD));
    public static final Item BURRITO_FISH = new Item (ofDefaultFoodSettings(FoodComponents.COOKED_COD));
    public static final Item BURRITO_VEGGIE = new Item (ofDefaultFoodSettings(FoodComponents.COOKED_CHICKEN));
    public static final Item CARAMEL = new Item (ofDefaultFoodSettings(FoodComponents.APPLE));
    public static final Item BERRY = new Item (ofDefaultFoodSettings(FoodComponents.APPLE));
    public static final Item CARAMEL_DONUT = new Item (ofDefaultFoodSettings(FoodComponents.APPLE));
    public static final Item CHEESE_FRIES = new Item (ofDefaultFoodSettings(FoodComponents.COOKED_MUTTON));
    public static final Item CHOCOLATE_PIE = new Item (ofDefaultFoodSettings(FoodComponents.COOKED_BEEF));
    public static final Item COOKIE_CAT = new Item (ofDefaultFoodSettings(FoodComponents.COOKIE));
    public static final Item CREAM_COOKIE = new Item (ofDefaultFoodSettings(FoodComponents.COOKIE));
    public static final Item LION_LICKER = new Item (ofDefaultFoodSettings(FoodComponents.COOKED_BEEF));
    public static final Item NIGIRI_COD = new Item (ofDefaultFoodSettings(FoodComponents.COOKED_CHICKEN));
    public static final Item NIGIRI_SALMON = new Item (ofDefaultFoodSettings(FoodComponents.COOKED_CHICKEN));
    public static final Item NIGIRI_SQUID = new Item (ofDefaultFoodSettings(FoodComponents.COOKED_CHICKEN));
    public static final Item NIGIRI_TROPICAL = new Item (ofDefaultFoodSettings(FoodComponents.COOKED_CHICKEN));
    public static final Item ONIGIRI = new Item (ofDefaultFoodSettings(FoodComponents.COOKED_CHICKEN));
    public static final Item ROLL_SEA_PICKLE = new Item (ofDefaultFoodSettings(FoodComponents.COOKED_MUTTON));
    public static final Item SLIME_PIE = new Item (ofDefaultFoodSettings(FoodComponents.COOKED_CHICKEN));
    public static final Item SQUID_COOKED = new Item (ofDefaultFoodSettings(FoodComponents.COOKED_CHICKEN));
    public static final Item SUGAR_DONUT = new Item (ofDefaultFoodSettings(FoodComponents.COOKED_CHICKEN));
    public static final Item CARAMEL_APPLE = new Item (ofDefaultFoodSettings(FoodComponents.COOKED_CHICKEN));
    public static final Item SQUID_RAW = new Item (ofDefaultFoodSettings(FoodComponents.COOKED_CHICKEN));
    public static final Item BURGER_BEAN = new Item (ofDefaultFoodSettings(FoodComponents.BREAD));
    public static final Item CHRISTMAS_PUDDING = new Item (ofDefaultFoodSettings(FoodComponents.BREAD));
    public static final Item FRUITCAKE = new Item (ofDefaultFoodSettings(FoodComponents.BREAD));

    public static final Item NACHOS_CHEESE = new Item (ofDefaultFoodSettings(FoodComponents.BREAD));
    public static final Item TOFU = new Item (ofDefaultFoodSettings(FoodComponents.BREAD));
    public static final Item BACON = new Item (ofDefaultFoodSettings(FoodComponents.PORKCHOP));
    public static final Item BACON_AND_EGG = new Item (ofDefaultFoodSettings(FoodComponents.COOKED_BEEF));
    public static final Item COOKED_BACON = new Item (ofDefaultFoodSettings(FoodComponents.COOKED_PORKCHOP));
    public static final Item BEETROOT_NOODLES = new Item (ofDefaultFoodSettings(FoodComponents.BREAD));
    public static final Item BAT_WING = new Item (ofDefaultFoodSettings(FoodComponents.DRIED_KELP));
    public static final Item BLAZE_CREAM = new Item (ofDefaultFoodSettings(FoodComponents.COOKED_MUTTON));
    public static final Item CACTUS_FRUIT = new Item (ofDefaultFoodSettings(FoodComponents.APPLE));
    public static final Item CARROT_PIE = new Item (ofDefaultFoodSettings(FoodComponents.PUMPKIN_PIE));
    public static final Item CARROT_SEED_SOUP = new Item (ofDefaultFoodSettings(FoodComponents.BREAD));
    public static final Item STARVING_FRUIT = new Item (ofDefaultFoodSettings(FoodComponents.ENCHANTED_GOLDEN_APPLE));
    public static final Item SPIDER_SOUP = new Item (ofDefaultFoodSettings(FoodComponents.COOKED_CHICKEN));
    public static final Item NETHER_WART_SOUP = new Item (ofDefaultFoodSettings(FoodComponents.COOKED_CHICKEN));
    public static final Item COOKED_BAT_WING = new Item (ofDefaultFoodSettings(FoodComponents.COOKED_PORKCHOP));
    public static final Item HORSE_MEAT = new Item (ofDefaultFoodSettings(FoodComponents.BEEF));
    public static final Item COOKED_HORSE_MEAT = new Item (ofDefaultFoodSettings(FoodComponents.COOKED_BEEF));
    public static final Item LLAMA_MEAT = new Item (ofDefaultFoodSettings(FoodComponents.BEEF));
    public static final Item COOKED_LLAMA_MEAT = new Item (ofDefaultFoodSettings(FoodComponents.COOKED_BEEF));
    public static final Item WOLF_MEAT = new Item (ofDefaultFoodSettings(FoodComponents.BEEF));
    public static final Item COOKED_WOLF_MEAT = new Item (ofDefaultFoodSettings(FoodComponents.COOKED_BEEF));

    private static Item.Settings ofDefaultFoodSettings(FoodComponent component) {
        return new Item.Settings().group(ItemGroupRegistry.FOOD_GROUP).food(component);
    }
}
