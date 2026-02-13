package com.google.android.gms.internal.pal;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* loaded from: classes.dex */
abstract class zzms {
    int[] zza;
    private final int zzb;

    public zzms(byte[] bArr, int i7) {
        if (bArr.length != 32) {
            throw new InvalidKeyException("The key length in bytes must be 32.");
        }
        this.zza = zzmo.zzd(bArr);
        this.zzb = i7;
    }

    public abstract int zza();

    public abstract int[] zzb(int[] iArr, int i7);

    public final ByteBuffer zzc(byte[] bArr, int i7) {
        int[] zzb = zzb(zzmo.zzd(bArr), i7);
        int[] iArr = (int[]) zzb.clone();
        zzmo.zzc(iArr);
        for (int i10 = 0; i10 < 16; i10++) {
            zzb[i10] = zzb[i10] + iArr[i10];
        }
        ByteBuffer order = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        order.asIntBuffer().put(zzb, 0, 16);
        return order;
    }

    public final void zzd(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) {
        if (byteBuffer.remaining() < bArr2.length) {
            throw new IllegalArgumentException("Given ByteBuffer output is too small");
        }
        ByteBuffer wrap = ByteBuffer.wrap(bArr2);
        if (bArr.length != zza()) {
            throw new GeneralSecurityException("The nonce length (in bytes) must be " + zza());
        }
        int remaining = wrap.remaining();
        int i7 = remaining / 64;
        int i10 = i7 + 1;
        for (int i11 = 0; i11 < i10; i11++) {
            ByteBuffer zzc = zzc(bArr, this.zzb + i11);
            if (i11 == i7) {
                zzxo.zza(byteBuffer, wrap, zzc, remaining % 64);
            } else {
                zzxo.zza(byteBuffer, wrap, zzc, 64);
            }
        }
    }
}
