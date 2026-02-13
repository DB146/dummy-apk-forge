package com.google.ads.interactivemedia.v3.internal;

import android.util.Base64;

/* loaded from: classes.dex */
public final class zzia {
    public static String zza(byte[] bArr, boolean z8) {
        return Base64.encodeToString(bArr, true != z8 ? 2 : 11);
    }

    public static byte[] zzb(String str, boolean z8) {
        byte[] decode = Base64.decode(str, 2);
        if (decode.length != 0 || str.length() <= 0) {
            return decode;
        }
        throw new IllegalArgumentException("Unable to decode ".concat(str));
    }
}
