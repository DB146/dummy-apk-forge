package com.google.ads.interactivemedia.v3.internal;

/* loaded from: classes.dex */
public final class zzad extends zzaet implements zzaga {
    private static final zzad zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";

    static {
        zzad zzadVar = new zzad();
        zzb = zzadVar;
        zzaet.zzaM(zzad.class, zzadVar);
    }

    private zzad() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzaet
    public final Object zzj(int i7, Object obj, Object obj2) {
        int i10 = i7 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzaet.zzaJ(zzb, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i10 == 3) {
            return new zzad();
        }
        zzw zzwVar = null;
        if (i10 == 4) {
            return new zzac(zzwVar);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }
}
