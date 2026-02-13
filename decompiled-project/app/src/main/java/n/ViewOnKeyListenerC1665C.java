package n;

import B0.G;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.kt.apps.media.xemtv.beta.R;
import o.C1747m0;
import o.C1770y0;
import o.D0;

/* renamed from: n.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnKeyListenerC1665C extends AbstractC1686t implements PopupWindow.OnDismissListener, View.OnKeyListener {

    /* renamed from: A, reason: collision with root package name */
    public View f20860A;

    /* renamed from: B, reason: collision with root package name */
    public InterfaceC1689w f20861B;

    /* renamed from: C, reason: collision with root package name */
    public ViewTreeObserver f20862C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f20863D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f20864E;

    /* renamed from: F, reason: collision with root package name */
    public int f20865F;

    /* renamed from: H, reason: collision with root package name */
    public boolean f20867H;

    /* renamed from: b, reason: collision with root package name */
    public final Context f20868b;

    /* renamed from: c, reason: collision with root package name */
    public final MenuC1678l f20869c;

    /* renamed from: d, reason: collision with root package name */
    public final C1675i f20870d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f20871e;

    /* renamed from: f, reason: collision with root package name */
    public final int f20872f;

    /* renamed from: u, reason: collision with root package name */
    public final int f20873u;

    /* renamed from: v, reason: collision with root package name */
    public final D0 f20874v;

    /* renamed from: y, reason: collision with root package name */
    public C1687u f20877y;

    /* renamed from: z, reason: collision with root package name */
    public View f20878z;

    /* renamed from: w, reason: collision with root package name */
    public final ViewTreeObserverOnGlobalLayoutListenerC1670d f20875w = new ViewTreeObserverOnGlobalLayoutListenerC1670d(this, 1);

    /* renamed from: x, reason: collision with root package name */
    public final G f20876x = new G(this, 6);

    /* renamed from: G, reason: collision with root package name */
    public int f20866G = 0;

    /* JADX WARN: Type inference failed for: r6v1, types: [o.y0, o.D0] */
    public ViewOnKeyListenerC1665C(int i7, Context context, View view, MenuC1678l menuC1678l, boolean z8) {
        this.f20868b = context;
        this.f20869c = menuC1678l;
        this.f20871e = z8;
        this.f20870d = new C1675i(menuC1678l, LayoutInflater.from(context), z8, R.layout.abc_popup_menu_item_layout);
        this.f20873u = i7;
        Resources resources = context.getResources();
        this.f20872f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f20878z = view;
        this.f20874v = new C1770y0(context, null, i7);
        menuC1678l.b(this, context);
    }

    @Override // n.InterfaceC1690x
    public final void a(MenuC1678l menuC1678l, boolean z8) {
        if (menuC1678l != this.f20869c) {
            return;
        }
        dismiss();
        InterfaceC1689w interfaceC1689w = this.f20861B;
        if (interfaceC1689w != null) {
            interfaceC1689w.a(menuC1678l, z8);
        }
    }

    @Override // n.InterfaceC1664B
    public final boolean b() {
        return !this.f20863D && this.f20874v.f21637N.isShowing();
    }

    @Override // n.InterfaceC1664B
    public final void c() {
        View view;
        if (b()) {
            return;
        }
        if (this.f20863D || (view = this.f20878z) == null) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
        this.f20860A = view;
        D0 d02 = this.f20874v;
        d02.f21637N.setOnDismissListener(this);
        d02.f21628D = this;
        d02.f21636M = true;
        d02.f21637N.setFocusable(true);
        View view2 = this.f20860A;
        boolean z8 = this.f20862C == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f20862C = viewTreeObserver;
        if (z8) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f20875w);
        }
        view2.addOnAttachStateChangeListener(this.f20876x);
        d02.f21627C = view2;
        d02.f21649z = this.f20866G;
        boolean z10 = this.f20864E;
        Context context = this.f20868b;
        C1675i c1675i = this.f20870d;
        if (!z10) {
            this.f20865F = AbstractC1686t.m(c1675i, context, this.f20872f);
            this.f20864E = true;
        }
        d02.r(this.f20865F);
        d02.f21637N.setInputMethodMode(2);
        Rect rect = this.f21007a;
        d02.L = rect != null ? new Rect(rect) : null;
        d02.c();
        C1747m0 c1747m0 = d02.f21640c;
        c1747m0.setOnKeyListener(this);
        if (this.f20867H) {
            MenuC1678l menuC1678l = this.f20869c;
            if (menuC1678l.f20943A != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) c1747m0, false);
                TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                if (textView != null) {
                    textView.setText(menuC1678l.f20943A);
                }
                frameLayout.setEnabled(false);
                c1747m0.addHeaderView(frameLayout, null, false);
            }
        }
        d02.p(c1675i);
        d02.c();
    }

    @Override // n.InterfaceC1690x
    public final void d() {
        this.f20864E = false;
        C1675i c1675i = this.f20870d;
        if (c1675i != null) {
            c1675i.notifyDataSetChanged();
        }
    }

    @Override // n.InterfaceC1664B
    public final void dismiss() {
        if (b()) {
            this.f20874v.dismiss();
        }
    }

    @Override // n.InterfaceC1664B
    public final C1747m0 e() {
        return this.f20874v.f21640c;
    }

    @Override // n.InterfaceC1690x
    public final boolean h(SubMenuC1666D subMenuC1666D) {
        if (subMenuC1666D.hasVisibleItems()) {
            View view = this.f20860A;
            C1688v c1688v = new C1688v(this.f20873u, this.f20868b, view, subMenuC1666D, this.f20871e);
            InterfaceC1689w interfaceC1689w = this.f20861B;
            c1688v.f21015h = interfaceC1689w;
            AbstractC1686t abstractC1686t = c1688v.f21016i;
            if (abstractC1686t != null) {
                abstractC1686t.j(interfaceC1689w);
            }
            boolean u3 = AbstractC1686t.u(subMenuC1666D);
            c1688v.g = u3;
            AbstractC1686t abstractC1686t2 = c1688v.f21016i;
            if (abstractC1686t2 != null) {
                abstractC1686t2.o(u3);
            }
            c1688v.j = this.f20877y;
            this.f20877y = null;
            this.f20869c.c(false);
            D0 d02 = this.f20874v;
            int i7 = d02.f21643f;
            int m10 = d02.m();
            if ((Gravity.getAbsoluteGravity(this.f20866G, this.f20878z.getLayoutDirection()) & 7) == 5) {
                i7 += this.f20878z.getWidth();
            }
            if (!c1688v.b()) {
                if (c1688v.f21013e != null) {
                    c1688v.d(i7, m10, true, true);
                }
            }
            InterfaceC1689w interfaceC1689w2 = this.f20861B;
            if (interfaceC1689w2 != null) {
                interfaceC1689w2.j(subMenuC1666D);
            }
            return true;
        }
        return false;
    }

    @Override // n.InterfaceC1690x
    public final boolean i() {
        return false;
    }

    @Override // n.InterfaceC1690x
    public final void j(InterfaceC1689w interfaceC1689w) {
        this.f20861B = interfaceC1689w;
    }

    @Override // n.AbstractC1686t
    public final void l(MenuC1678l menuC1678l) {
    }

    @Override // n.AbstractC1686t
    public final void n(View view) {
        this.f20878z = view;
    }

    @Override // n.AbstractC1686t
    public final void o(boolean z8) {
        this.f20870d.f20938c = z8;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f20863D = true;
        this.f20869c.c(true);
        ViewTreeObserver viewTreeObserver = this.f20862C;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f20862C = this.f20860A.getViewTreeObserver();
            }
            this.f20862C.removeGlobalOnLayoutListener(this.f20875w);
            this.f20862C = null;
        }
        this.f20860A.removeOnAttachStateChangeListener(this.f20876x);
        C1687u c1687u = this.f20877y;
        if (c1687u != null) {
            c1687u.onDismiss();
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
        this.f20866G = i7;
    }

    @Override // n.AbstractC1686t
    public final void q(int i7) {
        this.f20874v.f21643f = i7;
    }

    @Override // n.AbstractC1686t
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.f20877y = (C1687u) onDismissListener;
    }

    @Override // n.AbstractC1686t
    public final void s(boolean z8) {
        this.f20867H = z8;
    }

    @Override // n.AbstractC1686t
    public final void t(int i7) {
        this.f20874v.i(i7);
    }
}
