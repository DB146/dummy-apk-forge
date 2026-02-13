package com.google.android.gms.internal.pal;

import P5.a;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class zzfp extends zzfj implements zzfr {
    public zzfp(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.adshield.internal.IAdShieldClient");
    }

    @Override // com.google.android.gms.internal.pal.zzfr
    public final int zzb() {
        throw null;
    }

    @Override // com.google.android.gms.internal.pal.zzfr
    public final a zzc(a aVar, a aVar2) {
        throw null;
    }

    @Override // com.google.android.gms.internal.pal.zzfr
    public final a zzd(a aVar, a aVar2) {
        throw null;
    }

    @Override // com.google.android.gms.internal.pal.zzfr
    public final String zze(a aVar, String str) {
        Parcel zza = zza();
        zzfl.zze(zza, aVar);
        zza.writeString("");
        Parcel zzt = zzt(8, zza);
        String readString = zzt.readString();
        zzt.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.pal.zzfr
    public final String zzf(a aVar) {
        throw null;
    }

    @Override // com.google.android.gms.internal.pal.zzfr
    public final String zzg(a aVar, byte[] bArr) {
        Parcel zza = zza();
        zzfl.zze(zza, aVar);
        zza.writeByteArray(null);
        Parcel zzt = zzt(12, zza);
        String readString = zzt.readString();
        zzt.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.pal.zzfr
    public final String zzh(a aVar, a aVar2, a aVar3, a aVar4) {
        throw null;
    }

    @Override // com.google.android.gms.internal.pal.zzfr
    public final String zzi(a aVar) {
        throw null;
    }

    @Override // com.google.android.gms.internal.pal.zzfr
    public final String zzj() {
        throw null;
    }

    @Override // com.google.android.gms.internal.pal.zzfr
    public final String zzk(a aVar, a aVar2, a aVar3) {
        Parcel zza = zza();
        zzfl.zze(zza, aVar);
        zzfl.zze(zza, aVar2);
        zzfl.zze(zza, aVar3);
        Parcel zzt = zzt(14, zza);
        String readString = zzt.readString();
        zzt.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.pal.zzfr
    public final void zzl(a aVar) {
        Parcel zza = zza();
        zzfl.zze(zza, aVar);
        zzu(9, zza);
    }

    @Override // com.google.android.gms.internal.pal.zzfr
    public final void zzm(a aVar) {
        throw null;
    }

    @Override // com.google.android.gms.internal.pal.zzfr
    public final void zzn(String str, String str2) {
        throw null;
    }

    @Override // com.google.android.gms.internal.pal.zzfr
    public final void zzo(String str) {
        throw null;
    }

    @Override // com.google.android.gms.internal.pal.zzfr
    public final boolean zzp(a aVar) {
        throw null;
    }

    @Override // com.google.android.gms.internal.pal.zzfr
    public final boolean zzq(a aVar) {
        throw null;
    }

    @Override // com.google.android.gms.internal.pal.zzfr
    public final boolean zzr(String str, boolean z8) {
        throw null;
    }
}
