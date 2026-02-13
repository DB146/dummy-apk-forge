package com.google.ads.interactivemedia.v3.impl.data;

import com.google.ads.interactivemedia.v3.internal.zzqy;

@zzqy(zza = zzq.class)
/* loaded from: classes.dex */
public abstract class CuePointData {
    private static CuePointData create(double d10, double d11, boolean z8) {
        return new zzq(d10, d11, z8);
    }

    public abstract double end();

    public abstract boolean played();

    public abstract double start();
}
