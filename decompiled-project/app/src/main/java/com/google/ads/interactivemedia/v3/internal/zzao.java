package com.google.ads.interactivemedia.v3.internal;

/* loaded from: classes.dex */
public final class zzao extends zzaet implements zzaga {
    private static final zzao zzb;
    private int zzd;
    private long zze = -1;
    private int zzf = 1000;
    private int zzg = 1000;

    static {
        zzao zzaoVar = new zzao();
        zzb = zzaoVar;
        zzaet.zzaM(zzao.class, zzaoVar);
    }

    private zzao() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzaet
    public final Object zzj(int i7, Object obj, Object obj2) {
        int i10 = i7 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            zzaex zzaexVar = zzbi.zza;
            return zzaet.zzaJ(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဌ\u0001\u0003ဌ\u0002", new Object[]{"zzd", "zze", "zzf", zzaexVar, "zzg", zzaexVar});
        }
        if (i10 == 3) {
            return new zzao();
        }
        zzae zzaeVar = null;
        if (i10 == 4) {
            return new zzan(zzaeVar);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }
}
