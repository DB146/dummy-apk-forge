package rc;

/* loaded from: classes2.dex */
public abstract class p implements G {

    /* renamed from: a, reason: collision with root package name */
    public final G f23982a;

    public p(G delegate) {
        kotlin.jvm.internal.l.e(delegate, "delegate");
        this.f23982a = delegate;
    }

    @Override // rc.G, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f23982a.close();
    }

    @Override // rc.G
    public final J e() {
        return this.f23982a.e();
    }

    @Override // rc.G, java.io.Flushable
    public void flush() {
        this.f23982a.flush();
    }

    @Override // rc.G
    public void m(long j, C1964h c1964h) {
        this.f23982a.m(j, c1964h);
    }

    public final String toString() {
        return getClass().getSimpleName() + '(' + this.f23982a + ')';
    }
}
