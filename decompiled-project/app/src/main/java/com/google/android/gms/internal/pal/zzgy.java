package com.google.android.gms.internal.pal;

import h3.o;

/* loaded from: classes.dex */
public final class zzgy extends Exception {
    private final int zza;

    public zzgy(int i7) {
        super(o.l(i7, "Signal SDK error code: "));
        this.zza = i7;
    }

    public final int zza() {
        return this.zza;
    }
}
