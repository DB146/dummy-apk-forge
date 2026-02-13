package com.google.android.gms.internal.pal;

/* loaded from: classes.dex */
public final class zzi extends zzacz implements zzaeg {
    private static final zzi zzb;
    private int zze;
    private zzk zzf;
    private zzp zzg;

    static {
        zzi zziVar = new zzi();
        zzb = zziVar;
        zzacz.zzaF(zzi.class, zziVar);
    }

    private zzi() {
    }

    public static zzi zzc(byte[] bArr, zzacm zzacmVar) {
        return (zzi) zzacz.zzax(zzb, bArr, zzacmVar);
    }

    @Override // com.google.android.gms.internal.pal.zzacz
    public final Object zzb(int i7, Object obj, Object obj2) {
        int i10 = i7 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return zzacz.zzaE(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"zze", "zzf", "zzg"});
        }
        if (i10 == 3) {
            return new zzi();
        }
        if (i10 == 4) {
            return new zzh(null);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }

    public final zzk zzd() {
        zzk zzkVar = this.zzf;
        return zzkVar == null ? zzk.zzc() : zzkVar;
    }

    public final zzp zze() {
        zzp zzpVar = this.zzg;
        return zzpVar == null ? zzp.zzc() : zzpVar;
    }

    public final boolean zzf() {
        return (this.zze & 1) != 0;
    }

    public final boolean zzg() {
        return (this.zze & 2) != 0;
    }
}
