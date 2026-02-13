package n;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import com.kt.apps.media.xemtv.beta.R;

/* renamed from: n.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1688v {

    /* renamed from: a, reason: collision with root package name */
    public final Context f21009a;

    /* renamed from: b, reason: collision with root package name */
    public final MenuC1678l f21010b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f21011c;

    /* renamed from: d, reason: collision with root package name */
    public final int f21012d;

    /* renamed from: e, reason: collision with root package name */
    public View f21013e;
    public boolean g;

    /* renamed from: h, reason: collision with root package name */
    public InterfaceC1689w f21015h;

    /* renamed from: i, reason: collision with root package name */
    public AbstractC1686t f21016i;
    public C1687u j;

    /* renamed from: f, reason: collision with root package name */
    public int f21014f = 8388611;
    public final C1687u k = new C1687u(this);

    public C1688v(int i7, Context context, View view, MenuC1678l menuC1678l, boolean z8) {
        this.f21009a = context;
        this.f21010b = menuC1678l;
        this.f21013e = view;
        this.f21011c = z8;
        this.f21012d = i7;
    }

    public final AbstractC1686t a() {
        AbstractC1686t viewOnKeyListenerC1665C;
        if (this.f21016i == null) {
            Context context = this.f21009a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width)) {
                viewOnKeyListenerC1665C = new ViewOnKeyListenerC1672f(context, this.f21013e, this.f21012d, this.f21011c);
            } else {
                View view = this.f21013e;
                Context context2 = this.f21009a;
                boolean z8 = this.f21011c;
                viewOnKeyListenerC1665C = new ViewOnKeyListenerC1665C(this.f21012d, context2, view, this.f21010b, z8);
            }
            viewOnKeyListenerC1665C.l(this.f21010b);
            viewOnKeyListenerC1665C.r(this.k);
            viewOnKeyListenerC1665C.n(this.f21013e);
            viewOnKeyListenerC1665C.j(this.f21015h);
            viewOnKeyListenerC1665C.o(this.g);
            viewOnKeyListenerC1665C.p(this.f21014f);
            this.f21016i = viewOnKeyListenerC1665C;
        }
        return this.f21016i;
    }

    public final boolean b() {
        AbstractC1686t abstractC1686t = this.f21016i;
        return abstractC1686t != null && abstractC1686t.b();
    }

    public void c() {
        this.f21016i = null;
        C1687u c1687u = this.j;
        if (c1687u != null) {
            c1687u.onDismiss();
        }
    }

    public final void d(int i7, int i10, boolean z8, boolean z10) {
        AbstractC1686t a9 = a();
        a9.s(z10);
        if (z8) {
            if ((Gravity.getAbsoluteGravity(this.f21014f, this.f21013e.getLayoutDirection()) & 7) == 5) {
                i7 -= this.f21013e.getWidth();
            }
            a9.q(i7);
            a9.t(i10);
            int i11 = (int) ((this.f21009a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            a9.f21007a = new Rect(i7 - i11, i10 - i11, i7 + i11, i10 + i11);
        }
        a9.c();
    }
}
