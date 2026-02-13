package com.google.android.gms.internal.pal;

/* loaded from: classes.dex */
public final class zzvq {
    private static final zzadc zza = new zzvp();

    public static int zza(int i7) {
        if (i7 != 1) {
            return i7 - 2;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
