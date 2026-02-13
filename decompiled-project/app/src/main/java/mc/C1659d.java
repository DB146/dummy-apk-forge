package mc;

import Db.q;
import cc.C0944m;
import cc.F;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: mc.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1659d extends h implements InterfaceC1656a {

    /* renamed from: v, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f20841v = AtomicReferenceFieldUpdater.newUpdater(C1659d.class, Object.class, "owner");
    private volatile Object owner;

    public C1659d(boolean z8) {
        super(1, z8 ? 1 : 0);
        this.owner = z8 ? null : AbstractC1660e.f20842a;
    }

    public final boolean c() {
        return Math.max(h.f20849u.get(this), 0) == 0;
    }

    public final boolean d() {
        int i7;
        char c10;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = h.f20849u;
            int i10 = atomicIntegerFieldUpdater.get(this);
            int i11 = this.f20850a;
            if (i10 > i11) {
                do {
                    i7 = atomicIntegerFieldUpdater.get(this);
                    if (i7 > i11) {
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i7, i11));
            } else {
                if (i10 <= 0) {
                    c10 = 1;
                    break;
                }
                if (atomicIntegerFieldUpdater.compareAndSet(this, i10, i10 - 1)) {
                    f20841v.set(this, null);
                    c10 = 0;
                    break;
                }
            }
        }
        if (c10 == 0) {
            return true;
        }
        if (c10 == 1) {
            return false;
        }
        if (c10 != 2) {
            throw new IllegalStateException("unexpected");
        }
        throw new IllegalStateException("This mutex is already locked by the specified owner: null".toString());
    }

    @Override // mc.InterfaceC1656a
    public final void l(Object obj) {
        while (c()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f20841v;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            R7.a aVar = AbstractC1660e.f20842a;
            if (obj2 != aVar) {
                if (obj2 == obj || obj == null) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, aVar)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj2) {
                            break;
                        }
                    }
                    b();
                    return;
                }
                throw new IllegalStateException(("This mutex is locked by " + obj2 + ", but " + obj + " is expected").toString());
            }
        }
        throw new IllegalStateException("This mutex is not locked");
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0022, code lost:
    
        r0.b(r1, r4.f20851b);
     */
    @Override // mc.InterfaceC1656a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object n(Jb.c cVar) {
        boolean d10 = d();
        q qVar = q.f3365a;
        if (d10) {
            return qVar;
        }
        C0944m s3 = F.s(com.bumptech.glide.c.F(cVar));
        try {
            C1658c c1658c = new C1658c(this, s3);
            while (true) {
                int andDecrement = h.f20849u.getAndDecrement(this);
                if (andDecrement <= this.f20850a) {
                    if (andDecrement > 0) {
                        break;
                    }
                    if (a(c1658c)) {
                        break;
                    }
                }
            }
            Object r10 = s3.r();
            Ib.a aVar = Ib.a.f5345a;
            if (r10 != aVar) {
                r10 = qVar;
            }
            return r10 == aVar ? r10 : qVar;
        } catch (Throwable th) {
            s3.z();
            throw th;
        }
    }

    public final String toString() {
        return "Mutex@" + F.q(this) + "[isLocked=" + c() + ",owner=" + f20841v.get(this) + ']';
    }
}
