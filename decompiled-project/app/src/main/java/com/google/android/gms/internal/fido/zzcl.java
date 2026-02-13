package com.google.android.gms.internal.fido;

/* loaded from: classes.dex */
public final class zzcl {
    public static byte[] zza(byte[]... bArr) {
        int i7 = 0;
        int i10 = 0;
        while (true) {
            if (i7 >= bArr.length) {
                break;
            }
            i10 += bArr[i7].length;
            i7++;
        }
        byte[] bArr2 = new byte[i10];
        int i11 = 0;
        for (byte[] bArr3 : bArr) {
            int length = bArr3.length;
            System.arraycopy(bArr3, 0, bArr2, i11, length);
            i11 += length;
        }
        return bArr2;
    }
}
