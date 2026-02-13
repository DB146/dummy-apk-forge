package com.google.ads.interactivemedia.v3.internal;

import android.os.Bundle;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class zzob extends zzmr implements zzoc {
    public zzob() {
        super("com.google.android.gms.ads.signalsdk.ISignalSdkCallback");
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzmr
    public final boolean zza(int i7, Parcel parcel, Parcel parcel2, int i10) {
        if (i7 == 1) {
            Bundle bundle = (Bundle) zzms.zza(parcel, Bundle.CREATOR);
            zzms.zzb(parcel);
            zzc(bundle);
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
