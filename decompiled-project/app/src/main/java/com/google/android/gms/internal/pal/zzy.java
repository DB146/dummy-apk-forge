package com.google.android.gms.internal.pal;

/* loaded from: classes.dex */
public final class zzy extends zzacz implements zzaeg {
    private static final zzy zzb;
    private int zze;
    private int zzf;
    private long zzg = -1;

    static {
        zzy zzyVar = new zzy();
        zzb = zzyVar;
        zzacz.zzaF(zzy.class, zzyVar);
    }

    private zzy() {
    }

    @Override // com.google.android.gms.internal.pal.zzacz
    public final Object zzb(int i7, Object obj, Object obj2) {
        int i10 = i7 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzacz.zzaE(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဂ\u0001", new Object[]{"zze", "zzf", zzv.zza, "zzg"});
        }
        if (i10 == 3) {
            return new zzy();
        }
        zzq zzqVar = null;
        if (i10 == 4) {
            return new zzx(zzqVar);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }
}
