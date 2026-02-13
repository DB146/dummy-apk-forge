package rc;

import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes2.dex */
public final class n implements H {

    /* renamed from: a, reason: collision with root package name */
    public final v f23977a;

    /* renamed from: b, reason: collision with root package name */
    public long f23978b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f23979c;

    public n(v fileHandle, long j) {
        kotlin.jvm.internal.l.e(fileHandle, "fileHandle");
        this.f23977a = fileHandle;
        this.f23978b = j;
    }

    @Override // rc.H
    public final long O(long j, C1964h sink) {
        long j10;
        long j11;
        int i7;
        int i10;
        kotlin.jvm.internal.l.e(sink, "sink");
        if (this.f23979c) {
            throw new IllegalStateException("closed");
        }
        v vVar = this.f23977a;
        long j12 = this.f23978b;
        vVar.getClass();
        if (j < 0) {
            throw new IllegalArgumentException(A3.c.h("byteCount < 0: ", j).toString());
        }
        long j13 = j + j12;
        long j14 = j12;
        while (true) {
            if (j14 >= j13) {
                break;
            }
            D h02 = sink.h0(1);
            byte[] array = h02.f23931a;
            int i11 = h02.f23933c;
            int min = (int) Math.min(j13 - j14, 8192 - i11);
            synchronized (vVar) {
                kotlin.jvm.internal.l.e(array, "array");
                vVar.f24003e.seek(j14);
                i7 = 0;
                while (true) {
                    if (i7 >= min) {
                        break;
                    }
                    int read = vVar.f24003e.read(array, i11, min - i7);
                    if (read != -1) {
                        i7 += read;
                    } else if (i7 == 0) {
                        i10 = -1;
                        i7 = -1;
                    }
                }
                i10 = -1;
            }
            if (i7 == i10) {
                if (h02.f23932b == h02.f23933c) {
                    sink.f23965a = h02.a();
                    E.a(h02);
                }
                if (j12 == j14) {
                    j11 = -1;
                    j10 = -1;
                }
            } else {
                h02.f23933c += i7;
                long j15 = i7;
                j14 += j15;
                sink.f23966b += j15;
            }
        }
        j10 = j14 - j12;
        j11 = -1;
        if (j10 != j11) {
            this.f23978b += j10;
        }
        return j10;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f23979c) {
            return;
        }
        this.f23979c = true;
        v vVar = this.f23977a;
        ReentrantLock reentrantLock = vVar.f24002d;
        reentrantLock.lock();
        try {
            int i7 = vVar.f24001c - 1;
            vVar.f24001c = i7;
            if (i7 == 0) {
                if (vVar.f24000b) {
                    synchronized (vVar) {
                        vVar.f24003e.close();
                    }
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // rc.H
    public final J e() {
        return J.f23942d;
    }
}
