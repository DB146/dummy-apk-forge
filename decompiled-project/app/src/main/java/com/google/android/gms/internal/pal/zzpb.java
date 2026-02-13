package com.google.android.gms.internal.pal;

/* loaded from: classes.dex */
final /* synthetic */ class zzpb {
    static final /* synthetic */ int[] zza;

    static {
        int[] iArr = new int[zzvn.values().length];
        zza = iArr;
        try {
            iArr[zzvn.SYMMETRIC.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            zza[zzvn.ASYMMETRIC_PRIVATE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
    }
}
