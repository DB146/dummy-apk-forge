package com.google.android.gms.internal.pal;

/* loaded from: classes.dex */
final class zzxm extends zzxl {
    private static final int[] zzc = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    private int zzd;
    private final int[] zze;

    public zzxm(int i7, byte[] bArr) {
        this.zza = bArr;
        this.zze = zzc;
        this.zzd = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00ee, code lost:
    
        if (r2 == 1) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00f0, code lost:
    
        if (r2 == 2) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00f2, code lost:
    
        if (r2 == 3) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00f4, code lost:
    
        if (r2 == 4) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00f7, code lost:
    
        r16.zzd = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00f9, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0111, code lost:
    
        r16.zzd = r2;
        r16.zzb = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0115, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00fa, code lost:
    
        r1 = r9 + 1;
        r5[r9] = (byte) (r8 >> 10);
        r9 = r9 + 2;
        r5[r1] = (byte) (r8 >> 2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0109, code lost:
    
        r5[r9] = (byte) (r8 >> 4);
        r9 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0116, code lost:
    
        r16.zzd = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0118, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zza(byte[] bArr, int i7, int i10, boolean z8) {
        int i11 = this.zzd;
        if (i11 == 6) {
            return false;
        }
        byte[] bArr2 = this.zza;
        int[] iArr = this.zze;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (true) {
            if (i12 >= i10) {
                break;
            }
            if (i11 == 0) {
                while (true) {
                    int i15 = i12 + 4;
                    if (i15 > i10 || (i13 = (iArr[bArr[i12] & 255] << 18) | (iArr[bArr[i12 + 1] & 255] << 12) | (iArr[bArr[i12 + 2] & 255] << 6) | iArr[bArr[i12 + 3] & 255]) < 0) {
                        break;
                    }
                    bArr2[i14 + 2] = (byte) i13;
                    bArr2[i14 + 1] = (byte) (i13 >> 8);
                    bArr2[i14] = (byte) (i13 >> 16);
                    i14 += 3;
                    i12 = i15;
                }
                if (i12 >= i10) {
                    i11 = 0;
                    break;
                }
                i11 = 0;
            }
            int i16 = i12 + 1;
            int i17 = iArr[bArr[i12] & 255];
            if (i11 != 0) {
                if (i11 == 1) {
                    if (i17 < 0) {
                        if (i17 != -1) {
                            this.zzd = 6;
                            return false;
                        }
                    }
                    i13 = (i13 << 6) | i17;
                } else if (i11 == 2) {
                    if (i17 < 0) {
                        if (i17 == -2) {
                            bArr2[i14] = (byte) (i13 >> 4);
                            i14++;
                            i11 = 4;
                        } else if (i17 != -1) {
                            this.zzd = 6;
                            return false;
                        }
                    }
                    i13 = (i13 << 6) | i17;
                } else if (i11 != 3) {
                    if (i11 != 4) {
                        if (i11 == 5 && i17 != -1) {
                            this.zzd = 6;
                            return false;
                        }
                    } else if (i17 != -2) {
                        if (i17 != -1) {
                            this.zzd = 6;
                            return false;
                        }
                    }
                } else if (i17 >= 0) {
                    i13 = (i13 << 6) | i17;
                    bArr2[i14 + 2] = (byte) i13;
                    bArr2[i14 + 1] = (byte) (i13 >> 8);
                    bArr2[i14] = (byte) (i13 >> 16);
                    i14 += 3;
                    i11 = 0;
                } else if (i17 == -2) {
                    bArr2[i14 + 1] = (byte) (i13 >> 2);
                    bArr2[i14] = (byte) (i13 >> 10);
                    i14 += 2;
                    i11 = 5;
                } else if (i17 != -1) {
                    this.zzd = 6;
                    return false;
                }
                i11++;
            } else if (i17 >= 0) {
                i11++;
                i13 = i17;
            } else if (i17 != -1) {
                this.zzd = 6;
                return false;
            }
            i12 = i16;
        }
    }
}
