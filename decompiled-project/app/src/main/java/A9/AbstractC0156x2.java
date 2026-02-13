package A9;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.kt.apps.media.xemtv.beta.R;
import d2.C1042b;

/* renamed from: A9.x2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0156x2 extends AbstractC0113m2 {

    /* renamed from: b, reason: collision with root package name */
    public C0144u2 f1470b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1471c;

    /* renamed from: d, reason: collision with root package name */
    public final int f1472d;

    public AbstractC0156x2() {
        C0144u2 c0144u2 = new C0144u2();
        this.f1470b = c0144u2;
        this.f1471c = true;
        this.f1472d = 1;
        c0144u2.f1411d = true;
    }

    public static C0152w2 l(C0109l2 c0109l2) {
        return c0109l2 instanceof C0148v2 ? ((C0148v2) c0109l2).f1439b : (C0152w2) c0109l2;
    }

    @Override // A9.AbstractC0113m2
    public final void c(C0109l2 c0109l2, Object obj) {
        o(l(c0109l2), obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [android.widget.LinearLayout, android.view.View, A9.s2, android.view.ViewGroup] */
    @Override // A9.AbstractC0113m2
    public final C0109l2 d(ViewGroup viewGroup) {
        C0109l2 c0148v2;
        C0152w2 i7 = i(viewGroup);
        i7.f1464i = false;
        if (this.f1470b != null || (n() && this.f1471c)) {
            Context context = viewGroup.getContext();
            ?? linearLayout = new LinearLayout(context, null, 0);
            linearLayout.f1368c = true;
            linearLayout.setOrientation(1);
            LayoutInflater.from(context).inflate(R.layout.lb_row_container, (ViewGroup) linearLayout);
            linearLayout.f1366a = (ViewGroup) linearLayout.findViewById(R.id.lb_row_container_header_dock);
            linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
            C0144u2 c0144u2 = this.f1470b;
            if (c0144u2 != null) {
                i7.f1459c = (C0140t2) c0144u2.d((ViewGroup) i7.f1271a);
            }
            c0148v2 = new C0148v2(linearLayout, i7);
        } else {
            c0148v2 = i7;
        }
        m(i7);
        if (i7.f1464i) {
            return c0148v2;
        }
        throw new RuntimeException("super.initializeRowViewHolder() must be called");
    }

    @Override // A9.AbstractC0113m2
    public final void e(C0109l2 c0109l2) {
        u(l(c0109l2));
    }

    @Override // A9.AbstractC0113m2
    public final void f(C0109l2 c0109l2) {
        p(l(c0109l2));
    }

    @Override // A9.AbstractC0113m2
    public final void g(C0109l2 c0109l2) {
        q(l(c0109l2));
    }

    public abstract C0152w2 i(ViewGroup viewGroup);

    public void j(C0152w2 c0152w2, boolean z8) {
        InterfaceC0153x interfaceC0153x;
        if (!z8 || (interfaceC0153x = c0152w2.f1466m) == null) {
            return;
        }
        interfaceC0153x.a(null, null, c0152w2, c0152w2.f1461e);
    }

    public void k(C0152w2 c0152w2, boolean z8) {
    }

    public void m(C0152w2 c0152w2) {
        c0152w2.f1464i = true;
        if (this instanceof F0) {
            return;
        }
        View view = c0152w2.f1271a;
        if (view instanceof ViewGroup) {
            ((ViewGroup) view).setClipChildren(false);
        }
        C0148v2 c0148v2 = c0152w2.f1458b;
        if (c0148v2 != null) {
            ((ViewGroup) c0148v2.f1271a).setClipChildren(false);
        }
    }

    public boolean n() {
        return !(this instanceof F0);
    }

    public void o(C0152w2 c0152w2, Object obj) {
        c0152w2.f1461e = obj;
        AbstractC0132r2 abstractC0132r2 = obj instanceof AbstractC0132r2 ? (AbstractC0132r2) obj : null;
        c0152w2.f1460d = abstractC0132r2;
        C0140t2 c0140t2 = c0152w2.f1459c;
        if (c0140t2 == null || abstractC0132r2 == null) {
            return;
        }
        this.f1470b.c(c0140t2, obj);
    }

    public void p(C0152w2 c0152w2) {
        if (c0152w2.f1459c != null) {
            this.f1470b.getClass();
        }
    }

    public void q(C0152w2 c0152w2) {
        C0140t2 c0140t2 = c0152w2.f1459c;
        if (c0140t2 != null) {
            this.f1470b.g(c0140t2);
        }
        AbstractC0113m2.a(c0152w2.f1271a);
    }

    public void r(C0152w2 c0152w2, boolean z8) {
        x(c0152w2);
        w(c0152w2, c0152w2.f1271a);
    }

    public void s(C0152w2 c0152w2, boolean z8) {
        j(c0152w2, z8);
        x(c0152w2);
        w(c0152w2, c0152w2.f1271a);
    }

    public void t(C0152w2 c0152w2) {
        if (this.f1471c) {
            float f4 = c0152w2.j;
            C1042b c1042b = c0152w2.k;
            c1042b.b(f4);
            C0140t2 c0140t2 = c0152w2.f1459c;
            if (c0140t2 != null) {
                this.f1470b.i(c0140t2, c0152w2.j);
            }
            if (n()) {
                C0136s2 c0136s2 = (C0136s2) c0152w2.f1458b.f1271a;
                int color = c1042b.f16488c.getColor();
                Drawable drawable = c0136s2.f1367b;
                if (!(drawable instanceof ColorDrawable)) {
                    c0136s2.setForeground(new ColorDrawable(color));
                } else {
                    ((ColorDrawable) drawable.mutate()).setColor(color);
                    c0136s2.invalidate();
                }
            }
        }
    }

    public void u(C0152w2 c0152w2) {
        C0140t2 c0140t2 = c0152w2.f1459c;
        if (c0140t2 != null) {
            this.f1470b.e(c0140t2);
        }
        c0152w2.f1460d = null;
        c0152w2.f1461e = null;
    }

    public void v(C0152w2 c0152w2, boolean z8) {
        C0140t2 c0140t2 = c0152w2.f1459c;
        if (c0140t2 == null || c0140t2.f1271a.getVisibility() == 8) {
            return;
        }
        c0152w2.f1459c.f1271a.setVisibility(z8 ? 0 : 4);
    }

    public final void w(C0152w2 c0152w2, View view) {
        int i7 = this.f1472d;
        if (i7 == 1) {
            c0152w2.f1462f = c0152w2.f1463h ? 1 : 2;
        } else if (i7 == 2) {
            c0152w2.f1462f = c0152w2.g ? 1 : 2;
        } else if (i7 == 3) {
            c0152w2.f1462f = (c0152w2.f1463h && c0152w2.g) ? 1 : 2;
        }
        int i10 = c0152w2.f1462f;
        if (i10 == 1) {
            view.setActivated(true);
        } else if (i10 == 2) {
            view.setActivated(false);
        }
    }

    public final void x(C0152w2 c0152w2) {
        if (this.f1470b == null || c0152w2.f1459c == null) {
            return;
        }
        C0136s2 c0136s2 = (C0136s2) c0152w2.f1458b.f1271a;
        boolean z8 = c0152w2.f1463h;
        c0136s2.getClass();
        c0136s2.f1366a.setVisibility(z8 ? 0 : 8);
    }
}
