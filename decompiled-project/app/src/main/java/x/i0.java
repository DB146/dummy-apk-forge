package x;

import B0.C0170c0;
import F.C0274s;
import Q.C0480b;
import Q.C0483c0;
import Q.C0487e0;
import Q.C0498k;
import Q.C0505n0;
import Q.C0506o;
import Q.F0;
import Q.I0;
import a0.AbstractC0688o;
import a0.C0691r;
import w.C2190q;

/* loaded from: classes.dex */
public final class i0 {

    /* renamed from: a, reason: collision with root package name */
    public final C9.h f26099a;

    /* renamed from: b, reason: collision with root package name */
    public final i0 f26100b;

    /* renamed from: c, reason: collision with root package name */
    public final String f26101c;

    /* renamed from: d, reason: collision with root package name */
    public final C0487e0 f26102d;

    /* renamed from: e, reason: collision with root package name */
    public final C0487e0 f26103e;

    /* renamed from: f, reason: collision with root package name */
    public final C0483c0 f26104f = new C0483c0(0);
    public final C0483c0 g = new C0483c0(Long.MIN_VALUE);

    /* renamed from: h, reason: collision with root package name */
    public final C0487e0 f26105h;

    /* renamed from: i, reason: collision with root package name */
    public final C0691r f26106i;
    public final C0691r j;
    public final C0487e0 k;

    /* renamed from: l, reason: collision with root package name */
    public final Q.C f26107l;

    public i0(C9.h hVar, i0 i0Var, String str) {
        this.f26099a = hVar;
        this.f26100b = i0Var;
        this.f26101c = str;
        this.f26102d = C0480b.o(hVar.l());
        this.f26103e = C0480b.o(new d0(hVar.l(), hVar.l()));
        Boolean bool = Boolean.FALSE;
        this.f26105h = C0480b.o(bool);
        this.f26106i = new C0691r();
        this.j = new C0691r();
        this.k = C0480b.o(bool);
        C2190q c2190q = new C2190q(this, 1);
        Q7.h hVar2 = I0.f8308a;
        this.f26107l = new Q.C(c2190q, null);
        hVar.H(this);
    }

    public final void a(Object obj, C0506o c0506o, int i7) {
        int i10;
        c0506o.U(-1493585151);
        if ((i7 & 6) == 0) {
            i10 = ((i7 & 8) == 0 ? c0506o.g(obj) : c0506o.i(obj) ? 4 : 2) | i7;
        } else {
            i10 = i7;
        }
        if ((i7 & 48) == 0) {
            i10 |= c0506o.g(this) ? 32 : 16;
        }
        if (!c0506o.K(i10 & 1, (i10 & 19) != 18)) {
            c0506o.N();
        } else if (g()) {
            c0506o.S(1824284987);
            c0506o.p(false);
        } else {
            c0506o.S(1822801203);
            p(obj);
            if (kotlin.jvm.internal.l.a(obj, this.f26099a.l())) {
                C0483c0 c0483c0 = this.g;
                if (!(((F0) AbstractC0688o.t(c0483c0.f8378b, c0483c0)).f8302c != Long.MIN_VALUE) && !((Boolean) this.f26105h.getValue()).booleanValue()) {
                    c0506o.S(1824275067);
                    c0506o.p(false);
                    c0506o.p(false);
                }
            }
            c0506o.S(1823032494);
            Object H10 = c0506o.H();
            Q.S s3 = C0498k.f8409a;
            if (H10 == s3) {
                H10 = C0480b.k(c0506o);
                c0506o.d0(H10);
            }
            cc.E e2 = (cc.E) H10;
            boolean i11 = c0506o.i(e2) | ((i10 & 112) == 32);
            Object H11 = c0506o.H();
            if (i11 || H11 == s3) {
                H11 = new C0170c0(27, e2, this);
                c0506o.d0(H11);
            }
            C0480b.d(e2, this, (Rb.c) H11, c0506o);
            c0506o.p(false);
            c0506o.p(false);
        }
        C0505n0 r10 = c0506o.r();
        if (r10 != null) {
            r10.f8432d = new C0274s(this, obj, i7, 5);
        }
    }

