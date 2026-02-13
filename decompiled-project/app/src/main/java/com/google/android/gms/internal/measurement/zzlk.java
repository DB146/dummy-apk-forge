package com.google.android.gms.internal.measurement;

import X.c;
import java.io.IOException;
import java.util.Locale;

/* loaded from: classes.dex */
public final class zzlk extends IOException {
    public zzlk() {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzlk(long j, long j10, int i7, Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(r3.toString()), th);
        Locale locale = Locale.US;
        StringBuilder l10 = c.l(j, "Pos: ", ", limit: ");
        l10.append(j10);
        l10.append(", len: ");
        l10.append(i7);
    }

    public zzlk(Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
    }
}
