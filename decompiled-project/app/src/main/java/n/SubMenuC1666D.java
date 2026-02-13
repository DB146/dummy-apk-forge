package n;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: n.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class SubMenuC1666D extends MenuC1678l implements SubMenu {

    /* renamed from: N, reason: collision with root package name */
    public final MenuC1678l f20879N;

    /* renamed from: O, reason: collision with root package name */
    public final C1680n f20880O;

    public SubMenuC1666D(Context context, MenuC1678l menuC1678l, C1680n c1680n) {
        super(context);
        this.f20879N = menuC1678l;
        this.f20880O = c1680n;
    }

    @Override // n.MenuC1678l
    public final boolean d(C1680n c1680n) {
        return this.f20879N.d(c1680n);
    }

    @Override // n.MenuC1678l
    public final boolean e(MenuC1678l menuC1678l, MenuItem menuItem) {
        return super.e(menuC1678l, menuItem) || this.f20879N.e(menuC1678l, menuItem);
    }

    @Override // n.MenuC1678l
    public final boolean f(C1680n c1680n) {
        return this.f20879N.f(c1680n);
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.f20880O;
    }

    @Override // n.MenuC1678l
    public final String j() {
        C1680n c1680n = this.f20880O;
        int i7 = c1680n != null ? c1680n.f20985a : 0;
        if (i7 == 0) {
            return null;
        }
        return h3.o.l(i7, "android:menu:actionviewstates:");
    }

    @Override // n.MenuC1678l
    public final MenuC1678l k() {
        return this.f20879N.k();
    }

    @Override // n.MenuC1678l
    public final boolean m() {
        return this.f20879N.m();
    }

    @Override // n.MenuC1678l
    public final boolean n() {
        return this.f20879N.n();
    }

    @Override // n.MenuC1678l
    public final boolean o() {
        return this.f20879N.o();
    }

    @Override // n.MenuC1678l, android.view.Menu
    public final void setGroupDividerEnabled(boolean z8) {
        this.f20879N.setGroupDividerEnabled(z8);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i7) {
        u(0, null, i7, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        u(0, null, 0, drawable, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i7) {
        u(i7, null, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        u(0, charSequence, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        u(0, null, 0, null, view);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i7) {
        this.f20880O.setIcon(i7);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.f20880O.setIcon(drawable);
        return this;
    }

    @Override // n.MenuC1678l, android.view.Menu
    public final void setQwertyMode(boolean z8) {
        this.f20879N.setQwertyMode(z8);
    }
}
