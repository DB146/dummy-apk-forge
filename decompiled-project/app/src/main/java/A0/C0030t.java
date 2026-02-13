package A0;

import y0.AbstractC2323H;
import y0.C2344l;

/* renamed from: A0.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0030t extends U {
    @Override // A0.T
    public final int R(C2344l c2344l) {
        Y y10 = this.f124z.f293z.f61T.f106q;
        kotlin.jvm.internal.l.b(y10);
        P p10 = y10.f145f;
        F f4 = p10.f96d;
        F f10 = F.f21b;
        M m10 = y10.f138E;
        if (f4 == f10) {
            m10.f86d = true;
            if (m10.f84b) {
                p10.f98f = true;
                p10.g = true;
            }
        } else {
            m10.f87e = true;
        }
        C0030t c0030t = y10.i().f311Z;
        if (c0030t != null) {
            c0030t.f115v = true;
        }
        y10.l();
        C0030t c0030t2 = y10.i().f311Z;
        if (c0030t2 != null) {
            c0030t2.f115v = false;
        }
        Integer num = (Integer) m10.g.get(c2344l);
        int intValue = num != null ? num.intValue() : Integer.MIN_VALUE;
        this.f123E.g(intValue, c2344l);
        return intValue;
    }

    @Override // y0.z
    public final AbstractC2323H b(long j) {
        O(j);
        n0 n0Var = this.f124z;
        S.e x2 = n0Var.f293z.x();
        Object[] objArr = x2.f8959a;
        int i7 = x2.f8961c;
        for (int i10 = 0; i10 < i7; i10++) {
            Y y10 = ((L) objArr[i10]).f61T.f106q;
            kotlin.jvm.internal.l.b(y10);
            y10.f149x = H.f32c;
        }
        L l10 = n0Var.f293z;
        U.h0(this, l10.f53K.c(this, l10.m(), j));
        return this;
    }

    @Override // A0.U
    public final void i0() {
        Y y10 = this.f124z.f293z.f61T.f106q;
        kotlin.jvm.internal.l.b(y10);
        y10.U();
    }
}
