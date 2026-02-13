package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class zzxj implements zzjt {
    private final zzmq zza;

    public zzxj(byte[] bArr) {
        if (!zzna.zza(2)) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        this.zza = new zzmq(bArr, true);
    }

    @Override // com.google.android.gms.internal.pal.zzjt
    public final byte[] zza(byte[] bArr, byte[] bArr2) {
        return this.zza.zza(zzyq.zza(12), bArr, bArr2);
    }
}
