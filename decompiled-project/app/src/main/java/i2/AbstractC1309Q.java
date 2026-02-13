package i2;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: i2.Q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1309Q extends AbstractC1300H {

    /* renamed from: b, reason: collision with root package name */
    public C1307O f18226b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f18227c;

    /* renamed from: d, reason: collision with root package name */
    public final int f18228d;

    public AbstractC1309Q() {
        C1307O c1307o = new C1307O();
        this.f18226b = c1307o;
        this.f18227c = true;
        this.f18228d = 1;
        c1307o.f18224c = true;
    }

    public static C1324l j(C9.h hVar) {
        if (!(hVar instanceof AbstractC1308P)) {
            return (C1324l) hVar;
        }
        ((AbstractC1308P) hVar).getClass();
        return null;
    }

    @Override // i2.AbstractC1300H
    public final void b(C9.h hVar, Object obj) {
        k(j(hVar), obj);
    }

    @Override // i2.AbstractC1300H
    public final C9.h c(ViewGroup viewGroup) {
        g(viewGroup);
        throw null;
    }

    @Override // i2.AbstractC1300H
    public final void d(C9.h hVar) {
        q(j(hVar));
    }

    @Override // i2.AbstractC1300H
    public final void e(C9.h hVar) {
        l(j(hVar));
    }

    @Override // i2.AbstractC1300H
    public final void f(C9.h hVar) {
        m(j(hVar));
    }

    public abstract C1324l g(ViewGroup viewGroup);

    public void h(C1324l c1324l, boolean z8) {
    }

    public void i(C1324l c1324l) {
    }

    public abstract void k(C1324l c1324l, Object obj);

    public void l(C1324l c1324l) {
        c1324l.getClass();
    }

    public void m(C1324l c1324l) {
        c1324l.getClass();
        AbstractC1300H.a((View) c1324l.f3094a);
    }

    public void n(C1324l c1324l, boolean z8) {
        t(c1324l);
        s(c1324l, (View) c1324l.f3094a);
    }

    public void o(C1324l c1324l, boolean z8) {
        h(c1324l, z8);
        t(c1324l);
        s(c1324l, (View) c1324l.f3094a);
    }

    public void p(C1324l c1324l) {
        if (this.f18227c) {
            c1324l.f18279v.b(c1324l.f18278u);
        }
    }

    public abstract void q(C1324l c1324l);

    public abstract void r(C1324l c1324l, boolean z8);

    public final void s(C1324l c1324l, View view) {
        int i7 = this.f18228d;
        if (i7 == 1) {
            c1324l.f18275d = c1324l.f18277f ? 1 : 2;
        } else if (i7 == 2) {
            c1324l.f18275d = c1324l.f18276e ? 1 : 2;
        } else if (i7 == 3) {
            c1324l.f18275d = (c1324l.f18277f && c1324l.f18276e) ? 1 : 2;
        }
        int i10 = c1324l.f18275d;
        if (i10 == 1) {
            view.setActivated(true);
        } else if (i10 == 2) {
            view.setActivated(false);
        }
    }

    public final void t(C1324l c1324l) {
        if (this.f18226b != null) {
            c1324l.getClass();
        }
    }
}
