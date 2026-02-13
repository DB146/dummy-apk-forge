package y0;

import A0.C0010c0;
import java.util.List;
import java.util.Map;
import u.C2046I;
import x0.AbstractC2256a;

/* renamed from: y0.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2347o implements InterfaceC2332Q, InterfaceC2318C {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r f26590a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w f26591b;

    public C2347o(w wVar) {
        this.f26591b = wVar;
        this.f26590a = wVar.f26627v;
    }

    @Override // V0.c
    public final int B(float f4) {
        return this.f26590a.B(f4);
    }

    @Override // V0.c
    public final long G(long j) {
        return this.f26590a.G(j);
    }

    @Override // V0.c
    public final float J(long j) {
        return this.f26590a.J(j);
    }

    @Override // y0.InterfaceC2332Q
    public final List K(Object obj, Rb.e eVar) {
        w wVar = this.f26591b;
        A0.L l10 = (A0.L) wVar.f26626u.g(obj);
        A0.L l11 = wVar.f26620a;
        if (l10 != null && ((S.b) l11.o()).f8953a.i(l10) < wVar.f26623d) {
            return l10.f61T.f105p.R();
        }
        S.e eVar2 = wVar.f26617A;
        if (eVar2.f8961c < wVar.f26624e) {
            AbstractC2256a.a("Error: currentApproachIndex cannot be greater than the size of theapproachComposedSlotIds list.");
        }
        int i7 = eVar2.f8961c;
        int i10 = wVar.f26624e;
        if (i7 == i10) {
            eVar2.b(obj);
        } else {
            Object[] objArr = eVar2.f8959a;
            Object obj2 = objArr[i10];
            objArr[i10] = obj;
        }
        wVar.f26624e++;
        C2046I c2046i = wVar.f26629x;
        if (!c2046i.b(obj)) {
            wVar.f26631z.l(obj, wVar.g(obj, eVar));
            if (l11.f61T.f96d == A0.F.f22c) {
                l11.P(true);
            } else {
                A0.L.Q(l11, true, 6);
            }
        }
        A0.L l12 = (A0.L) c2046i.g(obj);
        if (l12 == null) {
            return Eb.v.f3891a;
        }
        List R10 = l12.f61T.f105p.R();
        S.b bVar = (S.b) R10;
        int i11 = bVar.f8953a.f8961c;
        for (int i12 = 0; i12 < i11; i12++) {
            ((C0010c0) bVar.get(i12)).f192f.f94b = true;
        }
        return R10;
    }

    @Override // V0.c
    public final long P(float f4) {
        return this.f26590a.P(f4);
    }

    @Override // y0.InterfaceC2318C
    public final InterfaceC2317B Q(int i7, int i10, Map map, Rb.c cVar) {
        return this.f26590a.q(i7, i10, map, cVar);
    }

    @Override // V0.c
    public final float W(int i7) {
        return this.f26590a.W(i7);
    }

    @Override // V0.c
    public final float a0(float f4) {
        return f4 / this.f26590a.k();
    }

    @Override // V0.c
    public final float f() {
        return this.f26590a.f26606c;
    }

    @Override // y0.InterfaceC2318C
    public final V0.l getLayoutDirection() {
        return this.f26590a.f26604a;
    }

    @Override // V0.c
    public final float k() {
        return this.f26590a.f26605b;
    }

    @Override // y0.InterfaceC2318C
    public final boolean m() {
        return this.f26590a.m();
    }

    @Override // V0.c
    public final long n(float f4) {
        return this.f26590a.n(f4);
    }

    @Override // V0.c
    public final float p(float f4) {
        return this.f26590a.k() * f4;
    }

    @Override // y0.InterfaceC2318C
    public final InterfaceC2317B q(int i7, int i10, Map map, Rb.c cVar) {
        return this.f26590a.q(i7, i10, map, cVar);
    }

    @Override // V0.c
    public final float y(long j) {
        return this.f26590a.y(j);
    }
}
