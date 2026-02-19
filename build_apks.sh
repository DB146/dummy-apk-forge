#!/bin/bash

PACKAGES_FILE="packages.txt"
OUTPUT_DIR="output_apks"
mkdir -p "$OUTPUT_DIR"

COUNT=0
while IFS= read -r PACKAGE <&3 || [ -n "$PACKAGE" ]; do
    PACKAGE="${PACKAGE//$'\r'/}"
    [ -z "$PACKAGE" ] && continue
    COUNT=$((COUNT + 1))
    echo "[$COUNT] Building: $PACKAGE"

    ESCAPED=$(echo "$PACKAGE" | sed 's/\./\\./g')

    sed -i "s/PACKAGE_PLACEHOLDER/$PACKAGE/g" app/src/main/res/values/strings.xml
    sed -i "s/PACKAGE_PLACEHOLDER/$PACKAGE/g" app/src/main/java/MainActivity.java
    sed -i "s/PACKAGE_PLACEHOLDER/$PACKAGE/g" app/build.gradle

    if ./gradlew assembleDebug; then
        cp app/build/outputs/apk/debug/app-debug.apk "$OUTPUT_DIR/${PACKAGE}.apk"
        echo "✓ Done: $PACKAGE"
    else
        echo "✗ FAILED: $PACKAGE"
    fi

    sed -i "s/$ESCAPED/PACKAGE_PLACEHOLDER/g" app/src/main/res/values/strings.xml
    sed -i "s/$ESCAPED/PACKAGE_PLACEHOLDER/g" app/src/main/java/MainActivity.java
    sed -i "s/$ESCAPED/PACKAGE_PLACEHOLDER/g" app/build.gradle

done 3< "$PACKAGES_FILE"

echo "Total built: $COUNT"
echo "All APKs built in $OUTPUT_DIR/"
