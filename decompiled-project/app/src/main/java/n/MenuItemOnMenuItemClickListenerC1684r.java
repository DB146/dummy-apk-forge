package n;

import android.view.MenuItem;

/* renamed from: n.r, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class MenuItemOnMenuItemClickListenerC1684r implements MenuItem.OnMenuItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final MenuItem.OnMenuItemClickListener f21003a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MenuItemC1685s f21004b;

    public MenuItemOnMenuItemClickListenerC1684r(MenuItemC1685s menuItemC1685s, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f21004b = menuItemC1685s;
        this.f21003a = onMenuItemClickListener;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        return this.f21003a.onMenuItemClick(this.f21004b.g(menuItem));
    }
}
