package com.google.android.gms.internal.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.bumptech.glide.c;

/* loaded from: classes.dex */
public final class zzay implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int d02 = c.d0(parcel);
        String str = null;
        int i7 = 0;
        while (parcel.dataPosition() < d02) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 1) {
                i7 = c.Q(readInt, parcel);
            } else if (c10 != 2) {
                c.b0(readInt, parcel);
            } else {
                str = c.r(readInt, parcel);
            }
        }
        c.y(d02, parcel);
        return new zzax(i7, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new zzax[i7];
    }
}
