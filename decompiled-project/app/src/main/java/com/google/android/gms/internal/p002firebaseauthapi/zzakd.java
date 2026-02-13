package com.google.android.gms.internal.p002firebaseauthapi;

import A3.c;
import com.google.android.gms.common.api.f;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzakd extends zzakb {
    private final InputStream zzd;
    private final byte[] zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;

    private zzakd(InputStream inputStream, int i7) {
        super();
        this.zzk = f.API_PRIORITY_OTHER;
        zzalb.zza(inputStream, "input");
        this.zzd = inputStream;
        this.zze = new byte[4096];
        this.zzf = 0;
        this.zzh = 0;
        this.zzj = 0;
    }

    private static int zza(InputStream inputStream) {
        try {
            return inputStream.available();
        } catch (zzalf e2) {
            e2.zzk();
            throw e2;
        }
    }

    private static int zza(InputStream inputStream, byte[] bArr, int i7, int i10) {
        try {
            return inputStream.read(bArr, i7, i10);
        } catch (zzalf e2) {
            e2.zzk();
            throw e2;
        }
    }

    private static long zza(InputStream inputStream, long j) {
        try {
            return inputStream.skip(j);
        } catch (zzalf e2) {
            e2.zzk();
            throw e2;
        }
    }

    private final byte[] zza(int i7, boolean z8) {
        byte[] zzj = zzj(i7);
        if (zzj != null) {
            return zzj;
        }
        int i10 = this.zzh;
        int i11 = this.zzf;
        int i12 = i11 - i10;
        this.zzj += i11;
        this.zzh = 0;
        this.zzf = 0;
        List<byte[]> zzf = zzf(i7 - i12);
        byte[] bArr = new byte[i7];
        System.arraycopy(this.zze, i10, bArr, 0, i12);
        for (byte[] bArr2 : zzf) {
            System.arraycopy(bArr2, 0, bArr, i12, bArr2.length);
            i12 += bArr2.length;
        }
        return bArr;
    }

    private final int zzaa() {
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
        return (int) zzm();
    }

    private final long zzab() {
        int i7 = this.zzh;
        if (this.zzf - i7 < 8) {
            zzg(8);
            i7 = this.zzh;
        }
        byte[] bArr = this.zze;
        this.zzh = i7 + 8;
        return ((bArr[i7 + 7] & 255) << 56) | (bArr[i7] & 255) | ((bArr[i7 + 1] & 255) << 8) | ((bArr[i7 + 2] & 255) << 16) | ((bArr[i7 + 3] & 255) << 24) | ((bArr[i7 + 4] & 255) << 32) | ((bArr[i7 + 5] & 255) << 40) | ((bArr[i7 + 6] & 255) << 48);
    }

    private final long zzac() {
        long j;
        long j10;
        long j11;
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
                this.zzh = i12;
                return j;
            }
        }
        return zzm();
    }

    private final void zzad() {
        int i7 = this.zzf + this.zzg;
        this.zzf = i7;
        int i10 = this.zzj + i7;
        int i11 = this.zzk;
        if (i10 <= i11) {
            this.zzg = 0;
            return;
        }
        int i12 = i10 - i11;
        this.zzg = i12;
        this.zzf = i7 - i12;
    }

    private final List<byte[]> zzf(int i7) {
        ArrayList arrayList = new ArrayList();
        while (i7 > 0) {
            int min = Math.min(i7, 4096);
            byte[] bArr = new byte[min];
            int i10 = 0;
            while (i10 < min) {
                int read = this.zzd.read(bArr, i10, min - i10);
                if (read == -1) {
                    throw zzalf.zzj();
                }
                this.zzj += read;
                i10 += read;
            }
            i7 -= min;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    private final void zzg(int i7) {
        if (zzi(i7)) {
            return;
        }
        if (i7 <= (this.zzb - this.zzj) - this.zzh) {
            throw zzalf.zzj();
        }
        throw zzalf.zzi();
    }

    private final void zzh(int i7) {
        int i10 = this.zzf;
        int i11 = this.zzh;
        if (i7 <= i10 - i11 && i7 >= 0) {
            this.zzh = i11 + i7;
            return;
        }
        if (i7 < 0) {
            throw zzalf.zzf();
        }
        int i12 = this.zzj;
        int i13 = i12 + i11 + i7;
        int i14 = this.zzk;
        if (i13 > i14) {
            zzh((i14 - i12) - i11);
            throw zzalf.zzj();
        }
        this.zzj = i12 + i11;
        int i15 = i10 - i11;
        this.zzf = 0;
        this.zzh = 0;
        while (i15 < i7) {
            try {
                long j = i7 - i15;
                long zza = zza(this.zzd, j);
                if (zza >= 0 && zza <= j) {
                    if (zza == 0) {
                        break;
                    } else {
                        i15 += (int) zza;
                    }
                } else {
                    throw new IllegalStateException(String.valueOf(this.zzd.getClass()) + "#skip returned invalid result: " + zza + "\nThe InputStream implementation is buggy.");
                }
            } finally {
                this.zzj += i15;
                zzad();
            }
        }
        if (i15 >= i7) {
            return;
        }
        int i16 = this.zzf;
        int i17 = i16 - this.zzh;
        this.zzh = i16;
        zzg(1);
        while (true) {
            int i18 = i7 - i17;
            int i19 = this.zzf;
            if (i18 <= i19) {
                this.zzh = i18;
                return;
            } else {
                i17 += i19;
                this.zzh = i19;
                zzg(1);
            }
        }
    }

    private final boolean zzi(int i7) {
        do {
            int i10 = this.zzh;
            int i11 = i10 + i7;
            int i12 = this.zzf;
            if (i11 <= i12) {
                throw new IllegalStateException(c.f(i7, "refillBuffer() called when ", " bytes were already available in buffer"));
            }
            int i13 = this.zzb;
            int i14 = this.zzj;
            if (i7 > (i13 - i14) - i10 || i14 + i10 + i7 > this.zzk) {
                return false;
            }
            if (i10 > 0) {
                if (i12 > i10) {
                    byte[] bArr = this.zze;
                    System.arraycopy(bArr, i10, bArr, 0, i12 - i10);
                }
                this.zzj += i10;
                this.zzf -= i10;
                this.zzh = 0;
            }
            InputStream inputStream = this.zzd;
            byte[] bArr2 = this.zze;
            int i15 = this.zzf;
            int zza = zza(inputStream, bArr2, i15, Math.min(bArr2.length - i15, (this.zzb - this.zzj) - i15));
            if (zza == 0 || zza < -1 || zza > this.zze.length) {
                throw new IllegalStateException(String.valueOf(this.zzd.getClass()) + "#read(byte[]) returned invalid result: " + zza + "\nThe InputStream implementation is buggy.");
            }
            if (zza <= 0) {
                return false;
            }
            this.zzf += zza;
            zzad();
        } while (this.zzf < i7);
        return true;
    }

    private final byte[] zzj(int i7) {
        if (i7 == 0) {
            return zzalb.zzb;
        }
        if (i7 < 0) {
            throw zzalf.zzf();
        }
        int i10 = this.zzj;
        int i11 = this.zzh;
        int i12 = i10 + i11 + i7;
        if (i12 - this.zzb > 0) {
            throw zzalf.zzi();
        }
        int i13 = this.zzk;
        if (i12 > i13) {
            zzh((i13 - i10) - i11);
            throw zzalf.zzj();
        }
        int i14 = this.zzf - i11;
        int i15 = i7 - i14;
        if (i15 >= 4096 && i15 > zza(this.zzd)) {
            return null;
        }
        byte[] bArr = new byte[i7];
        System.arraycopy(this.zze, this.zzh, bArr, 0, i14);
        this.zzj += this.zzf;
        this.zzh = 0;
        this.zzf = 0;
        while (i14 < i7) {
            int zza = zza(this.zzd, bArr, i14, i7 - i14);
            if (zza == -1) {
                throw zzalf.zzj();
            }
            this.zzj += zza;
            i14 += zza;
        }
        return bArr;
    }

    private final byte zzy() {
        if (this.zzh == this.zzf) {
            zzg(1);
        }
        byte[] bArr = this.zze;
        int i7 = this.zzh;
        this.zzh = i7 + 1;
        return bArr[i7];
    }

    private final int zzz() {
        int i7 = this.zzh;
        if (this.zzf - i7 < 4) {
            zzg(4);
            i7 = this.zzh;
        }
        byte[] bArr = this.zze;
        this.zzh = i7 + 4;
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
        int i10 = this.zzj + this.zzh + i7;
        if (i10 < 0) {
            throw zzalf.zzi();
        }
        int i11 = this.zzk;
        if (i10 > i11) {
            throw zzalf.zzj();
        }
        this.zzk = i10;
        zzad();
        return i11;
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
        return this.zzj + this.zzh;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakb
    public final void zzc(int i7) {
        this.zzk = i7;
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
            if (this.zzf - this.zzh < 10) {
                while (i11 < 10) {
                    if (zzy() < 0) {
                        i11++;
                    }
                }
                throw zzalf.zze();
            }
            while (i11 < 10) {
                byte[] bArr = this.zze;
                int i12 = this.zzh;
                this.zzh = i12 + 1;
                if (bArr[i12] < 0) {
                    i11++;
                }
            }
            throw zzalf.zze();
            return true;
        }
        if (i10 == 1) {
            zzh(8);
            return true;
        }
        if (i10 == 2) {
            zzh(zzaa());
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
        zzh(4);
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
        int zzaa = zzaa();
        int i7 = this.zzf;
        int i10 = this.zzh;
        if (zzaa <= i7 - i10 && zzaa > 0) {
            zzajp zza = zzajp.zza(this.zze, i10, zzaa);
            this.zzh += zzaa;
            return zza;
        }
        if (zzaa == 0) {
            return zzajp.zza;
        }
        if (zzaa < 0) {
            throw zzalf.zzf();
        }
        byte[] zzj = zzj(zzaa);
        if (zzj != null) {
            return zzajp.zza(zzj);
        }
        int i11 = this.zzh;
        int i12 = this.zzf;
        int i13 = i12 - i11;
        this.zzj += i12;
        this.zzh = 0;
        this.zzf = 0;
        List<byte[]> zzf = zzf(zzaa - i13);
        byte[] bArr = new byte[zzaa];
        System.arraycopy(this.zze, i11, bArr, 0, i13);
        for (byte[] bArr2 : zzf) {
            System.arraycopy(bArr2, 0, bArr, i13, bArr2.length);
            i13 += bArr2.length;
        }
        return zzajp.zzb(bArr);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakb
    public final String zzr() {
        int zzaa = zzaa();
        if (zzaa > 0) {
            int i7 = this.zzf;
            int i10 = this.zzh;
            if (zzaa <= i7 - i10) {
                String str = new String(this.zze, i10, zzaa, zzalb.zza);
                this.zzh += zzaa;
                return str;
            }
        }
        if (zzaa == 0) {
            return "";
        }
        if (zzaa < 0) {
            throw zzalf.zzf();
        }
        if (zzaa > this.zzf) {
            return new String(zza(zzaa, false), zzalb.zza);
        }
        zzg(zzaa);
        String str2 = new String(this.zze, this.zzh, zzaa, zzalb.zza);
        this.zzh += zzaa;
        return str2;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakb
    public final String zzs() {
        byte[] zza;
        int zzaa = zzaa();
        int i7 = this.zzh;
        int i10 = this.zzf;
        if (zzaa <= i10 - i7 && zzaa > 0) {
            zza = this.zze;
            this.zzh = i7 + zzaa;
        } else {
            if (zzaa == 0) {
                return "";
            }
            if (zzaa < 0) {
                throw zzalf.zzf();
            }
            i7 = 0;
            if (zzaa <= i10) {
                zzg(zzaa);
                zza = this.zze;
                this.zzh = zzaa;
            } else {
                zza = zza(zzaa, false);
            }
        }
        return zzant.zzb(zza, i7, zzaa);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakb
    public final boolean zzt() {
        return this.zzh == this.zzf && !zzi(1);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakb
    public final boolean zzu() {
        return zzac() != 0;
    }
}
