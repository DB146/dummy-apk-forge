package com.google.android.gms.internal.pal;

/* loaded from: classes.dex */
public final class zzaj extends zzacz implements zzaeg {
    private static final zzaj zzb;
    private int zze;
    private zzaby zzf;
    private zzaby zzg;

    static {
        zzaj zzajVar = new zzaj();
        zzb = zzajVar;
        zzacz.zzaF(zzaj.class, zzajVar);
    }

    private zzaj() {
        zzaby zzabyVar = zzaby.zzb;
        this.zzf = zzabyVar;
        this.zzg = zzabyVar;
    }

    public static zzai zza() {
        return (zzai) zzb.zzau();
    }

    public static /* synthetic */ void zzd(zzaj zzajVar, zzaby zzabyVar) {
        zzajVar.zze |= 1;
        zzajVar.zzf = zzabyVar;
    }

    public static /* synthetic */ void zze(zzaj zzajVar, zzaby zzabyVar) {
        zzajVar.zze |= 2;
        zzajVar.zzg = zzabyVar;
    }

    @Override // com.google.android.gms.internal.pal.zzacz
    public final Object zzb(int i7, Object obj, Object obj2) {
        int i10 = i7 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzacz.zzaE(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001", new Object[]{"zze", "zzf", "zzg"});
        }
        if (i10 == 3) {
            return new zzaj();
        }
        if (i10 == 4) {
            return new zzai(null);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }
}
