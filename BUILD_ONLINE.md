# Build Your Mod Online - FREE (No Installation Required!)

## You'll use GitHub to build the mod automatically in the cloud!

---

## Step 1: Create a GitHub Account (if you don't have one)

1. Go to: https://github.com/
2. Click "Sign up"
3. Follow the steps to create a free account
4. Verify your email

**Time needed:** 2 minutes

---

## Step 2: Create a New Repository

1. Log in to GitHub
2. Click the **"+"** button in the top-right corner
3. Click **"New repository"**
4. Fill in:
   - **Repository name:** `villager-recruits-damage-fix`
   - **Description:** "Minecraft mod to fix bowman damage cap"
   - **Public** or **Private** (your choice)
   - ✅ **Check** "Add a README file"
5. Click **"Create repository"**

**Time needed:** 1 minute

---

## Step 3: Upload the Mod Files

You have two options:

### OPTION A: Upload via Web (Easier)

1. In your new repository, click **"Add file"** → **"Upload files"**
2. Drag and drop ALL files from the extracted `villager_recruits_damage_fix` folder
   - Make sure to include the `.github` folder!
   - You can drag the entire folder contents at once
3. At the bottom, click **"Commit changes"**

### OPTION B: Upload as ZIP then Extract

1. Click **"Add file"** → **"Upload files"**
2. Upload ONLY these files/folders:
   ```
   src/
   gradle/
   .github/
   build.gradle
   gradle.properties
   gradlew
   gradlew.bat
   settings.gradle
   README.md
   ```
3. Click **"Commit changes"**

**Time needed:** 2 minutes

---

## Step 4: Build the Mod (Automatic!)

Once you've uploaded the files:

1. Click on the **"Actions"** tab at the top of your repository
2. You should see a workflow running (yellow circle)
3. Wait 2-5 minutes for it to complete
4. When done, you'll see a **green checkmark** ✅

**Time needed:** 2-5 minutes (automatic)

---

## Step 5: Download Your Built Mod

1. Click on the completed workflow (the one with the green checkmark)
2. Scroll down to the **"Artifacts"** section
3. Click on **"Villager-Recruits-Damage-Fix"**
4. A ZIP file will download containing your mod JAR!
5. Extract the ZIP
6. Inside you'll find: `villagerrecruits-damagefix-1.0.0.jar`

**Time needed:** 30 seconds

---

## Step 6: Install the Mod

1. Press `Windows Key + R`
2. Type: `%appdata%\.minecraft\mods`
3. Press Enter
4. Copy the `villagerrecruits-damagefix-1.0.0.jar` file here
5. Launch Minecraft with Forge 1.20.1

**Done! 🎉**

---

## Troubleshooting

### "Actions" tab is not showing up
- Make sure you uploaded the `.github` folder with the `workflows` subfolder
- Try clicking "Actions" tab and enabling workflows

### Build fails
- Check that you uploaded ALL the files, especially:
  - `build.gradle`
  - `gradle/` folder
  - `src/` folder
  - `.github/workflows/build.yml`

### Can't find the .github folder when uploading
- On Windows, hidden folders might not show
- Press `Ctrl + H` in File Explorer to show hidden files
- Or use OPTION B and create the files directly on GitHub

---

## Alternative: Use GitHub Desktop (Even Easier!)

If you want a visual tool:

1. Download GitHub Desktop: https://desktop.github.com/
2. Install it (it's lightweight, ~100MB)
3. Log in with your GitHub account
4. Click "Clone Repository" → select your repository
5. Copy all mod files to the cloned folder
6. Click "Commit to main"
7. Click "Push origin"
8. Check GitHub Actions for the build!

---

## Visual Guide

Here's what you'll see:

**GitHub Actions Page:**
```
✅ Build Minecraft Mod
   main (green checkmark)
   
   Artifacts
   📦 Villager-Recruits-Damage-Fix    [Download]
```

Click that Download button to get your mod!

---

## Summary: Total Time = ~10 minutes

1. ✅ Create GitHub account (2 min)
2. ✅ Create repository (1 min)
3. ✅ Upload files (2 min)
4. ✅ Wait for build (5 min - automatic)
5. ✅ Download mod (30 sec)
6. ✅ Install (1 min)

**No software installation needed!**
**Everything runs in the cloud!**

---

## Need Help?

If you get stuck on any step, let me know which step number and I'll help you through it!
