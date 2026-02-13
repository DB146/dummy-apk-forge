package y0;

import A0.C0010c0;
import A0.G0;
import A0.Y;
import A0.j0;
import B0.z1;
import Q.AbstractC0495i0;
import Q.C0480b;
import Q.C0506o;
import Q.C0517u;
import Q.InterfaceC0494i;
import a0.AbstractC0682i;
import a0.AbstractC0688o;
import a0.AbstractC0692s;
import android.view.ViewGroup;
import java.util.List;
import u.C2043F;
import u.C2046I;
import u.C2047J;
import u.X;
import x0.AbstractC2256a;

/* loaded from: classes.dex */
public final class w implements InterfaceC0494i {

    /* renamed from: A, reason: collision with root package name */
    public final S.e f26617A;

    /* renamed from: B, reason: collision with root package name */
    public int f26618B;

    /* renamed from: C, reason: collision with root package name */
    public int f26619C;

    /* renamed from: a, reason: collision with root package name */
    public final A0.L f26620a;

    /* renamed from: b, reason: collision with root package name */
    public Q.r f26621b;

    /* renamed from: c, reason: collision with root package name */
    public S f26622c;

    /* renamed from: d, reason: collision with root package name */
    public int f26623d;

    /* renamed from: e, reason: collision with root package name */
    public int f26624e;

    /* renamed from: f, reason: collision with root package name */
    public final C2046I f26625f;

    /* renamed from: u, reason: collision with root package name */
    public final C2046I f26626u;

    /* renamed from: v, reason: collision with root package name */
    public final r f26627v;

    /* renamed from: w, reason: collision with root package name */
    public final C2347o f26628w;

    /* renamed from: x, reason: collision with root package name */
    public final C2046I f26629x;

    /* renamed from: y, reason: collision with root package name */
    public final X f26630y;

    /* renamed from: z, reason: collision with root package name */
    public final C2046I f26631z;

    public w(A0.L l10, S s3) {
        this.f26620a = l10;
        this.f26622c = s3;
        long[] jArr = u.Q.f24633a;
        this.f26625f = new C2046I();
        this.f26626u = new C2046I();
        this.f26627v = new r(this);
        this.f26628w = new C2347o(this);
        this.f26629x = new C2046I();
        this.f26630y = new X();
        this.f26631z = new C2046I();
        this.f26617A = new S.e(new Object[16]);
    }

    public static C0517u i(C0517u c0517u, A0.L l10, boolean z8, Q.r rVar, Y.e eVar) {
        if (c0517u == null || c0517u.f8527H) {
            ViewGroup.LayoutParams layoutParams = z1.f2030a;
            c0517u = new C0517u(rVar, new G0(l10));
        }
        if (z8) {
            C0506o c0506o = c0517u.f8526G;
            c0506o.f8472y = 100;
            c0506o.f8471x = true;
            c0517u.j(eVar);
            if (c0506o.f8439E || c0506o.f8472y != 100) {
                AbstractC0495i0.a("Cannot disable reuse from root if it was caused by other groups");
            }
            c0506o.f8472y = -1;
            c0506o.f8471x = false;
        } else {
            c0517u.j(eVar);
        }
        return c0517u;
    }

    public final void a(int i7) {
        boolean z8;
        boolean z10 = false;
        this.f26618B = 0;
        List o10 = this.f26620a.o();
        S.b bVar = (S.b) o10;
        int i10 = (bVar.f8953a.f8961c - this.f26619C) - 1;
        if (i7 <= i10) {
            this.f26630y.clear();
            if (i7 <= i10) {
                int i11 = i7;
                while (true) {
                    Object g = this.f26625f.g((A0.L) bVar.get(i11));
                    kotlin.jvm.internal.l.b(g);
                    ((C2043F) this.f26630y.f24655b).a(((C2348p) g).f26592a);
                    if (i11 == i10) {
                        break;
                    } else {
                        i11++;
                    }
                }
            }
            this.f26622c.f(this.f26630y);
            AbstractC0682i c10 = AbstractC0692s.c();
            Rb.c e2 = c10 != null ? c10.e() : null;
            AbstractC0682i d10 = AbstractC0692s.d(c10);
            z8 = false;
            while (i10 >= i7) {
                try {
                    A0.L l10 = (A0.L) ((S.b) o10).get(i10);
                    Object g2 = this.f26625f.g(l10);
                    kotlin.jvm.internal.l.b(g2);
                    C2348p c2348p = (C2348p) g2;
                    Object obj = c2348p.f26592a;
                    if (((C2043F) this.f26630y.f24655b).c(obj)) {
                        this.f26618B++;
                        if (((Boolean) c2348p.f26597f.getValue()).booleanValue()) {
                            A0.P p10 = l10.f61T;
                            C0010c0 c0010c0 = p10.f105p;
                            A0.H h10 = A0.H.f32c;
                            c0010c0.f198z = h10;
                            Y y10 = p10.f106q;
                            if (y10 != null) {
                                y10.f149x = h10;
                            }
                            c2348p.f26597f.setValue(Boolean.FALSE);
                            z8 = true;
                        }
                    } else {
                        A0.L l11 = this.f26620a;
                        l11.f47E = true;
                        this.f26625f.j(l10);
                        C0517u c0517u = c2348p.f26594c;
                        if (c0517u != null) {
                            c0517u.l();
                        }
                        this.f26620a.N(i10, 1);
                        l11.f47E = false;
                    }
                    this.f26626u.j(obj);
                    i10--;
                } catch (Throwable th) {
                    AbstractC0692s.f(c10, d10, e2);
                    throw th;
                }
            }
            AbstractC0692s.f(c10, d10, e2);
        } else {
            z8 = false;
        }
        if (z8) {
            synchronized (AbstractC0688o.f12405b) {
                C2047J c2047j = AbstractC0688o.f12411i.f12376h;
                if (c2047j != null) {
                    if (c2047j.h()) {
                        z10 = true;
                    }
                }
            }
            if (z10) {
                AbstractC0688o.a();
            }
        }
        b();
    }

