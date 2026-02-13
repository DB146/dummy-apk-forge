package com.google.ads.interactivemedia.v3.impl.data;

/* loaded from: classes.dex */
public abstract class zzbv {
    public abstract zzbw build();

    public abstract zzbv volume(float f4);

    public zzbv volumePercentage(int i7) {
        return volume(i7 / 100.0f);
    }
}
