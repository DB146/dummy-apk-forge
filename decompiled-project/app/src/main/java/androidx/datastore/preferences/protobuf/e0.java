package androidx.datastore.preferences.protobuf;

import H2.C0305t;
import java.io.IOException;

/* loaded from: classes.dex */
public final class e0 {
    public static d0 a(Object obj) {
        AbstractC0817u abstractC0817u = (AbstractC0817u) obj;
        d0 d0Var = abstractC0817u.unknownFields;
        if (d0Var != d0.f13387f) {
            return d0Var;
        }
        d0 d0Var2 = new d0(0, new int[8], new Object[8], true);
        abstractC0817u.unknownFields = d0Var2;
        return d0Var2;
    }

    public static void b(Object obj) {
        d0 d0Var = ((AbstractC0817u) obj).unknownFields;
        if (d0Var.f13392e) {
            d0Var.f13392e = false;
        }
    }

    public static boolean c(int i7, C0305t c0305t, Object obj) {
        int i10 = c0305t.f4826b;
        int i11 = i10 >>> 3;
        int i12 = i10 & 7;
        AbstractC0807j abstractC0807j = (AbstractC0807j) c0305t.f4829e;
        if (i12 == 0) {
            c0305t.n0(0);
            ((d0) obj).c(i11 << 3, Long.valueOf(abstractC0807j.s()));
            return true;
        }
        if (i12 == 1) {
            c0305t.n0(1);
            ((d0) obj).c((i11 << 3) | 1, Long.valueOf(abstractC0807j.p()));
            return true;
        }
        if (i12 == 2) {
            ((d0) obj).c((i11 << 3) | 2, c0305t.l());
            return true;
        }
        if (i12 != 3) {
            if (i12 == 4) {
                return false;
            }
            if (i12 != 5) {
                throw C0821y.b();
            }
            c0305t.n0(5);
            ((d0) obj).c(5 | (i11 << 3), Integer.valueOf(abstractC0807j.o()));
            return true;
        }
        d0 d0Var = new d0(0, new int[8], new Object[8], true);
        int i13 = i11 << 3;
        int i14 = i13 | 4;
        int i15 = i7 + 1;
        if (i15 >= 100) {
            throw new IOException("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        while (c0305t.c() != Integer.MAX_VALUE && c(i15, c0305t, d0Var)) {
        }
        if (i14 != c0305t.f4826b) {
            throw new IOException("Protocol message end-group tag did not match expected tag.");
        }
        if (d0Var.f13392e) {
            d0Var.f13392e = false;
        }
        ((d0) obj).c(i13 | 3, d0Var);
        return true;
    }
}
