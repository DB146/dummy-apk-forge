package mc;

import A0.C0005a;
import Db.q;
import cc.InterfaceC0942l;
import cc.N0;
import h3.o;
import hc.AbstractC1273a;
import hc.u;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes2.dex */
public class h {

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f20845c = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "head");

    /* renamed from: d, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f20846d = AtomicLongFieldUpdater.newUpdater(h.class, "deqIdx");

    /* renamed from: e, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f20847e = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "tail");

    /* renamed from: f, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f20848f = AtomicLongFieldUpdater.newUpdater(h.class, "enqIdx");

    /* renamed from: u, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f20849u = AtomicIntegerFieldUpdater.newUpdater(h.class, "_availablePermits");
    private volatile int _availablePermits;

    /* renamed from: a, reason: collision with root package name */
    public final int f20850a;

    /* renamed from: b, reason: collision with root package name */
    public final C0005a f20851b;
    private volatile long deqIdx;
    private volatile long enqIdx;
    private volatile Object head;
    private volatile Object tail;

    public h(int i7, int i10) {
        this.f20850a = i7;
        if (i7 <= 0) {
            throw new IllegalArgumentException(o.l(i7, "Semaphore should have at least 1 permit, but had ").toString());
        }
        if (i10 < 0 || i10 > i7) {
            throw new IllegalArgumentException(o.l(i7, "The number of acquired permits should be in 0..").toString());
        }
        j jVar = new j(0L, null, 2);
        this.head = jVar;
        this.tail = jVar;
        this._availablePermits = i7 - i10;
        this.f20851b = new C0005a(this, 26);
    }

    public final boolean a(N0 n02) {
        Object b2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f20847e;
        j jVar = (j) atomicReferenceFieldUpdater.get(this);
        long andIncrement = f20848f.getAndIncrement(this);
        C1661f c1661f = C1661f.f20843a;
        long j = andIncrement / i.f20857f;
        loop0: while (true) {
            b2 = AbstractC1273a.b(jVar, j, c1661f);
            if (!AbstractC1273a.e(b2)) {
                u c10 = AbstractC1273a.c(b2);
                while (true) {
                    u uVar = (u) atomicReferenceFieldUpdater.get(this);
                    if (uVar.f17971c >= c10.f17971c) {
                        break loop0;
                    }
                    if (!c10.i()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, uVar, c10)) {
                        if (atomicReferenceFieldUpdater.get(this) != uVar) {
                            if (c10.e()) {
                                c10.d();
                            }
                        }
                    }
                    if (uVar.e()) {
                        uVar.d();
                    }
                }
            } else {
                break;
            }
        }
        j jVar2 = (j) AbstractC1273a.c(b2);
        int i7 = (int) (andIncrement % i.f20857f);
        AtomicReferenceArray atomicReferenceArray = jVar2.f20858e;
        while (!atomicReferenceArray.compareAndSet(i7, null, n02)) {
            if (atomicReferenceArray.get(i7) != null) {
                R7.a aVar = i.f20853b;
                R7.a aVar2 = i.f20854c;
                while (!atomicReferenceArray.compareAndSet(i7, aVar, aVar2)) {
                    if (atomicReferenceArray.get(i7) != aVar) {
                        return false;
                    }
                }
                if (n02 instanceof InterfaceC0942l) {
                    ((InterfaceC0942l) n02).b(q.f3365a, this.f20851b);
                    return true;
                }
                throw new IllegalStateException(("unexpected: " + n02).toString());
            }
        }
        n02.a(jVar2, i7);
        return true;
    }

    public final void b() {
        int i7;
        Object b2;
        boolean z8;
        do {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f20849u;
            int andIncrement = atomicIntegerFieldUpdater.getAndIncrement(this);
            int i10 = this.f20850a;
            if (andIncrement >= i10) {
                do {
                    i7 = atomicIntegerFieldUpdater.get(this);
                    if (i7 <= i10) {
                        break;
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i7, i10));
                throw new IllegalStateException(("The number of released permits cannot be greater than " + i10).toString());
            }
            if (andIncrement >= 0) {
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f20845c;
            j jVar = (j) atomicReferenceFieldUpdater.get(this);
            long andIncrement2 = f20846d.getAndIncrement(this);
            long j = andIncrement2 / i.f20857f;
            C1662g c1662g = C1662g.f20844a;
            while (true) {
                b2 = AbstractC1273a.b(jVar, j, c1662g);
                if (AbstractC1273a.e(b2)) {
                    break;
                }
                u c10 = AbstractC1273a.c(b2);
                while (true) {
                    u uVar = (u) atomicReferenceFieldUpdater.get(this);
                    if (uVar.f17971c >= c10.f17971c) {
                        break;
                    }
                    if (!c10.i()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, uVar, c10)) {
                        if (atomicReferenceFieldUpdater.get(this) != uVar) {
                            if (c10.e()) {
                                c10.d();
                            }
                        }
                    }
                    if (uVar.e()) {
                        uVar.d();
                    }
                }
            }
            j jVar2 = (j) AbstractC1273a.c(b2);
            jVar2.a();
            z8 = false;
            if (jVar2.f17971c <= j) {
                int i11 = (int) (andIncrement2 % i.f20857f);
                R7.a aVar = i.f20853b;
                AtomicReferenceArray atomicReferenceArray = jVar2.f20858e;
                Object andSet = atomicReferenceArray.getAndSet(i11, aVar);
                if (andSet == null) {
                    int i12 = i.f20852a;
                    for (int i13 = 0; i13 < i12; i13++) {
                        if (atomicReferenceArray.get(i11) == i.f20854c) {
                            z8 = true;
                            break;
                        }
                    }
                    R7.a aVar2 = i.f20853b;
                    R7.a aVar3 = i.f20855d;
                    while (true) {
                        if (!atomicReferenceArray.compareAndSet(i11, aVar2, aVar3)) {
                            if (atomicReferenceArray.get(i11) != aVar2) {
                                break;
                            }
                        } else {
                            z8 = true;
                            break;
                        }
                    }
                    z8 = !z8;
                } else if (andSet != i.f20856e) {
                    if (!(andSet instanceof InterfaceC0942l)) {
                        throw new IllegalStateException(("unexpected: " + andSet).toString());
                    }
                    InterfaceC0942l interfaceC0942l = (InterfaceC0942l) andSet;
                    R7.a e2 = interfaceC0942l.e(q.f3365a, this.f20851b);
                    if (e2 != null) {
                        interfaceC0942l.j(e2);
                        z8 = true;
                        break;
                        break;
                    }
                }
            }
        } while (!z8);
    }
}
