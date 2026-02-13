package com.google.android.gms.internal.pal;

/* loaded from: classes.dex */
public final class zzp extends zzacz implements zzaeg {
    private static final zzp zzb;
    private int zze;
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";
    private String zzk = "";

    static {
        zzp zzpVar = new zzp();
        zzb = zzpVar;
        zzacz.zzaF(zzp.class, zzpVar);
    }

    private zzp() {
    }

    public static zzp zzc() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.pal.zzacz
    public final Object zzb(int i7, Object obj, Object obj2) {
        int i10 = i7 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzacz.zzaE(zzb, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        if (i10 == 3) {
            return new zzp();
        }
        zzg zzgVar = null;
        if (i10 == 4) {
            return new zzo(zzgVar);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }

    public final String zzd() {
        return this.zzf;
    }

    public final String zze() {
        return this.zzk;
    }
}
