package com.google.android.gms.internal.pal;

/* loaded from: classes.dex */
public final class zzui extends zzacz implements zzaeg {
    private static final zzui zzb;
    private int zze;
    private int zzf;
    private zzaby zzg = zzaby.zzb;

    static {
        zzui zzuiVar = new zzui();
        zzb = zzuiVar;
        zzacz.zzaF(zzui.class, zzuiVar);
    }

    private zzui() {
    }

    public static zzuh zza() {
        return (zzuh) zzb.zzau();
    }

    public static zzui zzd() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.pal.zzacz
    public final Object zzb(int i7, Object obj, Object obj2) {
        int i10 = i7 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzacz.zzaE(zzb, "\u0000\u0003\u0000\u0000\u0001\u000b\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u000b\n", new Object[]{"zze", "zzf", "zzg"});
        }
        if (i10 == 3) {
            return new zzui();
        }
        zzug zzugVar = null;
        if (i10 == 4) {
            return new zzuh(zzugVar);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }

    public final zzaby zze() {
        return this.zzg;
    }

    public final int zzg() {
        int i7 = this.zze;
        int i10 = i7 != 0 ? i7 != 2 ? i7 != 3 ? i7 != 4 ? i7 != 5 ? 0 : 7 : 6 : 5 : 4 : 2;
        if (i10 == 0) {
            return 1;
        }
        return i10;
    }

    public final int zzh() {
        int zzb2 = zzum.zzb(this.zzf);
        if (zzb2 == 0) {
            return 1;
        }
        return zzb2;
    }
}
