package com.google.android.gms.internal.appset;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import u5.C2111c;

/* loaded from: classes.dex */
public final class zzg extends zza implements IInterface {
    public zzg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.appset.internal.IAppSetService");
    }

    public final void zzc(C2111c c2111c, zzf zzfVar) {
        Parcel zza = zza();
        zzc.zzb(zza, c2111c);
        zzc.zzc(zza, zzfVar);
        zzb(1, zza);
    }
}
