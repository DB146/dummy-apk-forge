package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzsn extends zzso {
    final transient int zza;
    final transient int zzb;
    final /* synthetic */ zzso zzc;

    public zzsn(zzso zzsoVar, int i7, int i10) {
        this.zzc = zzsoVar;
        this.zza = i7;
        this.zzb = i10;
    }

    @Override // java.util.List
    public final Object get(int i7) {
        zzrm.zza(i7, this.zzb, "index");
        return this.zzc.get(i7 + this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzb;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzsk
    public final int zzb() {
        return this.zzc.zzc() + this.zza + this.zzb;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzsk
    public final int zzc() {
        return this.zzc.zzc() + this.zza;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzsk
    public final boolean zzf() {
        return true;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzsk
    public final Object[] zzg() {
        return this.zzc.zzg();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzso, java.util.List
    /* renamed from: zzi */
    public final zzso subList(int i7, int i10) {
        zzrm.zzg(i7, i10, this.zzb);
        zzso zzsoVar = this.zzc;
        int i11 = this.zza;
        return zzsoVar.subList(i7 + i11, i10 + i11);
    }
}
