package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;

/* loaded from: classes.dex */
public final class zzady extends IOException {
    public zzady() {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.");
    }

    public zzady(String str, Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(String.valueOf(str)), th);
    }

    public zzady(Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
    }
}
