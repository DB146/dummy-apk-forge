package i;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import ea.C1108c;
import java.lang.ref.WeakReference;
import m.AbstractC1519a;
import m.C1526h;
import n.InterfaceC1676j;
import n.MenuC1678l;
import o.C1740j;

/* loaded from: classes.dex */
public final class F extends AbstractC1519a implements InterfaceC1676j {

    /* renamed from: c, reason: collision with root package name */
    public final Context f17996c;

    /* renamed from: d, reason: collision with root package name */
    public final MenuC1678l f17997d;

    /* renamed from: e, reason: collision with root package name */
    public C1108c f17998e;

    /* renamed from: f, reason: collision with root package name */
    public WeakReference f17999f;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ G f18000u;

    public F(G g, Context context, C1108c c1108c) {
        this.f18000u = g;
        this.f17996c = context;
        this.f17998e = c1108c;
        MenuC1678l menuC1678l = new MenuC1678l(context);
        menuC1678l.f20965z = 1;
        this.f17997d = menuC1678l;
        menuC1678l.f20958e = this;
    }

    @Override // m.AbstractC1519a
    public final void a() {
        G g = this.f18000u;
        if (g.f18009l != this) {
            return;
        }
        if (g.f18016s) {
            g.f18010m = this;
            g.f18011n = this.f17998e;
        } else {
            this.f17998e.h(this);
        }
        this.f17998e = null;
        g.W(false);
        ActionBarContextView actionBarContextView = g.f18008i;
        if (actionBarContextView.f12941y == null) {
            actionBarContextView.e();
        }
        g.f18006f.setHideOnContentScrollEnabled(g.f18021x);
        g.f18009l = null;
    }

    @Override // m.AbstractC1519a
    public final View b() {
        WeakReference weakReference = this.f17999f;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // m.AbstractC1519a
    public final MenuC1678l c() {
        return this.f17997d;
    }

    @Override // m.AbstractC1519a
    public final MenuInflater d() {
        return new C1526h(this.f17996c);
    }

    @Override // n.InterfaceC1676j
    public final boolean e(MenuC1678l menuC1678l, MenuItem menuItem) {
        C1108c c1108c = this.f17998e;
        if (c1108c != null) {
            return ((q3.i) c1108c.f16831c).z(this, menuItem);
        }
        return false;
    }

    @Override // m.AbstractC1519a
    public final CharSequence f() {
        return this.f18000u.f18008i.getSubtitle();
    }

    @Override // n.InterfaceC1676j
    public final void g(MenuC1678l menuC1678l) {
        if (this.f17998e == null) {
            return;
        }
        i();
        C1740j c1740j = this.f18000u.f18008i.f12934d;
        if (c1740j != null) {
            c1740j.l();
        }
    }

    @Override // m.AbstractC1519a
    public final CharSequence h() {
        return this.f18000u.f18008i.getTitle();
    }

    @Override // m.AbstractC1519a
    public final void i() {
        if (this.f18000u.f18009l != this) {
            return;
        }
        MenuC1678l menuC1678l = this.f17997d;
        menuC1678l.w();
        try {
            this.f17998e.i(this, menuC1678l);
        } finally {
            menuC1678l.v();
        }
    }

    @Override // m.AbstractC1519a
    public final boolean j() {
        return this.f18000u.f18008i.f12929G;
    }

    @Override // m.AbstractC1519a
    public final void k(View view) {
        this.f18000u.f18008i.setCustomView(view);
        this.f17999f = new WeakReference(view);
    }

    @Override // m.AbstractC1519a
    public final void l(int i7) {
        m(this.f18000u.f18004d.getResources().getString(i7));
    }

    @Override // m.AbstractC1519a
    public final void m(CharSequence charSequence) {
        this.f18000u.f18008i.setSubtitle(charSequence);
    }

    @Override // m.AbstractC1519a
    public final void n(int i7) {
        o(this.f18000u.f18004d.getResources().getString(i7));
    }

    @Override // m.AbstractC1519a
    public final void o(CharSequence charSequence) {
        this.f18000u.f18008i.setTitle(charSequence);
    }

    @Override // m.AbstractC1519a
    public final void p(boolean z8) {
        this.f19619b = z8;
        this.f18000u.f18008i.setTitleOptional(z8);
    }
}
