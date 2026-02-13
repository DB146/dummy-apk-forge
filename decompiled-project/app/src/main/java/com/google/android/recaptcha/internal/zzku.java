package com.google.android.recaptcha.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzku {
    public static final /* synthetic */ int zza = 0;
    private static volatile int zzb = 100;

    public static int zza(byte[] bArr, int i7, zzkt zzktVar) {
        int zzi = zzi(bArr, i7, zzktVar);
        int i10 = zzktVar.zza;
        if (i10 < 0) {
            throw new zznn("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i10 > bArr.length - zzi) {
            throw new zznn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        if (i10 == 0) {
            zzktVar.zzc = zzle.zzb;
            return zzi;
        }
        zzktVar.zzc = zzle.zzk(bArr, zzi, i10);
        return zzi + i10;
    }

    public static int zzb(byte[] bArr, int i7) {
        int i10 = bArr[i7] & 255;
        int i11 = bArr[i7 + 1] & 255;
        int i12 = bArr[i7 + 2] & 255;
        return ((bArr[i7 + 3] & 255) << 24) | (i11 << 8) | i10 | (i12 << 16);
    }

    public static int zzc(zzow zzowVar, byte[] bArr, int i7, int i10, int i11, zzkt zzktVar) {
        Object zze = zzowVar.zze();
        int zzm = zzm(zze, zzowVar, bArr, i7, i10, i11, zzktVar);
        zzowVar.zzf(zze);
        zzktVar.zzc = zze;
        return zzm;
    }

    public static int zzd(zzow zzowVar, byte[] bArr, int i7, int i10, zzkt zzktVar) {
        Object zze = zzowVar.zze();
        int zzn = zzn(zze, zzowVar, bArr, i7, i10, zzktVar);
        zzowVar.zzf(zze);
        zzktVar.zzc = zze;
        return zzn;
    }

    public static int zze(zzow zzowVar, int i7, byte[] bArr, int i10, int i11, zznk zznkVar, zzkt zzktVar) {
        int zzd = zzd(zzowVar, bArr, i10, i11, zzktVar);
        zznkVar.add(zzktVar.zzc);
        while (zzd < i11) {
            int zzi = zzi(bArr, zzd, zzktVar);
            if (i7 != zzktVar.zza) {
                break;
            }
            zzd = zzd(zzowVar, bArr, zzi, i11, zzktVar);
            zznkVar.add(zzktVar.zzc);
        }
        return zzd;
    }

    public static int zzf(byte[] bArr, int i7, zznk zznkVar, zzkt zzktVar) {
        zzne zzneVar = (zzne) zznkVar;
        int zzi = zzi(bArr, i7, zzktVar);
        int i10 = zzktVar.zza + zzi;
        while (zzi < i10) {
            zzi = zzi(bArr, zzi, zzktVar);
            zzneVar.zzh(zzktVar.zza);
        }
        if (zzi == i10) {
            return zzi;
        }
        throw new zznn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public static int zzg(byte[] bArr, int i7, zzkt zzktVar) {
        int zzi = zzi(bArr, i7, zzktVar);
        int i10 = zzktVar.zza;
        if (i10 < 0) {
            throw new zznn("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i10 == 0) {
            zzktVar.zzc = "";
            return zzi;
        }
        zzktVar.zzc = new String(bArr, zzi, i10, zznl.zza);
        return zzi + i10;
    }

    public static int zzh(int i7, byte[] bArr, int i10, int i11, zzpm zzpmVar, zzkt zzktVar) {
        if ((i7 >>> 3) == 0) {
            throw new zznn("Protocol message contained an invalid tag (zero).");
        }
        int i12 = i7 & 7;
        if (i12 == 0) {
            int zzl = zzl(bArr, i10, zzktVar);
            zzpmVar.zzj(i7, Long.valueOf(zzktVar.zzb));
            return zzl;
        }
        if (i12 == 1) {
            zzpmVar.zzj(i7, Long.valueOf(zzp(bArr, i10)));
            return i10 + 8;
        }
        if (i12 == 2) {
            int zzi = zzi(bArr, i10, zzktVar);
            int i13 = zzktVar.zza;
            if (i13 < 0) {
                throw new zznn("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            if (i13 > bArr.length - zzi) {
                throw new zznn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            if (i13 == 0) {
                zzpmVar.zzj(i7, zzle.zzb);
            } else {
                zzpmVar.zzj(i7, zzle.zzk(bArr, zzi, i13));
            }
            return zzi + i13;
        }
        if (i12 != 3) {
            if (i12 != 5) {
                throw new zznn("Protocol message contained an invalid tag (zero).");
            }
            zzpmVar.zzj(i7, Integer.valueOf(zzb(bArr, i10)));
            return i10 + 4;
        }
        int i14 = (i7 & (-8)) | 4;
        zzpm zzf = zzpm.zzf();
        int i15 = zzktVar.zze + 1;
        zzktVar.zze = i15;
        zzq(i15);
        int i16 = 0;
        while (true) {
            if (i10 >= i11) {
                break;
            }
            int zzi2 = zzi(bArr, i10, zzktVar);
            i16 = zzktVar.zza;
            if (i16 == i14) {
                i10 = zzi2;
                break;
            }
            i10 = zzh(i16, bArr, zzi2, i11, zzf, zzktVar);
        }
        zzktVar.zze--;
        if (i10 > i11 || i16 != i14) {
            throw new zznn("Failed to parse the message.");
        }
        zzpmVar.zzj(i7, zzf);
        return i10;
    }

    public static int zzi(byte[] bArr, int i7, zzkt zzktVar) {
        int i10 = i7 + 1;
        byte b2 = bArr[i7];
        if (b2 < 0) {
            return zzj(b2, bArr, i10, zzktVar);
        }
        zzktVar.zza = b2;
        return i10;
    }

    public static int zzj(int i7, byte[] bArr, int i10, zzkt zzktVar) {
        byte b2 = bArr[i10];
        int i11 = i10 + 1;
        int i12 = i7 & 127;
        if (b2 >= 0) {
            zzktVar.zza = i12 | (b2 << 7);
            return i11;
        }
        int i13 = i12 | ((b2 & Byte.MAX_VALUE) << 7);
        int i14 = i10 + 2;
        byte b10 = bArr[i11];
        if (b10 >= 0) {
            zzktVar.zza = i13 | (b10 << 14);
            return i14;
        }
        int i15 = i13 | ((b10 & Byte.MAX_VALUE) << 14);
        int i16 = i10 + 3;
        byte b11 = bArr[i14];
        if (b11 >= 0) {
            zzktVar.zza = i15 | (b11 << 21);
            return i16;
        }
        int i17 = i15 | ((b11 & Byte.MAX_VALUE) << 21);
        int i18 = i10 + 4;
        byte b12 = bArr[i16];
        if (b12 >= 0) {
            zzktVar.zza = i17 | (b12 << 28);
            return i18;
        }
        int i19 = i17 | ((b12 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i20 = i18 + 1;
            if (bArr[i18] >= 0) {
                zzktVar.zza = i19;
                return i20;
            }
            i18 = i20;
        }
    }

    public static int zzk(int i7, byte[] bArr, int i10, int i11, zznk zznkVar, zzkt zzktVar) {
        zzne zzneVar = (zzne) zznkVar;
        int zzi = zzi(bArr, i10, zzktVar);
        zzneVar.zzh(zzktVar.zza);
        while (zzi < i11) {
            int zzi2 = zzi(bArr, zzi, zzktVar);
            if (i7 != zzktVar.zza) {
                break;
            }
            zzi = zzi(bArr, zzi2, zzktVar);
            zzneVar.zzh(zzktVar.zza);
        }
        return zzi;
    }

    public static int zzl(byte[] bArr, int i7, zzkt zzktVar) {
        long j = bArr[i7];
        int i10 = i7 + 1;
        if (j >= 0) {
            zzktVar.zzb = j;
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
        zzktVar.zzb = j10;
        return i11;
    }

    public static int zzm(Object obj, zzow zzowVar, byte[] bArr, int i7, int i10, int i11, zzkt zzktVar) {
        zzol zzolVar = (zzol) zzowVar;
        int i12 = zzktVar.zze + 1;
        zzktVar.zze = i12;
        zzq(i12);
        int zzc = zzolVar.zzc(obj, bArr, i7, i10, i11, zzktVar);
        zzktVar.zze--;
        zzktVar.zzc = obj;
        return zzc;
    }

    public static int zzn(Object obj, zzow zzowVar, byte[] bArr, int i7, int i10, zzkt zzktVar) {
        int i11 = i7 + 1;
        int i12 = bArr[i7];
        if (i12 < 0) {
            i11 = zzj(i12, bArr, i11, zzktVar);
            i12 = zzktVar.zza;
        }
        int i13 = i11;
        if (i12 < 0 || i12 > i10 - i13) {
            throw new zznn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i14 = zzktVar.zze + 1;
        zzktVar.zze = i14;
        zzq(i14);
        int i15 = i12 + i13;
        zzowVar.zzi(obj, bArr, i13, i15, zzktVar);
        zzktVar.zze--;
        zzktVar.zzc = obj;
        return i15;
    }

    public static int zzo(int i7, byte[] bArr, int i10, int i11, zzkt zzktVar) {
        if ((i7 >>> 3) == 0) {
            throw new zznn("Protocol message contained an invalid tag (zero).");
        }
        int i12 = i7 & 7;
        if (i12 == 0) {
            return zzl(bArr, i10, zzktVar);
        }
        if (i12 == 1) {
            return i10 + 8;
        }
        if (i12 == 2) {
            return zzi(bArr, i10, zzktVar) + zzktVar.zza;
        }
        if (i12 != 3) {
            if (i12 == 5) {
                return i10 + 4;
            }
            throw new zznn("Protocol message contained an invalid tag (zero).");
        }
        int i13 = (i7 & (-8)) | 4;
        int i14 = 0;
        while (i10 < i11) {
            i10 = zzi(bArr, i10, zzktVar);
            i14 = zzktVar.zza;
            if (i14 == i13) {
                break;
            }
            i10 = zzo(i14, bArr, i10, i11, zzktVar);
        }
        if (i10 > i11 || i14 != i13) {
            throw new zznn("Failed to parse the message.");
        }
        return i10;
    }

    public static long zzp(byte[] bArr, int i7) {
        return (bArr[i7] & 255) | ((bArr[i7 + 1] & 255) << 8) | ((bArr[i7 + 2] & 255) << 16) | ((bArr[i7 + 3] & 255) << 24) | ((bArr[i7 + 4] & 255) << 32) | ((bArr[i7 + 5] & 255) << 40) | ((bArr[i7 + 6] & 255) << 48) | ((bArr[i7 + 7] & 255) << 56);
    }

    private static void zzq(int i7) {
        if (i7 >= zzb) {
            throw new zznn("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
    }
}
