package com.google.android.gms.internal.measurement;

import M6.q;
import M6.u;

/* loaded from: classes.dex */
public final class zzpe implements q {
    private static final zzpe zza = new zzpe();
    private final q zzb = new u(new zzpg());

    public static boolean zza() {
        return zza.get().zza();
    }

    public static boolean zzb() {
        return zza.get().zzb();
    }

    @Override // M6.q
    /* renamed from: zzc, reason: merged with bridge method [inline-methods] */
    public final zzpf get() {
        return (zzpf) this.zzb.get();
    }
}
