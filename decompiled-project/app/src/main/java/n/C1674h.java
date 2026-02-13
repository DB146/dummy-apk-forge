package n;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ExpandedMenuView;
import i.C1282b;
import i.C1285e;
import i.DialogInterfaceC1286f;

/* renamed from: n.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1674h implements InterfaceC1690x, AdapterView.OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public Context f20930a;

    /* renamed from: b, reason: collision with root package name */
    public LayoutInflater f20931b;

    /* renamed from: c, reason: collision with root package name */
    public MenuC1678l f20932c;

    /* renamed from: d, reason: collision with root package name */
    public ExpandedMenuView f20933d;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC1689w f20934e;

    /* renamed from: f, reason: collision with root package name */
    public C1673g f20935f;

    public C1674h(Context context) {
        this.f20930a = context;
        this.f20931b = LayoutInflater.from(context);
    }

    @Override // n.InterfaceC1690x
    public final void a(MenuC1678l menuC1678l, boolean z8) {
        InterfaceC1689w interfaceC1689w = this.f20934e;
        if (interfaceC1689w != null) {
            interfaceC1689w.a(menuC1678l, z8);
        }
    }

    @Override // n.InterfaceC1690x
    public final void d() {
        C1673g c1673g = this.f20935f;
        if (c1673g != null) {
            c1673g.notifyDataSetChanged();
        }
    }

    @Override // n.InterfaceC1690x
    public final boolean f(C1680n c1680n) {
        return false;
    }

    @Override // n.InterfaceC1690x
    public final void g(Context context, MenuC1678l menuC1678l) {
        if (this.f20930a != null) {
            this.f20930a = context;
            if (this.f20931b == null) {
                this.f20931b = LayoutInflater.from(context);
            }
        }
        this.f20932c = menuC1678l;
        C1673g c1673g = this.f20935f;
        if (c1673g != null) {
            c1673g.notifyDataSetChanged();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.content.DialogInterface$OnClickListener, n.w, java.lang.Object, n.m, android.content.DialogInterface$OnDismissListener] */
    @Override // n.InterfaceC1690x
    public final boolean h(SubMenuC1666D subMenuC1666D) {
        if (!subMenuC1666D.hasVisibleItems()) {
            return false;
        }
        ?? obj = new Object();
        obj.f20966a = subMenuC1666D;
        Context context = subMenuC1666D.f20954a;
        C1285e c1285e = new C1285e(context);
        C1674h c1674h = new C1674h(c1285e.getContext());
        obj.f20968c = c1674h;
        c1674h.f20934e = obj;
        subMenuC1666D.b(c1674h, context);
        C1674h c1674h2 = obj.f20968c;
        if (c1674h2.f20935f == null) {
            c1674h2.f20935f = new C1673g(c1674h2);
        }
        C1673g c1673g = c1674h2.f20935f;
        C1282b c1282b = c1285e.f18068a;
        c1282b.f18034l = c1673g;
        c1282b.f18035m = obj;
        View view = subMenuC1666D.f20945C;
        if (view != null) {
            c1282b.f18030e = view;
        } else {
            c1282b.f18028c = subMenuC1666D.f20944B;
            c1285e.setTitle(subMenuC1666D.f20943A);
        }
        c1282b.k = obj;
        DialogInterfaceC1286f create = c1285e.create();
        obj.f20967b = create;
        create.setOnDismissListener(obj);
        WindowManager.LayoutParams attributes = obj.f20967b.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        obj.f20967b.show();
        InterfaceC1689w interfaceC1689w = this.f20934e;
        if (interfaceC1689w == null) {
            return true;
        }
        interfaceC1689w.j(subMenuC1666D);
        return true;
    }

    @Override // n.InterfaceC1690x
    public final boolean i() {
        return false;
    }

    @Override // n.InterfaceC1690x
    public final void j(InterfaceC1689w interfaceC1689w) {
        throw null;
    }

    @Override // n.InterfaceC1690x
    public final boolean k(C1680n c1680n) {
        return false;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i7, long j) {
        this.f20932c.q(this.f20935f.getItem(i7), this, 0);
    }
}
