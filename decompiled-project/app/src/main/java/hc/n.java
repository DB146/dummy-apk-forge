package hc;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes2.dex */
public final class n {

    /* renamed from: e, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f17961e = AtomicReferenceFieldUpdater.newUpdater(n.class, Object.class, "_next");

    /* renamed from: f, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f17962f = AtomicLongFieldUpdater.newUpdater(n.class, "_state");
    public static final R7.a g = new R7.a("REMOVE_FROZEN", 28);
    private volatile Object _next;
    private volatile long _state;

    /* renamed from: a, reason: collision with root package name */
    public final int f17963a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f17964b;

    /* renamed from: c, reason: collision with root package name */
    public final int f17965c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicReferenceArray f17966d;

    public n(int i7, boolean z8) {
        this.f17963a = i7;
        this.f17964b = z8;
        int i10 = i7 - 1;
        this.f17965c = i10;
        this.f17966d = new AtomicReferenceArray(i7);
        if (i10 > 1073741823) {
            throw new IllegalStateException("Check failed.");
        }
        if ((i7 & i10) != 0) {
            throw new IllegalStateException("Check failed.");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0050, code lost:
    
        return 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int a(Runnable runnable) {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f17962f;
            long j = atomicLongFieldUpdater.get(this);
            if ((3458764513820540928L & j) != 0) {
                return (j & 2305843009213693952L) != 0 ? 2 : 1;
            }
            int i7 = (int) (1073741823 & j);
            int i10 = (int) ((1152921503533105152L & j) >> 30);
            int i11 = this.f17965c;
            if (((i10 + 2) & i11) == (i7 & i11)) {
                return 1;
            }
            AtomicReferenceArray atomicReferenceArray = this.f17966d;
            if (!this.f17964b && atomicReferenceArray.get(i10 & i11) != null) {
                int i12 = this.f17963a;
                if (i12 < 1024 || ((i10 - i7) & 1073741823) > (i12 >> 1)) {
                    break;
                }
            } else if (atomicLongFieldUpdater.compareAndSet(this, j, ((-1152921503533105153L) & j) | (((i10 + 1) & 1073741823) << 30))) {
                atomicReferenceArray.set(i10 & i11, runnable);
                n nVar = this;
                while ((atomicLongFieldUpdater.get(nVar) & 1152921504606846976L) != 0) {
                    nVar = nVar.c();
                    AtomicReferenceArray atomicReferenceArray2 = nVar.f17966d;
                    int i13 = nVar.f17965c & i10;
                    Object obj = atomicReferenceArray2.get(i13);
                    if ((obj instanceof m) && ((m) obj).f17960a == i10) {
                        atomicReferenceArray2.set(i13, runnable);
                    } else {
                        nVar = null;
                    }
                    if (nVar == null) {
                        return 0;
                    }
                }
                return 0;
            }
        }
    }

    public final boolean b() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j;
        do {
            atomicLongFieldUpdater = f17962f;
            j = atomicLongFieldUpdater.get(this);
            if ((j & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j) != 0) {
                return false;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j, 2305843009213693952L | j));
        return true;
    }

    public final n c() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j;
        while (true) {
            atomicLongFieldUpdater = f17962f;
            j = atomicLongFieldUpdater.get(this);
            if ((j & 1152921504606846976L) != 0) {
                break;
            }
            long j10 = j | 1152921504606846976L;
            if (atomicLongFieldUpdater.compareAndSet(this, j, j10)) {
                j = j10;
                break;
            }
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f17961e;
            n nVar = (n) atomicReferenceFieldUpdater.get(this);
            if (nVar != null) {
                return nVar;
            }
            n nVar2 = new n(this.f17963a * 2, this.f17964b);
            int i7 = (int) (1073741823 & j);
            int i10 = (int) ((1152921503533105152L & j) >> 30);
            while (true) {
                int i11 = this.f17965c;
                int i12 = i7 & i11;
                if (i12 == (i11 & i10)) {
                    break;
                }
                Object obj = this.f17966d.get(i12);
                if (obj == null) {
                    obj = new m(i7);
                }
                nVar2.f17966d.set(nVar2.f17965c & i7, obj);
                i7++;
            }
            atomicLongFieldUpdater.set(nVar2, (-1152921504606846977L) & j);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, nVar2) && atomicReferenceFieldUpdater.get(this) == null) {
            }
        }
    }

    public final Object d() {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f17962f;
            long j = atomicLongFieldUpdater.get(this);
            if ((j & 1152921504606846976L) != 0) {
                return g;
            }
            int i7 = (int) (j & 1073741823);
            int i10 = this.f17965c;
            int i11 = i7 & i10;
            if ((((int) ((1152921503533105152L & j) >> 30)) & i10) == i11) {
                return null;
            }
            AtomicReferenceArray atomicReferenceArray = this.f17966d;
            Object obj = atomicReferenceArray.get(i11);
            boolean z8 = this.f17964b;
            if (obj == null) {
                if (z8) {
                    return null;
                }
            } else {
                if (obj instanceof m) {
                    return null;
                }
                long j10 = (i7 + 1) & 1073741823;
                if (atomicLongFieldUpdater.compareAndSet(this, j, (j & (-1073741824)) | j10)) {
                    atomicReferenceArray.set(i11, null);
                    return obj;
                }
                if (z8) {
                    n nVar = this;
                    while (true) {
                        AtomicLongFieldUpdater atomicLongFieldUpdater2 = f17962f;
                        long j11 = atomicLongFieldUpdater2.get(nVar);
                        int i12 = (int) (j11 & 1073741823);
                        if ((j11 & 1152921504606846976L) != 0) {
                            nVar = nVar.c();
                        } else {
                            if (atomicLongFieldUpdater2.compareAndSet(nVar, j11, (j11 & (-1073741824)) | j10)) {
                                nVar.f17966d.set(nVar.f17965c & i12, null);
                                nVar = null;
                            } else {
                                continue;
                            }
                        }
                        if (nVar == null) {
                            return obj;
                        }
                    }
                }
            }
        }
    }
}
