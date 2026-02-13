package com.google.android.recaptcha.internal;

import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class zzjk implements Iterable {
    public final String toString() {
        Iterator it = iterator();
        StringBuilder sb2 = new StringBuilder("[");
        boolean z8 = true;
        while (it.hasNext()) {
            if (!z8) {
                sb2.append(", ");
            }
            sb2.append(it.next());
            z8 = false;
        }
        sb2.append(']');
        return sb2.toString();
    }
}
