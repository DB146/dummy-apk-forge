package com.google.android.gms.internal.measurement;

import sun.misc.Unsafe;

/* loaded from: classes.dex */
final class zzom extends zzon {
    public zzom(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.measurement.zzon
    public final void zza(Object obj, long j, byte b2) {
        if (zzoo.zzb) {
            zzoo.zzD(obj, j, b2);
        } else {
            zzoo.zzE(obj, j, b2);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzon
    public final boolean zzb(Object obj, long j) {
        return zzoo.zzb ? zzoo.zzu(obj, j) : zzoo.zzv(obj, j);
    }

    @Override // com.google.android.gms.internal.measurement.zzon
    public final void zzc(Object obj, long j, boolean z8) {
        if (zzoo.zzb) {
            zzoo.zzD(obj, j, r3 ? (byte) 1 : (byte) 0);
        } else {
            zzoo.zzE(obj, j, r3 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzon
    public final float zzd(Object obj, long j) {
        return Float.intBitsToFloat(this.zza.getInt(obj, j));
    }

    @Override // com.google.android.gms.internal.measurement.zzon
    public final void zze(Object obj, long j, float f4) {
        this.zza.putInt(obj, j, Float.floatToIntBits(f4));
    }

    @Override // com.google.android.gms.internal.measurement.zzon
    public final double zzf(Object obj, long j) {
        return Double.longBitsToDouble(this.zza.getLong(obj, j));
    }

    @Override // com.google.android.gms.internal.measurement.zzon
    public final void zzg(Object obj, long j, double d10) {
        this.zza.putLong(obj, j, Double.doubleToLongBits(d10));
    }
}
