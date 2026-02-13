# EASY FIX - Manual Gradle Installation Method

The gradlew.bat wrapper is missing some files. Here's the easiest way to build the mod:

## Option 1: Use BUILD.bat (EASIEST)

1. Double-click `BUILD.bat` in the mod folder
2. It will automatically download what's needed and build the mod
3. Wait for "BUILD SUCCESSFUL"
4. Your mod will be in `build\libs\`

## Option 2: Install Gradle Manually

If BUILD.bat doesn't work, install Gradle yourself:

### Step 1: Download Gradle
1. Go to: https://gradle.org/releases/
2. Download **Gradle 8.1.1** (Binary-only)
3. Extract the ZIP to `C:\Gradle` (or anywhere you like)

### Step 2: Add Gradle to PATH
1. Press `Windows Key` and search for "Environment Variables"
2. Click "Edit the system environment variables"
3. Click "Environment Variables" button
4. Under "System variables", find "Path" and click "Edit"
5. Click "New"
6. Add: `C:\Gradle\gradle-8.1.1\bin` (or wherever you extracted it)
7. Click "OK" on all windows
8. **Close and reopen Command Prompt**

### Step 3: Build with Gradle
1. Open Command Prompt in the mod folder
2. Type: `gradle build`
3. Press Enter
4. Wait for completion
5. Find your mod in: `build\libs\villagerrecruits-damagefix-1.0.0.jar`

## Option 3: Use an IDE (FOR DEVELOPERS)

If you plan to modify the mod code:

### Using IntelliJ IDEA:
1. Download IntelliJ IDEA Community (free): https://www.jetbrains.com/idea/download/
2. Install it
3. Open IntelliJ IDEA
4. Click "Open"
5. Select the `villager_recruits_damage_fix` folder
6. Wait for Gradle to sync (5-10 minutes)
7. Once done, open the Gradle panel on the right
8. Navigate to: Tasks → build → build
9. Double-click "build"
10. Your mod will be in `build\libs\`

## Option 4: Pre-compiled JAR (IF AVAILABLE)

If someone has already built the mod, you can get a pre-compiled JAR file and skip building entirely!

Just copy the `.jar` file directly to your mods folder:
- Press `Windows Key + R`
- Type: `%appdata%\.minecraft\mods`
- Paste the JAR file there

## Still Having Issues?

Try these commands in order:

```batch
REM Clean previous build attempts
gradlew.bat clean

REM Try building again
gradlew.bat build

REM If that fails, use gradle directly
gradle clean build
```

## Quick Checklist:

✅ Java 17+ installed?
✅ Internet connection working?
✅ In the correct folder? (should see build.gradle file)
✅ Enough disk space? (need ~1-2 GB)
✅ Antivirus not blocking downloads?

If all else fails, the BUILD.bat script should handle everything automatically!
