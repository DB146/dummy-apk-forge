package ec;

import cc.C0944m;
import cc.F;
import cc.InterfaceC0942l;
import cc.N0;
import hc.AbstractC1273a;
import hc.AbstractC1276d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import y7.u0;

/* loaded from: classes2.dex */
public class d implements h {

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f16861b = AtomicLongFieldUpdater.newUpdater(d.class, "sendersAndCloseStatus");

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f16862c = AtomicLongFieldUpdater.newUpdater(d.class, "receivers");

    /* renamed from: d, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f16863d = AtomicLongFieldUpdater.newUpdater(d.class, "bufferEnd");

    /* renamed from: e, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f16864e = AtomicLongFieldUpdater.newUpdater(d.class, "completedExpandBuffersAndPauseFlag");

    /* renamed from: f, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f16865f = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "sendSegment");

    /* renamed from: u, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f16866u = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "receiveSegment");

    /* renamed from: v, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f16867v = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "bufferEndSegment");

    /* renamed from: w, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f16868w = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "_closeCause");

    /* renamed from: x, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f16869x = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "closeHandler");
    private volatile Object _closeCause;

    /* renamed from: a, reason: collision with root package name */
    public final int f16870a;
    private volatile long bufferEnd;
    private volatile Object bufferEndSegment;
    private volatile Object closeHandler;
    private volatile long completedExpandBuffersAndPauseFlag;
    private volatile Object receiveSegment;
    private volatile long receivers;
    private volatile Object sendSegment;
    private volatile long sendersAndCloseStatus;

