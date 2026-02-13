package com.google.android.recaptcha.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzlk extends zzln {
    private final byte[] zzb;
    private final int zzc;
    private int zzd;

    public zzlk(byte[] bArr, int i7, int i10) {
        super(null);
        int length = bArr.length;
        if (((length - i10) | i10) < 0) {
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i10)));
        }
        this.zzb = bArr;
        this.zzd = 0;
        this.zzc = i10;
    }

    @Override // com.google.android.recaptcha.internal.zzln
    public final int zza() {
        return this.zzc - this.zzd;
    }

    @Override // com.google.android.recaptcha.internal.zzln
    public final void zzb(byte b2) {
        try {
            byte[] bArr = this.zzb;
            int i7 = this.zzd;
            this.zzd = i7 + 1;
            bArr[i7] = b2;
        } catch (IndexOutOfBoundsException e2) {
            throw new zzll(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1), e2);
        }
    }

    public final void zzc(byte[] bArr, int i7, int i10) {
        try {
            System.arraycopy(bArr, 0, this.zzb, this.zzd, i10);
            this.zzd += i10;
        } catch (IndexOutOfBoundsException e2) {
            throw new zzll(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), Integer.valueOf(i10)), e2);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzln
    public final void zzd(int i7, boolean z8) {
        zzt(i7 << 3);
        zzb(z8 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.recaptcha.internal.zzln
    public final void zze(int i7, zzle zzleVar) {
        zzt((i7 << 3) | 2);
        zzt(zzleVar.zzd());
        zzleVar.zzh(this);
    }

    @Override // com.google.android.recaptcha.internal.zzln
    public final void zzf(int i7, int i10) {
        zzt((i7 << 3) | 5);
        zzg(i10);
    }

    @Override // com.google.android.recaptcha.internal.zzln
    public final void zzg(int i7) {
        try {
            byte[] bArr = this.zzb;
            int i10 = this.zzd;
            int i11 = i10 + 1;
            this.zzd = i11;
            bArr[i10] = (byte) (i7 & 255);
            int i12 = i10 + 2;
            this.zzd = i12;
            bArr[i11] = (byte) ((i7 >> 8) & 255);
            int i13 = i10 + 3;
            this.zzd = i13;
            bArr[i12] = (byte) ((i7 >> 16) & 255);
            this.zzd = i10 + 4;
            bArr[i13] = (byte) ((i7 >> 24) & 255);
        } catch (IndexOutOfBoundsException e2) {
            throw new zzll(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1), e2);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzln
    public final void zzh(int i7, long j) {
        zzt((i7 << 3) | 1);
        zzi(j);
    }

    @Override // com.google.android.recaptcha.internal.zzln
    public final void zzi(long j) {
        try {
            byte[] bArr = this.zzb;
            int i7 = this.zzd;
            int i10 = i7 + 1;
            this.zzd = i10;
            bArr[i7] = (byte) (((int) j) & 255);
            int i11 = i7 + 2;
            this.zzd = i11;
            bArr[i10] = (byte) (((int) (j >> 8)) & 255);
            int i12 = i7 + 3;
            this.zzd = i12;
            bArr[i11] = (byte) (((int) (j >> 16)) & 255);
            int i13 = i7 + 4;
            this.zzd = i13;
            bArr[i12] = (byte) (((int) (j >> 24)) & 255);
            int i14 = i7 + 5;
            this.zzd = i14;
            bArr[i13] = (byte) (((int) (j >> 32)) & 255);
            int i15 = i7 + 6;
            this.zzd = i15;
            bArr[i14] = (byte) (((int) (j >> 40)) & 255);
            int i16 = i7 + 7;
            this.zzd = i16;
            bArr[i15] = (byte) (((int) (j >> 48)) & 255);
            this.zzd = i7 + 8;
            bArr[i16] = (byte) (((int) (j >> 56)) & 255);
        } catch (IndexOutOfBoundsException e2) {
            throw new zzll(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1), e2);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzln
    public final void zzj(int i7, int i10) {
        zzt(i7 << 3);
        zzk(i10);
    }

    @Override // com.google.android.recaptcha.internal.zzln
    public final void zzk(int i7) {
        if (i7 >= 0) {
            zzt(i7);
        } else {
            zzv(i7);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzln
    public final void zzl(byte[] bArr, int i7, int i10) {
        zzc(bArr, 0, i10);
    }

    @Override // com.google.android.recaptcha.internal.zzln
    public final void zzm(int i7, zzoi zzoiVar, zzow zzowVar) {
        zzt((i7 << 3) | 2);
        zzt(((zzko) zzoiVar).zza(zzowVar));
        zzowVar.zzj(zzoiVar, this.zza);
    }

    @Override // com.google.android.recaptcha.internal.zzln
    public final void zzn(int i7, zzoi zzoiVar) {
        zzt(11);
        zzs(2, i7);
        zzt(26);
        zzt(zzoiVar.zzo());
        zzoiVar.zze(this);
        zzt(12);
    }

    @Override // com.google.android.recaptcha.internal.zzln
    public final void zzo(int i7, zzle zzleVar) {
        zzt(11);
        zzs(2, i7);
        zze(3, zzleVar);
        zzt(12);
    }

    @Override // com.google.android.recaptcha.internal.zzln
    public final void zzp(int i7, String str) {
        zzt((i7 << 3) | 2);
        zzq(str);
    }

    public final void zzq(String str) {
        int i7 = this.zzd;
        try {
            int zzA = zzln.zzA(str.length() * 3);
            int zzA2 = zzln.zzA(str.length());
            if (zzA2 != zzA) {
                zzt(zzpv.zzc(str));
                byte[] bArr = this.zzb;
                int i10 = this.zzd;
                this.zzd = zzpv.zzb(str, bArr, i10, this.zzc - i10);
                return;
            }
            int i11 = i7 + zzA2;
            this.zzd = i11;
            int zzb = zzpv.zzb(str, this.zzb, i11, this.zzc - i11);
            this.zzd = i7;
            zzt((zzb - i7) - zzA2);
            this.zzd = zzb;
        } catch (zzpu e2) {
            this.zzd = i7;
            zzD(str, e2);
        } catch (IndexOutOfBoundsException e10) {
            throw new zzll(e10);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzln
    public final void zzr(int i7, int i10) {
        zzt((i7 << 3) | i10);
    }

    @Override // com.google.android.recaptcha.internal.zzln
    public final void zzs(int i7, int i10) {
        zzt(i7 << 3);
        zzt(i10);
    }

    @Override // com.google.android.recaptcha.internal.zzln
    public final void zzt(int i7) {
        while ((i7 & (-128)) != 0) {
            try {
                byte[] bArr = this.zzb;
                int i10 = this.zzd;
                this.zzd = i10 + 1;
                bArr[i10] = (byte) ((i7 | 128) & 255);
                i7 >>>= 7;
            } catch (IndexOutOfBoundsException e2) {
                throw new zzll(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1), e2);
            }
        }
        byte[] bArr2 = this.zzb;
        int i11 = this.zzd;
        this.zzd = i11 + 1;
        bArr2[i11] = (byte) i7;
    }

    @Override // com.google.android.recaptcha.internal.zzln
    public final void zzu(int i7, long j) {
        zzt(i7 << 3);
        zzv(j);
    }

    @Override // com.google.android.recaptcha.internal.zzln
    public final void zzv(long j) {
        boolean z8;
        z8 = zzln.zzc;
        if (!z8 || this.zzc - this.zzd < 10) {
            while ((j & (-128)) != 0) {
                try {
                    byte[] bArr = this.zzb;
                    int i7 = this.zzd;
                    this.zzd = i7 + 1;
                    bArr[i7] = (byte) ((((int) j) | 128) & 255);
                    j >>>= 7;
                } catch (IndexOutOfBoundsException e2) {
                    throw new zzll(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1), e2);
                }
            }
            byte[] bArr2 = this.zzb;
            int i10 = this.zzd;
            this.zzd = i10 + 1;
            bArr2[i10] = (byte) j;
            return;
        }
        while (true) {
            int i11 = (int) j;
            if ((j & (-128)) == 0) {
                byte[] bArr3 = this.zzb;
                int i12 = this.zzd;
                this.zzd = i12 + 1;
                zzps.zzn(bArr3, i12, (byte) i11);
                return;
            }
            byte[] bArr4 = this.zzb;
            int i13 = this.zzd;
            this.zzd = i13 + 1;
            zzps.zzn(bArr4, i13, (byte) ((i11 | 128) & 255));
            j >>>= 7;
        }
    }
}
