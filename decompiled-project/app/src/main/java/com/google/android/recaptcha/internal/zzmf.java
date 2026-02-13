package com.google.android.recaptcha.internal;

/* loaded from: classes.dex */
public final class zzmf extends zznd implements zzoj {
    private static final zzmf zzb;
    private static volatile zzoq zzd;
    private int zze;
    private boolean zzg;
    private byte zzh = 2;
    private String zzf = "";

    static {
        zzmf zzmfVar = new zzmf();
        zzb = zzmfVar;
        zznd.zzI(zzmf.class, zzmfVar);
    }

    private zzmf() {
    }

    @Override // com.google.android.recaptcha.internal.zznd
    public final Object zzh(int i7, Object obj, Object obj2) {
        int i10 = i7 - 1;
        if (i10 == 0) {
            return Byte.valueOf(this.zzh);
        }
        if (i10 == 2) {
            return new zzou(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔈ\u0000\u0002ᔇ\u0001", new Object[]{"zze", "zzf", "zzg"});
        }
        if (i10 == 3) {
            return new zzmf();
        }
        if (i10 == 4) {
            return new zzme(null);
        }
        if (i10 == 5) {
            return zzb;
        }
        if (i10 != 6) {
            this.zzh = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        zzoq zzoqVar = zzd;
        if (zzoqVar == null) {
            synchronized (zzmf.class) {
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
