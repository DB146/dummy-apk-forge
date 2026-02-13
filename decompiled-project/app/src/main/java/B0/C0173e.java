package B0;

import K0.C0371a;
import java.util.ArrayList;

/* renamed from: B0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0173e extends AbstractC0169c {

    /* renamed from: d, reason: collision with root package name */
    public static C0173e f1876d;

    /* renamed from: e, reason: collision with root package name */
    public static final U0.j f1877e = U0.j.f9429b;

    /* renamed from: f, reason: collision with root package name */
    public static final U0.j f1878f = U0.j.f9428a;

    /* renamed from: c, reason: collision with root package name */
    public K0.C f1879c;

    @Override // B0.AbstractC0169c
    public final int[] e(int i7) {
        int i10;
        if (i().length() <= 0 || i7 >= i().length()) {
            return null;
        }
        U0.j jVar = f1877e;
        if (i7 < 0) {
            K0.C c10 = this.f1879c;
            if (c10 == null) {
                kotlin.jvm.internal.l.j("layoutResult");
                throw null;
            }
            i10 = c10.a(0);
        } else {
            K0.C c11 = this.f1879c;
            if (c11 == null) {
                kotlin.jvm.internal.l.j("layoutResult");
                throw null;
            }
            int a9 = c11.a(i7);
            i10 = o(a9, jVar) == i7 ? a9 : a9 + 1;
        }
        K0.C c12 = this.f1879c;
        if (c12 == null) {
            kotlin.jvm.internal.l.j("layoutResult");
            throw null;
        }
        if (i10 >= c12.f5842b.f3937b) {
            return null;
        }
        return h(o(i10, jVar), o(i10, f1878f) + 1);
    }

    @Override // B0.AbstractC0169c
    public final int[] l(int i7) {
        int i10;
        if (i().length() <= 0 || i7 <= 0) {
            return null;
        }
        int length = i().length();
        U0.j jVar = f1878f;
        if (i7 > length) {
            K0.C c10 = this.f1879c;
            if (c10 == null) {
                kotlin.jvm.internal.l.j("layoutResult");
                throw null;
            }
            i10 = c10.a(i().length());
        } else {
            K0.C c11 = this.f1879c;
            if (c11 == null) {
                kotlin.jvm.internal.l.j("layoutResult");
                throw null;
            }
            int a9 = c11.a(i7);
            i10 = o(a9, jVar) + 1 == i7 ? a9 : a9 - 1;
        }
        if (i10 < 0) {
            return null;
        }
        return h(o(i10, f1877e), o(i10, jVar) + 1);
    }

    public final int o(int i7, U0.j jVar) {
        K0.C c10 = this.f1879c;
        if (c10 == null) {
            kotlin.jvm.internal.l.j("layoutResult");
            throw null;
        }
        int c11 = c10.c(i7);
        K0.C c12 = this.f1879c;
        if (c12 == null) {
            kotlin.jvm.internal.l.j("layoutResult");
            throw null;
        }
        if (jVar != c12.e(c11)) {
            K0.C c13 = this.f1879c;
            if (c13 != null) {
                return c13.c(i7);
            }
            kotlin.jvm.internal.l.j("layoutResult");
            throw null;
        }
        K0.C c14 = this.f1879c;
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
