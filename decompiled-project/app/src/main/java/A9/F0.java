package A9;

import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.kt.apps.core.base.leanback.HorizontalGridView;
import com.kt.apps.media.xemtv.beta.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class F0 extends AbstractC0156x2 {
    public static final Handler k = new Handler();

    /* renamed from: e, reason: collision with root package name */
    public final C0107l0 f818e;

    /* renamed from: f, reason: collision with root package name */
    public final C0107l0 f819f;
    public int g;

    /* renamed from: h, reason: collision with root package name */
    public int f820h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f821i;
    public boolean j;

    public F0(C0107l0 c0107l0) {
        C0107l0 c0107l02 = new C0107l0(0);
        this.g = 0;
        this.f820h = 0;
        this.f1470b = null;
        this.f1471c = false;
        this.f818e = c0107l0;
        this.f819f = c0107l02;
    }

    @Override // A9.AbstractC0156x2
    public final C0152w2 i(ViewGroup viewGroup) {
        E0 e02 = new E0(this, LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.lb_fullwidth_details_overview, viewGroup, false), this.f818e, this.f819f);
        e02.f809t.getClass();
        y(e02, 0);
        e02.f811v = new B0(this, e02, 0);
        boolean z8 = this.f821i;
        FrameLayout frameLayout = e02.f805p;
        if (z8) {
            frameLayout.setBackgroundColor(this.g);
        }
        if (this.j) {
            frameLayout.findViewById(R.id.details_overview_actions_background).setBackgroundColor(this.f820h);
        }
        Y6.b.w(frameLayout, frameLayout.getResources().getDimensionPixelSize(R.dimen.lb_rounded_rect_corner_radius));
        if (!this.f1471c) {
            frameLayout.setForeground(null);
        }
        e02.f807r.setOnUnhandledKeyListener(new C0162z0(e02));
        return e02;
    }

    @Override // A9.AbstractC0156x2
    public final void o(C0152w2 c0152w2, Object obj) {
        super.o(c0152w2, obj);
        C0111m0 c0111m0 = (C0111m0) obj;
        E0 e02 = (E0) c0152w2;
        this.f819f.c(e02.f809t, c0111m0);
        this.f818e.c(e02.f808s, c0111m0.f1279b);
        C0111m0 c0111m02 = (C0111m0) e02.f1460d;
        e02.f811v.s(c0111m02.f1281d);
        e02.f807r.setAdapter(e02.f811v);
        e02.f810u = e02.f811v.a();
        ArrayList arrayList = c0111m02.f1280c;
        D0 d02 = e02.f804o;
        if (arrayList == null) {
            c0111m02.f1280c = new ArrayList();
        } else {
            int i7 = 0;
            while (i7 < c0111m02.f1280c.size()) {
                D0 d03 = (D0) ((WeakReference) c0111m02.f1280c.get(i7)).get();
                if (d03 == null) {
                    c0111m02.f1280c.remove(i7);
                } else if (d03 == d02) {
                    return;
                } else {
                    i7++;
                }
            }
        }
        c0111m02.f1280c.add(new WeakReference(d02));
    }

    @Override // A9.AbstractC0156x2
    public final void p(C0152w2 c0152w2) {
        super.p(c0152w2);
        this.f818e.getClass();
        this.f819f.getClass();
    }

    @Override // A9.AbstractC0156x2
    public final void q(C0152w2 c0152w2) {
        super.q(c0152w2);
        E0 e02 = (E0) c0152w2;
        this.f818e.g(e02.f808s);
        this.f819f.g(e02.f809t);
    }

    @Override // A9.AbstractC0156x2
    public final void t(C0152w2 c0152w2) {
        super.t(c0152w2);
        if (this.f1471c) {
            E0 e02 = (E0) c0152w2;
            ((ColorDrawable) e02.f805p.getForeground().mutate()).setColor(e02.k.f16488c.getColor());
        }
    }

    @Override // A9.AbstractC0156x2
    public final void u(C0152w2 c0152w2) {
        E0 e02 = (E0) c0152w2;
        e02.f811v.s(null);
        e02.f807r.setAdapter(null);
        int i7 = 0;
        e02.f810u = 0;
        C0111m0 c0111m0 = (C0111m0) e02.f1460d;
        if (c0111m0.f1280c != null) {
            while (true) {
                if (i7 >= c0111m0.f1280c.size()) {
                    break;
                }
                D0 d02 = (D0) ((WeakReference) c0111m0.f1280c.get(i7)).get();
                if (d02 == null) {
                    c0111m0.f1280c.remove(i7);
                } else {
                    if (d02 == e02.f804o) {
                        c0111m0.f1280c.remove(i7);
                        break;
                    }
                    i7++;
                }
            }
        }
        k.removeCallbacks(e02.f813x);
        this.f818e.e(e02.f808s);
        this.f819f.getClass();
        super.u(c0152w2);
    }

    public final void y(E0 e02, int i7) {
        int dimensionPixelSize;
        int i10;
        int i11 = e02.f812w;
        if (i11 != i7) {
            e02.f812w = i7;
            boolean z8 = i11 == 2;
            boolean z10 = i7 == 2;
            if (z8 != z10) {
                Resources resources = e02.f1271a.getResources();
                this.f819f.getClass();
                if (z10) {
                    i10 = resources.getDimensionPixelSize(R.dimen.lb_details_v2_logo_margin_start);
                    dimensionPixelSize = 0;
                } else {
                    dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.lb_details_v2_logo_margin_start);
                    i10 = 0;
                }
                FrameLayout frameLayout = e02.f805p;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) frameLayout.getLayoutParams();
                marginLayoutParams.topMargin = z10 ? 0 : resources.getDimensionPixelSize(R.dimen.lb_details_v2_blank_height);
                marginLayoutParams.rightMargin = i10;
                marginLayoutParams.leftMargin = i10;
                frameLayout.setLayoutParams(marginLayoutParams);
                ViewGroup viewGroup = e02.f806q;
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) viewGroup.getLayoutParams();
                marginLayoutParams2.setMarginStart(dimensionPixelSize);
                viewGroup.setLayoutParams(marginLayoutParams2);
                HorizontalGridView horizontalGridView = e02.f807r;
                ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) horizontalGridView.getLayoutParams();
                marginLayoutParams3.setMarginStart(dimensionPixelSize);
                marginLayoutParams3.height = z10 ? 0 : resources.getDimensionPixelSize(R.dimen.lb_details_v2_actions_height);
                horizontalGridView.setLayoutParams(marginLayoutParams3);
            }
            View view = e02.f809t.f1271a;
            ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            marginLayoutParams4.setMarginStart(view.getResources().getDimensionPixelSize(R.dimen.lb_details_v2_logo_margin_start));
            int i12 = e02.f812w;
            if (i12 == 0) {
                marginLayoutParams4.topMargin = view.getResources().getDimensionPixelSize(R.dimen.lb_details_v2_description_margin_top) + view.getResources().getDimensionPixelSize(R.dimen.lb_details_v2_actions_height) + view.getResources().getDimensionPixelSize(R.dimen.lb_details_v2_blank_height);
            } else if (i12 != 2) {
                marginLayoutParams4.topMargin = view.getResources().getDimensionPixelSize(R.dimen.lb_details_v2_blank_height) - (marginLayoutParams4.height / 2);
            } else {
                marginLayoutParams4.topMargin = 0;
            }
            view.setLayoutParams(marginLayoutParams4);
        }
    }
}
