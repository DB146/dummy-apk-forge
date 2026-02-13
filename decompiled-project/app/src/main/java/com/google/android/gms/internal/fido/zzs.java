package com.google.android.gms.internal.fido;

import U5.B;
import U5.C0556y;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class zzs extends zza implements IInterface {
    public zzs(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.fido.fido2.internal.regular.IFido2AppService");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzc(zzr zzrVar, C0556y c0556y) {
        Parcel zza = zza();
        int i7 = zzc.zza;
        zza.writeStrongBinder(zzrVar);
        zzc.zzd(zza, c0556y);
        zzb(1, zza);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzd(zzr zzrVar, B b2) {
        Parcel zza = zza();
        int i7 = zzc.zza;
        zza.writeStrongBinder(zzrVar);
        zzc.zzd(zza, b2);
        zzb(2, zza);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zze(zze zzeVar) {
        Parcel zza = zza();
        int i7 = zzc.zza;
        zza.writeStrongBinder(zzeVar);
        zzb(3, zza);
    }
}
