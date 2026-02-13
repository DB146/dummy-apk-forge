package com.google.ads.interactivemedia.v3.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.bumptech.glide.d;

/* loaded from: classes.dex */
public final class zzpw extends G5.a {
    public static final Parcelable.Creator<zzpw> CREATOR = new zzpx();
    public final int zza;
    private zzbc zzb = null;
    private byte[] zzc;

    public zzpw(int i7, byte[] bArr) {
        this.zza = i7;
        this.zzc = bArr;
        zzb();
    }

    private final void zzb() {
        zzbc zzbcVar = this.zzb;
        if (zzbcVar != null || this.zzc == null) {
            if (zzbcVar == null || this.zzc != null) {
                if (zzbcVar != null && this.zzc != null) {
                    throw new IllegalStateException("Invalid internal representation - full");
                }
                if (zzbcVar != null || this.zzc != null) {
                    throw new IllegalStateException("Impossible");
                }
                throw new IllegalStateException("Invalid internal representation - empty");
            }
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int M3 = d.M(20293, parcel);
        int i10 = this.zza;
        d.O(parcel, 1, 4);
        parcel.writeInt(i10);
        byte[] bArr = this.zzc;
        if (bArr == null) {
            bArr = this.zzb.zzav();
        }
        d.A(parcel, 2, bArr, false);
        d.N(M3, parcel);
    }

    public final zzbc zza() {
        if (this.zzb == null) {
            try {
                this.zzb = zzbc.zzd(this.zzc, zzaef.zza());
                this.zzc = null;
            } catch (zzafc | NullPointerException e2) {
                throw new IllegalStateException(e2);
            }
        }
        zzb();
        return this.zzb;
    }
}
