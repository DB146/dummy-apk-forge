package com.google.android.gms.internal.pal;

/* loaded from: classes.dex */
public final class zzsz extends zzacz implements zzaeg {
    private static final zzsz zzb;
    private int zze;
    private zzaby zzf = zzaby.zzb;

    static {
        zzsz zzszVar = new zzsz();
        zzb = zzszVar;
        zzacz.zzaF(zzsz.class, zzszVar);
    }

    private zzsz() {
    }

    public static zzsy zzc() {
        return (zzsy) zzb.zzau();
    }

    public static zzsz zze(zzaby zzabyVar, zzacm zzacmVar) {
        return (zzsz) zzacz.zzaw(zzb, zzabyVar, zzacmVar);
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
            return zzacz.zzaE(zzb, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"zze", "zzf"});
        }
        if (i10 == 3) {
            return new zzsz();
        }
        zzsx zzsxVar = null;
        if (i10 == 4) {
            return new zzsy(zzsxVar);
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
