package G;

import A0.AbstractC0017g;
import A0.InterfaceC0034x;
import A0.K;
import A0.n0;
import B0.c1;
import Db.q;
import Jb.i;
import c0.l;
import cc.F;
import y0.InterfaceC2345m;
import z.C2561j;

/* loaded from: classes.dex */
public final class e extends l implements E0.a, InterfaceC0034x {

    /* renamed from: C, reason: collision with root package name */
    public C2561j f4236C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f4237D;

    public static final i0.c p0(e eVar, n0 n0Var, K k) {
        i0.c cVar;
        if (!eVar.f14112B || !eVar.f4237D) {
            return null;
        }
        n0 s3 = AbstractC0017g.s(eVar);
        if (!n0Var.t0().f14112B) {
            n0Var = null;
        }
        if (n0Var == null || (cVar = (i0.c) k.invoke()) == null) {
            return null;
        }
        i0.c x2 = s3.x(n0Var, false);
        return cVar.e((Float.floatToRawIntBits(x2.f18175b) & 4294967295L) | (Float.floatToRawIntBits(x2.f18174a) << 32));
    }

    @Override // A0.InterfaceC0034x
    public final void T(InterfaceC2345m interfaceC2345m) {
        this.f4237D = true;
    }

    @Override // c0.l
    public final boolean e0() {
        return false;
    }

    @Override // E0.a
    public final Object h(n0 n0Var, K k, i iVar) {
        Object k7 = F.k(new d(this, n0Var, k, new c1(this, n0Var, k, 2), null), iVar);
        return k7 == Ib.a.f5345a ? k7 : q.f3365a;
    }
}
