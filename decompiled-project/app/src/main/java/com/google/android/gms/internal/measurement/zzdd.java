package com.google.android.gms.internal.measurement;

import G5.a;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.bumptech.glide.d;

/* loaded from: classes.dex */
public final class zzdd extends a {
    public static final Parcelable.Creator<zzdd> CREATOR = new zzde();
    public final long zza;
    public final long zzb;
    public final boolean zzc;
    public final Bundle zzd;
    public final String zze;

    public zzdd(long j, long j10, boolean z8, Bundle bundle, String str) {
        this.zza = j;
        this.zzb = j10;
        this.zzc = z8;
        this.zzd = bundle;
        this.zze = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        long j = this.zza;
        int M3 = d.M(20293, parcel);
        d.O(parcel, 1, 8);
        parcel.writeLong(j);
        long j10 = this.zzb;
        d.O(parcel, 2, 8);
        parcel.writeLong(j10);
        boolean z8 = this.zzc;
        d.O(parcel, 3, 4);
        parcel.writeInt(z8 ? 1 : 0);
        d.z(parcel, 7, this.zzd, false);
        d.H(parcel, 8, this.zze, false);
        d.N(M3, parcel);
    }
}
