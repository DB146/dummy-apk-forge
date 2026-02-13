package com.google.ads.interactivemedia.v3.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.bumptech.glide.d;

/* loaded from: classes.dex */
public final class zzoi extends G5.a {
    public static final Parcelable.Creator<zzoi> CREATOR = new zzoj();
    private final String zza;

    public zzoi(String str) {
        this.zza = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int M3 = d.M(20293, parcel);
        d.H(parcel, 1, this.zza, false);
        d.N(M3, parcel);
    }

    public final String zza() {
        return this.zza;
    }
}
