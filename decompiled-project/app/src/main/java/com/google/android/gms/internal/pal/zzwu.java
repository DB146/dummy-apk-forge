package com.google.android.gms.internal.pal;

/* loaded from: classes.dex */
public final class zzwu {
    private static final zzadc zza = new zzwt();

    public static int zza(int i7) {
        if (i7 != 1) {
            return i7 - 2;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public static int zzb(int i7) {
        if (i7 == 0) {
            return 2;
        }
        if (i7 == 1) {
            return 3;
        }
        if (i7 == 2) {
            return 4;
        }
        if (i7 != 3) {
            return i7 != 4 ? 0 : 6;
        }
        return 5;
    }
}
