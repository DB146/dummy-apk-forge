package n;

import B0.AbstractC0169c;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import s1.InterfaceMenuItemC1970a;
import u.T;

/* renamed from: n.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class MenuC1663A extends AbstractC0169c implements Menu {

    /* renamed from: c, reason: collision with root package name */
    public final MenuC1678l f20859c;

    public MenuC1663A(Context context, MenuC1678l menuC1678l) {
        super(context);
        if (menuC1678l == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f20859c = menuC1678l;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i7) {
        return g(this.f20859c.add(i7));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i7, int i10, int i11, int i12) {
        return g(this.f20859c.add(i7, i10, i11, i12));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i7, int i10, int i11, CharSequence charSequence) {
        return g(this.f20859c.a(i7, i10, i11, charSequence));
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return g(this.f20859c.a(0, 0, 0, charSequence));
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i7, int i10, int i11, ComponentName componentName, Intent[] intentArr, Intent intent, int i12, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr != null ? new MenuItem[menuItemArr.length] : null;
        int addIntentOptions = this.f20859c.addIntentOptions(i7, i10, i11, componentName, intentArr, intent, i12, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i13 = 0; i13 < length; i13++) {
                menuItemArr[i13] = g(menuItemArr2[i13]);
            }
        }
        return addIntentOptions;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i7) {
        return this.f20859c.addSubMenu(i7);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i7, int i10, int i11, int i12) {
        return this.f20859c.addSubMenu(i7, i10, i11, i12);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i7, int i10, int i11, CharSequence charSequence) {
        return this.f20859c.addSubMenu(i7, i10, i11, charSequence);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return this.f20859c.addSubMenu(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final void clear() {
        T t5 = (T) this.f1862b;
        if (t5 != null) {
            t5.clear();
        }
        this.f20859c.clear();
    }

    @Override // android.view.Menu
    public final void close() {
        this.f20859c.close();
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i7) {
        return g(this.f20859c.findItem(i7));
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i7) {
        return g(this.f20859c.getItem(i7));
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        return this.f20859c.hasVisibleItems();
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i7, KeyEvent keyEvent) {
        return this.f20859c.isShortcutKey(i7, keyEvent);
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i7, int i10) {
        return this.f20859c.performIdentifierAction(i7, i10);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i7, KeyEvent keyEvent, int i10) {
        return this.f20859c.performShortcut(i7, keyEvent, i10);
    }

    @Override // android.view.Menu
    public final void removeGroup(int i7) {
        if (((T) this.f1862b) != null) {
            int i10 = 0;
            while (true) {
                T t5 = (T) this.f1862b;
                if (i10 >= t5.f24637c) {
                    break;
                }
                if (((InterfaceMenuItemC1970a) t5.f(i10)).getGroupId() == i7) {
                    ((T) this.f1862b).h(i10);
                    i10--;
                }
                i10++;
            }
        }
        this.f20859c.removeGroup(i7);
    }

    @Override // android.view.Menu
    public final void removeItem(int i7) {
        if (((T) this.f1862b) != null) {
            int i10 = 0;
            while (true) {
                T t5 = (T) this.f1862b;
                if (i10 >= t5.f24637c) {
                    break;
                }
                if (((InterfaceMenuItemC1970a) t5.f(i10)).getItemId() == i7) {
                    ((T) this.f1862b).h(i10);
                    break;
                }
                i10++;
            }
        }
        this.f20859c.removeItem(i7);
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i7, boolean z8, boolean z10) {
        this.f20859c.setGroupCheckable(i7, z8, z10);
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i7, boolean z8) {
        this.f20859c.setGroupEnabled(i7, z8);
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i7, boolean z8) {
        this.f20859c.setGroupVisible(i7, z8);
    }

    @Override // android.view.Menu
    public final void setQwertyMode(boolean z8) {
        this.f20859c.setQwertyMode(z8);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f20859c.size();
    }
}
