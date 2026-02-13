package K2;

import a.AbstractC0672a;

/* loaded from: classes.dex */
public final class q implements T2.c {

    /* renamed from: a, reason: collision with root package name */
    public final T2.c f6073a;

    /* renamed from: b, reason: collision with root package name */
    public final long f6074b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x f6075c;

    public q(x xVar, T2.c delegate) {
        kotlin.jvm.internal.l.e(delegate, "delegate");
        this.f6075c = xVar;
        this.f6073a = delegate;
        this.f6074b = c2.i.l();
    }

    @Override // T2.c
    public final boolean E(int i7) {
        if (this.f6075c.f6107d.get()) {
            AbstractC0672a.s(21, "Statement is recycled");
            throw null;
        }
        if (this.f6074b == c2.i.l()) {
            return this.f6073a.E(i7);
        }
        AbstractC0672a.s(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // T2.c
    public final String G(int i7) {
        if (this.f6075c.f6107d.get()) {
            AbstractC0672a.s(21, "Statement is recycled");
            throw null;
        }
        if (this.f6074b == c2.i.l()) {
            return this.f6073a.G(i7);
        }
        AbstractC0672a.s(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // T2.c
    public final boolean J() {
        if (this.f6075c.f6107d.get()) {
            AbstractC0672a.s(21, "Statement is recycled");
            throw null;
        }
        if (this.f6074b == c2.i.l()) {
            return this.f6073a.J();
        }
        AbstractC0672a.s(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // T2.c
    public final void a(int i7) {
        if (this.f6075c.f6107d.get()) {
            AbstractC0672a.s(21, "Statement is recycled");
            throw null;
        }
        if (this.f6074b == c2.i.l()) {
            this.f6073a.a(i7);
        } else {
            AbstractC0672a.s(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    @Override // T2.c
    public final void b(int i7, double d10) {
        if (this.f6075c.f6107d.get()) {
            AbstractC0672a.s(21, "Statement is recycled");
            throw null;
        }
        if (this.f6074b == c2.i.l()) {
            this.f6073a.b(i7, d10);
        } else {
            AbstractC0672a.s(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.f6075c.f6107d.get()) {
            AbstractC0672a.s(21, "Statement is recycled");
            throw null;
        }
        if (this.f6074b == c2.i.l()) {
            this.f6073a.close();
        } else {
            AbstractC0672a.s(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    @Override // T2.c
    public final void f(int i7, long j) {
        if (this.f6075c.f6107d.get()) {
            AbstractC0672a.s(21, "Statement is recycled");
            throw null;
        }
        if (this.f6074b == c2.i.l()) {
            this.f6073a.f(i7, j);
        } else {
            AbstractC0672a.s(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    @Override // T2.c
    public final void g(int i7, byte[] bArr) {
        if (this.f6075c.f6107d.get()) {
            AbstractC0672a.s(21, "Statement is recycled");
            throw null;
        }
        if (this.f6074b == c2.i.l()) {
            this.f6073a.g(i7, bArr);
        } else {
            AbstractC0672a.s(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    @Override // T2.c
    public final String j(int i7) {
        if (this.f6075c.f6107d.get()) {
            AbstractC0672a.s(21, "Statement is recycled");
            throw null;
        }
        if (this.f6074b == c2.i.l()) {
            return this.f6073a.j(i7);
        }
        AbstractC0672a.s(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // T2.c
    public final int k() {
        if (this.f6075c.f6107d.get()) {
            AbstractC0672a.s(21, "Statement is recycled");
            throw null;
        }
        if (this.f6074b == c2.i.l()) {
            return this.f6073a.k();
        }
        AbstractC0672a.s(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // T2.c
    public final void reset() {
        if (this.f6075c.f6107d.get()) {
            AbstractC0672a.s(21, "Statement is recycled");
            throw null;
        }
        if (this.f6074b == c2.i.l()) {
            this.f6073a.reset();
        } else {
            AbstractC0672a.s(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    @Override // T2.c
    public final double s(int i7) {
        if (this.f6075c.f6107d.get()) {
            AbstractC0672a.s(21, "Statement is recycled");
            throw null;
        }
        if (this.f6074b == c2.i.l()) {
            return this.f6073a.s(i7);
        }
        AbstractC0672a.s(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // T2.c
    public final long x(int i7) {
        if (this.f6075c.f6107d.get()) {
            AbstractC0672a.s(21, "Statement is recycled");
            throw null;
        }
        if (this.f6074b == c2.i.l()) {
            return this.f6073a.x(i7);
        }
        AbstractC0672a.s(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // T2.c
    public final void y(int i7, String value) {
        kotlin.jvm.internal.l.e(value, "value");
        if (this.f6075c.f6107d.get()) {
            AbstractC0672a.s(21, "Statement is recycled");
            throw null;
        }
        if (this.f6074b == c2.i.l()) {
            this.f6073a.y(i7, value);
        } else {
            AbstractC0672a.s(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }
}
