package com.google.android.gms.internal.pal;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
abstract class zzmu {
    private final zzms zza;
    private final zzms zzb;

    public zzmu(byte[] bArr) {
        if (!zzna.zza(1)) {
            throw new GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
        }
        this.zza = zza(bArr, 1);
        this.zzb = zza(bArr, 0);
    }

    public abstract zzms zza(byte[] bArr, int i7);

    public final void zzb(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (byteBuffer.remaining() < bArr2.length + 16) {
            throw new IllegalArgumentException("Given ByteBuffer output is too small");
        }
        int position = byteBuffer.position();
        this.zza.zzd(byteBuffer, bArr, bArr2);
        byteBuffer.position(position);
        byteBuffer.limit(byteBuffer.limit() - 16);
        byte[] bArr4 = new byte[32];
        this.zzb.zzc(bArr, 0).get(bArr4);
        int remaining = byteBuffer.remaining();
        int i7 = remaining % 16;
        int i10 = i7 == 0 ? remaining : (remaining + 16) - i7;
        ByteBuffer order = ByteBuffer.allocate(i10 + 16).order(ByteOrder.LITTLE_ENDIAN);
        order.put(bArr3);
        order.position(0);
        order.put(byteBuffer);
        order.position(i10);
        order.putLong(0L);
        order.putLong(remaining);
        byte[] zza = zzmx.zza(bArr4, order.array());
        byteBuffer.limit(byteBuffer.limit() + 16);
        byteBuffer.put(zza);
    }

    public final byte[] zzc(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        int length = bArr2.length;
        if (length > 2147483631) {
            throw new GeneralSecurityException("plaintext too long");
        }
        ByteBuffer allocate = ByteBuffer.allocate(length + 16);
        zzb(allocate, bArr, bArr2, bArr3);
        return allocate.array();
    }
}
