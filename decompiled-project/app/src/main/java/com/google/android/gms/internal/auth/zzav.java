package com.google.android.gms.internal.auth;

import G5.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.bumptech.glide.d;
import com.google.android.gms.common.internal.G;

/* loaded from: classes.dex */
public final class zzav extends a {
    public static final Parcelable.Creator<zzav> CREATOR = new zzaw();
    final int zza;
    public final String zzb;
    public final int zzc;

    public zzav(int i7, String str, int i10) {
        this.zza = 1;
        G.g(str);
        this.zzb = str;
        this.zzc = i10;
    }

    public zzav(String str, int i7) {
        this(1, str, i7);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int M3 = d.M(20293, parcel);
        int i10 = this.zza;
        d.O(parcel, 1, 4);
        parcel.writeInt(i10);
        d.H(parcel, 2, this.zzb, false);
        int i11 = this.zzc;
        d.O(parcel, 3, 4);
        parcel.writeInt(i11);
        d.N(M3, parcel);
    }
}
