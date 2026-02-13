package com.google.android.gms.internal.pal;

/* loaded from: classes.dex */
public final class zzsb extends zzacz implements zzaeg {
    private static final zzsb zzb;
    private int zze;
    private zzsh zzf;
    private zzaby zzg = zzaby.zzb;

    static {
        zzsb zzsbVar = new zzsb();
        zzb = zzsbVar;
        zzacz.zzaF(zzsb.class, zzsbVar);
    }

    private zzsb() {
    }

    public static zzsa zzc() {
        return (zzsa) zzb.zzau();
    }

    public static zzsb zze() {
        return zzb;
    }

    public static zzsb zzf(zzaby zzabyVar, zzacm zzacmVar) {
        return (zzsb) zzacz.zzaw(zzb, zzabyVar, zzacmVar);
    }

    public static /* synthetic */ void zzj(zzsb zzsbVar, zzsh zzshVar) {
        zzshVar.getClass();
        zzsbVar.zzf = zzshVar;
    }

    public final int zza() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.pal.zzacz
    public final Object zzb(int i7, Object obj, Object obj2) {
        int i10 = i7 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzacz.zzaE(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zze", "zzf", "zzg"});
        }
        if (i10 == 3) {
            return new zzsb();
        }
        zzrz zzrzVar = null;
        if (i10 == 4) {
            return new zzsa(zzrzVar);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }

    public final zzsh zzg() {
        zzsh zzshVar = this.zzf;
        return zzshVar == null ? zzsh.zze() : zzshVar;
    }

    public final zzaby zzh() {
        return this.zzg;
    }
}
