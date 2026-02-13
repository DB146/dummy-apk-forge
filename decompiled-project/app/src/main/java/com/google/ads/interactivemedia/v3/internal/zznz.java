package com.google.ads.interactivemedia.v3.internal;

import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class zznz extends zzmr implements zzoa {
    public zznz() {
        super("com.google.android.gms.ads.signalsdk.INetworkRequestCallback");
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzmr
    public final boolean zza(int i7, Parcel parcel, Parcel parcel2, int i10) {
        if (i7 == 1) {
            zzoi zzoiVar = (zzoi) zzms.zza(parcel, zzoi.CREATOR);
            zzms.zzb(parcel);
            zzc(zzoiVar);
        } else {
            if (i7 != 2) {
                return false;
            }
            int readInt = parcel.readInt();
            zzms.zzb(parcel);
            zzb(readInt);
        }
        return true;
    }
}
