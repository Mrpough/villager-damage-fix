# Quick Build Guide

## Prerequisites
- Java JDK 17 or higher installed
- Internet connection

## Building the Mod

### On Windows:
1. Open Command Prompt or PowerShell
2. Navigate to this folder
3. Run: `gradlew.bat build`
4. Wait for completion (5-10 minutes first time)
5. Get your mod from: `build/libs/villagerrecruits-damagefix-1.0.0.jar`

### On Mac/Linux:
1. Open Terminal
2. Navigate to this folder
3. Run: `./gradlew build`
4. Wait for completion (5-10 minutes first time)
5. Get your mod from: `build/libs/villagerrecruits-damagefix-1.0.0.jar`

## Installing the Mod
1. Copy the JAR file from `build/libs/`
2. Paste it into your Minecraft `mods` folder
3. Launch Minecraft with Forge 1.20.1

## First Time Setup
The first build will take longer because Gradle needs to:
- Download Minecraft and Forge
- Download dependencies
- Set up the development environment

Subsequent builds will be much faster!

## Troubleshooting

**"Java not found" error:**
- Install Java JDK 17: https://adoptium.net/

**"Permission denied" on Mac/Linux:**
- Run: `chmod +x gradlew`
- Then try again: `./gradlew build`

**Build fails:**
- Make sure you have internet connection
- Delete the `.gradle` folder and try again
- Check that you have at least 3GB of RAM available

## What Gets Built?

After building, you'll find:
- `build/libs/villagerrecruits-damagefix-1.0.0.jar` - This is your mod!
- `build/libs/villagerrecruits-damagefix-1.0.0-sources.jar` - Source code (optional)

Only the first JAR file is needed to play!
