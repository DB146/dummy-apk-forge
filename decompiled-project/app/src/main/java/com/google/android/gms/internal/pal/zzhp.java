package com.google.android.gms.internal.pal;

import P5.b;
import Q5.d;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.util.VisibleForTesting;

/* loaded from: classes.dex */
public final class zzhp {

    @VisibleForTesting
    final zzhs zza;

    @VisibleForTesting
    final boolean zzb;

    private zzhp(zzhs zzhsVar) {
        this.zza = zzhsVar;
        this.zzb = zzhsVar != null;
    }

    public static zzhp zzb(Context context, String str, String str2) {
        zzhs zzhqVar;
        try {
            try {
                try {
                    IBinder b2 = d.c(context, d.f8650b, "com.google.android.gms.ads.dynamite").b("com.google.android.gms.gass.internal.clearcut.GassDynamiteClearcutLogger");
                    if (b2 == null) {
                        zzhqVar = null;
                    } else {
                        IInterface queryLocalInterface = b2.queryLocalInterface("com.google.android.gms.gass.internal.clearcut.IGassClearcut");
                        zzhqVar = queryLocalInterface instanceof zzhs ? (zzhs) queryLocalInterface : new zzhq(b2);
                    }
                    zzhqVar.zze(new b(context), "ADSHIELD", null);
                    Log.i("GASS", "GassClearcutLogger Initialized.");
                    return new zzhp(zzhqVar);
                } catch (Exception e2) {
                    throw new zzhg(e2);
                }
            } catch (RemoteException | zzhg | NullPointerException | SecurityException unused) {
                Log.d("GASS", "Cannot dynamite load clearcut");
                return new zzhp(new zzht());
            }
        } catch (Exception e10) {
            throw new zzhg(e10);
        }
    }

    public final zzho zza(byte[] bArr) {
        return new zzho(this, bArr, null);
    }
}
