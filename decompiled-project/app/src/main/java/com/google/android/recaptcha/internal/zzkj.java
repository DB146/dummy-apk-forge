package com.google.android.recaptcha.internal;

import P1.g;
import java.math.RoundingMode;

/* loaded from: classes.dex */
public final class zzkj {
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003e, code lost:
    
        if (((r0 & 1) & (r7 != java.math.RoundingMode.HALF_EVEN ? 0 : 1)) != 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0041, code lost:
    
        if (r1 > 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0044, code lost:
    
        if (r5 > 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0047, code lost:
    
        if (r5 < 0) goto L27;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x001c. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int zza(int i7, int i10, RoundingMode roundingMode) {
        roundingMode.getClass();
        if (i10 == 0) {
            throw new ArithmeticException("/ by zero");
        }
        int i11 = i7 / i10;
        int i12 = i7 - (i10 * i11);
        if (i12 != 0) {
            int i13 = ((i7 ^ i10) >> 31) | 1;
            switch (zzki.zza[roundingMode.ordinal()]) {
                case 1:
                    zzkl.zzb(false);
                case 2:
                    return i11;
                case 3:
                    break;
                case 4:
                    return i11 + i13;
                case 5:
                    break;
                case 6:
                case 7:
                case g.BYTES_FIELD_NUMBER /* 8 */:
                    int abs = Math.abs(i12);
                    int abs2 = abs - (Math.abs(i10) - abs);
                    if (abs2 == 0) {
                        if (roundingMode != RoundingMode.HALF_UP) {
                            break;
                        }
                        return i11 + i13;
                    }
                    break;
                default:
                    throw new AssertionError();
            }
        }
        return i11;
    }

    public static int zzb(int i7, RoundingMode roundingMode) {
        if (i7 <= 0) {
            throw new IllegalArgumentException("x (0) must be > 0");
        }
        switch (zzki.zza[roundingMode.ordinal()]) {
            case 1:
                zzkl.zzb(((i7 + (-1)) & i7) == 0);
                break;
            case 2:
            case 3:
                break;
            case 4:
            case 5:
                return 32 - Integer.numberOfLeadingZeros(i7 - 1);
            case 6:
            case 7:
            case g.BYTES_FIELD_NUMBER /* 8 */:
                int numberOfLeadingZeros = Integer.numberOfLeadingZeros(i7);
                return (31 - numberOfLeadingZeros) + ((((-1257966797) >>> numberOfLeadingZeros) - i7) >>> 31);
            default:
                throw new AssertionError();
        }
        return 31 - Integer.numberOfLeadingZeros(i7);
    }
}
