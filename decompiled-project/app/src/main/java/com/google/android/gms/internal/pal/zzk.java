package com.google.android.gms.internal.pal;

/* loaded from: classes.dex */
public final class zzk extends zzacz implements zzaeg {
    private static final zzk zzb;
    private int zze;
    private int zzf = 2;

    static {
        zzk zzkVar = new zzk();
        zzb = zzkVar;
        zzacz.zzaF(zzk.class, zzkVar);
    }

    private zzk() {
    }

    public static zzk zzc() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.pal.zzacz
    public final Object zzb(int i7, Object obj, Object obj2) {
        int i10 = i7 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzacz.zzaE(zzb, "\u0001\u0001\u0000\u0001\u001b\u001b\u0001\u0000\u0000\u0000\u001bဌ\u0000", new Object[]{"zze", "zzf", zzm.zza});
        }
        if (i10 == 3) {
            return new zzk();
        }
        if (i10 == 4) {
            return new zzj(null);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }

    public final int zzd() {
        int zza = zzn.zza(this.zzf);
        if (zza == 0) {
            return 3;
        }
        return zza;
    }
}
