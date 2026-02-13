package com.google.crypto.tink.shaded.protobuf;

import H2.C0305t;
import java.io.IOException;

/* loaded from: classes.dex */
public final class d0 {
    public static boolean a(Object obj, C0305t c0305t) {
        int f4 = c0305t.f();
        int i7 = f4 >>> 3;
        int i10 = f4 & 7;
        if (i10 == 0) {
            ((c0) obj).c(i7 << 3, Long.valueOf(c0305t.K()));
            return true;
        }
        if (i10 == 1) {
            ((c0) obj).c((i7 << 3) | 1, Long.valueOf(c0305t.z()));
            return true;
        }
        if (i10 == 2) {
            ((c0) obj).c((i7 << 3) | 2, c0305t.m());
            return true;
        }
        if (i10 != 3) {
            if (i10 == 4) {
                return false;
            }
            if (i10 != 5) {
                throw C.b();
            }
            ((c0) obj).c((i7 << 3) | 5, Integer.valueOf(c0305t.w()));
            return true;
        }
        c0 b2 = c0.b();
        int i11 = i7 << 3;
        int i12 = i11 | 4;
        while (c0305t.c() != Integer.MAX_VALUE && a(b2, c0305t)) {
        }
        if (i12 != c0305t.f()) {
            throw new IOException("Protocol message end-group tag did not match expected tag.");
        }
        b2.f15767e = false;
        ((c0) obj).c(i11 | 3, b2);
        return true;
    }

    public static c0 b() {
        return c0.b();
    }
}
