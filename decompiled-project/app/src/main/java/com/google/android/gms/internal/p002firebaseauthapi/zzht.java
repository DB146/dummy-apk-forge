package com.google.android.gms.internal.p002firebaseauthapi;

import h3.o;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* loaded from: classes.dex */
abstract class zzht {
    int[] zza;
    private final int zzb;

    public zzht(byte[] bArr, int i7) {
        if (bArr.length != 32) {
            throw new InvalidKeyException("The key length in bytes must be 32.");
        }
        this.zza = zzhs.zza(bArr);
        this.zzb = i7;
    }

    private final void zza(byte[] bArr, ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        if (bArr.length != zza()) {
            throw new GeneralSecurityException(o.l(zza(), "The nonce length (in bytes) must be "));
        }
        int remaining = byteBuffer2.remaining();
        int i7 = remaining / 64;
        int i10 = i7 + 1;
        for (int i11 = 0; i11 < i10; i11++) {
            ByteBuffer zza = zza(bArr, this.zzb + i11);
            if (i11 == i7) {
                zzyt.zza(byteBuffer, byteBuffer2, zza, remaining % 64);
            } else {
                zzyt.zza(byteBuffer, byteBuffer2, zza, 64);
            }
        }
    }

    public abstract int zza();

    public final ByteBuffer zza(byte[] bArr, int i7) {
        int[] zza = zza(zzhs.zza(bArr), i7);
        int[] iArr = (int[]) zza.clone();
        zzhs.zza(iArr);
        for (int i10 = 0; i10 < zza.length; i10++) {
            zza[i10] = zza[i10] + iArr[i10];
        }
        ByteBuffer order = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        order.asIntBuffer().put(zza, 0, 16);
        return order;
    }

    public void zza(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) {
        if (byteBuffer.remaining() < bArr2.length) {
            throw new IllegalArgumentException("Given ByteBuffer output is too small");
        }
        zza(bArr, byteBuffer, ByteBuffer.wrap(bArr2));
    }

    public byte[] zza(byte[] bArr, ByteBuffer byteBuffer) {
        ByteBuffer allocate = ByteBuffer.allocate(byteBuffer.remaining());
        zza(bArr, allocate, byteBuffer);
        return allocate.array();
    }

    public abstract int[] zza(int[] iArr, int i7);
}
