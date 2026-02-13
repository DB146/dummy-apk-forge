package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class zzgh extends zzme implements zznm {
    private static final zzgh zzg;
    private int zzb;
    private String zzd = "";
    private zzmn zze = zzme.zzcv();
    private boolean zzf;

    static {
        zzgh zzghVar = new zzgh();
        zzg = zzghVar;
        zzme.zzcp(zzgh.class, zzghVar);
    }

    private zzgh() {
    }

    public final String zza() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.measurement.zzme
    public final Object zzl(int i7, Object obj, Object obj2) {
        int i10 = i7 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzme.zzcq(zzg, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဇ\u0001", new Object[]{"zzb", "zzd", "zze", zzgr.class, "zzf"});
        }
        if (i10 == 3) {
            return new zzgh();
        }
        if (i10 == 4) {
            return new zzgg(null);
        }
        if (i10 == 5) {
            return zzg;
        }
        throw null;
    }
}
