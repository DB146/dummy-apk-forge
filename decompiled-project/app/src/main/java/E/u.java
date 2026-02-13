package E;

import A0.C0029s;
import A0.L;
import A0.N;
import B0.I0;
import Q.C0481b0;
import Q.E0;
import a0.AbstractC0688o;
import cc.E;
import cc.F;
import ea.C1108c;
import h3.H;
import i0.C1289b;
import ia.C1358d;
import java.util.ArrayList;
import l0.C1443b;
import l0.InterfaceC1445d;
import u0.C2080j;
import x.AbstractC2248s;
import x.o0;
import x.p0;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public boolean f3498a;

    /* renamed from: b, reason: collision with root package name */
    public Object f3499b;

    /* renamed from: c, reason: collision with root package name */
    public Object f3500c = new Y.k(Float.valueOf(0.0f), p0.f26141a, Float.valueOf(0.01f), 8);

    /* renamed from: d, reason: collision with root package name */
    public Object f3501d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public Object f3502e;

    /* JADX WARN: Multi-variable type inference failed */
    public u(boolean z8, Rb.a aVar) {
        this.f3498a = z8;
        this.f3499b = (kotlin.jvm.internal.m) aVar;
    }

    public void a(float f4, long j, N n6) {
        float floatValue = ((Number) ((Y.k) this.f3500c).g()).floatValue();
        if (floatValue > 0.0f) {
            long b2 = j0.n.b(j, floatValue);
            if (!this.f3498a) {
                InterfaceC1445d.X(f4, b2, n6);
                return;
            }
            C1443b c1443b = n6.f90a;
            float c10 = i0.e.c(c1443b.v());
            float b10 = i0.e.b(c1443b.v());
            Q7.h hVar = c1443b.f19142b;
            long D10 = hVar.D();
            hVar.x().i();
            try {
                ((Q7.h) ((C1358d) hVar.f8695b).f18487b).x().e(0.0f, 0.0f, c10, b10, 1);
                InterfaceC1445d.X(f4, b2, n6);
            } finally {
                hVar.x().g();
                hVar.U(D10);
            }
        }
    }

    public int b() {
        C0481b0 c0481b0 = (C0481b0) this.f3499b;
        return ((E0) AbstractC0688o.t(c0481b0.f8377b, c0481b0)).f8301c;
    }

    public int c() {
        C0481b0 c0481b0 = (C0481b0) this.f3500c;
        return ((E0) AbstractC0688o.t(c0481b0.f8377b, c0481b0)).f8301c;
    }

    /* JADX WARN: Type inference failed for: r5v4, types: [Rb.a, kotlin.jvm.internal.m] */
    public void d(A.h hVar, E e2) {
        boolean z8 = hVar instanceof A.f;
        ArrayList arrayList = (ArrayList) this.f3501d;
        if (z8) {
            arrayList.add(hVar);
        } else if (hVar instanceof A.g) {
            arrayList.remove(((A.g) hVar).f3a);
        } else if (hVar instanceof A.d) {
            arrayList.add(hVar);
        } else if (hVar instanceof A.e) {
            arrayList.remove(((A.e) hVar).f2a);
        } else if (hVar instanceof A.b) {
            arrayList.add(hVar);
        } else if (hVar instanceof A.c) {
            arrayList.remove(((A.c) hVar).f1a);
        } else if (!(hVar instanceof A.a)) {
            return;
        } else {
            arrayList.remove(((A.a) hVar).f0a);
        }
        A.h hVar2 = (A.h) Eb.o.f0(arrayList);
        if (kotlin.jvm.internal.l.a((A.h) this.f3502e, hVar2)) {
            return;
        }
        if (hVar2 != null) {
            M.f fVar = (M.f) ((kotlin.jvm.internal.m) this.f3499b).invoke();
            float f4 = z8 ? fVar.f6491c : hVar instanceof A.d ? fVar.f6490b : hVar instanceof A.b ? fVar.f6489a : 0.0f;
            o0 o0Var = M.k.f6506a;
            boolean z10 = hVar2 instanceof A.f;
            o0 o0Var2 = M.k.f6506a;
            if (!z10) {
                if (hVar2 instanceof A.d) {
                    o0Var2 = new o0(45, 0, AbstractC2248s.f26152b);
                } else if (hVar2 instanceof A.b) {
                    o0Var2 = new o0(45, 0, AbstractC2248s.f26152b);
                }
            }
            F.B(e2, null, 0, new M.p(this, f4, o0Var2, null), 3);
        } else {
            A.h hVar3 = (A.h) this.f3502e;
            o0 o0Var3 = M.k.f6506a;
            boolean z11 = hVar3 instanceof A.f;
            o0 o0Var4 = M.k.f6506a;
            if (!z11 && !(hVar3 instanceof A.d) && (hVar3 instanceof A.b)) {
                o0Var4 = new o0(150, 0, AbstractC2248s.f26152b);
            }
            F.B(e2, null, 0, new M.q(this, o0Var4, null), 3);
        }
        this.f3502e = hVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int e(C1108c c1108c, B0.D d10, boolean z8) {
        Object[] objArr;
        I0 i02;
        int i7;
        C0029s c0029s = (C0029s) this.f3502e;
        if (this.f3498a) {
            return 0;
        }
        try {
            this.f3498a = true;
            P3.p s3 = ((C1358d) this.f3501d).s(c1108c, d10);
            u.r rVar = (u.r) s3.f7842c;
            int g = rVar.g();
            for (int i10 = 0; i10 < g; i10++) {
                C2080j c2080j = (C2080j) rVar.h(i10);
                if (!c2080j.f24766d && !c2080j.f24769h) {
                }
                objArr = false;
                break;
            }
            objArr = true;
            int g2 = rVar.g();
            int i11 = 0;
            while (true) {
                i02 = (I0) this.f3500c;
                if (i11 >= g2) {
                    break;
                }
                C2080j c2080j2 = (C2080j) rVar.h(i11);
                if (objArr != false || u0.u.a(c2080j2)) {
                    ((L) this.f3499b).y(c2080j2.f24765c, (C0029s) this.f3502e, c2080j2.f24770i, true);
                    if (!c0029s.f306a.g()) {
                        i02.a(c2080j2.f24763a, c0029s, u0.u.a(c2080j2));
                        c0029s.clear();
                    }
                }
                i11++;
            }
            boolean c10 = i02.c(s3, z8);
            if (!s3.f7841b) {
                int g10 = rVar.g();
                for (int i12 = 0; i12 < g10; i12++) {
                    C2080j c2080j3 = (C2080j) rVar.h(i12);
                    if (!C1289b.b(u0.u.f(c2080j3, true), 0L) && c2080j3.b()) {
                        i7 = 1;
                        break;
                    }
                }
            }
            i7 = 0;
            int i13 = (c10 ? 1 : 0) | (i7 << 1);
            this.f3498a = false;
            return i13;
        } catch (Throwable th) {
            this.f3498a = false;
            throw th;
        }
    }

    public void f(int i7, int i10) {
        if (i7 < 0.0f) {
            B.a.a("Index should be non-negative (" + i7 + ')');
        }
        ((C0481b0) this.f3499b).e(i7);
        F.y yVar = (F.y) this.f3502e;
        if (i7 != yVar.f4024b) {
            yVar.f4024b = i7;
            int i11 = (i7 / 30) * 30;
            yVar.f4023a.setValue(H.I(Math.max(i11 - 100, 0), i11 + 130));
        }
        ((C0481b0) this.f3500c).e(i10);
    }
}
