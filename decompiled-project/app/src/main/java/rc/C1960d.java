package rc;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: rc.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1960d implements H {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23954a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f23955b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f23956c;

    public /* synthetic */ C1960d(int i7, Object obj, Object obj2) {
        this.f23954a = i7;
        this.f23955b = obj;
        this.f23956c = obj2;
    }

    @Override // rc.H
    public final long O(long j, C1964h sink) {
        switch (this.f23954a) {
            case 0:
                kotlin.jvm.internal.l.e(sink, "sink");
                C1960d c1960d = (C1960d) this.f23956c;
                sc.f fVar = (sc.f) this.f23955b;
                fVar.h();
                try {
                    long O10 = c1960d.O(j, sink);
                    if (fVar.i()) {
                        throw fVar.k(null);
                    }
                    return O10;
                } catch (IOException e2) {
                    if (fVar.i()) {
                        throw fVar.k(e2);
                    }
                    throw e2;
                } finally {
                    fVar.i();
                }
            default:
                kotlin.jvm.internal.l.e(sink, "sink");
                if (j == 0) {
                    return 0L;
                }
                if (j < 0) {
                    throw new IllegalArgumentException(A3.c.h("byteCount < 0: ", j).toString());
                }
                try {
                    ((J) this.f23956c).f();
                    D h02 = sink.h0(1);
                    int read = ((InputStream) this.f23955b).read(h02.f23931a, h02.f23933c, (int) Math.min(j, 8192 - h02.f23933c));
                    if (read == -1) {
                        if (h02.f23932b == h02.f23933c) {
                            sink.f23965a = h02.a();
                            E.a(h02);
                        }
                        return -1L;
                    }
                    h02.f23933c += read;
                    long j10 = read;
                    sink.f23966b += j10;
                    return j10;
                } catch (AssertionError e10) {
                    if (sc.j.a(e10)) {
                        throw new IOException(e10);
                    }
                    throw e10;
                }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f23954a) {
            case 0:
                C1960d c1960d = (C1960d) this.f23956c;
                sc.f fVar = (sc.f) this.f23955b;
                fVar.h();
                try {
                    c1960d.close();
                    if (fVar.i()) {
                        throw fVar.k(null);
                    }
                    return;
                } catch (IOException e2) {
                    if (!fVar.i()) {
                        throw e2;
                    }
                    throw fVar.k(e2);
                } finally {
                    fVar.i();
                }
            default:
                ((InputStream) this.f23955b).close();
                return;
        }
    }

    @Override // rc.H
    public final J e() {
        switch (this.f23954a) {
            case 0:
                return (sc.f) this.f23955b;
            default:
                return (J) this.f23956c;
        }
    }

    public final String toString() {
        switch (this.f23954a) {
            case 0:
                return "AsyncTimeout.source(" + ((C1960d) this.f23956c) + ')';
            default:
                return "source(" + ((InputStream) this.f23955b) + ')';
        }
    }
}
