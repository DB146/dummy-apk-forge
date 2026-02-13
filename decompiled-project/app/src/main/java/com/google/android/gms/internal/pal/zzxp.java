package com.google.android.gms.internal.pal;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class zzxp implements zzjt {
    private final zzmt zza;

    public zzxp(byte[] bArr) {
        this.zza = new zzmt(bArr);
    }

    @Override // com.google.android.gms.internal.pal.zzjt
    public final byte[] zza(byte[] bArr, byte[] bArr2) {
        ByteBuffer allocate = ByteBuffer.allocate(bArr.length + 28);
        byte[] zza = zzyq.zza(12);
        allocate.put(zza);
        this.zza.zzb(allocate, zza, bArr, bArr2);
        return allocate.array();
    }
}
