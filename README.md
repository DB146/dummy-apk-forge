# APK Batch Builder

A GitHub Actions workflow that automatically builds multiple do-nothing Android APKs, each with a unique package name and app label, from a simple text file.

---

## How It Works

You provide a list of package names in `packages.txt`. When you trigger the workflow, it builds one APK per package name, with the package name shown as the app label under the icon. All APKs are bundled into a single downloadable artifact.

---

## Repo Structure

```
├── .github/
│   └── workflows/
│       └── build.yml           # GitHub Actions workflow
├── app/
│   └── src/
│       └── main/
│           ├── AndroidManifest.xml
│           ├── java/
│           │   └── MainActivity.java
│           └── res/
│               └── values/
│                   └── strings.xml
├── gradle/
│   └── wrapper/
│       └── gradle-wrapper.properties
├── app/build.gradle
├── build.gradle
├── settings.gradle
├── gradlew
├── build_apks.sh               # Build script
└── packages.txt                # Your list of package names
```

---

## Setup

No local Android SDK or setup is required. Everything runs on GitHub Actions.

1. Fork or clone this repo to your own GitHub account.
2. Edit `packages.txt` with your desired package names (see format below).
3. Trigger the workflow manually from the Actions tab.

---

## Adding Package Names

Open `packages.txt` and add one package name per line:

```
com.example.appone
com.example.apptwo
com.mycompany.toolapp
vng.games.mygame
```

**Rules:**
- One package name per line.
- Package names must follow Android naming conventions: lowercase letters, numbers, and dots. Must have at least two segments (e.g. `com.example`).
- Save the file with Unix line endings (LF), not Windows (CRLF). Most code editors handle this automatically.

---

## Running the Workflow

1. Go to your repo on GitHub.
2. Click the **Actions** tab.
3. Select **Build APKs** from the left sidebar.
4. Click **Run workflow**.
5. Enter a number in the **count** field — this is how many APKs to build, starting from the top of `packages.txt`. For example, entering `3` builds APKs for the first 3 lines.
6. Click the green **Run workflow** button.

The workflow will take a few minutes to complete. The first run is slower as caches are being built up. Subsequent runs will be faster.

---

## Downloading the APKs

1. Once the workflow finishes, click on the completed run.
2. Scroll down to the **Artifacts** section.
3. Click **all-apks** to download a `.zip` file.
4. Extract the zip — you will find one `.apk` file per package name, each named after its package (e.g. `com.example.appone.apk`).

Artifacts are kept for **30 days** before being automatically deleted by GitHub.

---

## Installing an APK

To install an APK on an Android device:

1. Transfer the `.apk` file to your device.
2. On the device, go to **Settings → Apps → Install unknown apps** and allow installs from your file manager.
3. Open the `.apk` file and tap **Install**.

Alternatively, install via ADB:

```bash
adb install com.example.appone.apk
```

---

## Notes

- All APKs are **debug-signed**. No keystore or signing configuration is needed.
- Each APK does nothing — it has a single empty Activity with no UI.
- The app label shown under the icon on the device will be the full package name (e.g. `com.example.appone`).
- The workflow only runs when **manually triggered**. It will not run automatically on every push.
