package com.google.android.gms.internal.pal;

/* loaded from: classes.dex */
public final class zztw extends zzacz implements zzaeg {
    private static final zztw zzb;
    private zztz zze;

    static {
        zztw zztwVar = new zztw();
        zzb = zztwVar;
        zzacz.zzaF(zztw.class, zztwVar);
    }

    private zztw() {
    }

    public static zztv zza() {
        return (zztv) zzb.zzau();
    }

    public static zztw zzd(zzaby zzabyVar, zzacm zzacmVar) {
        return (zztw) zzacz.zzaw(zzb, zzabyVar, zzacmVar);
    }

    public static /* synthetic */ void zzf(zztw zztwVar, zztz zztzVar) {
        zztzVar.getClass();
        zztwVar.zze = zztzVar;
    }

    @Override // com.google.android.gms.internal.pal.zzacz
    public final Object zzb(int i7, Object obj, Object obj2) {
        int i10 = i7 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzacz.zzaE(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"zze"});
        }
        if (i10 == 3) {
            return new zztw();
        }
        if (i10 == 4) {
            return new zztv(null);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }

    public final zztz zze() {
        zztz zztzVar = this.zze;
        return zztzVar == null ? zztz.zze() : zztzVar;
    }
}
