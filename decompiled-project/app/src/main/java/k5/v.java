package k5;

import N6.H;
import P4.m0;
import java.util.Collections;
import java.util.List;
import m4.InterfaceC1569g;
import n5.D;

/* loaded from: classes.dex */
public final class v implements InterfaceC1569g {

    /* renamed from: c, reason: collision with root package name */
    public static final String f18965c;

    /* renamed from: d, reason: collision with root package name */
    public static final String f18966d;

    /* renamed from: a, reason: collision with root package name */
    public final m0 f18967a;

    /* renamed from: b, reason: collision with root package name */
    public final H f18968b;

    static {
        int i7 = D.f21141a;
        f18965c = Integer.toString(0, 36);
        f18966d = Integer.toString(1, 36);
    }

    public v(m0 m0Var, List list) {
        if (!list.isEmpty() && (((Integer) Collections.min(list)).intValue() < 0 || ((Integer) Collections.max(list)).intValue() >= m0Var.f8106a)) {
            throw new IndexOutOfBoundsException();
        }
        this.f18967a = m0Var;
        this.f18968b = H.F(list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || v.class != obj.getClass()) {
            return false;
        }
        v vVar = (v) obj;
        return this.f18967a.equals(vVar.f18967a) && this.f18968b.equals(vVar.f18968b);
    }

    public final int hashCode() {
        return (this.f18968b.hashCode() * 31) + this.f18967a.hashCode();
    }
}
