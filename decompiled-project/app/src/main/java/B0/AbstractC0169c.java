package B0;

import android.content.Context;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import java.io.File;
import n.MenuItemC1685s;
import s1.InterfaceMenuItemC1970a;

/* renamed from: B0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0169c implements G3.t {

    /* renamed from: a, reason: collision with root package name */
    public Object f1861a;

    /* renamed from: b, reason: collision with root package name */
    public Object f1862b;

    public AbstractC0169c() {
        this.f1862b = new int[2];
    }

    public AbstractC0169c(V8.a aVar) {
        this.f1861a = aVar;
        this.f1862b = new Q7.h(aVar);
    }

    public AbstractC0169c(Context context) {
        this.f1861a = context;
    }

    public AbstractC0169c(Context context, Class cls) {
        this.f1861a = context;
        this.f1862b = cls;
    }

    public AbstractC0169c(i.v vVar) {
        this.f1862b = vVar;
    }

    public AbstractC0169c(String str, Bundle extras) {
        kotlin.jvm.internal.l.e(extras, "extras");
        this.f1861a = str;
        this.f1862b = extras;
    }

    public void c() {
        F6.j jVar = (F6.j) this.f1861a;
        if (jVar != null) {
            try {
                ((i.v) this.f1862b).f18159y.unregisterReceiver(jVar);
            } catch (IllegalArgumentException unused) {
            }
            this.f1861a = null;
        }
    }

    public abstract IntentFilter d();

    public abstract int[] e(int i7);

    public abstract int f();

    public MenuItem g(MenuItem menuItem) {
        if (!(menuItem instanceof InterfaceMenuItemC1970a)) {
            return menuItem;
        }
        InterfaceMenuItemC1970a interfaceMenuItemC1970a = (InterfaceMenuItemC1970a) menuItem;
        if (((u.T) this.f1862b) == null) {
            this.f1862b = new u.T(0);
        }
        MenuItem menuItem2 = (MenuItem) ((u.T) this.f1862b).get(interfaceMenuItemC1970a);
        if (menuItem2 != null) {
            return menuItem2;
        }
        MenuItemC1685s menuItemC1685s = new MenuItemC1685s((Context) this.f1861a, interfaceMenuItemC1970a);
        ((u.T) this.f1862b).put(interfaceMenuItemC1970a, menuItemC1685s);
        return menuItemC1685s;
    }

    public int[] h(int i7, int i10) {
        if (i7 < 0 || i10 < 0 || i7 == i10) {
            return null;
        }
        int[] iArr = (int[]) this.f1862b;
        iArr[0] = i7;
        iArr[1] = i10;
        return iArr;
    }

    public String i() {
        String str = (String) this.f1861a;
        if (str != null) {
            return str;
        }
        kotlin.jvm.internal.l.j("text");
        throw null;
    }

    public abstract void j();

    public abstract String k();

    public abstract int[] l(int i7);

    @Override // G3.t
    public G3.s m(G3.y yVar) {
        Class cls = (Class) this.f1862b;
        return new H3.d((Context) this.f1861a, yVar.a(File.class, cls), yVar.a(Uri.class, cls), cls);
    }

    public void n() {
        c();
        IntentFilter d10 = d();
        if (d10.countActions() == 0) {
            return;
        }
        if (((F6.j) this.f1861a) == null) {
            this.f1861a = new F6.j(this, 3);
        }
        ((i.v) this.f1862b).f18159y.registerReceiver((F6.j) this.f1861a, d10);
    }
}
