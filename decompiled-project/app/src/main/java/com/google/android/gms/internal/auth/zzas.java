package com.google.android.gms.internal.auth;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import y5.C2388a;
import y5.C2389b;
import y5.C2394g;

/* loaded from: classes.dex */
public abstract class zzas extends zzb implements zzat {
    public zzas() {
        super("com.google.android.gms.auth.api.accounttransfer.internal.IAccountTransferCallbacks");
    }

    @Override // com.google.android.gms.internal.auth.zzb
    public final boolean zza(int i7, Parcel parcel, Parcel parcel2, int i10) {
        switch (i7) {
            case 1:
                Status status = (Status) zzc.zza(parcel, Status.CREATOR);
                zzc.zzb(parcel);
                zzh(status);
                return true;
            case 2:
                Status status2 = (Status) zzc.zza(parcel, Status.CREATOR);
                C2394g c2394g = (C2394g) zzc.zza(parcel, C2394g.CREATOR);
                zzc.zzb(parcel);
                zzf(status2, c2394g);
                return true;
            case 3:
                Status status3 = (Status) zzc.zza(parcel, Status.CREATOR);
                C2389b c2389b = (C2389b) zzc.zza(parcel, C2389b.CREATOR);
                zzc.zzb(parcel);
                zzg(status3, c2389b);
                return true;
            case 4:
                zze();
                return true;
            case 5:
                Status status4 = (Status) zzc.zza(parcel, Status.CREATOR);
                zzc.zzb(parcel);
                zzd(status4);
                return true;
            case 6:
                byte[] createByteArray = parcel.createByteArray();
                zzc.zzb(parcel);
                zzb(createByteArray);
                return true;
            case 7:
                C2388a c2388a = (C2388a) zzc.zza(parcel, C2388a.CREATOR);
                zzc.zzb(parcel);
                zzc(c2388a);
                return true;
            default:
                return false;
        }
    }
}
