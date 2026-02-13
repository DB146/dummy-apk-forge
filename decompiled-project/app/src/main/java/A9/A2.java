package A9;

import android.animation.TimeAnimator;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import com.kt.apps.core.base.leanback.VerticalGridView;
import com.kt.apps.media.xemtv.beta.R;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public class A2 extends W1.C implements S {

    /* renamed from: B0, reason: collision with root package name */
    public boolean f742B0;
    public InterfaceC0153x C0;

    /* renamed from: D0, reason: collision with root package name */
    public InterfaceC0149w f743D0;

    /* renamed from: E0, reason: collision with root package name */
    public int f744E0;

    /* renamed from: G0, reason: collision with root package name */
    public H2.X f746G0;

    /* renamed from: H0, reason: collision with root package name */
    public ArrayList f747H0;

    /* renamed from: I0, reason: collision with root package name */
    public Q5.e f748I0;

    /* renamed from: m0, reason: collision with root package name */
    public J1 f750m0;

    /* renamed from: n0, reason: collision with root package name */
    public VerticalGridView f751n0;

    /* renamed from: q0, reason: collision with root package name */
    public boolean f754q0;

    /* renamed from: t0, reason: collision with root package name */
    public C0160y2 f757t0;

    /* renamed from: u0, reason: collision with root package name */
    public T f758u0;

    /* renamed from: v0, reason: collision with root package name */
    public C0131r1 f759v0;

    /* renamed from: w0, reason: collision with root package name */
    public int f760w0;

    /* renamed from: y0, reason: collision with root package name */
    public boolean f762y0;

    /* renamed from: o0, reason: collision with root package name */
    public final C0135s1 f752o0 = new C0135s1();

    /* renamed from: p0, reason: collision with root package name */
    public int f753p0 = -1;

    /* renamed from: r0, reason: collision with root package name */
    public final C0161z f755r0 = new C0161z(0, this);

    /* renamed from: s0, reason: collision with root package name */
    public final C0157y f756s0 = new C0157y(this);

    /* renamed from: x0, reason: collision with root package name */
    public boolean f761x0 = true;

    /* renamed from: z0, reason: collision with root package name */
    public int f763z0 = Integer.MIN_VALUE;

    /* renamed from: A0, reason: collision with root package name */
    public boolean f741A0 = true;

    /* renamed from: F0, reason: collision with root package name */
    public final DecelerateInterpolator f745F0 = new DecelerateInterpolator(2.0f);

    /* renamed from: J0, reason: collision with root package name */
    public final C0134s0 f749J0 = new C0134s0(2, this);

    public static void z0(C0131r1 c0131r1, boolean z8, boolean z10) {
        C0164z2 c0164z2 = c0131r1.f1357x;
        TimeAnimator timeAnimator = c0164z2.f1492c;
        timeAnimator.end();
        float f4 = z8 ? 1.0f : 0.0f;
        C0109l2 c0109l2 = c0164z2.f1491b;
        AbstractC0156x2 abstractC0156x2 = c0164z2.f1490a;
        if (z10) {
            abstractC0156x2.getClass();
            C0152w2 l10 = AbstractC0156x2.l(c0109l2);
            l10.j = f4;
            abstractC0156x2.t(l10);
        } else {
            abstractC0156x2.getClass();
            if (AbstractC0156x2.l(c0109l2).j != f4) {
                A2 a22 = c0164z2.f1496h;
                c0164z2.f1493d = a22.f744E0;
                c0164z2.f1494e = a22.f745F0;
                float f10 = AbstractC0156x2.l(c0109l2).j;
                c0164z2.f1495f = f10;
                c0164z2.g = f4 - f10;
                timeAnimator.start();
            }
        }
        AbstractC0156x2 abstractC0156x22 = (AbstractC0156x2) c0131r1.f1354u;
        abstractC0156x22.getClass();
        C0152w2 l11 = AbstractC0156x2.l(c0131r1.f1355v);
        l11.g = z8;
        abstractC0156x22.s(l11, z8);
    }

    public final void A0(int i7, boolean z8) {
        if (this.f753p0 == i7) {
            return;
        }
        this.f753p0 = i7;
        VerticalGridView verticalGridView = this.f751n0;
        if (verticalGridView == null || this.f755r0.f1486b) {
            return;
        }
        if (z8) {
            verticalGridView.setSelectedPositionSmooth(i7);
        } else {
            verticalGridView.setSelectedPosition(i7);
        }
    }

    @Override // W1.C
    public void S(Bundle bundle) {
        super.S(bundle);
        this.f744E0 = F().getInteger(R.integer.lb_browse_rows_anim_duration);
    }

    @Override // W1.C
    public View T(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(p0(), viewGroup, false);
        this.f751n0 = (VerticalGridView) inflate.findViewById(R.id.container_list);
        if (this.f754q0) {
            this.f754q0 = false;
            s0();
        }
        return inflate;
    }

    @Override // W1.C
    public void V() {
        this.f762y0 = false;
        this.f10275S = true;
        C0161z c0161z = this.f755r0;
        if (c0161z.f1486b) {
            c0161z.f1486b = false;
            ((A2) c0161z.f1487c).f752o0.f4599a.unregisterObserver(c0161z);
        }
        this.f751n0 = null;
    }

    @Override // W1.C
    public void a0(Bundle bundle) {
        bundle.putInt("currentSelectedPosition", this.f753p0);
    }

    @Override // W1.C
    public void d0(View view, Bundle bundle) {
        if (bundle != null) {
            this.f753p0 = bundle.getInt("currentSelectedPosition", -1);
        }
        u0();
        VerticalGridView verticalGridView = this.f751n0;
        if (verticalGridView != null) {
            verticalGridView.setOnChildViewHolderSelectedListener(this.f756s0);
        }
        this.f751n0.setItemAlignmentViewId(R.id.row_content);
        this.f751n0.setSaveChildrenPolicy(2);
        v0(this.f763z0);
        this.f746G0 = null;
        this.f747H0 = null;
        C0160y2 c0160y2 = this.f757t0;
        if (c0160y2 != null) {
            c0160y2.f937c.h();
        }
    }

    @Override // A9.S
    public Q h() {
        if (this.f757t0 == null) {
            this.f757t0 = new C0160y2(this);
        }
        return this.f757t0;
    }

    public final void o0(boolean z8) {
        this.f742B0 = z8;
        VerticalGridView verticalGridView = this.f751n0;
        if (verticalGridView != null) {
            int childCount = verticalGridView.getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                C0131r1 c0131r1 = (C0131r1) verticalGridView.L(verticalGridView.getChildAt(i7));
                AbstractC0156x2 abstractC0156x2 = (AbstractC0156x2) c0131r1.f1354u;
                abstractC0156x2.getClass();
                abstractC0156x2.k(AbstractC0156x2.l(c0131r1.f1355v), z8);
            }
        }
    }

    public int p0() {
        return R.layout.base_lb_rows_fragment;
    }

    public int q0() {
        return this.f753p0;
    }

    public final void r0() {
        VerticalGridView verticalGridView = this.f751n0;
        if (verticalGridView != null) {
            verticalGridView.setLayoutFrozen(false);
            this.f751n0.setAnimateChildLayout(true);
            this.f751n0.setPruneChild(true);
            this.f751n0.setFocusSearchDisabled(false);
            this.f751n0.setScrollEnabled(true);
        }
        o0(false);
    }

    public final boolean s0() {
        VerticalGridView verticalGridView = this.f751n0;
        boolean z8 = false;
        if (verticalGridView != null) {
            verticalGridView.setAnimateChildLayout(false);
            this.f751n0.setScrollEnabled(false);
            z8 = true;
        } else {
            this.f754q0 = true;
        }
        if (z8) {
            o0(true);
        }
        return z8;
    }

    public final void t0(J1 j12) {
        if (this.f750m0 != j12) {
            this.f750m0 = j12;
            C0135s1 c0135s1 = this.f752o0;
            c0135s1.s(j12);
            c0135s1.d();
            if (this.f751n0 != null) {
                u0();
            }
            this.f759v0 = null;
            this.f762y0 = false;
            c0135s1.g = this.f749J0;
        }
    }

    public final void u0() {
        if (this.f750m0 == null) {
            return;
        }
        H2.K adapter = this.f751n0.getAdapter();
        C0135s1 c0135s1 = this.f752o0;
        if (adapter != c0135s1) {
            this.f751n0.setAdapter(c0135s1);
        }
        if (c0135s1.a() == 0 && this.f753p0 >= 0) {
            C0161z c0161z = this.f755r0;
            c0161z.f1486b = true;
            ((A2) c0161z.f1487c).f752o0.f4599a.registerObserver(c0161z);
        } else {
            int i7 = this.f753p0;
            if (i7 >= 0) {
                this.f751n0.setSelectedPosition(i7);
            }
        }
    }

    public final void v0(int i7) {
        if (i7 == Integer.MIN_VALUE) {
            return;
        }
        this.f763z0 = i7;
        VerticalGridView verticalGridView = this.f751n0;
        if (verticalGridView != null) {
            verticalGridView.setItemAlignmentOffset(0);
            verticalGridView.setItemAlignmentOffsetPercent(-1.0f);
            verticalGridView.setItemAlignmentOffsetWithPadding(true);
            verticalGridView.setWindowAlignmentOffset(this.f763z0);
            verticalGridView.setWindowAlignmentOffsetPercent(-1.0f);
            verticalGridView.setWindowAlignment(0);
        }
    }

    public final void w0(boolean z8) {
        this.f741A0 = z8;
        VerticalGridView verticalGridView = this.f751n0;
        if (verticalGridView != null) {
            int childCount = verticalGridView.getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                C0131r1 c0131r1 = (C0131r1) verticalGridView.L(verticalGridView.getChildAt(i7));
                AbstractC0156x2 abstractC0156x2 = (AbstractC0156x2) c0131r1.f1354u;
                abstractC0156x2.getClass();
                abstractC0156x2.v(AbstractC0156x2.l(c0131r1.f1355v), this.f741A0);
            }
        }
    }

    public final void x0(InterfaceC0149w interfaceC0149w) {
        this.f743D0 = interfaceC0149w;
        if (this.f762y0) {
            throw new IllegalStateException("Item clicked listener must be set before views are created");
        }
    }

    public final void y0(InterfaceC0153x interfaceC0153x) {
        C0152w2 l10;
        this.C0 = interfaceC0153x;
        VerticalGridView verticalGridView = this.f751n0;
        if (verticalGridView != null) {
            int childCount = verticalGridView.getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                C0131r1 c0131r1 = (C0131r1) verticalGridView.L(verticalGridView.getChildAt(i7));
                if (c0131r1 == null) {
                    l10 = null;
                } else {
                    ((AbstractC0156x2) c0131r1.f1354u).getClass();
                    l10 = AbstractC0156x2.l(c0131r1.f1355v);
                }
                l10.f1466m = this.C0;
            }
        }
    }
}
