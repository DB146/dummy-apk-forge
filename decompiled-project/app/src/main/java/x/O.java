package x;

import Q.C0479a0;
import Q.C0480b;
import Q.C0487e0;
import a0.C0694u;
import cc.C0944m;
import java.util.concurrent.CancellationException;
import mc.AbstractC1660e;
import mc.C1659d;
import u.C2042E;
import v2.C2133e;

/* loaded from: classes.dex */
public final class O extends C9.h {

    /* renamed from: F, reason: collision with root package name */
    public static final C2239i f25957F = new C2239i(0.0f);

    /* renamed from: G, reason: collision with root package name */
    public static final C2239i f25958G = new C2239i(1.0f);

    /* renamed from: A, reason: collision with root package name */
    public final C2042E f25959A;

    /* renamed from: B, reason: collision with root package name */
    public D f25960B;

    /* renamed from: C, reason: collision with root package name */
    public final E f25961C;

    /* renamed from: D, reason: collision with root package name */
    public float f25962D;

    /* renamed from: E, reason: collision with root package name */
    public final E f25963E;

    /* renamed from: b, reason: collision with root package name */
    public final C0487e0 f25964b;

    /* renamed from: c, reason: collision with root package name */
    public final C0487e0 f25965c;

    /* renamed from: d, reason: collision with root package name */
    public Object f25966d;

    /* renamed from: e, reason: collision with root package name */
    public i0 f25967e;

    /* renamed from: f, reason: collision with root package name */
    public long f25968f;

    /* renamed from: u, reason: collision with root package name */
    public final A0.J f25969u;

    /* renamed from: v, reason: collision with root package name */
    public final C0479a0 f25970v;

    /* renamed from: w, reason: collision with root package name */
    public C0944m f25971w;

    /* renamed from: x, reason: collision with root package name */
    public final C1659d f25972x;

    /* renamed from: y, reason: collision with root package name */
    public final C2229B f25973y;

    /* renamed from: z, reason: collision with root package name */
    public long f25974z;

    public O(C2133e c2133e) {
        super(11);
        this.f25964b = C0480b.o(c2133e);
        this.f25965c = C0480b.o(c2133e);
        this.f25966d = c2133e;
        this.f25969u = new A0.J(this, 22);
        this.f25970v = new C0479a0(0.0f);
        this.f25972x = AbstractC1660e.a();
        this.f25973y = new C2229B();
        this.f25974z = Long.MIN_VALUE;
        this.f25959A = new C2042E();
        this.f25961C = new E(this, 1);
        this.f25963E = new E(this, 0);
    }

    public static final void K(O o10) {
        i0 i0Var = o10.f25967e;
        if (i0Var == null) {
            return;
        }
        D d10 = o10.f25960B;
        if (d10 == null) {
            if (o10.f25968f > 0) {
                C0479a0 c0479a0 = o10.f25970v;
                if (c0479a0.e() != 1.0f && !kotlin.jvm.internal.l.a(o10.f25965c.getValue(), o10.f25964b.getValue())) {
                    D d11 = new D();
                    d11.f25908d = c0479a0.e();
                    long j = o10.f25968f;
                    d11.g = j;
                    d11.f25911h = Tb.a.G((1.0d - c0479a0.e()) * j);
                    d11.f25909e.e(0, c0479a0.e());
                    d10 = d11;
                }
            }
            d10 = null;
        }
        if (d10 != null) {
            d10.g = o10.f25968f;
            o10.f25959A.a(d10);
            i0Var.m(d10);
        }
        o10.f25960B = null;
    }

