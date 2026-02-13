package rc;

import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes2.dex */
public final class m implements G {

    /* renamed from: a, reason: collision with root package name */
    public final v f23974a;

    /* renamed from: b, reason: collision with root package name */
    public long f23975b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f23976c;

    public m(v fileHandle) {
        kotlin.jvm.internal.l.e(fileHandle, "fileHandle");
        this.f23974a = fileHandle;
        this.f23975b = 0L;
    }

    @Override // rc.G, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f23976c) {
            return;
        }
        this.f23976c = true;
        v vVar = this.f23974a;
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

    @Override // rc.G
    public final J e() {
        return J.f23942d;
    }

    @Override // rc.G, java.io.Flushable
    public final void flush() {
        if (this.f23976c) {
            throw new IllegalStateException("closed");
        }
        v vVar = this.f23974a;
        synchronized (vVar) {
            vVar.f24003e.getFD().sync();
        }
    }

    @Override // rc.G
    public final void m(long j, C1964h c1964h) {
        if (this.f23976c) {
            throw new IllegalStateException("closed");
        }
        v vVar = this.f23974a;
        long j10 = this.f23975b;
        vVar.getClass();
        AbstractC1958b.e(c1964h.f23966b, 0L, j);
        long j11 = j10 + j;
        while (j10 < j11) {
            D d10 = c1964h.f23965a;
            kotlin.jvm.internal.l.b(d10);
            int min = (int) Math.min(j11 - j10, d10.f23933c - d10.f23932b);
            byte[] array = d10.f23931a;
            int i7 = d10.f23932b;
            synchronized (vVar) {
                kotlin.jvm.internal.l.e(array, "array");
                vVar.f24003e.seek(j10);
                vVar.f24003e.write(array, i7, min);
            }
            int i10 = d10.f23932b + min;
            d10.f23932b = i10;
            long j12 = min;
            j10 += j12;
            c1964h.f23966b -= j12;
            if (i10 == d10.f23933c) {
                c1964h.f23965a = d10.a();
                E.a(d10);
            }
        }
        this.f23975b += j;
    }
}
