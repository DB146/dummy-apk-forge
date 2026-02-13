package com.google.android.gms.internal.measurement;

import M6.q;
import M6.u;

/* loaded from: classes.dex */
public final class zzrd implements q {
    private static final zzrd zza = new zzrd();
    private final q zzb = new u(new zzrf());

    public static boolean zza() {
        return zza.get().zza();
    }

    public static boolean zzb() {
        return zza.get().zzb();
    }

    @Override // M6.q
    /* renamed from: zzc, reason: merged with bridge method [inline-methods] */
    public final zzre get() {
        return (zzre) this.zzb.get();
    }
}
