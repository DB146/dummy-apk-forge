package com.google.android.gms.internal.common;

import h3.o;

/* loaded from: classes.dex */
public final class zzal {
    public static Object[] zza(Object[] objArr, int i7) {
        for (int i10 = 0; i10 < i7; i10++) {
            if (objArr[i10] == null) {
                throw new NullPointerException(o.l(i10, "at index "));
            }
        }
        return objArr;
    }
}
