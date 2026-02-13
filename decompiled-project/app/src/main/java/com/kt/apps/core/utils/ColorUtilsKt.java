package com.kt.apps.core.utils;

import android.graphics.Color;

/* loaded from: classes2.dex */
public final class ColorUtilsKt {
    public static final int changeWithAlpha(Color color, float f4) {
        float component;
        float component2;
        float component3;
        long pack;
        int argb;
        kotlin.jvm.internal.l.e(color, "<this>");
        component = color.getComponent(0);
        component2 = color.getComponent(1);
        component3 = color.getComponent(2);
        pack = Color.pack(component, component2, component3, f4);
        argb = Color.toArgb(pack);
        return argb;
    }
}
