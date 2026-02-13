package com.google.android.gms.internal.pal;

import com.google.android.gms.common.api.f;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class zzxo {
    public static final void zza(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i7) {
        if (i7 < 0 || byteBuffer2.remaining() < i7 || byteBuffer3.remaining() < i7 || byteBuffer.remaining() < i7) {
            throw new IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
        }
        for (int i10 = 0; i10 < i7; i10++) {
            byteBuffer.put((byte) (byteBuffer2.get() ^ byteBuffer3.get()));
        }
    }

    public static final boolean zzb(byte[] bArr, byte[] bArr2) {
        if (bArr != null && bArr2 != null && bArr.length == bArr2.length) {
            int i7 = 0;
            for (int i10 = 0; i10 < bArr.length; i10++) {
                i7 |= bArr[i10] ^ bArr2[i10];
            }
            if (i7 == 0) {
                return true;
            }
        }
        return false;
    }

    public static byte[] zzc(byte[]... bArr) {
        int i7 = 0;
        for (byte[] bArr2 : bArr) {
            int length = bArr2.length;
            if (i7 > f.API_PRIORITY_OTHER - length) {
                throw new GeneralSecurityException("exceeded size limit");
            }
            i7 += length;
        }
        byte[] bArr3 = new byte[i7];
        int i10 = 0;
        for (byte[] bArr4 : bArr) {
            int length2 = bArr4.length;
            System.arraycopy(bArr4, 0, bArr3, i10, length2);
            i10 += length2;
        }
        return bArr3;
    }

    public static final byte[] zzd(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        if (length == bArr2.length) {
            return zze(bArr, 0, bArr2, 0, length);
        }
        throw new IllegalArgumentException("The lengths of x and y should match.");
    }

    public static final byte[] zze(byte[] bArr, int i7, byte[] bArr2, int i10, int i11) {
        if (bArr.length - i11 < i7 || bArr2.length - i11 < i10) {
            throw new IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
        }
        byte[] bArr3 = new byte[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            bArr3[i12] = (byte) (bArr[i12 + i7] ^ bArr2[i12 + i10]);
        }
        return bArr3;
    }
}
