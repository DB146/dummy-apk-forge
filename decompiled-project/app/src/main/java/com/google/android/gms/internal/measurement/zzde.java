package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.bumptech.glide.c;

/* loaded from: classes.dex */
public final class zzde implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int d02 = c.d0(parcel);
        Bundle bundle = null;
        String str = null;
        boolean z8 = false;
        long j = 0;
        long j10 = 0;
        while (parcel.dataPosition() < d02) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 1) {
                j = c.S(readInt, parcel);
            } else if (c10 == 2) {
                j10 = c.S(readInt, parcel);
            } else if (c10 == 3) {
                z8 = c.M(readInt, parcel);
            } else if (c10 == 7) {
                bundle = c.k(readInt, parcel);
            } else if (c10 != '\b') {
                c.b0(readInt, parcel);
            } else {
                str = c.r(readInt, parcel);
            }
        }
        c.y(d02, parcel);
        return new zzdd(j, j10, z8, bundle, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new zzdd[i7];
    }
}
