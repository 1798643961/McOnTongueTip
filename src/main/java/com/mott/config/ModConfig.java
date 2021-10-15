package com.mott.config;

import com.mott.util.Config;

public class ModConfig {

    @Config(config = "common", category = "common", key = "showFutaCowInfo", comment = "Enable or Disable to show Futa Cow sit info")
    public static boolean showFutaCowInfo = true;

    @Config(config = "common", category = "common", key = "futaCowSpawn", comment = "Enable or Disable to let Futa Cow Spawn")
    public static boolean futaCowSpawn = true;

    @Config(config = "common", category = "common", key = "moonSlimeSpawn", comment = "Enable or Disable to let Moon Slime Spawn")
    public static boolean moonSlimeSpawn = true;

    @Config(config = "common", category = "common", key = "waterSlimeSpawn", comment = "Enable or Disable to let Water Slime Spawn")
    public static boolean waterSlimeSpawn = true;

    @Config(config = "common", category = "common", key = "jungleSlimeSpawn", comment = "Enable or Disable to let Jungle Slime Spawn")
    public static boolean jungleSlimeSpawn = true;
}
