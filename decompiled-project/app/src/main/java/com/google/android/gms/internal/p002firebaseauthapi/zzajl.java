package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzaky;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzajl {
    private static volatile int zza = 100;

    public static double zza(byte[] bArr, int i7) {
        return Double.longBitsToDouble(zzd(bArr, i7));
    }

    public static int zza(int i7, byte[] bArr, int i10, int i11, zzajk zzajkVar) {
        if ((i7 >>> 3) == 0) {
            throw zzalf.zzc();
        }
        int i12 = i7 & 7;
        if (i12 == 0) {
            return zzd(bArr, i10, zzajkVar);
        }
        if (i12 == 1) {
            return i10 + 8;
        }
        if (i12 == 2) {
            return zzc(bArr, i10, zzajkVar) + zzajkVar.zza;
        }
        if (i12 != 3) {
            if (i12 == 5) {
                return i10 + 4;
            }
            throw zzalf.zzc();
        }
        int i13 = (i7 & (-8)) | 4;
        int i14 = 0;
        while (i10 < i11) {
            i10 = zzc(bArr, i10, zzajkVar);
            i14 = zzajkVar.zza;
            if (i14 == i13) {
                break;
            }
            i10 = zza(i14, bArr, i10, i11, zzajkVar);
        }
        if (i10 > i11 || i14 != i13) {
            throw zzalf.zzg();
        }
        return i10;
    }

    public static int zza(int i7, byte[] bArr, int i10, int i11, zzalc<?> zzalcVar, zzajk zzajkVar) {
        zzakz zzakzVar = (zzakz) zzalcVar;
        int zzc = zzc(bArr, i10, zzajkVar);
        zzakzVar.zzc(zzajkVar.zza);
        while (zzc < i11) {
            int zzc2 = zzc(bArr, zzc, zzajkVar);
            if (i7 != zzajkVar.zza) {
                break;
            }
            zzc = zzc(bArr, zzc2, zzajkVar);
            zzakzVar.zzc(zzajkVar.zza);
        }
        return zzc;
    }

    public static int zza(int i7, byte[] bArr, int i10, int i11, zzann zzannVar, zzajk zzajkVar) {
        if ((i7 >>> 3) == 0) {
            throw zzalf.zzc();
        }
        int i12 = i7 & 7;
        if (i12 == 0) {
            int zzd = zzd(bArr, i10, zzajkVar);
            zzannVar.zza(i7, Long.valueOf(zzajkVar.zzb));
            return zzd;
        }
        if (i12 == 1) {
            zzannVar.zza(i7, Long.valueOf(zzd(bArr, i10)));
            return i10 + 8;
        }
        if (i12 == 2) {
            int zzc = zzc(bArr, i10, zzajkVar);
            int i13 = zzajkVar.zza;
            if (i13 < 0) {
                throw zzalf.zzf();
            }
            if (i13 > bArr.length - zzc) {
                throw zzalf.zzj();
            }
            if (i13 == 0) {
                zzannVar.zza(i7, zzajp.zza);
            } else {
                zzannVar.zza(i7, zzajp.zza(bArr, zzc, i13));
            }
            return zzc + i13;
        }
        if (i12 != 3) {
            if (i12 != 5) {
                throw zzalf.zzc();
            }
            zzannVar.zza(i7, Integer.valueOf(zzc(bArr, i10)));
            return i10 + 4;
        }
        zzann zzd2 = zzann.zzd();
        int i14 = (i7 & (-8)) | 4;
        int i15 = zzajkVar.zze + 1;
        zzajkVar.zze = i15;
        zza(i15);
        int i16 = 0;
        while (true) {
            if (i10 >= i11) {
                break;
            }
            int zzc2 = zzc(bArr, i10, zzajkVar);
            int i17 = zzajkVar.zza;
            i16 = i17;
            if (i17 == i14) {
                i10 = zzc2;
                break;
            }
            int zza2 = zza(i16, bArr, zzc2, i11, zzd2, zzajkVar);
            i16 = i17;
            i10 = zza2;
        }
        zzajkVar.zze--;
        if (i10 > i11 || i16 != i14) {
            throw zzalf.zzg();
        }
        zzannVar.zza(i7, zzd2);
        return i10;
    }

    public static int zza(int i7, byte[] bArr, int i10, int i11, Object obj, zzamc zzamcVar, zzano<zzann, zzann> zzanoVar, zzajk zzajkVar) {
        if (zzajkVar.zzd.zza(zzamcVar, i7 >>> 3) == null) {
            return zza(i7, bArr, i10, i11, zzamg.zzc(obj), zzajkVar);
        }
        zzaky.zzb zzbVar = (zzaky.zzb) obj;
        zzbVar.zza();
        zzakr<zzaky.zze> zzakrVar = zzbVar.zzc;
        throw new NoSuchMethodError();
    }

    public static int zza(int i7, byte[] bArr, int i10, zzajk zzajkVar) {
        int i11 = i7 & 127;
        int i12 = i10 + 1;
        byte b2 = bArr[i10];
        if (b2 >= 0) {
            zzajkVar.zza = i11 | (b2 << 7);
            return i12;
        }
        int i13 = i11 | ((b2 & Byte.MAX_VALUE) << 7);
        int i14 = i10 + 2;
        byte b10 = bArr[i12];
        if (b10 >= 0) {
            zzajkVar.zza = i13 | (b10 << 14);
            return i14;
        }
        int i15 = i13 | ((b10 & Byte.MAX_VALUE) << 14);
        int i16 = i10 + 3;
        byte b11 = bArr[i14];
        if (b11 >= 0) {
            zzajkVar.zza = i15 | (b11 << 21);
            return i16;
        }
        int i17 = i15 | ((b11 & Byte.MAX_VALUE) << 21);
        int i18 = i10 + 4;
        byte b12 = bArr[i16];
        if (b12 >= 0) {
            zzajkVar.zza = i17 | (b12 << 28);
            return i18;
        }
        int i19 = i17 | ((b12 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i20 = i18 + 1;
            if (bArr[i18] >= 0) {
                zzajkVar.zza = i19;
                return i20;
            }
            i18 = i20;
        }
    }

    public static int zza(zzamv<?> zzamvVar, int i7, byte[] bArr, int i10, int i11, zzalc<Object> zzalcVar, zzajk zzajkVar) {
        int i12 = (i7 & (-8)) | 4;
        int zza2 = zza(zzamvVar, bArr, i10, i11, i12, zzajkVar);
        zzalcVar.add(zzajkVar.zzc);
        while (zza2 < i11) {
            int zzc = zzc(bArr, zza2, zzajkVar);
            if (i7 != zzajkVar.zza) {
                break;
            }
            zza2 = zza(zzamvVar, bArr, zzc, i11, i12, zzajkVar);
            zzalcVar.add(zzajkVar.zzc);
        }
        return zza2;
    }

    private static <T> int zza(zzamv<T> zzamvVar, byte[] bArr, int i7, int i10, int i11, zzajk zzajkVar) {
        T zza2 = zzamvVar.zza();
        int zza3 = zza(zza2, zzamvVar, bArr, i7, i10, i11, zzajkVar);
        zzamvVar.zzd(zza2);
        zzajkVar.zzc = zza2;
        return zza3;
    }

    public static <T> int zza(zzamv<T> zzamvVar, byte[] bArr, int i7, int i10, zzajk zzajkVar) {
        T zza2 = zzamvVar.zza();
        int zza3 = zza(zza2, zzamvVar, bArr, i7, i10, zzajkVar);
        zzamvVar.zzd(zza2);
        zzajkVar.zzc = zza2;
        return zza3;
    }

    public static <T> int zza(Object obj, zzamv<T> zzamvVar, byte[] bArr, int i7, int i10, int i11, zzajk zzajkVar) {
        zzamg zzamgVar = (zzamg) zzamvVar;
        int i12 = zzajkVar.zze + 1;
        zzajkVar.zze = i12;
        zza(i12);
        int zza2 = zzamgVar.zza((zzamg) obj, bArr, i7, i10, i11, zzajkVar);
        zzajkVar.zze--;
        zzajkVar.zzc = obj;
        return zza2;
    }

    public static <T> int zza(Object obj, zzamv<T> zzamvVar, byte[] bArr, int i7, int i10, zzajk zzajkVar) {
        int i11 = i7 + 1;
        int i12 = bArr[i7];
        if (i12 < 0) {
            i11 = zza(i12, bArr, i11, zzajkVar);
            i12 = zzajkVar.zza;
        }
        int i13 = i11;
        if (i12 < 0 || i12 > i10 - i13) {
            throw zzalf.zzj();
        }
        int i14 = zzajkVar.zze + 1;
        zzajkVar.zze = i14;
        zza(i14);
        int i15 = i12 + i13;
        zzamvVar.zza(obj, bArr, i13, i15, zzajkVar);
        zzajkVar.zze--;
        zzajkVar.zzc = obj;
        return i15;
    }

    public static int zza(byte[] bArr, int i7, zzajk zzajkVar) {
        int zzc = zzc(bArr, i7, zzajkVar);
        int i10 = zzajkVar.zza;
        if (i10 < 0) {
            throw zzalf.zzf();
        }
        if (i10 > bArr.length - zzc) {
            throw zzalf.zzj();
        }
        if (i10 == 0) {
            zzajkVar.zzc = zzajp.zza;
            return zzc;
        }
        zzajkVar.zzc = zzajp.zza(bArr, zzc, i10);
        return zzc + i10;
    }

    public static int zza(byte[] bArr, int i7, zzalc<?> zzalcVar, zzajk zzajkVar) {
        zzakz zzakzVar = (zzakz) zzalcVar;
        int zzc = zzc(bArr, i7, zzajkVar);
        int i10 = zzajkVar.zza + zzc;
        while (zzc < i10) {
            zzc = zzc(bArr, zzc, zzajkVar);
            zzakzVar.zzc(zzajkVar.zza);
        }
        if (zzc == i10) {
            return zzc;
        }
        throw zzalf.zzj();
    }

    private static void zza(int i7) {
        if (i7 >= zza) {
            throw zzalf.zzh();
        }
    }

    public static float zzb(byte[] bArr, int i7) {
        return Float.intBitsToFloat(zzc(bArr, i7));
    }

    public static int zzb(zzamv<?> zzamvVar, int i7, byte[] bArr, int i10, int i11, zzalc<?> zzalcVar, zzajk zzajkVar) {
        int zza2 = zza(zzamvVar, bArr, i10, i11, zzajkVar);
        zzalcVar.add(zzajkVar.zzc);
        while (zza2 < i11) {
            int zzc = zzc(bArr, zza2, zzajkVar);
            if (i7 != zzajkVar.zza) {
                break;
            }
            zza2 = zza(zzamvVar, bArr, zzc, i11, zzajkVar);
            zzalcVar.add(zzajkVar.zzc);
        }
        return zza2;
    }

    public static int zzb(byte[] bArr, int i7, zzajk zzajkVar) {
        int zzc = zzc(bArr, i7, zzajkVar);
        int i10 = zzajkVar.zza;
        if (i10 < 0) {
            throw zzalf.zzf();
        }
        if (i10 == 0) {
            zzajkVar.zzc = "";
            return zzc;
        }
        zzajkVar.zzc = zzant.zzb(bArr, zzc, i10);
        return zzc + i10;
    }

    public static int zzc(byte[] bArr, int i7) {
        return ((bArr[i7 + 3] & 255) << 24) | (bArr[i7] & 255) | ((bArr[i7 + 1] & 255) << 8) | ((bArr[i7 + 2] & 255) << 16);
    }

    public static int zzc(byte[] bArr, int i7, zzajk zzajkVar) {
        int i10 = i7 + 1;
        byte b2 = bArr[i7];
        if (b2 < 0) {
            return zza(b2, bArr, i10, zzajkVar);
        }
        zzajkVar.zza = b2;
        return i10;
    }

    public static int zzd(byte[] bArr, int i7, zzajk zzajkVar) {
        int i10 = i7 + 1;
        long j = bArr[i7];
        if (j >= 0) {
            zzajkVar.zzb = j;
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
        zzajkVar.zzb = j10;
        return i11;
    }

    public static long zzd(byte[] bArr, int i7) {
        return ((bArr[i7 + 7] & 255) << 56) | (bArr[i7] & 255) | ((bArr[i7 + 1] & 255) << 8) | ((bArr[i7 + 2] & 255) << 16) | ((bArr[i7 + 3] & 255) << 24) | ((bArr[i7 + 4] & 255) << 32) | ((bArr[i7 + 5] & 255) << 40) | ((bArr[i7 + 6] & 255) << 48);
    }
}
