package com.google.ads.interactivemedia.v3.internal;

/* loaded from: classes.dex */
public final class zzacz {
    private final byte[] zza = new byte[256];
    private int zzb;
    private int zzc;

    public zzacz(byte[] bArr) {
        for (int i7 = 0; i7 < 256; i7++) {
            this.zza[i7] = (byte) i7;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < 256; i11++) {
            byte[] bArr2 = this.zza;
            byte b2 = bArr2[i11];
            i10 = (i10 + b2 + bArr[i11 % bArr.length]) & 255;
            bArr2[i11] = bArr2[i10];
            bArr2[i10] = b2;
        }
        this.zzb = 0;
        this.zzc = 0;
    }

    public final void zza(byte[] bArr) {
        int i7 = this.zzb;
        int i10 = this.zzc;
        for (int i11 = 0; i11 < 256; i11++) {
            byte[] bArr2 = this.zza;
            i7 = (i7 + 1) & 255;
            byte b2 = bArr2[i7];
            i10 = (i10 + b2) & 255;
            bArr2[i7] = bArr2[i10];
            bArr2[i10] = b2;
            bArr[i11] = (byte) (bArr2[(bArr2[i7] + b2) & 255] ^ bArr[i11]);
        }
        this.zzb = i7;
        this.zzc = i10;
    }
}
