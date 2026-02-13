package com.google.android.gms.internal.pal;

/* loaded from: classes.dex */
public final class zzagg {
    public static long zza(long j, int i7) {
        long j10 = i7;
        long j11 = j * j10;
        if (j11 / j10 == j) {
            return j11;
        }
        StringBuilder sb2 = new StringBuilder(67);
        sb2.append("Multiplication overflows a long: ");
        sb2.append(j);
        sb2.append(" * ");
        sb2.append(i7);
        throw new ArithmeticException(sb2.toString());
    }
}
