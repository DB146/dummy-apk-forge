package B0;

import K0.C0371a;
import java.util.ArrayList;

/* renamed from: B0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0175f extends AbstractC0169c {

    /* renamed from: e, reason: collision with root package name */
    public static C0175f f1881e;

    /* renamed from: f, reason: collision with root package name */
    public static final U0.j f1882f = U0.j.f9429b;

    /* renamed from: u, reason: collision with root package name */
    public static final U0.j f1883u = U0.j.f9428a;

    /* renamed from: c, reason: collision with root package name */
    public K0.C f1884c;

    /* renamed from: d, reason: collision with root package name */
    public H0.n f1885d;

    @Override // B0.AbstractC0169c
    public final int[] e(int i7) {
        int i10;
        if (i().length() <= 0 || i7 >= i().length()) {
            return null;
        }
        try {
            H0.n nVar = this.f1885d;
            if (nVar == null) {
                kotlin.jvm.internal.l.j("node");
                throw null;
            }
            i0.c e2 = nVar.e();
            int round = Math.round(e2.f18177d - e2.f18175b);
            if (i7 <= 0) {
                i7 = 0;
            }
            K0.C c10 = this.f1884c;
            if (c10 == null) {
                kotlin.jvm.internal.l.j("layoutResult");
                throw null;
            }
            int a9 = c10.a(i7);
            K0.C c11 = this.f1884c;
            if (c11 == null) {
                kotlin.jvm.internal.l.j("layoutResult");
                throw null;
            }
            float d10 = c11.d(a9) + round;
            K0.C c12 = this.f1884c;
            if (c12 == null) {
                kotlin.jvm.internal.l.j("layoutResult");
                throw null;
            }
            if (c12 == null) {
                kotlin.jvm.internal.l.j("layoutResult");
                throw null;
            }
            if (d10 < c12.d(c12.f5842b.f3937b - 1)) {
                K0.C c13 = this.f1884c;
                if (c13 == null) {
                    kotlin.jvm.internal.l.j("layoutResult");
                    throw null;
                }
                i10 = c13.b(d10);
            } else {
                K0.C c14 = this.f1884c;
                if (c14 == null) {
                    kotlin.jvm.internal.l.j("layoutResult");
                    throw null;
                }
                i10 = c14.f5842b.f3937b;
            }
            return h(i7, o(i10 - 1, f1883u) + 1);
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    @Override // B0.AbstractC0169c
    public final int[] l(int i7) {
        int i10;
        if (i().length() <= 0 || i7 <= 0) {
            return null;
        }
        try {
            H0.n nVar = this.f1885d;
            if (nVar == null) {
                kotlin.jvm.internal.l.j("node");
                throw null;
            }
            i0.c e2 = nVar.e();
            int round = Math.round(e2.f18177d - e2.f18175b);
            int length = i().length();
            if (length <= i7) {
                i7 = length;
            }
            K0.C c10 = this.f1884c;
            if (c10 == null) {
                kotlin.jvm.internal.l.j("layoutResult");
                throw null;
            }
            int a9 = c10.a(i7);
            K0.C c11 = this.f1884c;
            if (c11 == null) {
                kotlin.jvm.internal.l.j("layoutResult");
                throw null;
            }
            float d10 = c11.d(a9) - round;
            if (d10 > 0.0f) {
                K0.C c12 = this.f1884c;
                if (c12 == null) {
                    kotlin.jvm.internal.l.j("layoutResult");
                    throw null;
                }
                i10 = c12.b(d10);
            } else {
                i10 = 0;
            }
            if (i7 == i().length() && i10 < a9) {
                i10++;
            }
            return h(o(i10, f1882f), i7);
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    public final int o(int i7, U0.j jVar) {
        K0.C c10 = this.f1884c;
        if (c10 == null) {
            kotlin.jvm.internal.l.j("layoutResult");
            throw null;
        }
        int c11 = c10.c(i7);
        K0.C c12 = this.f1884c;
        if (c12 == null) {
            kotlin.jvm.internal.l.j("layoutResult");
            throw null;
        }
        if (jVar != c12.e(c11)) {
            K0.C c13 = this.f1884c;
            if (c13 != null) {
                return c13.c(i7);
            }
            kotlin.jvm.internal.l.j("layoutResult");
            throw null;
        }
        K0.C c14 = this.f1884c;
        if (c14 == null) {
            kotlin.jvm.internal.l.j("layoutResult");
            throw null;
        }
        F.Q q10 = c14.f5842b;
        q10.g(i7);
        ArrayList arrayList = (ArrayList) q10.f3940e;
        C0371a c0371a = ((K0.m) arrayList.get(vc.i.r(i7, arrayList))).f5916a;
        return (c0371a.f5863d.e(i7 - r6.f5919d) + r6.f5917b) - 1;
    }
}