    public static final void L(O o10, D d10, long j) {
        o10.getClass();
        long j10 = d10.f25905a + j;
        d10.f25905a = j10;
        long j11 = d10.f25911h;
        if (j10 >= j11) {
            d10.f25908d = 1.0f;
            return;
        }
        s0 s0Var = d10.f25906b;
        if (s0Var == null) {
            float f4 = ((float) j10) / ((float) j11);
            d10.f25908d = (f4 * 1.0f) + ((1 - f4) * d10.f25909e.a(0));
            return;
        }
        C2239i c2239i = f25958G;
        C2239i c2239i2 = d10.f25910f;
        if (c2239i2 == null) {
            c2239i2 = f25957F;
        }
        d10.f25908d = h3.H.j(((C2239i) s0Var.n(j10, d10.f25909e, c2239i, c2239i2)).a(0), 0.0f, 1.0f);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object M(O o10, Jb.c cVar) {
        H h10;
        Ib.a aVar;
        int i7;
        o10.getClass();
        if (cVar instanceof H) {
            h10 = (H) cVar;
            int i10 = h10.f25927d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                h10.f25927d = i10 - Integer.MIN_VALUE;
                Object obj = h10.f25925b;
                aVar = Ib.a.f5345a;
                i7 = h10.f25927d;
                Db.q qVar = Db.q.f3365a;
                if (i7 != 0) {
                    com.bumptech.glide.c.c0(obj);
                    if (!o10.f25959A.g() || o10.f25960B != null) {
                        if (AbstractC2232b.i(h10.getContext()) == 0.0f) {
                            o10.Q();
                            o10.f25974z = Long.MIN_VALUE;
                        } else if (o10.f25974z == Long.MIN_VALUE) {
                            h10.f25924a = o10;
                            h10.f25927d = 1;
                            if (C0480b.m(h10.getContext()).n(o10.f25961C, h10) == aVar) {
                                return aVar;
                            }
                        }
                    }
                    return qVar;
                }
                if (i7 != 1 && i7 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o10 = h10.f25924a;
                com.bumptech.glide.c.c0(obj);
                do {
                    if (o10.f25959A.h() && o10.f25960B == null) {
                        o10.f25974z = Long.MIN_VALUE;
                        return qVar;
                    }
                    h10.f25924a = o10;
                    h10.f25927d = 2;
                } while (o10.P(h10) != aVar);
                return aVar;
            }
        }
        h10 = new H(o10, cVar);
        Object obj2 = h10.f25925b;
        aVar = Ib.a.f5345a;
        i7 = h10.f25927d;
        Db.q qVar2 = Db.q.f3365a;
        if (i7 != 0) {
        }
        do {
            if (o10.f25959A.h()) {
            }
            h10.f25924a = o10;
            h10.f25927d = 2;
        } while (o10.P(h10) != aVar);
        return aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object N(O o10, Jb.c cVar) {
        M m10;
        Ib.a aVar;
        int i7;
        Object value;
        Object r10;
        O o11;
        Object obj;
        o10.getClass();
        if (cVar instanceof M) {
            m10 = (M) cVar;
            int i10 = m10.f25951e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                m10.f25951e = i10 - Integer.MIN_VALUE;
                Object obj2 = m10.f25949c;
                aVar = Ib.a.f5345a;
                i7 = m10.f25951e;
                if (i7 != 0) {
                    com.bumptech.glide.c.c0(obj2);
                    value = o10.f25964b.getValue();
                    m10.f25947a = o10;
                    m10.f25948b = value;
                    m10.f25951e = 1;
                    if (o10.f25972x.n(m10) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i7 != 1) {
                        if (i7 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        obj = m10.f25948b;
                        o11 = m10.f25947a;
                        com.bumptech.glide.c.c0(obj2);
                        if (!kotlin.jvm.internal.l.a(obj2, obj)) {
                            return Db.q.f3365a;
                        }
                        o11.f25974z = Long.MIN_VALUE;
                        throw new CancellationException("targetState while waiting for composition");
                    }
                    Object obj3 = m10.f25948b;
                    O o12 = m10.f25947a;
                    com.bumptech.glide.c.c0(obj2);
                    value = obj3;
                    o10 = o12;
                }
                m10.f25947a = o10;
                m10.f25948b = value;
                m10.f25951e = 2;
                C0944m c0944m = new C0944m(1, com.bumptech.glide.c.F(m10));
                c0944m.s();
                o10.f25971w = c0944m;
                o10.f25972x.l(null);
                r10 = c0944m.r();
                if (r10 != aVar) {
                    return aVar;
                }
                o11 = o10;
                obj = value;
                obj2 = r10;
                if (!kotlin.jvm.internal.l.a(obj2, obj)) {
                }
            }
        }
        m10 = new M(o10, cVar);
        Object obj22 = m10.f25949c;
        aVar = Ib.a.f5345a;
        i7 = m10.f25951e;
        if (i7 != 0) {
        }
        m10.f25947a = o10;
        m10.f25948b = value;
        m10.f25951e = 2;
        C0944m c0944m2 = new C0944m(1, com.bumptech.glide.c.F(m10));
        c0944m2.s();
        o10.f25971w = c0944m2;
        o10.f25972x.l(null);
        r10 = c0944m2.r();
        if (r10 != aVar) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object O(O o10, Jb.c cVar) {
        N n6;
        int i7;
        O o11;
        Object obj;
        boolean a9;
        O o12;
        o10.getClass();
        if (cVar instanceof N) {
            n6 = (N) cVar;
            int i10 = n6.f25956e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                n6.f25956e = i10 - Integer.MIN_VALUE;
                Object obj2 = n6.f25954c;
                Ib.a aVar = Ib.a.f5345a;
                i7 = n6.f25956e;
                if (i7 != 0) {
                    com.bumptech.glide.c.c0(obj2);
                    Object value = o10.f25964b.getValue();
                    n6.f25952a = o10;
                    n6.f25953b = value;
                    n6.f25956e = 1;
                    if (o10.f25972x.n(n6) == aVar) {
                        return aVar;
                    }
                    o11 = o10;
                    obj = value;
                } else {
                    if (i7 != 1) {
                        if (i7 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        obj = n6.f25953b;
                        o12 = n6.f25952a;
                        com.bumptech.glide.c.c0(obj2);
                        if (!kotlin.jvm.internal.l.a(obj2, obj)) {
                            o12.f25974z = Long.MIN_VALUE;
                            throw new CancellationException("snapTo() was canceled because state was changed to " + obj2 + " instead of " + obj);
                        }
                        return Db.q.f3365a;
                    }
                    obj = n6.f25953b;
                    o11 = n6.f25952a;
                    com.bumptech.glide.c.c0(obj2);
                }
                a9 = kotlin.jvm.internal.l.a(obj, o11.f25966d);
                C1659d c1659d = o11.f25972x;
                if (!a9) {
                    c1659d.l(null);
                    return Db.q.f3365a;
                }
                n6.f25952a = o11;
                n6.f25953b = obj;
                n6.f25956e = 2;
                C0944m c0944m = new C0944m(1, com.bumptech.glide.c.F(n6));
                c0944m.s();
                o11.f25971w = c0944m;
                c1659d.l(null);
                obj2 = c0944m.r();
                if (obj2 == aVar) {
                    return aVar;
                }
                o12 = o11;
                if (!kotlin.jvm.internal.l.a(obj2, obj)) {
                }
                return Db.q.f3365a;
            }
        }
        n6 = new N(o10, cVar);
        Object obj22 = n6.f25954c;
        Ib.a aVar2 = Ib.a.f5345a;
        i7 = n6.f25956e;
        if (i7 != 0) {
        }
        a9 = kotlin.jvm.internal.l.a(obj, o11.f25966d);
        C1659d c1659d2 = o11.f25972x;
        if (!a9) {
        }
    }

    @Override // C9.h
    public final void D(Object obj) {
        this.f25965c.setValue(obj);
    }

    @Override // C9.h
    public final void H(i0 i0Var) {
        i0 i0Var2 = this.f25967e;
        if (!(i0Var2 == null || kotlin.jvm.internal.l.a(i0Var, i0Var2))) {
            AbstractC2230C.b("An instance of SeekableTransitionState has been used in different Transitions. Previous instance: " + this.f25967e + ", new instance: " + i0Var);
        }
        this.f25967e = i0Var;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [Db.g, java.lang.Object] */
    @Override // C9.h
    public final void I() {
        this.f25967e = null;
        ((C0694u) n0.f26126a.getValue()).b(this);
    }

    public final Object P(Jb.c cVar) {
        float i7 = AbstractC2232b.i(cVar.getContext());
        Db.q qVar = Db.q.f3365a;
        if (i7 <= 0.0f) {
            Q();
            return qVar;
        }
        this.f25962D = i7;
        Object n6 = C0480b.m(cVar.getContext()).n(this.f25963E, cVar);
        return n6 == Ib.a.f5345a ? n6 : qVar;
    }

    public final void Q() {
        i0 i0Var = this.f25967e;
        if (i0Var != null) {
            i0Var.c();
        }
        this.f25959A.c();
        if (this.f25960B != null) {
            this.f25960B = null;
            T(1.0f);
            S();
        }
    }

    public final Object R(float f4, Object obj, Jb.i iVar) {
        if (0.0f > f4 || f4 > 1.0f) {
            AbstractC2230C.a("Expecting fraction between 0 and 1. Got " + f4);
        }
        i0 i0Var = this.f25967e;
        Db.q qVar = Db.q.f3365a;
        if (i0Var == null) {
            return qVar;
        }
        Object a9 = C2229B.a(this.f25973y, new K(obj, this.f25964b.getValue(), this, i0Var, f4, null), iVar);
        return a9 == Ib.a.f5345a ? a9 : qVar;
    }

    public final void S() {
        i0 i0Var = this.f25967e;
        if (i0Var == null) {
            return;
        }
        i0Var.l(Tb.a.G(this.f25970v.e() * ((Number) i0Var.f26107l.getValue()).longValue()));
    }

    public final void T(float f4) {
        this.f25970v.f(f4);
    }

    @Override // C9.h
    public final Object l() {
        return this.f25965c.getValue();
    }

    @Override // C9.h
    public final Object n() {
        return this.f25964b.getValue();
    }
}
