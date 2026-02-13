package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzadf {
    public static int zza(byte[] bArr, int i7, zzade zzadeVar) {
        int zzj = zzj(bArr, i7, zzadeVar);
        int i10 = zzadeVar.zza;
        if (i10 < 0) {
            throw zzafc.zzf();
        }
        if (i10 > bArr.length - zzj) {
            throw zzafc.zzi();
        }
        if (i10 == 0) {
            zzadeVar.zzc = zzadr.zzb;
            return zzj;
        }
        zzadeVar.zzc = zzadr.zzs(bArr, zzj, i10);
        return zzj + i10;
    }

    public static int zzb(byte[] bArr, int i7) {
        int i10 = bArr[i7] & 255;
        int i11 = bArr[i7 + 1] & 255;
        int i12 = bArr[i7 + 2] & 255;
        return ((bArr[i7 + 3] & 255) << 24) | (i11 << 8) | i10 | (i12 << 16);
    }

    public static int zzc(zzags zzagsVar, byte[] bArr, int i7, int i10, int i11, zzade zzadeVar) {
        Object zze = zzagsVar.zze();
        int zzn = zzn(zze, zzagsVar, bArr, i7, i10, i11, zzadeVar);
        zzagsVar.zzf(zze);
        zzadeVar.zzc = zze;
        return zzn;
    }

    public static int zzd(zzags zzagsVar, byte[] bArr, int i7, int i10, zzade zzadeVar) {
        Object zze = zzagsVar.zze();
        int zzo = zzo(zze, zzagsVar, bArr, i7, i10, zzadeVar);
        zzagsVar.zzf(zze);
        zzadeVar.zzc = zze;
        return zzo;
    }

    public static int zze(zzags zzagsVar, int i7, byte[] bArr, int i10, int i11, zzaez zzaezVar, zzade zzadeVar) {
        int zzd = zzd(zzagsVar, bArr, i10, i11, zzadeVar);
        zzaezVar.add(zzadeVar.zzc);
        while (zzd < i11) {
            int zzj = zzj(bArr, zzd, zzadeVar);
            if (i7 != zzadeVar.zza) {
                break;
            }
            zzd = zzd(zzagsVar, bArr, zzj, i11, zzadeVar);
            zzaezVar.add(zzadeVar.zzc);
        }
        return zzd;
    }

    public static int zzf(byte[] bArr, int i7, zzaez zzaezVar, zzade zzadeVar) {
        zzaeu zzaeuVar = (zzaeu) zzaezVar;
        int zzj = zzj(bArr, i7, zzadeVar);
        int i10 = zzadeVar.zza + zzj;
        while (zzj < i10) {
            zzj = zzj(bArr, zzj, zzadeVar);
            zzaeuVar.zzg(zzadeVar.zza);
        }
        if (zzj == i10) {
            return zzj;
        }
        throw zzafc.zzi();
    }

    public static int zzg(byte[] bArr, int i7, zzade zzadeVar) {
        int zzj = zzj(bArr, i7, zzadeVar);
        int i10 = zzadeVar.zza;
        if (i10 < 0) {
            throw zzafc.zzf();
        }
        if (i10 == 0) {
            zzadeVar.zzc = "";
            return zzj;
        }
        zzadeVar.zzc = new String(bArr, zzj, i10, zzafa.zzb);
        return zzj + i10;
    }

    public static int zzh(byte[] bArr, int i7, zzade zzadeVar) {
        int zzj = zzj(bArr, i7, zzadeVar);
        int i10 = zzadeVar.zza;
        if (i10 < 0) {
            throw zzafc.zzf();
        }
        if (i10 == 0) {
            zzadeVar.zzc = "";
            return zzj;
        }
        zzadeVar.zzc = zzahy.zzg(bArr, zzj, i10);
        return zzj + i10;
    }

    public static int zzi(int i7, byte[] bArr, int i10, int i11, zzahk zzahkVar, zzade zzadeVar) {
        if ((i7 >>> 3) == 0) {
            throw zzafc.zzc();
        }
        int i12 = i7 & 7;
        if (i12 == 0) {
            int zzm = zzm(bArr, i10, zzadeVar);
            zzahkVar.zzj(i7, Long.valueOf(zzadeVar.zzb));
            return zzm;
        }
        if (i12 == 1) {
            zzahkVar.zzj(i7, Long.valueOf(zzp(bArr, i10)));
            return i10 + 8;
        }
        if (i12 == 2) {
            int zzj = zzj(bArr, i10, zzadeVar);
            int i13 = zzadeVar.zza;
            if (i13 < 0) {
                throw zzafc.zzf();
            }
            if (i13 > bArr.length - zzj) {
                throw zzafc.zzi();
            }
            if (i13 == 0) {
                zzahkVar.zzj(i7, zzadr.zzb);
            } else {
                zzahkVar.zzj(i7, zzadr.zzs(bArr, zzj, i13));
            }
            return zzj + i13;
        }
        if (i12 != 3) {
            if (i12 != 5) {
                throw zzafc.zzc();
            }
            zzahkVar.zzj(i7, Integer.valueOf(zzb(bArr, i10)));
            return i10 + 4;
        }
        int i14 = (i7 & (-8)) | 4;
        zzahk zzf = zzahk.zzf();
        int i15 = 0;
        while (true) {
            if (i10 >= i11) {
                break;
            }
            int zzj2 = zzj(bArr, i10, zzadeVar);
            int i16 = zzadeVar.zza;
            i15 = i16;
            if (i16 == i14) {
                i10 = zzj2;
                break;
            }
            int zzi = zzi(i15, bArr, zzj2, i11, zzf, zzadeVar);
            i15 = i16;
            i10 = zzi;
        }
        if (i10 > i11 || i15 != i14) {
            throw zzafc.zzg();
        }
        zzahkVar.zzj(i7, zzf);
        return i10;
    }

    public static int zzj(byte[] bArr, int i7, zzade zzadeVar) {
        int i10 = i7 + 1;
        byte b2 = bArr[i7];
        if (b2 < 0) {
            return zzk(b2, bArr, i10, zzadeVar);
        }
        zzadeVar.zza = b2;
        return i10;
    }

    public static int zzk(int i7, byte[] bArr, int i10, zzade zzadeVar) {
        byte b2 = bArr[i10];
        int i11 = i10 + 1;
        int i12 = i7 & 127;
        if (b2 >= 0) {
            zzadeVar.zza = i12 | (b2 << 7);
            return i11;
        }
        int i13 = i12 | ((b2 & Byte.MAX_VALUE) << 7);
        int i14 = i10 + 2;
        byte b10 = bArr[i11];
        if (b10 >= 0) {
            zzadeVar.zza = i13 | (b10 << 14);
            return i14;
        }
        int i15 = i13 | ((b10 & Byte.MAX_VALUE) << 14);
        int i16 = i10 + 3;
        byte b11 = bArr[i14];
        if (b11 >= 0) {
            zzadeVar.zza = i15 | (b11 << 21);
            return i16;
        }
        int i17 = i15 | ((b11 & Byte.MAX_VALUE) << 21);
        int i18 = i10 + 4;
        byte b12 = bArr[i16];
        if (b12 >= 0) {
            zzadeVar.zza = i17 | (b12 << 28);
            return i18;
        }
        int i19 = i17 | ((b12 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i20 = i18 + 1;
            if (bArr[i18] >= 0) {
                zzadeVar.zza = i19;
                return i20;
            }
            i18 = i20;
        }
    }

    public static int zzl(int i7, byte[] bArr, int i10, int i11, zzaez zzaezVar, zzade zzadeVar) {
        zzaeu zzaeuVar = (zzaeu) zzaezVar;
        int zzj = zzj(bArr, i10, zzadeVar);
        zzaeuVar.zzg(zzadeVar.zza);
        while (zzj < i11) {
            int zzj2 = zzj(bArr, zzj, zzadeVar);
            if (i7 != zzadeVar.zza) {
                break;
            }
            zzj = zzj(bArr, zzj2, zzadeVar);
            zzaeuVar.zzg(zzadeVar.zza);
        }
        return zzj;
    }

    public static int zzm(byte[] bArr, int i7, zzade zzadeVar) {
        long j = bArr[i7];
        int i10 = i7 + 1;
        if (j >= 0) {
            zzadeVar.zzb = j;
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
        zzadeVar.zzb = j10;
        return i11;
    }

    public static int zzn(Object obj, zzags zzagsVar, byte[] bArr, int i7, int i10, int i11, zzade zzadeVar) {
        int zzc = ((zzagc) zzagsVar).zzc(obj, bArr, i7, i10, i11, zzadeVar);
        zzadeVar.zzc = obj;
        return zzc;
    }

    public static int zzo(Object obj, zzags zzagsVar, byte[] bArr, int i7, int i10, zzade zzadeVar) {
        int i11 = i7 + 1;
        int i12 = bArr[i7];
        if (i12 < 0) {
            i11 = zzk(i12, bArr, i11, zzadeVar);
            i12 = zzadeVar.zza;
        }
        int i13 = i11;
        if (i12 < 0 || i12 > i10 - i13) {
            throw zzafc.zzi();
        }
        int i14 = i12 + i13;
        zzagsVar.zzi(obj, bArr, i13, i14, zzadeVar);
        zzadeVar.zzc = obj;
        return i14;
    }

    public static long zzp(byte[] bArr, int i7) {
        return (bArr[i7] & 255) | ((bArr[i7 + 1] & 255) << 8) | ((bArr[i7 + 2] & 255) << 16) | ((bArr[i7 + 3] & 255) << 24) | ((bArr[i7 + 4] & 255) << 32) | ((bArr[i7 + 5] & 255) << 40) | ((bArr[i7 + 6] & 255) << 48) | ((bArr[i7 + 7] & 255) << 56);
    }
}
