package com.google.android.gms.internal.appindex;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class zzf extends zza implements IInterface {
    public zzf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
    }

    public final void zzd(zzh zzhVar, zzk[] zzkVarArr) {
        Parcel zza = zza();
        zzc.zzd(zza, zzhVar);
        zza.writeTypedArray(zzkVarArr, 0);
        zzc(7, zza);
    }
}
