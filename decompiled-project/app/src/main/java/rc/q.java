package rc;

/* loaded from: classes2.dex */
public abstract class q implements H {

    /* renamed from: a, reason: collision with root package name */
    public final H f23983a;

    public q(H delegate) {
        kotlin.jvm.internal.l.e(delegate, "delegate");
        this.f23983a = delegate;
    }

    @Override // rc.H
    public long O(long j, C1964h sink) {
        kotlin.jvm.internal.l.e(sink, "sink");
        return this.f23983a.O(j, sink);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f23983a.close();
    }

    @Override // rc.H
    public final J e() {
        return this.f23983a.e();
    }

    public final String toString() {
        return getClass().getSimpleName() + '(' + this.f23983a + ')';
    }
}
