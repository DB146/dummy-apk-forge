package com.kt.apps.core.utils;

import android.view.animation.RotateAnimation;

/* loaded from: classes2.dex */
public final class AnimationUtils {
    public static final AnimationUtils INSTANCE = new AnimationUtils();

    private AnimationUtils() {
    }

    public static final RotateAnimation getRotateAnimation(boolean z8, int i7, int i10) {
        return z8 ? new RotateAnimation(0.0f, 180.0f, i7 / 2.0f, i10 / 2.0f) : new RotateAnimation(180.0f, 360.0f, i7 / 2.0f, i10 / 2.0f);
    }
}
