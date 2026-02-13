package com.google.android.gms.internal.auth;

/* loaded from: classes.dex */
final class zzhm extends zzhl {
    @Override // com.google.android.gms.internal.auth.zzhl
    public final int zza(int i7, byte[] bArr, int i10, int i11) {
        while (i10 < i11 && bArr[i10] >= 0) {
            i10++;
        }
        if (i10 >= i11) {
            return 0;
        }
        while (i10 < i11) {
            int i12 = i10 + 1;
            byte b2 = bArr[i10];
            if (b2 < 0) {
                if (b2 < -32) {
                    if (i12 >= i11) {
                        return b2;
                    }
                    if (b2 >= -62) {
                        i10 += 2;
                        if (bArr[i12] > -65) {
                        }
                    }
                    return -1;
                }
                if (b2 < -16) {
                    if (i12 >= i11 - 1) {
                        return zzhn.zza(bArr, i12, i11);
                    }
                    int i13 = i10 + 2;
                    byte b10 = bArr[i12];
                    if (b10 <= -65 && ((b2 != -32 || b10 >= -96) && (b2 != -19 || b10 < -96))) {
                        i10 += 3;
                        if (bArr[i13] > -65) {
                        }
                    }
                    return -1;
                }
                if (i12 >= i11 - 2) {
                    return zzhn.zza(bArr, i12, i11);
                }
                int i14 = i10 + 2;
                byte b11 = bArr[i12];
                if (b11 <= -65) {
                    if ((((b11 + 112) + (b2 << 28)) >> 30) == 0) {
                        int i15 = i10 + 3;
                        if (bArr[i14] <= -65) {
                            i10 += 4;
                            if (bArr[i15] > -65) {
                            }
                        }
                    }
                }
                return -1;
            }
            i10 = i12;
        }
        return 0;
    }
}
