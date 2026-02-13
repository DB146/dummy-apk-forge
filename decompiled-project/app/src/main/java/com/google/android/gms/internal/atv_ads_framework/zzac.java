package com.google.android.gms.internal.atv_ads_framework;

/* loaded from: classes.dex */
final class zzac {
    private final Object zza;
    private final Object zzb;
    private final Object zzc;

    public zzac(Object obj, Object obj2, Object obj3) {
        this.zza = obj;
        this.zzb = obj2;
        this.zzc = obj3;
    }

    public final IllegalArgumentException zza() {
        return new IllegalArgumentException("Multiple entries with same key: " + this.zza + "=" + this.zzb + " and " + this.zza + "=" + this.zzc);
    }
}
