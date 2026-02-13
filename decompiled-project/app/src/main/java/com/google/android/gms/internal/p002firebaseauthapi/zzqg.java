package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.SecureRandom;

/* loaded from: classes.dex */
public final class zzqg {
    private static final ThreadLocal<SecureRandom> zza = new zzqf();

    public static /* synthetic */ SecureRandom zza() {
        SecureRandom zzb = zzb();
        zzb.nextLong();
        return zzb;
    }

    public static byte[] zza(int i7) {
        byte[] bArr = new byte[i7];
        zza.get().nextBytes(bArr);
        return bArr;
    }

    private static SecureRandom zzb() {
        Provider zza2 = zzng.zza();
        if (zza2 != null) {
            try {
                return SecureRandom.getInstance("SHA1PRNG", zza2);
            } catch (GeneralSecurityException unused) {
            }
        }
        Provider zzb = zzng.zzb();
        if (zzb != null) {
            try {
                return SecureRandom.getInstance("SHA1PRNG", zzb);
            } catch (GeneralSecurityException unused2) {
            }
        }
        return new SecureRandom();
    }
}
