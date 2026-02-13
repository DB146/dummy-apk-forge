package z;

import A0.AbstractC0017g;
import A0.AbstractC0025n;
import A0.InterfaceC0023l;
import B0.C0165a;
import android.os.Build;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import h0.C1229p;
import i0.C1289b;
import i1.C1290a;
import o4.C1798l;
import s0.AbstractC1969a;
import u0.AbstractC2090t;
import u0.C2075e;
import u0.C2080j;
import u0.EnumC2076f;
import x.C2247q;
import y.C2302j;
import y.C2305m;
import y1.C2355c;

/* loaded from: classes.dex */
public final class p0 extends AbstractC0025n implements s0.c, A0.A0, InterfaceC0023l, A0.y0 {

    /* renamed from: E, reason: collision with root package name */
    public V f28049E;

    /* renamed from: F, reason: collision with root package name */
    public C2549d f28050F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f28051G;

    /* renamed from: H, reason: collision with root package name */
    public A.i f28052H;

    /* renamed from: I, reason: collision with root package name */
    public ec.d f28053I;

    /* renamed from: J, reason: collision with root package name */
    public A.b f28054J;

    /* renamed from: K, reason: collision with root package name */
    public boolean f28055K;
    public u0.y L;

    /* renamed from: M, reason: collision with root package name */
    public C2305m f28056M;

    /* renamed from: N, reason: collision with root package name */
    public C2565l f28057N;

    /* renamed from: O, reason: collision with root package name */
    public final t0.d f28058O;

    /* renamed from: P, reason: collision with root package name */
    public final C2544a0 f28059P;

    /* renamed from: Q, reason: collision with root package name */
    public final C2565l f28060Q;

    /* renamed from: R, reason: collision with root package name */
    public final w0 f28061R;

    /* renamed from: S, reason: collision with root package name */
    public final A9.O f28062S;

    /* renamed from: T, reason: collision with root package name */
    public final C2561j f28063T;

    /* renamed from: U, reason: collision with root package name */
    public C0165a f28064U;

    /* renamed from: V, reason: collision with root package name */
    public o0 f28065V;

