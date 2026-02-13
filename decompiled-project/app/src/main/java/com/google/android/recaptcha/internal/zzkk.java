package com.google.android.recaptcha.internal;

/* loaded from: classes.dex */
public final class zzkk {
    public static long zza(long j, long j10) {
        long j11 = j + j10;
        zzkl.zza(((j ^ j10) < 0) | ((j ^ j11) >= 0), "checkedAdd", j, j10);
        return j11;
    }

    public static long zzb(long j, long j10) {
        long j11 = (-1) + j;
        zzkl.zza(((1 ^ j) >= 0) | ((j ^ j11) >= 0), "checkedSubtract", j, 1L);
        return j11;
    }
}
