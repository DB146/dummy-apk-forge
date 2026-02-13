package i2;

import H2.i0;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* renamed from: i2.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1336x extends H2.K {

    /* renamed from: d, reason: collision with root package name */
    public Q7.h f18310d;

    /* renamed from: e, reason: collision with root package name */
    public c2.q f18311e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f18312f = new ArrayList();
    public final C1333u g = new C1333u(this);

    @Override // H2.K
    public final int a() {
        Q7.h hVar = this.f18310d;
        if (hVar != null) {
            return ((ArrayList) hVar.f8697d).size();
        }
        return 0;
    }

    @Override // H2.K
    public final long b(int i7) {
        this.f18310d.getClass();
        return -1L;
    }

    @Override // H2.K
    public final int c(int i7) {
        Q7.h hVar = this.f18310d;
        AbstractC1300H a9 = ((AbstractC1301I) hVar.f8696c).a(((ArrayList) hVar.f8697d).get(i7));
        int indexOf = this.f18312f.indexOf(a9);
        if (indexOf >= 0) {
            return indexOf;
        }
        this.f18312f.add(a9);
        return this.f18312f.indexOf(a9);
    }

    @Override // H2.K
    public final void e(i0 i0Var, int i7) {
        C1335w c1335w = (C1335w) i0Var;
        Object obj = ((ArrayList) this.f18310d.f8697d).get(i7);
        c1335w.f18308w = obj;
        c1335w.f18306u.b(c1335w.f18307v, obj);
    }

    @Override // H2.K
    public final void f(i0 i0Var, int i7) {
        C1335w c1335w = (C1335w) i0Var;
        Object obj = ((ArrayList) this.f18310d.f8697d).get(i7);
        c1335w.f18308w = obj;
        c1335w.f18306u.b(c1335w.f18307v, obj);
    }

    @Override // H2.K
    public final i0 g(ViewGroup viewGroup, int i7) {
        AbstractC1300H abstractC1300H = (AbstractC1300H) this.f18312f.get(i7);
        C9.h c10 = abstractC1300H.c(viewGroup);
        C1335w c1335w = new C1335w(abstractC1300H, (View) c10.f3094a, c10);
        c2.q qVar = this.f18311e;
        if (qVar != null) {
            qVar.w(c1335w);
        }
        View view = (View) c1335w.f18307v.f3094a;
        View.OnFocusChangeListener onFocusChangeListener = view.getOnFocusChangeListener();
        if (onFocusChangeListener instanceof AbstractViewOnFocusChangeListenerC1334v) {
            ((AbstractViewOnFocusChangeListenerC1334v) onFocusChangeListener).getClass();
            view.setOnFocusChangeListener(null);
        }
        return c1335w;
    }

    @Override // H2.K
    public final void h(i0 i0Var) {
        k(i0Var);
    }

    @Override // H2.K
    public final void i(i0 i0Var) {
        C1335w c1335w = (C1335w) i0Var;
        c2.q qVar = this.f18311e;
        if (qVar != null) {
            qVar.v(c1335w);
        }
        c1335w.f18306u.e(c1335w.f18307v);
    }

    @Override // H2.K
    public final void j(i0 i0Var) {
        C1335w c1335w = (C1335w) i0Var;
        c1335w.f18306u.f(c1335w.f18307v);
        c2.q qVar = this.f18311e;
        if (qVar != null) {
            qVar.x(c1335w);
        }
    }

    @Override // H2.K
    public final void k(i0 i0Var) {
        C1335w c1335w = (C1335w) i0Var;
        c1335w.f18306u.d(c1335w.f18307v);
        if (this.f18311e != null) {
            c2.w.p0(c1335w, false, true);
        }
        c1335w.f18308w = null;
    }

    public void m() {
    }

    public void n(C1335w c1335w) {
    }

    public void o(C1335w c1335w) {
    }

    public void p(C1335w c1335w) {
    }

    public void q(C1335w c1335w) {
    }

    public void r(C1335w c1335w) {
    }
}
