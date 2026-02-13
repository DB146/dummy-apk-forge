package com.google.ads.interactivemedia.v3.internal;

import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;

/* loaded from: classes.dex */
final class zzc implements zzb {
    private final FileChannel zza;
    private final long zzb;
    private final long zzc;

    public zzc(FileChannel fileChannel, long j, long j10) {
        this.zza = fileChannel;
        this.zzb = j;
        this.zzc = j10;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzb
    public final long zza() {
        return this.zzc;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzb
    public final void zzb(MessageDigest[] messageDigestArr, long j, int i7) {
        MappedByteBuffer map = this.zza.map(FileChannel.MapMode.READ_ONLY, this.zzb + j, i7);
        map.load();
        for (MessageDigest messageDigest : messageDigestArr) {
            map.position(0);
            messageDigest.update(map);
        }
    }
}
