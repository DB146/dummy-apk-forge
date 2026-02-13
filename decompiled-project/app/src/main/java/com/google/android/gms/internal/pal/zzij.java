package com.google.android.gms.internal.pal;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class zzij {
    public static final CharSequence zza(Object obj) {
        obj.getClass();
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }

    public static final Appendable zzb(Appendable appendable, Iterator it, String str) {
        if (it.hasNext()) {
            appendable.append(zza(it.next()));
            while (it.hasNext()) {
                appendable.append(",");
                appendable.append(zza(it.next()));
            }
        }
        return appendable;
    }
}
