package com.google.android.gms.internal.appindex;

import G5.a;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.bumptech.glide.d;
import s5.InterfaceC1990a;

/* loaded from: classes.dex */
public final class zzk extends a implements InterfaceC1990a {
    public static final Parcelable.Creator<zzk> CREATOR = new zzl();
    private final String zza;
    private final String zzb;
    private final String zzc;
    private final String zzd;
    private final String zze;
    private final Bundle zzf;

    public zzk(String str, String str2, String str3, String str4, String str5, Bundle bundle) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = str4;
        this.zze = str5;
        if (bundle != null) {
            this.zzf = bundle;
        } else {
            this.zzf = Bundle.EMPTY;
        }
        ClassLoader classLoader = zzk.class.getClassLoader();
        zzat.zza(classLoader);
        this.zzf.setClassLoader(classLoader);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ActionImpl { { actionType: '");
        sb2.append(this.zza);
        sb2.append("' } { objectName: '");
        sb2.append(this.zzb);
        sb2.append("' } { objectUrl: '");
        sb2.append(this.zzc);
        sb2.append("' } ");
        if (this.zzd != null) {
            sb2.append("{ objectSameAs: '");
            sb2.append(this.zzd);
            sb2.append("' } ");
        }
        if (this.zze != null) {
            sb2.append("{ actionStatus: '");
            sb2.append(this.zze);
            sb2.append("' } ");
        }
        if (!this.zzf.isEmpty()) {
            sb2.append("{ ");
            sb2.append(this.zzf);
            sb2.append(" } ");
        }
        sb2.append("}");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int M3 = d.M(20293, parcel);
        d.H(parcel, 1, this.zza, false);
        d.H(parcel, 2, this.zzb, false);
        d.H(parcel, 3, this.zzc, false);
        d.H(parcel, 4, this.zzd, false);
        d.H(parcel, 6, this.zze, false);
        d.z(parcel, 7, this.zzf, false);
        d.N(M3, parcel);
    }
}
