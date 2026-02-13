package com.google.android.gms.internal.pal;

import java.io.Serializable;

/* loaded from: classes.dex */
public class zzagf extends zzage implements Serializable, zzagd {
    private volatile long zza;

    public zzagf(long j) {
        this.zza = j;
    }

    @Override // com.google.android.gms.internal.pal.zzagd
    public final long zzd() {
        return this.zza;
    }
}
