package n;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import l1.AbstractC1449a;
import y1.L;

/* renamed from: n.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class MenuC1678l implements Menu {

    /* renamed from: M, reason: collision with root package name */
    public static final int[] f20942M = {1, 4, 5, 3, 2, 0};

    /* renamed from: A, reason: collision with root package name */
    public CharSequence f20943A;

    /* renamed from: B, reason: collision with root package name */
    public Drawable f20944B;

    /* renamed from: C, reason: collision with root package name */
    public View f20945C;

    /* renamed from: J, reason: collision with root package name */
    public C1680n f20952J;
    public boolean L;

    /* renamed from: a, reason: collision with root package name */
    public final Context f20954a;

    /* renamed from: b, reason: collision with root package name */
    public final Resources f20955b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f20956c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f20957d;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC1676j f20958e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f20959f;

    /* renamed from: u, reason: collision with root package name */
    public final ArrayList f20960u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f20961v;

    /* renamed from: w, reason: collision with root package name */
    public final ArrayList f20962w;

    /* renamed from: x, reason: collision with root package name */
    public final ArrayList f20963x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f20964y;

    /* renamed from: z, reason: collision with root package name */
    public int f20965z = 0;

    /* renamed from: D, reason: collision with root package name */
    public boolean f20946D = false;

    /* renamed from: E, reason: collision with root package name */
    public boolean f20947E = false;

    /* renamed from: F, reason: collision with root package name */
    public boolean f20948F = false;

    /* renamed from: G, reason: collision with root package name */
    public boolean f20949G = false;

    /* renamed from: H, reason: collision with root package name */
    public final ArrayList f20950H = new ArrayList();

    /* renamed from: I, reason: collision with root package name */
    public final CopyOnWriteArrayList f20951I = new CopyOnWriteArrayList();

    /* renamed from: K, reason: collision with root package name */
    public boolean f20953K = false;

    public MenuC1678l(Context context) {
        boolean z8;
        boolean z10 = false;
        this.f20954a = context;
        Resources resources = context.getResources();
        this.f20955b = resources;
        this.f20959f = new ArrayList();
        this.f20960u = new ArrayList();
        this.f20961v = true;
        this.f20962w = new ArrayList();
        this.f20963x = new ArrayList();
        this.f20964y = true;
        if (resources.getConfiguration().keyboard != 1) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            Method method = L.f26648a;
            if (Build.VERSION.SDK_INT >= 28) {
                z8 = C1.i.r(viewConfiguration);
            } else {
                Resources resources2 = context.getResources();
                int identifier = resources2.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
                z8 = identifier != 0 && resources2.getBoolean(identifier);
            }
            if (z8) {
                z10 = true;
            }
        }
        this.f20957d = z10;
    }

    public final C1680n a(int i7, int i10, int i11, CharSequence charSequence) {
        int i12;
        int i13 = ((-65536) & i11) >> 16;
        if (i13 < 0 || i13 >= 6) {
            throw new IllegalArgumentException("order does not contain a valid category.");
        }
        int i14 = (f20942M[i13] << 16) | (65535 & i11);
        C1680n c1680n = new C1680n(this, i7, i10, i11, i14, charSequence, this.f20965z);
        ArrayList arrayList = this.f20959f;
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                i12 = 0;
                break;
            }
            if (((C1680n) arrayList.get(size)).f20988d <= i14) {
                i12 = size + 1;
                break;
            }
            size--;
        }
        arrayList.add(i12, c1680n);
        p(true);
        return c1680n;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i7) {
        return a(0, 0, 0, this.f20955b.getString(i7));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i7, int i10, int i11, int i12) {
        return a(i7, i10, i11, this.f20955b.getString(i12));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i7, int i10, int i11, CharSequence charSequence) {
        return a(i7, i10, i11, charSequence);
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i7, int i10, int i11, ComponentName componentName, Intent[] intentArr, Intent intent, int i12, MenuItem[] menuItemArr) {
        int i13;
        PackageManager packageManager = this.f20954a.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = queryIntentActivityOptions != null ? queryIntentActivityOptions.size() : 0;
        if ((i12 & 1) == 0) {
            removeGroup(i7);
        }
        for (int i14 = 0; i14 < size; i14++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i14);
            int i15 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i15 < 0 ? intent : intentArr[i15]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            C1680n a9 = a(i7, i10, i11, resolveInfo.loadLabel(packageManager));
            a9.setIcon(resolveInfo.loadIcon(packageManager));
            a9.f20991u = intent2;
            if (menuItemArr != null && (i13 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i13] = a9;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i7) {
        return addSubMenu(0, 0, 0, this.f20955b.getString(i7));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i7, int i10, int i11, int i12) {
        return addSubMenu(i7, i10, i11, this.f20955b.getString(i12));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i7, int i10, int i11, CharSequence charSequence) {
        C1680n a9 = a(i7, i10, i11, charSequence);
        SubMenuC1666D subMenuC1666D = new SubMenuC1666D(this.f20954a, this, a9);
        a9.f20971C = subMenuC1666D;
        subMenuC1666D.setHeaderTitle(a9.f20989e);
        return subMenuC1666D;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public final void b(InterfaceC1690x interfaceC1690x, Context context) {
        this.f20951I.add(new WeakReference(interfaceC1690x));
        interfaceC1690x.g(context, this);
        this.f20964y = true;
    }

    public final void c(boolean z8) {
        if (this.f20949G) {
            return;
        }
        this.f20949G = true;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f20951I;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            InterfaceC1690x interfaceC1690x = (InterfaceC1690x) weakReference.get();
            if (interfaceC1690x == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                interfaceC1690x.a(this, z8);
            }
        }
        this.f20949G = false;
    }

    @Override // android.view.Menu
    public final void clear() {
        C1680n c1680n = this.f20952J;
        if (c1680n != null) {
            d(c1680n);
        }
        this.f20959f.clear();
        p(true);
    }

    public final void clearHeader() {
        this.f20944B = null;
        this.f20943A = null;
        this.f20945C = null;
        p(false);
    }

    @Override // android.view.Menu
    public final void close() {
        c(true);
    }

    public boolean d(C1680n c1680n) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f20951I;
        boolean z8 = false;
        if (!copyOnWriteArrayList.isEmpty() && this.f20952J == c1680n) {
            w();
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                InterfaceC1690x interfaceC1690x = (InterfaceC1690x) weakReference.get();
                if (interfaceC1690x == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    z8 = interfaceC1690x.k(c1680n);
                    if (z8) {
                        break;
                    }
                }
            }
            v();
            if (z8) {
                this.f20952J = null;
            }
        }
        return z8;
    }

    public boolean e(MenuC1678l menuC1678l, MenuItem menuItem) {
        InterfaceC1676j interfaceC1676j = this.f20958e;
        return interfaceC1676j != null && interfaceC1676j.e(menuC1678l, menuItem);
    }

    public boolean f(C1680n c1680n) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f20951I;
        boolean z8 = false;
        if (copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        w();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            InterfaceC1690x interfaceC1690x = (InterfaceC1690x) weakReference.get();
            if (interfaceC1690x == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                z8 = interfaceC1690x.f(c1680n);
                if (z8) {
                    break;
                }
            }
        }
        v();
        if (z8) {
            this.f20952J = c1680n;
        }
        return z8;
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i7) {
        MenuItem findItem;
        ArrayList arrayList = this.f20959f;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            C1680n c1680n = (C1680n) arrayList.get(i10);
            if (c1680n.f20985a == i7) {
                return c1680n;
            }
            if (c1680n.hasSubMenu() && (findItem = c1680n.f20971C.findItem(i7)) != null) {
                return findItem;
            }
        }
        return null;
    }

    public final C1680n g(int i7, KeyEvent keyEvent) {
        ArrayList arrayList = this.f20950H;
        arrayList.clear();
        h(arrayList, i7, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (C1680n) arrayList.get(0);
        }
        boolean n6 = n();
        for (int i10 = 0; i10 < size; i10++) {
            C1680n c1680n = (C1680n) arrayList.get(i10);
            char c10 = n6 ? c1680n.f20994x : c1680n.f20992v;
            char[] cArr = keyData.meta;
            if ((c10 == cArr[0] && (metaState & 2) == 0) || ((c10 == cArr[2] && (metaState & 2) != 0) || (n6 && c10 == '\b' && i7 == 67))) {
                return c1680n;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i7) {
        return (MenuItem) this.f20959f.get(i7);
    }

    public final void h(ArrayList arrayList, int i7, KeyEvent keyEvent) {
        int i10;
        boolean n6 = n();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i7 == 67) {
            ArrayList arrayList2 = this.f20959f;
            int size = arrayList2.size();
            for (0; i10 < size; i10 + 1) {
                C1680n c1680n = (C1680n) arrayList2.get(i10);
                if (c1680n.hasSubMenu()) {
                    c1680n.f20971C.h(arrayList, i7, keyEvent);
                }
                char c10 = n6 ? c1680n.f20994x : c1680n.f20992v;
                if ((modifiers & 69647) == ((n6 ? c1680n.f20995y : c1680n.f20993w) & 69647) && c10 != 0) {
                    char[] cArr = keyData.meta;
                    if (c10 != cArr[0] && c10 != cArr[2]) {
                        if (n6 && c10 == '\b') {
                            i10 = i7 != 67 ? i10 + 1 : 0;
                        }
                    }
                    if (c1680n.isEnabled()) {
                        arrayList.add(c1680n);
                    }
                }
            }
        }
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        if (this.L) {
            return true;
        }
        ArrayList arrayList = this.f20959f;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            if (((C1680n) arrayList.get(i7)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public final void i() {
        ArrayList l10 = l();
        if (this.f20964y) {
            CopyOnWriteArrayList copyOnWriteArrayList = this.f20951I;
            Iterator it = copyOnWriteArrayList.iterator();
            boolean z8 = false;
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                InterfaceC1690x interfaceC1690x = (InterfaceC1690x) weakReference.get();
                if (interfaceC1690x == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    z8 |= interfaceC1690x.i();
                }
            }
            ArrayList arrayList = this.f20962w;
            ArrayList arrayList2 = this.f20963x;
            if (z8) {
                arrayList.clear();
                arrayList2.clear();
                int size = l10.size();
                for (int i7 = 0; i7 < size; i7++) {
                    C1680n c1680n = (C1680n) l10.get(i7);
                    if (c1680n.f()) {
                        arrayList.add(c1680n);
                    } else {
                        arrayList2.add(c1680n);
                    }
                }
            } else {
                arrayList.clear();
                arrayList2.clear();
                arrayList2.addAll(l());
            }
            this.f20964y = false;
        }
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i7, KeyEvent keyEvent) {
        return g(i7, keyEvent) != null;
    }

    public String j() {
        return "android:menu:actionviewstates";
    }

    public MenuC1678l k() {
        return this;
    }

    public final ArrayList l() {
        boolean z8 = this.f20961v;
        ArrayList arrayList = this.f20960u;
        if (!z8) {
            return arrayList;
        }
        arrayList.clear();
        ArrayList arrayList2 = this.f20959f;
        int size = arrayList2.size();
        for (int i7 = 0; i7 < size; i7++) {
            C1680n c1680n = (C1680n) arrayList2.get(i7);
            if (c1680n.isVisible()) {
                arrayList.add(c1680n);
            }
        }
        this.f20961v = false;
        this.f20964y = true;
        return arrayList;
    }

    public boolean m() {
        return this.f20953K;
    }

    public boolean n() {
        return this.f20956c;
    }

    public boolean o() {
        return this.f20957d;
    }

    public void p(boolean z8) {
        if (this.f20946D) {
            this.f20947E = true;
            if (z8) {
                this.f20948F = true;
                return;
            }
            return;
        }
        if (z8) {
            this.f20961v = true;
            this.f20964y = true;
        }
        CopyOnWriteArrayList copyOnWriteArrayList = this.f20951I;
        if (copyOnWriteArrayList.isEmpty()) {
            return;
        }
        w();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            InterfaceC1690x interfaceC1690x = (InterfaceC1690x) weakReference.get();
            if (interfaceC1690x == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                interfaceC1690x.d();
            }
        }
        v();
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i7, int i10) {
        return q(findItem(i7), null, i10);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i7, KeyEvent keyEvent, int i10) {
        C1680n g = g(i7, keyEvent);
        boolean q10 = g != null ? q(g, null, i10) : false;
        if ((i10 & 2) != 0) {
            c(true);
        }
        return q10;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean q(MenuItem menuItem, InterfaceC1690x interfaceC1690x, int i7) {
        boolean z8;
        C1680n c1680n = (C1680n) menuItem;
        if (c1680n == null || !c1680n.isEnabled()) {
            return false;
        }
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = c1680n.f20972D;
        if (onMenuItemClickListener == null || !onMenuItemClickListener.onMenuItemClick(c1680n)) {
            MenuC1678l menuC1678l = c1680n.f20970B;
            if (!menuC1678l.e(menuC1678l, c1680n)) {
                Intent intent = c1680n.f20991u;
                if (intent != null) {
                    try {
                        menuC1678l.f20954a.startActivity(intent);
                    } catch (ActivityNotFoundException e2) {
                        Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e2);
                    }
                }
                ActionProviderVisibilityListenerC1681o actionProviderVisibilityListenerC1681o = c1680n.f20982O;
                if (actionProviderVisibilityListenerC1681o == null || !actionProviderVisibilityListenerC1681o.f20998b.onPerformDefaultAction()) {
                    z8 = false;
                    ActionProviderVisibilityListenerC1681o actionProviderVisibilityListenerC1681o2 = c1680n.f20982O;
                    boolean z10 = actionProviderVisibilityListenerC1681o2 == null && actionProviderVisibilityListenerC1681o2.f20998b.hasSubMenu();
                    if (!c1680n.e()) {
                        z8 |= c1680n.expandActionView();
                        if (z8) {
                            c(true);
                        }
                    } else if (c1680n.hasSubMenu() || z10) {
                        if ((i7 & 4) == 0) {
                            c(false);
                        }
                        if (!c1680n.hasSubMenu()) {
                            SubMenuC1666D subMenuC1666D = new SubMenuC1666D(this.f20954a, this, c1680n);
                            c1680n.f20971C = subMenuC1666D;
                            subMenuC1666D.setHeaderTitle(c1680n.f20989e);
                        }
                        SubMenuC1666D subMenuC1666D2 = c1680n.f20971C;
                        if (z10) {
                            MenuItemC1685s menuItemC1685s = actionProviderVisibilityListenerC1681o2.f20999c;
                            actionProviderVisibilityListenerC1681o2.f20998b.onPrepareSubMenu(subMenuC1666D2);
                        }
                        CopyOnWriteArrayList copyOnWriteArrayList = this.f20951I;
                        if (!copyOnWriteArrayList.isEmpty()) {
                            r0 = interfaceC1690x != null ? interfaceC1690x.h(subMenuC1666D2) : false;
                            Iterator it = copyOnWriteArrayList.iterator();
                            while (it.hasNext()) {
                                WeakReference weakReference = (WeakReference) it.next();
                                InterfaceC1690x interfaceC1690x2 = (InterfaceC1690x) weakReference.get();
                                if (interfaceC1690x2 == null) {
                                    copyOnWriteArrayList.remove(weakReference);
                                } else if (!r0) {
                                    r0 = interfaceC1690x2.h(subMenuC1666D2);
                                }
                            }
                        }
                        z8 |= r0;
                        if (!z8) {
                            c(true);
                        }
                    } else if ((i7 & 1) == 0) {
                        c(true);
                    }
                    return z8;
                }
            }
        }
        z8 = true;
        ActionProviderVisibilityListenerC1681o actionProviderVisibilityListenerC1681o22 = c1680n.f20982O;
        if (actionProviderVisibilityListenerC1681o22 == null) {
        }
        if (!c1680n.e()) {
        }
        return z8;
    }

    public final void r(InterfaceC1690x interfaceC1690x) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f20951I;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            InterfaceC1690x interfaceC1690x2 = (InterfaceC1690x) weakReference.get();
            if (interfaceC1690x2 == null || interfaceC1690x2 == interfaceC1690x) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
    }

    @Override // android.view.Menu
    public final void removeGroup(int i7) {
        ArrayList arrayList = this.f20959f;
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                i11 = -1;
                break;
            } else if (((C1680n) arrayList.get(i11)).f20986b == i7) {
                break;
            } else {
                i11++;
            }
        }
        if (i11 >= 0) {
            int size2 = arrayList.size() - i11;
            while (true) {
                int i12 = i10 + 1;
                if (i10 >= size2 || ((C1680n) arrayList.get(i11)).f20986b != i7) {
                    break;
                }
                if (i11 >= 0) {
                    ArrayList arrayList2 = this.f20959f;
                    if (i11 < arrayList2.size()) {
                        arrayList2.remove(i11);
                    }
                }
                i10 = i12;
            }
            p(true);
        }
    }

    @Override // android.view.Menu
    public final void removeItem(int i7) {
        ArrayList arrayList = this.f20959f;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                i10 = -1;
                break;
            } else if (((C1680n) arrayList.get(i10)).f20985a == i7) {
                break;
            } else {
                i10++;
            }
        }
        if (i10 >= 0) {
            ArrayList arrayList2 = this.f20959f;
            if (i10 >= arrayList2.size()) {
                return;
            }
            arrayList2.remove(i10);
            p(true);
        }
    }

    public final void s(Bundle bundle) {
        MenuItem findItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(j());
        int size = this.f20959f.size();
        for (int i7 = 0; i7 < size; i7++) {
            MenuItem item = getItem(i7);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((SubMenuC1666D) item.getSubMenu()).s(bundle);
            }
        }
        int i10 = bundle.getInt("android:menu:expandedactionview");
        if (i10 <= 0 || (findItem = findItem(i10)) == null) {
            return;
        }
        findItem.expandActionView();
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i7, boolean z8, boolean z10) {
        ArrayList arrayList = this.f20959f;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            C1680n c1680n = (C1680n) arrayList.get(i10);
            if (c1680n.f20986b == i7) {
                c1680n.L = (c1680n.L & (-5)) | (z10 ? 4 : 0);
                c1680n.setCheckable(z8);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z8) {
        this.f20953K = z8;
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i7, boolean z8) {
        ArrayList arrayList = this.f20959f;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            C1680n c1680n = (C1680n) arrayList.get(i10);
            if (c1680n.f20986b == i7) {
                c1680n.setEnabled(z8);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i7, boolean z8) {
        ArrayList arrayList = this.f20959f;
        int size = arrayList.size();
        boolean z10 = false;
        for (int i10 = 0; i10 < size; i10++) {
            C1680n c1680n = (C1680n) arrayList.get(i10);
            if (c1680n.f20986b == i7) {
                int i11 = c1680n.L;
                int i12 = (i11 & (-9)) | (z8 ? 0 : 8);
                c1680n.L = i12;
                if (i11 != i12) {
                    z10 = true;
                }
            }
        }
        if (z10) {
            p(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z8) {
        this.f20956c = z8;
        p(false);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f20959f.size();
    }

    public final void t(Bundle bundle) {
        int size = this.f20959f.size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i7 = 0; i7 < size; i7++) {
            MenuItem item = getItem(i7);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((SubMenuC1666D) item.getSubMenu()).t(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(j(), sparseArray);
        }
    }

    public final void u(int i7, CharSequence charSequence, int i10, Drawable drawable, View view) {
        if (view != null) {
            this.f20945C = view;
            this.f20943A = null;
            this.f20944B = null;
        } else {
            if (i7 > 0) {
                this.f20943A = this.f20955b.getText(i7);
            } else if (charSequence != null) {
                this.f20943A = charSequence;
            }
            if (i10 > 0) {
                this.f20944B = AbstractC1449a.getDrawable(this.f20954a, i10);
            } else if (drawable != null) {
                this.f20944B = drawable;
            }
            this.f20945C = null;
        }
        p(false);
    }

    public final void v() {
        this.f20946D = false;
        if (this.f20947E) {
            this.f20947E = false;
            p(this.f20948F);
        }
    }

    public final void w() {
        if (this.f20946D) {
            return;
        }
        this.f20946D = true;
        this.f20947E = false;
        this.f20948F = false;
    }
}
