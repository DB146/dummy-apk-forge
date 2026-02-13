package L2;

import V2.j;
import a.AbstractC0672a;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public final class f extends g {

    /* renamed from: d, reason: collision with root package name */
    public final j f6278d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(U2.a db2, String sql) {
        super(db2, sql);
        l.e(db2, "db");
        l.e(sql, "sql");
        this.f6278d = db2.q(sql);
    }

    @Override // T2.c
    public final boolean E(int i7) {
        l();
        AbstractC0672a.s(21, "no row");
        throw null;
    }

    @Override // T2.c
    public final String G(int i7) {
        l();
        AbstractC0672a.s(21, "no row");
        throw null;
    }

    @Override // T2.c
    public final boolean J() {
        l();
        this.f6278d.f10026b.execute();
        return false;
    }

    @Override // T2.c
    public final void a(int i7) {
        l();
        this.f6278d.a(i7);
    }

    @Override // T2.c
    public final void b(int i7, double d10) {
        l();
        this.f6278d.b(i7, d10);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f6278d.close();
        this.f6281c = true;
    }

    @Override // T2.c
    public final void f(int i7, long j) {
        l();
        this.f6278d.f(i7, j);
    }

    @Override // T2.c
    public final void g(int i7, byte[] bArr) {
        l();
        this.f6278d.g(i7, bArr);
    }

    @Override // T2.c
    public final String j(int i7) {
        l();
        AbstractC0672a.s(21, "no row");
        throw null;
    }

    @Override // T2.c
    public final int k() {
        l();
        return 0;
    }

    @Override // T2.c
    public final void reset() {
    }

    @Override // T2.c
    public final double s(int i7) {
        l();
        AbstractC0672a.s(21, "no row");
        throw null;
    }

    @Override // T2.c
    public final long x(int i7) {
        l();
        AbstractC0672a.s(21, "no row");
        throw null;
    }

    @Override // T2.c
    public final void y(int i7, String value) {
        l.e(value, "value");
        l();
        this.f6278d.p(i7, value);
    }
}
