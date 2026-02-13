package com.google.android.gms.internal.measurement;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzkw {
    public static final /* synthetic */ int zza = 0;
    private static volatile int zzb = 100;

    public static int zza(byte[] bArr, int i7, zzkv zzkvVar) {
        int i10 = i7 + 1;
        byte b2 = bArr[i7];
        if (b2 < 0) {
            return zzb(b2, bArr, i10, zzkvVar);
        }
        zzkvVar.zza = b2;
        return i10;
    }

    public static int zzb(int i7, byte[] bArr, int i10, zzkv zzkvVar) {
        byte b2 = bArr[i10];
        int i11 = i10 + 1;
        int i12 = i7 & 127;
        if (b2 >= 0) {
            zzkvVar.zza = i12 | (b2 << 7);
            return i11;
        }
        int i13 = i12 | ((b2 & Byte.MAX_VALUE) << 7);
        int i14 = i10 + 2;
        byte b10 = bArr[i11];
        if (b10 >= 0) {
            zzkvVar.zza = i13 | (b10 << 14);
            return i14;
        }
        int i15 = i13 | ((b10 & Byte.MAX_VALUE) << 14);
        int i16 = i10 + 3;
        byte b11 = bArr[i14];
        if (b11 >= 0) {
            zzkvVar.zza = i15 | (b11 << 21);
            return i16;
        }
        int i17 = i15 | ((b11 & Byte.MAX_VALUE) << 21);
        int i18 = i10 + 4;
        byte b12 = bArr[i16];
        if (b12 >= 0) {
            zzkvVar.zza = i17 | (b12 << 28);
            return i18;
        }
        int i19 = i17 | ((b12 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i20 = i18 + 1;
            if (bArr[i18] >= 0) {
                zzkvVar.zza = i19;
                return i20;
            }
            i18 = i20;
        }
    }

    public static int zzc(byte[] bArr, int i7, zzkv zzkvVar) {
        long j = bArr[i7];
        int i10 = i7 + 1;
        if (j >= 0) {
            zzkvVar.zzb = j;
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
        zzkvVar.zzb = j10;
        return i11;
    }

    public static int zzd(byte[] bArr, int i7) {
        int i10 = bArr[i7] & 255;
        int i11 = bArr[i7 + 1] & 255;
        int i12 = bArr[i7 + 2] & 255;
        return ((bArr[i7 + 3] & 255) << 24) | (i11 << 8) | i10 | (i12 << 16);
    }

    public static long zze(byte[] bArr, int i7) {
        return (bArr[i7] & 255) | ((bArr[i7 + 1] & 255) << 8) | ((bArr[i7 + 2] & 255) << 16) | ((bArr[i7 + 3] & 255) << 24) | ((bArr[i7 + 4] & 255) << 32) | ((bArr[i7 + 5] & 255) << 40) | ((bArr[i7 + 6] & 255) << 48) | ((bArr[i7 + 7] & 255) << 56);
    }

    public static int zzf(byte[] bArr, int i7, zzkv zzkvVar) {
        int i10;
        int zza2 = zza(bArr, i7, zzkvVar);
        int i11 = zzkvVar.zza;
        if (i11 < 0) {
            throw new zzmq("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i11 == 0) {
            zzkvVar.zzc = "";
            return zza2;
        }
        int i12 = zzor.zza;
        int length = bArr.length;
        if ((((length - zza2) - i11) | zza2 | i11) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(zza2), Integer.valueOf(i11)));
        }
        int i13 = zza2 + i11;
        char[] cArr = new char[i11];
        int i14 = 0;
        while (zza2 < i13) {
            byte b2 = bArr[zza2];
            if (!zzop.zza(b2)) {
                break;
            }
            zza2++;
            cArr[i14] = (char) b2;
            i14++;
        }
        int i15 = i14;
        while (zza2 < i13) {
            int i16 = zza2 + 1;
            byte b10 = bArr[zza2];
            if (zzop.zza(b10)) {
                cArr[i15] = (char) b10;
                i15++;
                zza2 = i16;
                while (zza2 < i13) {
                    byte b11 = bArr[zza2];
                    if (zzop.zza(b11)) {
                        zza2++;
                        cArr[i15] = (char) b11;
                        i15++;
                    }
                }
            } else {
                if (b10 < -32) {
                    if (i16 >= i13) {
                        throw new zzmq("Protocol message had invalid UTF-8.");
                    }
                    i10 = i15 + 1;
                    zza2 += 2;
                    zzop.zzb(b10, bArr[i16], cArr, i15);
                } else if (b10 < -16) {
                    if (i16 >= i13 - 1) {
                        throw new zzmq("Protocol message had invalid UTF-8.");
                    }
                    i10 = i15 + 1;
                    int i17 = zza2 + 2;
                    zza2 += 3;
                    zzop.zzc(b10, bArr[i16], bArr[i17], cArr, i15);
                } else {
                    if (i16 >= i13 - 2) {
                        throw new zzmq("Protocol message had invalid UTF-8.");
                    }
                    byte b12 = bArr[i16];
                    int i18 = zza2 + 3;
                    byte b13 = bArr[zza2 + 2];
                    zza2 += 4;
                    zzop.zzd(b10, b12, b13, bArr[i18], cArr, i15);
                    i15 += 2;
                }
                i15 = i10;
            }
        }
        zzkvVar.zzc = new String(cArr, 0, i15);
        return i13;
    }

    public static int zzg(byte[] bArr, int i7, zzkv zzkvVar) {
        int zza2 = zza(bArr, i7, zzkvVar);
        int i10 = zzkvVar.zza;
        if (i10 < 0) {
            throw new zzmq("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i10 > bArr.length - zza2) {
            throw new zzmq("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        if (i10 == 0) {
            zzkvVar.zzc = zzlg.zzb;
            return zza2;
        }
        zzkvVar.zzc = zzlg.zzh(bArr, zza2, i10);
        return zza2 + i10;
    }

    public static int zzh(zznw zznwVar, byte[] bArr, int i7, int i10, zzkv zzkvVar) {
        Object zza2 = zznwVar.zza();
        int zzj = zzj(zza2, zznwVar, bArr, i7, i10, zzkvVar);
        zznwVar.zzj(zza2);
        zzkvVar.zzc = zza2;
        return zzj;
    }

    public static int zzi(zznw zznwVar, byte[] bArr, int i7, int i10, int i11, zzkv zzkvVar) {
        Object zza2 = zznwVar.zza();
        int zzk = zzk(zza2, zznwVar, bArr, i7, i10, i11, zzkvVar);
        zznwVar.zzj(zza2);
        zzkvVar.zzc = zza2;
        return zzk;
    }

    public static int zzj(Object obj, zznw zznwVar, byte[] bArr, int i7, int i10, zzkv zzkvVar) {
        int i11 = i7 + 1;
        int i12 = bArr[i7];
        if (i12 < 0) {
            i11 = zzb(i12, bArr, i11, zzkvVar);
            i12 = zzkvVar.zza;
        }
        int i13 = i11;
        if (i12 < 0 || i12 > i10 - i13) {
            throw new zzmq("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i14 = zzkvVar.zze + 1;
        zzkvVar.zze = i14;
        zzq(i14);
        int i15 = i12 + i13;
        zznwVar.zzi(obj, bArr, i13, i15, zzkvVar);
        zzkvVar.zze--;
        zzkvVar.zzc = obj;
        return i15;
    }

    public static int zzk(Object obj, zznw zznwVar, byte[] bArr, int i7, int i10, int i11, zzkv zzkvVar) {
        zzno zznoVar = (zzno) zznwVar;
        int i12 = zzkvVar.zze + 1;
        zzkvVar.zze = i12;
        zzq(i12);
        int zzh = zznoVar.zzh(obj, bArr, i7, i10, i11, zzkvVar);
        zzkvVar.zze--;
        zzkvVar.zzc = obj;
        return zzh;
    }

    public static int zzl(int i7, byte[] bArr, int i10, int i11, zzmn zzmnVar, zzkv zzkvVar) {
        zzmf zzmfVar = (zzmf) zzmnVar;
        int zza2 = zza(bArr, i10, zzkvVar);
        zzmfVar.zzh(zzkvVar.zza);
        while (zza2 < i11) {
            int zza3 = zza(bArr, zza2, zzkvVar);
            if (i7 != zzkvVar.zza) {
                break;
            }
            zza2 = zza(bArr, zza3, zzkvVar);
            zzmfVar.zzh(zzkvVar.zza);
        }
        return zza2;
    }

    public static int zzm(byte[] bArr, int i7, zzmn zzmnVar, zzkv zzkvVar) {
        zzmf zzmfVar = (zzmf) zzmnVar;
        int zza2 = zza(bArr, i7, zzkvVar);
        int i10 = zzkvVar.zza + zza2;
        while (zza2 < i10) {
            zza2 = zza(bArr, zza2, zzkvVar);
            zzmfVar.zzh(zzkvVar.zza);
        }
        if (zza2 == i10) {
            return zza2;
        }
        throw new zzmq("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public static int zzn(zznw zznwVar, int i7, byte[] bArr, int i10, int i11, zzmn zzmnVar, zzkv zzkvVar) {
        int zzh = zzh(zznwVar, bArr, i10, i11, zzkvVar);
        zzmnVar.add(zzkvVar.zzc);
        while (zzh < i11) {
            int zza2 = zza(bArr, zzh, zzkvVar);
            if (i7 != zzkvVar.zza) {
                break;
            }
            zzh = zzh(zznwVar, bArr, zza2, i11, zzkvVar);
            zzmnVar.add(zzkvVar.zzc);
        }
        return zzh;
    }

    public static int zzo(int i7, byte[] bArr, int i10, int i11, zzoi zzoiVar, zzkv zzkvVar) {
        if ((i7 >>> 3) == 0) {
            throw new zzmq("Protocol message contained an invalid tag (zero).");
        }
        int i12 = i7 & 7;
        if (i12 == 0) {
            int zzc = zzc(bArr, i10, zzkvVar);
            zzoiVar.zzk(i7, Long.valueOf(zzkvVar.zzb));
            return zzc;
        }
        if (i12 == 1) {
            zzoiVar.zzk(i7, Long.valueOf(zze(bArr, i10)));
            return i10 + 8;
        }
        if (i12 == 2) {
            int zza2 = zza(bArr, i10, zzkvVar);
            int i13 = zzkvVar.zza;
            if (i13 < 0) {
                throw new zzmq("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            if (i13 > bArr.length - zza2) {
                throw new zzmq("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            if (i13 == 0) {
                zzoiVar.zzk(i7, zzlg.zzb);
            } else {
                zzoiVar.zzk(i7, zzlg.zzh(bArr, zza2, i13));
            }
            return zza2 + i13;
        }
        if (i12 != 3) {
            if (i12 != 5) {
                throw new zzmq("Protocol message contained an invalid tag (zero).");
            }
            zzoiVar.zzk(i7, Integer.valueOf(zzd(bArr, i10)));
            return i10 + 4;
        }
        int i14 = (i7 & (-8)) | 4;
        zzoi zzb2 = zzoi.zzb();
        int i15 = zzkvVar.zze + 1;
        zzkvVar.zze = i15;
        zzq(i15);
        int i16 = 0;
        while (true) {
            if (i10 >= i11) {
                break;
            }
            int zza3 = zza(bArr, i10, zzkvVar);
            i16 = zzkvVar.zza;
            if (i16 == i14) {
                i10 = zza3;
                break;
            }
            i10 = zzo(i16, bArr, zza3, i11, zzb2, zzkvVar);
        }
        zzkvVar.zze--;
        if (i10 > i11 || i16 != i14) {
            throw new zzmq("Failed to parse the message.");
        }
        zzoiVar.zzk(i7, zzb2);
        return i10;
    }

    public static int zzp(int i7, byte[] bArr, int i10, int i11, zzkv zzkvVar) {
        if ((i7 >>> 3) == 0) {
            throw new zzmq("Protocol message contained an invalid tag (zero).");
        }
        int i12 = i7 & 7;
        if (i12 == 0) {
            return zzc(bArr, i10, zzkvVar);
        }
        if (i12 == 1) {
            return i10 + 8;
        }
        if (i12 == 2) {
            return zza(bArr, i10, zzkvVar) + zzkvVar.zza;
        }
        if (i12 != 3) {
            if (i12 == 5) {
                return i10 + 4;
            }
            throw new zzmq("Protocol message contained an invalid tag (zero).");
        }
        int i13 = (i7 & (-8)) | 4;
        int i14 = 0;
        while (i10 < i11) {
            i10 = zza(bArr, i10, zzkvVar);
            i14 = zzkvVar.zza;
            if (i14 == i13) {
                break;
            }
            i10 = zzp(i14, bArr, i10, i11, zzkvVar);
        }
        if (i10 > i11 || i14 != i13) {
            throw new zzmq("Failed to parse the message.");
        }
        return i10;
    }

    private static void zzq(int i7) {
        if (i7 >= zzb) {
            throw new zzmq("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
    }
}