    public d(int i7) {
        this.f16870a = i7;
        if (i7 < 0) {
            throw new IllegalArgumentException(A3.c.f(i7, "Invalid channel capacity: ", ", should be >=0").toString());
        }
        l lVar = f.f16872a;
        this.bufferEnd = i7 != 0 ? i7 != Integer.MAX_VALUE ? i7 : Long.MAX_VALUE : 0L;
        this.completedExpandBuffersAndPauseFlag = f16863d.get(this);
        l lVar2 = new l(0L, null, this, 3);
        this.sendSegment = lVar2;
        this.receiveSegment = lVar2;
        if (y()) {
            lVar2 = f.f16872a;
            kotlin.jvm.internal.l.c(lVar2, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
        }
        this.bufferEndSegment = lVar2;
        this._closeCause = f.f16887s;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object B(d dVar, Jb.c cVar) {
        b bVar;
        int i7;
        Object C2;
        if (cVar instanceof b) {
            bVar = (b) cVar;
            int i10 = bVar.f16857c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar.f16857c = i10 - Integer.MIN_VALUE;
                b bVar2 = bVar;
                Object obj = bVar2.f16855a;
                Object obj2 = Ib.a.f5345a;
                i7 = bVar2.f16857c;
                if (i7 != 0) {
                    com.bumptech.glide.c.c0(obj);
                    l lVar = (l) f16866u.get(dVar);
                    while (!dVar.v()) {
                        long andIncrement = f16862c.getAndIncrement(dVar);
                        long j = f.f16873b;
                        long j10 = andIncrement / j;
                        int i11 = (int) (andIncrement % j);
                        if (lVar.f17971c != j10) {
                            l o10 = dVar.o(j10, lVar);
                            if (o10 == null) {
                                continue;
                            } else {
                                lVar = o10;
                            }
                        }
                        Object G9 = dVar.G(lVar, i11, andIncrement, null);
                        if (G9 == f.f16881m) {
                            throw new IllegalStateException("unexpected");
                        }
                        if (G9 == f.f16883o) {
                            if (andIncrement < dVar.s()) {
                                lVar.a();
                            }
                        } else {
                            if (G9 != f.f16882n) {
                                lVar.a();
                                return G9;
                            }
                            bVar2.f16857c = 1;
                            C2 = dVar.C(lVar, i11, andIncrement, bVar2);
                            if (C2 == obj2) {
                                return obj2;
                            }
                        }
                    }
                    return new i(dVar.p());
                }
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.bumptech.glide.c.c0(obj);
                C2 = ((k) obj).f16893a;
                return C2;
            }
        }
        bVar = new b(dVar, cVar);
        b bVar22 = bVar;
        Object obj3 = bVar22.f16855a;
        Object obj22 = Ib.a.f5345a;
        i7 = bVar22.f16857c;
        if (i7 != 0) {
        }
        return C2;
    }

    public static boolean F(Object obj) {
        if (obj instanceof InterfaceC0942l) {
            kotlin.jvm.internal.l.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            return f.a((InterfaceC0942l) obj, Db.q.f3365a, null);
        }
        throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
    }

    public static final l b(d dVar, long j, l lVar) {
        Object b2;
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j10;
        long j11;
        dVar.getClass();
        l lVar2 = f.f16872a;
        e eVar = e.f16871a;
        loop0: while (true) {
            b2 = AbstractC1273a.b(lVar, j, eVar);
            if (!AbstractC1273a.e(b2)) {
                hc.u c10 = AbstractC1273a.c(b2);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f16865f;
                    hc.u uVar = (hc.u) atomicReferenceFieldUpdater.get(dVar);
                    if (uVar.f17971c >= c10.f17971c) {
                        break loop0;
                    }
                    if (!c10.i()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(dVar, uVar, c10)) {
                        if (atomicReferenceFieldUpdater.get(dVar) != uVar) {
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
        boolean e2 = AbstractC1273a.e(b2);
        AtomicLongFieldUpdater atomicLongFieldUpdater2 = f16862c;
        if (e2) {
            dVar.w();
            if (lVar.f17971c * f.f16873b >= atomicLongFieldUpdater2.get(dVar)) {
                return null;
            }
            lVar.a();
            return null;
        }
        l lVar3 = (l) AbstractC1273a.c(b2);
        long j12 = lVar3.f17971c;
        if (j12 <= j) {
            return lVar3;
        }
        long j13 = f.f16873b * j12;
        do {
            atomicLongFieldUpdater = f16861b;
            j10 = atomicLongFieldUpdater.get(dVar);
            j11 = 1152921504606846975L & j10;
            if (j11 >= j13) {
                break;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(dVar, j10, j11 + (((int) (j10 >> 60)) << 60)));
        if (j12 * f.f16873b >= atomicLongFieldUpdater2.get(dVar)) {
            return null;
        }
        lVar3.a();
        return null;
    }

    public static final void d(d dVar, Object obj, C0944m c0944m) {
        dVar.getClass();
        c0944m.resumeWith(com.bumptech.glide.c.n(dVar.r()));
    }

    public static final int e(d dVar, l lVar, int i7, Object obj, long j, Object obj2, boolean z8) {
        dVar.getClass();
        lVar.m(i7, obj);
        if (z8) {
            return dVar.H(lVar, i7, obj, j, obj2, z8);
        }
        Object k = lVar.k(i7);
        if (k == null) {
            if (dVar.i(j)) {
                if (lVar.j(i7, null, f.f16875d)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (lVar.j(i7, null, obj2)) {
                    return 2;
                }
            }
        } else if (k instanceof N0) {
            lVar.m(i7, null);
            if (dVar.E(k, obj)) {
                lVar.n(i7, f.f16879i);
                return 0;
            }
            R7.a aVar = f.k;
            if (lVar.f16895f.getAndSet((i7 * 2) + 1, aVar) != aVar) {
                lVar.l(i7, true);
            }
            return 5;
        }
        return dVar.H(lVar, i7, obj, j, obj2, z8);
    }

    public static void t(d dVar) {
        dVar.getClass();
        AtomicLongFieldUpdater atomicLongFieldUpdater = f16864e;
        if ((atomicLongFieldUpdater.addAndGet(dVar, 1L) & 4611686018427387904L) == 0) {
            return;
        }
        do {
        } while ((atomicLongFieldUpdater.get(dVar) & 4611686018427387904L) != 0);
    }

    public final Object A(Hb.d dVar, Object obj) {
        C0944m c0944m = new C0944m(1, com.bumptech.glide.c.F(dVar));
        c0944m.s();
        c0944m.resumeWith(com.bumptech.glide.c.n(r()));
        Object r10 = c0944m.r();
        return r10 == Ib.a.f5345a ? r10 : Db.q.f3365a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object C(l lVar, int i7, long j, Jb.c cVar) {
        c cVar2;
        int i10;
        k kVar;
        if (cVar instanceof c) {
            cVar2 = (c) cVar;
            int i11 = cVar2.f16860c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                cVar2.f16860c = i11 - Integer.MIN_VALUE;
                Object obj = cVar2.f16858a;
                Ib.a aVar = Ib.a.f5345a;
                i10 = cVar2.f16860c;
                if (i10 != 0) {
                    com.bumptech.glide.c.c0(obj);
                    cVar2.f16860c = 1;
                    C0944m s3 = F.s(com.bumptech.glide.c.F(cVar2));
                    try {
                        s sVar = new s(s3);
                        Object G9 = G(lVar, i7, j, sVar);
                        if (G9 == f.f16881m) {
                            sVar.a(lVar, i7);
                        } else {
                            if (G9 == f.f16883o) {
                                if (j < s()) {
                                    lVar.a();
                                }
                                l lVar2 = (l) f16866u.get(this);
                                while (true) {
                                    if (v()) {
                                        s3.resumeWith(new k(new i(p())));
                                        break;
                                    }
                                    long andIncrement = f16862c.getAndIncrement(this);
                                    long j10 = f.f16873b;
                                    long j11 = andIncrement / j10;
                                    int i12 = (int) (andIncrement % j10);
                                    if (lVar2.f17971c != j11) {
                                        l o10 = o(j11, lVar2);
                                        if (o10 != null) {
                                            lVar2 = o10;
                                        }
                                    }
                                    Object G10 = G(lVar2, i12, andIncrement, sVar);
                                    if (G10 == f.f16881m) {
                                        sVar.a(lVar2, i12);
                                        break;
                                    }
                                    if (G10 == f.f16883o) {
                                        if (andIncrement < s()) {
                                            lVar2.a();
                                        }
                                    } else {
                                        if (G10 == f.f16882n) {
                                            throw new IllegalStateException("unexpected");
                                        }
                                        lVar2.a();
                                        kVar = new k(G10);
                                    }
                                }
                            } else {
                                lVar.a();
                                kVar = new k(G9);
                            }
                            s3.b(kVar, null);
                        }
                        obj = s3.r();
                        Ib.a aVar2 = Ib.a.f5345a;
                        if (obj == aVar) {
                            return aVar;
                        }
                    } catch (Throwable th) {
                        s3.z();
                        throw th;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.c.c0(obj);
                }
                return ((k) obj).f16893a;
            }
        }
        cVar2 = new c(this, cVar);
        Object obj2 = cVar2.f16858a;
        Ib.a aVar3 = Ib.a.f5345a;
        i10 = cVar2.f16860c;
        if (i10 != 0) {
        }
        return ((k) obj2).f16893a;
    }

    public final void D(N0 n02, boolean z8) {
        if (n02 instanceof InterfaceC0942l) {
            ((Hb.d) n02).resumeWith(com.bumptech.glide.c.n(z8 ? q() : r()));
            return;
        }
        if (n02 instanceof s) {
            ((s) n02).f16901a.resumeWith(new k(new i(p())));
            return;
        }
        if (!(n02 instanceof C1116a)) {
            throw new IllegalStateException(("Unexpected waiter: " + n02).toString());
        }
        C1116a c1116a = (C1116a) n02;
        C0944m c0944m = c1116a.f16853b;
        kotlin.jvm.internal.l.b(c0944m);
        c1116a.f16853b = null;
        c1116a.f16852a = f.f16880l;
        Throwable p10 = c1116a.f16854c.p();
        if (p10 == null) {
            c0944m.resumeWith(Boolean.FALSE);
        } else {
            c0944m.resumeWith(com.bumptech.glide.c.n(p10));
        }
    }

    public final boolean E(Object obj, Object obj2) {
        if (obj instanceof s) {
            kotlin.jvm.internal.l.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.ReceiveCatching<E of kotlinx.coroutines.channels.BufferedChannel>");
            return f.a(((s) obj).f16901a, new k(obj2), null);
        }
        if (!(obj instanceof C1116a)) {
            if (obj instanceof InterfaceC0942l) {
                kotlin.jvm.internal.l.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<E of kotlinx.coroutines.channels.BufferedChannel>");
                return f.a((InterfaceC0942l) obj, obj2, null);
            }
            throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
        }
        kotlin.jvm.internal.l.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator<E of kotlinx.coroutines.channels.BufferedChannel>");
        C1116a c1116a = (C1116a) obj;
        C0944m c0944m = c1116a.f16853b;
        kotlin.jvm.internal.l.b(c0944m);
        c1116a.f16853b = null;
        c1116a.f16852a = obj2;
        Boolean bool = Boolean.TRUE;
        c1116a.f16854c.getClass();
        return f.a(c0944m, bool, null);
    }

    public final Object G(l lVar, int i7, long j, Object obj) {
        Object k = lVar.k(i7);
        AtomicReferenceArray atomicReferenceArray = lVar.f16895f;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f16861b;
        if (k == null) {
            if (j >= (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return f.f16882n;
                }
                if (lVar.j(i7, k, obj)) {
                    n();
                    return f.f16881m;
                }
            }
        } else if (k == f.f16875d && lVar.j(i7, k, f.f16879i)) {
            n();
            Object obj2 = atomicReferenceArray.get(i7 * 2);
            lVar.m(i7, null);
            return obj2;
        }
        while (true) {
            Object k7 = lVar.k(i7);
            if (k7 == null || k7 == f.f16876e) {
                if (j < (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                    if (lVar.j(i7, k7, f.f16878h)) {
                        n();
                        return f.f16883o;
                    }
                } else {
                    if (obj == null) {
                        return f.f16882n;
                    }
                    if (lVar.j(i7, k7, obj)) {
                        n();
                        return f.f16881m;
                    }
                }
            } else {
                if (k7 != f.f16875d) {
                    R7.a aVar = f.j;
                    if (k7 != aVar && k7 != f.f16878h) {
                        if (k7 == f.f16880l) {
                            n();
                            return f.f16883o;
                        }
                        if (k7 != f.g && lVar.j(i7, k7, f.f16877f)) {
                            boolean z8 = k7 instanceof v;
                            if (z8) {
                                k7 = ((v) k7).f16902a;
                            }
                            if (F(k7)) {
                                lVar.n(i7, f.f16879i);
                                n();
                                Object obj3 = atomicReferenceArray.get(i7 * 2);
                                lVar.m(i7, null);
                                return obj3;
                            }
                            lVar.n(i7, aVar);
                            lVar.h();
                            if (z8) {
                                n();
                            }
                            return f.f16883o;
                        }
                    }
                    return f.f16883o;
                }
                if (lVar.j(i7, k7, f.f16879i)) {
                    n();
                    Object obj4 = atomicReferenceArray.get(i7 * 2);
                    lVar.m(i7, null);
                    return obj4;
                }
            }
        }
    }

    public final int H(l lVar, int i7, Object obj, long j, Object obj2, boolean z8) {
        while (true) {
            Object k = lVar.k(i7);
            if (k == null) {
                if (!i(j) || z8) {
                    if (z8) {
                        if (lVar.j(i7, null, f.j)) {
                            lVar.h();
                            return 4;
                        }
                    } else {
                        if (obj2 == null) {
                            return 3;
                        }
                        if (lVar.j(i7, null, obj2)) {
                            return 2;
                        }
                    }
                } else if (lVar.j(i7, null, f.f16875d)) {
                    return 1;
                }
            } else {
                if (k != f.f16876e) {
                    R7.a aVar = f.k;
                    if (k == aVar) {
                        lVar.m(i7, null);
                        return 5;
                    }
                    if (k == f.f16878h) {
                        lVar.m(i7, null);
                        return 5;
                    }
                    if (k == f.f16880l) {
                        lVar.m(i7, null);
                        w();
                        return 4;
                    }
                    lVar.m(i7, null);
                    if (k instanceof v) {
                        k = ((v) k).f16902a;
                    }
                    if (E(k, obj)) {
                        lVar.n(i7, f.f16879i);
                        return 0;
                    }
                    if (lVar.f16895f.getAndSet((i7 * 2) + 1, aVar) == aVar) {
                        return 5;
                    }
                    lVar.l(i7, true);
                    return 5;
                }
                if (lVar.j(i7, k, f.f16875d)) {
                    return 1;
                }
            }
        }
    }

    public final void I(long j) {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j10;
        long j11;
        if (y()) {
            return;
        }
        do {
            atomicLongFieldUpdater = f16863d;
        } while (atomicLongFieldUpdater.get(this) <= j);
        int i7 = f.f16874c;
        int i10 = 0;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f16864e;
            if (i10 >= i7) {
                do {
                    j10 = atomicLongFieldUpdater2.get(this);
                } while (!atomicLongFieldUpdater2.compareAndSet(this, j10, 4611686018427387904L + (j10 & 4611686018427387903L)));
                while (true) {
                    long j12 = atomicLongFieldUpdater.get(this);
                    long j13 = atomicLongFieldUpdater2.get(this);
                    long j14 = j13 & 4611686018427387903L;
                    boolean z8 = (j13 & 4611686018427387904L) != 0;
                    if (j12 == j14 && j12 == atomicLongFieldUpdater.get(this)) {
                        break;
                    } else if (!z8) {
                        atomicLongFieldUpdater2.compareAndSet(this, j13, j14 + 4611686018427387904L);
                    }
                }
                do {
                    j11 = atomicLongFieldUpdater2.get(this);
                } while (!atomicLongFieldUpdater2.compareAndSet(this, j11, j11 & 4611686018427387903L));
                return;
            }
            long j15 = atomicLongFieldUpdater.get(this);
            if (j15 == (atomicLongFieldUpdater2.get(this) & 4611686018427387903L) && j15 == atomicLongFieldUpdater.get(this)) {
                return;
            } else {
                i10++;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:?, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00f0, code lost:
    
        r5 = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00f2, code lost:
    
        d(r26, r28, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00f5, code lost:
    
        r1 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00fa, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00fb, code lost:
    
        r1 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01bc, code lost:
    
        r1.z();
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01bf, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0142, code lost:
    
        if (r23 >= r5.get(r26)) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0144, code lost:
    
        r21.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0147, code lost:
    
        r1 = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0149, code lost:
    
        d(r26, r28, r1);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    @Override // ec.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object a(Hb.d dVar, Object obj) {
        l lVar;
        Object obj2;
        C0944m c0944m;
        C0944m c0944m2;
        Db.q qVar;
        Ib.a aVar;
        C0944m c0944m3;
        l lVar2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f16865f;
        l lVar3 = (l) atomicReferenceFieldUpdater.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f16861b;
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j = andIncrement & 1152921504606846975L;
            boolean u3 = u(andIncrement, false);
            int i7 = f.f16873b;
            long j10 = i7;
            long j11 = j / j10;
            int i10 = (int) (j % j10);
            long j12 = lVar3.f17971c;
            Db.q qVar2 = Db.q.f3365a;
            if (j12 != j11) {
                l b2 = b(this, j11, lVar3);
                if (b2 != null) {
                    lVar = b2;
                } else if (u3) {
                    obj2 = A(dVar, obj);
                    if (obj2 != Ib.a.f5345a) {
                        return qVar2;
                    }
                }
            } else {
                lVar = lVar3;
            }
            l lVar4 = lVar;
            int e2 = e(this, lVar, i10, obj, j, null, u3);
            if (e2 == 0) {
                lVar4.a();
                return qVar2;
            }
            if (e2 == 1) {
                break;
            }
            if (e2 != 2) {
                AtomicLongFieldUpdater atomicLongFieldUpdater2 = f16862c;
                if (e2 == 3) {
                    C0944m s3 = F.s(com.bumptech.glide.c.F(dVar));
                    try {
                        int e10 = e(this, lVar4, i10, obj, j, s3, false);
                        try {
                            if (e10 != 0) {
                                if (e10 != 1) {
                                    if (e10 == 2) {
                                        c0944m2 = s3;
                                        qVar = qVar2;
                                        c0944m2.a(lVar4, i10 + i7);
                                    } else if (e10 == 4) {
                                        c0944m2 = s3;
                                        qVar = qVar2;
                                        if (j < atomicLongFieldUpdater2.get(this)) {
                                            lVar4.a();
                                        }
                                        d(this, obj, c0944m2);
                                    } else {
                                        if (e10 != 5) {
                                            throw new IllegalStateException("unexpected");
                                        }
                                        lVar4.a();
                                        l lVar5 = (l) atomicReferenceFieldUpdater.get(this);
                                        while (true) {
                                            long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(this);
                                            long j13 = andIncrement2 & 1152921504606846975L;
                                            boolean u10 = u(andIncrement2, false);
                                            int i11 = f.f16873b;
                                            long j14 = i11;
                                            long j15 = j13 / j14;
                                            int i12 = (int) (j13 % j14);
                                            if (lVar5.f17971c != j15) {
                                                try {
                                                    l b10 = b(this, j15, lVar5);
                                                    if (b10 != null) {
                                                        c0944m3 = s3;
                                                        lVar2 = b10;
                                                    } else if (u10) {
                                                        break;
                                                    }
                                                } catch (Throwable th) {
                                                    th = th;
                                                    C0944m c0944m4 = s3;
                                                }
                                            } else {
                                                c0944m3 = s3;
                                                lVar2 = lVar5;
                                            }
                                            s3 = c0944m3;
                                            l lVar6 = lVar2;
                                            int e11 = e(this, lVar2, i12, obj, j13, s3, u10);
                                            if (e11 == 0) {
                                                c0944m2 = s3;
                                                qVar = qVar2;
                                                lVar6.a();
                                                break;
                                            }
                                            if (e11 == 1) {
                                                break;
                                            }
                                            if (e11 == 2) {
                                                c0944m2 = s3;
                                                if (u10) {
                                                    lVar6.h();
                                                } else {
                                                    c0944m2.a(lVar6, i12 + i11);
                                                }
                                            } else {
                                                if (e11 == 3) {
                                                    throw new IllegalStateException("unexpected");
                                                }
                                                if (e11 == 4) {
                                                    break;
                                                }
                                                if (e11 == 5) {
                                                    lVar6.a();
                                                }
                                                lVar5 = lVar6;
                                            }
                                        }
                                        qVar = qVar2;
                                    }
                                    obj2 = c0944m2.r();
                                    aVar = Ib.a.f5345a;
                                    if (obj2 != aVar) {
                                        obj2 = qVar;
                                    }
                                    if (obj2 != aVar) {
                                        return qVar;
                                    }
                                }
                                c0944m2 = s3;
                                qVar = qVar2;
                                c0944m2.resumeWith(qVar);
                                obj2 = c0944m2.r();
                                aVar = Ib.a.f5345a;
                                if (obj2 != aVar) {
                                }
                                if (obj2 != aVar) {
                                }
                            } else {
                                c0944m2 = s3;
                                qVar = qVar2;
                                lVar4.a();
                            }
                            c0944m2.resumeWith(qVar);
                            obj2 = c0944m2.r();
                            aVar = Ib.a.f5345a;
                            if (obj2 != aVar) {
                            }
                            if (obj2 != aVar) {
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            c0944m = e10;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        c0944m = s3;
                    }
                } else if (e2 != 4) {
                    if (e2 == 5) {
                        lVar4.a();
                    }
                    lVar3 = lVar4;
                } else {
                    if (j < atomicLongFieldUpdater2.get(this)) {
                        lVar4.a();
                    }
                    Object A10 = A(dVar, obj);
                    if (A10 == Ib.a.f5345a) {
                        return A10;
                    }
                }
            } else {
                if (!u3) {
                    return qVar2;
                }
                lVar4.h();
                obj2 = A(dVar, obj);
                if (obj2 != Ib.a.f5345a) {
                    return qVar2;
                }
            }
        }
        return obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v2, types: [cc.m] */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r16v0, types: [java.lang.Object, ec.d] */
    @Override // ec.t
    public final Object c(Jb.i iVar) {
        l lVar;
        ?? r13;
        C0944m c0944m;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f16866u;
        l lVar2 = (l) atomicReferenceFieldUpdater.get(this);
        while (!v()) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f16862c;
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j = f.f16873b;
            long j10 = andIncrement / j;
            int i7 = (int) (andIncrement % j);
            if (lVar2.f17971c != j10) {
                l o10 = o(j10, lVar2);
                if (o10 == null) {
                    continue;
                } else {
                    lVar = o10;
                }
            } else {
                lVar = lVar2;
            }
            Object G9 = G(lVar, i7, andIncrement, null);
            R7.a aVar = f.f16881m;
            if (G9 == aVar) {
                throw new IllegalStateException("unexpected");
            }
            R7.a aVar2 = f.f16883o;
            if (G9 == aVar2) {
                if (andIncrement < s()) {
                    lVar.a();
                }
                lVar2 = lVar;
            } else {
                if (G9 != f.f16882n) {
                    lVar.a();
                    return G9;
                }
                C0944m s3 = F.s(com.bumptech.glide.c.F(iVar));
                try {
                    Object G10 = G(lVar, i7, andIncrement, s3);
                    try {
                        if (G10 == aVar) {
                            c0944m = s3;
                            c0944m.a(lVar, i7);
                        } else {
                            c0944m = s3;
                            if (G10 == aVar2) {
                                if (andIncrement < s()) {
                                    lVar.a();
                                }
                                l lVar3 = (l) atomicReferenceFieldUpdater.get(this);
                                while (true) {
                                    if (v()) {
                                        c0944m.resumeWith(com.bumptech.glide.c.n(q()));
                                        break;
                                    }
                                    long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(this);
                                    long j11 = f.f16873b;
                                    long j12 = andIncrement2 / j11;
                                    int i10 = (int) (andIncrement2 % j11);
                                    if (lVar3.f17971c != j12) {
                                        l o11 = o(j12, lVar3);
                                        if (o11 != null) {
                                            lVar3 = o11;
                                        }
                                    }
                                    G10 = G(lVar3, i10, andIncrement2, c0944m);
                                    if (G10 == f.f16881m) {
                                        c0944m.a(lVar3, i10);
                                        break;
                                    }
                                    if (G10 == f.f16883o) {
                                        if (andIncrement2 < s()) {
                                            lVar3.a();
                                        }
                                    } else {
                                        if (G10 == f.f16882n) {
                                            throw new IllegalStateException("unexpected");
                                        }
                                        lVar3.a();
                                    }
                                }
                            } else {
                                lVar.a();
                            }
                            c0944m.b(G10, null);
                        }
                        Object r10 = c0944m.r();
                        Ib.a aVar3 = Ib.a.f5345a;
                        return r10;
                    } catch (Throwable th) {
                        th = th;
                        r13 = aVar;
                        r13.z();
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    r13 = s3;
                }
            }
        }
        Throwable q10 = q();
        int i11 = hc.v.f17972a;
        throw q10;
    }

    @Override // ec.t
    public final void cancel(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        k(true, cancellationException);
    }

    @Override // ec.t
    public final Object f(gc.u uVar) {
        return B(this, uVar);
    }

    @Override // ec.t
    public final Object g() {
        l lVar;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f16862c;
        long j = atomicLongFieldUpdater.get(this);
        long j10 = f16861b.get(this);
        if (u(j10, true)) {
            return new i(p());
        }
        long j11 = j10 & 1152921504606846975L;
        Object obj = k.f16892b;
        if (j >= j11) {
            return obj;
        }
        Object obj2 = f.k;
        l lVar2 = (l) f16866u.get(this);
        while (!v()) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j12 = f.f16873b;
            long j13 = andIncrement / j12;
            int i7 = (int) (andIncrement % j12);
            if (lVar2.f17971c != j13) {
                l o10 = o(j13, lVar2);
                if (o10 == null) {
                    continue;
                } else {
                    lVar = o10;
                }
            } else {
                lVar = lVar2;
            }
            Object G9 = G(lVar, i7, andIncrement, obj2);
            if (G9 == f.f16881m) {
                N0 n02 = obj2 instanceof N0 ? (N0) obj2 : null;
                if (n02 != null) {
                    n02.a(lVar, i7);
                }
                I(andIncrement);
                lVar.h();
            } else if (G9 == f.f16883o) {
                if (andIncrement < s()) {
                    lVar.a();
                }
                lVar2 = lVar;
            } else {
                if (G9 == f.f16882n) {
                    throw new IllegalStateException("unexpected");
                }
                lVar.a();
                obj = G9;
            }
            return obj;
        }
        return new i(p());
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:?, code lost:
    
        return r1;
     */
    @Override // ec.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object h(Object obj) {
        l lVar;
        l lVar2;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f16861b;
        boolean z8 = u(atomicLongFieldUpdater.get(this), false) ? false : !i(r0 & 1152921504606846975L);
        j jVar = k.f16892b;
        if (!z8) {
            z1.o oVar = f.j;
            l lVar3 = (l) f16865f.get(this);
            while (true) {
                long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
                long j = andIncrement & 1152921504606846975L;
                boolean u3 = u(andIncrement, false);
                int i7 = f.f16873b;
                long j10 = i7;
                long j11 = j / j10;
                int i10 = (int) (j % j10);
                if (lVar3.f17971c != j11) {
                    l b2 = b(this, j11, lVar3);
                    if (b2 != null) {
                        lVar = b2;
                    } else if (u3) {
                        return new i(r());
                    }
                } else {
                    lVar = lVar3;
                }
                l lVar4 = lVar;
                int e2 = e(this, lVar, i10, obj, j, oVar, u3);
                Db.q qVar = Db.q.f3365a;
                if (e2 == 0) {
                    lVar4.a();
                    break;
                }
                if (e2 == 1) {
                    break;
                }
                if (e2 == 2) {
                    if (u3) {
                        lVar4.h();
                        return new i(r());
                    }
                    N0 n02 = oVar instanceof N0 ? (N0) oVar : null;
                    if (n02 != null) {
                        lVar2 = lVar4;
                        n02.a(lVar2, i10 + i7);
                    } else {
                        lVar2 = lVar4;
                    }
                    lVar2.h();
                    return jVar;
                }
                if (e2 == 3) {
                    throw new IllegalStateException("unexpected");
                }
                if (e2 == 4) {
                    if (j < f16862c.get(this)) {
                        lVar4.a();
                    }
                    return new i(r());
                }
                if (e2 == 5) {
                    lVar4.a();
                }
                lVar3 = lVar4;
            }
        } else {
            return jVar;
        }
    }

    public final boolean i(long j) {
        return j < f16863d.get(this) || j < f16862c.get(this) + ((long) this.f16870a);
    }

    @Override // ec.t
    public final C1116a iterator() {
        return new C1116a(this);
    }

    public final boolean j(Throwable th) {
        return k(false, th);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0024, code lost:
    
        r3 = ec.f.f16887s;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0026, code lost:
    
        r4 = ec.d.f16868w;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002c, code lost:
    
        if (r4.compareAndSet(r13, r3, r15) == false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0034, code lost:
    
        if (r4.get(r13) == r3) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0036, code lost:
    
        r11 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0039, code lost:
    
        if (r14 == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003b, code lost:
    
        r5 = r9.get(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004b, code lost:
    
        if (r9.compareAndSet(r13, r5, (3 << 60) + (r5 & 1152921504606846975L)) == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006e, code lost:
    
        w();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0071, code lost:
    
        if (r11 == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0073, code lost:
    
        r14 = ec.d.f16869x;
        r15 = r14.get(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0079, code lost:
    
        if (r15 != null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007b, code lost:
    
        r0 = ec.f.f16885q;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0084, code lost:
    
        if (r14.compareAndSet(r13, r15, r0) == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2:0x000a, code lost:
    
        if (r14 != false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x009a, code lost:
    
        if (r14.get(r13) == r15) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0086, code lost:
    
        if (r15 != null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0089, code lost:
    
        kotlin.jvm.internal.y.b(1, r15);
        ((Rb.c) r15).invoke(p());
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x007e, code lost:
    
        r0 = ec.f.f16886r;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x009d, code lost:
    
        return r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x000c, code lost:
    
        r5 = r9.get(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x004e, code lost:
    
        r5 = r9.get(r13);
        r14 = (int) (r5 >> 60);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0055, code lost:
    
        if (r14 == 0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0057, code lost:
    
        if (r14 == 1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x005a, code lost:
    
        r14 = r5 & 1152921504606846975L;
        r3 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x006c, code lost:
    
        if (r9.compareAndSet(r13, r5, (r3 << 60) + r14) == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0013, code lost:
    
        if (((int) (r5 >> 60)) != 0) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0061, code lost:
    
        r14 = r5 & 1152921504606846975L;
        r3 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x002e, code lost:
    
        r11 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0015, code lost:
    
        r7 = ec.f.f16872a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0022, code lost:
    
        if (r9.compareAndSet(r13, r5, (1 << 60) + (r5 & 1152921504606846975L)) == false) goto L46;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean k(boolean z8, Throwable th) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f16861b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x008f, code lost:
    
        r1 = (ec.l) ((hc.AbstractC1276d) hc.AbstractC1276d.f17938b.get(r1));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final l l(long j) {
        Object obj;
        long j10;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Object obj2 = f16867v.get(this);
        l lVar = (l) f16865f.get(this);
        if (lVar.f17971c > ((l) obj2).f17971c) {
            obj2 = lVar;
        }
        l lVar2 = (l) f16866u.get(this);
        if (lVar2.f17971c > ((l) obj2).f17971c) {
            obj2 = lVar2;
        }
        AbstractC1276d abstractC1276d = (AbstractC1276d) obj2;
        loop0: while (true) {
            abstractC1276d.getClass();
            Object obj3 = AbstractC1276d.f17937a.get(abstractC1276d);
            R7.a aVar = AbstractC1273a.f17930b;
            obj = null;
            if (obj3 == aVar) {
                break;
            }
            AbstractC1276d abstractC1276d2 = (AbstractC1276d) obj3;
            if (abstractC1276d2 == null) {
                do {
                    atomicReferenceFieldUpdater = AbstractC1276d.f17937a;
                    if (atomicReferenceFieldUpdater.compareAndSet(abstractC1276d, null, aVar)) {
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater.get(abstractC1276d) == null);
            } else {
                abstractC1276d = abstractC1276d2;
            }
        }
        l lVar3 = (l) abstractC1276d;
        if (x()) {
            l lVar4 = lVar3;
            loop2: do {
                int i7 = f.f16873b - 1;
                while (true) {
                    if (-1 >= i7) {
                        break;
                    }
                    j10 = (lVar4.f17971c * f.f16873b) + i7;
                    if (j10 < f16862c.get(this)) {
                        break loop2;
                    }
                    while (true) {
                        Object k = lVar4.k(i7);
                        if (k != null && k != f.f16876e) {
                            if (k == f.f16875d) {
                                break loop2;
                            }
                        } else {
                            if (lVar4.j(i7, k, f.f16880l)) {
                                lVar4.h();
                                break;
                            }
                        }
                    }
                    i7--;
                }
            } while (lVar4 != null);
            j10 = -1;
            if (j10 != -1) {
                m(j10);
            }
        }
        loop5: for (l lVar5 = lVar3; lVar5 != null; lVar5 = (l) ((AbstractC1276d) AbstractC1276d.f17938b.get(lVar5))) {
            for (int i10 = f.f16873b - 1; -1 < i10; i10--) {
                if ((lVar5.f17971c * f.f16873b) + i10 < j) {
                    break loop5;
                }
                while (true) {
                    Object k7 = lVar5.k(i10);
                    if (k7 != null && k7 != f.f16876e) {
                        if (!(k7 instanceof v)) {
                            if (!(k7 instanceof N0)) {
                                break;
                            }
                            if (lVar5.j(i10, k7, f.f16880l)) {
                                obj = AbstractC1273a.f(obj, k7);
                                lVar5.l(i10, true);
                                break;
                            }
                        } else {
                            if (lVar5.j(i10, k7, f.f16880l)) {
                                obj = AbstractC1273a.f(obj, ((v) k7).f16902a);
                                lVar5.l(i10, true);
                                break;
                            }
                        }
                    } else {
                        if (lVar5.j(i10, k7, f.f16880l)) {
                            lVar5.h();
                            break;
                        }
                    }
                }
            }
        }
        if (obj != null) {
            if (obj instanceof ArrayList) {
                ArrayList arrayList = (ArrayList) obj;
                for (int size = arrayList.size() - 1; -1 < size; size--) {
                    D((N0) arrayList.get(size), true);
                }
            } else {
                D((N0) obj, true);
            }
        }
        return lVar3;
    }

    public final void m(long j) {
        l lVar = (l) f16866u.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f16862c;
            long j10 = atomicLongFieldUpdater.get(this);
            if (j < Math.max(this.f16870a + j10, f16863d.get(this))) {
                return;
            }
            if (atomicLongFieldUpdater.compareAndSet(this, j10, j10 + 1)) {
                long j11 = f.f16873b;
                long j12 = j10 / j11;
                int i7 = (int) (j10 % j11);
                if (lVar.f17971c != j12) {
                    l o10 = o(j12, lVar);
                    if (o10 != null) {
                        lVar = o10;
                    }
                }
                if (G(lVar, i7, j10, null) != f.f16883o) {
                    lVar.a();
                } else if (j10 < s()) {
                    lVar.a();
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:117:0x00c4, code lost:
    
        if ((r0.addAndGet(r16, r14 - r9) & 4611686018427387904L) != 0) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x00cd, code lost:
    
        if ((r0.get(r16) & 4611686018427387904L) == 0) goto L144;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void n() {
        Object b2;
        if (y()) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f16867v;
        l lVar = (l) atomicReferenceFieldUpdater.get(this);
        loop0: while (true) {
            long andIncrement = f16863d.getAndIncrement(this);
            long j = andIncrement / f.f16873b;
            if (s() <= andIncrement) {
                if (lVar.f17971c < j && lVar.b() != null) {
                    z(j, lVar);
                }
                t(this);
                return;
            }
            if (lVar.f17971c != j) {
                e eVar = e.f16871a;
                while (true) {
                    b2 = AbstractC1273a.b(lVar, j, eVar);
                    if (!AbstractC1273a.e(b2)) {
                        hc.u c10 = AbstractC1273a.c(b2);
                        while (true) {
                            hc.u uVar = (hc.u) atomicReferenceFieldUpdater.get(this);
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
                    } else {
                        break;
                    }
                }
                l lVar2 = null;
                if (AbstractC1273a.e(b2)) {
                    w();
                    z(j, lVar);
                    t(this);
                } else {
                    l lVar3 = (l) AbstractC1273a.c(b2);
                    long j10 = lVar3.f17971c;
                    if (j10 > j) {
                        long j11 = j10 * f.f16873b;
                        if (f16863d.compareAndSet(this, andIncrement + 1, j11)) {
                            AtomicLongFieldUpdater atomicLongFieldUpdater = f16864e;
                        } else {
                            t(this);
                        }
                    } else {
                        lVar2 = lVar3;
                    }
                }
                if (lVar2 == null) {
                    continue;
                } else {
                    lVar = lVar2;
                }
            }
            int i7 = (int) (andIncrement % f.f16873b);
            Object k = lVar.k(i7);
            boolean z8 = k instanceof N0;
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f16862c;
            if (!z8 || andIncrement < atomicLongFieldUpdater2.get(this) || !lVar.j(i7, k, f.g)) {
                while (true) {
                    Object k7 = lVar.k(i7);
                    if (!(k7 instanceof N0)) {
                        if (k7 != f.j) {
                            if (k7 != null) {
                                if (k7 == f.f16875d || k7 == f.f16878h || k7 == f.f16879i || k7 == f.k || k7 == f.f16880l) {
                                    break loop0;
                                }
                                if (k7 != f.f16877f) {
                                    throw new IllegalStateException(("Unexpected cell state: " + k7).toString());
                                }
                            } else if (lVar.j(i7, k7, f.f16876e)) {
                                break loop0;
                            }
                        } else {
                            break;
                        }
                    } else if (andIncrement < atomicLongFieldUpdater2.get(this)) {
                        if (lVar.j(i7, k7, new v((N0) k7))) {
                            break loop0;
                        }
                    } else if (lVar.j(i7, k7, f.g)) {
                        if (F(k7)) {
                            lVar.n(i7, f.f16875d);
                            break;
                        } else {
                            lVar.n(i7, f.j);
                            lVar.h();
                        }
                    }
                }
            } else if (F(k)) {
                lVar.n(i7, f.f16875d);
                break;
            } else {
                lVar.n(i7, f.j);
                lVar.h();
                t(this);
            }
        }
        t(this);
    }

    public final l o(long j, l lVar) {
        Object b2;
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j10;
        l lVar2 = f.f16872a;
        e eVar = e.f16871a;
        loop0: while (true) {
            b2 = AbstractC1273a.b(lVar, j, eVar);
            if (!AbstractC1273a.e(b2)) {
                hc.u c10 = AbstractC1273a.c(b2);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f16866u;
                    hc.u uVar = (hc.u) atomicReferenceFieldUpdater.get(this);
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
        if (AbstractC1273a.e(b2)) {
            w();
            if (lVar.f17971c * f.f16873b >= s()) {
                return null;
            }
            lVar.a();
            return null;
        }
        l lVar3 = (l) AbstractC1273a.c(b2);
        boolean y10 = y();
        long j11 = lVar3.f17971c;
        if (!y10 && j <= f16863d.get(this) / f.f16873b) {
            while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f16867v;
                hc.u uVar2 = (hc.u) atomicReferenceFieldUpdater2.get(this);
                if (uVar2.f17971c >= j11) {
                    break;
                }
                if (!lVar3.i()) {
                    break;
                }
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, uVar2, lVar3)) {
                    if (atomicReferenceFieldUpdater2.get(this) != uVar2) {
                        if (lVar3.e()) {
                            lVar3.d();
                        }
                    }
                }
                if (uVar2.e()) {
                    uVar2.d();
                }
            }
        }
        if (j11 <= j) {
            return lVar3;
        }
        long j12 = f.f16873b * j11;
        do {
            atomicLongFieldUpdater = f16862c;
            j10 = atomicLongFieldUpdater.get(this);
            if (j10 >= j12) {
                break;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j10, j12));
        if (j11 * f.f16873b >= s()) {
            return null;
        }
        lVar3.a();
        return null;
    }

    public final Throwable p() {
        return (Throwable) f16868w.get(this);
    }

    public final Throwable q() {
        Throwable p10 = p();
        return p10 == null ? new NoSuchElementException("Channel was closed") : p10;
    }

    public final Throwable r() {
        Throwable p10 = p();
        return p10 == null ? new IllegalStateException("Channel was closed") : p10;
    }

    public final long s() {
        return f16861b.get(this) & 1152921504606846975L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:96:0x01a2, code lost:
    
        r3 = (ec.l) r3.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01a9, code lost:
    
        if (r3 != null) goto L89;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String toString() {
        String obj;
        StringBuilder sb2 = new StringBuilder();
        int i7 = (int) (f16861b.get(this) >> 60);
        if (i7 == 2) {
            sb2.append("closed,");
        } else if (i7 == 3) {
            sb2.append("cancelled,");
        }
        sb2.append("capacity=" + this.f16870a + ',');
        sb2.append("data=[");
        int i10 = 0;
        List y10 = u0.y(f16866u.get(this), f16865f.get(this), f16867v.get(this));
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : y10) {
            if (((l) obj2) != f.f16872a) {
                arrayList.add(obj2);
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Object next = it.next();
        if (it.hasNext()) {
            long j = ((l) next).f17971c;
            do {
                Object next2 = it.next();
                long j10 = ((l) next2).f17971c;
                if (j > j10) {
                    next = next2;
                    j = j10;
                }
            } while (it.hasNext());
        }
        l lVar = (l) next;
        long j11 = f16862c.get(this);
        long s3 = s();
        loop2: while (true) {
            int i11 = f.f16873b;
            int i12 = i10;
            while (true) {
                if (i12 >= i11) {
                    break;
                }
                long j12 = (lVar.f17971c * f.f16873b) + i12;
                if (j12 >= s3 && j12 >= j11) {
                    break loop2;
                }
                Object k = lVar.k(i12);
                Object obj3 = lVar.f16895f.get(i12 * 2);
                if (k instanceof InterfaceC0942l) {
                    obj = (j12 >= j11 || j12 < s3) ? (j12 >= s3 || j12 < j11) ? "cont" : "send" : "receive";
                } else if (k instanceof s) {
                    obj = "receiveCatching";
                } else if (k instanceof v) {
                    obj = "EB(" + k + ')';
                } else if (kotlin.jvm.internal.l.a(k, f.f16877f) ? true : kotlin.jvm.internal.l.a(k, f.g)) {
                    obj = "resuming_sender";
                } else if (k == null ? true : k.equals(f.f16876e) ? true : kotlin.jvm.internal.l.a(k, f.f16879i) ? true : kotlin.jvm.internal.l.a(k, f.f16878h) ? true : kotlin.jvm.internal.l.a(k, f.k) ? true : kotlin.jvm.internal.l.a(k, f.j) ? true : kotlin.jvm.internal.l.a(k, f.f16880l)) {
                    i12++;
                } else {
                    obj = k.toString();
                }
                if (obj3 != null) {
                    sb2.append("(" + obj + ',' + obj3 + "),");
                } else {
                    sb2.append(obj + ',');
                }
                i12++;
            }
            i10 = 0;
        }
        if (sb2.length() == 0) {
            throw new NoSuchElementException("Char sequence is empty.");
        }
        if (sb2.charAt(ac.g.c0(sb2)) == ',') {
            kotlin.jvm.internal.l.d(sb2.deleteCharAt(sb2.length() - 1), "this.deleteCharAt(index)");
        }
        sb2.append("]");
        return sb2.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:85:0x00a4, code lost:
    
        r0 = (ec.l) ((hc.AbstractC1276d) hc.AbstractC1276d.f17938b.get(r0));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean u(long j, boolean z8) {
        int i7 = (int) (j >> 60);
        if (i7 == 0 || i7 == 1) {
            return false;
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = f16862c;
        if (i7 == 2) {
            l(j & 1152921504606846975L);
            if (z8) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f16866u;
                    l lVar = (l) atomicReferenceFieldUpdater.get(this);
                    long j10 = atomicLongFieldUpdater.get(this);
                    if (s() <= j10) {
                        break;
                    }
                    long j11 = f.f16873b;
                    long j12 = j10 / j11;
                    if (lVar.f17971c != j12 && (lVar = o(j12, lVar)) == null) {
                        if (((l) atomicReferenceFieldUpdater.get(this)).f17971c < j12) {
                            break;
                        }
                    } else {
                        lVar.a();
                        int i10 = (int) (j10 % j11);
                        while (true) {
                            Object k = lVar.k(i10);
                            if (k == null || k == f.f16876e) {
                                if (lVar.j(i10, k, f.f16878h)) {
                                    n();
                                    break;
                                }
                            } else {
                                if (k == f.f16875d) {
                                    return false;
                                }
                                if (k != f.j && k != f.f16880l && k != f.f16879i && k != f.f16878h) {
                                    if (k == f.g) {
                                        return false;
                                    }
                                    if (k != f.f16877f && j10 == atomicLongFieldUpdater.get(this)) {
                                        return false;
                                    }
                                }
                            }
                        }
                        f16862c.compareAndSet(this, j10, j10 + 1);
                    }
                }
            }
        } else {
            if (i7 != 3) {
                throw new IllegalStateException(h3.o.l(i7, "unexpected close status: ").toString());
            }
            l l10 = l(j & 1152921504606846975L);
            Object obj = null;
            loop0: do {
                int i11 = f.f16873b - 1;
                while (true) {
                    if (-1 >= i11) {
                        break;
                    }
                    long j13 = (l10.f17971c * f.f16873b) + i11;
                    while (true) {
                        Object k7 = l10.k(i11);
                        if (k7 == f.f16879i) {
                            break loop0;
                        }
                        if (k7 == f.f16875d) {
                            if (j13 < atomicLongFieldUpdater.get(this)) {
                                break loop0;
                            }
                            if (l10.j(i11, k7, f.f16880l)) {
                                l10.m(i11, null);
                                l10.h();
                                break;
                            }
                        } else if (k7 != f.f16876e && k7 != null) {
                            if (!(k7 instanceof N0) && !(k7 instanceof v)) {
                                R7.a aVar = f.g;
                                if (k7 == aVar || k7 == f.f16877f) {
                                    break loop0;
                                }
                                if (k7 != aVar) {
                                    break;
                                }
                            } else {
                                if (j13 < atomicLongFieldUpdater.get(this)) {
                                    break loop0;
                                }
                                N0 n02 = k7 instanceof v ? ((v) k7).f16902a : (N0) k7;
                                if (l10.j(i11, k7, f.f16880l)) {
                                    obj = AbstractC1273a.f(obj, n02);
                                    l10.m(i11, null);
                                    l10.h();
                                    break;
                                }
                            }
                        } else if (l10.j(i11, k7, f.f16880l)) {
                            l10.h();
                            break;
                        }
                    }
                    i11--;
                }
            } while (l10 != null);
            if (obj != null) {
                if (obj instanceof ArrayList) {
                    ArrayList arrayList = (ArrayList) obj;
                    for (int size = arrayList.size() - 1; -1 < size; size--) {
                        D((N0) arrayList.get(size), false);
                    }
                } else {
                    D((N0) obj, false);
                }
            }
        }
        return true;
    }

    public final boolean v() {
        return u(f16861b.get(this), true);
    }

    public final boolean w() {
        return u(f16861b.get(this), false);
    }

    public boolean x() {
        return false;
    }

    public final boolean y() {
        long j = f16863d.get(this);
        return j == 0 || j == Long.MAX_VALUE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0011, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void z(long j, l lVar) {
        l lVar2;
        l lVar3;
        while (lVar.f17971c < j && (lVar3 = (l) lVar.b()) != null) {
            lVar = lVar3;
        }
        while (true) {
            if (!lVar.c() || (lVar2 = (l) lVar.b()) == null) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f16867v;
                    hc.u uVar = (hc.u) atomicReferenceFieldUpdater.get(this);
                    if (uVar.f17971c >= lVar.f17971c) {
                        return;
                    }
                    if (!lVar.i()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, uVar, lVar)) {
                        if (atomicReferenceFieldUpdater.get(this) != uVar) {
                            if (lVar.e()) {
                                lVar.d();
                            }
                        }
                    }
                    if (uVar.e()) {
                        uVar.d();
                        return;
                    }
                    return;
                }
            }
            lVar = lVar2;
        }
    }
}
