package com.mott.registry;

import com.mott.listener.FoodListener;
import com.mott.listener.ItemListener;
import net.fabricmc.fabric.api.loot.v1.FabricLootPoolBuilder;
import net.fabricmc.fabric.api.loot.v1.event.LootTableLoadingCallback;
import net.minecraft.item.Item;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.util.Identifier;

import static com.mott.listener.LootTableListener.*;


public class LootTableRegistry {

    public static void registerLootTable() {

        /*Block LootTables*/
        initLootTable(GRASS_LOOT_TABLE_ID, 1, 0.2F, ItemListener.RICE_SEED);
        initLootTable(TALLGRASS_LOOT_TABLE_ID, 1, 0.2F, ItemListener.RICE_SEED);
        initLootTable(GRASS_LOOT_TABLE_ID, 1, 0.2F, ItemListener.TOMATO_SEED);
        initLootTable(TALLGRASS_LOOT_TABLE_ID, 1, 0.2F, ItemListener.TOMATO_SEED);
        initLootTable(GRASS_LOOT_TABLE_ID, 1, 0.2F, ItemListener.GREEN_TEA_SEED);
        initLootTable(TALLGRASS_LOOT_TABLE_ID, 1, 0.2F, FoodListener.BERRY);
        initLootTable(GRASS_LOOT_TABLE_ID, 1, 0.2F, FoodListener.BERRY);

        /*Entity LootTables*/
        initLootTable(SQUID_RAW_TABLE_ID, 1, 0.7F, FoodListener.SQUID_RAW);
        initLootTable(GLOW_SQUID_RAW_TABLE_ID, 1, 0.7F, FoodListener.SQUID_RAW);
        initLootTable(BAT_WING_TABLE_ID, 1, 0.7F, FoodListener.BAT_WING);
        initLootTable(HORSE_MEAT_TABLE_ID, 1, 0.7F, FoodListener.HORSE_MEAT);
        initLootTable(LLAMA_MEAT_TABLE_ID, 1, 0.7F, FoodListener.LLAMA_MEAT);
        initLootTable(WOLF_MEAT_TABLE_ID, 1, 0.7F, FoodListener.WOLF_MEAT);
        initLootTable(CREEPER_HIDE_TABLE_ID, 1, 0.8F, ItemListener.CREEPER_HIDE);
    }

    private static void initLootTable(Identifier identifier, int number, float chance, Item item) {
        LootTableLoadingCallback.EVENT.register((resourceManager, lootManager, id, table, setter) -> {
            if (identifier.equals(id)) {
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                        .rolls(ConstantLootNumberProvider.create(number))
                        .withCondition(RandomChanceLootCondition.builder(chance).build())
                        .with(ItemEntry.builder(item));

                table.pool(poolBuilder);
            }
        });
    }
}
