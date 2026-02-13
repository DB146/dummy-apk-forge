package com.google.android.gms.internal.p002firebaseauthapi;

import X.c;
import java.security.InvalidAlgorithmParameterException;
import java.util.Locale;

/* loaded from: classes.dex */
public final class zzzz {
    public static String zza(String str, String str2) {
        if (str2.toLowerCase(Locale.US).startsWith(str)) {
            return str2.substring(str.length());
        }
        throw new IllegalArgumentException(c.t("key URI must start with ", str));
    }

    public static void zza(int i7) {
        if (i7 != 16 && i7 != 32) {
            throw new InvalidAlgorithmParameterException(String.format("invalid key size %d; only 128-bit and 256-bit AES keys are supported", Integer.valueOf(i7 << 3)));
        }
    }
}
