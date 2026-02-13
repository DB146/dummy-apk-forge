package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public final class zzgu {
    private static final ThreadLocal<Cipher> zza = new zzgt();

    public static AlgorithmParameterSpec zza(byte[] bArr) {
        return zza(bArr, 0, bArr.length);
    }

    public static AlgorithmParameterSpec zza(byte[] bArr, int i7, int i10) {
        Integer zzb = zzqq.zzb();
        return (zzb == null || zzb.intValue() > 19) ? new GCMParameterSpec(128, bArr, i7, i10) : new IvParameterSpec(bArr, i7, i10);
    }

    public static Cipher zza() {
        return zza.get();
    }

    public static SecretKey zzb(byte[] bArr) {
        zzzz.zza(bArr.length);
        return new SecretKeySpec(bArr, "AES");
    }
}
