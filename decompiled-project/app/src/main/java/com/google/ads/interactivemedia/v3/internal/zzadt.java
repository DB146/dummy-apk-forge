package com.google.ads.interactivemedia.v3.internal;

import com.google.android.gms.common.api.f;
import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzadt extends zzadv {
    private final byte[] zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private final int zzi;
    private int zzj;
    private int zzk;

    public /* synthetic */ zzadt(byte[] bArr, int i7, int i10, boolean z8, zzads zzadsVar) {
        super(null);
        this.zzk = f.API_PRIORITY_OTHER;
        this.zze = bArr;
        this.zzf = i10 + i7;
        this.zzh = i7;
        this.zzi = i7;
    }

    private final void zzv() {
        int i7 = this.zzf + this.zzg;
        this.zzf = i7;
        int i10 = i7 - this.zzi;
        int i11 = this.zzk;
        if (i10 <= i11) {
            this.zzg = 0;
            return;
        }
        int i12 = i10 - i11;
        this.zzg = i12;
        this.zzf = i7 - i12;
    }

    public final byte zza() {
        int i7 = this.zzh;
        if (i7 == this.zzf) {
            throw zzafc.zzi();
        }
        byte[] bArr = this.zze;
        this.zzh = i7 + 1;
        return bArr[i7];
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzadv
    public final int zzb() {
        return this.zzh - this.zzi;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzadv
    public final int zzc(int i7) {
        if (i7 < 0) {
            throw zzafc.zzf();
        }
        int i10 = (this.zzh - this.zzi) + i7;
        if (i10 < 0) {
            throw zzafc.zzg();
        }
        int i11 = this.zzk;
        if (i10 > i11) {
            throw zzafc.zzi();
        }
        this.zzk = i10;
        zzv();
        return i11;
    }

    public final int zzd() {
        int i7 = this.zzh;
        if (this.zzf - i7 < 4) {
            throw zzafc.zzi();
        }
        byte[] bArr = this.zze;
        this.zzh = i7 + 4;
        int i10 = bArr[i7] & 255;
        int i11 = bArr[i7 + 1] & 255;
        int i12 = bArr[i7 + 2] & 255;
        return ((bArr[i7 + 3] & 255) << 24) | (i11 << 8) | i10 | (i12 << 16);
    }

    public final int zze() {
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
        return (int) zzi();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzadv
    public final int zzf() {
        if (zzp()) {
            this.zzj = 0;
            return 0;
        }
        int zze = zze();
        this.zzj = zze;
        if ((zze >>> 3) != 0) {
            return zze;
        }
        throw zzafc.zzc();
    }

    public final long zzg() {
        int i7 = this.zzh;
        if (this.zzf - i7 < 8) {
            throw zzafc.zzi();
        }
        byte[] bArr = this.zze;
        this.zzh = i7 + 8;
        long j = bArr[i7];
        long j10 = bArr[i7 + 2];
        long j11 = bArr[i7 + 3];
        return ((bArr[i7 + 7] & 255) << 56) | (j & 255) | ((bArr[i7 + 1] & 255) << 8) | ((j10 & 255) << 16) | ((j11 & 255) << 24) | ((bArr[i7 + 4] & 255) << 32) | ((bArr[i7 + 5] & 255) << 40) | ((bArr[i7 + 6] & 255) << 48);
    }

    public final long zzh() {
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
        return zzi();
    }

    public final long zzi() {
        long j = 0;
        for (int i7 = 0; i7 < 64; i7 += 7) {
            j |= (r3 & Byte.MAX_VALUE) << i7;
            if ((zza() & 128) == 0) {
                return j;
            }
        }
        throw zzafc.zze();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzadv
    public final zzadr zzj() {
        int zze = zze();
        if (zze > 0) {
            int i7 = this.zzf;
            int i10 = this.zzh;
            if (zze <= i7 - i10) {
                zzadr zzs = zzadr.zzs(this.zze, i10, zze);
                this.zzh += zze;
                return zzs;
            }
        }
        if (zze == 0) {
            return zzadr.zzb;
        }
        if (zze > 0) {
            int i11 = this.zzf;
            int i12 = this.zzh;
            if (zze <= i11 - i12) {
                int i13 = zze + i12;
                this.zzh = i13;
                return new zzado(Arrays.copyOfRange(this.zze, i12, i13));
            }
        }
        if (zze <= 0) {
            throw zzafc.zzf();
        }
        throw zzafc.zzi();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzadv
    public final String zzk() {
        int zze = zze();
        if (zze > 0) {
            int i7 = this.zzf;
            int i10 = this.zzh;
            if (zze <= i7 - i10) {
                String str = new String(this.zze, i10, zze, zzafa.zzb);
                this.zzh += zze;
                return str;
            }
        }
        if (zze == 0) {
            return "";
        }
        if (zze < 0) {
            throw zzafc.zzf();
        }
        throw zzafc.zzi();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzadv
    public final String zzl() {
        int zze = zze();
        if (zze > 0) {
            int i7 = this.zzf;
            int i10 = this.zzh;
            if (zze <= i7 - i10) {
                String zzg = zzahy.zzg(this.zze, i10, zze);
                this.zzh += zze;
                return zzg;
            }
        }
        if (zze == 0) {
            return "";
        }
        if (zze <= 0) {
            throw zzafc.zzf();
        }
        throw zzafc.zzi();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzadv
    public final void zzm(int i7) {
        if (this.zzj != i7) {
            throw zzafc.zzb();
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzadv
    public final void zzn(int i7) {
        this.zzk = i7;
        zzv();
    }

    public final void zzo(int i7) {
        if (i7 >= 0) {
            int i10 = this.zzf;
            int i11 = this.zzh;
            if (i7 <= i10 - i11) {
                this.zzh = i11 + i7;
                return;
            }
        }
        if (i7 >= 0) {
            throw zzafc.zzi();
        }
        throw zzafc.zzf();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzadv
    public final boolean zzp() {
        return this.zzh == this.zzf;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzadv
    public final boolean zzq() {
        return zzh() != 0;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzadv
    public final boolean zzr(int i7) {
        int zzf;
        int i10 = i7 & 7;
        int i11 = 0;
        if (i10 == 0) {
            if (this.zzf - this.zzh < 10) {
                while (i11 < 10) {
                    if (zza() < 0) {
                        i11++;
                    }
                }
                throw zzafc.zze();
            }
            while (i11 < 10) {
                byte[] bArr = this.zze;
                int i12 = this.zzh;
                this.zzh = i12 + 1;
                if (bArr[i12] < 0) {
                    i11++;
                }
            }
            throw zzafc.zze();
            return true;
        }
        if (i10 == 1) {
            zzo(8);
            return true;
        }
        if (i10 == 2) {
            zzo(zze());
            return true;
        }
        if (i10 != 3) {
            if (i10 == 4) {
                return false;
            }
            if (i10 != 5) {
                throw zzafc.zza();
            }
            zzo(4);
            return true;
        }
        do {
            zzf = zzf();
            if (zzf == 0) {
                break;
            }
        } while (zzr(zzf));
        zzm(((i7 >>> 3) << 3) | 4);
        return true;
    }
}
