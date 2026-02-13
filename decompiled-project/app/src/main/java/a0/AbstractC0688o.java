package a0;

import F.Q;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;
import u.C2047J;

/* renamed from: a0.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0688o {

    /* renamed from: a, reason: collision with root package name */
    public static final Q7.h f12404a = new Q7.h(10, (byte) 0);

    /* renamed from: b, reason: collision with root package name */
    public static final Object f12405b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static C0686m f12406c;

    /* renamed from: d, reason: collision with root package name */
    public static long f12407d;

    /* renamed from: e, reason: collision with root package name */
    public static final Q f12408e;

    /* renamed from: f, reason: collision with root package name */
    public static final A4.s f12409f;
    public static Object g;

    /* renamed from: h, reason: collision with root package name */
    public static Object f12410h;

    /* renamed from: i, reason: collision with root package name */
    public static final C0677d f12411i;
    public static final Y.a j;

    /* JADX WARN: Type inference failed for: r0v5, types: [F.Q, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [A4.s, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [a0.i, a0.d, a0.e] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.util.concurrent.atomic.AtomicInteger, Y.a] */
    /* JADX WARN: Type inference failed for: r5v1, types: [int[], java.io.Serializable] */
    static {
        C0686m c0686m = C0686m.f12397e;
        f12406c = c0686m;
        f12407d = 1 + 1;
        ?? obj = new Object();
        obj.f3938c = new long[16];
        obj.f3939d = new int[16];
        int[] iArr = new int[16];
        int i7 = 0;
        while (i7 < 16) {
            int i10 = i7 + 1;
            iArr[i7] = i10;
            i7 = i10;
        }
        obj.f3940e = iArr;
        f12408e = obj;
        ?? obj2 = new Object();
        obj2.f471b = new int[16];
        obj2.f472c = new Y.n[16];
        f12409f = obj2;
        Eb.v vVar = Eb.v.f3891a;
        g = vVar;
        f12410h = vVar;
        long j10 = f12407d;
        f12407d = 1 + j10;
        ?? c0678e = new C0678e(j10, c0686m, null, C0674a.f12365b);
        f12406c = f12406c.z(c0678e.f12387b);
        f12411i = c0678e;
        j = new AtomicInteger(0);
    }

    public static final void a() {
        f(C0674a.f12366c);
    }

    public static final Rb.c b(Rb.c cVar, Rb.c cVar2) {
        return (cVar == null || cVar2 == null || cVar == cVar2) ? cVar == null ? cVar2 : cVar : new C0675b(cVar, cVar2, 2);
    }

    public static final HashMap c(long j10, C0678e c0678e, C0686m c0686m) {
        long[] jArr;
        C0686m c0686m2;
        long[] jArr2;
        C0686m c0686m3;
        int i7;
        AbstractC0697x s3;
        long j11 = j10;
        C2047J x2 = c0678e.x();
        if (x2 != null) {
            C0686m y10 = c0678e.d().z(c0678e.g()).y(c0678e.j);
            Object[] objArr = x2.f24610b;
            long[] jArr3 = x2.f24609a;
            int length = jArr3.length - 2;
            if (length < 0) {
                return null;
            }
            int i10 = 0;
            HashMap hashMap = null;
            loop0: while (true) {
                long j12 = jArr3[i10];
                if ((((~j12) << 7) & j12 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8;
                    int i12 = 8 - ((~(i10 - length)) >>> 31);
                    int i13 = 0;
                    while (i13 < i12) {
                        if ((j12 & 255) < 128) {
                            InterfaceC0695v interfaceC0695v = (InterfaceC0695v) objArr[(i10 << 3) + i13];
                            AbstractC0697x b2 = interfaceC0695v.b();
                            jArr2 = jArr3;
                            AbstractC0697x s10 = s(b2, j11, c0686m);
                            if (s10 == null || (s3 = s(b2, j11, y10)) == null || s10.equals(s3)) {
                                c0686m3 = y10;
                            } else {
                                c0686m3 = y10;
                                AbstractC0697x s11 = s(b2, c0678e.g(), c0678e.d());
                                if (s11 == null) {
                                    r();
                                    throw null;
                                }
                                AbstractC0697x t5 = interfaceC0695v.t(s3, s10, s11);
                                if (t5 == null) {
                                    break loop0;
                                }
                                if (hashMap == null) {
                                    hashMap = new HashMap();
                                }
                                hashMap.put(s10, t5);
                                hashMap = hashMap;
                            }
                            i7 = 8;
                        } else {
                            jArr2 = jArr3;
                            c0686m3 = y10;
                            i7 = i11;
                        }
                        j12 >>= i7;
                        i13++;
                        i11 = i7;
                        jArr3 = jArr2;
                        y10 = c0686m3;
                        j11 = j10;
                    }
                    jArr = jArr3;
                    c0686m2 = y10;
                    if (i12 != i11) {
                        break;
                    }
                } else {
                    jArr = jArr3;
                    c0686m2 = y10;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
                j11 = j10;
                jArr3 = jArr;
                y10 = c0686m2;
            }
            return hashMap;
        }
        return null;
    }

    public static final void d(AbstractC0682i abstractC0682i) {
        long j10;
        if (f12406c.t(abstractC0682i.g())) {
            return;
        }
        StringBuilder sb2 = new StringBuilder("Snapshot is not open: snapshotId=");
        sb2.append(abstractC0682i.g());
        sb2.append(", disposed=");
        sb2.append(abstractC0682i.f12388c);
        sb2.append(", applied=");
        C0678e c0678e = abstractC0682i instanceof C0678e ? (C0678e) abstractC0682i : null;
        sb2.append(c0678e != null ? Boolean.valueOf(c0678e.f12379m) : "read-only");
        sb2.append(", lowestPin=");
        synchronized (f12405b) {
            Q q10 = f12408e;
            j10 = q10.f3936a > 0 ? ((long[]) q10.f3938c)[0] : -1L;
        }
        sb2.append(j10);
        throw new IllegalStateException(sb2.toString().toString());
    }

    public static final C0686m e(C0686m c0686m, long j10, long j11) {
        while (j10 < j11) {
            c0686m = c0686m.z(j10);
            j10++;
        }
        return c0686m;
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.List, java.util.Collection, java.lang.Object] */
    public static final Object f(Rb.c cVar) {
        C2047J c2047j;
        Object v10;
        C0677d c0677d = f12411i;
        synchronized (f12405b) {
            try {
                c2047j = c0677d.f12376h;
                if (c2047j != null) {
                    j.addAndGet(1);
                }
                v10 = v(c0677d, cVar);
            } catch (Throwable th) {
                throw th;
            }
        }
        if (c2047j != null) {
            try {
                ?? r42 = g;
                int size = r42.size();
                for (int i7 = 0; i7 < size; i7++) {
                    ((Rb.e) r42.get(i7)).invoke(new S.h(c2047j), c0677d);
                }
            } finally {
                j.addAndGet(-1);
            }
        }
        synchronized (f12405b) {
            g();
            if (c2047j != null) {
                Object[] objArr = c2047j.f24610b;
                long[] jArr = c2047j.f24609a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i10 = 0;
                    while (true) {
                        long j10 = jArr[i10];
                        if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i11 = 8 - ((~(i10 - length)) >>> 31);
                            for (int i12 = 0; i12 < i11; i12++) {
                                if ((255 & j10) < 128) {
                                    q((InterfaceC0695v) objArr[(i10 << 3) + i12]);
                                }
                                j10 >>= 8;
                            }
                            if (i11 != 8) {
                                break;
                            }
                        }
                        if (i10 == length) {
                            break;
                        }
                        i10++;
                    }
                }
            }
        }
        return v10;
    }

    public static final void g() {
        A4.s sVar = f12409f;
        int i7 = sVar.f470a;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i10 >= i7) {
                break;
            }
            Y.n nVar = ((Y.n[]) sVar.f472c)[i10];
            Object obj = nVar != null ? nVar.get() : null;
            if (obj != null && p((InterfaceC0695v) obj)) {
                if (i11 != i10) {
                    ((Y.n[]) sVar.f472c)[i11] = nVar;
                    int[] iArr = (int[]) sVar.f471b;
                    iArr[i11] = iArr[i10];
                }
                i11++;
            }
            i10++;
        }
        for (int i12 = i11; i12 < i7; i12++) {
            ((Y.n[]) sVar.f472c)[i12] = null;
            ((int[]) sVar.f471b)[i12] = 0;
        }
        if (i11 != i7) {
            sVar.f470a = i11;
        }
    }

    public static final AbstractC0682i h(AbstractC0682i abstractC0682i, Rb.c cVar, boolean z8) {
        boolean z10 = abstractC0682i instanceof C0678e;
        if (z10 || abstractC0682i == null) {
            return new C0699z(z10 ? (C0678e) abstractC0682i : null, cVar, null, false, z8);
        }
        return new C0673A(abstractC0682i, cVar, z8);
    }

    public static final AbstractC0697x i(AbstractC0697x abstractC0697x) {
        AbstractC0697x s3;
        AbstractC0682i k = k();
        AbstractC0697x s10 = s(abstractC0697x, k.g(), k.d());
        if (s10 != null) {
            return s10;
        }
        synchronized (f12405b) {
            AbstractC0682i k7 = k();
            s3 = s(abstractC0697x, k7.g(), k7.d());
        }
        if (s3 != null) {
            return s3;
        }
        r();
        throw null;
    }

    public static final AbstractC0697x j(AbstractC0697x abstractC0697x, AbstractC0682i abstractC0682i) {
        AbstractC0697x s3;
        AbstractC0697x s10 = s(abstractC0697x, abstractC0682i.g(), abstractC0682i.d());
        if (s10 != null) {
            return s10;
        }
        synchronized (f12405b) {
            s3 = s(abstractC0697x, abstractC0682i.g(), abstractC0682i.d());
        }
        if (s3 != null) {
            return s3;
        }
        r();
        throw null;
    }

    public static final AbstractC0682i k() {
        AbstractC0682i abstractC0682i = (AbstractC0682i) f12404a.w();
        return abstractC0682i == null ? f12411i : abstractC0682i;
    }

    public static final Rb.c l(Rb.c cVar, Rb.c cVar2, boolean z8) {
        if (!z8) {
            cVar2 = null;
        }
        return (cVar == null || cVar2 == null || cVar == cVar2) ? cVar == null ? cVar2 : cVar : new C0675b(cVar, cVar2, 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0025, code lost:
    
        r4 = r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final AbstractC0697x m(AbstractC0697x abstractC0697x, InterfaceC0695v interfaceC0695v) {
        AbstractC0697x b2 = interfaceC0695v.b();
        long j10 = f12407d;
        Q q10 = f12408e;
        if (q10.f3936a > 0) {
            j10 = ((long[]) q10.f3938c)[0];
        }
        long j11 = j10 - 1;
        C0686m c0686m = C0686m.f12397e;
        AbstractC0697x abstractC0697x2 = null;
        AbstractC0697x abstractC0697x3 = null;
        while (true) {
            if (b2 == null) {
                break;
            }
            long j12 = b2.f12435a;
            if (j12 == 0) {
                break;
            }
            if (j12 != 0 && j12 <= j11 && !c0686m.t(j12)) {
                if (abstractC0697x3 == null) {
                    abstractC0697x3 = b2;
                } else if (b2.f12435a >= abstractC0697x3.f12435a) {
                    abstractC0697x2 = abstractC0697x3;
                }
            }
            b2 = b2.f12436b;
        }
        if (abstractC0697x2 != null) {
            abstractC0697x2.f12435a = Long.MAX_VALUE;
            return abstractC0697x2;
        }
        AbstractC0697x b10 = abstractC0697x.b(Long.MAX_VALUE);
        b10.f12436b = interfaceC0695v.b();
        interfaceC0695v.z(b10);
        return b10;
    }

    public static final void n(AbstractC0682i abstractC0682i, InterfaceC0695v interfaceC0695v) {
        abstractC0682i.t(abstractC0682i.h() + 1);
        Rb.c i7 = abstractC0682i.i();
        if (i7 != null) {
            i7.invoke(interfaceC0695v);
        }
    }

    public static final AbstractC0697x o(AbstractC0697x abstractC0697x, AbstractC0696w abstractC0696w, AbstractC0682i abstractC0682i, AbstractC0697x abstractC0697x2) {
        AbstractC0697x m10;
        if (abstractC0682i.f()) {
            abstractC0682i.n(abstractC0696w);
        }
        long g2 = abstractC0682i.g();
        if (abstractC0697x2.f12435a == g2) {
            return abstractC0697x2;
        }
        synchronized (f12405b) {
            m10 = m(abstractC0697x, abstractC0696w);
        }
        m10.f12435a = g2;
        if (abstractC0697x2.f12435a != 1) {
            abstractC0682i.n(abstractC0696w);
        }
        return m10;
    }

    public static final boolean p(InterfaceC0695v interfaceC0695v) {
        AbstractC0697x abstractC0697x;
        long j10 = f12407d;
        Q q10 = f12408e;
        if (q10.f3936a > 0) {
            j10 = ((long[]) q10.f3938c)[0];
        }
        AbstractC0697x abstractC0697x2 = null;
        AbstractC0697x abstractC0697x3 = null;
        int i7 = 0;
        for (AbstractC0697x b2 = interfaceC0695v.b(); b2 != null; b2 = b2.f12436b) {
            long j11 = b2.f12435a;
            if (j11 != 0) {
                if (j11 >= j10) {
                    i7++;
                } else if (abstractC0697x2 == null) {
                    i7++;
                    abstractC0697x2 = b2;
                } else {
                    if (j11 < abstractC0697x2.f12435a) {
                        abstractC0697x = abstractC0697x2;
                        abstractC0697x2 = b2;
                    } else {
                        abstractC0697x = b2;
                    }
                    if (abstractC0697x3 == null) {
                        abstractC0697x3 = interfaceC0695v.b();
                        AbstractC0697x abstractC0697x4 = abstractC0697x3;
                        while (true) {
                            if (abstractC0697x3 == null) {
                                abstractC0697x3 = abstractC0697x4;
                                break;
                            }
                            long j12 = abstractC0697x3.f12435a;
                            if (j12 >= j10) {
                                break;
                            }
                            if (abstractC0697x4.f12435a < j12) {
                                abstractC0697x4 = abstractC0697x3;
                            }
                            abstractC0697x3 = abstractC0697x3.f12436b;
                        }
                    }
                    abstractC0697x2.f12435a = 0L;
                    abstractC0697x2.a(abstractC0697x3);
                    abstractC0697x2 = abstractC0697x;
                }
            }
        }
        return i7 > 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void q(InterfaceC0695v interfaceC0695v) {
        if (p(interfaceC0695v)) {
            A4.s sVar = f12409f;
            int i7 = sVar.f470a;
            int identityHashCode = System.identityHashCode(interfaceC0695v);
            int i10 = -1;
            if (i7 > 0) {
                int i11 = sVar.f470a - 1;
                int i12 = 0;
                while (true) {
                    if (i12 > i11) {
                        i10 = -(i12 + 1);
                        break;
                    }
                    int i13 = (i12 + i11) >>> 1;
                    int i14 = ((int[]) sVar.f471b)[i13];
                    if (i14 < identityHashCode) {
                        i12 = i13 + 1;
                    } else if (i14 > identityHashCode) {
                        i11 = i13 - 1;
                    } else {
                        Y.n nVar = ((Y.n[]) sVar.f472c)[i13];
                        if (interfaceC0695v == (nVar != null ? nVar.get() : null)) {
                            i10 = i13;
                        } else {
                            int i15 = i13 - 1;
                            while (-1 < i15 && ((int[]) sVar.f471b)[i15] == identityHashCode) {
                                Y.n nVar2 = ((Y.n[]) sVar.f472c)[i15];
                                if ((nVar2 != null ? nVar2.get() : null) == interfaceC0695v) {
                                    break;
                                } else {
                                    i15--;
                                }
                            }
                            int i16 = sVar.f470a;
                            i15 = i13 + 1;
                            while (true) {
                                if (i15 >= i16) {
                                    i15 = -(sVar.f470a + 1);
                                    break;
                                } else {
                                    if (((int[]) sVar.f471b)[i15] != identityHashCode) {
                                        i15 = -(i15 + 1);
                                        break;
                                    }
                                    Y.n nVar3 = ((Y.n[]) sVar.f472c)[i15];
                                    if ((nVar3 != null ? nVar3.get() : null) == interfaceC0695v) {
                                        break;
                                    } else {
                                        i15++;
                                    }
                                }
                            }
                            i10 = i15;
                        }
                    }
                }
                if (i10 >= 0) {
                    return;
                }
            }
            int i17 = -(i10 + 1);
            Y.n[] nVarArr = (Y.n[]) sVar.f472c;
            int length = nVarArr.length;
            if (i7 == length) {
                int i18 = length * 2;
                Y.n[] nVarArr2 = new Y.n[i18];
                int[] iArr = new int[i18];
                int i19 = i17 + 1;
                System.arraycopy(nVarArr, i17, nVarArr2, i19, i7 - i17);
                System.arraycopy((Y.n[]) sVar.f472c, 0, nVarArr2, 0, i17);
                Eb.n.M(i19, i17, i7, (int[]) sVar.f471b, iArr);
                Eb.n.Q(0, i17, 6, (int[]) sVar.f471b, iArr);
                sVar.f472c = nVarArr2;
                sVar.f471b = iArr;
            } else {
                int i20 = i17 + 1;
                System.arraycopy(nVarArr, i17, nVarArr, i20, i7 - i17);
                int[] iArr2 = (int[]) sVar.f471b;
                Eb.n.M(i20, i17, i7, iArr2, iArr2);
            }
            ((Y.n[]) sVar.f472c)[i17] = new WeakReference(interfaceC0695v);
            ((int[]) sVar.f471b)[i17] = identityHashCode;
            sVar.f470a++;
        }
    }

    public static final void r() {
        throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
    }

    public static final AbstractC0697x s(AbstractC0697x abstractC0697x, long j10, C0686m c0686m) {
        AbstractC0697x abstractC0697x2 = null;
        while (abstractC0697x != null) {
            long j11 = abstractC0697x.f12435a;
            if (j11 != 0 && j11 <= j10 && !c0686m.t(j11) && (abstractC0697x2 == null || abstractC0697x2.f12435a < abstractC0697x.f12435a)) {
                abstractC0697x2 = abstractC0697x;
            }
            abstractC0697x = abstractC0697x.f12436b;
        }
        if (abstractC0697x2 != null) {
            return abstractC0697x2;
        }
        return null;
    }

    public static final AbstractC0697x t(AbstractC0697x abstractC0697x, InterfaceC0695v interfaceC0695v) {
        AbstractC0697x s3;
        AbstractC0682i k = k();
        Rb.c e2 = k.e();
        if (e2 != null) {
            e2.invoke(interfaceC0695v);
        }
        AbstractC0697x s10 = s(abstractC0697x, k.g(), k.d());
        if (s10 != null) {
            return s10;
        }
        synchronized (f12405b) {
            AbstractC0682i k7 = k();
            AbstractC0697x b2 = interfaceC0695v.b();
            kotlin.jvm.internal.l.c(b2, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.readable");
            s3 = s(b2, k7.g(), k7.d());
            if (s3 == null) {
                r();
                throw null;
            }
        }
        return s3;
    }

    public static final void u(int i7) {
        Q q10 = f12408e;
        int i10 = ((int[]) q10.f3940e)[i7];
        q10.h(i10, q10.f3936a - 1);
        q10.f3936a--;
        long[] jArr = (long[]) q10.f3938c;
        long j10 = jArr[i10];
        int i11 = i10;
        while (i11 > 0) {
            int i12 = ((i11 + 1) >> 1) - 1;
            if (jArr[i12] <= j10) {
                break;
            }
            q10.h(i12, i11);
            i11 = i12;
        }
        long[] jArr2 = (long[]) q10.f3938c;
        int i13 = q10.f3936a >> 1;
        while (i10 < i13) {
            int i14 = (i10 + 1) << 1;
            int i15 = i14 - 1;
            if (i14 < q10.f3936a) {
                long j11 = jArr2[i14];
                if (j11 < jArr2[i15]) {
                    if (j11 >= jArr2[i10]) {
                        break;
                    }
                    q10.h(i14, i10);
                    i10 = i14;
                }
            }
            if (jArr2[i15] >= jArr2[i10]) {
                break;
            }
            q10.h(i15, i10);
            i10 = i15;
        }
        ((int[]) q10.f3940e)[i7] = q10.f3937b;
        q10.f3937b = i7;
    }

    public static final Object v(C0677d c0677d, Rb.c cVar) {
        long j10 = c0677d.f12387b;
        Object invoke = cVar.invoke(f12406c.o(j10));
        long j11 = f12407d;
        f12407d = 1 + j11;
        C0686m o10 = f12406c.o(j10);
        f12406c = o10;
        c0677d.f12387b = j11;
        c0677d.f12386a = o10;
        c0677d.g = 0;
        c0677d.f12376h = null;
        c0677d.o();
        f12406c = f12406c.z(j11);
        return invoke;
    }

    public static final AbstractC0697x w(AbstractC0697x abstractC0697x, InterfaceC0695v interfaceC0695v, AbstractC0682i abstractC0682i) {
        AbstractC0697x s3;
        if (abstractC0682i.f()) {
            abstractC0682i.n(interfaceC0695v);
        }
        long g2 = abstractC0682i.g();
        AbstractC0697x s10 = s(abstractC0697x, g2, abstractC0682i.d());
        if (s10 == null) {
            r();
            throw null;
        }
        if (s10.f12435a == abstractC0682i.g()) {
            return s10;
        }
        synchronized (f12405b) {
            s3 = s(interfaceC0695v.b(), g2, abstractC0682i.d());
            if (s3 == null) {
                r();
                throw null;
            }
            if (s3.f12435a != g2) {
                AbstractC0697x m10 = m(s3, interfaceC0695v);
                m10.a(s3);
                m10.f12435a = abstractC0682i.g();
                s3 = m10;
            }
        }
        if (s10.f12435a != 1) {
            abstractC0682i.n(interfaceC0695v);
        }
        return s3;
    }
}
