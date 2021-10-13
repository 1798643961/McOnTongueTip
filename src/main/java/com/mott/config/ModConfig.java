package com.mott.config;

import com.mott.util.Config;

public class ModConfig {

    @Config(config = "common", category = "common", key = "showFutaCowInfo", comment = "Enable or Disable to show Futa Cow sit info")
    public static boolean showFutaCowInfo = true;

}
