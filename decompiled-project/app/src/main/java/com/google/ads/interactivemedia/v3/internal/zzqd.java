package com.google.ads.interactivemedia.v3.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.bumptech.glide.d;

/* loaded from: classes.dex */
public final class zzqd extends G5.a {
    public static final Parcelable.Creator<zzqd> CREATOR = new zzqe();
    public final int zza;
    public final int zzb;
    public final String zzc;
    public final String zzd;
    public final int zze;

    public zzqd(int i7, int i10, int i11, String str, String str2) {
        this.zza = i7;
        this.zzb = i10;
        this.zzc = str;
        this.zzd = str2;
        this.zze = i11;
    }

    public zzqd(int i7, int i10, String str, String str2) {
        this(1, 1, i10 - 1, str, str2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int M3 = d.M(20293, parcel);
        int i10 = this.zza;
        d.O(parcel, 1, 4);
        parcel.writeInt(i10);
        int i11 = this.zzb;
        d.O(parcel, 2, 4);
        parcel.writeInt(i11);
        d.H(parcel, 3, this.zzc, false);
        d.H(parcel, 4, this.zzd, false);
        int i12 = this.zze;
        d.O(parcel, 5, 4);
        parcel.writeInt(i12);
        d.N(M3, parcel);
    }
}
