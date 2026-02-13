package com.google.android.gms.internal.auth;

import G5.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.bumptech.glide.d;
import com.google.android.gms.common.internal.G;

/* loaded from: classes.dex */
public final class zzaz extends a {
    public static final Parcelable.Creator<zzaz> CREATOR = new zzba();
    final int zza;
    public final String zzb;
    public final byte[] zzc;

    public zzaz(int i7, String str, byte[] bArr) {
        this.zza = 1;
        G.g(str);
        this.zzb = str;
        G.g(bArr);
        this.zzc = bArr;
    }

    public zzaz(String str, byte[] bArr) {
        this(1, str, bArr);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int M3 = d.M(20293, parcel);
        int i10 = this.zza;
        d.O(parcel, 1, 4);
        parcel.writeInt(i10);
        d.H(parcel, 2, this.zzb, false);
        d.A(parcel, 3, this.zzc, false);
        d.N(M3, parcel);
    }
}