    public final void b() {
        int i7 = ((S.b) this.f26620a.o()).f8953a.f8961c;
        C2046I c2046i = this.f26625f;
        if (c2046i.f24607e != i7) {
            AbstractC2256a.a("Inconsistency between the count of nodes tracked by the state (" + c2046i.f24607e + ") and the children count on the SubcomposeLayout (" + i7 + "). Are you trying to use the state of the disposed SubcomposeLayout?");
        }
        if ((i7 - this.f26618B) - this.f26619C < 0) {
            StringBuilder r10 = h3.o.r(i7, "Incorrect state. Total children ", ". Reusable children ");
            r10.append(this.f26618B);
            r10.append(". Precomposed children ");
            r10.append(this.f26619C);
            AbstractC2256a.a(r10.toString());
        }
        C2046I c2046i2 = this.f26629x;
        if (c2046i2.f24607e == this.f26619C) {
            return;
        }
        AbstractC2256a.a("Incorrect state. Precomposed children " + this.f26619C + ". Map size " + c2046i2.f24607e);
    }

    public final void c(boolean z8) {
        this.f26619C = 0;
        this.f26629x.a();
        List o10 = this.f26620a.o();
        int i7 = ((S.b) o10).f8953a.f8961c;
        if (this.f26618B != i7) {
            this.f26618B = i7;
            AbstractC0682i c10 = AbstractC0692s.c();
            Rb.c e2 = c10 != null ? c10.e() : null;
            AbstractC0682i d10 = AbstractC0692s.d(c10);
            for (int i10 = 0; i10 < i7; i10++) {
                try {
                    A0.L l10 = (A0.L) ((S.b) o10).get(i10);
                    C2348p c2348p = (C2348p) this.f26625f.g(l10);
                    if (c2348p != null && ((Boolean) c2348p.f26597f.getValue()).booleanValue()) {
                        A0.P p10 = l10.f61T;
                        C0010c0 c0010c0 = p10.f105p;
                        A0.H h10 = A0.H.f32c;
                        c0010c0.f198z = h10;
                        Y y10 = p10.f106q;
                        if (y10 != null) {
                            y10.f149x = h10;
                        }
                        if (z8) {
                            C0517u c0517u = c2348p.f26594c;
                            if (c0517u != null) {
                                c0517u.k();
                            }
                            c2348p.f26597f = C0480b.o(Boolean.FALSE);
                        } else {
                            c2348p.f26597f.setValue(Boolean.FALSE);
                        }
                        c2348p.f26592a = AbstractC2328M.f26567a;
                    }
                } catch (Throwable th) {
                    AbstractC0692s.f(c10, d10, e2);
                    throw th;
                }
            }
            AbstractC0692s.f(c10, d10, e2);
            this.f26626u.a();
        }
        b();
    }

    @Override // Q.InterfaceC0494i
    public final void d() {
        c(false);
    }

