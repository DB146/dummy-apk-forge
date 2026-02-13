package com.google.ads.interactivemedia.v3.internal;

import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* loaded from: classes.dex */
final class zza implements zzb {
    private final ByteBuffer zza;

    public zza(ByteBuffer byteBuffer) {
        this.zza = byteBuffer.slice();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzb
    public final long zza() {
        return this.zza.capacity();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzb
    public final void zzb(MessageDigest[] messageDigestArr, long j, int i7) {
        ByteBuffer slice;
        synchronized (this.zza) {
            int i10 = (int) j;
            this.zza.position(i10);
            this.zza.limit(i10 + i7);
            slice = this.zza.slice();
        }
        for (MessageDigest messageDigest : messageDigestArr) {
            slice.position(0);
            messageDigest.update(slice);
        }
    }
}
