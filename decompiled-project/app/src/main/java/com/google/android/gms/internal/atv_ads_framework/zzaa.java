package com.google.android.gms.internal.atv_ads_framework;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzaa extends zzab {
    final transient int zza;
    final transient int zzb;
    final /* synthetic */ zzab zzc;

    public zzaa(zzab zzabVar, int i7, int i10) {
        this.zzc = zzabVar;
        this.zza = i7;
        this.zzb = i10;
    }

    @Override // java.util.List
    public final Object get(int i7) {
        zzn.zza(i7, this.zzb, "index");
        return this.zzc.get(i7 + this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.zzy
    public final int zzb() {
        return this.zzc.zzc() + this.zza + this.zzb;
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.zzy
    public final int zzc() {
        return this.zzc.zzc() + this.zza;
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.zzy
    public final boolean zzf() {
        return true;
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.zzy
    public final Object[] zzg() {
        return this.zzc.zzg();
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.zzab, java.util.List
    /* renamed from: zzh, reason: merged with bridge method [inline-methods] */
    public final zzab subList(int i7, int i10) {
        zzn.zzd(i7, i10, this.zzb);
        zzab zzabVar = this.zzc;
        int i11 = this.zza;
        return zzabVar.subList(i7 + i11, i10 + i11);
    }
}
