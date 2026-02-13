package com.google.android.gms.internal.pal;

/* loaded from: classes.dex */
public final class zzrs extends zzacz implements zzaeg {
    private static final zzrs zzb;
    private int zze;

    static {
        zzrs zzrsVar = new zzrs();
        zzb = zzrsVar;
        zzacz.zzaF(zzrs.class, zzrsVar);
    }

    private zzrs() {
    }

    public static zzrr zzc() {
        return (zzrr) zzb.zzau();
    }

    public static zzrs zze() {
        return zzb;
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
            return zzacz.zzaE(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zze"});
        }
        if (i10 == 3) {
            return new zzrs();
        }
        if (i10 == 4) {
            return new zzrr(null);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }
}
