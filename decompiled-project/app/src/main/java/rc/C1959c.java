package rc;

import java.io.IOException;
import java.io.OutputStream;

/* renamed from: rc.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1959c implements G {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23951a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f23952b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f23953c;

    public /* synthetic */ C1959c(int i7, Object obj, Object obj2) {
        this.f23951a = i7;
        this.f23952b = obj;
        this.f23953c = obj2;
    }

    @Override // rc.G, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f23951a) {
            case 0:
                C1959c c1959c = (C1959c) this.f23953c;
                sc.f fVar = (sc.f) this.f23952b;
                fVar.h();
                try {
                    c1959c.close();
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
                ((OutputStream) this.f23952b).close();
                return;
        }
    }

    @Override // rc.G
    public final J e() {
        switch (this.f23951a) {
            case 0:
                return (sc.f) this.f23952b;
            default:
                return (J) this.f23953c;
        }
    }

    @Override // rc.G, java.io.Flushable
    public final void flush() {
        switch (this.f23951a) {
            case 0:
                C1959c c1959c = (C1959c) this.f23953c;
                sc.f fVar = (sc.f) this.f23952b;
                fVar.h();
                try {
                    c1959c.flush();
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
                ((OutputStream) this.f23952b).flush();
                return;
        }
    }

    @Override // rc.G
    public final void m(long j, C1964h c1964h) {
        switch (this.f23951a) {
            case 0:
                AbstractC1958b.e(c1964h.f23966b, 0L, j);
                while (true) {
                    long j10 = 0;
                    if (j <= 0) {
                        return;
                    }
                    D d10 = c1964h.f23965a;
                    kotlin.jvm.internal.l.b(d10);
                    while (true) {
                        if (j10 < 65536) {
                            j10 += d10.f23933c - d10.f23932b;
                            if (j10 >= j) {
                                j10 = j;
                            } else {
                                d10 = d10.f23936f;
                                kotlin.jvm.internal.l.b(d10);
                            }
                        }
                    }
                    C1959c c1959c = (C1959c) this.f23953c;
                    sc.f fVar = (sc.f) this.f23952b;
                    fVar.h();
                    try {
                        c1959c.m(j10, c1964h);
                        if (fVar.i()) {
                            throw fVar.k(null);
                        }
                        j -= j10;
                    } catch (IOException e2) {
                        if (!fVar.i()) {
                            throw e2;
                        }
                        throw fVar.k(e2);
                    } finally {
                        fVar.i();
                    }
                }
            default:
                AbstractC1958b.e(c1964h.f23966b, 0L, j);
                while (j > 0) {
                    ((J) this.f23953c).f();
                    D d11 = c1964h.f23965a;
                    kotlin.jvm.internal.l.b(d11);
                    int min = (int) Math.min(j, d11.f23933c - d11.f23932b);
                    ((OutputStream) this.f23952b).write(d11.f23931a, d11.f23932b, min);
                    int i7 = d11.f23932b + min;
                    d11.f23932b = i7;
                    long j11 = min;
                    j -= j11;
                    c1964h.f23966b -= j11;
                    if (i7 == d11.f23933c) {
                        c1964h.f23965a = d11.a();
                        E.a(d11);
                    }
                }
                return;
        }
    }

    public final String toString() {
        switch (this.f23951a) {
            case 0:
                return "AsyncTimeout.sink(" + ((C1959c) this.f23953c) + ')';
            default:
                return "sink(" + ((OutputStream) this.f23952b) + ')';
        }
    }
}
