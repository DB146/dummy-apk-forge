package fc;

import cc.C0938j;
import cc.C0944m;
import cc.InterfaceC0937i0;
import gc.AbstractC1207b;
import gc.AbstractC1208c;
import gc.AbstractC1209d;
import java.util.Arrays;

/* loaded from: classes2.dex */
public class P extends AbstractC1207b implements I, InterfaceC1161h, gc.w {

    /* renamed from: e, reason: collision with root package name */
    public final int f17090e;

    /* renamed from: f, reason: collision with root package name */
    public final int f17091f;

    /* renamed from: u, reason: collision with root package name */
    public final int f17092u;

    /* renamed from: v, reason: collision with root package name */
    public Object[] f17093v;

    /* renamed from: w, reason: collision with root package name */
    public long f17094w;

    /* renamed from: x, reason: collision with root package name */
    public long f17095x;

    /* renamed from: y, reason: collision with root package name */
    public int f17096y;

    /* renamed from: z, reason: collision with root package name */
    public int f17097z;

    public P(int i7, int i10, int i11) {
        this.f17090e = i7;
        this.f17091f = i10;
        this.f17092u = i11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0081 A[Catch: all -> 0x0038, TryCatch #1 {all -> 0x0038, blocks: (B:14:0x0031, B:18:0x0079, B:20:0x0081, B:28:0x0094, B:31:0x009b, B:32:0x009f, B:34:0x00a0, B:40:0x004b), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0092 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /* JADX WARN: Type inference failed for: r5v1, types: [gc.b] */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v4, types: [fc.P] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r9v0, types: [fc.i] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v2, types: [gc.d] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [fc.S] */
    /* JADX WARN: Type inference failed for: r9v8, types: [fc.S] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00ae -> B:15:0x0034). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void j(P p10, InterfaceC1162i interfaceC1162i, Hb.d dVar) {
        O o10;
        Ib.a aVar;
        int i7;
        ?? r52;
        InterfaceC1162i interfaceC1162i2;
        InterfaceC0937i0 interfaceC0937i0;
        InterfaceC0937i0 interfaceC0937i02;
        InterfaceC1162i interfaceC1162i3;
        Object s3;
        S s10;
        try {
            try {
                if (dVar instanceof O) {
                    o10 = (O) dVar;
                    int i10 = o10.f17089u;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        o10.f17089u = i10 - Integer.MIN_VALUE;
                        Object obj = o10.f17087e;
                        aVar = Ib.a.f5345a;
                        i7 = o10.f17089u;
                        if (i7 != 0) {
                            com.bumptech.glide.c.c0(obj);
                            interfaceC1162i2 = interfaceC1162i;
                            interfaceC1162i = (S) p10.c();
                        } else {
                            if (i7 != 1) {
                                if (i7 == 2) {
                                    interfaceC0937i02 = o10.f17086d;
                                    S s11 = o10.f17085c;
                                    interfaceC1162i3 = o10.f17084b;
                                    P p11 = o10.f17083a;
                                    com.bumptech.glide.c.c0(obj);
                                    r52 = p11;
                                    interfaceC1162i = s11;
                                    do {
                                        s3 = r52.s(interfaceC1162i);
                                        if (s3 == Q.f17098a) {
                                        }
                                    } while (r52.h(interfaceC1162i, o10) != aVar);
                                    return;
                                }
                                if (i7 != 3) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                interfaceC0937i02 = o10.f17086d;
                                S s12 = o10.f17085c;
                                interfaceC1162i3 = o10.f17084b;
                                P p12 = o10.f17083a;
                                com.bumptech.glide.c.c0(obj);
                                P p13 = p12;
                                S s13 = s12;
                                interfaceC1162i2 = interfaceC1162i3;
                                interfaceC0937i0 = interfaceC0937i02;
                                p10 = p13;
                                s10 = s13;
                                r52 = p10;
                                interfaceC0937i02 = interfaceC0937i0;
                                interfaceC1162i3 = interfaceC1162i2;
                                interfaceC1162i = s10;
                                do {
                                    s3 = r52.s(interfaceC1162i);
                                    if (s3 == Q.f17098a) {
                                        if (interfaceC0937i02 != null && !interfaceC0937i02.isActive()) {
                                            throw interfaceC0937i02.getCancellationException();
                                        }
                                        o10.f17083a = r52;
                                        o10.f17084b = interfaceC1162i3;
                                        o10.f17085c = interfaceC1162i;
                                        o10.f17086d = interfaceC0937i02;
                                        o10.f17089u = 3;
                                        p13 = r52;
                                        s13 = interfaceC1162i;
                                        if (interfaceC1162i3.emit(s3, o10) == aVar) {
                                            return;
                                        }
                                        interfaceC1162i2 = interfaceC1162i3;
                                        interfaceC0937i0 = interfaceC0937i02;
                                        p10 = p13;
                                        s10 = s13;
                                        r52 = p10;
                                        interfaceC0937i02 = interfaceC0937i0;
                                        interfaceC1162i3 = interfaceC1162i2;
                                        interfaceC1162i = s10;
                                        s3 = r52.s(interfaceC1162i);
                                        if (s3 == Q.f17098a) {
                                            o10.f17083a = r52;
                                            o10.f17084b = interfaceC1162i3;
                                            o10.f17085c = interfaceC1162i;
                                            o10.f17086d = interfaceC0937i02;
                                            o10.f17089u = 2;
                                        }
                                    }
                                } while (r52.h(interfaceC1162i, o10) != aVar);
                                return;
                            }
                            interfaceC1162i = o10.f17085c;
                            InterfaceC1162i interfaceC1162i4 = o10.f17084b;
                            P p14 = o10.f17083a;
                            try {
                                com.bumptech.glide.c.c0(obj);
                                interfaceC1162i2 = interfaceC1162i4;
                                p10 = p14;
                                interfaceC1162i = interfaceC1162i;
                            } catch (Throwable th) {
                                th = th;
                                r52 = p14;
                                r52.f(interfaceC1162i);
                                throw th;
                            }
                        }
                        interfaceC0937i0 = (InterfaceC0937i0) o10.getContext().get(cc.B.f14467b);
                        s10 = interfaceC1162i;
                        r52 = p10;
                        interfaceC0937i02 = interfaceC0937i0;
                        interfaceC1162i3 = interfaceC1162i2;
                        interfaceC1162i = s10;
                        do {
                            s3 = r52.s(interfaceC1162i);
                            if (s3 == Q.f17098a) {
                            }
                        } while (r52.h(interfaceC1162i, o10) != aVar);
                        return;
                    }
                }
                interfaceC0937i0 = (InterfaceC0937i0) o10.getContext().get(cc.B.f14467b);
                s10 = interfaceC1162i;
                r52 = p10;
                interfaceC0937i02 = interfaceC0937i0;
                interfaceC1162i3 = interfaceC1162i2;
                interfaceC1162i = s10;
                do {
                    s3 = r52.s(interfaceC1162i);
                    if (s3 == Q.f17098a) {
                    }
                } while (r52.h(interfaceC1162i, o10) != aVar);
                return;
            } catch (Throwable th2) {
                r52 = p10;
                th = th2;
                r52.f(interfaceC1162i);
                throw th;
            }
            if (i7 != 0) {
            }
        } catch (Throwable th3) {
            th = th3;
        }
        o10 = new O(p10, dVar);
        Object obj2 = o10.f17087e;
        aVar = Ib.a.f5345a;
        i7 = o10.f17089u;
    }

    @Override // fc.InterfaceC1161h
    public final Object a(InterfaceC1162i interfaceC1162i, Hb.d dVar) {
        j(this, interfaceC1162i, dVar);
        return Ib.a.f5345a;
    }

    @Override // gc.w
    public final InterfaceC1161h b(Hb.i iVar, int i7, int i10) {
        return Q.l(this, iVar, i7, i10);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [gc.d, java.lang.Object, fc.S] */
    @Override // gc.AbstractC1207b
    public final AbstractC1209d d() {
        ?? obj = new Object();
        obj.f17101a = -1L;
        return obj;
    }

    @Override // gc.AbstractC1207b
    public final AbstractC1209d[] e() {
        return new S[2];
    }

    @Override // fc.I, fc.InterfaceC1162i
    public final Object emit(Object obj, Hb.d dVar) {
        Hb.d[] dVarArr;
        N n6;
        if (p(obj)) {
            return Db.q.f3365a;
        }
        C0944m c0944m = new C0944m(1, com.bumptech.glide.c.F(dVar));
        c0944m.s();
        Hb.d[] dVarArr2 = AbstractC1208c.f17505a;
        synchronized (this) {
            try {
                if (q(obj)) {
                    c0944m.resumeWith(Db.q.f3365a);
                    dVarArr = m(dVarArr2);
                    n6 = null;
                } else {
                    N n8 = new N(this, this.f17096y + this.f17097z + n(), obj, c0944m);
                    l(n8);
                    this.f17097z++;
                    if (this.f17091f == 0) {
                        dVarArr2 = m(dVarArr2);
                    }
                    dVarArr = dVarArr2;
                    n6 = n8;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (n6 != null) {
            c0944m.u(new C0938j(n6, 1));
        }
        for (Hb.d dVar2 : dVarArr) {
            if (dVar2 != null) {
                dVar2.resumeWith(Db.q.f3365a);
            }
        }
        Object r10 = c0944m.r();
        Ib.a aVar = Ib.a.f5345a;
        if (r10 != aVar) {
            r10 = Db.q.f3365a;
        }
        return r10 == aVar ? r10 : Db.q.f3365a;
    }

    public final Object h(S s3, O o10) {
        C0944m c0944m = new C0944m(1, com.bumptech.glide.c.F(o10));
        c0944m.s();
        synchronized (this) {
            if (r(s3) < 0) {
                s3.f17102b = c0944m;
            } else {
                c0944m.resumeWith(Db.q.f3365a);
            }
        }
        Object r10 = c0944m.r();
        return r10 == Ib.a.f5345a ? r10 : Db.q.f3365a;
    }

    public final void i() {
        if (this.f17091f != 0 || this.f17097z > 1) {
            Object[] objArr = this.f17093v;
            kotlin.jvm.internal.l.b(objArr);
            while (this.f17097z > 0) {
                long n6 = n();
                int i7 = this.f17096y;
                int i10 = this.f17097z;
                if (objArr[((int) ((n6 + (i7 + i10)) - 1)) & (objArr.length - 1)] != Q.f17098a) {
                    return;
                }
                this.f17097z = i10 - 1;
                Q.e(objArr, n() + this.f17096y + this.f17097z, null);
            }
        }
    }

    public final void k() {
        AbstractC1209d[] abstractC1209dArr;
        Object[] objArr = this.f17093v;
        kotlin.jvm.internal.l.b(objArr);
        Q.e(objArr, n(), null);
        this.f17096y--;
        long n6 = n() + 1;
        if (this.f17094w < n6) {
            this.f17094w = n6;
        }
        if (this.f17095x < n6) {
            if (this.f17502b != 0 && (abstractC1209dArr = this.f17501a) != null) {
                for (AbstractC1209d abstractC1209d : abstractC1209dArr) {
                    if (abstractC1209d != null) {
                        S s3 = (S) abstractC1209d;
                        long j = s3.f17101a;
                        if (j >= 0 && j < n6) {
                            s3.f17101a = n6;
                        }
                    }
                }
            }
            this.f17095x = n6;
        }
    }

    public final void l(Object obj) {
        int i7 = this.f17096y + this.f17097z;
        Object[] objArr = this.f17093v;
        if (objArr == null) {
            objArr = o(null, 0, 2);
        } else if (i7 >= objArr.length) {
            objArr = o(objArr, i7, objArr.length * 2);
        }
        Q.e(objArr, n() + i7, obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.Object[], java.lang.Object] */
    public final Hb.d[] m(Hb.d[] dVarArr) {
        AbstractC1209d[] abstractC1209dArr;
        S s3;
        C0944m c0944m;
        int length = dVarArr.length;
        if (this.f17502b != 0 && (abstractC1209dArr = this.f17501a) != null) {
            int length2 = abstractC1209dArr.length;
            int i7 = 0;
            dVarArr = dVarArr;
            while (i7 < length2) {
                AbstractC1209d abstractC1209d = abstractC1209dArr[i7];
                if (abstractC1209d != null && (c0944m = (s3 = (S) abstractC1209d).f17102b) != null && r(s3) >= 0) {
                    int length3 = dVarArr.length;
                    dVarArr = dVarArr;
                    if (length >= length3) {
                        ?? copyOf = Arrays.copyOf(dVarArr, Math.max(2, dVarArr.length * 2));
                        kotlin.jvm.internal.l.d(copyOf, "copyOf(this, newSize)");
                        dVarArr = copyOf;
                    }
                    dVarArr[length] = c0944m;
                    s3.f17102b = null;
                    length++;
                }
                i7++;
                dVarArr = dVarArr;
            }
        }
        return dVarArr;
    }

    public final long n() {
        return Math.min(this.f17095x, this.f17094w);
    }

    public final Object[] o(Object[] objArr, int i7, int i10) {
        if (i10 <= 0) {
            throw new IllegalStateException("Buffer size overflow");
        }
        Object[] objArr2 = new Object[i10];
        this.f17093v = objArr2;
        if (objArr == null) {
            return objArr2;
        }
        long n6 = n();
        for (int i11 = 0; i11 < i7; i11++) {
            long j = i11 + n6;
            Q.e(objArr2, j, objArr[((int) j) & (objArr.length - 1)]);
        }
        return objArr2;
    }

    public final boolean p(Object obj) {
        int i7;
        boolean z8;
        Hb.d[] dVarArr = AbstractC1208c.f17505a;
        synchronized (this) {
            if (q(obj)) {
                dVarArr = m(dVarArr);
                z8 = true;
            } else {
                z8 = false;
            }
        }
        for (Hb.d dVar : dVarArr) {
            if (dVar != null) {
                dVar.resumeWith(Db.q.f3365a);
            }
        }
        return z8;
    }

    public final boolean q(Object obj) {
        int i7 = this.f17502b;
        int i10 = this.f17090e;
        if (i7 == 0) {
            if (i10 != 0) {
                l(obj);
                int i11 = this.f17096y + 1;
                this.f17096y = i11;
                if (i11 > i10) {
                    k();
                }
                this.f17095x = n() + this.f17096y;
            }
            return true;
        }
        int i12 = this.f17096y;
        int i13 = this.f17091f;
        if (i12 >= i13 && this.f17095x <= this.f17094w) {
            int b2 = P.c.b(this.f17092u);
            if (b2 == 0) {
                return false;
            }
            if (b2 == 2) {
                return true;
            }
        }
        l(obj);
        int i14 = this.f17096y + 1;
        this.f17096y = i14;
        if (i14 > i13) {
            k();
        }
        long n6 = n() + this.f17096y;
        long j = this.f17094w;
        if (((int) (n6 - j)) > i10) {
            t(j + 1, this.f17095x, n() + this.f17096y, n() + this.f17096y + this.f17097z);
        }
        return true;
    }

    public final long r(S s3) {
        long j = s3.f17101a;
        if (j < n() + this.f17096y) {
            return j;
        }
        if (this.f17091f <= 0 && j <= n() && this.f17097z != 0) {
            return j;
        }
        return -1L;
    }

    public final Object s(S s3) {
        Object obj;
        Hb.d[] dVarArr = AbstractC1208c.f17505a;
        synchronized (this) {
            try {
                long r10 = r(s3);
                if (r10 < 0) {
                    obj = Q.f17098a;
                } else {
                    long j = s3.f17101a;
                    Object[] objArr = this.f17093v;
                    kotlin.jvm.internal.l.b(objArr);
                    Object obj2 = objArr[((int) r10) & (objArr.length - 1)];
                    if (obj2 instanceof N) {
                        obj2 = ((N) obj2).f17081c;
                    }
                    s3.f17101a = r10 + 1;
                    Object obj3 = obj2;
                    dVarArr = u(j);
                    obj = obj3;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        for (Hb.d dVar : dVarArr) {
            if (dVar != null) {
                dVar.resumeWith(Db.q.f3365a);
            }
        }
        return obj;
    }

    public final void t(long j, long j10, long j11, long j12) {
        long min = Math.min(j10, j);
        for (long n6 = n(); n6 < min; n6++) {
            Object[] objArr = this.f17093v;
            kotlin.jvm.internal.l.b(objArr);
            Q.e(objArr, n6, null);
        }
        this.f17094w = j;
        this.f17095x = j10;
        this.f17096y = (int) (j11 - min);
        this.f17097z = (int) (j12 - j11);
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Hb.d[] u(long j) {
        long j10;
        long j11;
        Hb.d[] dVarArr;
        long max;
        Object[] objArr;
        long j12;
        AbstractC1209d[] abstractC1209dArr;
        long j13 = this.f17095x;
        Hb.d[] dVarArr2 = AbstractC1208c.f17505a;
        if (j > j13) {
            return dVarArr2;
        }
        long n6 = n();
        long j14 = this.f17096y + n6;
        int i7 = this.f17091f;
        if (i7 == 0 && this.f17097z > 0) {
            j14++;
        }
        if (this.f17502b != 0 && (abstractC1209dArr = this.f17501a) != null) {
            for (AbstractC1209d abstractC1209d : abstractC1209dArr) {
                if (abstractC1209d != null) {
                    long j15 = ((S) abstractC1209d).f17101a;
                    if (j15 >= 0 && j15 < j14) {
                        j14 = j15;
                    }
                }
            }
        }
        if (j14 <= this.f17095x) {
            return dVarArr2;
        }
        long n8 = n() + this.f17096y;
        int min = this.f17502b > 0 ? Math.min(this.f17097z, i7 - ((int) (n8 - j14))) : this.f17097z;
        long j16 = this.f17097z + n8;
        R7.a aVar = Q.f17098a;
        if (min > 0) {
            dVarArr2 = new Hb.d[min];
            Object[] objArr2 = this.f17093v;
            kotlin.jvm.internal.l.b(objArr2);
            j10 = j14;
            long j17 = n8;
            long j18 = j17;
            int i10 = 0;
            while (j18 < j16) {
                j11 = j16;
                Object obj = objArr2[((int) j18) & (objArr2.length - 1)];
                if (obj != aVar) {
                    kotlin.jvm.internal.l.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.flow.SharedFlowImpl.Emitter");
                    N n10 = (N) obj;
                    int i11 = i10 + 1;
                    dVarArr2[i10] = n10.f17082d;
                    Q.e(objArr2, j18, aVar);
                    Q.e(objArr2, j17, n10.f17081c);
                    j12 = 1;
                    n8 = j17 + 1;
                    if (i11 < min) {
                        j17 = n8;
                        i10 = i11;
                    }
                } else {
                    j12 = 1;
                }
                j18 += j12;
                j16 = j11;
            }
            j11 = j16;
            dVarArr = dVarArr2;
            n8 = j17;
            int i12 = (int) (n8 - n6);
            long j19 = this.f17502b != 0 ? n8 : j10;
            max = Math.max(this.f17094w, n8 - Math.min(this.f17090e, i12));
            if (i7 == 0 && max < j11) {
                objArr = this.f17093v;
                kotlin.jvm.internal.l.b(objArr);
                if (kotlin.jvm.internal.l.a(objArr[((int) max) & (objArr.length - 1)], aVar)) {
                    n8++;
                    max++;
                }
            }
            t(max, j19, n8, j11);
            i();
            return dVarArr.length != 0 ? dVarArr : m(dVarArr);
        }
        j10 = j14;
        j11 = j16;
        dVarArr = dVarArr2;
        int i122 = (int) (n8 - n6);
        if (this.f17502b != 0) {
        }
        max = Math.max(this.f17094w, n8 - Math.min(this.f17090e, i122));
        if (i7 == 0) {
            objArr = this.f17093v;
            kotlin.jvm.internal.l.b(objArr);
            if (kotlin.jvm.internal.l.a(objArr[((int) max) & (objArr.length - 1)], aVar)) {
            }
        }
        t(max, j19, n8, j11);
        i();
        if (dVarArr.length != 0) {
        }
    }
}
