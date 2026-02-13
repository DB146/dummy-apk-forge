package com.google.android.gms.internal.pal;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class zzyu implements zzjt {
    private final zzmw zza;

    public zzyu(byte[] bArr) {
        this.zza = new zzmw(bArr);
    }

    @Override // com.google.android.gms.internal.pal.zzjt
    public final byte[] zza(byte[] bArr, byte[] bArr2) {
        ByteBuffer allocate = ByteBuffer.allocate(bArr.length + 40);
        byte[] zza = zzyq.zza(24);
        allocate.put(zza);
        this.zza.zzb(allocate, zza, bArr, bArr2);
        return allocate.array();
    }
}
