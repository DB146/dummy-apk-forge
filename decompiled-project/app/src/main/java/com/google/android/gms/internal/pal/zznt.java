package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes.dex */
final class zznt {
    public static void zza(zztz zztzVar) {
        zzxx.zzk(zzc(zztzVar.zzf().zzg()));
        zzb(zztzVar.zzf().zzh());
        if (zztzVar.zzi() == 2) {
            throw new GeneralSecurityException("unknown EC point format");
        }
        zzlf.zzc(zztzVar.zza().zze());
    }

    public static String zzb(int i7) {
        int i10 = i7 - 2;
        if (i10 == 1) {
            return "HmacSha1";
        }
        if (i10 == 2) {
            return "HmacSha384";
        }
        if (i10 == 3) {
            return "HmacSha256";
        }
        if (i10 == 4) {
            return "HmacSha512";
        }
        if (i10 == 5) {
            return "HmacSha224";
        }
        throw new NoSuchAlgorithmException("hash unsupported for HMAC: ".concat(Integer.toString(zzum.zza(i7))));
    }

    public static int zzc(int i7) {
        int i10 = i7 - 2;
        if (i10 == 2) {
            return 1;
        }
        if (i10 == 3) {
            return 2;
        }
        if (i10 == 4) {
            return 3;
        }
        throw new GeneralSecurityException("unknown curve type: ".concat(Integer.toString(zzuk.zza(i7))));
    }

    public static int zzd(int i7) {
        int i10 = i7 - 2;
        int i11 = 1;
        if (i10 != 1) {
            i11 = 2;
            if (i10 != 2) {
                if (i10 == 3) {
                    return 3;
                }
                throw new GeneralSecurityException("unknown point format: ".concat(Integer.toString(zztq.zza(i7))));
            }
        }
        return i11;
    }
}
