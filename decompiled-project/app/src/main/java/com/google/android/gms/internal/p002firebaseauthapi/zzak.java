package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.f;

/* loaded from: classes.dex */
public class zzak<E> {
    public static int zza(int i7, int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("cannot store more than Integer.MAX_VALUE elements");
        }
        if (i10 <= i7) {
            return i7;
        }
        int i11 = i7 + (i7 >> 1) + 1;
        if (i11 < i10) {
            i11 = Integer.highestOneBit(i10 - 1) << 1;
        }
        return i11 < 0 ? f.API_PRIORITY_OTHER : i11;
    }
}
