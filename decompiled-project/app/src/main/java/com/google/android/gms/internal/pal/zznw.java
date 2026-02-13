package com.google.android.gms.internal.pal;

import java.security.InvalidAlgorithmParameterException;

/* loaded from: classes.dex */
final class zznw implements zzny {
    @Override // com.google.android.gms.internal.pal.zzny
    public final int zza() {
        return 32;
    }

    @Override // com.google.android.gms.internal.pal.zzny
    public final byte[] zzb() {
        return zzol.zzk;
    }

    @Override // com.google.android.gms.internal.pal.zzny
    public final byte[] zzc(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        if (bArr.length == 32) {
            return new zzmt(bArr).zzc(bArr2, bArr3, bArr4);
        }
        throw new InvalidAlgorithmParameterException("Unexpected key length: 32");
    }
}
