package com.google.android.gms.internal.atv_ads_framework;

/* loaded from: classes.dex */
final class zzak extends zzab {
    private final transient Object[] zza;
    private final transient int zzb;
    private final transient int zzc;

    public zzak(Object[] objArr, int i7, int i10) {
        this.zza = objArr;
        this.zzb = i7;
        this.zzc = i10;
    }

    @Override // java.util.List
    public final Object get(int i7) {
        zzn.zza(i7, this.zzc, "index");
        Object obj = this.zza[i7 + i7 + this.zzb];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.zzy
    public final boolean zzf() {
        return true;
    }
}
