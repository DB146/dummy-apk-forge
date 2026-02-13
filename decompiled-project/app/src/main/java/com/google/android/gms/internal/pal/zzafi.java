package com.google.android.gms.internal.pal;

/* loaded from: classes.dex */
abstract class zzafi {
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

    public abstract void zzk(Object obj, int i7, zzaby zzabyVar);

    public abstract void zzl(Object obj, int i7, long j);

    public abstract void zzm(Object obj);

    public abstract void zzn(Object obj, Object obj2);

    public abstract void zzo(Object obj, Object obj2);

    public abstract void zzp(Object obj, zzaga zzagaVar);

    public final boolean zzq(Object obj, zzaeq zzaeqVar) {
        int zzd = zzaeqVar.zzd();
        int i7 = zzd >>> 3;
        int i10 = zzd & 7;
        if (i10 == 0) {
            zzl(obj, i7, zzaeqVar.zzl());
            return true;
        }
        if (i10 == 1) {
            zzi(obj, i7, zzaeqVar.zzk());
            return true;
        }
        if (i10 == 2) {
            zzk(obj, i7, zzaeqVar.zzp());
            return true;
        }
        if (i10 != 3) {
            if (i10 == 4) {
                return false;
            }
            if (i10 != 5) {
                throw zzadi.zza();
            }
            zzh(obj, i7, zzaeqVar.zzf());
            return true;
        }
        Object zzf = zzf();
        int i11 = 4 | (i7 << 3);
        while (zzaeqVar.zzc() != Integer.MAX_VALUE && zzq(zzf, zzaeqVar)) {
        }
        if (i11 != zzaeqVar.zzd()) {
            throw zzadi.zzb();
        }
        zzg(zzf);
        zzj(obj, i7, zzf);
        return true;
    }

    public abstract boolean zzr(zzaeq zzaeqVar);
}
