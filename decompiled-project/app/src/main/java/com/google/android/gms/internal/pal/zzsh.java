package com.google.android.gms.internal.pal;

/* loaded from: classes.dex */
public final class zzsh extends zzacz implements zzaeg {
    private static final zzsh zzb;
    private int zze;

    static {
        zzsh zzshVar = new zzsh();
        zzb = zzshVar;
        zzacz.zzaF(zzsh.class, zzshVar);
    }

    private zzsh() {
    }

    public static zzsg zzc() {
        return (zzsg) zzb.zzau();
    }

    public static zzsh zze() {
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
            return new zzsh();
        }
        if (i10 == 4) {
            return new zzsg(null);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }
}