    /* renamed from: W, reason: collision with root package name */
    public C1798l f28066W;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [A0.m, c0.l, G.e] */
    /* JADX WARN: Type inference failed for: r1v11, types: [A0.m, c0.l, y.D] */
    /* JADX WARN: Type inference failed for: r1v4, types: [A0.m, c0.l, z.a0] */
    public p0(A.i iVar, E.A a9, C2305m c2305m, C2565l c2565l, V v10, boolean z8, boolean z10) {
        C2549d c2549d = C2549d.f27966d;
        this.f28049E = v10;
        this.f28050F = c2549d;
        this.f28051G = z8;
        this.f28052H = iVar;
        this.f28056M = c2305m;
        this.f28057N = c2565l;
        t0.d dVar = new t0.d();
        this.f28058O = dVar;
        ?? lVar = new c0.l();
        lVar.f27959C = z8;
        p0(lVar);
        this.f28059P = lVar;
        C2565l c2565l2 = new C2565l(new C2247q(new C1290a(AbstractC2556g0.f27983c)));
        this.f28060Q = c2565l2;
        C2305m c2305m2 = this.f28056M;
        C2565l c2565l3 = this.f28057N;
        w0 w0Var = new w0(a9, c2305m2, c2565l3 == null ? c2565l2 : c2565l3, v10, z10, dVar, new C2576x(this, 2));
        this.f28061R = w0Var;
        A9.O o10 = new A9.O(w0Var, z8);
        this.f28062S = o10;
        C2561j c2561j = new C2561j(v10, w0Var, z10);
        p0(c2561j);
        this.f28063T = c2561j;
        p0(new t0.g(o10, dVar));
        p0(new C1229p(2, null, 4));
        ?? lVar2 = new c0.l();
        lVar2.f4236C = c2561j;
        p0(lVar2);
        u0.w wVar = new u0.w(this, 2);
        ?? lVar3 = new c0.l();
        lVar3.f26400C = wVar;
        p0(lVar3);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object s0(p0 p0Var, Jb.c cVar) {
        C2577y c2577y;
        int i7;
        if (cVar instanceof C2577y) {
            c2577y = (C2577y) cVar;
            int i10 = c2577y.f28140d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c2577y.f28140d = i10 - Integer.MIN_VALUE;
                Object obj = c2577y.f28138b;
                Ib.a aVar = Ib.a.f5345a;
                i7 = c2577y.f28140d;
                if (i7 != 0) {
                    com.bumptech.glide.c.c0(obj);
                    A.b bVar = p0Var.f28054J;
                    if (bVar != null) {
                        A.i iVar = p0Var.f28052H;
                        if (iVar != null) {
                            A.a aVar2 = new A.a(bVar);
                            c2577y.f28137a = p0Var;
                            c2577y.f28140d = 1;
                            if (iVar.a(aVar2, c2577y) == aVar) {
                                return aVar;
                            }
                        }
                    }
                    cc.F.B(p0Var.f28058O.c(), null, 0, new C2562j0(p0Var, 0L, null), 3);
                    return Db.q.f3365a;
                }
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p0Var = c2577y.f28137a;
                com.bumptech.glide.c.c0(obj);
                p0Var.f28054J = null;
                cc.F.B(p0Var.f28058O.c(), null, 0, new C2562j0(p0Var, 0L, null), 3);
                return Db.q.f3365a;
            }
        }
        c2577y = new C2577y(p0Var, cVar);
        Object obj2 = c2577y.f28138b;
        Ib.a aVar3 = Ib.a.f5345a;
        i7 = c2577y.f28140d;
        if (i7 != 0) {
        }
        p0Var.f28054J = null;
        cc.F.B(p0Var.f28058O.c(), null, 0, new C2562j0(p0Var, 0L, null), 3);
        return Db.q.f3365a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r8v4, types: [A.b, java.lang.Object, A.h] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object t0(p0 p0Var, r rVar, Jb.c cVar) {
        C2578z c2578z;
        int i7;
        A.i iVar;
        A.i iVar2;
        p0 p0Var2;
        A.b bVar;
        A.b bVar2;
        if (cVar instanceof C2578z) {
            c2578z = (C2578z) cVar;
            int i10 = c2578z.f28150f;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c2578z.f28150f = i10 - Integer.MIN_VALUE;
                Object obj = c2578z.f28148d;
                Ib.a aVar = Ib.a.f5345a;
                i7 = c2578z.f28150f;
                if (i7 != 0) {
                    com.bumptech.glide.c.c0(obj);
                    A.b bVar3 = p0Var.f28054J;
                    if (bVar3 != null && (iVar = p0Var.f28052H) != null) {
                        A.a aVar2 = new A.a(bVar3);
                        c2578z.f28145a = p0Var;
                        c2578z.f28146b = rVar;
                        c2578z.f28150f = 1;
                        if (iVar.a(aVar2, c2578z) == aVar) {
                            return aVar;
                        }
                    }
                } else {
                    if (i7 != 1) {
                        if (i7 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        bVar = c2578z.f28147c;
                        rVar = c2578z.f28146b;
                        p0Var2 = c2578z.f28145a;
                        com.bumptech.glide.c.c0(obj);
                        bVar2 = bVar;
                        p0Var = p0Var2;
                        p0Var.f28054J = bVar2;
                        long j = rVar.f28073a;
                        return Db.q.f3365a;
                    }
                    rVar = c2578z.f28146b;
                    p0Var = c2578z.f28145a;
                    com.bumptech.glide.c.c0(obj);
                }
                ?? obj2 = new Object();
                iVar2 = p0Var.f28052H;
                bVar2 = obj2;
                if (iVar2 != 0) {
                    c2578z.f28145a = p0Var;
                    c2578z.f28146b = rVar;
                    c2578z.f28147c = obj2;
                    c2578z.f28150f = 2;
                    if (iVar2.a(obj2, c2578z) == aVar) {
                        return aVar;
                    }
                    p0Var2 = p0Var;
                    bVar = obj2;
                    bVar2 = bVar;
                    p0Var = p0Var2;
                }
                p0Var.f28054J = bVar2;
                long j10 = rVar.f28073a;
                return Db.q.f3365a;
            }
        }
        c2578z = new C2578z(p0Var, cVar);
        Object obj3 = c2578z.f28148d;
        Ib.a aVar3 = Ib.a.f5345a;
        i7 = c2578z.f28150f;
        if (i7 != 0) {
        }
        ?? obj22 = new Object();
        iVar2 = p0Var.f28052H;
        bVar2 = obj22;
        if (iVar2 != 0) {
        }
        p0Var.f28054J = bVar2;
        long j102 = rVar.f28073a;
        return Db.q.f3365a;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object u0(p0 p0Var, C2571s c2571s, Jb.c cVar) {
        C2529A c2529a;
        int i7;
        if (cVar instanceof C2529A) {
            c2529a = (C2529A) cVar;
            int i10 = c2529a.f27824e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c2529a.f27824e = i10 - Integer.MIN_VALUE;
                Object obj = c2529a.f27822c;
                Ib.a aVar = Ib.a.f5345a;
                i7 = c2529a.f27824e;
                if (i7 != 0) {
                    com.bumptech.glide.c.c0(obj);
                    A.b bVar = p0Var.f28054J;
                    if (bVar != null) {
                        A.i iVar = p0Var.f28052H;
                        if (iVar != null) {
                            A.c cVar2 = new A.c(bVar);
                            c2529a.f27820a = p0Var;
                            c2529a.f27821b = c2571s;
                            c2529a.f27824e = 1;
                            if (iVar.a(cVar2, c2529a) == aVar) {
                                return aVar;
                            }
                        }
                    }
                    cc.F.B(p0Var.f28058O.c(), null, 0, new C2562j0(p0Var, c2571s.f28076a, null), 3);
                    return Db.q.f3365a;
                }
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c2571s = c2529a.f27821b;
                p0Var = c2529a.f27820a;
                com.bumptech.glide.c.c0(obj);
                p0Var.f28054J = null;
                cc.F.B(p0Var.f28058O.c(), null, 0, new C2562j0(p0Var, c2571s.f28076a, null), 3);
                return Db.q.f3365a;
            }
        }
        c2529a = new C2529A(p0Var, cVar);
        Object obj2 = c2529a.f27822c;
        Ib.a aVar2 = Ib.a.f5345a;
        i7 = c2529a.f27824e;
        if (i7 != 0) {
        }
        p0Var.f28054J = null;
        cc.F.B(p0Var.f28058O.c(), null, 0, new C2562j0(p0Var, c2571s.f28076a, null), 3);
        return Db.q.f3365a;
    }

    @Override // s0.c
    public final boolean C(KeyEvent keyEvent) {
        long floatToRawIntBits;
        int floatToRawIntBits2;
        if (!this.f28051G) {
            return false;
        }
        if ((!AbstractC1969a.a(c2.q.a(keyEvent.getKeyCode()), AbstractC1969a.f24017l) && !AbstractC1969a.a(c2.q.a(keyEvent.getKeyCode()), AbstractC1969a.k)) || !com.bumptech.glide.d.l(h3.H.w(keyEvent), 2) || keyEvent.isCtrlPressed()) {
            return false;
        }
        boolean z8 = this.f28061R.f28124d == V.f27943a;
        C2561j c2561j = this.f28063T;
        if (z8) {
            int i7 = (int) (c2561j.f28011J & 4294967295L);
            float f4 = AbstractC1969a.a(c2.q.a(keyEvent.getKeyCode()), AbstractC1969a.k) ? i7 : -i7;
            floatToRawIntBits = Float.floatToRawIntBits(0.0f);
            floatToRawIntBits2 = Float.floatToRawIntBits(f4);
        } else {
            int i10 = (int) (c2561j.f28011J >> 32);
            floatToRawIntBits = Float.floatToRawIntBits(AbstractC1969a.a(c2.q.a(keyEvent.getKeyCode()), AbstractC1969a.k) ? i10 : -i10);
            floatToRawIntBits2 = Float.floatToRawIntBits(0.0f);
        }
        cc.F.B(d0(), null, 0, new l0(this, (floatToRawIntBits << 32) | (4294967295L & floatToRawIntBits2), null), 3);
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List, java.util.Collection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.List, java.util.Collection, java.lang.Object] */
    @Override // A0.y0
    public final void H(C2075e c2075e, EnumC2076f enumC2076f, long j) {
        long j10;
        ?? r02 = c2075e.f24754a;
        int size = r02.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size) {
                break;
            }
            if (((Boolean) this.f28050F.invoke((C2080j) r02.get(i7))).booleanValue()) {
                if (this.f28051G && this.L == null) {
                    C2302j c2302j = new C2302j(this, 2);
                    C2075e c2075e2 = AbstractC2090t.f24799a;
                    u0.y yVar = new u0.y(null, null, c2302j);
                    p0(yVar);
                    this.L = yVar;
                }
                u0.y yVar2 = this.L;
                if (yVar2 != null) {
                    yVar2.H(c2075e, enumC2076f, j);
                }
            } else {
                i7++;
            }
        }
        if (this.f28051G) {
            if (enumC2076f == EnumC2076f.f24757a && u0.u.c(c2075e.f24756c, 6)) {
                if (this.f28066W == null) {
                    this.f28066W = new C1798l(this.f28061R, new C2355c(ViewConfiguration.get(AbstractC0017g.v(this).getContext())), new Y.c(2, this, p0.class, "onWheelScrollStopped", "onWheelScrollStopped-TH1AsA0(J)V", 4, 1), AbstractC0017g.t(this).L);
                }
                C1798l c1798l = this.f28066W;
                if (c1798l != null) {
                    cc.E d02 = d0();
                    if (((cc.D0) c1798l.g) == null) {
                        c1798l.g = cc.F.B(d02, null, 0, new Q(c1798l, null), 3);
                    }
                }
            }
            C1798l c1798l2 = this.f28066W;
            if (c1798l2 != null && enumC2076f == EnumC2076f.f24758b && u0.u.c(c2075e.f24756c, 6)) {
                ?? r12 = c2075e.f24754a;
                int size2 = r12.size();
                for (int i10 = 0; i10 < size2; i10++) {
                    if (((C2080j) r12.get(i10)).b()) {
                        return;
                    }
                }
                V0.c cVar = (V0.c) c1798l2.f21859e;
                int i11 = Build.VERSION.SDK_INT;
                ViewConfiguration viewConfiguration = (ViewConfiguration) ((C2355c) c1798l2.f21857c).f26687a;
                float f4 = -(i11 > 26 ? K0.b(viewConfiguration) : cVar.p(64));
                float f10 = -(i11 > 26 ? K0.a(viewConfiguration) : cVar.p(64));
                C1289b c1289b = new C1289b(0L);
                int size3 = r12.size();
                int i12 = 0;
                while (true) {
                    j10 = c1289b.f18172a;
                    if (i12 >= size3) {
                        break;
                    }
                    c1289b = new C1289b(C1289b.e(j10, ((C2080j) r12.get(i12)).j));
                    i12++;
                }
                long floatToRawIntBits = (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j10 >> 32)) * f10) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j10 & 4294967295L)) * f4) & 4294967295L);
                w0 w0Var = (w0) c1798l2.f21856b;
                float f11 = w0Var.f(w0Var.d(floatToRawIntBits));
                if ((f11 > 0.0f ? 1 : (f11 == 0.0f ? 0 : -1)) == 0 ? false : (f11 > 0.0f ? 1 : (f11 == 0.0f ? 0 : -1)) > 0 ? w0Var.f28121a.c() : w0Var.f28121a.b() ? !(((ec.d) c1798l2.f21860f).h(new C2537I(floatToRawIntBits, ((C2080j) Eb.o.Y(r12)).f24764b, false)) instanceof ec.j) : c1798l2.f21855a) {
                    int size4 = r12.size();
                    for (int i13 = 0; i13 < size4; i13++) {
                        ((C2080j) r12.get(i13)).a();
                    }
                }
            }
        }
    }

    @Override // A0.y0
    public final void L() {
        u0.y yVar = this.L;
        if (yVar != null) {
            yVar.L();
        }
    }

    @Override // A0.InterfaceC0024m, A0.y0
    public final void a() {
        L();
        if (this.f14112B) {
            V0.c cVar = AbstractC0017g.t(this).L;
            C2565l c2565l = this.f28060Q;
            c2565l.getClass();
            c2565l.f28024a = new C2247q(new C1290a(cVar));
        }
        C1798l c1798l = this.f28066W;
        if (c1798l != null) {
            c1798l.f21859e = AbstractC0017g.t(this).L;
        }
    }

    @Override // A0.A0
    public final void c0(H0.i iVar) {
        if (this.f28051G && (this.f28064U == null || this.f28065V == null)) {
            this.f28064U = new C0165a(this, 10);
            this.f28065V = new o0(this, null);
        }
        C0165a c0165a = this.f28064U;
        if (c0165a != null) {
            Yb.h[] hVarArr = H0.s.f4563a;
            iVar.z(H0.h.f4474d, new H0.a(null, c0165a));
        }
        o0 o0Var = this.f28065V;
        if (o0Var != null) {
            Yb.h[] hVarArr2 = H0.s.f4563a;
            iVar.z(H0.h.f4475e, o0Var);
        }
    }

    @Override // s0.c
    public final boolean d(KeyEvent keyEvent) {
        return false;
    }

    @Override // c0.l
    public final boolean e0() {
        return false;
    }

    @Override // c0.l
    public final void h0() {
        if (this.f14112B) {
            V0.c cVar = AbstractC0017g.t(this).L;
            C2565l c2565l = this.f28060Q;
            c2565l.getClass();
            c2565l.f28024a = new C2247q(new C1290a(cVar));
        }
        C1798l c1798l = this.f28066W;
        if (c1798l != null) {
            c1798l.f21859e = AbstractC0017g.t(this).L;
        }
    }

    @Override // c0.l
    public final void i0() {
        this.f28055K = false;
        v0();
    }

    public final void v0() {
        A.b bVar = this.f28054J;
        if (bVar != null) {
            A.i iVar = this.f28052H;
            if (iVar != null) {
                iVar.b(new A.a(bVar));
            }
            this.f28054J = null;
        }
    }

    public final void w0(A.i iVar, E.A a9, C2305m c2305m, C2565l c2565l, V v10, boolean z8, boolean z10) {
        boolean z11;
        u0.y yVar;
        boolean z12 = true;
        boolean z13 = false;
        if (this.f28051G != z8) {
            this.f28062S.f920a = z8;
            this.f28059P.f27959C = z8;
            z11 = true;
        } else {
            z11 = false;
        }
        C2565l c2565l2 = c2565l == null ? this.f28060Q : c2565l;
        w0 w0Var = this.f28061R;
        if (!kotlin.jvm.internal.l.a(w0Var.f28121a, a9)) {
            w0Var.f28121a = a9;
            z13 = true;
        }
        w0Var.f28122b = c2305m;
        if (w0Var.f28124d != v10) {
            w0Var.f28124d = v10;
            z13 = true;
        }
        if (w0Var.f28125e != z10) {
            w0Var.f28125e = z10;
            z13 = true;
        }
        w0Var.f28123c = c2565l2;
        w0Var.f28126f = this.f28058O;
        C2561j c2561j = this.f28063T;
        c2561j.f28004C = v10;
        c2561j.f28006E = z10;
        this.f28056M = c2305m;
        this.f28057N = c2565l;
        C2549d c2549d = C2549d.f27966d;
        V v11 = w0Var.f28124d;
        V v12 = V.f27943a;
        if (v11 != v12) {
            v12 = V.f27944b;
        }
        this.f28050F = c2549d;
        if (this.f28051G != z8) {
            this.f28051G = z8;
            if (!z8) {
                v0();
                u0.y yVar2 = this.L;
                if (yVar2 != null) {
                    q0(yVar2);
                }
                this.L = null;
            }
            z13 = true;
        }
        if (!kotlin.jvm.internal.l.a(this.f28052H, iVar)) {
            v0();
            this.f28052H = iVar;
        }
        if (this.f28049E != v12) {
            this.f28049E = v12;
        } else {
            z12 = z13;
        }
        if (z12 && (yVar = this.L) != null) {
            yVar.q0();
        }
        if (z11) {
            this.f28064U = null;
            this.f28065V = null;
            AbstractC0017g.m(this);
        }
    }
}
