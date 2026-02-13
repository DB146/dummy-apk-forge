package C;

import A0.C0020i;
import A0.C0021j;
import A0.InterfaceC0022k;
import Q.C0480b;
import Q.C0505n0;
import Q.C0506o;
import Q.InterfaceC0493h0;
import u.C2046I;
import y0.AbstractC2322G;
import y0.AbstractC2323H;
import y0.InterfaceC2316A;

/* renamed from: C.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0230o {

    /* renamed from: a, reason: collision with root package name */
    public static final C2046I f2416a = c(true);

    /* renamed from: b, reason: collision with root package name */
    public static final C2046I f2417b = c(false);

    /* renamed from: c, reason: collision with root package name */
    public static final C0229n f2418c;

    static {
        new r(c0.b.f14089a, false);
        f2418c = C0229n.f2413b;
    }

    public static final void a(c0.m mVar, C0506o c0506o, int i7) {
        c0506o.U(-211209833);
        int i10 = (c0506o.g(mVar) ? 4 : 2) | i7;
        if (c0506o.K(i10 & 1, (i10 & 3) != 2)) {
            int i11 = c0506o.f8449P;
            c0.m c10 = c0.o.c(c0506o, mVar);
            InterfaceC0493h0 m10 = c0506o.m();
            InterfaceC0022k.g.getClass();
            A0.C c11 = C0021j.f241b;
            c0506o.W();
            if (c0506o.f8448O) {
                c0506o.l(c11);
            } else {
                c0506o.g0();
            }
            C0480b.s(c0506o, C0021j.f244e, f2418c);
            C0480b.s(c0506o, C0021j.f243d, m10);
            C0480b.s(c0506o, C0021j.f242c, c10);
            C0020i c0020i = C0021j.f245f;
            if (c0506o.f8448O || !kotlin.jvm.internal.l.a(c0506o.H(), Integer.valueOf(i11))) {
                c0506o.d0(Integer.valueOf(i11));
                c0506o.c(Integer.valueOf(i11), c0020i);
            }
            c0506o.p(true);
        } else {
            c0506o.N();
        }
        C0505n0 r10 = c0506o.r();
        if (r10 != null) {
            r10.f8432d = new C0227l(mVar, i7, 0);
        }
    }

    public static final void b(AbstractC2322G abstractC2322G, AbstractC2323H abstractC2323H, y0.z zVar, V0.l lVar, int i7, int i10, c0.e eVar) {
        zVar.d();
        AbstractC2322G.f(abstractC2322G, abstractC2323H, eVar.a((abstractC2323H.f26554a << 32) | (abstractC2323H.f26555b & 4294967295L), (i7 << 32) | (i10 & 4294967295L), lVar));
    }

    public static final C2046I c(boolean z8) {
        C2046I c2046i = new C2046I(9);
        c0.e eVar = c0.b.f14089a;
        c2046i.l(eVar, new r(eVar, z8));
        c0.e eVar2 = c0.b.f14090b;
        c2046i.l(eVar2, new r(eVar2, z8));
        c0.e eVar3 = c0.b.f14091c;
        c2046i.l(eVar3, new r(eVar3, z8));
        c0.e eVar4 = c0.b.f14092d;
        c2046i.l(eVar4, new r(eVar4, z8));
        c0.e eVar5 = c0.b.f14093e;
        c2046i.l(eVar5, new r(eVar5, z8));
        c0.e eVar6 = c0.b.f14094f;
        c2046i.l(eVar6, new r(eVar6, z8));
        c0.e eVar7 = c0.b.f14095u;
        c2046i.l(eVar7, new r(eVar7, z8));
        c0.e eVar8 = c0.b.f14096v;
        c2046i.l(eVar8, new r(eVar8, z8));
        c0.e eVar9 = c0.b.f14097w;
        c2046i.l(eVar9, new r(eVar9, z8));
        return c2046i;
    }

    public static final InterfaceC2316A d(boolean z8) {
        c0.e eVar = c0.b.f14089a;
        InterfaceC2316A interfaceC2316A = (InterfaceC2316A) (z8 ? f2416a : f2417b).g(eVar);
        return interfaceC2316A == null ? new r(eVar, z8) : interfaceC2316A;
    }
}
