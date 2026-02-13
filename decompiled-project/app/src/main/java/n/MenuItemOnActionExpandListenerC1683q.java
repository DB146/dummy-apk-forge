package n;

import android.view.MenuItem;

/* renamed from: n.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class MenuItemOnActionExpandListenerC1683q implements MenuItem.OnActionExpandListener {

    /* renamed from: a, reason: collision with root package name */
    public final MenuItem.OnActionExpandListener f21001a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MenuItemC1685s f21002b;

    public MenuItemOnActionExpandListenerC1683q(MenuItemC1685s menuItemC1685s, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f21002b = menuItemC1685s;
        this.f21001a = onActionExpandListener;
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.f21001a.onMenuItemActionCollapse(this.f21002b.g(menuItem));
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.f21001a.onMenuItemActionExpand(this.f21002b.g(menuItem));
    }
}
