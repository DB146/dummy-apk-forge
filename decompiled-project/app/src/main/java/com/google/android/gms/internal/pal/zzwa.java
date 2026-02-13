package com.google.android.gms.internal.pal;

/* loaded from: classes.dex */
public final class zzwa extends zzacz implements zzaeg {
    private static final zzwa zzb;
    private zzvo zze;
    private int zzf;
    private int zzg;
    private int zzh;

    static {
        zzwa zzwaVar = new zzwa();
        zzb = zzwaVar;
        zzacz.zzaF(zzwa.class, zzwaVar);
    }

    private zzwa() {
    }

    public static zzvz zzd() {
        return (zzvz) zzb.zzau();
    }

    public static /* synthetic */ void zzf(zzwa zzwaVar, zzvo zzvoVar) {
        zzvoVar.getClass();
        zzwaVar.zze = zzvoVar;
    }

    public final int zza() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.pal.zzacz
    public final Object zzb(int i7, Object obj, Object obj2) {
        int i10 = i7 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzacz.zzaE(zzb, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002\f\u0003\u000b\u0004\f", new Object[]{"zze", "zzf", "zzg", "zzh"});
        }
        if (i10 == 3) {
            return new zzwa();
        }
        zzvx zzvxVar = null;
        if (i10 == 4) {
            return new zzvz(zzvxVar);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }

    public final zzvo zzc() {
        zzvo zzvoVar = this.zze;
        return zzvoVar == null ? zzvo.zze() : zzvoVar;
    }

    public final boolean zzh() {
        return this.zze != null;
    }

    public final int zzi() {
        int i7 = this.zzf;
        int i10 = i7 != 0 ? i7 != 1 ? i7 != 2 ? i7 != 3 ? 0 : 5 : 4 : 3 : 2;
        if (i10 == 0) {
            return 1;
        }
        return i10;
    }

    public final int zzj() {
        int zzb2 = zzwu.zzb(this.zzh);
        if (zzb2 == 0) {
            return 1;
        }
        return zzb2;
    }
}
