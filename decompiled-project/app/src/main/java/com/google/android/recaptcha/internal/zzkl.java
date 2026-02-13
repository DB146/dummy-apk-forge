package com.google.android.recaptcha.internal;

/* loaded from: classes.dex */
final class zzkl {
    public static void zza(boolean z8, String str, long j, long j10) {
        if (z8) {
            return;
        }
        throw new ArithmeticException("overflow: " + str + "(" + j + ", " + j10 + ")");
    }

    public static void zzb(boolean z8) {
        if (!z8) {
            throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
        }
    }
}
