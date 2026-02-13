package rc;

import java.io.Closeable;
import java.io.RandomAccessFile;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes2.dex */
public final class v implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f23999a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f24000b;

    /* renamed from: c, reason: collision with root package name */
    public int f24001c;

    /* renamed from: d, reason: collision with root package name */
    public final ReentrantLock f24002d = new ReentrantLock();

    /* renamed from: e, reason: collision with root package name */
    public final RandomAccessFile f24003e;

    public v(boolean z8, RandomAccessFile randomAccessFile) {
        this.f23999a = z8;
        this.f24003e = randomAccessFile;
    }

    public static m l(v vVar) {
        if (!vVar.f23999a) {
            throw new IllegalStateException("file handle is read-only");
        }
        ReentrantLock reentrantLock = vVar.f24002d;
        reentrantLock.lock();
        try {
            if (vVar.f24000b) {
                throw new IllegalStateException("closed");
            }
            vVar.f24001c++;
            reentrantLock.unlock();
            return new m(vVar);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final n F(long j) {
        ReentrantLock reentrantLock = this.f24002d;
        reentrantLock.lock();
        try {
            if (this.f24000b) {
                throw new IllegalStateException("closed");
            }
            this.f24001c++;
            reentrantLock.unlock();
            return new n(this, j);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ReentrantLock reentrantLock = this.f24002d;
        reentrantLock.lock();
        try {
            if (this.f24000b) {
                return;
            }
            this.f24000b = true;
            if (this.f24001c != 0) {
                return;
            }
            synchronized (this) {
                this.f24003e.close();
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void flush() {
        if (!this.f23999a) {
            throw new IllegalStateException("file handle is read-only");
        }
        ReentrantLock reentrantLock = this.f24002d;
        reentrantLock.lock();
        try {
            if (this.f24000b) {
                throw new IllegalStateException("closed");
            }
            synchronized (this) {
                this.f24003e.getFD().sync();
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final long n() {
        long length;
        ReentrantLock reentrantLock = this.f24002d;
        reentrantLock.lock();
        try {
            if (this.f24000b) {
                throw new IllegalStateException("closed");
            }
            synchronized (this) {
                length = this.f24003e.length();
            }
            return length;
        } finally {
            reentrantLock.unlock();
        }
    }
}
