package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.f;
import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzaka extends zzakb {
    private final byte[] zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;

    private zzaka(byte[] bArr, int i7, int i10, boolean z8) {
        super();
        this.zzj = f.API_PRIORITY_OTHER;
        this.zzd = bArr;
        this.zze = i10 + i7;
        this.zzg = i7;
        this.zzh = i7;
    }

    private final int zzaa() {
        int i7;
        int i10 = this.zzg;
        int i11 = this.zze;
        if (i11 != i10) {
            byte[] bArr = this.zzd;
            int i12 = i10 + 1;
            byte b2 = bArr[i10];
            if (b2 >= 0) {
                this.zzg = i12;
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
                this.zzg = i13;
                return i7;
            }
        }
        return (int) zzm();
    }

    private final long zzab() {
        int i7 = this.zzg;
        if (this.zze - i7 < 8) {
            throw zzalf.zzj();
        }
        byte[] bArr = this.zzd;
        this.zzg = i7 + 8;
        return ((bArr[i7 + 7] & 255) << 56) | (bArr[i7] & 255) | ((bArr[i7 + 1] & 255) << 8) | ((bArr[i7 + 2] & 255) << 16) | ((bArr[i7 + 3] & 255) << 24) | ((bArr[i7 + 4] & 255) << 32) | ((bArr[i7 + 5] & 255) << 40) | ((bArr[i7 + 6] & 255) << 48);
    }

    private final long zzac() {
        long j;
        long j10;
        long j11;
        int i7 = this.zzg;
        int i10 = this.zze;
        if (i10 != i7) {
            byte[] bArr = this.zzd;
            int i11 = i7 + 1;
            byte b2 = bArr[i7];
            if (b2 >= 0) {
                this.zzg = i11;
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
                        i12 = i14;
                    } else {
                        int i16 = i7 + 4;
                        int i17 = i15 ^ (bArr[i14] << 21);
                        if (i17 < 0) {
                            long j12 = (-2080896) ^ i17;
                            i12 = i16;
                            j = j12;
                        } else {
                            long j13 = i17;
                            i12 = i7 + 5;
                            long j14 = j13 ^ (bArr[i16] << 28);
                            if (j14 >= 0) {
                                j11 = 266354560;
                            } else {
                                int i18 = i7 + 6;
                                long j15 = j14 ^ (bArr[i12] << 35);
                                if (j15 < 0) {
                                    j10 = -34093383808L;
                                } else {
                                    i12 = i7 + 7;
                                    j14 = j15 ^ (bArr[i18] << 42);
                                    if (j14 >= 0) {
                                        j11 = 4363953127296L;
                                    } else {
                                        i18 = i7 + 8;
                                        j15 = j14 ^ (bArr[i12] << 49);
                                        if (j15 < 0) {
                                            j10 = -558586000294016L;
                                        } else {
                                            i12 = i7 + 9;
                                            long j16 = (j15 ^ (bArr[i18] << 56)) ^ 71499008037633920L;
                                            if (j16 < 0) {
                                                int i19 = i7 + 10;
                                                if (bArr[i12] >= 0) {
                                                    i12 = i19;
                                                }
                                            }
                                            j = j16;
                                        }
                                    }
                                }
                                j = j15 ^ j10;
                                i12 = i18;
                            }
                            j = j14 ^ j11;
                        }
                    }
                }
                this.zzg = i12;
                return j;
            }
        }
        return zzm();
    }

    private final void zzad() {
        int i7 = this.zze + this.zzf;
        this.zze = i7;
        int i10 = i7 - this.zzh;
        int i11 = this.zzj;
        if (i10 <= i11) {
            this.zzf = 0;
            return;
        }
        int i12 = i10 - i11;
        this.zzf = i12;
        this.zze = i7 - i12;
    }

    private final void zzf(int i7) {
        if (i7 >= 0) {
            int i10 = this.zze;
            int i11 = this.zzg;
            if (i7 <= i10 - i11) {
                this.zzg = i11 + i7;
                return;
            }
        }
        if (i7 >= 0) {
            throw zzalf.zzj();
        }
        throw zzalf.zzf();
    }

    private final byte zzy() {
        int i7 = this.zzg;
        if (i7 == this.zze) {
            throw zzalf.zzj();
        }
        byte[] bArr = this.zzd;
        this.zzg = i7 + 1;
        return bArr[i7];
    }

    private final int zzz() {
        int i7 = this.zzg;
        if (this.zze - i7 < 4) {
            throw zzalf.zzj();
        }
        byte[] bArr = this.zzd;
        this.zzg = i7 + 4;
        return ((bArr[i7 + 3] & 255) << 24) | (bArr[i7] & 255) | ((bArr[i7 + 1] & 255) << 8) | ((bArr[i7 + 2] & 255) << 16);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakb
    public final double zza() {
        return Double.longBitsToDouble(zzab());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakb
    public final int zza(int i7) {
        if (i7 < 0) {
            throw zzalf.zzf();
        }
        int zzc = i7 + zzc();
        if (zzc < 0) {
            throw zzalf.zzi();
        }
        int i10 = this.zzj;
        if (zzc > i10) {
            throw zzalf.zzj();
        }
        this.zzj = zzc;
        zzad();
        return i10;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakb
    public final float zzb() {
        return Float.intBitsToFloat(zzz());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakb
    public final void zzb(int i7) {
        if (this.zzi != i7) {
            throw zzalf.zzb();
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakb
    public final int zzc() {
        return this.zzg - this.zzh;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakb
    public final void zzc(int i7) {
        this.zzj = i7;
        zzad();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakb
    public final int zzd() {
        return zzaa();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakb
    public final boolean zzd(int i7) {
        int i10 = i7 & 7;
        int i11 = 0;
        if (i10 == 0) {
            if (this.zze - this.zzg < 10) {
                while (i11 < 10) {
                    if (zzy() < 0) {
                        i11++;
                    }
                }
                throw zzalf.zze();
            }
            while (i11 < 10) {
                byte[] bArr = this.zzd;
                int i12 = this.zzg;
                this.zzg = i12 + 1;
                if (bArr[i12] < 0) {
                    i11++;
                }
            }
            throw zzalf.zze();
            return true;
        }
        if (i10 == 1) {
            zzf(8);
            return true;
        }
        if (i10 == 2) {
            zzf(zzaa());
            return true;
        }
        if (i10 == 3) {
            zzx();
            zzb(((i7 >>> 3) << 3) | 4);
            return true;
        }
        if (i10 == 4) {
            zzw();
            return false;
        }
        if (i10 != 5) {
            throw zzalf.zza();
        }
        zzf(4);
        return true;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakb
    public final int zze() {
        return zzz();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakb
    public final int zzf() {
        return zzaa();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakb
    public final int zzg() {
        return zzz();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakb
    public final int zzh() {
        return zzakb.zze(zzaa());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakb
    public final int zzi() {
        if (zzt()) {
            this.zzi = 0;
            return 0;
        }
        int zzaa = zzaa();
        this.zzi = zzaa;
        if ((zzaa >>> 3) != 0) {
            return zzaa;
        }
        throw zzalf.zzc();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakb
    public final int zzj() {
        return zzaa();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakb
    public final long zzk() {
        return zzab();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakb
    public final long zzl() {
        return zzac();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakb
    public final long zzm() {
        long j = 0;
        for (int i7 = 0; i7 < 64; i7 += 7) {
            j |= (r3 & Byte.MAX_VALUE) << i7;
            if ((zzy() & 128) == 0) {
                return j;
            }
        }
        throw zzalf.zze();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakb
    public final long zzn() {
        return zzab();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakb
    public final long zzo() {
        return zzakb.zza(zzac());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakb
    public final long zzp() {
        return zzac();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakb
    public final zzajp zzq() {
        byte[] bArr;
        int zzaa = zzaa();
        if (zzaa > 0) {
            int i7 = this.zze;
            int i10 = this.zzg;
            if (zzaa <= i7 - i10) {
                zzajp zza = zzajp.zza(this.zzd, i10, zzaa);
                this.zzg += zzaa;
                return zza;
            }
        }
        if (zzaa == 0) {
            return zzajp.zza;
        }
        if (zzaa > 0) {
            int i11 = this.zze;
            int i12 = this.zzg;
            if (zzaa <= i11 - i12) {
                int i13 = zzaa + i12;
                this.zzg = i13;
                bArr = Arrays.copyOfRange(this.zzd, i12, i13);
                return zzajp.zzb(bArr);
            }
        }
        if (zzaa > 0) {
            throw zzalf.zzj();
        }
        if (zzaa != 0) {
            throw zzalf.zzf();
        }
        bArr = zzalb.zzb;
        return zzajp.zzb(bArr);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakb
    public final String zzr() {
        int zzaa = zzaa();
        if (zzaa > 0) {
            int i7 = this.zze;
            int i10 = this.zzg;
            if (zzaa <= i7 - i10) {
                String str = new String(this.zzd, i10, zzaa, zzalb.zza);
                this.zzg += zzaa;
                return str;
            }
        }
        if (zzaa == 0) {
            return "";
        }
        if (zzaa < 0) {
            throw zzalf.zzf();
        }
        throw zzalf.zzj();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakb
    public final String zzs() {
        int zzaa = zzaa();
        if (zzaa > 0) {
            int i7 = this.zze;
            int i10 = this.zzg;
            if (zzaa <= i7 - i10) {
                String zzb = zzant.zzb(this.zzd, i10, zzaa);
                this.zzg += zzaa;
                return zzb;
            }
        }
        if (zzaa == 0) {
            return "";
        }
        if (zzaa <= 0) {
            throw zzalf.zzf();
        }
        throw zzalf.zzj();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakb
    public final boolean zzt() {
        return this.zzg == this.zze;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakb
    public final boolean zzu() {
        return zzac() != 0;
    }
}
