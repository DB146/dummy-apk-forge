package com.google.android.gms.internal.fido;

import h3.o;

/* loaded from: classes.dex */
public final class zzbq {
    public static Object zza(Object obj, int i7) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(o.l(i7, "at index "));
    }

    public static Object[] zzb(Object[] objArr, int i7) {
        for (int i10 = 0; i10 < i7; i10++) {
            zza(objArr[i10], i10);
        }
        return objArr;
    }
}
