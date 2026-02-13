package com.google.ads.interactivemedia.v3.impl.data;

import android.view.View;

/* loaded from: classes.dex */
public abstract class zzat {
    public abstract zzau build();

    public abstract zzat height(int i7);

    public abstract zzat left(int i7);

    public zzat locationOnScreenOfView(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        zzat left = left(iArr[0]);
        left.top(iArr[1]);
        left.height(view.getHeight());
        left.width(view.getWidth());
        return left;
    }

    public abstract zzat top(int i7);

    public abstract zzat width(int i7);
}
