package com.google.ads.interactivemedia.v3.internal;

/* loaded from: classes.dex */
public final class zzbn extends zzaet implements zzaga {
    private static final zzbn zzb;
    private int zzd;
    private String zze = "";

    static {
        zzbn zzbnVar = new zzbn();
        zzb = zzbnVar;
        zzaet.zzaM(zzbn.class, zzbnVar);
    }

    private zzbn() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzaet
    public final Object zzj(int i7, Object obj, Object obj2) {
        int i10 = i7 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzaet.zzaJ(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zzd", "zze"});
        }
        if (i10 == 3) {
            return new zzbn();
        }
        zzae zzaeVar = null;
        if (i10 == 4) {
            return new zzbm(zzaeVar);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }
}
