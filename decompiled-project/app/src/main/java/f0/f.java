package f0;

import A0.AbstractC0017g;
import A0.E0;
import A0.InterfaceC0034x;
import C.D;
import P4.C0463k;
import Z9.x;
import c0.l;

/* loaded from: classes.dex */
public final class f extends l implements E0, InterfaceC0034x {

    /* renamed from: C, reason: collision with root package name */
    public f f16931C;

    /* renamed from: D, reason: collision with root package name */
    public f f16932D;

    /* renamed from: E, reason: collision with root package name */
    public long f16933E;

    @Override // c0.l
    public final void i0() {
        this.f16932D = null;
        this.f16931C = null;
    }

    @Override // A0.E0
    public final Object j() {
        return d.f16928a;
    }

    @Override // A0.InterfaceC0034x
    public final void l(long j) {
        this.f16933E = j;
    }

    public final boolean p0(C0463k c0463k) {
        f fVar = this.f16931C;
        if (fVar != null) {
            return fVar.p0(c0463k);
        }
        f fVar2 = this.f16932D;
        if (fVar2 != null) {
            return fVar2.p0(c0463k);
        }
        return false;
    }

    public final void q0(C0463k c0463k) {
        f fVar = this.f16932D;
        if (fVar != null) {
            fVar.q0(c0463k);
            return;
        }
        f fVar2 = this.f16931C;
        if (fVar2 != null) {
            fVar2.q0(c0463k);
        }
    }

    public final void r0(C0463k c0463k) {
        f fVar = this.f16932D;
        if (fVar != null) {
            fVar.r0(c0463k);
        }
        f fVar2 = this.f16931C;
        if (fVar2 != null) {
            fVar2.r0(c0463k);
        }
        this.f16931C = null;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [kotlin.jvm.internal.v, java.lang.Object] */
    public final void s0(C0463k c0463k) {
        E0 e02;
        f fVar;
        f fVar2 = this.f16931C;
        if (fVar2 == null || !Y6.b.b(fVar2, x.v(c0463k))) {
            if (this.f14113a.f14112B) {
                ?? obj = new Object();
                AbstractC0017g.x(this, new D(obj, this, c0463k, 4));
                e02 = (E0) obj.f19134a;
            } else {
                e02 = null;
            }
            fVar = (f) e02;
        } else {
            fVar = fVar2;
        }
        if (fVar != null && fVar2 == null) {
            fVar.q0(c0463k);
            fVar.s0(c0463k);
            f fVar3 = this.f16932D;
            if (fVar3 != null) {
                fVar3.r0(c0463k);
            }
        } else if (fVar == null && fVar2 != null) {
            f fVar4 = this.f16932D;
            if (fVar4 != null) {
                fVar4.q0(c0463k);
                fVar4.s0(c0463k);
            }
            fVar2.r0(c0463k);
        } else if (!kotlin.jvm.internal.l.a(fVar, fVar2)) {
            if (fVar != null) {
                fVar.q0(c0463k);
                fVar.s0(c0463k);
            }
            if (fVar2 != null) {
                fVar2.r0(c0463k);
            }
        } else if (fVar != null) {
            fVar.s0(c0463k);
        } else {
            f fVar5 = this.f16932D;
            if (fVar5 != null) {
                fVar5.s0(c0463k);
            }
        }
        this.f16931C = fVar;
    }

    public final void t0(C0463k c0463k) {
        f fVar = this.f16932D;
        if (fVar != null) {
            fVar.t0(c0463k);
            return;
        }
        f fVar2 = this.f16931C;
        if (fVar2 != null) {
            fVar2.t0(c0463k);
        }
    }
}
