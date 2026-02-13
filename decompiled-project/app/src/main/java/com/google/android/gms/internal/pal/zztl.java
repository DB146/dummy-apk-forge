package com.google.android.gms.internal.pal;

/* loaded from: classes.dex */
public final class zztl extends zzacz implements zzaeg {
    private static final zztl zzb;
    private int zze;
    private zzaby zzf = zzaby.zzb;

    static {
        zztl zztlVar = new zztl();
        zzb = zztlVar;
        zzacz.zzaF(zztl.class, zztlVar);
    }

    private zztl() {
    }

    public static zztk zzc() {
        return (zztk) zzb.zzau();
    }

    public static zztl zze(zzaby zzabyVar, zzacm zzacmVar) {
        return (zztl) zzacz.zzaw(zzb, zzabyVar, zzacmVar);
    }

    public final int zza() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.pal.zzacz
    public final Object zzb(int i7, Object obj, Object obj2) {
        int i10 = i7 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzacz.zzaE(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"zze", "zzf"});
        }
        if (i10 == 3) {
            return new zztl();
        }
        zztj zztjVar = null;
        if (i10 == 4) {
            return new zztk(zztjVar);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }

    public final zzaby zzf() {
        return this.zzf;
    }
}
