package E;

import A0.C0005a;
import A0.G0;
import A0.L;
import F.C0261e;
import F.C0264h;
import F.C0267k;
import F.G;
import F.H;
import F.T;
import Q.C0480b;
import Q.C0481b0;
import Q.C0487e0;
import Q.S;
import Q.W;
import a0.AbstractC0682i;
import a0.AbstractC0692s;
import cc.E;
import cc.F;
import g3.C1191j;
import t8.C2034c;
import x.AbstractC2232b;
import x.C2238h;
import x.C2239i;
import x.p0;
import y.EnumC2292N;
import y.Q;
import z.C2567n;
import z.C2568o;

/* loaded from: classes.dex */
public final class A {

    /* renamed from: w, reason: collision with root package name */
    public static final q3.s f3368w;

    /* renamed from: a, reason: collision with root package name */
    public final C0246a f3369a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3370b;

    /* renamed from: c, reason: collision with root package name */
    public s f3371c;

    /* renamed from: d, reason: collision with root package name */
    public final u f3372d;

    /* renamed from: e, reason: collision with root package name */
    public final C0487e0 f3373e;

    /* renamed from: f, reason: collision with root package name */
    public final A.i f3374f;
    public float g;

    /* renamed from: h, reason: collision with root package name */
    public final T6.a f3375h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f3376i;
    public L j;
    public final x k;

    /* renamed from: l, reason: collision with root package name */
    public final C0261e f3377l;

    /* renamed from: m, reason: collision with root package name */
    public final androidx.compose.foundation.lazy.layout.b f3378m;

    /* renamed from: n, reason: collision with root package name */
    public final C0267k f3379n;

    /* renamed from: o, reason: collision with root package name */
    public final F.D f3380o;

    /* renamed from: p, reason: collision with root package name */
    public final C2034c f3381p;

    /* renamed from: q, reason: collision with root package name */
    public final F.A f3382q;

    /* renamed from: r, reason: collision with root package name */
    public final W f3383r;

    /* renamed from: s, reason: collision with root package name */
    public final C0487e0 f3384s;

    /* renamed from: t, reason: collision with root package name */
    public final C0487e0 f3385t;

    /* renamed from: u, reason: collision with root package name */
    public final W f3386u;

    /* renamed from: v, reason: collision with root package name */
    public final C1191j f3387v;

