package com.google.ads.interactivemedia.v3.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.bumptech.glide.c;

/* loaded from: classes.dex */
public final class zzqg implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int d02 = c.d0(parcel);
        int i7 = 0;
        byte[] bArr = null;
        int i10 = 0;
        while (parcel.dataPosition() < d02) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 1) {
                i7 = c.Q(readInt, parcel);
            } else if (c10 == 2) {
                bArr = c.l(readInt, parcel);
            } else if (c10 != 3) {
                c.b0(readInt, parcel);
            } else {
                i10 = c.Q(readInt, parcel);
            }
        }
        c.y(d02, parcel);
        return new zzqf(i7, bArr, i10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new zzqf[i7];
    }
}
