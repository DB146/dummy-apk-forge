package com.google.android.recaptcha.internal;

/* loaded from: classes.dex */
public final class zzsg extends zznd implements zzoj {
    private static final zzsg zzb;
    private static volatile zzoq zzd;
    private int zze;
    private String zzf = "";

    static {
        zzsg zzsgVar = new zzsg();
        zzb = zzsgVar;
        zznd.zzI(zzsg.class, zzsgVar);
    }

    private zzsg() {
    }

    public static zzsf zzf() {
        return (zzsf) zzb.zzq();
    }

    public static /* synthetic */ void zzi(zzsg zzsgVar, String str) {
        zzsgVar.zze |= 1;
        zzsgVar.zzf = str;
    }

    @Override // com.google.android.recaptcha.internal.zznd
    public final Object zzh(int i7, Object obj, Object obj2) {
        int i10 = i7 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zznd.zzF(zzb, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ለ\u0000", new Object[]{"zze", "zzf"});
        }
        if (i10 == 3) {
            return new zzsg();
        }
        if (i10 == 4) {
            return new zzsf(null);
        }
        if (i10 == 5) {
            return zzb;
        }
        if (i10 != 6) {
            return null;
        }
        zzoq zzoqVar = zzd;
        if (zzoqVar == null) {
            synchronized (zzsg.class) {
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
}
