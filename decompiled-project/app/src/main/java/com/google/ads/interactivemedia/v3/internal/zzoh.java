package com.google.ads.interactivemedia.v3.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.bumptech.glide.c;

/* loaded from: classes.dex */
public final class zzoh implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int d02 = c.d0(parcel);
        String str = "";
        int i7 = 0;
        String str2 = null;
        while (parcel.dataPosition() < d02) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 1) {
                str2 = c.r(readInt, parcel);
            } else if (c10 == 2) {
                i7 = c.Q(readInt, parcel);
            } else if (c10 != 3) {
                c.b0(readInt, parcel);
            } else {
                str = c.r(readInt, parcel);
            }
        }
        c.y(d02, parcel);
        return new zzog(str2, i7, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new zzog[i7];
    }
}
