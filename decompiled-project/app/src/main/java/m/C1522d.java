package m;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import ea.C1108c;
import java.lang.ref.WeakReference;
import n.InterfaceC1676j;
import n.MenuC1678l;
import o.C1740j;

/* renamed from: m.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1522d extends AbstractC1519a implements InterfaceC1676j {

    /* renamed from: c, reason: collision with root package name */
    public Context f19626c;

    /* renamed from: d, reason: collision with root package name */
    public ActionBarContextView f19627d;

    /* renamed from: e, reason: collision with root package name */
    public C1108c f19628e;

    /* renamed from: f, reason: collision with root package name */
    public WeakReference f19629f;

    /* renamed from: u, reason: collision with root package name */
    public boolean f19630u;

    /* renamed from: v, reason: collision with root package name */
    public MenuC1678l f19631v;

    @Override // m.AbstractC1519a
    public final void a() {
        if (this.f19630u) {
            return;
        }
        this.f19630u = true;
        this.f19628e.h(this);
    }

    @Override // m.AbstractC1519a
    public final View b() {
        WeakReference weakReference = this.f19629f;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // m.AbstractC1519a
    public final MenuC1678l c() {
        return this.f19631v;
    }

    @Override // m.AbstractC1519a
    public final MenuInflater d() {
        return new C1526h(this.f19627d.getContext());
    }

    @Override // n.InterfaceC1676j
    public final boolean e(MenuC1678l menuC1678l, MenuItem menuItem) {
        return ((q3.i) this.f19628e.f16831c).z(this, menuItem);
    }

    @Override // m.AbstractC1519a
    public final CharSequence f() {
        return this.f19627d.getSubtitle();
    }

    @Override // n.InterfaceC1676j
    public final void g(MenuC1678l menuC1678l) {
        i();
        C1740j c1740j = this.f19627d.f12934d;
        if (c1740j != null) {
            c1740j.l();
        }
    }

    @Override // m.AbstractC1519a
    public final CharSequence h() {
        return this.f19627d.getTitle();
    }

    @Override // m.AbstractC1519a
    public final void i() {
        this.f19628e.i(this, this.f19631v);
    }

    @Override // m.AbstractC1519a
    public final boolean j() {
        return this.f19627d.f12929G;
    }

    @Override // m.AbstractC1519a
    public final void k(View view) {
        this.f19627d.setCustomView(view);
        this.f19629f = view != null ? new WeakReference(view) : null;
    }

    @Override // m.AbstractC1519a
    public final void l(int i7) {
        m(this.f19626c.getString(i7));
    }

    @Override // m.AbstractC1519a
    public final void m(CharSequence charSequence) {
        this.f19627d.setSubtitle(charSequence);
    }

    @Override // m.AbstractC1519a
    public final void n(int i7) {
        o(this.f19626c.getString(i7));
    }

    @Override // m.AbstractC1519a
    public final void o(CharSequence charSequence) {
        this.f19627d.setTitle(charSequence);
    }

    @Override // m.AbstractC1519a
    public final void p(boolean z8) {
        this.f19619b = z8;
        this.f19627d.setTitleOptional(z8);
    }
}
