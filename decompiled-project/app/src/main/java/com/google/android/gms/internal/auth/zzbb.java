package com.google.android.gms.internal.auth;

import G5.a;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.bumptech.glide.d;
import com.google.android.gms.common.internal.G;

/* loaded from: classes.dex */
public final class zzbb extends a {
    public static final Parcelable.Creator<zzbb> CREATOR = new zzbc();
    final int zza;
    public final String zzb;
    public final PendingIntent zzc;

    public zzbb(int i7, String str, PendingIntent pendingIntent) {
        this.zza = 1;
        G.g(str);
        this.zzb = str;
        G.g(pendingIntent);
        this.zzc = pendingIntent;
    }

    public zzbb(String str, PendingIntent pendingIntent) {
        this(1, str, pendingIntent);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int M3 = d.M(20293, parcel);
        int i10 = this.zza;
        d.O(parcel, 1, 4);
        parcel.writeInt(i10);
        d.H(parcel, 2, this.zzb, false);
        d.G(parcel, 3, this.zzc, i7, false);
        d.N(M3, parcel);
    }
}
