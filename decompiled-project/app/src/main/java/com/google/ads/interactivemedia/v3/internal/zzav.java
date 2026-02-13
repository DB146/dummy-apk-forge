package com.google.ads.interactivemedia.v3.internal;

/* loaded from: classes.dex */
public final class zzav extends zzaet implements zzaga {
    private static final zzav zzb;
    private int zzd;
    private int zze;
    private long zzf = -1;

    static {
        zzav zzavVar = new zzav();
        zzb = zzavVar;
        zzaet.zzaM(zzav.class, zzavVar);
    }

    private zzav() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzaet
    public final Object zzj(int i7, Object obj, Object obj2) {
        int i10 = i7 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzaet.zzaJ(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဂ\u0001", new Object[]{"zzd", "zze", zzak.zza, "zzf"});
        }
        if (i10 == 3) {
            return new zzav();
        }
        zzae zzaeVar = null;
        if (i10 == 4) {
            return new zzau(zzaeVar);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }
}
