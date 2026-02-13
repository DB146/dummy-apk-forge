package com.google.android.recaptcha.internal;

import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class zzjq {
    public static boolean zza(Collection collection, Iterator it) {
        it.getClass();
        boolean z8 = false;
        while (it.hasNext()) {
            z8 |= collection.add(it.next());
        }
        return z8;
    }
}
