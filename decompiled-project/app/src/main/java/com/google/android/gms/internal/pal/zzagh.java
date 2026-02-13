package com.google.android.gms.internal.pal;

/* loaded from: classes.dex */
public final class zzagh {
    static {
        Math.log(10.0d);
    }

    public static void zza(StringBuffer stringBuffer, long j) {
        int i7 = (int) j;
        if (i7 != j) {
            stringBuffer.append(Long.toString(j));
            return;
        }
        if (i7 < 0) {
            stringBuffer.append('-');
            if (i7 == Integer.MIN_VALUE) {
                stringBuffer.append("2147483648");
                return;
            }
            i7 = -i7;
        }
        if (i7 < 10) {
            stringBuffer.append((char) (i7 + 48));
        } else {
            if (i7 >= 100) {
                stringBuffer.append(Integer.toString(i7));
                return;
            }
            int i10 = ((i7 + 1) * 13421772) >> 27;
            stringBuffer.append((char) (i10 + 48));
            stringBuffer.append((char) (((i7 - (i10 << 3)) - (i10 + i10)) + 48));
        }
    }
}
