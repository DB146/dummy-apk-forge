package n;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import i1.C1290a;
import java.util.ArrayList;
import s1.InterfaceMenuItemC1970a;

/* renamed from: n.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1680n implements InterfaceMenuItemC1970a {

    /* renamed from: B, reason: collision with root package name */
    public final MenuC1678l f20970B;

    /* renamed from: C, reason: collision with root package name */
    public SubMenuC1666D f20971C;

    /* renamed from: D, reason: collision with root package name */
    public MenuItem.OnMenuItemClickListener f20972D;

    /* renamed from: E, reason: collision with root package name */
    public CharSequence f20973E;

    /* renamed from: F, reason: collision with root package name */
    public CharSequence f20974F;

    /* renamed from: M, reason: collision with root package name */
    public int f20980M;

    /* renamed from: N, reason: collision with root package name */
    public View f20981N;

    /* renamed from: O, reason: collision with root package name */
    public ActionProviderVisibilityListenerC1681o f20982O;

    /* renamed from: P, reason: collision with root package name */
    public MenuItem.OnActionExpandListener f20983P;

    /* renamed from: a, reason: collision with root package name */
    public final int f20985a;

    /* renamed from: b, reason: collision with root package name */
    public final int f20986b;

    /* renamed from: c, reason: collision with root package name */
    public final int f20987c;

    /* renamed from: d, reason: collision with root package name */
    public final int f20988d;

    /* renamed from: e, reason: collision with root package name */
    public CharSequence f20989e;

    /* renamed from: f, reason: collision with root package name */
    public CharSequence f20990f;

    /* renamed from: u, reason: collision with root package name */
    public Intent f20991u;

    /* renamed from: v, reason: collision with root package name */
    public char f20992v;

    /* renamed from: x, reason: collision with root package name */
    public char f20994x;

    /* renamed from: z, reason: collision with root package name */
    public Drawable f20996z;

    /* renamed from: w, reason: collision with root package name */
    public int f20993w = 4096;

    /* renamed from: y, reason: collision with root package name */
    public int f20995y = 4096;

    /* renamed from: A, reason: collision with root package name */
    public int f20969A = 0;

    /* renamed from: G, reason: collision with root package name */
    public ColorStateList f20975G = null;

    /* renamed from: H, reason: collision with root package name */
    public PorterDuff.Mode f20976H = null;

    /* renamed from: I, reason: collision with root package name */
    public boolean f20977I = false;

    /* renamed from: J, reason: collision with root package name */
    public boolean f20978J = false;

    /* renamed from: K, reason: collision with root package name */
    public boolean f20979K = false;
    public int L = 16;

    /* renamed from: Q, reason: collision with root package name */
    public boolean f20984Q = false;

    public C1680n(MenuC1678l menuC1678l, int i7, int i10, int i11, int i12, CharSequence charSequence, int i13) {
        this.f20970B = menuC1678l;
        this.f20985a = i10;
        this.f20986b = i7;
        this.f20987c = i11;
        this.f20988d = i12;
        this.f20989e = charSequence;
        this.f20980M = i13;
    }

    public static void c(int i7, int i10, String str, StringBuilder sb2) {
        if ((i7 & i10) == i10) {
            sb2.append(str);
        }
    }

    @Override // s1.InterfaceMenuItemC1970a
    public final ActionProviderVisibilityListenerC1681o a() {
        return this.f20982O;
    }

    @Override // s1.InterfaceMenuItemC1970a
    public final InterfaceMenuItemC1970a b(ActionProviderVisibilityListenerC1681o actionProviderVisibilityListenerC1681o) {
        this.f20981N = null;
        this.f20982O = actionProviderVisibilityListenerC1681o;
        this.f20970B.p(true);
        ActionProviderVisibilityListenerC1681o actionProviderVisibilityListenerC1681o2 = this.f20982O;
        if (actionProviderVisibilityListenerC1681o2 != null) {
            actionProviderVisibilityListenerC1681o2.f20997a = new C1290a(this, 9);
            actionProviderVisibilityListenerC1681o2.f20998b.setVisibilityListener(actionProviderVisibilityListenerC1681o2);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.f20980M & 8) == 0) {
            return false;
        }
        if (this.f20981N == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f20983P;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f20970B.d(this);
        }
        return false;
    }

    public final Drawable d(Drawable drawable) {
        if (drawable != null && this.f20979K && (this.f20977I || this.f20978J)) {
            drawable = drawable.mutate();
            if (this.f20977I) {
                drawable.setTintList(this.f20975G);
            }
            if (this.f20978J) {
                drawable.setTintMode(this.f20976H);
            }
            this.f20979K = false;
        }
        return drawable;
    }

    public final boolean e() {
        ActionProviderVisibilityListenerC1681o actionProviderVisibilityListenerC1681o;
        if ((this.f20980M & 8) == 0) {
            return false;
        }
        if (this.f20981N == null && (actionProviderVisibilityListenerC1681o = this.f20982O) != null) {
            this.f20981N = actionProviderVisibilityListenerC1681o.f20998b.onCreateActionView(this);
        }
        return this.f20981N != null;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        if (!e()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f20983P;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f20970B.f(this);
        }
        return false;
    }

    public final boolean f() {
        return (this.L & 32) == 32;
    }

    public final void g(boolean z8) {
        if (z8) {
            this.L |= 32;
        } else {
            this.L &= -33;
        }
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View view = this.f20981N;
        if (view != null) {
            return view;
        }
        ActionProviderVisibilityListenerC1681o actionProviderVisibilityListenerC1681o = this.f20982O;
        if (actionProviderVisibilityListenerC1681o == null) {
            return null;
        }
        View onCreateActionView = actionProviderVisibilityListenerC1681o.f20998b.onCreateActionView(this);
        this.f20981N = onCreateActionView;
        return onCreateActionView;
    }

    @Override // s1.InterfaceMenuItemC1970a, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f20995y;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f20994x;
    }

    @Override // s1.InterfaceMenuItemC1970a, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f20973E;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f20986b;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        Drawable drawable = this.f20996z;
        if (drawable != null) {
            return d(drawable);
        }
        int i7 = this.f20969A;
        if (i7 == 0) {
            return null;
        }
        Drawable x2 = Q5.e.x(this.f20970B.f20954a, i7);
        this.f20969A = 0;
        this.f20996z = x2;
        return d(x2);
    }

    @Override // s1.InterfaceMenuItemC1970a, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f20975G;
    }

    @Override // s1.InterfaceMenuItemC1970a, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f20976H;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f20991u;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.f20985a;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // s1.InterfaceMenuItemC1970a, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f20993w;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f20992v;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.f20987c;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.f20971C;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f20989e;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f20990f;
        return charSequence != null ? charSequence : this.f20989e;
    }

    @Override // s1.InterfaceMenuItemC1970a, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f20974F;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.f20971C != null;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.f20984Q;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.L & 1) == 1;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.L & 2) == 2;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.L & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        ActionProviderVisibilityListenerC1681o actionProviderVisibilityListenerC1681o = this.f20982O;
        return (actionProviderVisibilityListenerC1681o == null || !actionProviderVisibilityListenerC1681o.f20998b.overridesItemVisibility()) ? (this.L & 8) == 0 : (this.L & 8) == 0 && this.f20982O.f20998b.isVisible();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i7) {
        int i10;
        Context context = this.f20970B.f20954a;
        View inflate = LayoutInflater.from(context).inflate(i7, (ViewGroup) new LinearLayout(context), false);
        this.f20981N = inflate;
        this.f20982O = null;
        if (inflate != null && inflate.getId() == -1 && (i10 = this.f20985a) > 0) {
            inflate.setId(i10);
        }
        MenuC1678l menuC1678l = this.f20970B;
        menuC1678l.f20964y = true;
        menuC1678l.p(true);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        int i7;
        this.f20981N = view;
        this.f20982O = null;
        if (view != null && view.getId() == -1 && (i7 = this.f20985a) > 0) {
            view.setId(i7);
        }
        MenuC1678l menuC1678l = this.f20970B;
        menuC1678l.f20964y = true;
        menuC1678l.p(true);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c10) {
        if (this.f20994x == c10) {
            return this;
        }
        this.f20994x = Character.toLowerCase(c10);
        this.f20970B.p(false);
        return this;
    }

    @Override // s1.InterfaceMenuItemC1970a, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c10, int i7) {
        if (this.f20994x == c10 && this.f20995y == i7) {
            return this;
        }
        this.f20994x = Character.toLowerCase(c10);
        this.f20995y = KeyEvent.normalizeMetaState(i7);
        this.f20970B.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z8) {
        int i7 = this.L;
        int i10 = (z8 ? 1 : 0) | (i7 & (-2));
        this.L = i10;
        if (i7 != i10) {
            this.f20970B.p(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z8) {
        int i7 = this.L;
        if ((i7 & 4) != 0) {
            MenuC1678l menuC1678l = this.f20970B;
            menuC1678l.getClass();
            ArrayList arrayList = menuC1678l.f20959f;
            int size = arrayList.size();
            menuC1678l.w();
            for (int i10 = 0; i10 < size; i10++) {
                C1680n c1680n = (C1680n) arrayList.get(i10);
                if (c1680n.f20986b == this.f20986b && (c1680n.L & 4) != 0 && c1680n.isCheckable()) {
                    boolean z10 = c1680n == this;
                    int i11 = c1680n.L;
                    int i12 = (z10 ? 2 : 0) | (i11 & (-3));
                    c1680n.L = i12;
                    if (i11 != i12) {
                        c1680n.f20970B.p(false);
                    }
                }
            }
            menuC1678l.v();
        } else {
            int i13 = (i7 & (-3)) | (z8 ? 2 : 0);
            this.L = i13;
            if (i7 != i13) {
                this.f20970B.p(false);
            }
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        setContentDescription(charSequence);
        return this;
    }

    @Override // s1.InterfaceMenuItemC1970a, android.view.MenuItem
    public final InterfaceMenuItemC1970a setContentDescription(CharSequence charSequence) {
        this.f20973E = charSequence;
        this.f20970B.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z8) {
        if (z8) {
            this.L |= 16;
        } else {
            this.L &= -17;
        }
        this.f20970B.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i7) {
        this.f20996z = null;
        this.f20969A = i7;
        this.f20979K = true;
        this.f20970B.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f20969A = 0;
        this.f20996z = drawable;
        this.f20979K = true;
        this.f20970B.p(false);
        return this;
    }

    @Override // s1.InterfaceMenuItemC1970a, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f20975G = colorStateList;
        this.f20977I = true;
        this.f20979K = true;
        this.f20970B.p(false);
        return this;
    }

    @Override // s1.InterfaceMenuItemC1970a, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f20976H = mode;
        this.f20978J = true;
        this.f20979K = true;
        this.f20970B.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f20991u = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c10) {
        if (this.f20992v == c10) {
            return this;
        }
        this.f20992v = c10;
        this.f20970B.p(false);
        return this;
    }

    @Override // s1.InterfaceMenuItemC1970a, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c10, int i7) {
        if (this.f20992v == c10 && this.f20993w == i7) {
            return this;
        }
        this.f20992v = c10;
        this.f20993w = KeyEvent.normalizeMetaState(i7);
        this.f20970B.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f20983P = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f20972D = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c10, char c11) {
        this.f20992v = c10;
        this.f20994x = Character.toLowerCase(c11);
        this.f20970B.p(false);
        return this;
    }

    @Override // s1.InterfaceMenuItemC1970a, android.view.MenuItem
    public final MenuItem setShortcut(char c10, char c11, int i7, int i10) {
        this.f20992v = c10;
        this.f20993w = KeyEvent.normalizeMetaState(i7);
        this.f20994x = Character.toLowerCase(c11);
        this.f20995y = KeyEvent.normalizeMetaState(i10);
        this.f20970B.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i7) {
        int i10 = i7 & 3;
        if (i10 != 0 && i10 != 1 && i10 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f20980M = i7;
        MenuC1678l menuC1678l = this.f20970B;
        menuC1678l.f20964y = true;
        menuC1678l.p(true);
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i7) {
        setShowAsAction(i7);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i7) {
        setTitle(this.f20970B.f20954a.getString(i7));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f20989e = charSequence;
        this.f20970B.p(false);
        SubMenuC1666D subMenuC1666D = this.f20971C;
        if (subMenuC1666D != null) {
            subMenuC1666D.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f20990f = charSequence;
        this.f20970B.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        setTooltipText(charSequence);
        return this;
    }

    @Override // s1.InterfaceMenuItemC1970a, android.view.MenuItem
    public final InterfaceMenuItemC1970a setTooltipText(CharSequence charSequence) {
        this.f20974F = charSequence;
        this.f20970B.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z8) {
        int i7 = this.L;
        int i10 = (z8 ? 0 : 8) | (i7 & (-9));
        this.L = i10;
        if (i7 != i10) {
            MenuC1678l menuC1678l = this.f20970B;
            menuC1678l.f20961v = true;
            menuC1678l.p(true);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.f20989e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }
}
