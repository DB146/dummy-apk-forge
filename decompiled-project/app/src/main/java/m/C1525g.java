package m;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.Log;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import n.ActionProviderVisibilityListenerC1681o;
import n.C1680n;
import n.MenuItemC1685s;
import s1.InterfaceMenuItemC1970a;

/* renamed from: m.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1525g {

    /* renamed from: A, reason: collision with root package name */
    public CharSequence f19637A;

    /* renamed from: B, reason: collision with root package name */
    public CharSequence f19638B;

    /* renamed from: E, reason: collision with root package name */
    public final /* synthetic */ C1526h f19641E;

    /* renamed from: a, reason: collision with root package name */
    public final Menu f19642a;

    /* renamed from: h, reason: collision with root package name */
    public boolean f19648h;

    /* renamed from: i, reason: collision with root package name */
    public int f19649i;
    public int j;
    public CharSequence k;

    /* renamed from: l, reason: collision with root package name */
    public CharSequence f19650l;

    /* renamed from: m, reason: collision with root package name */
    public int f19651m;

    /* renamed from: n, reason: collision with root package name */
    public char f19652n;

    /* renamed from: o, reason: collision with root package name */
    public int f19653o;

    /* renamed from: p, reason: collision with root package name */
    public char f19654p;

    /* renamed from: q, reason: collision with root package name */
    public int f19655q;

    /* renamed from: r, reason: collision with root package name */
    public int f19656r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f19657s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f19658t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f19659u;

    /* renamed from: v, reason: collision with root package name */
    public int f19660v;

    /* renamed from: w, reason: collision with root package name */
    public int f19661w;

    /* renamed from: x, reason: collision with root package name */
    public String f19662x;

    /* renamed from: y, reason: collision with root package name */
    public String f19663y;

    /* renamed from: z, reason: collision with root package name */
    public ActionProviderVisibilityListenerC1681o f19664z;

    /* renamed from: C, reason: collision with root package name */
    public ColorStateList f19639C = null;

    /* renamed from: D, reason: collision with root package name */
    public PorterDuff.Mode f19640D = null;

    /* renamed from: b, reason: collision with root package name */
    public int f19643b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f19644c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f19645d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f19646e = 0;

    /* renamed from: f, reason: collision with root package name */
    public boolean f19647f = true;
    public boolean g = true;

    public C1525g(C1526h c1526h, Menu menu) {
        this.f19641E = c1526h;
        this.f19642a = menu;
    }

    public final Object a(String str, Class[] clsArr, Object[] objArr) {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.f19641E.f19669c.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception e2) {
            Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e2);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v33, types: [android.view.MenuItem$OnMenuItemClickListener, m.f, java.lang.Object] */
    public final void b(MenuItem menuItem) {
        boolean z8 = false;
        menuItem.setChecked(this.f19657s).setVisible(this.f19658t).setEnabled(this.f19659u).setCheckable(this.f19656r >= 1).setTitleCondensed(this.f19650l).setIcon(this.f19651m);
        int i7 = this.f19660v;
        if (i7 >= 0) {
            menuItem.setShowAsAction(i7);
        }
        String str = this.f19663y;
        C1526h c1526h = this.f19641E;
        if (str != null) {
            if (c1526h.f19669c.isRestricted()) {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
            if (c1526h.f19670d == null) {
                c1526h.f19670d = C1526h.a(c1526h.f19669c);
            }
            Object obj = c1526h.f19670d;
            String str2 = this.f19663y;
            ?? obj2 = new Object();
            obj2.f19635a = obj;
            Class<?> cls = obj.getClass();
            try {
                obj2.f19636b = cls.getMethod(str2, MenuItemOnMenuItemClickListenerC1524f.f19634c);
                menuItem.setOnMenuItemClickListener(obj2);
            } catch (Exception e2) {
                StringBuilder n6 = X.c.n("Couldn't resolve menu item onClick handler ", str2, " in class ");
                n6.append(cls.getName());
                InflateException inflateException = new InflateException(n6.toString());
                inflateException.initCause(e2);
                throw inflateException;
            }
        }
        if (this.f19656r >= 2) {
            if (menuItem instanceof C1680n) {
                C1680n c1680n = (C1680n) menuItem;
                c1680n.L = (c1680n.L & (-5)) | 4;
            } else if (menuItem instanceof MenuItemC1685s) {
                MenuItemC1685s menuItemC1685s = (MenuItemC1685s) menuItem;
                try {
                    Method method = menuItemC1685s.f21006d;
                    InterfaceMenuItemC1970a interfaceMenuItemC1970a = menuItemC1685s.f21005c;
                    if (method == null) {
                        menuItemC1685s.f21006d = interfaceMenuItemC1970a.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                    }
                    menuItemC1685s.f21006d.invoke(interfaceMenuItemC1970a, Boolean.TRUE);
                } catch (Exception e10) {
                    Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e10);
                }
            }
        }
        String str3 = this.f19662x;
        if (str3 != null) {
            menuItem.setActionView((View) a(str3, C1526h.f19665e, c1526h.f19667a));
            z8 = true;
        }
        int i10 = this.f19661w;
        if (i10 > 0) {
            if (z8) {
                Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            } else {
                menuItem.setActionView(i10);
            }
        }
        ActionProviderVisibilityListenerC1681o actionProviderVisibilityListenerC1681o = this.f19664z;
        if (actionProviderVisibilityListenerC1681o != null) {
            if (menuItem instanceof InterfaceMenuItemC1970a) {
                ((InterfaceMenuItemC1970a) menuItem).b(actionProviderVisibilityListenerC1681o);
            } else {
                Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
            }
        }
        CharSequence charSequence = this.f19637A;
        boolean z10 = menuItem instanceof InterfaceMenuItemC1970a;
        if (z10) {
            ((InterfaceMenuItemC1970a) menuItem).setContentDescription(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            D0.d.h(menuItem, charSequence);
        }
        CharSequence charSequence2 = this.f19638B;
        if (z10) {
            ((InterfaceMenuItemC1970a) menuItem).setTooltipText(charSequence2);
        } else if (Build.VERSION.SDK_INT >= 26) {
            D0.d.l(menuItem, charSequence2);
        }
        char c10 = this.f19652n;
        int i11 = this.f19653o;
        if (z10) {
            ((InterfaceMenuItemC1970a) menuItem).setAlphabeticShortcut(c10, i11);
        } else if (Build.VERSION.SDK_INT >= 26) {
            D0.d.g(menuItem, c10, i11);
        }
        char c11 = this.f19654p;
        int i12 = this.f19655q;
        if (z10) {
            ((InterfaceMenuItemC1970a) menuItem).setNumericShortcut(c11, i12);
        } else if (Build.VERSION.SDK_INT >= 26) {
            D0.d.k(menuItem, c11, i12);
        }
        PorterDuff.Mode mode = this.f19640D;
        if (mode != null) {
            if (z10) {
                ((InterfaceMenuItemC1970a) menuItem).setIconTintMode(mode);
            } else if (Build.VERSION.SDK_INT >= 26) {
                D0.d.j(menuItem, mode);
            }
        }
        ColorStateList colorStateList = this.f19639C;
        if (colorStateList != null) {
            if (z10) {
                ((InterfaceMenuItemC1970a) menuItem).setIconTintList(colorStateList);
            } else if (Build.VERSION.SDK_INT >= 26) {
                D0.d.i(menuItem, colorStateList);
            }
        }
    }
}
