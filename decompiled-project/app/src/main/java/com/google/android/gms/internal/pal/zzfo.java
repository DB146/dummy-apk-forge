package com.google.android.gms.internal.pal;

import F5.f;
import P5.b;
import P5.c;
import P5.d;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class zzfo extends d {
    private static final zzfo zza = new zzfo();

    private zzfo() {
    }

    @Deprecated
    public static zzfr zza(String str, Context context, boolean z8, boolean z10) {
        zzfr zzb = f.f4100b.d(context, 12800000) == 0 ? zza.zzb("h.3.2.2/n.android.3.2.2", context, false) : null;
        return zzb == null ? new zzfn("h.3.2.2/n.android.3.2.2", context, false) : zzb;
    }

    private final zzfr zzb(String str, Context context, boolean z8) {
        try {
            IBinder zze = ((zzfs) getRemoteCreatorInstance(context)).zze("h.3.2.2/n.android.3.2.2", new b(context));
            if (zze == null) {
                return null;
            }
            IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.adshield.internal.IAdShieldClient");
            return queryLocalInterface instanceof zzfr ? (zzfr) queryLocalInterface : new zzfp(zze);
        } catch (c | RemoteException | LinkageError unused) {
            return null;
        }
    }

    @Override // P5.d
    public final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.adshield.internal.IAdShieldCreator");
        return queryLocalInterface instanceof zzfs ? (zzfs) queryLocalInterface : new zzfs(iBinder);
    }
}
