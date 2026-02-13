package com.google.android.gms.internal.pal;

import android.util.Base64;

/* loaded from: classes.dex */
public final class zzbj {
    public static String zza(byte[] bArr, boolean z8) {
        return Base64.encodeToString(bArr, true != z8 ? 2 : 11);
    }

    public static byte[] zzb(String str, boolean z8) {
        byte[] decode = Base64.decode(str, true != z8 ? 2 : 11);
        if (decode.length != 0 || str.length() <= 0) {
            return decode;
        }
        throw new IllegalArgumentException("Unable to decode ".concat(str));
    }
}
