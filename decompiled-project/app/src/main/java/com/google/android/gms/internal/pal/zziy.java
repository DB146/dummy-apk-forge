package com.google.android.gms.internal.pal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zziy extends zziz {
    final transient int zza;
    final transient int zzb;
    final /* synthetic */ zziz zzc;

    public zziy(zziz zzizVar, int i7, int i10) {
        this.zzc = zzizVar;
        this.zza = i7;
        this.zzb = i10;
    }

    @Override // java.util.List
    public final Object get(int i7) {
        zzip.zza(i7, this.zzb, "index");
        return this.zzc.get(i7 + this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.pal.zziw
    public final int zzb() {
        return this.zzc.zzc() + this.zza + this.zzb;
    }

    @Override // com.google.android.gms.internal.pal.zziw
    public final int zzc() {
        return this.zzc.zzc() + this.zza;
    }

    @Override // com.google.android.gms.internal.pal.zziw
    public final Object[] zze() {
        return this.zzc.zze();
    }

    @Override // com.google.android.gms.internal.pal.zziz, java.util.List
    /* renamed from: zzf, reason: merged with bridge method [inline-methods] */
    public final zziz subList(int i7, int i10) {
        zzip.zzc(i7, i10, this.zzb);
        zziz zzizVar = this.zzc;
        int i11 = this.zza;
        return zzizVar.subList(i7 + i11, i10 + i11);
    }
}
