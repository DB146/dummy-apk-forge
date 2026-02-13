package com.google.android.gms.internal.pal;

import com.google.ads.interactivemedia.v3.internal.a;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public final /* synthetic */ class zzjp {
    public static /* synthetic */ boolean zza(Unsafe unsafe, Object obj, long j, Object obj2, Object obj3) {
        while (!a.a(unsafe, obj, j, obj2, obj3)) {
            if (unsafe.getObject(obj, j) != obj2) {
                return false;
            }
        }
        return true;
    }
}
