package cc;

import hc.C1271A;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes2.dex */
public abstract class X implements Runnable, Comparable, S {
    private volatile Object _heap;

    /* renamed from: a, reason: collision with root package name */
    public long f14508a;

    /* renamed from: b, reason: collision with root package name */
    public int f14509b = -1;

    public X(long j) {
        this.f14508a = j;
    }

    public final int a(long j, Y y10, Z z8) {
        synchronized (this) {
            if (this._heap == F.f14472b) {
                return 2;
            }
            synchronized (y10) {
                try {
                    X[] xArr = y10.f17924a;
                    X x2 = xArr != null ? xArr[0] : null;
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = Z.f14511u;
                    z8.getClass();
                    if (Z.f14513w.get(z8) != 0) {
                        return 1;
                    }
                    if (x2 == null) {
                        y10.f14510c = j;
                    } else {
                        long j10 = x2.f14508a;
                        if (j10 - j < 0) {
                            j = j10;
                        }
                        if (j - y10.f14510c > 0) {
                            y10.f14510c = j;
                        }
                    }
                    long j11 = this.f14508a;
                    long j12 = y10.f14510c;
                    if (j11 - j12 < 0) {
                        this.f14508a = j12;
                    }
                    y10.a(this);
                    return 0;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // cc.S
    public final void b() {
        synchronized (this) {
            try {
                Object obj = this._heap;
                R7.a aVar = F.f14472b;
                if (obj == aVar) {
                    return;
                }
                Y y10 = obj instanceof Y ? (Y) obj : null;
                if (y10 != null) {
                    synchronized (y10) {
                        Object obj2 = this._heap;
                        if ((obj2 instanceof C1271A ? (C1271A) obj2 : null) != null) {
                            y10.b(this.f14509b);
                        }
                    }
                }
                this._heap = aVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j = this.f14508a - ((X) obj).f14508a;
        if (j > 0) {
            return 1;
        }
        return j < 0 ? -1 : 0;
    }

    public final void f(Y y10) {
        if (this._heap == F.f14472b) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this._heap = y10;
    }

    public String toString() {
        return "Delayed[nanos=" + this.f14508a + ']';
    }
}
