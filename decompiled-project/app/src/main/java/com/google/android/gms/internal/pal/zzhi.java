package com.google.android.gms.internal.pal;

import G5.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.bumptech.glide.d;

/* loaded from: classes.dex */
public final class zzhi extends a {
    public static final Parcelable.Creator<zzhi> CREATOR = new zzhj();
    public final int zza;
    public final String zzb;
    public final String zzc;

    public zzhi(int i7, String str, String str2) {
        this.zza = i7;
        this.zzb = str;
        this.zzc = str2;
    }

    public zzhi(String str, String str2) {
        this(1, str, str2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int M3 = d.M(20293, parcel);
        int i10 = this.zza;
        d.O(parcel, 1, 4);
        parcel.writeInt(i10);
        d.H(parcel, 2, this.zzb, false);
        d.H(parcel, 3, this.zzc, false);
        d.N(M3, parcel);
    }
}
