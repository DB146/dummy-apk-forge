package o;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import m.InterfaceC1520b;
import n.C1680n;
import n.C1682p;
import n.InterfaceC1690x;
import n.MenuC1678l;
import n.SubMenuC1666D;

/* loaded from: classes.dex */
public final class P0 implements InterfaceC1690x {

    /* renamed from: a, reason: collision with root package name */
    public MenuC1678l f21416a;

    /* renamed from: b, reason: collision with root package name */
    public C1680n f21417b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Toolbar f21418c;

    public P0(Toolbar toolbar) {
        this.f21418c = toolbar;
    }

    @Override // n.InterfaceC1690x
    public final void a(MenuC1678l menuC1678l, boolean z8) {
    }

    @Override // n.InterfaceC1690x
    public final void d() {
        if (this.f21417b != null) {
            MenuC1678l menuC1678l = this.f21416a;
            if (menuC1678l != null) {
                int size = menuC1678l.f20959f.size();
                for (int i7 = 0; i7 < size; i7++) {
                    if (this.f21416a.getItem(i7) == this.f21417b) {
                        return;
                    }
                }
            }
            k(this.f21417b);
        }
    }

    @Override // n.InterfaceC1690x
    public final boolean f(C1680n c1680n) {
        Toolbar toolbar = this.f21418c;
        toolbar.c();
        ViewParent parent = toolbar.f13094v.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.f13094v);
            }
            toolbar.addView(toolbar.f13094v);
        }
        View actionView = c1680n.getActionView();
        toolbar.f13095w = actionView;
        this.f21417b = c1680n;
        ViewParent parent2 = actionView.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.f13095w);
            }
            Q0 h10 = Toolbar.h();
            h10.f21419a = (toolbar.f13058B & 112) | 8388611;
            h10.f21420b = 2;
            toolbar.f13095w.setLayoutParams(h10);
            toolbar.addView(toolbar.f13095w);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (((Q0) childAt.getLayoutParams()).f21420b != 2 && childAt != toolbar.f13079a) {
                toolbar.removeViewAt(childCount);
                toolbar.f13074S.add(childAt);
            }
        }
        toolbar.requestLayout();
        c1680n.f20984Q = true;
        c1680n.f20970B.p(false);
        KeyEvent.Callback callback = toolbar.f13095w;
        if (callback instanceof InterfaceC1520b) {
            ((C1682p) ((InterfaceC1520b) callback)).f21000a.onActionViewExpanded();
        }
        toolbar.u();
        return true;
    }

    @Override // n.InterfaceC1690x
    public final void g(Context context, MenuC1678l menuC1678l) {
        C1680n c1680n;
        MenuC1678l menuC1678l2 = this.f21416a;
        if (menuC1678l2 != null && (c1680n = this.f21417b) != null) {
            menuC1678l2.d(c1680n);
        }
        this.f21416a = menuC1678l;
    }

    @Override // n.InterfaceC1690x
    public final boolean h(SubMenuC1666D subMenuC1666D) {
        return false;
    }

    @Override // n.InterfaceC1690x
    public final boolean i() {
        return false;
    }

    @Override // n.InterfaceC1690x
    public final boolean k(C1680n c1680n) {
        Toolbar toolbar = this.f21418c;
        KeyEvent.Callback callback = toolbar.f13095w;
        if (callback instanceof InterfaceC1520b) {
            ((C1682p) ((InterfaceC1520b) callback)).f21000a.onActionViewCollapsed();
        }
        toolbar.removeView(toolbar.f13095w);
        toolbar.removeView(toolbar.f13094v);
        toolbar.f13095w = null;
        ArrayList arrayList = toolbar.f13074S;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.f21417b = null;
        toolbar.requestLayout();
        c1680n.f20984Q = false;
        c1680n.f20970B.p(false);
        toolbar.u();
        return true;
    }
}
