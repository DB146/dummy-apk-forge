package x;

import ea.C1111f;

/* loaded from: classes.dex */
public final class Z implements InterfaceC2233c {

    /* renamed from: a, reason: collision with root package name */
    public final q0 f26025a;

    /* renamed from: b, reason: collision with root package name */
    public final C1111f f26026b;

    /* renamed from: c, reason: collision with root package name */
    public Object f26027c;

    /* renamed from: d, reason: collision with root package name */
    public Object f26028d;

    /* renamed from: e, reason: collision with root package name */
    public AbstractC2243m f26029e;

    /* renamed from: f, reason: collision with root package name */
    public AbstractC2243m f26030f;
    public final AbstractC2243m g;

    /* renamed from: h, reason: collision with root package name */
    public long f26031h;

    /* renamed from: i, reason: collision with root package name */
    public AbstractC2243m f26032i;

    public Z(InterfaceC2237g interfaceC2237g, C1111f c1111f, Object obj, Object obj2, AbstractC2243m abstractC2243m) {
        this.f26025a = interfaceC2237g.a(c1111f);
        this.f26026b = c1111f;
        this.f26027c = obj2;
        this.f26028d = obj;
        this.f26029e = (AbstractC2243m) ((Rb.c) c1111f.f16837b).invoke(obj);
        Rb.c cVar = (Rb.c) c1111f.f16837b;
        this.f26030f = (AbstractC2243m) cVar.invoke(obj2);
        this.g = abstractC2243m != null ? AbstractC2232b.f(abstractC2243m) : ((AbstractC2243m) cVar.invoke(obj)).c();
        this.f26031h = -1L;
    }

    public final void a(Object obj) {
        if (kotlin.jvm.internal.l.a(obj, this.f26028d)) {
            return;
        }
        this.f26028d = obj;
        this.f26029e = (AbstractC2243m) ((Rb.c) this.f26026b.f16837b).invoke(obj);
        this.f26032i = null;
        this.f26031h = -1L;
    }

    @Override // x.InterfaceC2233c
    public final boolean b() {
        return this.f26025a.b();
    }

    @Override // x.InterfaceC2233c
    public final Object c(long j) {
        if (h(j)) {
            return this.f26027c;
        }
        AbstractC2243m n6 = this.f26025a.n(j, this.f26029e, this.f26030f, this.g);
        int b2 = n6.b();
        for (int i7 = 0; i7 < b2; i7++) {
            if (Float.isNaN(n6.a(i7))) {
                AbstractC2230C.b("AnimationVector cannot contain a NaN. " + n6 + ". Animation: " + this + ", playTimeNanos: " + j);
            }
        }
        return ((Rb.c) this.f26026b.f16838c).invoke(n6);
    }

    @Override // x.InterfaceC2233c
    public final long d() {
        if (this.f26031h < 0) {
            this.f26031h = this.f26025a.h(this.f26029e, this.f26030f, this.g);
        }
        return this.f26031h;
    }

    @Override // x.InterfaceC2233c
    public final C1111f e() {
        return this.f26026b;
    }

    @Override // x.InterfaceC2233c
    public final Object f() {
        return this.f26027c;
    }

    @Override // x.InterfaceC2233c
    public final AbstractC2243m g(long j) {
        if (!h(j)) {
            return this.f26025a.d(j, this.f26029e, this.f26030f, this.g);
        }
        AbstractC2243m abstractC2243m = this.f26032i;
        if (abstractC2243m != null) {
            return abstractC2243m;
        }
        AbstractC2243m o10 = this.f26025a.o(this.f26029e, this.f26030f, this.g);
        this.f26032i = o10;
        return o10;
    }

    public final void i(Object obj) {
        if (kotlin.jvm.internal.l.a(this.f26027c, obj)) {
            return;
        }
        this.f26027c = obj;
        this.f26030f = (AbstractC2243m) ((Rb.c) this.f26026b.f16837b).invoke(obj);
        this.f26032i = null;
        this.f26031h = -1L;
    }

    public final String toString() {
        return "TargetBasedAnimation: " + this.f26028d + " -> " + this.f26027c + ",initial velocity: " + this.g + ", duration: " + (d() / 1000000) + " ms,animationSpec: " + this.f26025a;
    }
}
