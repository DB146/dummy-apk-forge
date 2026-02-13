package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class zzhz implements zzbe {
    private final zzbe zza;
    private final byte[] zzb;

    private zzhz(zzbe zzbeVar, byte[] bArr) {
        this.zza = zzbeVar;
        if (bArr.length != 0 && bArr.length != 5) {
            throw new IllegalArgumentException("identifier has an invalid length");
        }
        this.zzb = bArr;
    }

    public static zzbe zza(zzbe zzbeVar, zzaae zzaaeVar) {
        return new zzhz(zzbeVar, zzaaeVar.zzb());
    }

    public static zzbe zza(zzoe zzoeVar) {
        byte[] zzb;
        zzqe zza = zzoeVar.zza(zzbj.zza());
        zzbe zzbeVar = (zzbe) zznt.zza().zza(zza.zzf(), zzbe.class).zzb(zza.zzd());
        zzxu zzc = zza.zzc();
        int i7 = zzic.zza[zzc.ordinal()];
        if (i7 == 1) {
            zzb = zzpd.zza.zzb();
        } else if (i7 == 2 || i7 == 3) {
            zzb = zzpd.zza(zzoeVar.zzb().intValue()).zzb();
        } else {
            if (i7 != 4) {
                throw new GeneralSecurityException("unknown output prefix type ".concat(String.valueOf(zzc)));
            }
            zzb = zzpd.zzb(zzoeVar.zzb().intValue()).zzb();
        }
        return new zzhz(zzbeVar, zzb);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbe
    public final byte[] zza(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = this.zzb;
        if (bArr3.length == 0) {
            return this.zza.zza(bArr, bArr2);
        }
        if (zzqq.zza(bArr3, bArr)) {
            return this.zza.zza(Arrays.copyOfRange(bArr, 5, bArr.length), bArr2);
        }
        throw new GeneralSecurityException("wrong prefix");
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbe
    public final byte[] zzb(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = this.zzb;
        return bArr3.length == 0 ? this.zza.zzb(bArr, bArr2) : zzyt.zza(bArr3, this.zza.zzb(bArr, bArr2));
    }
}
