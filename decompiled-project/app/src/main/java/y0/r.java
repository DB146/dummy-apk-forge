package y0;

import java.util.List;
import java.util.Map;
import u.C2046I;
import x0.AbstractC2256a;

/* loaded from: classes.dex */
public final class r implements InterfaceC2332Q {

    /* renamed from: a, reason: collision with root package name */
    public V0.l f26604a = V0.l.f9983b;

    /* renamed from: b, reason: collision with root package name */
    public float f26605b;

    /* renamed from: c, reason: collision with root package name */
    public float f26606c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w f26607d;

    public r(w wVar) {
        this.f26607d = wVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0079  */
    @Override // y0.InterfaceC2332Q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List K(Object obj, Rb.e eVar) {
        Object obj2;
        w wVar = this.f26607d;
        wVar.b();
        A0.L l10 = wVar.f26620a;
        A0.F f4 = l10.f61T.f96d;
        A0.F f10 = A0.F.f20a;
        if (f4 != f10 && f4 != A0.F.f22c && f4 != A0.F.f21b && f4 != A0.F.f23d) {
            AbstractC2256a.b("subcompose can only be used inside the measure or layout blocks");
        }
        C2046I c2046i = wVar.f26626u;
        Object g = c2046i.g(obj);
        if (g == null) {
            g = (A0.L) wVar.f26629x.j(obj);
            if (g != null) {
                if (wVar.f26619C <= 0) {
                    AbstractC2256a.b("Check failed.");
                }
                wVar.f26619C--;
            } else {
                g = wVar.j(obj);
                if (g == null) {
                    int i7 = wVar.f26623d;
                    A0.L l11 = new A0.L(2);
                    l10.f47E = true;
                    l10.z(i7, l11);
                    l10.f47E = false;
                    g = l11;
                }
            }
            c2046i.l(obj, g);
        }
        A0.L l12 = (A0.L) g;
        List o10 = l10.o();
        int i10 = wVar.f26623d;
        if (i10 >= 0) {
            S.b bVar = (S.b) o10;
            if (i10 < bVar.f8953a.f8961c) {
                obj2 = bVar.get(i10);
                if (obj2 != l12) {
                    int i11 = ((S.b) l10.o()).f8953a.i(l12);
                    if (i11 < wVar.f26623d) {
                        AbstractC2256a.a("Key \"" + obj + "\" was already used. If you are using LazyColumn/Row please make sure you provide a unique key for each item.");
                    }
                    int i12 = wVar.f26623d;
                    if (i12 != i11) {
                        l10.f47E = true;
                        l10.J(i11, i12, 1);
                        l10.f47E = false;
                    }
                }
                wVar.f26623d++;
                wVar.h(l12, obj, eVar);
                return (f4 != f10 || f4 == A0.F.f22c) ? l12.f61T.f105p.R() : l12.m();
            }
        }
        obj2 = null;
        if (obj2 != l12) {
        }
        wVar.f26623d++;
        wVar.h(l12, obj, eVar);
        if (f4 != f10) {
        }
    }

    @Override // V0.c
    public final float f() {
        return this.f26606c;
    }

    @Override // y0.InterfaceC2318C
    public final V0.l getLayoutDirection() {
        return this.f26604a;
    }

    @Override // V0.c
    public final float k() {
        return this.f26605b;
    }

    @Override // y0.InterfaceC2318C
    public final boolean m() {
        A0.F f4 = this.f26607d.f26620a.f61T.f96d;
        return f4 == A0.F.f23d || f4 == A0.F.f21b;
    }

    @Override // y0.InterfaceC2318C
    public final InterfaceC2317B q(int i7, int i10, Map map, Rb.c cVar) {
        if ((i7 & (-16777216)) != 0 || ((-16777216) & i10) != 0) {
            AbstractC2256a.b("Size(" + i7 + " x " + i10 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new C2349q(i7, i10, map, this, this.f26607d, cVar);
    }
}
