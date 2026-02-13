package rc;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class J {

    /* renamed from: d, reason: collision with root package name */
    public static final I f23942d = new Object();

    /* renamed from: a, reason: collision with root package name */
    public boolean f23943a;

    /* renamed from: b, reason: collision with root package name */
    public long f23944b;

    /* renamed from: c, reason: collision with root package name */
    public long f23945c;

    public J a() {
        this.f23943a = false;
        return this;
    }

    public J b() {
        this.f23945c = 0L;
        return this;
    }

    public long c() {
        if (this.f23943a) {
            return this.f23944b;
        }
        throw new IllegalStateException("No deadline");
    }

    public J d(long j) {
        this.f23943a = true;
        this.f23944b = j;
        return this;
    }

    public boolean e() {
        return this.f23943a;
    }

    public void f() {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        if (this.f23943a && this.f23944b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public J g(long j, TimeUnit unit) {
        kotlin.jvm.internal.l.e(unit, "unit");
        if (j < 0) {
            throw new IllegalArgumentException(A3.c.h("timeout < 0: ", j).toString());
        }
        this.f23945c = unit.toNanos(j);
        return this;
    }
}
