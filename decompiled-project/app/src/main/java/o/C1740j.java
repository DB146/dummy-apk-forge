package o;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import com.kt.apps.media.xemtv.beta.R;
import java.util.ArrayList;
import n.AbstractC1686t;
import n.ActionProviderVisibilityListenerC1681o;
import n.C1680n;
import n.InterfaceC1689w;
import n.InterfaceC1690x;
import n.InterfaceC1691y;
import n.InterfaceC1692z;
import n.MenuC1678l;
import n.SubMenuC1666D;

/* renamed from: o.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1740j implements InterfaceC1690x {

    /* renamed from: A, reason: collision with root package name */
    public boolean f21504A;

    /* renamed from: B, reason: collision with root package name */
    public int f21505B;

    /* renamed from: C, reason: collision with root package name */
    public int f21506C;

    /* renamed from: D, reason: collision with root package name */
    public int f21507D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f21508E;

    /* renamed from: G, reason: collision with root package name */
    public C1732f f21510G;

    /* renamed from: H, reason: collision with root package name */
    public C1732f f21511H;

    /* renamed from: I, reason: collision with root package name */
    public RunnableC1736h f21512I;

    /* renamed from: J, reason: collision with root package name */
    public C1734g f21513J;

    /* renamed from: a, reason: collision with root package name */
    public final Context f21515a;

    /* renamed from: b, reason: collision with root package name */
    public Context f21516b;

    /* renamed from: c, reason: collision with root package name */
    public MenuC1678l f21517c;

    /* renamed from: d, reason: collision with root package name */
    public final LayoutInflater f21518d;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC1689w f21519e;

    /* renamed from: v, reason: collision with root package name */
    public InterfaceC1692z f21522v;

    /* renamed from: w, reason: collision with root package name */
    public C1738i f21523w;

    /* renamed from: x, reason: collision with root package name */
    public Drawable f21524x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f21525y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f21526z;

    /* renamed from: f, reason: collision with root package name */
    public final int f21520f = R.layout.abc_action_menu_layout;

    /* renamed from: u, reason: collision with root package name */
    public final int f21521u = R.layout.abc_action_menu_item_layout;

    /* renamed from: F, reason: collision with root package name */
    public final SparseBooleanArray f21509F = new SparseBooleanArray();

    /* renamed from: K, reason: collision with root package name */
    public final R7.b f21514K = new R7.b(this, 26);

    public C1740j(Context context) {
        this.f21515a = context;
        this.f21518d = LayoutInflater.from(context);
    }

    @Override // n.InterfaceC1690x
    public final void a(MenuC1678l menuC1678l, boolean z8) {
        c();
        C1732f c1732f = this.f21511H;
        if (c1732f != null && c1732f.b()) {
            c1732f.f21016i.dismiss();
        }
        InterfaceC1689w interfaceC1689w = this.f21519e;
        if (interfaceC1689w != null) {
            interfaceC1689w.a(menuC1678l, z8);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r5v4, types: [n.y] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    public final View b(C1680n c1680n, View view, ViewGroup viewGroup) {
        View actionView = c1680n.getActionView();
        if (actionView == null || c1680n.e()) {
            ActionMenuItemView actionMenuItemView = view instanceof InterfaceC1691y ? (InterfaceC1691y) view : (InterfaceC1691y) this.f21518d.inflate(this.f21521u, viewGroup, false);
            actionMenuItemView.a(c1680n);
            ActionMenuItemView actionMenuItemView2 = actionMenuItemView;
            actionMenuItemView2.setItemInvoker((ActionMenuView) this.f21522v);
            if (this.f21513J == null) {
                this.f21513J = new C1734g(this);
            }
            actionMenuItemView2.setPopupCallback(this.f21513J);
            actionView = actionMenuItemView;
        }
        actionView.setVisibility(c1680n.f20984Q ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        ((ActionMenuView) viewGroup).getClass();
        if (!(layoutParams instanceof C1744l)) {
            actionView.setLayoutParams(ActionMenuView.k(layoutParams));
        }
        return actionView;
    }

    public final boolean c() {
        Object obj;
        RunnableC1736h runnableC1736h = this.f21512I;
        if (runnableC1736h != null && (obj = this.f21522v) != null) {
            ((View) obj).removeCallbacks(runnableC1736h);
            this.f21512I = null;
            return true;
        }
        C1732f c1732f = this.f21510G;
        if (c1732f == null) {
            return false;
        }
        if (c1732f.b()) {
            c1732f.f21016i.dismiss();
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // n.InterfaceC1690x
    public final void d() {
        int i7;
        ViewGroup viewGroup = (ViewGroup) this.f21522v;
        ArrayList arrayList = null;
        boolean z8 = false;
        if (viewGroup != null) {
            MenuC1678l menuC1678l = this.f21517c;
            if (menuC1678l != null) {
                menuC1678l.i();
                ArrayList l10 = this.f21517c.l();
                int size = l10.size();
                i7 = 0;
                for (int i10 = 0; i10 < size; i10++) {
                    C1680n c1680n = (C1680n) l10.get(i10);
                    if (c1680n.f()) {
                        View childAt = viewGroup.getChildAt(i7);
                        C1680n itemData = childAt instanceof InterfaceC1691y ? ((InterfaceC1691y) childAt).getItemData() : null;
                        View b2 = b(c1680n, childAt, viewGroup);
                        if (c1680n != itemData) {
                            b2.setPressed(false);
                            b2.jumpDrawablesToCurrentState();
                        }
                        if (b2 != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) b2.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(b2);
                            }
                            ((ViewGroup) this.f21522v).addView(b2, i7);
                        }
                        i7++;
                    }
                }
            } else {
                i7 = 0;
            }
            while (i7 < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i7) == this.f21523w) {
                    i7++;
                } else {
                    viewGroup.removeViewAt(i7);
                }
            }
        }
        ((View) this.f21522v).requestLayout();
        MenuC1678l menuC1678l2 = this.f21517c;
        if (menuC1678l2 != null) {
            menuC1678l2.i();
            ArrayList arrayList2 = menuC1678l2.f20962w;
            int size2 = arrayList2.size();
            for (int i11 = 0; i11 < size2; i11++) {
                ActionProviderVisibilityListenerC1681o actionProviderVisibilityListenerC1681o = ((C1680n) arrayList2.get(i11)).f20982O;
            }
        }
        MenuC1678l menuC1678l3 = this.f21517c;
        if (menuC1678l3 != null) {
            menuC1678l3.i();
            arrayList = menuC1678l3.f20963x;
        }
        if (this.f21526z && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z8 = !((C1680n) arrayList.get(0)).f20984Q;
            } else if (size3 > 0) {
                z8 = true;
            }
        }
        if (z8) {
            if (this.f21523w == null) {
                this.f21523w = new C1738i(this, this.f21515a);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.f21523w.getParent();
            if (viewGroup3 != this.f21522v) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.f21523w);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f21522v;
                C1738i c1738i = this.f21523w;
                actionMenuView.getClass();
                C1744l j = ActionMenuView.j();
                j.f21531a = true;
                actionMenuView.addView(c1738i, j);
            }
        } else {
            C1738i c1738i2 = this.f21523w;
            if (c1738i2 != null) {
                Object parent = c1738i2.getParent();
                Object obj = this.f21522v;
                if (parent == obj) {
                    ((ViewGroup) obj).removeView(this.f21523w);
                }
            }
        }
        ((ActionMenuView) this.f21522v).setOverflowReserved(this.f21526z);
    }

    public final boolean e() {
        C1732f c1732f = this.f21510G;
        return c1732f != null && c1732f.b();
    }

    @Override // n.InterfaceC1690x
    public final boolean f(C1680n c1680n) {
        return false;
    }

    @Override // n.InterfaceC1690x
    public final void g(Context context, MenuC1678l menuC1678l) {
        this.f21516b = context;
        LayoutInflater.from(context);
        this.f21517c = menuC1678l;
        Resources resources = context.getResources();
        if (!this.f21504A) {
            this.f21526z = true;
        }
        int i7 = 2;
        this.f21505B = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i10 = configuration.screenWidthDp;
        int i11 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i10 > 600 || ((i10 > 960 && i11 > 720) || (i10 > 720 && i11 > 960))) {
            i7 = 5;
        } else if (i10 >= 500 || ((i10 > 640 && i11 > 480) || (i10 > 480 && i11 > 640))) {
            i7 = 4;
        } else if (i10 >= 360) {
            i7 = 3;
        }
        this.f21507D = i7;
        int i12 = this.f21505B;
        if (this.f21526z) {
            if (this.f21523w == null) {
                C1738i c1738i = new C1738i(this, this.f21515a);
                this.f21523w = c1738i;
                if (this.f21525y) {
                    c1738i.setImageDrawable(this.f21524x);
                    this.f21524x = null;
                    this.f21525y = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f21523w.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i12 -= this.f21523w.getMeasuredWidth();
        } else {
            this.f21523w = null;
        }
        this.f21506C = i12;
        float f4 = resources.getDisplayMetrics().density;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // n.InterfaceC1690x
    public final boolean h(SubMenuC1666D subMenuC1666D) {
        boolean z8;
        if (!subMenuC1666D.hasVisibleItems()) {
            return false;
        }
        SubMenuC1666D subMenuC1666D2 = subMenuC1666D;
        while (true) {
            MenuC1678l menuC1678l = subMenuC1666D2.f20879N;
            if (menuC1678l == this.f21517c) {
                break;
            }
            subMenuC1666D2 = (SubMenuC1666D) menuC1678l;
        }
        ViewGroup viewGroup = (ViewGroup) this.f21522v;
        View view = null;
        if (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            int i7 = 0;
            while (true) {
                if (i7 >= childCount) {
                    break;
                }
                View childAt = viewGroup.getChildAt(i7);
                if ((childAt instanceof InterfaceC1691y) && ((InterfaceC1691y) childAt).getItemData() == subMenuC1666D2.f20880O) {
                    view = childAt;
                    break;
                }
                i7++;
            }
        }
        if (view == null) {
            return false;
        }
        subMenuC1666D.f20880O.getClass();
        int size = subMenuC1666D.f20959f.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                z8 = false;
                break;
            }
            MenuItem item = subMenuC1666D.getItem(i10);
            if (item.isVisible() && item.getIcon() != null) {
                z8 = true;
                break;
            }
            i10++;
        }
        C1732f c1732f = new C1732f(this, this.f21516b, subMenuC1666D, view);
        this.f21511H = c1732f;
        c1732f.g = z8;
        AbstractC1686t abstractC1686t = c1732f.f21016i;
        if (abstractC1686t != null) {
            abstractC1686t.o(z8);
        }
        C1732f c1732f2 = this.f21511H;
        if (!c1732f2.b()) {
            if (c1732f2.f21013e == null) {
                throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
            }
            c1732f2.d(0, 0, false, false);
        }
        InterfaceC1689w interfaceC1689w = this.f21519e;
        if (interfaceC1689w != null) {
            interfaceC1689w.j(subMenuC1666D);
        }
        return true;
    }

    @Override // n.InterfaceC1690x
    public final boolean i() {
        int i7;
        ArrayList arrayList;
        int i10;
        boolean z8;
        MenuC1678l menuC1678l = this.f21517c;
        if (menuC1678l != null) {
            arrayList = menuC1678l.l();
            i7 = arrayList.size();
        } else {
            i7 = 0;
            arrayList = null;
        }
        int i11 = this.f21507D;
        int i12 = this.f21506C;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) this.f21522v;
        int i13 = 0;
        boolean z10 = false;
        int i14 = 0;
        int i15 = 0;
        while (true) {
            i10 = 2;
            z8 = true;
            if (i13 >= i7) {
                break;
            }
            C1680n c1680n = (C1680n) arrayList.get(i13);
            int i16 = c1680n.f20980M;
            if ((i16 & 2) == 2) {
                i14++;
            } else if ((i16 & 1) == 1) {
                i15++;
            } else {
                z10 = true;
            }
            if (this.f21508E && c1680n.f20984Q) {
                i11 = 0;
            }
            i13++;
        }
        if (this.f21526z && (z10 || i15 + i14 > i11)) {
            i11--;
        }
        int i17 = i11 - i14;
        SparseBooleanArray sparseBooleanArray = this.f21509F;
        sparseBooleanArray.clear();
        int i18 = 0;
        int i19 = 0;
        while (i18 < i7) {
            C1680n c1680n2 = (C1680n) arrayList.get(i18);
            int i20 = c1680n2.f20980M;
            boolean z11 = (i20 & 2) == i10 ? z8 : false;
            int i21 = c1680n2.f20986b;
            if (z11) {
                View b2 = b(c1680n2, null, viewGroup);
                b2.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredWidth = b2.getMeasuredWidth();
                i12 -= measuredWidth;
                if (i19 == 0) {
                    i19 = measuredWidth;
                }
                if (i21 != 0) {
                    sparseBooleanArray.put(i21, z8);
                }
                c1680n2.g(z8);
            } else if ((i20 & 1) == z8) {
                boolean z12 = sparseBooleanArray.get(i21);
                boolean z13 = ((i17 > 0 || z12) && i12 > 0) ? z8 : false;
                if (z13) {
                    View b10 = b(c1680n2, null, viewGroup);
                    b10.measure(makeMeasureSpec, makeMeasureSpec);
                    int measuredWidth2 = b10.getMeasuredWidth();
                    i12 -= measuredWidth2;
                    if (i19 == 0) {
                        i19 = measuredWidth2;
                    }
                    z13 &= i12 + i19 > 0;
                }
                if (z13 && i21 != 0) {
                    sparseBooleanArray.put(i21, true);
                } else if (z12) {
                    sparseBooleanArray.put(i21, false);
                    for (int i22 = 0; i22 < i18; i22++) {
                        C1680n c1680n3 = (C1680n) arrayList.get(i22);
                        if (c1680n3.f20986b == i21) {
                            if (c1680n3.f()) {
                                i17++;
                            }
                            c1680n3.g(false);
                        }
                    }
                }
                if (z13) {
                    i17--;
                }
                c1680n2.g(z13);
            } else {
                c1680n2.g(false);
                i18++;
                i10 = 2;
                z8 = true;
            }
            i18++;
            i10 = 2;
            z8 = true;
        }
        return z8;
    }

    @Override // n.InterfaceC1690x
    public final void j(InterfaceC1689w interfaceC1689w) {
        throw null;
    }

    @Override // n.InterfaceC1690x
    public final boolean k(C1680n c1680n) {
        return false;
    }

    public final boolean l() {
        MenuC1678l menuC1678l;
        if (!this.f21526z || e() || (menuC1678l = this.f21517c) == null || this.f21522v == null || this.f21512I != null) {
            return false;
        }
        menuC1678l.i();
        if (menuC1678l.f20963x.isEmpty()) {
            return false;
        }
        RunnableC1736h runnableC1736h = new RunnableC1736h(this, new C1732f(this, this.f21516b, this.f21517c, this.f21523w));
        this.f21512I = runnableC1736h;
        ((View) this.f21522v).post(runnableC1736h);
        return true;
    }
}
