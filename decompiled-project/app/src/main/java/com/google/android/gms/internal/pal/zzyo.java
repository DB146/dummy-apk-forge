package com.google.android.gms.internal.pal;

import java.security.InvalidAlgorithmParameterException;

/* loaded from: classes.dex */
public final class zzyo implements zzkq {
    private final zzrj zza;
    private final int zzb;

    public zzyo(zzrj zzrjVar, int i7) {
        this.zza = zzrjVar;
        this.zzb = i7;
        if (i7 < 10) {
            throw new InvalidAlgorithmParameterException("tag size too small, need at least 10 bytes");
        }
        zzrjVar.zza(new byte[0], i7);
    }

    @Override // com.google.android.gms.internal.pal.zzkq
    public final byte[] zza(byte[] bArr) {
        return this.zza.zza(bArr, this.zzb);
    }
}
