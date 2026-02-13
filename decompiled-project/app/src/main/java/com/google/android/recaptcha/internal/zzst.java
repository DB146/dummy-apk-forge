package com.google.android.recaptcha.internal;

/* loaded from: classes.dex */
public final class zzst extends zznd implements zzoj {
    private static final zzst zzb;
    private static volatile zzoq zzd;
    private int zze;
    private String zzf = "";
    private String zzg = "";

    static {
        zzst zzstVar = new zzst();
        zzb = zzstVar;
        zznd.zzI(zzst.class, zzstVar);
    }

    private zzst() {
    }

    public final String zzg() {
        return this.zzf;
    }

    @Override // com.google.android.recaptcha.internal.zznd
    public final Object zzh(int i7, Object obj, Object obj2) {
        int i10 = i7 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zznd.zzF(zzb, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001", new Object[]{"zze", "zzf", "zzg"});
        }
        if (i10 == 3) {
            return new zzst();
        }
        zzsu zzsuVar = null;
        if (i10 == 4) {
            return new zzss(zzsuVar);
        }
        if (i10 == 5) {
            return zzb;
        }
        if (i10 != 6) {
            return null;
        }
        zzoq zzoqVar = zzd;
        if (zzoqVar == null) {
            synchronized (zzst.class) {
                try {
                    zzoqVar = zzd;
                    if (zzoqVar == null) {
                        zzoqVar = new zzmy(zzb);
                        zzd = zzoqVar;
                    }
                } finally {
                }
            }
        }
        return zzoqVar;
    }

    public final String zzi() {
        return this.zzg;
    }
}
