package com.google.android.gms.internal.pal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzabm {
    public static int zza(byte[] bArr, int i7, zzabl zzablVar) {
        int zzj = zzj(bArr, i7, zzablVar);
        int i10 = zzablVar.zza;
        if (i10 < 0) {
            throw zzadi.zzf();
        }
        if (i10 > bArr.length - zzj) {
            throw zzadi.zzi();
        }
        if (i10 == 0) {
            zzablVar.zzc = zzaby.zzb;
            return zzj;
        }
        zzablVar.zzc = zzaby.zzo(bArr, zzj, i10);
        return zzj + i10;
    }

    public static int zzb(byte[] bArr, int i7) {
        return ((bArr[i7 + 3] & 255) << 24) | (bArr[i7] & 255) | ((bArr[i7 + 1] & 255) << 8) | ((bArr[i7 + 2] & 255) << 16);
    }

    public static int zzc(zzaer zzaerVar, byte[] bArr, int i7, int i10, int i11, zzabl zzablVar) {
        zzaei zzaeiVar = (zzaei) zzaerVar;
        Object zze = zzaeiVar.zze();
        int zzc = zzaeiVar.zzc(zze, bArr, i7, i10, i11, zzablVar);
        zzaeiVar.zzf(zze);
        zzablVar.zzc = zze;
        return zzc;
    }

    public static int zzd(zzaer zzaerVar, byte[] bArr, int i7, int i10, zzabl zzablVar) {
        int i11 = i7 + 1;
        int i12 = bArr[i7];
        if (i12 < 0) {
            i11 = zzk(i12, bArr, i11, zzablVar);
            i12 = zzablVar.zza;
        }
        int i13 = i11;
        if (i12 < 0 || i12 > i10 - i13) {
            throw zzadi.zzi();
        }
        Object zze = zzaerVar.zze();
        int i14 = i12 + i13;
        zzaerVar.zzi(zze, bArr, i13, i14, zzablVar);
        zzaerVar.zzf(zze);
        zzablVar.zzc = zze;
        return i14;
    }

    public static int zze(zzaer zzaerVar, int i7, byte[] bArr, int i10, int i11, zzadf zzadfVar, zzabl zzablVar) {
        int zzd = zzd(zzaerVar, bArr, i10, i11, zzablVar);
        zzadfVar.add(zzablVar.zzc);
        while (zzd < i11) {
            int zzj = zzj(bArr, zzd, zzablVar);
            if (i7 != zzablVar.zza) {
                break;
            }
            zzd = zzd(zzaerVar, bArr, zzj, i11, zzablVar);
            zzadfVar.add(zzablVar.zzc);
        }
        return zzd;
    }

    public static int zzf(byte[] bArr, int i7, zzadf zzadfVar, zzabl zzablVar) {
        zzada zzadaVar = (zzada) zzadfVar;
        int zzj = zzj(bArr, i7, zzablVar);
        int i10 = zzablVar.zza + zzj;
        while (zzj < i10) {
            zzj = zzj(bArr, zzj, zzablVar);
            zzadaVar.zzg(zzablVar.zza);
        }
        if (zzj == i10) {
            return zzj;
        }
        throw zzadi.zzi();
    }

    public static int zzg(byte[] bArr, int i7, zzabl zzablVar) {
        int zzj = zzj(bArr, i7, zzablVar);
        int i10 = zzablVar.zza;
        if (i10 < 0) {
            throw zzadi.zzf();
        }
        if (i10 == 0) {
            zzablVar.zzc = "";
            return zzj;
        }
        zzablVar.zzc = new String(bArr, zzj, i10, zzadg.zzb);
        return zzj + i10;
    }

    public static int zzh(byte[] bArr, int i7, zzabl zzablVar) {
        int zzj = zzj(bArr, i7, zzablVar);
        int i10 = zzablVar.zza;
        if (i10 < 0) {
            throw zzadi.zzf();
        }
        if (i10 == 0) {
            zzablVar.zzc = "";
            return zzj;
        }
        zzablVar.zzc = zzafx.zzd(bArr, zzj, i10);
        return zzj + i10;
    }

    public static int zzi(int i7, byte[] bArr, int i10, int i11, zzafj zzafjVar, zzabl zzablVar) {
        if ((i7 >>> 3) == 0) {
            throw zzadi.zzc();
        }
        int i12 = i7 & 7;
        if (i12 == 0) {
            int zzm = zzm(bArr, i10, zzablVar);
            zzafjVar.zzh(i7, Long.valueOf(zzablVar.zzb));
            return zzm;
        }
        if (i12 == 1) {
            zzafjVar.zzh(i7, Long.valueOf(zzn(bArr, i10)));
            return i10 + 8;
        }
        if (i12 == 2) {
            int zzj = zzj(bArr, i10, zzablVar);
            int i13 = zzablVar.zza;
            if (i13 < 0) {
                throw zzadi.zzf();
            }
            if (i13 > bArr.length - zzj) {
                throw zzadi.zzi();
            }
            if (i13 == 0) {
                zzafjVar.zzh(i7, zzaby.zzb);
            } else {
                zzafjVar.zzh(i7, zzaby.zzo(bArr, zzj, i13));
            }
            return zzj + i13;
        }
        if (i12 != 3) {
            if (i12 != 5) {
                throw zzadi.zzc();
            }
            zzafjVar.zzh(i7, Integer.valueOf(zzb(bArr, i10)));
            return i10 + 4;
        }
        int i14 = (i7 & (-8)) | 4;
        zzafj zze = zzafj.zze();
        int i15 = 0;
        while (true) {
            if (i10 >= i11) {
                break;
            }
            int zzj2 = zzj(bArr, i10, zzablVar);
            int i16 = zzablVar.zza;
            if (i16 == i14) {
                i15 = i16;
                i10 = zzj2;
                break;
            }
            i15 = i16;
            i10 = zzi(i16, bArr, zzj2, i11, zze, zzablVar);
        }
        if (i10 > i11 || i15 != i14) {
            throw zzadi.zzg();
        }
        zzafjVar.zzh(i7, zze);
        return i10;
    }

    public static int zzj(byte[] bArr, int i7, zzabl zzablVar) {
        int i10 = i7 + 1;
        byte b2 = bArr[i7];
        if (b2 < 0) {
            return zzk(b2, bArr, i10, zzablVar);
        }
        zzablVar.zza = b2;
        return i10;
    }

    public static int zzk(int i7, byte[] bArr, int i10, zzabl zzablVar) {
        int i11 = i7 & 127;
        int i12 = i10 + 1;
        byte b2 = bArr[i10];
        if (b2 >= 0) {
            zzablVar.zza = i11 | (b2 << 7);
            return i12;
        }
        int i13 = i11 | ((b2 & Byte.MAX_VALUE) << 7);
        int i14 = i10 + 2;
        byte b10 = bArr[i12];
        if (b10 >= 0) {
            zzablVar.zza = i13 | (b10 << 14);
            return i14;
        }
        int i15 = i13 | ((b10 & Byte.MAX_VALUE) << 14);
        int i16 = i10 + 3;
        byte b11 = bArr[i14];
        if (b11 >= 0) {
            zzablVar.zza = i15 | (b11 << 21);
            return i16;
        }
        int i17 = i15 | ((b11 & Byte.MAX_VALUE) << 21);
        int i18 = i10 + 4;
        byte b12 = bArr[i16];
        if (b12 >= 0) {
            zzablVar.zza = i17 | (b12 << 28);
            return i18;
        }
        int i19 = i17 | ((b12 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i20 = i18 + 1;
            if (bArr[i18] >= 0) {
                zzablVar.zza = i19;
                return i20;
            }
            i18 = i20;
        }
    }

    public static int zzl(int i7, byte[] bArr, int i10, int i11, zzadf zzadfVar, zzabl zzablVar) {
        zzada zzadaVar = (zzada) zzadfVar;
        int zzj = zzj(bArr, i10, zzablVar);
        zzadaVar.zzg(zzablVar.zza);
        while (zzj < i11) {
            int zzj2 = zzj(bArr, zzj, zzablVar);
            if (i7 != zzablVar.zza) {
                break;
            }
            zzj = zzj(bArr, zzj2, zzablVar);
            zzadaVar.zzg(zzablVar.zza);
        }
        return zzj;
    }

    public static int zzm(byte[] bArr, int i7, zzabl zzablVar) {
        int i10 = i7 + 1;
        long j = bArr[i7];
        if (j >= 0) {
            zzablVar.zzb = j;
            return i10;
        }
        int i11 = i7 + 2;
        byte b2 = bArr[i10];
        long j10 = (j & 127) | ((b2 & Byte.MAX_VALUE) << 7);
        int i12 = 7;
        while (b2 < 0) {
            int i13 = i11 + 1;
            i12 += 7;
            j10 |= (r10 & Byte.MAX_VALUE) << i12;
            b2 = bArr[i11];
            i11 = i13;
        }
        zzablVar.zzb = j10;
        return i11;
    }

    public static long zzn(byte[] bArr, int i7) {
        return ((bArr[i7 + 7] & 255) << 56) | (bArr[i7] & 255) | ((bArr[i7 + 1] & 255) << 8) | ((bArr[i7 + 2] & 255) << 16) | ((bArr[i7 + 3] & 255) << 24) | ((bArr[i7 + 4] & 255) << 32) | ((bArr[i7 + 5] & 255) << 40) | ((bArr[i7 + 6] & 255) << 48);
    }
}
