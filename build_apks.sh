#!/bin/bash
set -e

PACKAGES_FILE="packages.txt"
OUTPUT_DIR="output_apks"
mkdir -p "$OUTPUT_DIR"

COUNT=0
while IFS= read -r PACKAGE || [ -n "$PACKAGE" ]; do
    PACKAGE="${PACKAGE//$'\r'/}"
    [ -z "$PACKAGE" ] && continue
    COUNT=$((COUNT + 1))
    echo "[$COUNT] Building: $PACKAGE"

    # Escape dots for sed
    ESCAPED=$(echo "$PACKAGE" | sed 's/\./\\./g')

    sed -i "s/PACKAGE_PLACEHOLDER/$PACKAGE/g" app/src/main/res/values/strings.xml
    sed -i "s/PACKAGE_PLACEHOLDER/$PACKAGE/g" app/src/main/java/MainActivity.java
    sed -i "s/PACKAGE_PLACEHOLDER/$PACKAGE/g" app/build.gradle

    ./gradlew assembleDebug

    cp app/build/outputs/apk/debug/app-debug.apk "$OUTPUT_DIR/${PACKAGE}.apk"

    # Restore using escaped pattern
    sed -i "s/$ESCAPED/PACKAGE_PLACEHOLDER/g" app/src/main/res/values/strings.xml
    sed -i "s/$ESCAPED/PACKAGE_PLACEHOLDER/g" app/src/main/java/MainActivity.java
    sed -i "s/$ESCAPED/PACKAGE_PLACEHOLDER/g" app/build.gradle

done < "$PACKAGES_FILE"

echo "Total built: $COUNT"
echo "All APKs built in $OUTPUT_DIR/"
