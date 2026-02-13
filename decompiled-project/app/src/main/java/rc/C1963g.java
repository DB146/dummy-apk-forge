package rc;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: rc.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1963g extends InputStream {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23963a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1966j f23964b;

    public /* synthetic */ C1963g(InterfaceC1966j interfaceC1966j, int i7) {
        this.f23963a = i7;
        this.f23964b = interfaceC1966j;
    }

    private final void l() {
    }

    @Override // java.io.InputStream
    public final int available() {
        switch (this.f23963a) {
            case 0:
                return (int) Math.min(((C1964h) this.f23964b).f23966b, com.google.android.gms.common.api.f.API_PRIORITY_OTHER);
            default:
                C c10 = (C) this.f23964b;
                if (c10.f23930c) {
                    throw new IOException("closed");
                }
                return (int) Math.min(c10.f23929b.f23966b, com.google.android.gms.common.api.f.API_PRIORITY_OTHER);
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f23963a) {
            case 0:
                return;
            default:
                ((C) this.f23964b).close();
                return;
        }
    }

    @Override // java.io.InputStream
    public final int read() {
        switch (this.f23963a) {
            case 0:
                C1964h c1964h = (C1964h) this.f23964b;
                if (c1964h.f23966b > 0) {
                    return c1964h.V() & 255;
                }
                return -1;
            default:
                C c10 = (C) this.f23964b;
                if (c10.f23930c) {
                    throw new IOException("closed");
                }
                C1964h c1964h2 = c10.f23929b;
                if (c1964h2.f23966b == 0 && c10.f23928a.O(8192L, c1964h2) == -1) {
                    return -1;
                }
                return c1964h2.V() & 255;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] sink, int i7, int i10) {
        switch (this.f23963a) {
            case 0:
                kotlin.jvm.internal.l.e(sink, "sink");
                return ((C1964h) this.f23964b).U(sink, i7, i10);
            default:
                kotlin.jvm.internal.l.e(sink, "data");
                C c10 = (C) this.f23964b;
                if (c10.f23930c) {
                    throw new IOException("closed");
                }
                AbstractC1958b.e(sink.length, i7, i10);
                C1964h c1964h = c10.f23929b;
                if (c1964h.f23966b == 0 && c10.f23928a.O(8192L, c1964h) == -1) {
                    return -1;
                }
                return c1964h.U(sink, i7, i10);
        }
    }

    public final String toString() {
        switch (this.f23963a) {
            case 0:
                return ((C1964h) this.f23964b) + ".inputStream()";
            default:
                return ((C) this.f23964b) + ".inputStream()";
        }
    }

    @Override // java.io.InputStream
    public long transferTo(OutputStream out) {
        switch (this.f23963a) {
            case 1:
                kotlin.jvm.internal.l.e(out, "out");
                C c10 = (C) this.f23964b;
                if (c10.f23930c) {
                    throw new IOException("closed");
                }
                long j = 0;
                long j10 = 0;
                while (true) {
                    C1964h c1964h = c10.f23929b;
                    if (c1964h.f23966b == j && c10.f23928a.O(8192L, c1964h) == -1) {
                        return j10;
                    }
                    long j11 = c1964h.f23966b;
                    j10 += j11;
                    AbstractC1958b.e(j11, 0L, j11);
                    D d10 = c1964h.f23965a;
                    while (j11 > j) {
                        kotlin.jvm.internal.l.b(d10);
                        int min = (int) Math.min(j11, d10.f23933c - d10.f23932b);
                        out.write(d10.f23931a, d10.f23932b, min);
                        int i7 = d10.f23932b + min;
                        d10.f23932b = i7;
                        long j12 = min;
                        c1964h.f23966b -= j12;
                        j11 -= j12;
                        if (i7 == d10.f23933c) {
                            D a9 = d10.a();
                            c1964h.f23965a = a9;
                            E.a(d10);
                            d10 = a9;
                        }
                        j = 0;
                    }
                }
                break;
            default:
                return super.transferTo(out);
        }
    }
}
