package com.google.android.recaptcha.internal;

import A3.c;
import com.google.android.gms.common.api.f;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzlg extends zzli {
    private final InputStream zze;
    private final byte[] zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;

    public /* synthetic */ zzlg(InputStream inputStream, int i7, zzlh zzlhVar) {
        super(null);
        this.zzl = f.API_PRIORITY_OTHER;
        byte[] bArr = zznl.zzb;
        this.zze = inputStream;
        this.zzf = new byte[4096];
        this.zzg = 0;
        this.zzi = 0;
        this.zzk = 0;
    }

    private final List zzJ(int i7) {
        ArrayList arrayList = new ArrayList();
        while (i7 > 0) {
            int min = Math.min(i7, 4096);
            byte[] bArr = new byte[min];
            int i10 = 0;
            while (i10 < min) {
                int read = this.zze.read(bArr, i10, min - i10);
                if (read == -1) {
                    throw new zznn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                this.zzk += read;
                i10 += read;
            }
            i7 -= min;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    private final void zzK() {
        int i7 = this.zzg + this.zzh;
        this.zzg = i7;
        int i10 = this.zzk + i7;
        int i11 = this.zzl;
        if (i10 <= i11) {
            this.zzh = 0;
            return;
        }
        int i12 = i10 - i11;
        this.zzh = i12;
        this.zzg = i7 - i12;
    }

    private final void zzL(int i7) {
        if (zzM(i7)) {
            return;
        }
        if (i7 <= (f.API_PRIORITY_OTHER - this.zzk) - this.zzi) {
            throw new zznn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        throw new zznn("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    private final boolean zzM(int i7) {
        int i10 = this.zzi;
        int i11 = i10 + i7;
        int i12 = this.zzg;
        if (i11 <= i12) {
            throw new IllegalStateException(c.f(i7, "refillBuffer() called when ", " bytes were already available in buffer"));
        }
        int i13 = this.zzk;
        if (i7 > (f.API_PRIORITY_OTHER - i13) - i10 || i13 + i10 + i7 > this.zzl) {
            return false;
        }
        if (i10 > 0) {
            if (i12 > i10) {
                byte[] bArr = this.zzf;
                System.arraycopy(bArr, i10, bArr, 0, i12 - i10);
            }
            i13 = this.zzk + i10;
            this.zzk = i13;
            i12 = this.zzg - i10;
            this.zzg = i12;
            this.zzi = 0;
        }
        try {
            int read = this.zze.read(this.zzf, i12, Math.min(4096 - i12, (f.API_PRIORITY_OTHER - i13) - i12));
            if (read == 0 || read < -1 || read > 4096) {
                throw new IllegalStateException(String.valueOf(this.zze.getClass()) + "#read(byte[]) returned invalid result: " + read + "\nThe InputStream implementation is buggy.");
            }
            if (read <= 0) {
                return false;
            }
            this.zzg += read;
            zzK();
            if (this.zzg >= i7) {
                return true;
            }
            return zzM(i7);
        } catch (zznn e2) {
            e2.zza();
            throw e2;
        }
    }

    private final byte[] zzN(int i7, boolean z8) {
        byte[] zzO = zzO(i7);
        if (zzO != null) {
            return zzO;
        }
        int i10 = this.zzi;
        int i11 = this.zzg;
        int i12 = i11 - i10;
        this.zzk += i11;
        this.zzi = 0;
        this.zzg = 0;
        List<byte[]> zzJ = zzJ(i7 - i12);
        byte[] bArr = new byte[i7];
        System.arraycopy(this.zzf, i10, bArr, 0, i12);
        for (byte[] bArr2 : zzJ) {
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i12, length);
            i12 += length;
        }
        return bArr;
    }

    private final byte[] zzO(int i7) {
        if (i7 == 0) {
            return zznl.zzb;
        }
        int i10 = this.zzk;
        int i11 = this.zzi;
        int i12 = i10 + i11 + i7;
        if ((-2147483647) + i12 > 0) {
            throw new zznn("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }
        int i13 = this.zzl;
        if (i12 > i13) {
            zzB((i13 - i10) - i11);
            throw new zznn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i14 = this.zzg - i11;
        int i15 = i7 - i14;
        if (i15 >= 4096) {
            try {
                if (i15 > this.zze.available()) {
                    return null;
                }
            } catch (zznn e2) {
                e2.zza();
                throw e2;
            }
        }
        byte[] bArr = new byte[i7];
        System.arraycopy(this.zzf, this.zzi, bArr, 0, i14);
        this.zzk += this.zzg;
        this.zzi = 0;
        this.zzg = 0;
        while (i14 < i7) {
            try {
                int read = this.zze.read(bArr, i14, i7 - i14);
                if (read == -1) {
                    throw new zznn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                this.zzk += read;
                i14 += read;
            } catch (zznn e10) {
                e10.zza();
                throw e10;
            }
        }
        return bArr;
    }

    @Override // com.google.android.recaptcha.internal.zzli
    public final void zzA(int i7) {
        this.zzl = i7;
        zzK();
    }

    public final void zzB(int i7) {
        int i10 = this.zzg;
        int i11 = this.zzi;
        int i12 = i10 - i11;
        if (i7 <= i12 && i7 >= 0) {
            this.zzi = i11 + i7;
            return;
        }
        if (i7 < 0) {
            throw new zznn("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i13 = this.zzk;
        int i14 = i13 + i11;
        int i15 = this.zzl;
        if (i14 + i7 > i15) {
            zzB((i15 - i13) - i11);
            throw new zznn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.zzk = i14;
        this.zzg = 0;
        this.zzi = 0;
        while (i12 < i7) {
            try {
                long j = i7 - i12;
                try {
                    long skip = this.zze.skip(j);
                    if (skip < 0 || skip > j) {
                        throw new IllegalStateException(String.valueOf(this.zze.getClass()) + "#skip returned invalid result: " + skip + "\nThe InputStream implementation is buggy.");
                    }
                    if (skip == 0) {
                        break;
                    } else {
                        i12 += (int) skip;
                    }
                } catch (zznn e2) {
                    e2.zza();
                    throw e2;
                }
            } catch (Throwable th) {
                this.zzk += i12;
                zzK();
                throw th;
            }
        }
        this.zzk += i12;
        zzK();
        if (i12 >= i7) {
            return;
        }
        int i16 = this.zzg;
        int i17 = i16 - this.zzi;
        this.zzi = i16;
        zzL(1);
        while (true) {
            int i18 = i7 - i17;
            int i19 = this.zzg;
            if (i18 <= i19) {
                this.zzi = i18;
                return;
            } else {
                i17 += i19;
                this.zzi = i19;
                zzL(1);
            }
        }
    }

    @Override // com.google.android.recaptcha.internal.zzli
    public final boolean zzC() {
        return this.zzi == this.zzg && !zzM(1);
    }

    @Override // com.google.android.recaptcha.internal.zzli
    public final boolean zzD() {
        return zzr() != 0;
    }

    @Override // com.google.android.recaptcha.internal.zzli
    public final boolean zzE(int i7) {
        int i10 = i7 & 7;
        int i11 = 0;
        if (i10 == 0) {
            if (this.zzg - this.zzi < 10) {
                while (i11 < 10) {
                    if (zza() < 0) {
                        i11++;
                    }
                }
                throw new zznn("CodedInputStream encountered a malformed varint.");
            }
            while (i11 < 10) {
                byte[] bArr = this.zzf;
                int i12 = this.zzi;
                this.zzi = i12 + 1;
                if (bArr[i12] < 0) {
                    i11++;
                }
            }
            throw new zznn("CodedInputStream encountered a malformed varint.");
            return true;
        }
        if (i10 == 1) {
            zzB(8);
            return true;
        }
        if (i10 == 2) {
            zzB(zzj());
            return true;
        }
        if (i10 == 3) {
            zzI();
            zzz(((i7 >>> 3) << 3) | 4);
            return true;
        }
        if (i10 == 4) {
            return false;
        }
        if (i10 != 5) {
            throw new zznm("Protocol message tag had invalid wire type.");
        }
        zzB(4);
        return true;
    }

    public final byte zza() {
        if (this.zzi == this.zzg) {
            zzL(1);
        }
        byte[] bArr = this.zzf;
        int i7 = this.zzi;
        this.zzi = i7 + 1;
        return bArr[i7];
    }

    @Override // com.google.android.recaptcha.internal.zzli
    public final double zzb() {
        return Double.longBitsToDouble(zzq());
    }

    @Override // com.google.android.recaptcha.internal.zzli
    public final float zzc() {
        return Float.intBitsToFloat(zzi());
    }

    @Override // com.google.android.recaptcha.internal.zzli
    public final int zzd() {
        return this.zzk + this.zzi;
    }

    @Override // com.google.android.recaptcha.internal.zzli
    public final int zze(int i7) {
        if (i7 < 0) {
            throw new zznn("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i10 = this.zzk + this.zzi + i7;
        if (i10 < 0) {
            throw new zznn("Failed to parse the message.");
        }
        int i11 = this.zzl;
        if (i10 > i11) {
            throw new zznn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.zzl = i10;
        zzK();
        return i11;
    }

    @Override // com.google.android.recaptcha.internal.zzli
    public final int zzf() {
        return zzj();
    }

    @Override // com.google.android.recaptcha.internal.zzli
    public final int zzg() {
        return zzi();
    }

    @Override // com.google.android.recaptcha.internal.zzli
    public final int zzh() {
        return zzj();
    }

    public final int zzi() {
        int i7 = this.zzi;
        if (this.zzg - i7 < 4) {
            zzL(4);
            i7 = this.zzi;
        }
        byte[] bArr = this.zzf;
        this.zzi = i7 + 4;
        int i10 = bArr[i7] & 255;
        int i11 = bArr[i7 + 1] & 255;
        int i12 = bArr[i7 + 2] & 255;
        return ((bArr[i7 + 3] & 255) << 24) | (i11 << 8) | i10 | (i12 << 16);
    }

    public final int zzj() {
        int i7;
        int i10 = this.zzi;
        int i11 = this.zzg;
        if (i11 != i10) {
            byte[] bArr = this.zzf;
            int i12 = i10 + 1;
            byte b2 = bArr[i10];
            if (b2 >= 0) {
                this.zzi = i12;
                return b2;
            }
            if (i11 - i12 >= 9) {
                int i13 = i10 + 2;
                int i14 = (bArr[i12] << 7) ^ b2;
                if (i14 < 0) {
                    i7 = i14 ^ (-128);
                } else {
                    int i15 = i10 + 3;
                    int i16 = (bArr[i13] << 14) ^ i14;
                    if (i16 >= 0) {
                        i7 = i16 ^ 16256;
                    } else {
                        int i17 = i10 + 4;
                        int i18 = i16 ^ (bArr[i15] << 21);
                        if (i18 < 0) {
                            i7 = (-2080896) ^ i18;
                        } else {
                            i15 = i10 + 5;
                            byte b10 = bArr[i17];
                            int i19 = (i18 ^ (b10 << 28)) ^ 266354560;
                            if (b10 < 0) {
                                i17 = i10 + 6;
                                if (bArr[i15] < 0) {
                                    i15 = i10 + 7;
                                    if (bArr[i17] < 0) {
                                        i17 = i10 + 8;
                                        if (bArr[i15] < 0) {
                                            i15 = i10 + 9;
                                            if (bArr[i17] < 0) {
                                                int i20 = i10 + 10;
                                                if (bArr[i15] >= 0) {
                                                    i13 = i20;
                                                    i7 = i19;
                                                }
                                            }
                                        }
                                    }
                                }
                                i7 = i19;
                            }
                            i7 = i19;
                        }
                        i13 = i17;
                    }
                    i13 = i15;
                }
                this.zzi = i13;
                return i7;
            }
        }
        return (int) zzs();
    }

    @Override // com.google.android.recaptcha.internal.zzli
    public final int zzk() {
        return zzi();
    }

    @Override // com.google.android.recaptcha.internal.zzli
    public final int zzl() {
        return zzli.zzF(zzj());
    }

    @Override // com.google.android.recaptcha.internal.zzli
    public final int zzm() {
        if (zzC()) {
            this.zzj = 0;
            return 0;
        }
        int zzj = zzj();
        this.zzj = zzj;
        if ((zzj >>> 3) != 0) {
            return zzj;
        }
        throw new zznn("Protocol message contained an invalid tag (zero).");
    }

    @Override // com.google.android.recaptcha.internal.zzli
    public final int zzn() {
        return zzj();
    }

    @Override // com.google.android.recaptcha.internal.zzli
    public final long zzo() {
        return zzq();
    }

    @Override // com.google.android.recaptcha.internal.zzli
    public final long zzp() {
        return zzr();
    }

    public final long zzq() {
        int i7 = this.zzi;
        if (this.zzg - i7 < 8) {
            zzL(8);
            i7 = this.zzi;
        }
        byte[] bArr = this.zzf;
        this.zzi = i7 + 8;
        long j = bArr[i7];
        long j10 = bArr[i7 + 2];
        long j11 = bArr[i7 + 3];
        return ((bArr[i7 + 7] & 255) << 56) | (j & 255) | ((bArr[i7 + 1] & 255) << 8) | ((j10 & 255) << 16) | ((j11 & 255) << 24) | ((bArr[i7 + 4] & 255) << 32) | ((bArr[i7 + 5] & 255) << 40) | ((bArr[i7 + 6] & 255) << 48);
    }

    public final long zzr() {
        long j;
        long j10;
        int i7 = this.zzi;
        int i10 = this.zzg;
        if (i10 != i7) {
            byte[] bArr = this.zzf;
            int i11 = i7 + 1;
            byte b2 = bArr[i7];
            if (b2 >= 0) {
                this.zzi = i11;
                return b2;
            }
            if (i10 - i11 >= 9) {
                int i12 = i7 + 2;
                int i13 = (bArr[i11] << 7) ^ b2;
                if (i13 < 0) {
                    j = i13 ^ (-128);
                } else {
                    int i14 = i7 + 3;
                    int i15 = (bArr[i12] << 14) ^ i13;
                    if (i15 >= 0) {
                        j = i15 ^ 16256;
                    } else {
                        int i16 = i7 + 4;
                        int i17 = i15 ^ (bArr[i14] << 21);
                        if (i17 < 0) {
                            long j11 = (-2080896) ^ i17;
                            i12 = i16;
                            j = j11;
                        } else {
                            i14 = i7 + 5;
                            long j12 = (bArr[i16] << 28) ^ i17;
                            if (j12 >= 0) {
                                j = j12 ^ 266354560;
                            } else {
                                i12 = i7 + 6;
                                long j13 = (bArr[i14] << 35) ^ j12;
                                if (j13 < 0) {
                                    j10 = -34093383808L;
                                } else {
                                    int i18 = i7 + 7;
                                    long j14 = j13 ^ (bArr[i12] << 42);
                                    if (j14 >= 0) {
                                        j = j14 ^ 4363953127296L;
                                    } else {
                                        i12 = i7 + 8;
                                        j13 = j14 ^ (bArr[i18] << 49);
                                        if (j13 < 0) {
                                            j10 = -558586000294016L;
                                        } else {
                                            i18 = i7 + 9;
                                            long j15 = (j13 ^ (bArr[i12] << 56)) ^ 71499008037633920L;
                                            if (j15 < 0) {
                                                i12 = i7 + 10;
                                                if (bArr[i18] >= 0) {
                                                    j = j15;
                                                }
                                            } else {
                                                j = j15;
                                            }
                                        }
                                    }
                                    i12 = i18;
                                }
                                j = j13 ^ j10;
                            }
                        }
                    }
                    i12 = i14;
                }
                this.zzi = i12;
                return j;
            }
        }
        return zzs();
    }

    public final long zzs() {
        long j = 0;
        for (int i7 = 0; i7 < 64; i7 += 7) {
            j |= (r3 & Byte.MAX_VALUE) << i7;
            if ((zza() & 128) == 0) {
                return j;
            }
        }
        throw new zznn("CodedInputStream encountered a malformed varint.");
    }

    @Override // com.google.android.recaptcha.internal.zzli
    public final long zzt() {
        return zzq();
    }

    @Override // com.google.android.recaptcha.internal.zzli
    public final long zzu() {
        return zzli.zzG(zzr());
    }

    @Override // com.google.android.recaptcha.internal.zzli
    public final long zzv() {
        return zzr();
    }

    @Override // com.google.android.recaptcha.internal.zzli
    public final zzle zzw() {
        int zzj = zzj();
        int i7 = this.zzg;
        int i10 = this.zzi;
        if (zzj <= i7 - i10 && zzj > 0) {
            zzle zzk = zzle.zzk(this.zzf, i10, zzj);
            this.zzi += zzj;
            return zzk;
        }
        if (zzj == 0) {
            return zzle.zzb;
        }
        if (zzj < 0) {
            throw new zznn("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        byte[] zzO = zzO(zzj);
        if (zzO != null) {
            return zzle.zzk(zzO, 0, zzO.length);
        }
        int i11 = this.zzi;
        int i12 = this.zzg;
        int i13 = i12 - i11;
        this.zzk += i12;
        this.zzi = 0;
        this.zzg = 0;
        List<byte[]> zzJ = zzJ(zzj - i13);
        byte[] bArr = new byte[zzj];
        System.arraycopy(this.zzf, i11, bArr, 0, i13);
        for (byte[] bArr2 : zzJ) {
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i13, length);
            i13 += length;
        }
        return new zzlc(bArr);
    }

    @Override // com.google.android.recaptcha.internal.zzli
    public final String zzx() {
        int zzj = zzj();
        if (zzj > 0) {
            int i7 = this.zzg;
            int i10 = this.zzi;
            if (zzj <= i7 - i10) {
                String str = new String(this.zzf, i10, zzj, zznl.zza);
                this.zzi += zzj;
                return str;
            }
        }
        if (zzj == 0) {
            return "";
        }
        if (zzj < 0) {
            throw new zznn("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (zzj > this.zzg) {
            return new String(zzN(zzj, false), zznl.zza);
        }
        zzL(zzj);
        String str2 = new String(this.zzf, this.zzi, zzj, zznl.zza);
        this.zzi += zzj;
        return str2;
    }

    @Override // com.google.android.recaptcha.internal.zzli
    public final String zzy() {
        byte[] zzN;
        int zzj = zzj();
        int i7 = this.zzi;
        int i10 = this.zzg;
        if (zzj <= i10 - i7 && zzj > 0) {
            zzN = this.zzf;
            this.zzi = i7 + zzj;
        } else {
            if (zzj == 0) {
                return "";
            }
            if (zzj < 0) {
                throw new zznn("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            i7 = 0;
            if (zzj <= i10) {
                zzL(zzj);
                zzN = this.zzf;
                this.zzi = zzj;
            } else {
                zzN = zzN(zzj, false);
            }
        }
        return zzpv.zzd(zzN, i7, zzj);
    }

    @Override // com.google.android.recaptcha.internal.zzli
    public final void zzz(int i7) {
        if (this.zzj != i7) {
            throw new zznn("Protocol message end-group tag did not match expected tag.");
        }
    }
}
