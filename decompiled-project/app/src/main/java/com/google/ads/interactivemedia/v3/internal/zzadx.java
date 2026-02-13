package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzadx extends zzaea {
    private final byte[] zzc;
    private final int zzd;
    private int zze;

    public zzadx(byte[] bArr, int i7, int i10) {
        super(null);
        if (bArr == null) {
            throw new NullPointerException("buffer");
        }
        int length = bArr.length;
        if (((length - i10) | i10) < 0) {
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i10)));
        }
        this.zzc = bArr;
        this.zze = 0;
        this.zzd = i10;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzaea
    public final int zza() {
        return this.zzd - this.zze;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzaea
    public final void zzb(byte b2) {
        try {
            byte[] bArr = this.zzc;
            int i7 = this.zze;
            this.zze = i7 + 1;
            bArr[i7] = b2;
        } catch (IndexOutOfBoundsException e2) {
            throw new zzady(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zze), Integer.valueOf(this.zzd), 1), e2);
        }
    }

    public final void zzc(byte[] bArr, int i7, int i10) {
        try {
            System.arraycopy(bArr, i7, this.zzc, this.zze, i10);
            this.zze += i10;
        } catch (IndexOutOfBoundsException e2) {
            throw new zzady(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zze), Integer.valueOf(this.zzd), Integer.valueOf(i10)), e2);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzaea
    public final void zzd(int i7, boolean z8) {
        zzq(i7 << 3);
        zzb(z8 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzaea
    public final void zze(int i7, zzadr zzadrVar) {
        zzq((i7 << 3) | 2);
        zzq(zzadrVar.zzd());
        zzadrVar.zzn(this);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzaea
    public final void zzf(int i7, int i10) {
        zzq((i7 << 3) | 5);
        zzg(i10);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzaea
    public final void zzg(int i7) {
        try {
            byte[] bArr = this.zzc;
            int i10 = this.zze;
            int i11 = i10 + 1;
            this.zze = i11;
            bArr[i10] = (byte) (i7 & 255);
            int i12 = i10 + 2;
            this.zze = i12;
            bArr[i11] = (byte) ((i7 >> 8) & 255);
            int i13 = i10 + 3;
            this.zze = i13;
            bArr[i12] = (byte) ((i7 >> 16) & 255);
            this.zze = i10 + 4;
            bArr[i13] = (byte) ((i7 >> 24) & 255);
        } catch (IndexOutOfBoundsException e2) {
            throw new zzady(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zze), Integer.valueOf(this.zzd), 1), e2);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzaea
    public final void zzh(int i7, long j) {
        zzq((i7 << 3) | 1);
        zzi(j);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzaea
    public final void zzi(long j) {
        try {
            byte[] bArr = this.zzc;
            int i7 = this.zze;
            int i10 = i7 + 1;
            this.zze = i10;
            bArr[i7] = (byte) (((int) j) & 255);
            int i11 = i7 + 2;
            this.zze = i11;
            bArr[i10] = (byte) (((int) (j >> 8)) & 255);
            int i12 = i7 + 3;
            this.zze = i12;
            bArr[i11] = (byte) (((int) (j >> 16)) & 255);
            int i13 = i7 + 4;
            this.zze = i13;
            bArr[i12] = (byte) (((int) (j >> 24)) & 255);
            int i14 = i7 + 5;
            this.zze = i14;
            bArr[i13] = (byte) (((int) (j >> 32)) & 255);
            int i15 = i7 + 6;
            this.zze = i15;
            bArr[i14] = (byte) (((int) (j >> 40)) & 255);
            int i16 = i7 + 7;
            this.zze = i16;
            bArr[i15] = (byte) (((int) (j >> 48)) & 255);
            this.zze = i7 + 8;
            bArr[i16] = (byte) (((int) (j >> 56)) & 255);
        } catch (IndexOutOfBoundsException e2) {
            throw new zzady(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zze), Integer.valueOf(this.zzd), 1), e2);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzaea
    public final void zzj(int i7, int i10) {
        zzq(i7 << 3);
        zzk(i10);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzaea
    public final void zzk(int i7) {
        if (i7 >= 0) {
            zzq(i7);
        } else {
            zzs(i7);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzaea
    public final void zzl(byte[] bArr, int i7, int i10) {
        zzc(bArr, 0, i10);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzaea
    public final void zzm(int i7, String str) {
        zzq((i7 << 3) | 2);
        zzn(str);
    }

    public final void zzn(String str) {
        int i7 = this.zze;
        try {
            int zzx = zzaea.zzx(str.length() * 3);
            int zzx2 = zzaea.zzx(str.length());
            if (zzx2 != zzx) {
                zzq(zzahy.zze(str));
                byte[] bArr = this.zzc;
                int i10 = this.zze;
                this.zze = zzahy.zzd(str, bArr, i10, this.zzd - i10);
                return;
            }
            int i11 = i7 + zzx2;
            this.zze = i11;
            int zzd = zzahy.zzd(str, this.zzc, i11, this.zzd - i11);
            this.zze = i7;
            zzq((zzd - i7) - zzx2);
            this.zze = zzd;
        } catch (zzahx e2) {
            this.zze = i7;
            zzB(str, e2);
        } catch (IndexOutOfBoundsException e10) {
            throw new zzady(e10);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzaea
    public final void zzo(int i7, int i10) {
        zzq((i7 << 3) | i10);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzaea
    public final void zzp(int i7, int i10) {
        zzq(i7 << 3);
        zzq(i10);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzaea
    public final void zzq(int i7) {
        while ((i7 & (-128)) != 0) {
            try {
                byte[] bArr = this.zzc;
                int i10 = this.zze;
                this.zze = i10 + 1;
                bArr[i10] = (byte) ((i7 & 127) | 128);
                i7 >>>= 7;
            } catch (IndexOutOfBoundsException e2) {
                throw new zzady(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zze), Integer.valueOf(this.zzd), 1), e2);
            }
        }
        byte[] bArr2 = this.zzc;
        int i11 = this.zze;
        this.zze = i11 + 1;
        bArr2[i11] = (byte) i7;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzaea
    public final void zzr(int i7, long j) {
        zzq(i7 << 3);
        zzs(j);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzaea
    public final void zzs(long j) {
        boolean z8;
        z8 = zzaea.zzd;
        if (z8 && this.zzd - this.zze >= 10) {
            while ((j & (-128)) != 0) {
                byte[] bArr = this.zzc;
                int i7 = this.zze;
                this.zze = i7 + 1;
                zzaht.zzn(bArr, i7, (byte) ((((int) j) & 127) | 128));
                j >>>= 7;
            }
            byte[] bArr2 = this.zzc;
            int i10 = this.zze;
            this.zze = i10 + 1;
            zzaht.zzn(bArr2, i10, (byte) j);
            return;
        }
        while ((j & (-128)) != 0) {
            try {
                byte[] bArr3 = this.zzc;
                int i11 = this.zze;
                this.zze = i11 + 1;
                bArr3[i11] = (byte) ((((int) j) & 127) | 128);
                j >>>= 7;
            } catch (IndexOutOfBoundsException e2) {
                throw new zzady(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zze), Integer.valueOf(this.zzd), 1), e2);
            }
        }
        byte[] bArr4 = this.zzc;
        int i12 = this.zze;
        this.zze = i12 + 1;
        bArr4[i12] = (byte) j;
    }
}
