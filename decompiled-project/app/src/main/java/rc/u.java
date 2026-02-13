package rc;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* loaded from: classes2.dex */
public final class u implements H {

    /* renamed from: a, reason: collision with root package name */
    public final C f23995a;

    /* renamed from: b, reason: collision with root package name */
    public final Inflater f23996b;

    /* renamed from: c, reason: collision with root package name */
    public int f23997c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f23998d;

    public u(C c10, Inflater inflater) {
        this.f23995a = c10;
        this.f23996b = inflater;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0086 A[SYNTHETIC] */
    @Override // rc.H
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long O(long j, C1964h sink) {
        C c10;
        long j10;
        kotlin.jvm.internal.l.e(sink, "sink");
        do {
            Inflater inflater = this.f23996b;
            if (j < 0) {
                throw new IllegalArgumentException(A3.c.h("byteCount < 0: ", j).toString());
            }
            if (this.f23998d) {
                throw new IllegalStateException("closed");
            }
            c10 = this.f23995a;
            if (j != 0) {
                try {
                    D h02 = sink.h0(1);
                    int min = (int) Math.min(j, 8192 - h02.f23933c);
                    if (inflater.needsInput() && !c10.l()) {
                        D d10 = c10.f23929b.f23965a;
                        kotlin.jvm.internal.l.b(d10);
                        int i7 = d10.f23933c;
                        int i10 = d10.f23932b;
                        int i11 = i7 - i10;
                        this.f23997c = i11;
                        inflater.setInput(d10.f23931a, i10, i11);
                    }
                    int inflate = inflater.inflate(h02.f23931a, h02.f23933c, min);
                    int i12 = this.f23997c;
                    if (i12 != 0) {
                        int remaining = i12 - inflater.getRemaining();
                        this.f23997c -= remaining;
                        c10.a0(remaining);
                    }
                    if (inflate > 0) {
                        h02.f23933c += inflate;
                        j10 = inflate;
                        sink.f23966b += j10;
                        if (j10 <= 0) {
                            return j10;
                        }
                        if (inflater.finished() || inflater.needsDictionary()) {
                            return -1L;
                        }
                    } else if (h02.f23932b == h02.f23933c) {
                        sink.f23965a = h02.a();
                        E.a(h02);
                    }
                } catch (DataFormatException e2) {
                    throw new IOException(e2);
                }
            }
            j10 = 0;
            if (j10 <= 0) {
            }
        } while (!c10.l());
        throw new EOFException("source exhausted prematurely");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f23998d) {
            return;
        }
        this.f23996b.end();
        this.f23998d = true;
        this.f23995a.close();
    }

    @Override // rc.H
    public final J e() {
        return this.f23995a.f23928a.e();
    }
}
