package com.google.android.gms.internal.pal;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class zzpi {
    private static final zzpi zza = new zzpi();
    private static final zzph zzb = new zzph(null);
    private final AtomicReference zzc = new AtomicReference();

    public static zzpi zza() {
        return zza;
    }

    public final zzrd zzb() {
        zzrd zzrdVar = (zzrd) this.zzc.get();
        return zzrdVar == null ? zzb : zzrdVar;
    }
}
