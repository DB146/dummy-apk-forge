package com.google.android.gms.internal.pal;

/* loaded from: classes.dex */
public final class zzvd extends zzacz implements zzaeg {
    private static final zzvd zzb;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        zzvd zzvdVar = new zzvd();
        zzb = zzvdVar;
        zzacz.zzaF(zzvd.class, zzvdVar);
    }

    private zzvd() {
    }

    public static zzvc zza() {
        return (zzvc) zzb.zzau();
    }

    public static zzvd zzd() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.pal.zzacz
    public final Object zzb(int i7, Object obj, Object obj2) {
        int i10 = i7 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzacz.zzaE(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u0003\f", new Object[]{"zze", "zzf", "zzg"});
        }
        if (i10 == 3) {
            return new zzvd();
        }
        zzvb zzvbVar = null;
        if (i10 == 4) {
            return new zzvc(zzvbVar);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }

    public final int zze() {
        int i7 = this.zzg;
        int i10 = i7 != 0 ? i7 != 1 ? i7 != 2 ? i7 != 3 ? 0 : 5 : 4 : 3 : 2;
        if (i10 == 0) {
            return 1;
        }
        return i10;
    }

    public final int zzf() {
        int i7 = this.zzf;
        int i10 = i7 != 0 ? i7 != 1 ? i7 != 2 ? i7 != 3 ? 0 : 5 : 4 : 3 : 2;
        if (i10 == 0) {
            return 1;
        }
        return i10;
    }

    public final int zzg() {
        int i7 = this.zze;
        int i10 = i7 != 0 ? i7 != 1 ? i7 != 2 ? i7 != 3 ? i7 != 4 ? 0 : 6 : 5 : 4 : 3 : 2;
        if (i10 == 0) {
            return 1;
        }
        return i10;
    }
}
