package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class zzsm implements zzcb {
    private static final byte[] zza = {0};
    private final zzcb zzb;
    private final zzxu zzc;
    private final byte[] zzd;

    private zzsm(zzcb zzcbVar, zzxu zzxuVar, byte[] bArr) {
        this.zzb = zzcbVar;
        this.zzc = zzxuVar;
        this.zzd = bArr;
    }

    public static zzcb zza(zzoe zzoeVar) {
        byte[] zzb;
        zzqe zza2 = zzoeVar.zza(zzbj.zza());
        zzcb zzcbVar = (zzcb) zznt.zza().zza(zza2.zzf(), zzcb.class).zzb(zza2.zzd());
        zzxu zzc = zza2.zzc();
        int i7 = zzsp.zza[zzc.ordinal()];
        if (i7 == 1) {
            zzb = zzpd.zza.zzb();
        } else if (i7 == 2 || i7 == 3) {
            zzb = zzpd.zza(zzoeVar.zzb().intValue()).zzb();
        } else {
            if (i7 != 4) {
                throw new GeneralSecurityException("unknown output prefix type");
            }
            zzb = zzpd.zzb(zzoeVar.zzb().intValue()).zzb();
        }
        return new zzsm(zzcbVar, zzc, zzb);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzcb
    public final void zza(byte[] bArr, byte[] bArr2) {
        if (bArr.length < 10) {
            throw new GeneralSecurityException("tag too short");
        }
        if (this.zzc.equals(zzxu.LEGACY)) {
            bArr2 = zzyt.zza(bArr2, zza);
        }
        byte[] bArr3 = new byte[0];
        if (!this.zzc.equals(zzxu.RAW)) {
            byte[] copyOf = Arrays.copyOf(bArr, 5);
            bArr = Arrays.copyOfRange(bArr, 5, bArr.length);
            bArr3 = copyOf;
        }
        if (!Arrays.equals(this.zzd, bArr3)) {
            throw new GeneralSecurityException("wrong prefix");
        }
        this.zzb.zza(bArr, bArr2);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzcb
    public final byte[] zza(byte[] bArr) {
        if (this.zzc.equals(zzxu.LEGACY)) {
            bArr = zzyt.zza(bArr, zza);
        }
        return zzyt.zza(this.zzd, this.zzb.zza(bArr));
    }
}
