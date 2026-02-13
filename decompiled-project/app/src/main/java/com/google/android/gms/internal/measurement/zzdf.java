package com.google.android.gms.internal.measurement;

import G5.a;
import android.app.Activity;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.bumptech.glide.d;
import java.util.Objects;

/* loaded from: classes.dex */
public final class zzdf extends a {
    public static final Parcelable.Creator<zzdf> CREATOR = new zzdg();
    public final int zza;
    public final String zzb;
    public final Intent zzc;

    public zzdf(int i7, String str, Intent intent) {
        this.zza = i7;
        this.zzb = str;
        this.zzc = intent;
    }

    public static zzdf zza(Activity activity) {
        return new zzdf(activity.hashCode(), activity.getClass().getCanonicalName(), activity.getIntent());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzdf)) {
            return false;
        }
        zzdf zzdfVar = (zzdf) obj;
        return this.zza == zzdfVar.zza && Objects.equals(this.zzb, zzdfVar.zzb) && Objects.equals(this.zzc, zzdfVar.zzc);
    }

    public final int hashCode() {
        return this.zza;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int i10 = this.zza;
        int M3 = d.M(20293, parcel);
        d.O(parcel, 1, 4);
        parcel.writeInt(i10);
        d.H(parcel, 2, this.zzb, false);
        d.G(parcel, 3, this.zzc, i7, false);
        d.N(M3, parcel);
    }
}
