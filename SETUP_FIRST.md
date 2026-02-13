# SETUP SCRIPT - Run this ONCE before building

This script will download the Gradle wrapper automatically.

## For Windows:

Open PowerShell in the mod folder and run:

```powershell
# Download Gradle wrapper JAR
$url = "https://raw.githubusercontent.com/gradle/gradle/v8.1.1/gradle/wrapper/gradle-wrapper.jar"
$output = "gradle\wrapper\gradle-wrapper.jar"
Invoke-WebRequest -Uri $url -OutFile $output

# Verify it downloaded
if (Test-Path $output) {
    Write-Host "Gradle wrapper downloaded successfully!"
    Write-Host "Now you can run: gradlew.bat build"
} else {
    Write-Host "Download failed. Please check your internet connection."
}
```

## For Mac/Linux:

Open Terminal in the mod folder and run:

```bash
# Download Gradle wrapper JAR
curl -L -o gradle/wrapper/gradle-wrapper.jar \
  https://raw.githubusercontent.com/gradle/gradle/v8.1.1/gradle/wrapper/gradle-wrapper.jar

# Verify it downloaded
if [ -f gradle/wrapper/gradle-wrapper.jar ]; then
    echo "Gradle wrapper downloaded successfully!"
    echo "Now you can run: ./gradlew build"
else
    echo "Download failed. Please check your internet connection."
fi
```

## One-Line Windows Command:

Copy and paste this into PowerShell:

```powershell
Invoke-WebRequest -Uri "https://raw.githubusercontent.com/gradle/gradle/v8.1.1/gradle/wrapper/gradle-wrapper.jar" -OutFile "gradle\wrapper\gradle-wrapper.jar"
```

Then run:
```
gradlew.bat build
```

---

## Still not working?

**→ Use the GitHub method instead! (See BUILD_ONLINE.md)**

It's 100% online, no downloads or installation required!
