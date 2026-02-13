package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class zzgp extends zzme implements zznm {
    private static final zzgp zzg;
    private int zzb;
    private int zzd = 14;
    private int zze = 11;
    private int zzf = 60;

    static {
        zzgp zzgpVar = new zzgp();
        zzg = zzgpVar;
        zzme.zzcp(zzgp.class, zzgpVar);
    }

    private zzgp() {
    }

    @Override // com.google.android.gms.internal.measurement.zzme
    public final Object zzl(int i7, Object obj, Object obj2) {
        int i10 = i7 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzme.zzcq(zzg, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"zzb", "zzd", "zze", "zzf"});
        }
        if (i10 == 3) {
            return new zzgp();
        }
        byte[] bArr = null;
        if (i10 == 4) {
            return new zzgo(bArr);
        }
        if (i10 == 5) {
            return zzg;
        }
        throw null;
    }
}
