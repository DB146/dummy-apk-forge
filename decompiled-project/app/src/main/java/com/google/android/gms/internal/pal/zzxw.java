package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public final class zzxw {
    private final ECPublicKey zza;

    public zzxw(ECPublicKey eCPublicKey) {
        this.zza = eCPublicKey;
    }

    public final zzxv zza(String str, byte[] bArr, byte[] bArr2, int i7, int i10) {
        KeyPair zzc = zzxx.zzc(this.zza.getParams());
        ECPublicKey eCPublicKey = (ECPublicKey) zzc.getPublic();
        byte[] zzg = zzxx.zzg((ECPrivateKey) zzc.getPrivate(), this.zza);
        byte[] zzl = zzxx.zzl(eCPublicKey.getParams().getCurve(), i10, eCPublicKey.getW());
        byte[] zzc2 = zzxo.zzc(zzl, zzg);
        Mac mac = (Mac) zzxz.zzb.zza(str);
        if (i7 > mac.getMacLength() * 255) {
            throw new GeneralSecurityException("size too large");
        }
        if (bArr == null || bArr.length == 0) {
            mac.init(new SecretKeySpec(new byte[mac.getMacLength()], str));
        } else {
            mac.init(new SecretKeySpec(bArr, str));
        }
        byte[] doFinal = mac.doFinal(zzc2);
        byte[] bArr3 = new byte[i7];
        mac.init(new SecretKeySpec(doFinal, str));
        byte[] bArr4 = new byte[0];
        int i11 = 1;
        int i12 = 0;
        while (true) {
            mac.update(bArr4);
            mac.update(bArr2);
            mac.update((byte) i11);
            bArr4 = mac.doFinal();
            int length = bArr4.length;
            int i13 = i12 + length;
            if (i13 >= i7) {
                System.arraycopy(bArr4, 0, bArr3, i12, i7 - i12);
                return new zzxv(zzl, bArr3);
            }
            System.arraycopy(bArr4, 0, bArr3, i12, length);
            i11++;
            i12 = i13;
        }
    }
}
