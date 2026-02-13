package com.google.android.gms.internal.pal;

/* loaded from: classes.dex */
public final class zzqd {
    public static final zzyv zza(String str) {
        byte[] bArr = new byte[str.length()];
        for (int i7 = 0; i7 < str.length(); i7++) {
            char charAt = str.charAt(i7);
            if (charAt < '!' || charAt > '~') {
                throw new zzqc("Not a printable ASCII character: " + charAt);
            }
            bArr[i7] = (byte) charAt;
        }
        return zzyv.zzb(bArr);
    }
}
