package com.google.ads.interactivemedia.v3.internal;

import h3.o;

/* loaded from: classes.dex */
public final class zzol extends Exception {
    private final int zza;

    public zzol(int i7) {
        super(o.l(i7, "Signal SDK error code: "));
        this.zza = i7;
    }

    public final int zza() {
        return this.zza;
    }
}
