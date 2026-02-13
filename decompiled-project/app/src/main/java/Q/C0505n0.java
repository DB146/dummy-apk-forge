package Q;

import u.C2041D;
import u.C2046I;

/* renamed from: Q.n0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0505n0 {

    /* renamed from: a, reason: collision with root package name */
    public int f8429a;

    /* renamed from: b, reason: collision with root package name */
    public C0517u f8430b;

    /* renamed from: c, reason: collision with root package name */
    public C0478a f8431c;

    /* renamed from: d, reason: collision with root package name */
    public Rb.e f8432d;

    /* renamed from: e, reason: collision with root package name */
    public int f8433e;

    /* renamed from: f, reason: collision with root package name */
    public C2041D f8434f;
    public C2046I g;

    public C0505n0(C0517u c0517u) {
        this.f8430b = c0517u;
    }

    public static boolean a(C c10, C2046I c2046i) {
        kotlin.jvm.internal.l.c(c10, "null cannot be cast to non-null type androidx.compose.runtime.DerivedState<kotlin.Any?>");
        S s3 = c10.f8275c;
        if (s3 == null) {
            s3 = S.f8368f;
        }
        return !s3.a(c10.f().f8273f, c2046i.g(c10));
    }

    public final boolean b() {
        if (this.f8430b == null) {
            return false;
        }
        C0478a c0478a = this.f8431c;
        return c0478a != null ? c0478a.a() : false;
    }

    public final M c(Object obj) {
        M q10;
        C0517u c0517u = this.f8430b;
        return (c0517u == null || (q10 = c0517u.q(this, obj)) == null) ? M.f8329a : q10;
    }

    public final void d() {
        C0517u c0517u = this.f8430b;
        if (c0517u != null) {
            c0517u.f8522C = true;
        }
        this.f8430b = null;
        this.f8434f = null;
        this.g = null;
    }

    public final void e(boolean z8) {
        if (z8) {
            this.f8429a |= 32;
        } else {
            this.f8429a &= -33;
        }
    }
}
