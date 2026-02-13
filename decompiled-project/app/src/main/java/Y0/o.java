package Y0;

import A0.AbstractC0017g;
import A0.AbstractC0025n;
import A0.t0;
import B0.D;
import android.view.View;
import android.view.ViewTreeObserver;
import h0.AbstractC1217d;
import h0.C1221h;
import h0.C1229p;
import h0.InterfaceC1220g;
import h0.InterfaceC1222i;
import h0.InterfaceC1225l;
import x0.AbstractC2256a;

/* loaded from: classes.dex */
public final class o extends c0.l implements InterfaceC1225l, ViewTreeObserver.OnGlobalFocusChangeListener {

    /* renamed from: C, reason: collision with root package name */
    public View f11134C;

    /* renamed from: D, reason: collision with root package name */
    public ViewTreeObserver f11135D;

    /* renamed from: E, reason: collision with root package name */
    public final n f11136E = new n(this, 0);

    /* renamed from: F, reason: collision with root package name */
    public final n f11137F = new n(this, 1);

    @Override // c0.l
    public final void h0() {
        ViewTreeObserver viewTreeObserver = AbstractC0017g.v(this).getViewTreeObserver();
        this.f11135D = viewTreeObserver;
        viewTreeObserver.addOnGlobalFocusChangeListener(this);
    }

    @Override // c0.l
    public final void i0() {
        ViewTreeObserver viewTreeObserver = this.f11135D;
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnGlobalFocusChangeListener(this);
        }
        this.f11135D = null;
        AbstractC0017g.v(this).getViewTreeObserver().removeOnGlobalFocusChangeListener(this);
        this.f11134C = null;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    public final void onGlobalFocusChanged(View view, View view2) {
        if (AbstractC0017g.t(this).f44B == null) {
            return;
        }
        View c10 = k.c(this);
        InterfaceC1220g focusOwner = ((D) AbstractC0017g.u(this)).getFocusOwner();
        t0 u3 = AbstractC0017g.u(this);
        boolean z8 = (view == null || view.equals(u3) || !k.a(c10, view)) ? false : true;
        boolean z10 = (view2 == null || view2.equals(u3) || !k.a(c10, view2)) ? false : true;
        if (z8 && z10) {
            this.f11134C = view2;
            return;
        }
        if (!z10) {
            if (!z8) {
                this.f11134C = null;
                return;
            }
            this.f11134C = null;
            if (p0().r0().a()) {
                ((C1221h) focusOwner).b(8, false, false);
                return;
            }
            return;
        }
        this.f11134C = view2;
        C1229p p02 = p0();
        int ordinal = p02.r0().ordinal();
        if (ordinal == 0 || ordinal == 1 || ordinal == 2) {
            return;
        }
        if (ordinal != 3) {
            throw new Db.d(1);
        }
        AbstractC1217d.w(p02);
    }

    public final C1229p p0() {
        if (!this.f14113a.f14112B) {
            AbstractC2256a.b("visitLocalDescendants called on an unattached node");
        }
        c0.l lVar = this.f14113a;
        if ((lVar.f14116d & 1024) != 0) {
            boolean z8 = false;
            for (c0.l lVar2 = lVar.f14118f; lVar2 != null; lVar2 = lVar2.f14118f) {
                if ((lVar2.f14115c & 1024) != 0) {
                    c0.l lVar3 = lVar2;
                    S.e eVar = null;
                    while (lVar3 != null) {
                        if (lVar3 instanceof C1229p) {
                            C1229p c1229p = (C1229p) lVar3;
                            if (z8) {
                                return c1229p;
                            }
                            z8 = true;
                        } else if ((lVar3.f14115c & 1024) != 0 && (lVar3 instanceof AbstractC0025n)) {
                            int i7 = 0;
                            for (c0.l lVar4 = ((AbstractC0025n) lVar3).f269D; lVar4 != null; lVar4 = lVar4.f14118f) {
                                if ((lVar4.f14115c & 1024) != 0) {
                                    i7++;
                                    if (i7 == 1) {
                                        lVar3 = lVar4;
                                    } else {
                                        if (eVar == null) {
                                            eVar = new S.e(new c0.l[16]);
                                        }
                                        if (lVar3 != null) {
                                            eVar.b(lVar3);
                                            lVar3 = null;
                                        }
                                        eVar.b(lVar4);
                                    }
                                }
                            }
                            if (i7 == 1) {
                            }
                        }
                        lVar3 = AbstractC0017g.e(eVar);
                    }
                }
            }
        }
        throw new IllegalStateException("Could not find focus target of embedded view wrapper");
    }

    @Override // h0.InterfaceC1225l
    public final void x(InterfaceC1222i interfaceC1222i) {
        interfaceC1222i.d(false);
        interfaceC1222i.c(this.f11136E);
        interfaceC1222i.a(this.f11137F);
    }
}
