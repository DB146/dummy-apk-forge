package com.google.ads.interactivemedia.v3.internal;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class zzqp extends zzmq implements zzqr {
    public zzqp(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.gass.internal.clearcut.IGassClearcut");
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzqr
    public final void zze(P5.a aVar, String str, String str2) {
        Parcel zza = zza();
        zzms.zzd(zza, aVar);
        zza.writeString(str);
        zza.writeString(null);
        zzv(8, zza);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzqr
    public final void zzf() {
        zzv(3, zza());
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzqr
    public final void zzg(int i7) {
        Parcel zza = zza();
        zza.writeInt(i7);
        zzv(7, zza);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzqr
    public final void zzh(int[] iArr) {
        Parcel zza = zza();
        zza.writeIntArray(null);
        zzv(4, zza);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzqr
    public final void zzi(int i7) {
        Parcel zza = zza();
        zza.writeInt(i7);
        zzv(6, zza);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzqr
    public final void zzj(byte[] bArr) {
        Parcel zza = zza();
        zza.writeByteArray(bArr);
        zzv(5, zza);
    }
}
