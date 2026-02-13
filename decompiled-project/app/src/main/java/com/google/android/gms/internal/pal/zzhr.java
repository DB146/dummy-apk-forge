package com.google.android.gms.internal.pal;

import P1.g;
import P5.b;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class zzhr extends zzfk implements zzhs {
    public zzhr() {
        super("com.google.android.gms.gass.internal.clearcut.IGassClearcut");
    }

    @Override // com.google.android.gms.internal.pal.zzfk
    public final boolean zza(int i7, Parcel parcel, Parcel parcel2, int i10) {
        switch (i7) {
            case 2:
                b.h(parcel.readStrongBinder());
                parcel.readString();
                zzfl.zzb(parcel);
                break;
            case 3:
                break;
            case 4:
                parcel.createIntArray();
                zzfl.zzb(parcel);
                break;
            case 5:
                parcel.createByteArray();
                zzfl.zzb(parcel);
                break;
            case 6:
                parcel.readInt();
                zzfl.zzb(parcel);
                break;
            case 7:
                parcel.readInt();
                zzfl.zzb(parcel);
                break;
            case g.BYTES_FIELD_NUMBER /* 8 */:
                b.h(parcel.readStrongBinder());
                parcel.readString();
                parcel.readString();
                zzfl.zzb(parcel);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
