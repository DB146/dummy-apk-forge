package com.google.android.gms.internal.pal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class zzgu extends zzfj implements zzgw {
    public zzgu(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.signalsdk.ISignalSdkService");
    }

    @Override // com.google.android.gms.internal.pal.zzgw
    public final void zze(Bundle bundle, zzgt zzgtVar) {
        Parcel zza = zza();
        zzfl.zzd(zza, bundle);
        zzfl.zze(zza, zzgtVar);
        zzv(1, zza);
    }
}
