package com.google.android.gms.internal.p002firebaseauthapi;

import android.os.Build;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.util.Objects;

/* loaded from: classes.dex */
public final class zzqq {
    public static final Charset zza = Charset.forName("UTF-8");

    public static int zza() {
        int i7 = 0;
        while (i7 == 0) {
            byte[] zza2 = zzqg.zza(4);
            i7 = (zza2[3] & 255) | ((zza2[0] & 255) << 24) | ((zza2[1] & 255) << 16) | ((zza2[2] & 255) << 8);
        }
        return i7;
    }

    public static final zzaae zza(String str) {
        byte[] bArr = new byte[str.length()];
        for (int i7 = 0; i7 < str.length(); i7++) {
            char charAt = str.charAt(i7);
            if (charAt < '!' || charAt > '~') {
                throw new GeneralSecurityException("Not a printable ASCII character: " + charAt);
            }
            bArr[i7] = (byte) charAt;
        }
        return zzaae.zza(bArr);
    }

    public static boolean zza(byte[] bArr, byte[] bArr2) {
        if (bArr2.length < bArr.length) {
            return false;
        }
        for (int i7 = 0; i7 < bArr.length; i7++) {
            if (bArr2[i7] != bArr[i7]) {
                return false;
            }
        }
        return true;
    }

    public static final zzaae zzb(String str) {
        byte[] bArr = new byte[str.length()];
        for (int i7 = 0; i7 < str.length(); i7++) {
            char charAt = str.charAt(i7);
            if (charAt < '!' || charAt > '~') {
                throw new zzqo("Not a printable ASCII character: " + charAt);
            }
            bArr[i7] = (byte) charAt;
        }
        return zzaae.zza(bArr);
    }

    public static Integer zzb() {
        if (Objects.equals(System.getProperty("java.vendor"), "The Android Project")) {
            return Integer.valueOf(Build.VERSION.SDK_INT);
        }
        return null;
    }
}
