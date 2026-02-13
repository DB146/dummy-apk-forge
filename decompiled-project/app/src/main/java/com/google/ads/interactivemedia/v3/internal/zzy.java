package com.google.ads.interactivemedia.v3.internal;

/* loaded from: classes.dex */
public final class zzy extends zzaet implements zzaga {
    private static final zzy zzb;
    private int zzd;
    private zzaa zze;
    private zzad zzf;

    static {
        zzy zzyVar = new zzy();
        zzb = zzyVar;
        zzaet.zzaM(zzy.class, zzyVar);
    }

    private zzy() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzaet
    public final Object zzj(int i7, Object obj, Object obj2) {
        int i10 = i7 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzaet.zzaJ(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i10 == 3) {
            return new zzy();
        }
        if (i10 == 4) {
            return new zzx(null);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }
}
