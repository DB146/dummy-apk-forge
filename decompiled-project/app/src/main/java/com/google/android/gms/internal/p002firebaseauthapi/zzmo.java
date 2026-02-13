package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class zzmo implements zzbk {
    private zzmo(zzbk zzbkVar, byte[] bArr) {
    }

    public static zzbk zza(zzoe zzoeVar) {
        byte[] zzb;
        zzqe zza = zzoeVar.zza(zzbj.zza());
        zzbk zzbkVar = (zzbk) zznt.zza().zza(zza.zzf(), zzbk.class).zzb(zza.zzd());
        zzxu zzc = zza.zzc();
        int i7 = zzmr.zza[zzc.ordinal()];
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
        return new zzmo(zzbkVar, zzb);
    }
}
