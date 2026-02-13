package com.google.android.gms.internal.pal;

/* loaded from: classes.dex */
public final class zzmr extends zzms {
    public zzmr(byte[] bArr, int i7) {
        super(bArr, i7);
    }

    @Override // com.google.android.gms.internal.pal.zzms
    public final int zza() {
        return 12;
    }

    @Override // com.google.android.gms.internal.pal.zzms
    public final int[] zzb(int[] iArr, int i7) {
        int length = iArr.length;
        if (length != 3) {
            throw new IllegalArgumentException(String.format("ChaCha20 uses 96-bit nonces, but got a %d-bit nonce", Integer.valueOf(length * 32)));
        }
        int[] iArr2 = new int[16];
        zzmo.zzb(iArr2, this.zza);
        iArr2[12] = i7;
        System.arraycopy(iArr, 0, iArr2, 13, 3);
        return iArr2;
    }
}
