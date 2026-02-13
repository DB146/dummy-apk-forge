package com.google.ads.interactivemedia.v3.internal;

/* loaded from: classes.dex */
final class zzahw extends zzahv {
    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
    
        if (r13[r14] <= (-65)) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0047, code lost:
    
        if (r13[r14] <= (-65)) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0083, code lost:
    
        if (r13[r14] <= (-65)) goto L11;
     */
    @Override // com.google.ads.interactivemedia.v3.internal.zzahv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zza(int i7, byte[] bArr, int i10, int i11) {
        int i12;
        int i13;
        int zzk;
        int zzj;
        int zzj2;
        if (i7 != 0) {
            if (i10 >= i11) {
                return i7;
            }
            byte b2 = (byte) i7;
            if (b2 < -32) {
                if (b2 >= -62) {
                    i13 = i10 + 1;
                }
                return -1;
            }
            if (b2 < -16) {
                byte b10 = (byte) (~(i7 >> 8));
                if (b10 == 0) {
                    int i14 = i10 + 1;
                    byte b11 = bArr[i10];
                    if (i14 >= i11) {
                        zzj2 = zzahy.zzj(b2, b11);
                        return zzj2;
                    }
                    i10 = i14;
                    b10 = b11;
                }
                if (b10 <= -65 && ((b2 != -32 || b10 >= -96) && (b2 != -19 || b10 < -96))) {
                    i13 = i10 + 1;
                }
                return -1;
            }
            byte b12 = (byte) (~(i7 >> 8));
            if (b12 == 0) {
                int i15 = i10 + 1;
                b12 = bArr[i10];
                if (i15 >= i11) {
                    zzj = zzahy.zzj(b2, b12);
                    return zzj;
                }
                i10 = i15;
                i12 = 0;
            } else {
                i12 = i7 >> 16;
            }
            if (i12 == 0) {
                int i16 = i10 + 1;
                byte b13 = bArr[i10];
                if (i16 >= i11) {
                    zzk = zzahy.zzk(b2, b12, b13);
                    return zzk;
                }
                i10 = i16;
                i12 = b13;
            }
            if (b12 <= -65) {
                if ((((b12 + 112) + (b2 << 28)) >> 30) == 0 && i12 <= -65) {
                    i13 = i10 + 1;
                }
            }
            return -1;
            i10 = i13;
        }
        while (i10 < i11 && bArr[i10] >= 0) {
            i10++;
        }
        if (i10 >= i11) {
            return 0;
        }
        while (i10 < i11) {
            int i17 = i10 + 1;
            byte b14 = bArr[i10];
            if (b14 < 0) {
                if (b14 < -32) {
                    if (i17 >= i11) {
                        return b14;
                    }
                    if (b14 >= -62) {
                        i10 += 2;
                        if (bArr[i17] > -65) {
                        }
                    }
                    return -1;
                }
                if (b14 < -16) {
                    if (i17 >= i11 - 1) {
                        return zzahy.zzc(bArr, i17, i11);
                    }
                    int i18 = i10 + 2;
                    byte b15 = bArr[i17];
                    if (b15 <= -65 && ((b14 != -32 || b15 >= -96) && (b14 != -19 || b15 < -96))) {
                        i10 += 3;
                        if (bArr[i18] > -65) {
                        }
                    }
                    return -1;
                }
                if (i17 >= i11 - 2) {
                    return zzahy.zzc(bArr, i17, i11);
                }
                int i19 = i10 + 2;
                byte b16 = bArr[i17];
                if (b16 <= -65) {
                    if ((((b16 + 112) + (b14 << 28)) >> 30) == 0) {
                        int i20 = i10 + 3;
                        if (bArr[i19] <= -65) {
                            i10 += 4;
                            if (bArr[i20] > -65) {
                            }
                        }
                    }
                }
                return -1;
            }
            i10 = i17;
        }
        return 0;
    }
}
