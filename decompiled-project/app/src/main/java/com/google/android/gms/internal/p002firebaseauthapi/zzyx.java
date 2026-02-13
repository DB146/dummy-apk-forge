package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.interfaces.ECPrivateKey;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public final class zzyx {
    private ECPrivateKey zza;

    public zzyx(ECPrivateKey eCPrivateKey) {
        this.zza = eCPrivateKey;
    }

    public final byte[] zza(byte[] bArr, String str, byte[] bArr2, byte[] bArr3, int i7, zzzb zzzbVar) {
        byte[] zza = zzyt.zza(bArr, zzyz.zza(this.zza, zzyz.zza(this.zza.getParams(), zzzbVar, bArr)));
        Mac zza2 = zzzd.zzb.zza(str);
        if (i7 > zza2.getMacLength() * 255) {
            throw new GeneralSecurityException("size too large");
        }
        if (bArr2 == null || bArr2.length == 0) {
            zza2.init(new SecretKeySpec(new byte[zza2.getMacLength()], str));
        } else {
            zza2.init(new SecretKeySpec(bArr2, str));
        }
        byte[] bArr4 = new byte[i7];
        zza2.init(new SecretKeySpec(zza2.doFinal(zza), str));
        byte[] bArr5 = new byte[0];
        int i10 = 1;
        int i11 = 0;
        while (true) {
            zza2.update(bArr5);
            zza2.update(bArr3);
            zza2.update((byte) i10);
            bArr5 = zza2.doFinal();
            if (bArr5.length + i11 >= i7) {
                System.arraycopy(bArr5, 0, bArr4, i11, i7 - i11);
                return bArr4;
            }
            System.arraycopy(bArr5, 0, bArr4, i11, bArr5.length);
            i11 += bArr5.length;
            i10++;
        }
    }
}
