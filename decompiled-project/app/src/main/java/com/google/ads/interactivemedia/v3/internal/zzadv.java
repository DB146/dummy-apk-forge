package com.google.ads.interactivemedia.v3.internal;

/* loaded from: classes.dex */
public abstract class zzadv {
    public static final /* synthetic */ int zzd = 0;
    private static volatile int zze = 100;
    int zza;
    final int zzb = zze;
    zzadw zzc;

    public /* synthetic */ zzadv(zzadu zzaduVar) {
    }

    public static int zzs(int i7) {
        return (i7 >>> 1) ^ (-(i7 & 1));
    }

    public static long zzt(long j) {
        return (j >>> 1) ^ (-(1 & j));
    }

    public static zzadv zzu(byte[] bArr, int i7, int i10, boolean z8) {
        zzadt zzadtVar = new zzadt(bArr, i7, i10, z8, null);
        try {
            zzadtVar.zzc(i10);
            return zzadtVar;
        } catch (zzafc e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public abstract int zzb();

    public abstract int zzc(int i7);

    public abstract int zzf();

    public abstract zzadr zzj();

    public abstract String zzk();

    public abstract String zzl();

    public abstract void zzm(int i7);

    public abstract void zzn(int i7);

    public abstract boolean zzp();

    public abstract boolean zzq();

    public abstract boolean zzr(int i7);
}
