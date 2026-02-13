package com.google.android.gms.internal.pal;

/* loaded from: classes.dex */
public final class zztc extends zzacz implements zzaeg {
    private static final zztc zzb;
    private int zze;
    private int zzf;

    static {
        zztc zztcVar = new zztc();
        zzb = zztcVar;
        zzacz.zzaF(zztc.class, zztcVar);
    }

    private zztc() {
    }

    public static zztb zzc() {
        return (zztb) zzb.zzau();
    }

    public static zztc zze(zzaby zzabyVar, zzacm zzacmVar) {
        return (zztc) zzacz.zzaw(zzb, zzabyVar, zzacmVar);
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
            return zzacz.zzaE(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"zzf", "zze"});
        }
        if (i10 == 3) {
            return new zztc();
        }
        if (i10 == 4) {
            return new zztb(null);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }
}
