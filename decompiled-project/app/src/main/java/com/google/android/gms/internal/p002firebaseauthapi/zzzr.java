package com.google.android.gms.internal.p002firebaseauthapi;

/* loaded from: classes.dex */
public final class zzzr {
    public static String zza(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder(bArr.length * 2);
        for (byte b2 : bArr) {
            int i7 = b2 & 255;
            sb2.append("0123456789abcdef".charAt(i7 / 16));
            sb2.append("0123456789abcdef".charAt(i7 % 16));
        }
        return sb2.toString();
    }

    public static byte[] zza(String str) {
        if (str.length() % 2 != 0) {
            throw new IllegalArgumentException("Expected a string of even length");
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i7 = 0; i7 < length; i7++) {
            int i10 = i7 * 2;
            int digit = Character.digit(str.charAt(i10), 16);
            int digit2 = Character.digit(str.charAt(i10 + 1), 16);
            if (digit == -1 || digit2 == -1) {
                throw new IllegalArgumentException("input is not hexadecimal");
            }
            bArr[i7] = (byte) ((digit << 4) + digit2);
        }
        return bArr;
    }
}
