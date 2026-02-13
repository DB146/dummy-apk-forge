package com.google.android.gms.internal.pal;

import h3.o;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* loaded from: classes.dex */
final class zznv implements zzny {
    private final int zza;

    public zznv(int i7) {
        if (i7 != 16 && i7 != 32) {
            throw new InvalidAlgorithmParameterException(o.l(i7, "Unsupported key length: "));
        }
        this.zza = i7;
    }

    @Override // com.google.android.gms.internal.pal.zzny
    public final int zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.pal.zzny
    public final byte[] zzb() {
        int i7 = this.zza;
        if (i7 == 16) {
            return zzol.zzi;
        }
        if (i7 == 32) {
            return zzol.zzj;
        }
        throw new GeneralSecurityException("Could not determine HPKE AEAD ID");
    }

    @Override // com.google.android.gms.internal.pal.zzny
    public final byte[] zzc(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        int length = bArr.length;
        if (length == this.zza) {
            return new zzmq(bArr, false).zza(bArr2, bArr3, bArr4);
        }
        throw new InvalidAlgorithmParameterException(o.l(length, "Unexpected key length: "));
    }
}
