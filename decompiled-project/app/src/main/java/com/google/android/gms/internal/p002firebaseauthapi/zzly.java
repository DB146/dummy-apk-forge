package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
final class zzly implements zzmf {
    private final String zza;

    public zzly(String str) {
        this.zza = str;
    }

    private final byte[] zza(byte[] bArr, byte[] bArr2) {
        Mac zza = zzzd.zzb.zza(this.zza);
        if (bArr2 == null || bArr2.length == 0) {
            zza.init(new SecretKeySpec(new byte[zza.getMacLength()], this.zza));
        } else {
            zza.init(new SecretKeySpec(bArr2, this.zza));
        }
        return zza.doFinal(bArr);
    }

    private final byte[] zza(byte[] bArr, byte[] bArr2, int i7) {
        Mac zza = zzzd.zzb.zza(this.zza);
        if (i7 > zza.getMacLength() * 255) {
            throw new GeneralSecurityException("size too large");
        }
        byte[] bArr3 = new byte[i7];
        zza.init(new SecretKeySpec(bArr, this.zza));
        byte[] bArr4 = new byte[0];
        int i10 = 1;
        int i11 = 0;
        while (true) {
            zza.update(bArr4);
            zza.update(bArr2);
            zza.update((byte) i10);
            bArr4 = zza.doFinal();
            if (bArr4.length + i11 >= i7) {
                System.arraycopy(bArr4, 0, bArr3, i11, i7 - i11);
                return bArr3;
            }
            System.arraycopy(bArr4, 0, bArr3, i11, bArr4.length);
            i11 += bArr4.length;
            i10++;
        }
    }

    public final int zza() {
        return Mac.getInstance(this.zza).getMacLength();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzmf
    public final byte[] zza(byte[] bArr, byte[] bArr2, String str, byte[] bArr3) {
        return zza(zzmn.zza(str, bArr2, bArr3), bArr);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzmf
    public final byte[] zza(byte[] bArr, byte[] bArr2, String str, byte[] bArr3, int i7) {
        return zza(bArr, zzmn.zza(str, bArr2, bArr3, i7), i7);
    }

    public final byte[] zza(byte[] bArr, byte[] bArr2, String str, byte[] bArr3, String str2, byte[] bArr4, int i7) {
        return zza(zza(zzmn.zza(str, bArr2, bArr4), null), zzmn.zza(str2, bArr3, bArr4, i7), i7);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzmf
    public final byte[] zzb() {
        String str = this.zza;
        str.getClass();
        char c10 = 65535;
        switch (str.hashCode()) {
            case 984523022:
                if (str.equals("HmacSha256")) {
                    c10 = 0;
                    break;
                }
                break;
            case 984524074:
                if (str.equals("HmacSha384")) {
                    c10 = 1;
                    break;
                }
                break;
            case 984525777:
                if (str.equals("HmacSha512")) {
                    c10 = 2;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return zzmn.zzf;
            case 1:
                return zzmn.zzg;
            case 2:
                return zzmn.zzh;
            default:
                throw new GeneralSecurityException("Could not determine HPKE KDF ID");
        }
    }
}
