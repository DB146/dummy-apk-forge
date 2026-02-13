package com.google.android.gms.internal.pal;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes.dex */
public abstract class zzgv extends zzfk implements zzgw {
    public static zzgw zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.signalsdk.ISignalSdkService");
        return queryLocalInterface instanceof zzgw ? (zzgw) queryLocalInterface : new zzgu(iBinder);
    }
}
