package com.google.android.gms.internal.pal;

import P5.a;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class zzhq extends zzfj implements zzhs {
    public zzhq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.gass.internal.clearcut.IGassClearcut");
    }

    @Override // com.google.android.gms.internal.pal.zzhs
    public final void zze(a aVar, String str, String str2) {
        Parcel zza = zza();
        zzfl.zze(zza, aVar);
        zza.writeString("ADSHIELD");
        zza.writeString(null);
        zzu(8, zza);
    }

    @Override // com.google.android.gms.internal.pal.zzhs
    public final void zzf() {
        zzu(3, zza());
    }

    @Override // com.google.android.gms.internal.pal.zzhs
    public final void zzg(int i7) {
        Parcel zza = zza();
        zza.writeInt(i7);
        zzu(7, zza);
    }

    @Override // com.google.android.gms.internal.pal.zzhs
    public final void zzh(int[] iArr) {
        Parcel zza = zza();
        zza.writeIntArray(null);
        zzu(4, zza);
    }

    @Override // com.google.android.gms.internal.pal.zzhs
    public final void zzi(int i7) {
        Parcel zza = zza();
        zza.writeInt(i7);
        zzu(6, zza);
    }

    @Override // com.google.android.gms.internal.pal.zzhs
    public final void zzj(byte[] bArr) {
        Parcel zza = zza();
        zza.writeByteArray(bArr);
        zzu(5, zza);
    }
}
