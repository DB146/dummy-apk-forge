package com.google.android.gms.internal.auth;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzhn {
    public static final /* synthetic */ int zza = 0;
    private static final zzhl zzb;

    static {
        if (zzhj.zzu() && zzhj.zzv()) {
            int i7 = zzds.zza;
        }
        zzb = new zzhm();
    }

    public static /* bridge */ /* synthetic */ int zza(byte[] bArr, int i7, int i10) {
        int i11 = i10 - i7;
        byte b2 = bArr[i7 - 1];
        if (i11 != 0) {
            if (i11 == 1) {
                byte b10 = bArr[i7];
                if (b2 <= -12 && b10 <= -65) {
                    return b2 ^ (b10 << 8);
                }
            } else {
                if (i11 != 2) {
                    throw new AssertionError();
                }
                byte b11 = bArr[i7];
                byte b12 = bArr[i7 + 1];
                if (b2 <= -12 && b11 <= -65 && b12 <= -65) {
                    return ((b11 << 8) ^ b2) ^ (b12 << 16);
                }
            }
        } else if (b2 <= -12) {
            return b2;
        }
        return -1;
    }

    public static boolean zzb(byte[] bArr) {
        return zzb.zzb(bArr, 0, bArr.length);
    }

    public static boolean zzc(byte[] bArr, int i7, int i10) {
        return zzb.zzb(bArr, i7, i10);
    }
}
