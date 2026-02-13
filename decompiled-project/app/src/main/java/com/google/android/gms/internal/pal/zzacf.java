package com.google.android.gms.internal.pal;

import java.io.IOException;

/* loaded from: classes.dex */
public final class zzacf extends IOException {
    public zzacf() {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.");
    }

    public zzacf(String str, Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(String.valueOf(str)), th);
    }

    public zzacf(Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
    }
}
