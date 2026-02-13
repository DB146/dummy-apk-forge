package com.google.android.gms.internal.pal;

/* loaded from: classes.dex */
public final class zzyj {
    public static String zza(byte[] bArr) {
        int length = bArr.length;
        StringBuilder sb2 = new StringBuilder(length + length);
        for (byte b2 : bArr) {
            sb2.append("0123456789abcdef".charAt((b2 & 255) >> 4));
            sb2.append("0123456789abcdef".charAt(b2 & 15));
        }
        return sb2.toString();
    }
}
