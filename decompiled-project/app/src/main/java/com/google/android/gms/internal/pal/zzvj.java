package com.google.android.gms.internal.pal;

/* loaded from: classes.dex */
public final class zzvj extends zzacz implements zzaeg {
    private static final zzvj zzb;
    private int zze;
    private zzvd zzf;
    private zzaby zzg = zzaby.zzb;

    static {
        zzvj zzvjVar = new zzvj();
        zzb = zzvjVar;
        zzacz.zzaF(zzvj.class, zzvjVar);
    }

    private zzvj() {
    }

    public static zzvi zzd() {
        return (zzvi) zzb.zzau();
    }

    public static zzvj zzf() {
        return zzb;
    }

    public static zzvj zzg(zzaby zzabyVar, zzacm zzacmVar) {
        return (zzvj) zzacz.zzaw(zzb, zzabyVar, zzacmVar);
    }

    public static /* synthetic */ void zzj(zzvj zzvjVar, zzvd zzvdVar) {
        zzvdVar.getClass();
        zzvjVar.zzf = zzvdVar;
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
            return new zzvj();
        }
        zzvh zzvhVar = null;
        if (i10 == 4) {
            return new zzvi(zzvhVar);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }

    public final zzvd zzc() {
        zzvd zzvdVar = this.zzf;
        return zzvdVar == null ? zzvd.zzd() : zzvdVar;
    }

    public final zzaby zzh() {
        return this.zzg;
    }

    public final boolean zzl() {
        return this.zzf != null;
    }
}
