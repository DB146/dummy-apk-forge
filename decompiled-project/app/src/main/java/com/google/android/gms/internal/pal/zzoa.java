package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
final class zzoa implements zzjx {
    private final zzoe zza;
    private final zzoc zzb;
    private final zzny zzc;
    private final zznx zzd;

    private zzoa(zzoe zzoeVar, zzoc zzocVar, zznx zznxVar, zzny zznyVar, int i7, byte[] bArr) {
        this.zza = zzoeVar;
        this.zzb = zzocVar;
        this.zzd = zznxVar;
        this.zzc = zznyVar;
    }

    public static zzoa zza(zzvg zzvgVar) {
        zzoe zza;
        if (!zzvgVar.zzk()) {
            throw new IllegalArgumentException("HpkePrivateKey is missing public_key field.");
        }
        if (!zzvgVar.zzf().zzl()) {
            throw new IllegalArgumentException("HpkePrivateKey.public_key is missing params field.");
        }
        if (zzvgVar.zzg().zzs()) {
            throw new IllegalArgumentException("HpkePrivateKey.private_key is empty.");
        }
        zzvd zzc = zzvgVar.zzf().zzc();
        zzoc zzb = zzof.zzb(zzc);
        zznx zzc2 = zzof.zzc(zzc);
        zzny zza2 = zzof.zza(zzc);
        int zzg = zzc.zzg();
        int i7 = 1;
        if (zzg - 2 != 1) {
            throw new IllegalArgumentException("Unable to determine KEM-encoding length for ".concat(zzux.zza(zzg)));
        }
        int zzg2 = zzvgVar.zzf().zzc().zzg() - 2;
        if (zzg2 == 1) {
            zza = zzop.zza(zzvgVar.zzg().zzt());
        } else {
            if (zzg2 != 2 && zzg2 != 3 && zzg2 != 4) {
                throw new GeneralSecurityException("Unrecognized HPKE KEM identifier");
            }
            byte[] zzt = zzvgVar.zzg().zzt();
            byte[] zzt2 = zzvgVar.zzf().zzh().zzt();
            int zzg3 = zzvgVar.zzf().zzc().zzg() - 2;
            if (zzg3 != 2) {
                if (zzg3 == 3) {
                    i7 = 2;
                } else {
                    if (zzg3 != 4) {
                        throw new GeneralSecurityException("Unrecognized NIST HPKE KEM identifier");
                    }
                    i7 = 3;
                }
            }
            zza = zzon.zza(zzt, zzt2, i7);
        }
        return new zzoa(zza, zzb, zzc2, zza2, 32, null);
    }
}
