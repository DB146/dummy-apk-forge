package com.google.ads.interactivemedia.v3.internal;

import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public final class zzts {
    public static int zza(Set set) {
        Iterator it = set.iterator();
        int i7 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i7 += next != null ? next.hashCode() : 0;
        }
        return i7;
    }
}
