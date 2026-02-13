package com.google.android.gms.internal.measurement;

import X.c;
import java.util.Locale;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzlj extends zzll {
    private final byte[] zzc;
    private final int zzd;
    private int zze;

    public zzlj(byte[] bArr, int i7, int i10) {
        super(null);
        int length = bArr.length;
        if (((length - i10) | i10) < 0) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException(c.e(length, i10, "Array range is invalid. Buffer.length=", ", offset=0, length="));
        }
        this.zzc = bArr;
        this.zze = 0;
        this.zzd = i10;
    }

    @Override // com.google.android.gms.internal.measurement.zzll
    public final void zza(int i7, int i10) {
        zzr((i7 << 3) | i10);
    }

    @Override // com.google.android.gms.internal.measurement.zzll
    public final void zzb(int i7, int i10) {
        zzr(i7 << 3);
        zzq(i10);
    }

    @Override // com.google.android.gms.internal.measurement.zzll
    public final void zzc(int i7, int i10) {
        zzr(i7 << 3);
        zzr(i10);
    }

    @Override // com.google.android.gms.internal.measurement.zzll
    public final void zzd(int i7, int i10) {
        zzr((i7 << 3) | 5);
        zzs(i10);
    }

    @Override // com.google.android.gms.internal.measurement.zzll
    public final void zze(int i7, long j) {
        zzr(i7 << 3);
        zzt(j);
    }

    @Override // com.google.android.gms.internal.measurement.zzll
    public final void zzf(int i7, long j) {
        zzr((i7 << 3) | 1);
        zzu(j);
    }

    @Override // com.google.android.gms.internal.measurement.zzll
    public final void zzg(int i7, boolean z8) {
        zzr(i7 << 3);
        zzp(z8 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.measurement.zzll
    public final void zzh(int i7, String str) {
        zzr((i7 << 3) | 2);
        zzx(str);
    }

    @Override // com.google.android.gms.internal.measurement.zzll
    public final void zzi(int i7, zzlg zzlgVar) {
        zzr((i7 << 3) | 2);
        zzj(zzlgVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzll
    public final void zzj(zzlg zzlgVar) {
        zzr(zzlgVar.zzc());
        zzlgVar.zzf(this);
    }

    @Override // com.google.android.gms.internal.measurement.zzll
    public final void zzk(byte[] bArr, int i7, int i10) {
        zzr(i10);
        zzv(bArr, 0, i10);
    }

    @Override // com.google.android.gms.internal.measurement.zzll
    public final void zzl(int i7, zznl zznlVar, zznw zznwVar) {
        zzr((i7 << 3) | 2);
        zzr(((zzkr) zznlVar).zzcd(zznwVar));
        zznwVar.zzf(zznlVar, this.zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzll
    public final void zzm(int i7, zznl zznlVar) {
        zzr(11);
        zzc(2, i7);
        zzr(26);
        zzo(zznlVar);
        zzr(12);
    }

    @Override // com.google.android.gms.internal.measurement.zzll
    public final void zzn(int i7, zzlg zzlgVar) {
        zzr(11);
        zzc(2, i7);
        zzi(3, zzlgVar);
        zzr(12);
    }

    @Override // com.google.android.gms.internal.measurement.zzll
    public final void zzo(zznl zznlVar) {
        zzr(zznlVar.zzcn());
        zznlVar.zzcB(this);
    }

    @Override // com.google.android.gms.internal.measurement.zzll
    public final void zzp(byte b2) {
        IndexOutOfBoundsException indexOutOfBoundsException;
        int i7 = this.zze;
        try {
            int i10 = i7 + 1;
            try {
                this.zzc[i7] = b2;
                this.zze = i10;
            } catch (IndexOutOfBoundsException e2) {
                indexOutOfBoundsException = e2;
                i7 = i10;
                throw new zzlk(i7, this.zzd, 1, indexOutOfBoundsException);
            }
        } catch (IndexOutOfBoundsException e10) {
            indexOutOfBoundsException = e10;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzll
    public final void zzq(int i7) {
        if (i7 >= 0) {
            zzr(i7);
        } else {
            zzt(i7);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzll
    public final void zzr(int i7) {
        int i10;
        IndexOutOfBoundsException indexOutOfBoundsException;
        int i11 = this.zze;
        while ((i7 & (-128)) != 0) {
            try {
                i10 = i11 + 1;
                try {
                    this.zzc[i11] = (byte) (i7 | 128);
                    i7 >>>= 7;
                    i11 = i10;
                } catch (IndexOutOfBoundsException e2) {
                    indexOutOfBoundsException = e2;
                    i11 = i10;
                    throw new zzlk(i11, this.zzd, 1, indexOutOfBoundsException);
                }
            } catch (IndexOutOfBoundsException e10) {
                indexOutOfBoundsException = e10;
                throw new zzlk(i11, this.zzd, 1, indexOutOfBoundsException);
            }
        }
        i10 = i11 + 1;
        this.zzc[i11] = (byte) i7;
        this.zze = i10;
    }

    @Override // com.google.android.gms.internal.measurement.zzll
    public final void zzs(int i7) {
        int i10 = this.zze;
        try {
            byte[] bArr = this.zzc;
            bArr[i10] = (byte) i7;
            bArr[i10 + 1] = (byte) (i7 >> 8);
            bArr[i10 + 2] = (byte) (i7 >> 16);
            bArr[i10 + 3] = (byte) (i7 >> 24);
            this.zze = i10 + 4;
        } catch (IndexOutOfBoundsException e2) {
            throw new zzlk(i10, this.zzd, 4, e2);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzll
    public final void zzt(long j) {
        boolean z8;
        int i7;
        IndexOutOfBoundsException indexOutOfBoundsException;
        int i10;
        z8 = zzll.zzd;
        int i11 = this.zze;
        if (!z8 || this.zzd - i11 < 10) {
            while ((j & (-128)) != 0) {
                try {
                    i10 = i11 + 1;
                } catch (IndexOutOfBoundsException e2) {
                    indexOutOfBoundsException = e2;
                }
                try {
                    this.zzc[i11] = (byte) (((int) j) | 128);
                    j >>>= 7;
                    i11 = i10;
                } catch (IndexOutOfBoundsException e10) {
                    indexOutOfBoundsException = e10;
                    i11 = i10;
                    throw new zzlk(i11, this.zzd, 1, indexOutOfBoundsException);
                }
            }
            i7 = i11 + 1;
            try {
                this.zzc[i11] = (byte) j;
            } catch (IndexOutOfBoundsException e11) {
                indexOutOfBoundsException = e11;
                i11 = i7;
                throw new zzlk(i11, this.zzd, 1, indexOutOfBoundsException);
            }
        } else {
            while ((j & (-128)) != 0) {
                zzoo.zzp(this.zzc, i11, (byte) (((int) j) | 128));
                j >>>= 7;
                i11++;
            }
            i7 = i11 + 1;
            zzoo.zzp(this.zzc, i11, (byte) j);
        }
        this.zze = i7;
    }

    @Override // com.google.android.gms.internal.measurement.zzll
    public final void zzu(long j) {
        int i7 = this.zze;
        try {
            byte[] bArr = this.zzc;
            bArr[i7] = (byte) j;
            bArr[i7 + 1] = (byte) (j >> 8);
            bArr[i7 + 2] = (byte) (j >> 16);
            bArr[i7 + 3] = (byte) (j >> 24);
            bArr[i7 + 4] = (byte) (j >> 32);
            bArr[i7 + 5] = (byte) (j >> 40);
            bArr[i7 + 6] = (byte) (j >> 48);
            bArr[i7 + 7] = (byte) (j >> 56);
            this.zze = i7 + 8;
        } catch (IndexOutOfBoundsException e2) {
            throw new zzlk(i7, this.zzd, 8, e2);
        }
    }

    public final void zzv(byte[] bArr, int i7, int i10) {
        try {
            System.arraycopy(bArr, 0, this.zzc, this.zze, i10);
            this.zze += i10;
        } catch (IndexOutOfBoundsException e2) {
            throw new zzlk(this.zze, this.zzd, i10, e2);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzll
    public final void zzw(byte[] bArr, int i7, int i10) {
        zzv(bArr, 0, i10);
    }

    @Override // com.google.android.gms.internal.measurement.zzll
    public final void zzx(String str) {
        int i7 = this.zze;
        try {
            int zzz = zzll.zzz(str.length() * 3);
            int zzz2 = zzll.zzz(str.length());
            if (zzz2 != zzz) {
                zzr(zzor.zzb(str));
                byte[] bArr = this.zzc;
                int i10 = this.zze;
                this.zze = zzor.zzc(str, bArr, i10, this.zzd - i10);
                return;
            }
            int i11 = i7 + zzz2;
            this.zze = i11;
            int zzc = zzor.zzc(str, this.zzc, i11, this.zzd - i11);
            this.zze = i7;
            zzr((zzc - i7) - zzz2);
            this.zze = zzc;
        } catch (zzoq e2) {
            this.zze = i7;
            zzF(str, e2);
        } catch (IndexOutOfBoundsException e10) {
            throw new zzlk(e10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzll
    public final int zzy() {
        return this.zzd - this.zze;
    }
}
