package Q7;

import L7.C0385e;
import T7.m;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public boolean f8669a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f8670b;

    /* renamed from: c, reason: collision with root package name */
    public Object f8671c;

    public a(m mVar, boolean z8, boolean z10) {
        this.f8671c = mVar;
        this.f8669a = z8;
        this.f8670b = z10;
    }

    public boolean a(T7.c cVar) {
        return (this.f8669a && !this.f8670b) || ((m) this.f8671c).f9350a.n(cVar);
    }

    public boolean b(C0385e c0385e) {
        return c0385e.isEmpty() ? this.f8669a && !this.f8670b : a(c0385e.C());
    }
}
