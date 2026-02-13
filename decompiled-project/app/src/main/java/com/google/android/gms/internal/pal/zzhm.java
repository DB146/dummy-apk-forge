package com.google.android.gms.internal.pal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class zzhm extends zzfj implements IInterface {
    public zzhm(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.gass.internal.IGassService");
    }

    public final zzhk zze(zzhi zzhiVar) {
        Parcel zza = zza();
        zzfl.zzd(zza, zzhiVar);
        Parcel zzt = zzt(1, zza);
        zzhk zzhkVar = (zzhk) zzfl.zza(zzt, zzhk.CREATOR);
        zzt.recycle();
        return zzhkVar;
    }
}
