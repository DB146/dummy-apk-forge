package com.google.ads.interactivemedia.v3.internal;

import com.google.android.gms.common.api.f;

/* loaded from: classes.dex */
public final class zzsj {
    public static int zza(int i7, int i10) {
        if (i10 < 0) {
            throw new AssertionError("cannot store more than MAX_VALUE elements");
        }
        int i11 = i7 + (i7 >> 1) + 1;
        if (i11 < i10) {
            int highestOneBit = Integer.highestOneBit(i10 - 1);
            i11 = highestOneBit + highestOneBit;
        }
        return i11 < 0 ? f.API_PRIORITY_OTHER : i11;
    }
}
