# Villager Recruits Damage Fix

A Forge mod for Minecraft 1.20.1 that removes the damage cap for Villager Recruits bowmen, allowing high-level Power enchantments to deal their full intended damage even against Protection IV armor.

## The Problem

In the Villager Recruits mod, when you give a bowman a bow with Power 60+, the damage gets capped when hitting players/entities wearing Protection IV armor. The bowman only deals as much damage as a normal Power 5 bow would deal.

## The Solution

This mod intercepts arrow damage from Villager Recruits bowmen and applies the full damage based on the bow's actual Power level, bypassing the damage cap.

## Features

- ✅ Removes damage cap for bowmen arrows
- ✅ Configurable damage multiplier
- ✅ Optional armor bypass
- ✅ Debug logging for testing
- ✅ Works with any Power enchantment level

## Installation

### Method 1: Use Pre-built JAR (Easiest)

1. Download the latest `.jar` file from the releases
2. Place it in your Minecraft `mods` folder
3. Launch Minecraft with Forge 1.20.1
4. Done!

### Method 2: Build from Source

**Requirements:**
- Java Development Kit (JDK) 17 or higher
- Internet connection (for Gradle to download dependencies)

**Steps:**

1. Download or extract this mod folder
2. Open a terminal/command prompt in the mod folder
3. Run the build command:

   **Windows:**
   ```
   gradlew.bat build
   ```

   **Mac/Linux:**
   ```
   ./gradlew build
   ```

4. Wait for the build to complete (first time may take 5-10 minutes)
5. Find the built mod JAR in: `build/libs/villagerrecruits-damagefix-1.0.0.jar`
6. Copy this JAR file to your Minecraft `mods` folder
7. Launch Minecraft!

## Configuration

After running the game once, a config file will be created at:
`config/villagerrecruitsdamagefix-common.toml`

### Config Options:

```toml
[Villager Recruits Damage Fix Configuration]
    # Damage multiplier for bowman arrows (1.0 = normal, 2.0 = double damage)
    # Range: 0.1 ~ 10.0
    damageMultiplier = 1.0
    
    # Should bowman arrows bypass armor protection?
    # true = ignore armor, false = respect armor
    ignoreArmor = false
    
    # Enable debug logging for damage calculations
    enableDebugLogging = false
```

### Configuration Examples:

**Default (Remove cap only):**
```toml
damageMultiplier = 1.0
ignoreArmor = false
```
This lets the bow deal its full Power 60 damage, but armor still provides protection.

**Ignore armor completely:**
```toml
damageMultiplier = 1.0
ignoreArmor = true
```
This makes the bowman's arrows ignore all armor protection (like /kill command damage).

**Extra damage + ignore armor:**
```toml
damageMultiplier = 1.5
ignoreArmor = true
```
This makes arrows 50% stronger AND ignore armor.

## How It Works

The mod uses Forge's event system to intercept damage events (`LivingHurtEvent`) when:
1. The damage source is an arrow
2. The arrow was shot by an entity named "Bowman"
3. Then it recalculates and applies the proper damage

This approach is compatible with most other mods and doesn't modify Villager Recruits directly.

## Compatibility

- **Minecraft Version:** 1.20.1
- **Mod Loader:** Forge 47.2.0 or higher
- **Required Mods:** None (works independently)
- **Compatible With:** Villager Recruits and most other mods

## Troubleshooting

**The mod isn't working:**
1. Make sure you're using Forge 1.20.1
2. Check that the mod JAR is in the `mods` folder
3. Enable debug logging in the config and check the logs
4. Verify the bowman's name contains "Bowman"

**Damage is still capped:**
1. Try setting `ignoreArmor = true` in the config
2. Try increasing `damageMultiplier` to 1.5 or 2.0
3. Enable debug logging and check the game logs for damage calculations

**The mod crashes:**
- Make sure you're using Java 17 or higher
- Check that all dependencies downloaded correctly
- Post your crash log for help

## Building for Development

If you want to modify the mod:

1. Open the folder in IntelliJ IDEA or Eclipse
2. Let Gradle import the project
3. Run `gradlew genIntellijRuns` (or `genEclipseRuns`)
4. Use the generated run configurations to test

## License

This mod is provided as-is for use with Minecraft and the Villager Recruits mod.

## Credits

- Created to solve the bowman damage cap issue
- Uses Forge event system
- Compatible with Villager Recruits mod

## Support

If you encounter issues:
1. Check the config file
2. Enable debug logging
3. Check the Minecraft logs
4. Verify your Forge version is 1.20.1

Enjoy your powerful bowmen! 🏹
