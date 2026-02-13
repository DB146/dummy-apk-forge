package com.google.ads.interactivemedia.v3.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.bumptech.glide.d;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class zzqf extends G5.a {
    public static final Parcelable.Creator<zzqf> CREATOR = new zzqg();
    public final int zza;
    public final byte[] zzb;
    public final int zzc;

    public zzqf(int i7, byte[] bArr, int i10) {
        this.zza = i7;
        this.zzb = bArr == null ? null : Arrays.copyOf(bArr, bArr.length);
        this.zzc = i10;
    }

    public zzqf(byte[] bArr, int i7) {
        this(1, null, 1);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int M3 = d.M(20293, parcel);
        int i10 = this.zza;
        d.O(parcel, 1, 4);
        parcel.writeInt(i10);
        d.A(parcel, 2, this.zzb, false);
        int i11 = this.zzc;
        d.O(parcel, 3, 4);
        parcel.writeInt(i11);
        d.N(M3, parcel);
    }
}
