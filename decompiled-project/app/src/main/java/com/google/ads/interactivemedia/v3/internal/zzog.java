package com.google.ads.interactivemedia.v3.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.bumptech.glide.d;

/* loaded from: classes.dex */
public final class zzog extends G5.a {
    public static final Parcelable.Creator<zzog> CREATOR = new zzoh();
    private final String zza;
    private final int zzb;
    private final String zzc;

    public zzog(String str, int i7, String str2) {
        this.zza = str;
        this.zzb = i7;
        this.zzc = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int M3 = d.M(20293, parcel);
        d.H(parcel, 1, this.zza, false);
        int i10 = this.zzb;
        d.O(parcel, 2, 4);
        parcel.writeInt(i10);
        d.H(parcel, 3, this.zzc, false);
        d.N(M3, parcel);
    }
}
