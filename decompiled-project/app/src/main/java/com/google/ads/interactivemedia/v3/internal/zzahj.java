package com.google.ads.interactivemedia.v3.internal;

/* loaded from: classes.dex */
abstract class zzahj {
    public abstract int zza(Object obj);

    public abstract int zzb(Object obj);

    public abstract Object zzc(Object obj);

    public abstract Object zzd(Object obj);

    public abstract Object zze(Object obj, Object obj2);

    public abstract Object zzf();

    public abstract Object zzg(Object obj);

    public abstract void zzh(Object obj, int i7, int i10);

    public abstract void zzi(Object obj, int i7, long j);

    public abstract void zzj(Object obj, int i7, Object obj2);

    public abstract void zzk(Object obj, int i7, zzadr zzadrVar);

    public abstract void zzl(Object obj, int i7, long j);

    public abstract void zzm(Object obj);

    public abstract void zzn(Object obj, Object obj2);

    public abstract void zzo(Object obj, Object obj2);

    public abstract void zzp(Object obj, zzaib zzaibVar);

    public final boolean zzq(Object obj, zzagk zzagkVar) {
        int zzd = zzagkVar.zzd();
        int i7 = zzd >>> 3;
        int i10 = zzd & 7;
        if (i10 == 0) {
            zzl(obj, i7, zzagkVar.zzl());
            return true;
        }
        if (i10 == 1) {
            zzi(obj, i7, zzagkVar.zzk());
            return true;
        }
        if (i10 == 2) {
            zzk(obj, i7, zzagkVar.zzp());
            return true;
        }
        if (i10 != 3) {
            if (i10 == 4) {
                return false;
            }
            if (i10 != 5) {
                throw zzafc.zza();
            }
            zzh(obj, i7, zzagkVar.zzf());
            return true;
        }
        Object zzf = zzf();
        int i11 = i7 << 3;
        while (zzagkVar.zzc() != Integer.MAX_VALUE && zzq(zzf, zzagkVar)) {
        }
        if ((4 | i11) != zzagkVar.zzd()) {
            throw zzafc.zzb();
        }
        zzg(zzf);
        zzj(obj, i7, zzf);
        return true;
    }

    public abstract boolean zzr(zzagk zzagkVar);
}
