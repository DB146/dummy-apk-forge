package com.google.android.recaptcha.internal;

/* loaded from: classes.dex */
public final class zzqq extends zznd implements zzoj {
    private static final zzqq zzb;
    private static volatile zzoq zzd;
    private int zzg;
    private int zzj;
    private int zzk;
    private String zze = "";
    private String zzf = "";
    private String zzh = "";
    private String zzi = "";

    static {
        zzqq zzqqVar = new zzqq();
        zzb = zzqqVar;
        zznd.zzI(zzqq.class, zzqqVar);
    }

    private zzqq() {
    }

    public static /* synthetic */ void zzO(zzqq zzqqVar, String str) {
        str.getClass();
        zzqqVar.zze = str;
    }

    public static zzqo zzg() {
        return (zzqo) zzb.zzq();
    }

    public static zzqq zzj() {
        return zzb;
    }

    public final int zzf() {
        return this.zzg;
    }

    @Override // com.google.android.recaptcha.internal.zznd
    public final Object zzh(int i7, Object obj, Object obj2) {
        int i10 = i7 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zznd.zzF(zzb, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001Ȉ\u0002\u0004\u0003Ȉ\u0004\u0004\u0005Ȉ\u0006Ȉ\u0007\u0004", new Object[]{"zze", "zzg", "zzi", "zzj", "zzf", "zzh", "zzk"});
        }
        if (i10 == 3) {
            return new zzqq();
        }
        if (i10 == 4) {
            return new zzqo(null);
        }
        if (i10 == 5) {
            return zzb;
        }
        if (i10 != 6) {
            return null;
        }
        zzoq zzoqVar = zzd;
        if (zzoqVar == null) {
            synchronized (zzqq.class) {
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

    public final String zzk() {
        return this.zze;
    }
}
