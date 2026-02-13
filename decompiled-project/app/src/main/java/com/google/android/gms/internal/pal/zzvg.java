package com.google.android.gms.internal.pal;

/* loaded from: classes.dex */
public final class zzvg extends zzacz implements zzaeg {
    private static final zzvg zzb;
    private int zze;
    private zzvj zzf;
    private zzaby zzg = zzaby.zzb;

    static {
        zzvg zzvgVar = new zzvg();
        zzb = zzvgVar;
        zzacz.zzaF(zzvg.class, zzvgVar);
    }

    private zzvg() {
    }

    public static zzvf zzc() {
        return (zzvf) zzb.zzau();
    }

    public static zzvg zze(zzaby zzabyVar, zzacm zzacmVar) {
        return (zzvg) zzacz.zzaw(zzb, zzabyVar, zzacmVar);
    }

    public static /* synthetic */ void zzi(zzvg zzvgVar, zzvj zzvjVar) {
        zzvjVar.getClass();
        zzvgVar.zzf = zzvjVar;
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
            return new zzvg();
        }
        zzve zzveVar = null;
        if (i10 == 4) {
            return new zzvf(zzveVar);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }

    public final zzvj zzf() {
        zzvj zzvjVar = this.zzf;
        return zzvjVar == null ? zzvj.zzf() : zzvjVar;
    }

    public final zzaby zzg() {
        return this.zzg;
    }

    public final boolean zzk() {
        return this.zzf != null;
    }
}
