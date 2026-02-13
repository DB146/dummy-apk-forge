package A9;

import A0.C0016f0;
import W1.C0558a;
import android.transition.Transition;
import i2.AbstractC1297E;
import i2.C1322j;
import java.lang.ref.WeakReference;

/* renamed from: A9.t0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0138t0 extends O5.b {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f1369c;

    /* renamed from: d, reason: collision with root package name */
    public final WeakReference f1370d;

    public C0138t0(C0142u0 c0142u0, int i7) {
        this.f1369c = i7;
        switch (i7) {
            case 1:
                this.f1370d = new WeakReference(c0142u0);
                return;
            default:
                this.f1370d = new WeakReference(c0142u0);
                return;
        }
    }

    public C0138t0(c2.p pVar, int i7) {
        this.f1369c = i7;
        switch (i7) {
            case 3:
                this.f1370d = new WeakReference(pVar);
                return;
            default:
                this.f1370d = new WeakReference(pVar);
                return;
        }
    }

    @Override // O5.b
    public void A(Transition transition) {
        switch (this.f1369c) {
            case 0:
                C0142u0 c0142u0 = (C0142u0) this.f1370d.get();
                if (c0142u0 == null) {
                    return;
                }
                c0142u0.f785E0.g(c0142u0.f1389S0);
                return;
            case 1:
            default:
                return;
            case 2:
                c2.p pVar = (c2.p) this.f1370d.get();
                if (pVar == null) {
                    return;
                }
                pVar.C0.h(pVar.f14184P0);
                return;
        }
    }

    @Override // O5.b
    public final void B() {
        C0146v0 c0146v0;
        E.u uVar;
        switch (this.f1369c) {
            case 0:
                return;
            case 1:
                C0142u0 c0142u0 = (C0142u0) this.f1370d.get();
                if (c0142u0 == null || (c0146v0 = c0142u0.f1402f1) == null) {
                    return;
                }
                C0016f0 c0016f0 = (C0016f0) c0146v0.f1431d;
                if (c0016f0 != null) {
                    ((C0115n0) c0016f0.f219d).f1295e.remove((V1) c0016f0.f220e);
                    if (((C0016f0) c0146v0.f1431d).f217b == 1) {
                        return;
                    }
                }
                if (c0142u0.f1396Z0 != null) {
                    W1.U B10 = c0142u0.B();
                    B10.getClass();
                    C0558a c0558a = new C0558a(B10);
                    c0558a.i(c0142u0.f1396Z0);
                    c0558a.e(false);
                    c0142u0.f1396Z0 = null;
                    return;
                }
                return;
            case 2:
                return;
            default:
                c2.p pVar = (c2.p) this.f1370d.get();
                if (pVar == null || (uVar = pVar.f14191W0) == null) {
                    return;
                }
                C0016f0 c0016f02 = (C0016f0) uVar.f3501d;
                if (c0016f02 != null) {
                    ((C1322j) c0016f02.f219d).f18271e.remove((AbstractC1297E) c0016f02.f220e);
                    if (((C0016f0) uVar.f3501d).f217b == 1) {
                        return;
                    }
                }
                if (pVar.f14188T0 != null) {
                    W1.U B11 = pVar.B();
                    B11.getClass();
                    C0558a c0558a2 = new C0558a(B11);
                    c0558a2.i(pVar.f14188T0);
                    c0558a2.e(false);
                    pVar.f14188T0 = null;
                    return;
                }
                return;
        }
    }

    @Override // O5.b
    public void z() {
        switch (this.f1369c) {
            case 0:
                C0142u0 c0142u0 = (C0142u0) this.f1370d.get();
                if (c0142u0 == null) {
                    return;
                }
                c0142u0.f785E0.g(c0142u0.f1389S0);
                return;
            case 1:
            default:
                return;
            case 2:
                c2.p pVar = (c2.p) this.f1370d.get();
                if (pVar == null) {
                    return;
                }
                pVar.C0.h(pVar.f14184P0);
                return;
        }
    }
}
