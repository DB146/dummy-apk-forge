package com.google.android.recaptcha.internal;

import com.google.android.gms.common.api.f;
import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzlf extends zzli {
    private final byte[] zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;

    public /* synthetic */ zzlf(byte[] bArr, int i7, int i10, boolean z8, zzlh zzlhVar) {
        super(null);
        this.zzj = f.API_PRIORITY_OTHER;
        this.zze = bArr;
        this.zzf = 0;
        this.zzh = 0;
    }

    private final void zzJ() {
        int i7 = this.zzf + this.zzg;
        this.zzf = i7;
        int i10 = this.zzj;
        if (i7 <= i10) {
            this.zzg = 0;
            return;
        }
        int i11 = i7 - i10;
        this.zzg = i11;
        this.zzf = i7 - i11;
    }

    @Override // com.google.android.recaptcha.internal.zzli
    public final void zzA(int i7) {
        this.zzj = i7;
        zzJ();
    }

    public final void zzB(int i7) {
        if (i7 >= 0) {
            int i10 = this.zzf;
            int i11 = this.zzh;
            if (i7 <= i10 - i11) {
                this.zzh = i11 + i7;
                return;
            }
        }
        if (i7 >= 0) {
            throw new zznn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        throw new zznn("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    @Override // com.google.android.recaptcha.internal.zzli
    public final boolean zzC() {
        return this.zzh == this.zzf;
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
            if (this.zzf - this.zzh < 10) {
                while (i11 < 10) {
                    if (zza() < 0) {
                        i11++;
                    }
                }
                throw new zznn("CodedInputStream encountered a malformed varint.");
            }
            while (i11 < 10) {
                byte[] bArr = this.zze;
                int i12 = this.zzh;
                this.zzh = i12 + 1;
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
        int i7 = this.zzh;
        if (i7 == this.zzf) {
            throw new zznn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        byte[] bArr = this.zze;
        this.zzh = i7 + 1;
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
        return this.zzh;
    }

    @Override // com.google.android.recaptcha.internal.zzli
    public final int zze(int i7) {
        if (i7 < 0) {
            throw new zznn("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i10 = i7 + this.zzh;
        if (i10 < 0) {
            throw new zznn("Failed to parse the message.");
        }
        int i11 = this.zzj;
        if (i10 > i11) {
            throw new zznn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.zzj = i10;
        zzJ();
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
        int i7 = this.zzh;
        if (this.zzf - i7 < 4) {
            throw new zznn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        byte[] bArr = this.zze;
        this.zzh = i7 + 4;
        int i10 = bArr[i7] & 255;
        int i11 = bArr[i7 + 1] & 255;
        int i12 = bArr[i7 + 2] & 255;
        return ((bArr[i7 + 3] & 255) << 24) | (i11 << 8) | i10 | (i12 << 16);
    }

    public final int zzj() {
        int i7;
        int i10 = this.zzh;
        int i11 = this.zzf;
        if (i11 != i10) {
            byte[] bArr = this.zze;
            int i12 = i10 + 1;
            byte b2 = bArr[i10];
            if (b2 >= 0) {
                this.zzh = i12;
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
                this.zzh = i13;
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
            this.zzi = 0;
            return 0;
        }
        int zzj = zzj();
        this.zzi = zzj;
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
        int i7 = this.zzh;
        if (this.zzf - i7 < 8) {
            throw new zznn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        byte[] bArr = this.zze;
        this.zzh = i7 + 8;
        long j = bArr[i7];
        long j10 = bArr[i7 + 2];
        long j11 = bArr[i7 + 3];
        return ((bArr[i7 + 7] & 255) << 56) | (j & 255) | ((bArr[i7 + 1] & 255) << 8) | ((j10 & 255) << 16) | ((j11 & 255) << 24) | ((bArr[i7 + 4] & 255) << 32) | ((bArr[i7 + 5] & 255) << 40) | ((bArr[i7 + 6] & 255) << 48);
    }

    public final long zzr() {
        long j;
        long j10;
        int i7 = this.zzh;
        int i10 = this.zzf;
        if (i10 != i7) {
            byte[] bArr = this.zze;
            int i11 = i7 + 1;
            byte b2 = bArr[i7];
            if (b2 >= 0) {
                this.zzh = i11;
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
                this.zzh = i12;
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
        if (zzj > 0) {
            int i7 = this.zzf;
            int i10 = this.zzh;
            if (zzj <= i7 - i10) {
                zzle zzk = zzle.zzk(this.zze, i10, zzj);
                this.zzh += zzj;
                return zzk;
            }
        }
        if (zzj == 0) {
            return zzle.zzb;
        }
        if (zzj > 0) {
            int i11 = this.zzf;
            int i12 = this.zzh;
            if (zzj <= i11 - i12) {
                int i13 = zzj + i12;
                this.zzh = i13;
                return new zzlc(Arrays.copyOfRange(this.zze, i12, i13));
            }
        }
        if (zzj <= 0) {
            throw new zznn("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new zznn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // com.google.android.recaptcha.internal.zzli
    public final String zzx() {
        int zzj = zzj();
        if (zzj > 0) {
            int i7 = this.zzf;
            int i10 = this.zzh;
            if (zzj <= i7 - i10) {
                String str = new String(this.zze, i10, zzj, zznl.zza);
                this.zzh += zzj;
                return str;
            }
        }
        if (zzj == 0) {
            return "";
        }
        if (zzj < 0) {
            throw new zznn("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new zznn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // com.google.android.recaptcha.internal.zzli
    public final String zzy() {
        int zzj = zzj();
        if (zzj > 0) {
            int i7 = this.zzf;
            int i10 = this.zzh;
            if (zzj <= i7 - i10) {
                String zzd = zzpv.zzd(this.zze, i10, zzj);
                this.zzh += zzj;
                return zzd;
            }
        }
        if (zzj == 0) {
            return "";
        }
        if (zzj <= 0) {
            throw new zznn("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new zznn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // com.google.android.recaptcha.internal.zzli
    public final void zzz(int i7) {
        if (this.zzi != i7) {
            throw new zznn("Protocol message end-group tag did not match expected tag.");
        }
    }
}
