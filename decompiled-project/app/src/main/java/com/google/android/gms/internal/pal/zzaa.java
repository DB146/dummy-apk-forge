package com.google.android.gms.internal.pal;

/* loaded from: classes.dex */
public final class zzaa extends zzacz implements zzaeg {
    private static final zzaa zzb;
    private int zze;
    private long zzf = -1;
    private int zzg = 1000;

    static {
        zzaa zzaaVar = new zzaa();
        zzb = zzaaVar;
        zzacz.zzaF(zzaa.class, zzaaVar);
    }

    private zzaa() {
    }

    @Override // com.google.android.gms.internal.pal.zzacz
    public final Object zzb(int i7, Object obj, Object obj2) {
        int i10 = i7 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzacz.zzaE(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဌ\u0001", new Object[]{"zze", "zzf", "zzg", zzan.zza});
        }
        if (i10 == 3) {
            return new zzaa();
        }
        zzq zzqVar = null;
        if (i10 == 4) {
            return new zzz(zzqVar);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }
}
