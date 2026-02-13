@echo off
echo ========================================
echo Villager Recruits Damage Fix - Builder
echo ========================================
echo.

REM Check for Java
java -version >nul 2>&1
if errorlevel 1 (
    echo ERROR: Java is not installed or not in PATH!
    echo Please install Java 17 or higher from: https://adoptium.net/
    echo.
    pause
    exit /b 1
)

echo Java found! Checking version...
java -version
echo.

REM Check if gradle wrapper exists
if not exist "gradle\wrapper\gradle-wrapper.jar" (
    echo Gradle wrapper not found. Initializing...
    echo This will download Gradle automatically.
    echo.
    
    REM Download gradle wrapper jar
    echo Downloading Gradle wrapper...
    powershell -Command "& {[Net.ServicePointManager]::SecurityProtocol = [Net.SecurityProtocolType]::Tls12; Invoke-WebRequest -Uri 'https://raw.githubusercontent.com/gradle/gradle/v8.1.1/gradle/wrapper/gradle-wrapper.jar' -OutFile 'gradle\wrapper\gradle-wrapper.jar'}"
    
    if not exist "gradle\wrapper\gradle-wrapper.jar" (
        echo Failed to download Gradle wrapper automatically.
        echo Please download it manually or use Method 2 below.
        echo.
        echo ==========================================
        echo ALTERNATIVE METHOD:
        echo ==========================================
        echo 1. Install Gradle manually from: https://gradle.org/releases/
        echo 2. Add Gradle to your PATH
        echo 3. Run: gradle build
        echo ==========================================
        echo.
        pause
        exit /b 1
    )
    
    echo Gradle wrapper downloaded successfully!
    echo.
)

echo Starting build process...
echo This may take 5-15 minutes on first run.
echo Please be patient...
echo.

REM Run the build
call gradlew.bat build

if errorlevel 1 (
    echo.
    echo ========================================
    echo BUILD FAILED!
    echo ========================================
    echo.
    echo Common solutions:
    echo 1. Make sure you have internet connection
    echo 2. Try running: gradlew.bat clean build
    echo 3. Delete the .gradle folder and try again
    echo 4. Check that Java 17+ is installed
    echo.
    pause
    exit /b 1
)

echo.
echo ========================================
echo BUILD SUCCESSFUL!
echo ========================================
echo.
echo Your mod is ready at:
echo build\libs\villagerrecruits-damagefix-1.0.0.jar
echo.
echo Copy this file to your Minecraft mods folder:
echo %%appdata%%\.minecraft\mods\
echo.

REM Try to open the build folder
if exist "build\libs\" (
    echo Opening build folder...
    explorer build\libs
)

pause
