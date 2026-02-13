package com.kt.apps.core.utils.blurry;

import android.view.View;
import android.view.animation.AlphaAnimation;

/* loaded from: classes2.dex */
public final class Helper {
    public static void animate(View view, int i7) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(i7);
        view.startAnimation(alphaAnimation);
    }

    public static boolean hasZero(int... iArr) {
        for (int i7 : iArr) {
            if (i7 == 0) {
                return true;
            }
        }
        return false;
    }
}
