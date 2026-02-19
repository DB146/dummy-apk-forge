#!/bin/bash
set -e

PACKAGES_FILE="packages.txt"
OUTPUT_DIR="output_apks"
mkdir -p "$OUTPUT_DIR"

while IFS= read -r PACKAGE || [ -n "$PACKAGE" ]; do
    [ -z "$PACKAGE" ] && continue
    echo "Building APK for package: $PACKAGE"

    # Replace placeholder in files
    sed -i "s/PACKAGE_PLACEHOLDER/$PACKAGE/g" app/src/main/AndroidManifest.xml
    sed -i "s/PACKAGE_PLACEHOLDER/$PACKAGE/g" app/src/main/java/MainActivity.java
    sed -i "s/PACKAGE_PLACEHOLDER/$PACKAGE/g" app/build.gradle

    # Build debug APK
    ./gradlew assembleDebug

    # Copy and rename APK
    cp app/build/outputs/apk/debug/app-debug.apk "$OUTPUT_DIR/${PACKAGE}.apk"

    # Restore placeholders
    sed -i "s/$PACKAGE/PACKAGE_PLACEHOLDER/g" app/src/main/AndroidManifest.xml
    sed -i "s/$PACKAGE/PACKAGE_PLACEHOLDER/g" app/src/main/java/MainActivity.java
    sed -i "s/$PACKAGE/PACKAGE_PLACEHOLDER/g" app/build.gradle

done < "$PACKAGES_FILE"

echo "All APKs built in $OUTPUT_DIR/"
