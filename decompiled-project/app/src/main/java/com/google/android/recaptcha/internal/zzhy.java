package com.google.android.recaptcha.internal;

import Eb.n;
import Eb.o;
import Eb.v;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class zzhy {
    private List zza = v.f3891a;

    public final long zza(long[] jArr) {
        Iterator it = o.i0(this.zza, n.d0(jArr)).iterator();
        if (!it.hasNext()) {
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = Long.valueOf(((Number) next).longValue() ^ ((Number) it.next()).longValue());
        }
        return ((Number) next).longValue();
    }

    public final void zzb(long[] jArr) {
        this.zza = n.d0(jArr);
    }
}