    @Override // Q.InterfaceC0494i
    public final void e() {
        C0517u c0517u;
        A0.L l10 = this.f26620a;
        l10.f47E = true;
        C2046I c2046i = this.f26625f;
        Object[] objArr = c2046i.f24605c;
        long[] jArr = c2046i.f24603a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i7 = 0;
            while (true) {
                long j = jArr[i7];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i10 = 8 - ((~(i7 - length)) >>> 31);
                    for (int i11 = 0; i11 < i10; i11++) {
                        if ((255 & j) < 128 && (c0517u = ((C2348p) objArr[(i7 << 3) + i11]).f26594c) != null) {
                            c0517u.l();
                        }
                        j >>= 8;
                    }
                    if (i10 != 8) {
                        break;
                    }
                }
                if (i7 == length) {
                    break;
                } else {
                    i7++;
                }
            }
        }
        l10.M();
        l10.f47E = false;
        c2046i.a();
        this.f26626u.a();
        this.f26619C = 0;
        this.f26618B = 0;
        this.f26629x.a();
        b();
    }

    @Override // Q.InterfaceC0494i
    public final void f() {
        c(true);
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [y0.N, java.lang.Object] */
    public final InterfaceC2329N g(Object obj, Rb.e eVar) {
        A0.L l10 = this.f26620a;
        if (!l10.F()) {
            return new Object();
        }
        b();
        if (!this.f26626u.c(obj)) {
            this.f26631z.j(obj);
            C2046I c2046i = this.f26629x;
            Object g = c2046i.g(obj);
            if (g == null) {
                g = j(obj);
                if (g != null) {
                    int i7 = ((S.b) l10.o()).f8953a.i(g);
                    int i10 = ((S.b) l10.o()).f8953a.f8961c;
                    l10.f47E = true;
                    l10.J(i7, i10, 1);
                    l10.f47E = false;
                    this.f26619C++;
                } else {
                    int i11 = ((S.b) l10.o()).f8953a.f8961c;
                    A0.L l11 = new A0.L(2);
                    l10.f47E = true;
                    l10.z(i11, l11);
                    l10.f47E = false;
                    this.f26619C++;
                    g = l11;
                }
                c2046i.l(obj, g);
            }
            h((A0.L) g, obj, eVar);
        }
        return new v(this, obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, y0.p] */
    public final void h(A0.L l10, Object obj, Rb.e eVar) {
        boolean z8;
        C2046I c2046i = this.f26625f;
        Object g = c2046i.g(l10);
        Object obj2 = g;
        if (g == null) {
            Y.e eVar2 = AbstractC2340h.f26584a;
            ?? obj3 = new Object();
            obj3.f26592a = obj;
            obj3.f26593b = eVar2;
            obj3.f26594c = null;
            obj3.f26597f = C0480b.o(Boolean.TRUE);
            c2046i.l(l10, obj3);
            obj2 = obj3;
        }
        C2348p c2348p = (C2348p) obj2;
        C0517u c0517u = c2348p.f26594c;
        if (c0517u != null) {
            synchronized (c0517u.f8531d) {
                z8 = c0517u.f8521B.f24607e > 0;
            }
        } else {
            z8 = true;
        }
        if (c2348p.f26593b != eVar || z8 || c2348p.f26595d) {
            c2348p.f26593b = eVar;
            AbstractC0682i c10 = AbstractC0692s.c();
            Rb.c e2 = c10 != null ? c10.e() : null;
            AbstractC0682i d10 = AbstractC0692s.d(c10);
            try {
                A0.L l11 = this.f26620a;
                l11.f47E = true;
                Rb.e eVar3 = c2348p.f26593b;
                C0517u c0517u2 = c2348p.f26594c;
                Q.r rVar = this.f26621b;
                if (rVar == null) {
                    AbstractC2256a.c("parent composition reference not set");
                    throw new Db.d(0);
                }
                c2348p.f26594c = i(c0517u2, l10, c2348p.f26596e, rVar, new Y.e(-1750409193, new j0(8, c2348p, eVar3), true));
                c2348p.f26596e = false;
                l11.f47E = false;
                AbstractC0692s.f(c10, d10, e2);
                c2348p.f26595d = false;
            } catch (Throwable th) {
                AbstractC0692s.f(c10, d10, e2);
                throw th;
            }
        }
    }

    public final A0.L j(Object obj) {
        C2046I c2046i;
        int i7;
        if (this.f26618B == 0) {
            return null;
        }
        A0.L l10 = this.f26620a;
        S.b bVar = (S.b) l10.o();
        int i10 = bVar.f8953a.f8961c - this.f26619C;
        int i11 = i10 - this.f26618B;
        int i12 = i10 - 1;
        int i13 = i12;
        while (true) {
            c2046i = this.f26625f;
            if (i13 < i11) {
                i7 = -1;
                break;
            }
            Object g = c2046i.g((A0.L) bVar.get(i13));
            kotlin.jvm.internal.l.b(g);
            if (((C2348p) g).f26592a.equals(obj)) {
                i7 = i13;
                break;
            }
            i13--;
        }
        if (i7 == -1) {
            while (i12 >= i11) {
                Object g2 = c2046i.g((A0.L) bVar.get(i12));
                kotlin.jvm.internal.l.b(g2);
                C2348p c2348p = (C2348p) g2;
                Object obj2 = c2348p.f26592a;
                if (obj2 == AbstractC2328M.f26567a || this.f26622c.g(obj, obj2)) {
                    c2348p.f26592a = obj;
                    i13 = i12;
                    i7 = i13;
                    break;
                }
                i12--;
            }
            i13 = i12;
        }
        if (i7 == -1) {
            return null;
        }
        if (i13 != i11) {
            l10.f47E = true;
            l10.J(i13, i11, 1);
            l10.f47E = false;
        }
        this.f26618B--;
        A0.L l11 = (A0.L) bVar.get(i11);
        Object g10 = c2046i.g(l11);
        kotlin.jvm.internal.l.b(g10);
        C2348p c2348p2 = (C2348p) g10;
        c2348p2.f26597f = C0480b.o(Boolean.TRUE);
        c2348p2.f26596e = true;
        c2348p2.f26595d = true;
        return l11;
    }
}
