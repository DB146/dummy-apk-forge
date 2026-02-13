package com.google.android.gms.internal.p002firebaseauthapi;

import android.security.keystore.KeyGenParameterSpec;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStoreException;
import java.util.Arrays;
import java.util.Locale;
import javax.crypto.KeyGenerator;

/* loaded from: classes.dex */
public final class zznd implements zzca {
    private static final Object zza = new Object();

    /* loaded from: classes.dex */
    public static final class zza {
        public zza() {
            zznd.zza();
        }
    }

    public zznd() {
        this(new zza());
    }

    private zznd(zza zzaVar) {
    }

    public static /* synthetic */ boolean zza() {
        return true;
    }

    public static boolean zzc(String str) {
        synchronized (zza) {
            try {
                String zza2 = zzzz.zza("android-keystore://", str);
                if (zznc.zzb(zza2)) {
                    return false;
                }
                KeyGenParameterSpec build = new KeyGenParameterSpec.Builder(zza2, 3).setKeySize(256).setBlockModes("GCM").setEncryptionPaddings("NoPadding").build();
                KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
                keyGenerator.init(build);
                keyGenerator.generateKey();
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzca
    public final zzbe zza(String str) {
        zzne zzneVar;
        try {
            synchronized (zza) {
                try {
                    zzneVar = new zzne(zzzz.zza("android-keystore://", str));
                    byte[] zza2 = zzqg.zza(10);
                    byte[] bArr = new byte[0];
                    if (!Arrays.equals(zza2, zzneVar.zza(zzneVar.zzb(zza2, bArr), bArr))) {
                        throw new KeyStoreException("cannot use Android Keystore: encryption/decryption of non-empty message and empty aad returns an incorrect result");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return zzneVar;
        } catch (IOException e2) {
            throw new GeneralSecurityException(e2);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzca
    public final boolean zzb(String str) {
        return str.toLowerCase(Locale.US).startsWith("android-keystore://");
    }
}