    static {
        int i7 = 2;
        q qVar = q.f3462d;
        Z.d dVar = new Z.d(i7, i7);
        kotlin.jvm.internal.y.b(1, qVar);
        q3.s sVar = Z.n.f12102a;
        f3368w = new q3.s(24, dVar, qVar, false);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [E.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, E.u] */
    /* JADX WARN: Type inference failed for: r12v11, types: [java.lang.Object, F.e] */
    /* JADX WARN: Type inference failed for: r1v5, types: [T6.a, java.lang.Object] */
    public A(int i7, int i10) {
        ?? obj = new Object();
        obj.f3390b = -1;
        this.f3369a = obj;
        ?? obj2 = new Object();
        obj2.f3499b = new C0481b0(i7);
        obj2.f3500c = new C0481b0(i10);
        obj2.f3502e = new F.y(i7);
        this.f3372d = obj2;
        s sVar = D.f3388a;
        S s3 = S.f8365c;
        this.f3373e = new C0487e0(sVar, s3);
        this.f3374f = new A.i();
        C0005a c0005a = new C0005a(this, 7);
        ?? obj3 = new Object();
        obj3.f9320a = c0005a;
        obj3.f9321b = new C2568o(obj3);
        obj3.f9322c = new Q();
        Boolean bool = Boolean.FALSE;
        obj3.f9323d = C0480b.o(bool);
        obj3.f9324e = C0480b.o(bool);
        obj3.f9325f = C0480b.o(bool);
        this.f3375h = obj3;
        this.f3376i = true;
        this.k = new x(this);
        this.f3377l = new Object();
        this.f3378m = new androidx.compose.foundation.lazy.layout.b();
        this.f3379n = new C0267k(0);
        this.f3380o = new F.D(new w(this, i7));
        this.f3381p = new C2034c(this, 8);
        this.f3382q = new F.A();
        Db.q qVar = Db.q.f3365a;
        this.f3383r = new C0487e0(qVar, s3);
        Boolean bool2 = Boolean.FALSE;
        this.f3384s = C0480b.o(bool2);
        this.f3385t = C0480b.o(bool2);
        this.f3386u = new C0487e0(qVar, s3);
        C1191j c1191j = new C1191j(7, false);
        c1191j.f17441b = new C2238h(p0.f26141a, Float.valueOf(0.0f), new C2239i(0.0f), Long.MIN_VALUE, Long.MIN_VALUE, false);
        this.f3387v = c1191j;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.List, java.util.Collection, java.lang.Object] */
    public final void a(s sVar, boolean z8, boolean z10) {
        if (!z8 && this.f3370b) {
            this.f3371c = sVar;
            return;
        }
        if (z8) {
            this.f3370b = true;
        }
        t tVar = sVar.f3469a;
        int i7 = tVar != null ? tVar.f3483a : 0;
        int i10 = sVar.f3470b;
        this.f3385t.setValue(Boolean.valueOf((i7 == 0 && i10 == 0) ? false : true));
        this.f3384s.setValue(Boolean.valueOf(sVar.f3471c));
        this.g -= sVar.f3472d;
        this.f3373e.setValue(sVar);
        u uVar = this.f3372d;
        if (z10) {
            uVar.getClass();
            if (i10 < 0.0f) {
                B.a.c("scrollOffset should be non-negative");
            }
            ((C0481b0) uVar.f3500c).e(i10);
        } else {
            uVar.getClass();
            uVar.f3501d = tVar != null ? tVar.f3490i : null;
            if (uVar.f3498a || sVar.f3479n > 0) {
                uVar.f3498a = true;
                if (i10 < 0.0f) {
                    B.a.c("scrollOffset should be non-negative");
                }
                uVar.f(tVar != null ? tVar.f3483a : 0, i10);
            }
            if (this.f3376i) {
                C0246a c0246a = this.f3369a;
                if (c0246a.f3390b != -1) {
                    ?? r22 = sVar.k;
                    if (!r22.isEmpty()) {
                        if (c0246a.f3390b != (c0246a.f3389a ? ((t) Eb.o.e0(r22)).f3483a + 1 : ((t) Eb.o.Y(r22)).f3483a - 1)) {
                            c0246a.f3390b = -1;
                            F.C c10 = (F.C) c0246a.f3391c;
                            if (c10 != null) {
                                c10.cancel();
                            }
                            c0246a.f3391c = null;
                        }
                    }
                }
            }
        }
        if (z8) {
            C1191j c1191j = this.f3387v;
            c1191j.getClass();
            float p10 = sVar.f3476i.p(H.f3910a);
            float f4 = sVar.f3474f;
            if (f4 <= p10) {
                return;
            }
            AbstractC0682i c11 = AbstractC0692s.c();
            Rb.c e2 = c11 != null ? c11.e() : null;
            AbstractC0682i d10 = AbstractC0692s.d(c11);
            try {
                float floatValue = ((Number) ((C2238h) c1191j.f17441b).f26093b.getValue()).floatValue();
                C2238h c2238h = (C2238h) c1191j.f17441b;
                boolean z11 = c2238h.f26097f;
                E e10 = sVar.f3475h;
                if (z11) {
                    c1191j.f17441b = AbstractC2232b.g(c2238h, floatValue - f4);
                    F.B(e10, null, 0, new F.F(c1191j, null), 3);
                } else {
                    c1191j.f17441b = new C2238h(p0.f26141a, Float.valueOf(-f4), null, 60);
                    F.B(e10, null, 0, new G(c1191j, null), 3);
                }
                AbstractC0692s.f(c11, d10, e2);
            } catch (Throwable th) {
                AbstractC0692s.f(c11, d10, e2);
                throw th;
            }
        }
    }

    public final boolean b() {
        return ((Boolean) this.f3385t.getValue()).booleanValue();
    }

    public final boolean c() {
        return ((Boolean) this.f3384s.getValue()).booleanValue();
    }

    public final s d() {
        return (s) this.f3373e.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.Collection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.List, java.lang.Object] */
    public final void e(float f4, s sVar) {
        F.C c10;
        F.C c11;
        C0264h c0264h;
        F.C c12;
        if (this.f3376i) {
            C0246a c0246a = this.f3369a;
            if (sVar.k.isEmpty()) {
                return;
            }
            boolean z8 = f4 < 0.0f;
            ?? r32 = sVar.k;
            int i7 = z8 ? ((t) Eb.o.e0(r32)).f3483a + 1 : ((t) Eb.o.Y(r32)).f3483a - 1;
            if (i7 < 0 || i7 >= sVar.f3479n) {
                return;
            }
            if (i7 != c0246a.f3390b) {
                if (c0246a.f3389a != z8 && (c12 = (F.C) c0246a.f3391c) != null) {
                    c12.cancel();
                }
                c0246a.f3389a = z8;
                c0246a.f3390b = i7;
                A a9 = (A) this.f3381p.f24513b;
                AbstractC0682i c13 = AbstractC0692s.c();
                Rb.c e2 = c13 != null ? c13.e() : null;
                AbstractC0682i d10 = AbstractC0692s.d(c13);
                try {
                    long j = ((s) a9.f3373e.getValue()).j;
                    AbstractC0692s.f(c13, d10, e2);
                    F.D d11 = a9.f3380o;
                    G0 g02 = d11.f3903c;
                    if (g02 != null) {
                        F.S s3 = new F.S(g02, i7, j, d11.f3902b);
                        ((T) g02.f29d).a(s3);
                        c0264h = s3;
                    } else {
                        c0264h = C0264h.f3974a;
                    }
                    c0246a.f3391c = c0264h;
                } catch (Throwable th) {
                    AbstractC0692s.f(c13, d10, e2);
                    throw th;
                }
            }
            if (!z8) {
                if (sVar.f3477l - ((t) Eb.o.Y(r32)).f3491l >= f4 || (c10 = (F.C) c0246a.f3391c) == null) {
                    return;
                }
                c10.b();
                return;
            }
            t tVar = (t) Eb.o.e0(r32);
            if (((tVar.f3491l + tVar.f3492m) + sVar.f3482q) - sVar.f3478m >= (-f4) || (c11 = (F.C) c0246a.f3391c) == null) {
                return;
            }
            c11.b();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0072 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(EnumC2292N enumC2292N, Rb.e eVar, Jb.c cVar) {
        y yVar;
        Object obj;
        int i7;
        A a9;
        Object k;
        if (cVar instanceof y) {
            yVar = (y) cVar;
            int i10 = yVar.f3513f;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                yVar.f3513f = i10 - Integer.MIN_VALUE;
                Object obj2 = yVar.f3511d;
                obj = Ib.a.f5345a;
                i7 = yVar.f3513f;
                if (i7 != 0) {
                    com.bumptech.glide.c.c0(obj2);
                    yVar.f3508a = this;
                    yVar.f3509b = enumC2292N;
                    yVar.f3510c = eVar;
                    yVar.f3513f = 1;
                    if (this.f3377l.d(yVar) == obj) {
                        return obj;
                    }
                    a9 = this;
                } else {
                    if (i7 != 1) {
                        if (i7 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        com.bumptech.glide.c.c0(obj2);
                        return Db.q.f3365a;
                    }
                    eVar = yVar.f3510c;
                    enumC2292N = yVar.f3509b;
                    a9 = yVar.f3508a;
                    com.bumptech.glide.c.c0(obj2);
                }
                T6.a aVar = a9.f3375h;
                yVar.f3508a = null;
                yVar.f3509b = null;
                yVar.f3510c = null;
                yVar.f3513f = 2;
                aVar.getClass();
                k = F.k(new C2567n(aVar, enumC2292N, eVar, null), yVar);
                if (k != Ib.a.f5345a) {
                    k = Db.q.f3365a;
                }
                if (k == obj) {
                    return obj;
                }
                return Db.q.f3365a;
            }
        }
        yVar = new y(this, cVar);
        Object obj22 = yVar.f3511d;
        obj = Ib.a.f5345a;
        i7 = yVar.f3513f;
        if (i7 != 0) {
        }
        T6.a aVar2 = a9.f3375h;
        yVar.f3508a = null;
        yVar.f3509b = null;
        yVar.f3510c = null;
        yVar.f3513f = 2;
        aVar2.getClass();
        k = F.k(new C2567n(aVar2, enumC2292N, eVar, null), yVar);
        if (k != Ib.a.f5345a) {
        }
        if (k == obj) {
        }
        return Db.q.f3365a;
    }
}
