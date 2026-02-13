package com.google.android.gms.internal.auth;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzdu {
    public static int zza(byte[] bArr, int i7, zzdt zzdtVar) {
        int zzh = zzh(bArr, i7, zzdtVar);
        int i10 = zzdtVar.zza;
        if (i10 < 0) {
            throw zzfb.zzc();
        }
        if (i10 > bArr.length - zzh) {
            throw zzfb.zzf();
        }
        if (i10 == 0) {
            zzdtVar.zzc = zzef.zzb;
            return zzh;
        }
        zzdtVar.zzc = zzef.zzk(bArr, zzh, i10);
        return zzh + i10;
    }

    public static int zzb(byte[] bArr, int i7) {
        int i10 = bArr[i7] & 255;
        int i11 = bArr[i7 + 1] & 255;
        int i12 = bArr[i7 + 2] & 255;
        return ((bArr[i7 + 3] & 255) << 24) | (i11 << 8) | i10 | (i12 << 16);
    }

    public static int zzc(zzgi zzgiVar, byte[] bArr, int i7, int i10, int i11, zzdt zzdtVar) {
        Object zzd = zzgiVar.zzd();
        int zzl = zzl(zzd, zzgiVar, bArr, i7, i10, i11, zzdtVar);
        zzgiVar.zze(zzd);
        zzdtVar.zzc = zzd;
        return zzl;
    }

    public static int zzd(zzgi zzgiVar, byte[] bArr, int i7, int i10, zzdt zzdtVar) {
        Object zzd = zzgiVar.zzd();
        int zzm = zzm(zzd, zzgiVar, bArr, i7, i10, zzdtVar);
        zzgiVar.zze(zzd);
        zzdtVar.zzc = zzd;
        return zzm;
    }

    public static int zze(zzgi zzgiVar, int i7, byte[] bArr, int i10, int i11, zzez zzezVar, zzdt zzdtVar) {
        int zzd = zzd(zzgiVar, bArr, i10, i11, zzdtVar);
        zzezVar.add(zzdtVar.zzc);
        while (zzd < i11) {
            int zzh = zzh(bArr, zzd, zzdtVar);
            if (i7 != zzdtVar.zza) {
                break;
            }
            zzd = zzd(zzgiVar, bArr, zzh, i11, zzdtVar);
            zzezVar.add(zzdtVar.zzc);
        }
        return zzd;
    }

    public static int zzf(byte[] bArr, int i7, zzez zzezVar, zzdt zzdtVar) {
        zzew zzewVar = (zzew) zzezVar;
        int zzh = zzh(bArr, i7, zzdtVar);
        int i10 = zzdtVar.zza + zzh;
        while (zzh < i10) {
            zzh = zzh(bArr, zzh, zzdtVar);
            zzewVar.zze(zzdtVar.zza);
        }
        if (zzh == i10) {
            return zzh;
        }
        throw zzfb.zzf();
    }

    public static int zzg(int i7, byte[] bArr, int i10, int i11, zzha zzhaVar, zzdt zzdtVar) {
        if ((i7 >>> 3) == 0) {
            throw zzfb.zza();
        }
        int i12 = i7 & 7;
        if (i12 == 0) {
            int zzk = zzk(bArr, i10, zzdtVar);
            zzhaVar.zzh(i7, Long.valueOf(zzdtVar.zzb));
            return zzk;
        }
        if (i12 == 1) {
            zzhaVar.zzh(i7, Long.valueOf(zzn(bArr, i10)));
            return i10 + 8;
        }
        if (i12 == 2) {
            int zzh = zzh(bArr, i10, zzdtVar);
            int i13 = zzdtVar.zza;
            if (i13 < 0) {
                throw zzfb.zzc();
            }
            if (i13 > bArr.length - zzh) {
                throw zzfb.zzf();
            }
            if (i13 == 0) {
                zzhaVar.zzh(i7, zzef.zzb);
            } else {
                zzhaVar.zzh(i7, zzef.zzk(bArr, zzh, i13));
            }
            return zzh + i13;
        }
        if (i12 != 3) {
            if (i12 != 5) {
                throw zzfb.zza();
            }
            zzhaVar.zzh(i7, Integer.valueOf(zzb(bArr, i10)));
            return i10 + 4;
        }
        int i14 = (i7 & (-8)) | 4;
        zzha zzd = zzha.zzd();
        int i15 = 0;
        while (true) {
            if (i10 >= i11) {
                break;
            }
            int zzh2 = zzh(bArr, i10, zzdtVar);
            int i16 = zzdtVar.zza;
            i15 = i16;
            if (i16 == i14) {
                i10 = zzh2;
                break;
            }
            int zzg = zzg(i15, bArr, zzh2, i11, zzd, zzdtVar);
            i15 = i16;
            i10 = zzg;
        }
        if (i10 > i11 || i15 != i14) {
            throw zzfb.zzd();
        }
        zzhaVar.zzh(i7, zzd);
        return i10;
    }

    public static int zzh(byte[] bArr, int i7, zzdt zzdtVar) {
        int i10 = i7 + 1;
        byte b2 = bArr[i7];
        if (b2 < 0) {
            return zzi(b2, bArr, i10, zzdtVar);
        }
        zzdtVar.zza = b2;
        return i10;
    }

    public static int zzi(int i7, byte[] bArr, int i10, zzdt zzdtVar) {
        byte b2 = bArr[i10];
        int i11 = i10 + 1;
        int i12 = i7 & 127;
        if (b2 >= 0) {
            zzdtVar.zza = i12 | (b2 << 7);
            return i11;
        }
        int i13 = i12 | ((b2 & Byte.MAX_VALUE) << 7);
        int i14 = i10 + 2;
        byte b10 = bArr[i11];
        if (b10 >= 0) {
            zzdtVar.zza = i13 | (b10 << 14);
            return i14;
        }
        int i15 = i13 | ((b10 & Byte.MAX_VALUE) << 14);
        int i16 = i10 + 3;
        byte b11 = bArr[i14];
        if (b11 >= 0) {
            zzdtVar.zza = i15 | (b11 << 21);
            return i16;
        }
        int i17 = i15 | ((b11 & Byte.MAX_VALUE) << 21);
        int i18 = i10 + 4;
        byte b12 = bArr[i16];
        if (b12 >= 0) {
            zzdtVar.zza = i17 | (b12 << 28);
            return i18;
        }
        int i19 = i17 | ((b12 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i20 = i18 + 1;
            if (bArr[i18] >= 0) {
                zzdtVar.zza = i19;
                return i20;
            }
            i18 = i20;
        }
    }

    public static int zzj(int i7, byte[] bArr, int i10, int i11, zzez zzezVar, zzdt zzdtVar) {
        zzew zzewVar = (zzew) zzezVar;
        int zzh = zzh(bArr, i10, zzdtVar);
        zzewVar.zze(zzdtVar.zza);
        while (zzh < i11) {
            int zzh2 = zzh(bArr, zzh, zzdtVar);
            if (i7 != zzdtVar.zza) {
                break;
            }
            zzh = zzh(bArr, zzh2, zzdtVar);
            zzewVar.zze(zzdtVar.zza);
        }
        return zzh;
    }

    public static int zzk(byte[] bArr, int i7, zzdt zzdtVar) {
        long j = bArr[i7];
        int i10 = i7 + 1;
        if (j >= 0) {
            zzdtVar.zzb = j;
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
        zzdtVar.zzb = j10;
        return i11;
    }

    public static int zzl(Object obj, zzgi zzgiVar, byte[] bArr, int i7, int i10, int i11, zzdt zzdtVar) {
        int zzb = ((zzga) zzgiVar).zzb(obj, bArr, i7, i10, i11, zzdtVar);
        zzdtVar.zzc = obj;
        return zzb;
    }

    public static int zzm(Object obj, zzgi zzgiVar, byte[] bArr, int i7, int i10, zzdt zzdtVar) {
        int i11 = i7 + 1;
        int i12 = bArr[i7];
        if (i12 < 0) {
            i11 = zzi(i12, bArr, i11, zzdtVar);
            i12 = zzdtVar.zza;
        }
        int i13 = i11;
        if (i12 < 0 || i12 > i10 - i13) {
            throw zzfb.zzf();
        }
        int i14 = i12 + i13;
        zzgiVar.zzg(obj, bArr, i13, i14, zzdtVar);
        zzdtVar.zzc = obj;
        return i14;
    }

    public static long zzn(byte[] bArr, int i7) {
        return (bArr[i7] & 255) | ((bArr[i7 + 1] & 255) << 8) | ((bArr[i7 + 2] & 255) << 16) | ((bArr[i7 + 3] & 255) << 24) | ((bArr[i7 + 4] & 255) << 32) | ((bArr[i7 + 5] & 255) << 40) | ((bArr[i7 + 6] & 255) << 48) | ((bArr[i7 + 7] & 255) << 56);
    }
}
