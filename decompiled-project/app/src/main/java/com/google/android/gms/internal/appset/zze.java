package com.google.android.gms.internal.appset;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import u5.C2112d;

/* loaded from: classes.dex */
public abstract class zze extends zzb implements zzf {
    public zze() {
        super("com.google.android.gms.appset.internal.IAppSetIdCallback");
    }

    @Override // com.google.android.gms.internal.appset.zzb
    public final boolean zza(int i7, Parcel parcel, Parcel parcel2, int i10) {
        if (i7 != 1) {
            return false;
        }
        zzb((Status) zzc.zza(parcel, Status.CREATOR), (C2112d) zzc.zza(parcel, C2112d.CREATOR));
        return true;
    }
}
