package n;

import B0.G;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.util.Log;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.kt.apps.media.xemtv.beta.R;
import ia.C1358d;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import o.A0;
import o.B0;
import o.C1747m0;
import o.C1765w;
import o.C1770y0;
import o.D0;

/* renamed from: n.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnKeyListenerC1672f extends AbstractC1686t implements View.OnKeyListener, PopupWindow.OnDismissListener {

    /* renamed from: B, reason: collision with root package name */
    public View f20905B;

    /* renamed from: C, reason: collision with root package name */
    public View f20906C;

    /* renamed from: D, reason: collision with root package name */
    public int f20907D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f20908E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f20909F;

    /* renamed from: G, reason: collision with root package name */
    public int f20910G;

    /* renamed from: H, reason: collision with root package name */
    public int f20911H;

    /* renamed from: J, reason: collision with root package name */
    public boolean f20913J;

    /* renamed from: K, reason: collision with root package name */
    public InterfaceC1689w f20914K;
    public ViewTreeObserver L;

    /* renamed from: M, reason: collision with root package name */
    public C1687u f20915M;

    /* renamed from: N, reason: collision with root package name */
    public boolean f20916N;

    /* renamed from: b, reason: collision with root package name */
    public final Context f20917b;

    /* renamed from: c, reason: collision with root package name */
    public final int f20918c;

    /* renamed from: d, reason: collision with root package name */
    public final int f20919d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f20920e;

    /* renamed from: f, reason: collision with root package name */
    public final Handler f20921f;

    /* renamed from: u, reason: collision with root package name */
    public final ArrayList f20922u = new ArrayList();

    /* renamed from: v, reason: collision with root package name */
    public final ArrayList f20923v = new ArrayList();

    /* renamed from: w, reason: collision with root package name */
    public final ViewTreeObserverOnGlobalLayoutListenerC1670d f20924w = new ViewTreeObserverOnGlobalLayoutListenerC1670d(this, 0);

    /* renamed from: x, reason: collision with root package name */
    public final G f20925x = new G(this, 5);

    /* renamed from: y, reason: collision with root package name */
    public final C1358d f20926y = new C1358d(this, 4);

    /* renamed from: z, reason: collision with root package name */
    public int f20927z = 0;

    /* renamed from: A, reason: collision with root package name */
    public int f20904A = 0;

    /* renamed from: I, reason: collision with root package name */
    public boolean f20912I = false;

    public ViewOnKeyListenerC1672f(Context context, View view, int i7, boolean z8) {
        this.f20917b = context;
        this.f20905B = view;
        this.f20919d = i7;
        this.f20920e = z8;
        this.f20907D = view.getLayoutDirection() != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.f20918c = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f20921f = new Handler();
    }

    @Override // n.InterfaceC1690x
    public final void a(MenuC1678l menuC1678l, boolean z8) {
        ArrayList arrayList = this.f20923v;
        int size = arrayList.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size) {
                i7 = -1;
                break;
            } else if (menuC1678l == ((C1671e) arrayList.get(i7)).f20902b) {
                break;
            } else {
                i7++;
            }
        }
        if (i7 < 0) {
            return;
        }
        int i10 = i7 + 1;
        if (i10 < arrayList.size()) {
            ((C1671e) arrayList.get(i10)).f20902b.c(false);
        }
        C1671e c1671e = (C1671e) arrayList.remove(i7);
        c1671e.f20902b.r(this);
        boolean z10 = this.f20916N;
        D0 d02 = c1671e.f20901a;
        if (z10) {
            A0.b(d02.f21637N, null);
            d02.f21637N.setAnimationStyle(0);
        }
        d02.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.f20907D = ((C1671e) arrayList.get(size2 - 1)).f20903c;
        } else {
            this.f20907D = this.f20905B.getLayoutDirection() == 1 ? 0 : 1;
        }
        if (size2 != 0) {
            if (z8) {
                ((C1671e) arrayList.get(0)).f20902b.c(false);
                return;
            }
            return;
        }
        dismiss();
        InterfaceC1689w interfaceC1689w = this.f20914K;
        if (interfaceC1689w != null) {
            interfaceC1689w.a(menuC1678l, true);
        }
        ViewTreeObserver viewTreeObserver = this.L;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.L.removeGlobalOnLayoutListener(this.f20924w);
            }
            this.L = null;
        }
        this.f20906C.removeOnAttachStateChangeListener(this.f20925x);
        this.f20915M.onDismiss();
    }

    @Override // n.InterfaceC1664B
    public final boolean b() {
        ArrayList arrayList = this.f20923v;
        return arrayList.size() > 0 && ((C1671e) arrayList.get(0)).f20901a.f21637N.isShowing();
    }

    @Override // n.InterfaceC1664B
    public final void c() {
        if (b()) {
            return;
        }
        ArrayList arrayList = this.f20922u;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            v((MenuC1678l) it.next());
        }
        arrayList.clear();
        View view = this.f20905B;
        this.f20906C = view;
        if (view != null) {
            boolean z8 = this.L == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.L = viewTreeObserver;
            if (z8) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f20924w);
            }
            this.f20906C.addOnAttachStateChangeListener(this.f20925x);
        }
    }

    @Override // n.InterfaceC1690x
    public final void d() {
        Iterator it = this.f20923v.iterator();
        while (it.hasNext()) {
            ListAdapter adapter = ((C1671e) it.next()).f20901a.f21640c.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((C1675i) adapter).notifyDataSetChanged();
        }
    }

    @Override // n.InterfaceC1664B
    public final void dismiss() {
        ArrayList arrayList = this.f20923v;
        int size = arrayList.size();
        if (size > 0) {
            C1671e[] c1671eArr = (C1671e[]) arrayList.toArray(new C1671e[size]);
            for (int i7 = size - 1; i7 >= 0; i7--) {
                C1671e c1671e = c1671eArr[i7];
                if (c1671e.f20901a.f21637N.isShowing()) {
                    c1671e.f20901a.dismiss();
                }
            }
        }
    }

    @Override // n.InterfaceC1664B
    public final C1747m0 e() {
        ArrayList arrayList = this.f20923v;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((C1671e) h3.o.k(1, arrayList)).f20901a.f21640c;
    }

    @Override // n.InterfaceC1690x
    public final boolean h(SubMenuC1666D subMenuC1666D) {
        Iterator it = this.f20923v.iterator();
        while (it.hasNext()) {
            C1671e c1671e = (C1671e) it.next();
            if (subMenuC1666D == c1671e.f20902b) {
                c1671e.f20901a.f21640c.requestFocus();
                return true;
            }
        }
        if (!subMenuC1666D.hasVisibleItems()) {
            return false;
        }
        l(subMenuC1666D);
        InterfaceC1689w interfaceC1689w = this.f20914K;
        if (interfaceC1689w != null) {
            interfaceC1689w.j(subMenuC1666D);
        }
        return true;
    }

    @Override // n.InterfaceC1690x
    public final boolean i() {
        return false;
    }

    @Override // n.InterfaceC1690x
    public final void j(InterfaceC1689w interfaceC1689w) {
        this.f20914K = interfaceC1689w;
    }

    @Override // n.AbstractC1686t
    public final void l(MenuC1678l menuC1678l) {
        menuC1678l.b(this, this.f20917b);
        if (b()) {
            v(menuC1678l);
        } else {
            this.f20922u.add(menuC1678l);
        }
    }

    @Override // n.AbstractC1686t
    public final void n(View view) {
        if (this.f20905B != view) {
            this.f20905B = view;
            this.f20904A = Gravity.getAbsoluteGravity(this.f20927z, view.getLayoutDirection());
        }
    }

    @Override // n.AbstractC1686t
    public final void o(boolean z8) {
        this.f20912I = z8;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        C1671e c1671e;
        ArrayList arrayList = this.f20923v;
        int size = arrayList.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size) {
                c1671e = null;
                break;
            }
            c1671e = (C1671e) arrayList.get(i7);
            if (!c1671e.f20901a.f21637N.isShowing()) {
                break;
            } else {
                i7++;
            }
        }
        if (c1671e != null) {
            c1671e.f20902b.c(false);
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i7, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i7 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // n.AbstractC1686t
    public final void p(int i7) {
        if (this.f20927z != i7) {
            this.f20927z = i7;
            this.f20904A = Gravity.getAbsoluteGravity(i7, this.f20905B.getLayoutDirection());
        }
    }

    @Override // n.AbstractC1686t
    public final void q(int i7) {
        this.f20908E = true;
        this.f20910G = i7;
    }

    @Override // n.AbstractC1686t
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.f20915M = (C1687u) onDismissListener;
    }

    @Override // n.AbstractC1686t
    public final void s(boolean z8) {
        this.f20913J = z8;
    }

    @Override // n.AbstractC1686t
    public final void t(int i7) {
        this.f20909F = true;
        this.f20911H = i7;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x013a, code lost:
    
        if (((r8.getWidth() + r11[0]) + r5) > r9.right) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x013c, code lost:
    
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x013f, code lost:
    
        r8 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0144, code lost:
    
        if ((r11[0] - r5) < 0) goto L60;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01ad  */
    /* JADX WARN: Type inference failed for: r7v0, types: [o.y0, o.D0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(MenuC1678l menuC1678l) {
        C1671e c1671e;
        View view;
        int i7;
        int i10;
        int i11;
        int width;
        MenuItem menuItem;
        C1675i c1675i;
        int i12;
        int firstVisiblePosition;
        Context context = this.f20917b;
        LayoutInflater from = LayoutInflater.from(context);
        C1675i c1675i2 = new C1675i(menuC1678l, from, this.f20920e, R.layout.abc_cascading_menu_item_layout);
        if (!b() && this.f20912I) {
            c1675i2.f20938c = true;
        } else if (b()) {
            c1675i2.f20938c = AbstractC1686t.u(menuC1678l);
        }
        int m10 = AbstractC1686t.m(c1675i2, context, this.f20918c);
        ?? c1770y0 = new C1770y0(context, null, this.f20919d);
        c1770y0.f21367Q = this.f20926y;
        c1770y0.f21628D = this;
        c1770y0.f21637N.setOnDismissListener(this);
        c1770y0.f21627C = this.f20905B;
        c1770y0.f21649z = this.f20904A;
        c1770y0.f21636M = true;
        c1770y0.f21637N.setFocusable(true);
        c1770y0.f21637N.setInputMethodMode(2);
        c1770y0.p(c1675i2);
        c1770y0.r(m10);
        c1770y0.f21649z = this.f20904A;
        ArrayList arrayList = this.f20923v;
        if (arrayList.size() > 0) {
            c1671e = (C1671e) h3.o.k(1, arrayList);
            MenuC1678l menuC1678l2 = c1671e.f20902b;
            int size = menuC1678l2.f20959f.size();
            int i13 = 0;
            while (true) {
                if (i13 >= size) {
                    menuItem = null;
                    break;
                }
                menuItem = menuC1678l2.getItem(i13);
                if (menuItem.hasSubMenu() && menuC1678l == menuItem.getSubMenu()) {
                    break;
                } else {
                    i13++;
                }
            }
            if (menuItem == null) {
                view = null;
            } else {
                C1747m0 c1747m0 = c1671e.f20901a.f21640c;
                ListAdapter adapter = c1747m0.getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i12 = headerViewListAdapter.getHeadersCount();
                    c1675i = (C1675i) headerViewListAdapter.getWrappedAdapter();
                } else {
                    c1675i = (C1675i) adapter;
                    i12 = 0;
                }
                int count = c1675i.getCount();
                int i14 = 0;
                while (true) {
                    if (i14 >= count) {
                        i14 = -1;
                        break;
                    } else if (menuItem == c1675i.getItem(i14)) {
                        break;
                    } else {
                        i14++;
                    }
                }
                if (i14 != -1 && (firstVisiblePosition = (i14 + i12) - c1747m0.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < c1747m0.getChildCount()) {
                    view = c1747m0.getChildAt(firstVisiblePosition);
                }
            }
            if (view == null) {
                int i15 = Build.VERSION.SDK_INT;
                C1765w c1765w = c1770y0.f21637N;
                if (i15 <= 28) {
                    Method method = D0.f21366R;
                    if (method != null) {
                        try {
                            method.invoke(c1765w, Boolean.FALSE);
                        } catch (Exception unused) {
                            Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
                        }
                    }
                } else {
                    B0.a(c1765w, false);
                }
                A0.a(c1770y0.f21637N, null);
                C1747m0 c1747m02 = ((C1671e) arrayList.get(arrayList.size() - 1)).f20901a.f21640c;
                int[] iArr = new int[2];
                c1747m02.getLocationOnScreen(iArr);
                Rect rect = new Rect();
                this.f20906C.getWindowVisibleDisplayFrame(rect);
                if (this.f20907D == 1) {
                }
                boolean z8 = i7 == 1;
                this.f20907D = i7;
                if (Build.VERSION.SDK_INT >= 26) {
                    c1770y0.f21627C = view;
                    i11 = 0;
                    i10 = 0;
                } else {
                    int[] iArr2 = new int[2];
                    this.f20905B.getLocationOnScreen(iArr2);
                    int[] iArr3 = new int[2];
                    view.getLocationOnScreen(iArr3);
                    if ((this.f20904A & 7) == 5) {
                        iArr2[0] = this.f20905B.getWidth() + iArr2[0];
                        iArr3[0] = view.getWidth() + iArr3[0];
                    }
                    i10 = iArr3[0] - iArr2[0];
                    i11 = iArr3[1] - iArr2[1];
                }
                if ((this.f20904A & 5) != 5) {
                    if (z8) {
                        width = i10 + view.getWidth();
                        c1770y0.f21643f = width;
                        c1770y0.f21648y = true;
                        c1770y0.f21647x = true;
                        c1770y0.i(i11);
                    }
                    width = i10 - m10;
                    c1770y0.f21643f = width;
                    c1770y0.f21648y = true;
                    c1770y0.f21647x = true;
                    c1770y0.i(i11);
                } else if (z8) {
                    width = i10 + m10;
                    c1770y0.f21643f = width;
                    c1770y0.f21648y = true;
                    c1770y0.f21647x = true;
                    c1770y0.i(i11);
                } else {
                    m10 = view.getWidth();
                    width = i10 - m10;
                    c1770y0.f21643f = width;
                    c1770y0.f21648y = true;
                    c1770y0.f21647x = true;
                    c1770y0.i(i11);
                }
            } else {
                if (this.f20908E) {
                    c1770y0.f21643f = this.f20910G;
                }
                if (this.f20909F) {
                    c1770y0.i(this.f20911H);
                }
                Rect rect2 = this.f21007a;
                c1770y0.L = rect2 != null ? new Rect(rect2) : null;
            }
            arrayList.add(new C1671e(c1770y0, menuC1678l, this.f20907D));
            c1770y0.c();
            C1747m0 c1747m03 = c1770y0.f21640c;
            c1747m03.setOnKeyListener(this);
            if (c1671e == null || !this.f20913J || menuC1678l.f20943A == null) {
                return;
            }
            FrameLayout frameLayout = (FrameLayout) from.inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) c1747m03, false);
            TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(menuC1678l.f20943A);
            c1747m03.addHeaderView(frameLayout, null, false);
            c1770y0.c();
            return;
        }
        c1671e = null;
        view = null;
        if (view == null) {
        }
        arrayList.add(new C1671e(c1770y0, menuC1678l, this.f20907D));
        c1770y0.c();
        C1747m0 c1747m032 = c1770y0.f21640c;
        c1747m032.setOnKeyListener(this);
        if (c1671e == null) {
        }
    }
}
