package N6;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public abstract class X extends ReentrantLock {

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ int f7260u = 0;

    /* renamed from: a, reason: collision with root package name */
    public final l0 f7261a;

    /* renamed from: b, reason: collision with root package name */
    public volatile int f7262b;

    /* renamed from: c, reason: collision with root package name */
    public int f7263c;

    /* renamed from: d, reason: collision with root package name */
    public int f7264d;

    /* renamed from: e, reason: collision with root package name */
    public volatile AtomicReferenceArray f7265e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicInteger f7266f = new AtomicInteger();

    public X(l0 l0Var, int i7) {
        this.f7261a = l0Var;
        AtomicReferenceArray atomicReferenceArray = new AtomicReferenceArray(i7);
        this.f7264d = (atomicReferenceArray.length() * 3) / 4;
        this.f7265e = atomicReferenceArray;
    }

    public final void a() {
        AtomicReferenceArray atomicReferenceArray = this.f7265e;
        int length = atomicReferenceArray.length();
        if (length >= 1073741824) {
            return;
        }
        int i7 = this.f7262b;
        AtomicReferenceArray atomicReferenceArray2 = new AtomicReferenceArray(length << 1);
        this.f7264d = (atomicReferenceArray2.length() * 3) / 4;
        int length2 = atomicReferenceArray2.length() - 1;
        for (int i10 = 0; i10 < length; i10++) {
            U u3 = (U) atomicReferenceArray.get(i10);
            if (u3 != null) {
                U d10 = u3.d();
                int c10 = u3.c() & length2;
                if (d10 == null) {
                    atomicReferenceArray2.set(c10, u3);
                } else {
                    U u10 = u3;
                    while (d10 != null) {
                        int c11 = d10.c() & length2;
                        if (c11 != c10) {
                            u10 = d10;
                            c10 = c11;
                        }
                        d10 = d10.d();
                    }
                    atomicReferenceArray2.set(c10, u10);
                    while (u3 != u10) {
                        int c12 = u3.c() & length2;
                        U d11 = this.f7261a.f7312f.d(i(), u3, (U) atomicReferenceArray2.get(c12));
                        if (d11 != null) {
                            atomicReferenceArray2.set(c12, d11);
                        } else {
                            i7--;
                        }
                        u3 = u3.d();
                    }
                }
            }
        }
        this.f7265e = atomicReferenceArray2;
        this.f7262b = i7;
    }

    public final U b(int i7, Object obj) {
        if (this.f7262b != 0) {
            for (U u3 = (U) this.f7265e.get((r0.length() - 1) & i7); u3 != null; u3 = u3.d()) {
                if (u3.c() == i7) {
                    Object key = u3.getKey();
                    if (key == null) {
                        k();
                    } else if (this.f7261a.f7311e.c(obj, key)) {
                        return u3;
                    }
                }
            }
        }
        return null;
    }

    public void c() {
    }

    public void d() {
    }

    public final void e() {
        if ((this.f7266f.incrementAndGet() & 63) == 0) {
            h();
        }
    }

    public final Object f(int i7, Object obj, Object obj2, boolean z8) {
        lock();
        try {
            h();
            int i10 = this.f7262b + 1;
            if (i10 > this.f7264d) {
                a();
                i10 = this.f7262b + 1;
            }
            AtomicReferenceArray atomicReferenceArray = this.f7265e;
            int length = (atomicReferenceArray.length() - 1) & i7;
            U u3 = (U) atomicReferenceArray.get(length);
            for (U u10 = u3; u10 != null; u10 = u10.d()) {
                Object key = u10.getKey();
                if (u10.c() == i7 && key != null && this.f7261a.f7311e.c(obj, key)) {
                    Object value = u10.getValue();
                    if (value == null) {
                        this.f7263c++;
                        j(u10, obj2);
                        this.f7262b = this.f7262b;
                        unlock();
                        return null;
                    }
                    if (z8) {
                        unlock();
                        return value;
                    }
                    this.f7263c++;
                    j(u10, obj2);
                    unlock();
                    return value;
                }
            }
            this.f7263c++;
            U a9 = this.f7261a.f7312f.a(i(), obj, i7, u3);
            j(a9, obj2);
            atomicReferenceArray.set(length, a9);
            this.f7262b = i10;
            unlock();
            return null;
        } catch (Throwable th) {
            unlock();
            throw th;
        }
    }

    public final U g(U u3, U u10) {
        int i7 = this.f7262b;
        U d10 = u10.d();
        while (u3 != u10) {
            U d11 = this.f7261a.f7312f.d(i(), u3, d10);
            if (d11 != null) {
                d10 = d11;
            } else {
                i7--;
            }
            u3 = u3.d();
        }
        this.f7262b = i7;
        return d10;
    }

    public final void h() {
        if (tryLock()) {
            try {
                d();
                this.f7266f.set(0);
            } finally {
                unlock();
            }
        }
    }

    public abstract X i();

    public final void j(U u3, Object obj) {
        this.f7261a.f7312f.e(i(), u3, obj);
    }

    public final void k() {
        if (tryLock()) {
            try {
                d();
            } finally {
                unlock();
            }
        }
    }
}
