package com.google.android.gms.internal.pal;

/* loaded from: classes.dex */
public abstract class zzou {
    private final zzyv zza;
    private final Class zzb;

    public /* synthetic */ zzou(zzyv zzyvVar, Class cls, zzot zzotVar) {
        this.zza = zzyvVar;
        this.zzb = cls;
    }

    public static zzou zzb(zzos zzosVar, zzyv zzyvVar, Class cls) {
        return new zzor(zzyvVar, cls, zzosVar);
    }

    public abstract zzka zza(zzpu zzpuVar, zzlg zzlgVar);

    public final zzyv zzc() {
        return this.zza;
    }

    public final Class zzd() {
        return this.zzb;
    }
}
