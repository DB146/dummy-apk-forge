package com.google.android.gms.internal.p002firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.bumptech.glide.c;

/* loaded from: classes.dex */
public final class zzaiq implements Parcelable.Creator<zzair> {
    @Override // android.os.Parcelable.Creator
    public final zzair createFromParcel(Parcel parcel) {
        int d02 = c.d0(parcel);
        while (parcel.dataPosition() < d02) {
            c.b0(parcel.readInt(), parcel);
        }
        c.y(d02, parcel);
        return new zzair();
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzair[] newArray(int i7) {
        return new zzair[i7];
    }
}
