package com.google.ads.interactivemedia.v3.internal;

/* loaded from: classes.dex */
public final class zzbl extends zzaet implements zzaga {
    private static final zzbl zzb;
    private int zzd;
    private long zze;
    private String zzf = "";
    private zzadr zzg = zzadr.zzb;

    static {
        zzbl zzblVar = new zzbl();
        zzb = zzblVar;
        zzaet.zzaM(zzbl.class, zzblVar);
    }

    private zzbl() {
    }

    public static zzbl zzc() {
        return zzb;
    }

    public final long zza() {
        return this.zze;
    }

    public final boolean zzd() {
        return (this.zzd & 1) != 0;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzaet
    public final Object zzj(int i7, Object obj, Object obj2) {
        int i10 = i7 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzaet.zzaJ(zzb, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0003ဈ\u0001\u0004ည\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i10 == 3) {
            return new zzbl();
        }
        zzae zzaeVar = null;
        if (i10 == 4) {
            return new zzbk(zzaeVar);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }
}
