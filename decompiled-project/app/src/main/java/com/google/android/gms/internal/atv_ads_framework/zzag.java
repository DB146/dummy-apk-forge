package com.google.android.gms.internal.atv_ads_framework;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzag extends zzab {
    static final zzab zza = new zzag(new Object[0], 0);
    final transient Object[] zzb;
    private final transient int zzc;

    public zzag(Object[] objArr, int i7) {
        this.zzb = objArr;
        this.zzc = i7;
    }

    @Override // java.util.List
    public final Object get(int i7) {
        zzn.zza(i7, this.zzc, "index");
        Object obj = this.zzb[i7];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.zzab, com.google.android.gms.internal.atv_ads_framework.zzy
    public final int zza(Object[] objArr, int i7) {
        System.arraycopy(this.zzb, 0, objArr, 0, this.zzc);
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.zzy
    public final int zzb() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.zzy
    public final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.zzy
    public final boolean zzf() {
        return false;
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.zzy
    public final Object[] zzg() {
        return this.zzb;
    }
}
