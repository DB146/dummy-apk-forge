package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class zzgt extends zzme implements zznm {
    private static final zzgt zzf;
    private int zzb;
    private String zzd = "";
    private String zze = "";

    static {
        zzgt zzgtVar = new zzgt();
        zzf = zzgtVar;
        zzme.zzcp(zzgt.class, zzgtVar);
    }

    private zzgt() {
    }

    public final String zza() {
        return this.zzd;
    }

    public final String zzb() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.measurement.zzme
    public final Object zzl(int i7, Object obj, Object obj2) {
        int i10 = i7 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzme.zzcq(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzb", "zzd", "zze"});
        }
        if (i10 == 3) {
            return new zzgt();
        }
        byte[] bArr = null;
        if (i10 == 4) {
            return new zzgs(bArr);
        }
        if (i10 == 5) {
            return zzf;
        }
        throw null;
    }
}
