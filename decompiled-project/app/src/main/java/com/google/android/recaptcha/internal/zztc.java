package com.google.android.recaptcha.internal;

/* loaded from: classes.dex */
public final class zztc extends zznd implements zzoj {
    private static final zztc zzb;
    private static volatile zzoq zzd;
    private String zze = "";
    private String zzf = "";
    private String zzg = "";

    static {
        zztc zztcVar = new zztc();
        zzb = zztcVar;
        zznd.zzI(zztc.class, zztcVar);
    }

    private zztc() {
    }

    @Override // com.google.android.recaptcha.internal.zznd
    public final Object zzh(int i7, Object obj, Object obj2) {
        int i10 = i7 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zznd.zzF(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ", new Object[]{"zze", "zzf", "zzg"});
        }
        if (i10 == 3) {
            return new zztc();
        }
        zztj zztjVar = null;
        if (i10 == 4) {
            return new zztb(zztjVar);
        }
        if (i10 == 5) {
            return zzb;
        }
        if (i10 != 6) {
            return null;
        }
        zzoq zzoqVar = zzd;
        if (zzoqVar == null) {
            synchronized (zztc.class) {
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
