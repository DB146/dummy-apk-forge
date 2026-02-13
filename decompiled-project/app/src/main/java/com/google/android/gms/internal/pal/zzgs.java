package com.google.android.gms.internal.pal;

import android.os.Bundle;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class zzgs extends zzfk implements zzgt {
    public zzgs() {
        super("com.google.android.gms.ads.signalsdk.ISignalSdkCallback");
    }

    @Override // com.google.android.gms.internal.pal.zzfk
    public final boolean zza(int i7, Parcel parcel, Parcel parcel2, int i10) {
        if (i7 == 1) {
            Bundle bundle = (Bundle) zzfl.zza(parcel, Bundle.CREATOR);
            zzfl.zzb(parcel);
            zzc(bundle);
        } else {
            if (i7 != 2) {
                return false;
            }
            int readInt = parcel.readInt();
            zzfl.zzb(parcel);
            zzb(readInt);
        }
        return true;
    }
}
