package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzix;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.Mac;

/* loaded from: classes.dex */
public final class zzzv implements zzso {
    private static final zzix.zza zza = zzix.zza.zzb;
    private final ThreadLocal<Mac> zzb;
    private final String zzc;
    private final Key zzd;
    private final int zze;

    public zzzv(String str, Key key) {
        zzzy zzzyVar = new zzzy(this);
        this.zzb = zzzyVar;
        if (!zza.zza()) {
            throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        this.zzc = str;
        this.zzd = key;
        if (key.getEncoded().length < 16) {
            throw new InvalidAlgorithmParameterException("key size too small, need at least 16 bytes");
        }
        str.getClass();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1823053428:
                if (str.equals("HMACSHA1")) {
                    c10 = 0;
                    break;
                }
                break;
            case 392315023:
                if (str.equals("HMACSHA224")) {
                    c10 = 1;
                    break;
                }
                break;
            case 392315118:
                if (str.equals("HMACSHA256")) {
                    c10 = 2;
                    break;
                }
                break;
            case 392316170:
                if (str.equals("HMACSHA384")) {
                    c10 = 3;
                    break;
                }
                break;
            case 392317873:
                if (str.equals("HMACSHA512")) {
                    c10 = 4;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                this.zze = 20;
                break;
            case 1:
                this.zze = 28;
                break;
            case 2:
                this.zze = 32;
                break;
            case 3:
                this.zze = 48;
                break;
            case 4:
                this.zze = 64;
                break;
            default:
                throw new NoSuchAlgorithmException("unknown Hmac algorithm: ".concat(str));
        }
        zzzyVar.get();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzso
    public final byte[] zza(byte[] bArr, int i7) {
        if (i7 > this.zze) {
            throw new InvalidAlgorithmParameterException("tag size too big");
        }
        this.zzb.get().update(bArr);
        return Arrays.copyOf(this.zzb.get().doFinal(), i7);
    }
}
