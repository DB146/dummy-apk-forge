package cc;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes2.dex */
public final class p0 implements InterfaceC0931f0 {

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f14561b = AtomicIntegerFieldUpdater.newUpdater(p0.class, "_isCompleting");

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f14562c = AtomicReferenceFieldUpdater.newUpdater(p0.class, Object.class, "_rootCause");

    /* renamed from: d, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f14563d = AtomicReferenceFieldUpdater.newUpdater(p0.class, Object.class, "_exceptionsHolder");
    private volatile Object _exceptionsHolder;
    private volatile int _isCompleting = 0;
    private volatile Object _rootCause;

    /* renamed from: a, reason: collision with root package name */
    public final y0 f14564a;

    public p0(y0 y0Var, Throwable th) {
        this.f14564a = y0Var;
        this._rootCause = th;
    }

    public final void a(Throwable th) {
        Throwable b2 = b();
        if (b2 == null) {
            f14562c.set(this, th);
            return;
        }
        if (th == b2) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f14563d;
        Object obj = atomicReferenceFieldUpdater.get(this);
        if (obj == null) {
            atomicReferenceFieldUpdater.set(this, th);
            return;
        }
        if (!(obj instanceof Throwable)) {
            if (obj instanceof ArrayList) {
                ((ArrayList) obj).add(th);
                return;
            } else {
                throw new IllegalStateException(("State is " + obj).toString());
            }
        }
        if (th == obj) {
            return;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(th);
        atomicReferenceFieldUpdater.set(this, arrayList);
    }

    public final Throwable b() {
        return (Throwable) f14562c.get(this);
    }

    @Override // cc.InterfaceC0931f0
    public final y0 c() {
        return this.f14564a;
    }

    public final boolean d() {
        return b() != null;
    }

    public final boolean e() {
        return f14561b.get(this) != 0;
    }

    public final ArrayList f(Throwable th) {
        ArrayList arrayList;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f14563d;
        Object obj = atomicReferenceFieldUpdater.get(this);
        if (obj == null) {
            arrayList = new ArrayList(4);
        } else if (obj instanceof Throwable) {
            ArrayList arrayList2 = new ArrayList(4);
            arrayList2.add(obj);
            arrayList = arrayList2;
        } else {
            if (!(obj instanceof ArrayList)) {
                throw new IllegalStateException(("State is " + obj).toString());
            }
            arrayList = (ArrayList) obj;
        }
        Throwable b2 = b();
        if (b2 != null) {
            arrayList.add(0, b2);
        }
        if (th != null && !th.equals(b2)) {
            arrayList.add(th);
        }
        atomicReferenceFieldUpdater.set(this, F.f14477h);
        return arrayList;
    }

    @Override // cc.InterfaceC0931f0
    public final boolean isActive() {
        return b() == null;
    }

    public final String toString() {
        return "Finishing[cancelling=" + d() + ", completing=" + e() + ", rootCause=" + b() + ", exceptions=" + f14563d.get(this) + ", list=" + this.f14564a + ']';
    }
}
