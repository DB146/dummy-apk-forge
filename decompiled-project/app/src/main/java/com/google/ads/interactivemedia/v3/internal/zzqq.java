package com.google.ads.interactivemedia.v3.internal;

import P1.g;
import P5.b;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class zzqq extends zzmr implements zzqr {
    public zzqq() {
        super("com.google.android.gms.gass.internal.clearcut.IGassClearcut");
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzmr
    public final boolean zza(int i7, Parcel parcel, Parcel parcel2, int i10) {
        switch (i7) {
            case 2:
                b.h(parcel.readStrongBinder());
                parcel.readString();
                zzms.zzb(parcel);
                break;
            case 3:
                break;
            case 4:
                parcel.createIntArray();
                zzms.zzb(parcel);
                break;
            case 5:
                parcel.createByteArray();
                zzms.zzb(parcel);
                break;
            case 6:
                parcel.readInt();
                zzms.zzb(parcel);
                break;
            case 7:
                parcel.readInt();
                zzms.zzb(parcel);
                break;
            case g.BYTES_FIELD_NUMBER /* 8 */:
                b.h(parcel.readStrongBinder());
                parcel.readString();
                parcel.readString();
                zzms.zzb(parcel);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
