package com.google.android.gms.internal.pal;

import P5.a;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class zzfs extends zzfj implements IInterface {
    public zzfs(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.adshield.internal.IAdShieldCreator");
    }

    public final IBinder zze(String str, a aVar) {
        Parcel zza = zza();
        zza.writeString("h.3.2.2/n.android.3.2.2");
        zzfl.zze(zza, aVar);
        Parcel zzt = zzt(2, zza);
        IBinder readStrongBinder = zzt.readStrongBinder();
        zzt.recycle();
        return readStrongBinder;
    }
}
