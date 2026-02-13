package com.google.android.gms.internal.pal;

/* loaded from: classes.dex */
public final class zzaq extends zzacz implements zzaeg {
    private static final zzaq zzb;
    private int zze;
    private long zzf;
    private String zzg = "";
    private zzaby zzh = zzaby.zzb;

    static {
        zzaq zzaqVar = new zzaq();
        zzb = zzaqVar;
        zzacz.zzaF(zzaq.class, zzaqVar);
    }

    private zzaq() {
    }

    public static zzaq zzd() {
        return zzb;
    }

    public final long zza() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.pal.zzacz
    public final Object zzb(int i7, Object obj, Object obj2) {
        int i10 = i7 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzacz.zzaE(zzb, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0003ဈ\u0001\u0004ည\u0002", new Object[]{"zze", "zzf", "zzg", "zzh"});
        }
        if (i10 == 3) {
            return new zzaq();
        }
        zzq zzqVar = null;
        if (i10 == 4) {
            return new zzap(zzqVar);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }

    public final boolean zze() {
        return (this.zze & 1) != 0;
    }
}
