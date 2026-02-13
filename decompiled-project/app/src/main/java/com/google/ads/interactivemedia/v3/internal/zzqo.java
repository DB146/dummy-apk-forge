package com.google.ads.interactivemedia.v3.internal;

import P5.b;
import Q5.d;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.util.VisibleForTesting;

/* loaded from: classes.dex */
public final class zzqo {

    @VisibleForTesting
    final zzqr zza;

    @VisibleForTesting
    final boolean zzb;

    private zzqo(zzqr zzqrVar) {
        this.zza = zzqrVar;
        this.zzb = zzqrVar != null;
    }

    public static zzqo zzb(Context context, String str, String str2) {
        zzqr zzqpVar;
        try {
            try {
                try {
                    IBinder b2 = d.c(context, d.f8650b, "com.google.android.gms.ads.dynamite").b("com.google.android.gms.gass.internal.clearcut.GassDynamiteClearcutLogger");
                    if (b2 == null) {
                        zzqpVar = null;
                    } else {
                        IInterface queryLocalInterface = b2.queryLocalInterface("com.google.android.gms.gass.internal.clearcut.IGassClearcut");
                        zzqpVar = queryLocalInterface instanceof zzqr ? (zzqr) queryLocalInterface : new zzqp(b2);
                    }
                    zzqpVar.zze(new b(context), str, null);
                    Log.i("GASS", "GassClearcutLogger Initialized.");
                    return new zzqo(zzqpVar);
                } catch (Exception e2) {
                    throw new zzps(e2);
                }
            } catch (Exception e10) {
                throw new zzps(e10);
            }
        } catch (RemoteException | zzps | NullPointerException | SecurityException unused) {
            Log.d("GASS", "Cannot dynamite load clearcut");
            return new zzqo(new zzqs());
        }
    }

    public static zzqo zzc() {
        zzqs zzqsVar = new zzqs();
        Log.d("GASS", "Clearcut logging disabled");
        return new zzqo(zzqsVar);
    }

    public final zzqn zza(byte[] bArr) {
        return new zzqn(this, bArr, null);
    }
}
