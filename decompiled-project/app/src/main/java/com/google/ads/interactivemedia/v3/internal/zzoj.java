package com.google.ads.interactivemedia.v3.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.bumptech.glide.c;

/* loaded from: classes.dex */
public final class zzoj implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int d02 = c.d0(parcel);
        String str = null;
        while (parcel.dataPosition() < d02) {
            int readInt = parcel.readInt();
            if (((char) readInt) != 1) {
                c.b0(readInt, parcel);
            } else {
                str = c.r(readInt, parcel);
            }
        }
        c.y(d02, parcel);
        return new zzoi(str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new zzoi[i7];
    }
}
