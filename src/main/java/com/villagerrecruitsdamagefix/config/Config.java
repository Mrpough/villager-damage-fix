package com.villagerrecruitsdamagefix.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class Config {
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;

    public static final ForgeConfigSpec.DoubleValue DAMAGE_MULTIPLIER;
    public static final ForgeConfigSpec.BooleanValue IGNORE_ARMOR;
    public static final ForgeConfigSpec.BooleanValue ENABLE_DEBUG_LOGGING;

    static {
        BUILDER.push("Villager Recruits Damage Fix Configuration");

        DAMAGE_MULTIPLIER = BUILDER
                .comment("Damage multiplier for bowman arrows (1.0 = normal, 2.0 = double damage)")
                .defineInRange("damageMultiplier", 1.0, 0.1, 10.0);

        IGNORE_ARMOR = BUILDER
                .comment("Should bowman arrows bypass armor protection? (true = ignore armor, false = respect armor)")
                .define("ignoreArmor", false);

        ENABLE_DEBUG_LOGGING = BUILDER
                .comment("Enable debug logging for damage calculations")
                .define("enableDebugLogging", false);

        BUILDER.pop();
        SPEC = BUILDER.build();
    }
}
