package com.google.android.gms.internal.pal;

/* loaded from: classes.dex */
final class zzaaq implements zzzh {
    final /* synthetic */ Class zza;
    final /* synthetic */ Class zzb;
    final /* synthetic */ zzzg zzc;

    public zzaaq(Class cls, Class cls2, zzzg zzzgVar) {
        this.zza = cls;
        this.zzb = cls2;
        this.zzc = zzzgVar;
    }

    public final String toString() {
        return "Factory[type=" + this.zzb.getName() + "+" + this.zza.getName() + ",adapter=" + this.zzc + "]";
    }
}
