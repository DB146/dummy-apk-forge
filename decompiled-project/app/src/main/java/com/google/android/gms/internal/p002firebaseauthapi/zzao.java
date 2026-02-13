package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzao extends zzaj {
    private final transient int zza;
    private final transient int zzb;
    private final /* synthetic */ zzaj zzc;

    public zzao(zzaj zzajVar, int i7, int i10) {
        this.zzc = zzajVar;
        this.zza = i7;
        this.zzb = i10;
    }

    @Override // java.util.List
    public final Object get(int i7) {
        zzw.zza(i7, this.zzb);
        return this.zzc.get(i7 + this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzai
    public final int zza() {
        return this.zzc.zzb() + this.zza + this.zzb;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaj, java.util.List
    /* renamed from: zza */
    public final zzaj subList(int i7, int i10) {
        zzw.zza(i7, i10, this.zzb);
        zzaj zzajVar = this.zzc;
        int i11 = this.zza;
        return (zzaj) zzajVar.subList(i7 + i11, i10 + i11);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzai
    public final int zzb() {
        return this.zzc.zzb() + this.zza;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzai
    public final boolean zze() {
        return true;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzai
    public final Object[] zzf() {
        return this.zzc.zzf();
    }
}
