package N6;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* loaded from: classes.dex */
public final class S implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public int f7248a;

    /* renamed from: b, reason: collision with root package name */
    public int f7249b = -1;

    /* renamed from: c, reason: collision with root package name */
    public X f7250c;

    /* renamed from: d, reason: collision with root package name */
    public AtomicReferenceArray f7251d;

    /* renamed from: e, reason: collision with root package name */
    public U f7252e;

    /* renamed from: f, reason: collision with root package name */
    public k0 f7253f;

    /* renamed from: u, reason: collision with root package name */
    public k0 f7254u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ l0 f7255v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f7256w;

    public S(l0 l0Var, int i7) {
        this.f7256w = i7;
        this.f7255v = l0Var;
        this.f7248a = l0Var.f7309c.length - 1;
        a();
    }

    public final void a() {
        this.f7253f = null;
        if (e() || f()) {
            return;
        }
        while (true) {
            int i7 = this.f7248a;
            if (i7 < 0) {
                return;
            }
            X[] xArr = this.f7255v.f7309c;
            this.f7248a = i7 - 1;
            X x2 = xArr[i7];
            this.f7250c = x2;
            if (x2.f7262b != 0) {
                this.f7251d = this.f7250c.f7265e;
                this.f7249b = r0.length() - 1;
                if (f()) {
                    return;
                }
            }
        }
    }

    public final boolean b(U u3) {
        l0 l0Var = this.f7255v;
        try {
            Object key = u3.getKey();
            Object value = u3.getKey() == null ? null : u3.getValue();
            if (value == null) {
                this.f7250c.e();
                return false;
            }
            this.f7253f = new k0(l0Var, key, value);
            this.f7250c.e();
            return true;
        } catch (Throwable th) {
            this.f7250c.e();
            throw th;
        }
    }

    public final Object c() {
        return d();
    }

    public final k0 d() {
        k0 k0Var = this.f7253f;
        if (k0Var == null) {
            throw new NoSuchElementException();
        }
        this.f7254u = k0Var;
        a();
        return this.f7254u;
    }

    public final boolean e() {
        U u3 = this.f7252e;
        if (u3 == null) {
            return false;
        }
        while (true) {
            this.f7252e = u3.d();
            U u10 = this.f7252e;
            if (u10 == null) {
                return false;
            }
            if (b(u10)) {
                return true;
            }
            u3 = this.f7252e;
        }
    }

    public final boolean f() {
        while (true) {
            int i7 = this.f7249b;
            if (i7 < 0) {
                return false;
            }
            AtomicReferenceArray atomicReferenceArray = this.f7251d;
            this.f7249b = i7 - 1;
            U u3 = (U) atomicReferenceArray.get(i7);
            this.f7252e = u3;
            if (u3 != null && (b(u3) || e())) {
                return true;
            }
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f7253f != null;
    }

    @Override // java.util.Iterator
    public Object next() {
        switch (this.f7256w) {
            case 1:
                return d().f7302a;
            case 2:
                return d().f7303b;
            default:
                return c();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        Q5.e.p("no calls to next() since the last call to remove()", this.f7254u != null);
        this.f7255v.remove(this.f7254u.f7302a);
        this.f7254u = null;
    }
}