    public final long b() {
        C0691r c0691r = this.f26106i;
        int size = c0691r.size();
        long j = 0;
        for (int i7 = 0; i7 < size; i7++) {
            C0483c0 c0483c0 = ((e0) c0691r.get(i7)).f26077z;
            j = Math.max(j, ((F0) AbstractC0688o.t(c0483c0.f8378b, c0483c0)).f8302c);
        }
        C0691r c0691r2 = this.j;
        int size2 = c0691r2.size();
        for (int i10 = 0; i10 < size2; i10++) {
            j = Math.max(j, ((i0) c0691r2.get(i10)).b());
        }
        return j;
    }

    public final void c() {
        C0691r c0691r = this.f26106i;
        int size = c0691r.size();
        for (int i7 = 0; i7 < size; i7++) {
            e0 e0Var = (e0) c0691r.get(i7);
            e0Var.f26071f = null;
            e0Var.f26070e = null;
            e0Var.f26074w = false;
        }
        C0691r c0691r2 = this.j;
        int size2 = c0691r2.size();
        for (int i10 = 0; i10 < size2; i10++) {
            ((i0) c0691r2.get(i10)).c();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x002d, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean d() {
        C0691r c0691r = this.f26106i;
        int size = c0691r.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size) {
                C0691r c0691r2 = this.j;
                int size2 = c0691r2.size();
                for (int i10 = 0; i10 < size2; i10++) {
                    if (!((i0) c0691r2.get(i10)).d()) {
                    }
                }
                return false;
            }
            if (((e0) c0691r.get(i7)).f26070e != null) {
                break;
            }
            i7++;
        }
    }

    public final long e() {
        i0 i0Var = this.f26100b;
        if (i0Var != null) {
            return i0Var.e();
        }
        C0483c0 c0483c0 = this.f26104f;
        return ((F0) AbstractC0688o.t(c0483c0.f8378b, c0483c0)).f8302c;
    }

    public final c0 f() {
        return (c0) this.f26103e.getValue();
    }

    public final boolean g() {
        return ((Boolean) this.k.getValue()).booleanValue();
    }

    public final void h(long j, boolean z8) {
        C0483c0 c0483c0 = this.g;
        long j10 = ((F0) AbstractC0688o.t(c0483c0.f8378b, c0483c0)).f8302c;
        C9.h hVar = this.f26099a;
        if (j10 == Long.MIN_VALUE) {
            c0483c0.e(j);
            ((C0487e0) hVar.f3094a).setValue(Boolean.TRUE);
        } else if (!((Boolean) ((C0487e0) hVar.f3094a).getValue()).booleanValue()) {
            ((C0487e0) hVar.f3094a).setValue(Boolean.TRUE);
        }
        this.f26105h.setValue(Boolean.FALSE);
        C0691r c0691r = this.f26106i;
        int size = c0691r.size();
        boolean z10 = true;
        for (int i7 = 0; i7 < size; i7++) {
            e0 e0Var = (e0) c0691r.get(i7);
            boolean booleanValue = ((Boolean) e0Var.f26072u.getValue()).booleanValue();
            C0487e0 c0487e0 = e0Var.f26072u;
            if (!booleanValue) {
                long d10 = z8 ? e0Var.b().d() : j;
                e0Var.d(e0Var.b().c(d10));
                e0Var.f26076y = e0Var.b().g(d10);
                if (e0Var.b().h(d10)) {
                    c0487e0.setValue(Boolean.TRUE);
                }
            }
            if (!((Boolean) c0487e0.getValue()).booleanValue()) {
                z10 = false;
            }
        }
        C0691r c0691r2 = this.j;
        int size2 = c0691r2.size();
        for (int i10 = 0; i10 < size2; i10++) {
            i0 i0Var = (i0) c0691r2.get(i10);
            Object value = i0Var.f26102d.getValue();
            C9.h hVar2 = i0Var.f26099a;
            if (!kotlin.jvm.internal.l.a(value, hVar2.l())) {
                i0Var.h(j, z8);
            }
            if (!kotlin.jvm.internal.l.a(i0Var.f26102d.getValue(), hVar2.l())) {
                z10 = false;
            }
        }
        if (z10) {
            i();
        }
    }

