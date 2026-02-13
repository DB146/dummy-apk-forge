package com.google.android.gms.internal.appindex;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.bumptech.glide.c;

/* loaded from: classes.dex */
public final class zzl implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int d02 = c.d0(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        Bundle bundle = null;
        while (parcel.dataPosition() < d02) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 1) {
                str = c.r(readInt, parcel);
            } else if (c10 == 2) {
                str2 = c.r(readInt, parcel);
            } else if (c10 == 3) {
                str3 = c.r(readInt, parcel);
            } else if (c10 == 4) {
                str4 = c.r(readInt, parcel);
            } else if (c10 == 6) {
                str5 = c.r(readInt, parcel);
            } else if (c10 != 7) {
                c.b0(readInt, parcel);
            } else {
                bundle = c.k(readInt, parcel);
            }
        }
        c.y(d02, parcel);
        return new zzk(str, str2, str3, str4, str5, bundle);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new zzk[i7];
    }
}
