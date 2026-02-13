package C3;

import i2.C1332t;

/* loaded from: classes.dex */
public final class z implements A, X3.b {

    /* renamed from: e, reason: collision with root package name */
    public static final Q7.h f2644e = X3.d.a(20, new C1332t(2));

    /* renamed from: a, reason: collision with root package name */
    public final X3.e f2645a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public A f2646b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2647c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f2648d;

    @Override // X3.b
    public final X3.e a() {
        return this.f2645a;
    }

    @Override // C3.A
    public final int b() {
        return this.f2646b.b();
    }

    @Override // C3.A
    public final Class c() {
        return this.f2646b.c();
    }

    @Override // C3.A
    public final synchronized void d() {
        this.f2645a.a();
        this.f2648d = true;
        if (!this.f2647c) {
            this.f2646b.d();
            this.f2646b = null;
            f2644e.M(this);
        }
    }

    public final synchronized void e() {
        this.f2645a.a();
        if (!this.f2647c) {
            throw new IllegalStateException("Already unlocked");
        }
        this.f2647c = false;
        if (this.f2648d) {
            d();
        }
    }

    @Override // C3.A
    public final Object get() {
        return this.f2646b.get();
    }
}
