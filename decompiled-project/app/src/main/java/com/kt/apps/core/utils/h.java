package com.kt.apps.core.utils;

import android.hardware.HardwareBuffer;
import android.media.Image;
import android.text.PrecomputedText;
import android.text.TextPaint;
import android.webkit.TracingConfig;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class h {
    public static /* bridge */ /* synthetic */ HardwareBuffer d(Image image) {
        return image.getHardwareBuffer();
    }

    public static /* synthetic */ PrecomputedText.Params.Builder h(TextPaint textPaint) {
        return new PrecomputedText.Params.Builder(textPaint);
    }

    public static /* synthetic */ void p() {
        new TracingConfig.Builder();
    }
}
