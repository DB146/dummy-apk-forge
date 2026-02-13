package com.google.ads.interactivemedia.v3.internal;

import F5.f;
import P5.b;
import P5.c;
import P5.d;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class zzmv extends d {
    private static final zzmv zza = new zzmv();

    private zzmv() {
    }

    public static zzmy zza(Context context, Executor executor, zzm zzmVar) {
        zzmy zzmyVar = null;
        if (zzmVar.zzh() && f.f4100b.d(context, 12800000) == 0) {
            zzmyVar = zza.zzb(context, executor, zzmVar);
        }
        return zzmyVar == null ? new zzmu(context, executor, zzmVar) : zzmyVar;
    }

    private final zzmy zzb(Context context, Executor executor, zzm zzmVar) {
        try {
            IBinder zze = ((zzmz) getRemoteCreatorInstance(context)).zze(new b(context), new b(executor), zzmVar.zzav());
            if (zze == null) {
                return null;
            }
            IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.adshield.internal.IAdShieldClient");
            return queryLocalInterface instanceof zzmy ? (zzmy) queryLocalInterface : new zzmw(zze);
        } catch (c | RemoteException | IllegalArgumentException | LinkageError unused) {
            return null;
        }
    }

    @Override // P5.d
    public final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.adshield.internal.IAdShieldCreator");
        return queryLocalInterface instanceof zzmz ? (zzmz) queryLocalInterface : new zzmz(iBinder);
    }
}
