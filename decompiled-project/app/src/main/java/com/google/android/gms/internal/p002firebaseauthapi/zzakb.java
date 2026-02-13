package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.f;

/* loaded from: classes.dex */
public abstract class zzakb {
    private static volatile int zzd = 100;
    int zza;
    int zzb;
    zzakf zzc;
    private int zze;
    private int zzf;

    private zzakb() {
        this.zzf = zzd;
        this.zzb = f.API_PRIORITY_OTHER;
    }

    public static long zza(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    public static zzakb zza(byte[] bArr, int i7, int i10, boolean z8) {
        zzaka zzakaVar = new zzaka(bArr, i7, i10, z8);
        try {
            zzakaVar.zza(i10);
            return zzakaVar;
        } catch (zzalf e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public static int zze(int i7) {
        return (-(i7 & 1)) ^ (i7 >>> 1);
    }

    public abstract double zza();

    public abstract int zza(int i7);

    public abstract float zzb();

    public abstract void zzb(int i7);

    public abstract int zzc();

    public abstract void zzc(int i7);

    public abstract int zzd();

    public abstract boolean zzd(int i7);

    public abstract int zze();

    public abstract int zzf();

    public abstract int zzg();

    public abstract int zzh();

    public abstract int zzi();

    public abstract int zzj();

    public abstract long zzk();

    public abstract long zzl();

    public abstract long zzm();

    public abstract long zzn();

    public abstract long zzo();

    public abstract long zzp();

    public abstract zzajp zzq();

    public abstract String zzr();

    public abstract String zzs();

    public abstract boolean zzt();

    public abstract boolean zzu();

    public final void zzv() {
        if (this.zza + this.zze >= this.zzf) {
            throw zzalf.zzh();
        }
    }

    public final void zzw() {
        if (this.zze == 0) {
            zzb(0);
        }
    }

    public final void zzx() {
        int zzi;
        do {
            zzi = zzi();
            if (zzi == 0) {
                return;
            }
            zzv();
            this.zze++;
            this.zze--;
        } while (zzd(zzi));
    }
}
