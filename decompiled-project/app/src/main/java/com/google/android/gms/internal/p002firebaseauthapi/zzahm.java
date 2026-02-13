package com.google.android.gms.internal.p002firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.bumptech.glide.c;

/* loaded from: classes.dex */
public final class zzahm implements Parcelable.Creator<zzahn> {
    @Override // android.os.Parcelable.Creator
    public final zzahn createFromParcel(Parcel parcel) {
        int d02 = c.d0(parcel);
        String str = null;
        String str2 = null;
        Long l10 = null;
        String str3 = null;
        Long l11 = null;
        while (parcel.dataPosition() < d02) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 2) {
                str = c.r(readInt, parcel);
            } else if (c10 == 3) {
                str2 = c.r(readInt, parcel);
            } else if (c10 == 4) {
                l10 = c.T(readInt, parcel);
            } else if (c10 == 5) {
                str3 = c.r(readInt, parcel);
            } else if (c10 != 6) {
                c.b0(readInt, parcel);
            } else {
                l11 = c.T(readInt, parcel);
            }
        }
        c.y(d02, parcel);
        return new zzahn(str, str2, l10, str3, l11);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzahn[] newArray(int i7) {
        return new zzahn[i7];
    }
}
