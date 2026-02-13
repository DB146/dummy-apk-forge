package i2;

import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.kt.apps.media.xemtv.beta.R;

/* renamed from: i2.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1325m extends AbstractC1309Q {

    /* renamed from: e, reason: collision with root package name */
    public final C1320h f18284e;

    /* renamed from: f, reason: collision with root package name */
    public final C1320h f18285f;
    public boolean g;

    static {
        new Handler();
    }

    public C1325m(C1320h c1320h) {
        C1320h c1320h2 = new C1320h(0);
        this.f18226b = null;
        this.f18227c = false;
        this.f18284e = c1320h;
        this.f18285f = c1320h2;
    }

    @Override // i2.AbstractC1309Q
    public final C1324l g(ViewGroup viewGroup) {
        new C1324l(this, LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.lb_fullwidth_details_overview, viewGroup, false));
        throw null;
    }

    @Override // i2.AbstractC1309Q
    public final void k(C1324l c1324l, Object obj) {
        c1324l.f18274c = obj;
        c1324l.f18273b = obj instanceof AbstractC1304L ? (AbstractC1304L) obj : null;
        C1321i c1321i = (C1321i) obj;
        this.f18285f.b(null, c1321i);
        this.f18284e.b(null, c1321i.f18264b);
        Q7.h hVar = ((C1321i) c1324l.f18273b).f18266d;
        throw null;
    }

    @Override // i2.AbstractC1309Q
    public final void l(C1324l c1324l) {
        super.l(c1324l);
        this.f18284e.e(null);
        this.f18285f.getClass();
    }

    @Override // i2.AbstractC1309Q
    public final void m(C1324l c1324l) {
        super.m(c1324l);
        this.f18284e.f(null);
        this.f18285f.f(null);
        throw null;
    }

    @Override // i2.AbstractC1309Q
    public final void p(C1324l c1324l) {
        super.p(c1324l);
        if (this.f18227c) {
            ((ColorDrawable) c1324l.f18280w.getForeground().mutate()).setColor(c1324l.f18279v.f16488c.getColor());
        }
    }

    @Override // i2.AbstractC1309Q
    public final void q(C1324l c1324l) {
        c1324l.getClass();
        throw null;
    }

    @Override // i2.AbstractC1309Q
    public final void r(C1324l c1324l, boolean z8) {
        c1324l.getClass();
        if (this.g) {
            ((View) c1324l.f3094a).setVisibility(z8 ? 0 : 4);
        }
    }

    public final void u(C1324l c1324l, int i7, boolean z8) {
        int dimensionPixelSize;
        int i10;
        boolean z10 = i7 == 2;
        boolean z11 = c1324l.f18282y == 2;
        if (z10 != z11 || z8) {
            Resources resources = ((View) c1324l.f3094a).getResources();
            C1321i c1321i = (C1321i) c1324l.f18273b;
            this.f18285f.getClass();
            if (c1321i != null && c1321i.f18265c != null) {
                throw null;
            }
            if (z11) {
                i10 = resources.getDimensionPixelSize(R.dimen.lb_details_v2_logo_margin_start);
                dimensionPixelSize = 0;
            } else {
                dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.lb_details_v2_logo_margin_start);
                i10 = 0;
            }
            FrameLayout frameLayout = c1324l.f18280w;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) frameLayout.getLayoutParams();
            marginLayoutParams.topMargin = z11 ? 0 : resources.getDimensionPixelSize(R.dimen.lb_details_v2_blank_height);
            marginLayoutParams.rightMargin = i10;
            marginLayoutParams.leftMargin = i10;
            frameLayout.setLayoutParams(marginLayoutParams);
            ViewGroup viewGroup = c1324l.f18281x;
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) viewGroup.getLayoutParams();
            marginLayoutParams2.setMarginStart(dimensionPixelSize);
            viewGroup.setLayoutParams(marginLayoutParams2);
            throw null;
        }
    }
}
