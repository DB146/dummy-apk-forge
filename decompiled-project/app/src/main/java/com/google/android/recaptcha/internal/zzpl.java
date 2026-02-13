package com.google.android.recaptcha.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class zzpl {
    private static volatile int zza = 100;

    public abstract Object zza(Object obj);

    public abstract Object zzb();

    public abstract Object zzc(Object obj);

    public abstract void zzd(Object obj, int i7, int i10);

    public abstract void zze(Object obj, int i7, long j);

    public abstract void zzf(Object obj, int i7, Object obj2);

    public abstract void zzg(Object obj, int i7, zzle zzleVar);

    public abstract void zzh(Object obj, int i7, long j);

    public abstract void zzi(Object obj);

    public abstract void zzj(Object obj, Object obj2);

    public final boolean zzk(Object obj, zzov zzovVar, int i7) {
        int zzd = zzovVar.zzd();
        int i10 = zzd >>> 3;
        int i11 = zzd & 7;
        if (i11 == 0) {
            zzh(obj, i10, zzovVar.zzl());
            return true;
        }
        if (i11 == 1) {
            zze(obj, i10, zzovVar.zzk());
            return true;
        }
        if (i11 == 2) {
            zzg(obj, i10, zzovVar.zzp());
            return true;
        }
        if (i11 != 3) {
            if (i11 == 4) {
                return false;
            }
            if (i11 != 5) {
                throw new zznm("Protocol message tag had invalid wire type.");
            }
            zzd(obj, i10, zzovVar.zzf());
            return true;
        }
        Object zzb = zzb();
        int i12 = i10 << 3;
        int i13 = i7 + 1;
        if (i13 >= zza) {
            throw new zznn("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        while (zzovVar.zzc() != Integer.MAX_VALUE && zzk(zzb, zzovVar, i13)) {
        }
        if ((i12 | 4) != zzovVar.zzd()) {
            throw new zznn("Protocol message end-group tag did not match expected tag.");
        }
        zzf(obj, i10, zzc(zzb));
        return true;
    }
}
