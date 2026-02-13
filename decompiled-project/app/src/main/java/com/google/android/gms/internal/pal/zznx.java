package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
final class zznx {
    private final String zza;

    public zznx(String str) {
        this.zza = str;
    }

    private final byte[] zzf(byte[] bArr, byte[] bArr2, int i7) {
        Mac mac = (Mac) zzxz.zzb.zza(this.zza);
        if (i7 > mac.getMacLength() * 255) {
            throw new GeneralSecurityException("size too large");
        }
        byte[] bArr3 = new byte[i7];
        mac.init(new SecretKeySpec(bArr, this.zza));
        byte[] bArr4 = new byte[0];
        int i10 = 1;
        int i11 = 0;
        while (true) {
            mac.update(bArr4);
            mac.update(bArr2);
            mac.update((byte) i10);
            bArr4 = mac.doFinal();
            int length = bArr4.length;
            int i12 = i11 + length;
            if (i12 >= i7) {
                System.arraycopy(bArr4, 0, bArr3, i11, i7 - i11);
                return bArr3;
            }
            System.arraycopy(bArr4, 0, bArr3, i11, length);
            i10++;
            i11 = i12;
        }
    }

    private final byte[] zzg(byte[] bArr, byte[] bArr2) {
        Mac mac = (Mac) zzxz.zzb.zza(this.zza);
        if (bArr2 == null || bArr2.length == 0) {
            mac.init(new SecretKeySpec(new byte[mac.getMacLength()], this.zza));
        } else {
            mac.init(new SecretKeySpec(bArr2, this.zza));
        }
        return mac.doFinal(bArr);
    }

    public final int zza() {
        return Mac.getInstance(this.zza).getMacLength();
    }

    public final byte[] zzb(byte[] bArr, byte[] bArr2, String str, byte[] bArr3, String str2, byte[] bArr4, int i7) {
        return zzf(zzg(zzol.zze("eae_prk", bArr2, bArr4), null), zzol.zzf("shared_secret", bArr3, bArr4, i7), i7);
    }

    public final byte[] zzc() {
        char c10;
        String str = this.zza;
        int hashCode = str.hashCode();
        if (hashCode == 984523022) {
            if (str.equals("HmacSha256")) {
                c10 = 0;
            }
            c10 = 65535;
        } else if (hashCode != 984524074) {
            if (hashCode == 984525777 && str.equals("HmacSha512")) {
                c10 = 2;
            }
            c10 = 65535;
        } else {
            if (str.equals("HmacSha384")) {
                c10 = 1;
            }
            c10 = 65535;
        }
        if (c10 == 0) {
            return zzol.zzf;
        }
        if (c10 == 1) {
            return zzol.zzg;
        }
        if (c10 == 2) {
            return zzol.zzh;
        }
        throw new GeneralSecurityException("Could not determine HPKE KDF ID");
    }

    public final byte[] zzd(byte[] bArr, byte[] bArr2, String str, byte[] bArr3, int i7) {
        return zzf(bArr, zzol.zzf(str, bArr2, bArr3, i7), i7);
    }

    public final byte[] zze(byte[] bArr, byte[] bArr2, String str, byte[] bArr3) {
        return zzg(zzol.zze(str, bArr2, bArr3), bArr);
    }
}
