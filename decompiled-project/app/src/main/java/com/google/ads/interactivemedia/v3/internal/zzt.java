package com.google.ads.interactivemedia.v3.internal;

/* loaded from: classes.dex */
public final class zzt extends zzaet implements zzaga {
    private static final zzt zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";

    static {
        zzt zztVar = new zzt();
        zzb = zztVar;
        zzaet.zzaM(zzt.class, zztVar);
    }

    private zzt() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzaet
    public final Object zzj(int i7, Object obj, Object obj2) {
        int i10 = i7 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzaet.zzaJ(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i10 == 3) {
            return new zzt();
        }
        zzq zzqVar = null;
        if (i10 == 4) {
            return new zzs(zzqVar);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }
}
