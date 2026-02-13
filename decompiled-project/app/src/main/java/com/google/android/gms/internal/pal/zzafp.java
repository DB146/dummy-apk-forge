package com.google.android.gms.internal.pal;

import sun.misc.Unsafe;

/* loaded from: classes.dex */
final class zzafp extends zzafr {
    public zzafp(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.pal.zzafr
    public final double zza(Object obj, long j) {
        return Double.longBitsToDouble(zzk(obj, j));
    }

    @Override // com.google.android.gms.internal.pal.zzafr
    public final float zzb(Object obj, long j) {
        return Float.intBitsToFloat(zzj(obj, j));
    }

    @Override // com.google.android.gms.internal.pal.zzafr
    public final void zzc(Object obj, long j, boolean z8) {
        if (zzafs.zzb) {
            zzafs.zzD(obj, j, r3 ? (byte) 1 : (byte) 0);
        } else {
            zzafs.zzE(obj, j, r3 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.pal.zzafr
    public final void zzd(Object obj, long j, byte b2) {
        if (zzafs.zzb) {
            zzafs.zzD(obj, j, b2);
        } else {
            zzafs.zzE(obj, j, b2);
        }
    }

    @Override // com.google.android.gms.internal.pal.zzafr
    public final void zze(Object obj, long j, double d10) {
        zzo(obj, j, Double.doubleToLongBits(d10));
    }

    @Override // com.google.android.gms.internal.pal.zzafr
    public final void zzf(Object obj, long j, float f4) {
        zzn(obj, j, Float.floatToIntBits(f4));
    }

    @Override // com.google.android.gms.internal.pal.zzafr
    public final boolean zzg(Object obj, long j) {
        return zzafs.zzb ? zzafs.zzt(obj, j) : zzafs.zzu(obj, j);
    }
}
