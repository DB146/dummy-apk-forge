package com.google.android.gms.internal.pal;

/* loaded from: classes.dex */
public abstract class zzacc {
    public static final /* synthetic */ int zzd = 0;
    private static volatile int zze = 100;
    int zza;
    final int zzb = zze;
    zzacd zzc;

    public /* synthetic */ zzacc(zzacb zzacbVar) {
    }

    public static int zzs(int i7) {
        return (-(i7 & 1)) ^ (i7 >>> 1);
    }

    public static long zzt(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    public static zzacc zzu(byte[] bArr, int i7, int i10, boolean z8) {
        zzaca zzacaVar = new zzaca(bArr, 0, i10, z8, null);
        try {
            zzacaVar.zzc(i10);
            return zzacaVar;
        } catch (zzadi e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public abstract int zzb();

    public abstract int zzc(int i7);

    public abstract int zzf();

    public abstract zzaby zzj();

    public abstract String zzk();

    public abstract String zzl();

    public abstract void zzm(int i7);

    public abstract void zzn(int i7);

    public abstract boolean zzp();

    public abstract boolean zzq();

    public abstract boolean zzr(int i7);
}
