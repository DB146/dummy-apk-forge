package com.google.ads.interactivemedia.v3.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class zzmz extends zzmq implements IInterface {
    public zzmz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.adshield.internal.IAdShieldCreator");
    }

    public final IBinder zze(P5.a aVar, P5.a aVar2, byte[] bArr) {
        Parcel zza = zza();
        zzms.zzd(zza, aVar);
        zzms.zzd(zza, aVar2);
        zza.writeByteArray(bArr);
        Parcel zzu = zzu(3, zza);
        IBinder readStrongBinder = zzu.readStrongBinder();
        zzu.recycle();
        return readStrongBinder;
    }
}
