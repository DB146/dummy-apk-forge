package com.google.android.gms.internal.p002firebaseauthapi;

/* loaded from: classes.dex */
abstract class zzano<T, B> {
    private static volatile int zza = 100;

    public abstract int zza(T t5);

    public abstract B zza();

    public abstract T zza(T t5, T t10);

    public abstract void zza(B b2, int i7, int i10);

    public abstract void zza(B b2, int i7, long j);

    public abstract void zza(B b2, int i7, zzajp zzajpVar);

    public abstract void zza(B b2, int i7, T t5);

    public abstract void zza(T t5, zzaof zzaofVar);

    public abstract boolean zza(zzams zzamsVar);

    public final boolean zza(B b2, zzams zzamsVar, int i7) {
        int zzd = zzamsVar.zzd();
        int i10 = zzd >>> 3;
        int i11 = zzd & 7;
        if (i11 == 0) {
            zzb(b2, i10, zzamsVar.zzl());
            return true;
        }
        if (i11 == 1) {
            zza((zzano<T, B>) b2, i10, zzamsVar.zzk());
            return true;
        }
        if (i11 == 2) {
            zza((zzano<T, B>) b2, i10, zzamsVar.zzp());
            return true;
        }
        if (i11 != 3) {
            if (i11 == 4) {
                if (i7 != 0) {
                    return false;
                }
                throw zzalf.zzb();
            }
            if (i11 != 5) {
                throw zzalf.zza();
            }
            zza((zzano<T, B>) b2, i10, zzamsVar.zzf());
            return true;
        }
        B zza2 = zza();
        int i12 = 4 | (i10 << 3);
        int i13 = i7 + 1;
        if (i13 >= zza) {
            throw zzalf.zzh();
        }
        while (zzamsVar.zzc() != Integer.MAX_VALUE && zza((zzano<T, B>) zza2, zzamsVar, i13)) {
        }
        if (i12 != zzamsVar.zzd()) {
            throw zzalf.zzb();
        }
        zza((zzano<T, B>) b2, i10, (int) zze(zza2));
        return true;
    }

    public abstract int zzb(T t5);

    public abstract void zzb(B b2, int i7, long j);

    public abstract void zzb(T t5, zzaof zzaofVar);

    public abstract void zzb(Object obj, B b2);

    public abstract B zzc(Object obj);

    public abstract void zzc(Object obj, T t5);

    public abstract T zzd(Object obj);

    public abstract T zze(B b2);

    public abstract void zzf(Object obj);
}