    public final void i() {
        this.g.e(Long.MIN_VALUE);
        C9.h hVar = this.f26099a;
        if (hVar instanceof C2253x) {
            hVar.D(this.f26102d.getValue());
        }
        n(0L);
        ((C0487e0) hVar.f3094a).setValue(Boolean.FALSE);
        C0691r c0691r = this.j;
        int size = c0691r.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((i0) c0691r.get(i7)).i();
        }
    }

    public final void j(float f4) {
        C0691r c0691r = this.f26106i;
        int size = c0691r.size();
        for (int i7 = 0; i7 < size; i7++) {
            e0 e0Var = (e0) c0691r.get(i7);
            e0Var.getClass();
            if (f4 == -4.0f || f4 == -5.0f) {
                Z z8 = e0Var.f26071f;
                if (z8 != null) {
                    e0Var.b().a(z8.f26027c);
                    e0Var.f26070e = null;
                    e0Var.f26071f = null;
                }
                Object obj = f4 == -4.0f ? e0Var.b().f26028d : e0Var.b().f26027c;
                e0Var.b().a(obj);
                e0Var.b().i(obj);
                e0Var.d(obj);
                e0Var.f26077z.e(e0Var.b().d());
            } else {
                e0Var.f26073v.f(f4);
            }
        }
        C0691r c0691r2 = this.j;
        int size2 = c0691r2.size();
        for (int i10 = 0; i10 < size2; i10++) {
            ((i0) c0691r2.get(i10)).j(f4);
        }
    }

    public final void k(Object obj, Object obj2) {
        this.g.e(Long.MIN_VALUE);
        Boolean bool = Boolean.FALSE;
        C9.h hVar = this.f26099a;
        ((C0487e0) hVar.f3094a).setValue(bool);
        boolean g = g();
        C0487e0 c0487e0 = this.f26102d;
        if (!g || !kotlin.jvm.internal.l.a(hVar.l(), obj) || !kotlin.jvm.internal.l.a(c0487e0.getValue(), obj2)) {
            if (!kotlin.jvm.internal.l.a(hVar.l(), obj) && (hVar instanceof C2253x)) {
                hVar.D(obj);
            }
            c0487e0.setValue(obj2);
            this.k.setValue(Boolean.TRUE);
            this.f26103e.setValue(new d0(obj, obj2));
        }
        C0691r c0691r = this.j;
        int size = c0691r.size();
        for (int i7 = 0; i7 < size; i7++) {
            i0 i0Var = (i0) c0691r.get(i7);
            kotlin.jvm.internal.l.c(i0Var, "null cannot be cast to non-null type androidx.compose.animation.core.Transition<kotlin.Any>");
            if (i0Var.g()) {
                i0Var.k(i0Var.f26099a.l(), i0Var.f26102d.getValue());
            }
        }
        C0691r c0691r2 = this.f26106i;
        int size2 = c0691r2.size();
        for (int i10 = 0; i10 < size2; i10++) {
            ((e0) c0691r2.get(i10)).c(0L);
        }
    }

    public final void l(long j) {
        C0483c0 c0483c0 = this.g;
        if (((F0) AbstractC0688o.t(c0483c0.f8378b, c0483c0)).f8302c == Long.MIN_VALUE) {
            c0483c0.e(j);
        }
        n(j);
        this.f26105h.setValue(Boolean.FALSE);
        C0691r c0691r = this.f26106i;
        int size = c0691r.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((e0) c0691r.get(i7)).c(j);
        }
        C0691r c0691r2 = this.j;
        int size2 = c0691r2.size();
        for (int i10 = 0; i10 < size2; i10++) {
            i0 i0Var = (i0) c0691r2.get(i10);
            if (!kotlin.jvm.internal.l.a(i0Var.f26102d.getValue(), i0Var.f26099a.l())) {
                i0Var.l(j);
            }
        }
    }

    public final void m(D d10) {
        C0691r c0691r = this.f26106i;
        int size = c0691r.size();
        for (int i7 = 0; i7 < size; i7++) {
            e0 e0Var = (e0) c0691r.get(i7);
            if (!kotlin.jvm.internal.l.a(e0Var.b().f26027c, e0Var.b().f26028d)) {
                e0Var.f26071f = e0Var.b();
                e0Var.f26070e = d10;
            }
            C0487e0 c0487e0 = e0Var.f26075x;
            e0Var.f26069d.setValue(new Z(e0Var.f26064B, e0Var.f26066a, c0487e0.getValue(), c0487e0.getValue(), e0Var.f26076y.c()));
            e0Var.f26077z.e(e0Var.b().d());
            e0Var.f26074w = true;
        }
        C0691r c0691r2 = this.j;
        int size2 = c0691r2.size();
        for (int i10 = 0; i10 < size2; i10++) {
            ((i0) c0691r2.get(i10)).m(d10);
        }
    }

    public final void n(long j) {
        if (this.f26100b == null) {
            this.f26104f.e(j);
        }
    }

    public final void o() {
        Z z8;
        C0691r c0691r = this.f26106i;
        int size = c0691r.size();
        for (int i7 = 0; i7 < size; i7++) {
            e0 e0Var = (e0) c0691r.get(i7);
            D d10 = e0Var.f26070e;
            if (d10 != null && (z8 = e0Var.f26071f) != null) {
                long G9 = Tb.a.G(d10.g * d10.f25908d);
                Object c10 = z8.c(G9);
                if (e0Var.f26074w) {
                    e0Var.b().i(c10);
                }
                e0Var.b().a(c10);
                e0Var.f26077z.e(e0Var.b().d());
                if (e0Var.f26073v.e() == -2.0f || e0Var.f26074w) {
                    e0Var.d(c10);
                } else {
                    e0Var.c(e0Var.f26065C.e());
                }
                if (G9 >= d10.g) {
                    e0Var.f26070e = null;
                    e0Var.f26071f = null;
                } else {
                    d10.f25907c = false;
                }
            }
        }
        C0691r c0691r2 = this.j;
        int size2 = c0691r2.size();
        for (int i10 = 0; i10 < size2; i10++) {
            ((i0) c0691r2.get(i10)).o();
        }
    }

    public final void p(Object obj) {
        C0487e0 c0487e0 = this.f26102d;
        if (kotlin.jvm.internal.l.a(c0487e0.getValue(), obj)) {
            return;
        }
        this.f26103e.setValue(new d0(c0487e0.getValue(), obj));
        C9.h hVar = this.f26099a;
        if (!kotlin.jvm.internal.l.a(hVar.l(), c0487e0.getValue())) {
            hVar.D(c0487e0.getValue());
        }
        c0487e0.setValue(obj);
        C0483c0 c0483c0 = this.g;
        if (((F0) AbstractC0688o.t(c0483c0.f8378b, c0483c0)).f8302c == Long.MIN_VALUE) {
            this.f26105h.setValue(Boolean.TRUE);
        }
        C0691r c0691r = this.f26106i;
        int size = c0691r.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((e0) c0691r.get(i7)).f26073v.f(-2.0f);
        }
    }

    public final String toString() {
        C0691r c0691r = this.f26106i;
        int size = c0691r.size();
        String str = "Transition animation values: ";
        for (int i7 = 0; i7 < size; i7++) {
            str = str + ((e0) c0691r.get(i7)) + ", ";
        }
        return str;
    }
}
