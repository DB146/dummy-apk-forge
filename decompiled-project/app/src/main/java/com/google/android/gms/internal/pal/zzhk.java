package com.google.android.gms.internal.pal;

import G5.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.bumptech.glide.d;

/* loaded from: classes.dex */
public final class zzhk extends a {
    public static final Parcelable.Creator<zzhk> CREATOR = new zzhl();
    public final int zza;
    private zzaf zzb = null;
    private byte[] zzc;

    public zzhk(int i7, byte[] bArr) {
        this.zza = i7;
        this.zzc = bArr;
        zzb();
    }

    private final void zzb() {
        zzaf zzafVar = this.zzb;
        if (zzafVar != null || this.zzc == null) {
            if (zzafVar == null || this.zzc != null) {
                if (zzafVar != null && this.zzc != null) {
                    throw new IllegalStateException("Invalid internal representation - full");
                }
                if (zzafVar != null || this.zzc != null) {
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
            bArr = this.zzb.zzas();
        }
        d.A(parcel, 2, bArr, false);
        d.N(M3, parcel);
    }

    public final zzaf zza() {
        if (this.zzb == null) {
            try {
                this.zzb = zzaf.zzd(this.zzc, zzacm.zza());
                this.zzc = null;
            } catch (zzadi | NullPointerException e2) {
                throw new IllegalStateException(e2);
            }
        }
        zzb();
        return this.zzb;
    }
}
