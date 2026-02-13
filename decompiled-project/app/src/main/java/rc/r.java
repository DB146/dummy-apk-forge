package rc;

import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class r extends J {

    /* renamed from: e, reason: collision with root package name */
    public J f23984e;

    public r(J delegate) {
        kotlin.jvm.internal.l.e(delegate, "delegate");
        this.f23984e = delegate;
    }

    @Override // rc.J
    public final J a() {
        return this.f23984e.a();
    }

    @Override // rc.J
    public final J b() {
        return this.f23984e.b();
    }

    @Override // rc.J
    public final long c() {
        return this.f23984e.c();
    }

    @Override // rc.J
    public final J d(long j) {
        return this.f23984e.d(j);
    }

    @Override // rc.J
    public final boolean e() {
        return this.f23984e.e();
    }

    @Override // rc.J
    public final void f() {
        this.f23984e.f();
    }

    @Override // rc.J
    public final J g(long j, TimeUnit unit) {
        kotlin.jvm.internal.l.e(unit, "unit");
        return this.f23984e.g(j, unit);
    }
}
