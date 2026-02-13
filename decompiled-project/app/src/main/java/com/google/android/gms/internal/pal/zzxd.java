package com.google.android.gms.internal.pal;

/* loaded from: classes.dex */
public final class zzxd extends zzacz implements zzaeg {
    private static final zzxd zzb;
    private int zze;

    static {
        zzxd zzxdVar = new zzxd();
        zzb = zzxdVar;
        zzacz.zzaF(zzxd.class, zzxdVar);
    }

    private zzxd() {
    }

    public static zzxd zzc() {
        return zzb;
    }

    public static zzxd zzd(zzaby zzabyVar, zzacm zzacmVar) {
        return (zzxd) zzacz.zzaw(zzb, zzabyVar, zzacmVar);
    }

    @Override // com.google.android.gms.internal.pal.zzacz
    public final Object zzb(int i7, Object obj, Object obj2) {
        int i10 = i7 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzacz.zzaE(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zze"});
        }
        if (i10 == 3) {
            return new zzxd();
        }
        if (i10 == 4) {
            return new zzxc(null);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }
}
