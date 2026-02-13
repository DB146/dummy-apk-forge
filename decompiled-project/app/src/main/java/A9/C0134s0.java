package A9;

import android.util.Log;
import android.view.View;
import com.kt.apps.core.base.leanback.HorizontalGridView;
import com.kt.apps.core.base.leanback.VerticalGridView;
import com.kt.apps.media.xemtv.beta.R;
import java.util.ArrayList;

/* renamed from: A9.s0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0134s0 extends Q5.e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1359d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ W1.C f1360e;

    public /* synthetic */ C0134s0(int i7, W1.C c10) {
        this.f1359d = i7;
        this.f1360e = c10;
    }

    private final void W(C0131r1 c0131r1) {
    }

    @Override // Q5.e
    public void D(AbstractC0113m2 abstractC0113m2, int i7) {
        switch (this.f1359d) {
            case 2:
                Q5.e eVar = ((A2) this.f1360e).f748I0;
                if (eVar != null) {
                    eVar.D(abstractC0113m2, i7);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override // Q5.e
    public void E(C0131r1 c0131r1) {
        switch (this.f1359d) {
            case 1:
                StringBuilder sb2 = new StringBuilder("onAttachedToWindow ");
                C0109l2 c0109l2 = c0131r1.f1355v;
                sb2.append(c0109l2.f1271a);
                Log.v("PlaybackSupportFragment", sb2.toString());
                if (((C0085f2) this.f1360e).f1167M0) {
                    return;
                }
                Log.v("PlaybackSupportFragment", "setting alpha to 0");
                c0109l2.f1271a.setAlpha(0.0f);
                return;
            case 2:
                A2 a22 = (A2) this.f1360e;
                boolean z8 = a22.f761x0;
                AbstractC0113m2 abstractC0113m2 = c0131r1.f1354u;
                AbstractC0156x2 abstractC0156x2 = (AbstractC0156x2) abstractC0113m2;
                abstractC0156x2.getClass();
                C0109l2 c0109l22 = c0131r1.f1355v;
                C0152w2 l10 = AbstractC0156x2.l(c0109l22);
                l10.f1463h = z8;
                abstractC0156x2.r(l10, z8);
                AbstractC0156x2 abstractC0156x22 = (AbstractC0156x2) abstractC0113m2;
                abstractC0156x22.getClass();
                C0152w2 l11 = AbstractC0156x2.l(c0109l22);
                abstractC0156x22.v(l11, a22.f741A0);
                abstractC0156x22.k(l11, a22.f742B0);
                Q5.e eVar = a22.f748I0;
                if (eVar != null) {
                    eVar.E(c0131r1);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override // Q5.e
    public void F(C0131r1 c0131r1) {
        switch (this.f1359d) {
            case 1:
                return;
            case 2:
                Q5.e eVar = ((A2) this.f1360e).f748I0;
                if (eVar != null) {
                    eVar.F(c0131r1);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override // Q5.e
    public final void G(C0131r1 c0131r1) {
        switch (this.f1359d) {
            case 0:
                C0115n0 c0115n0 = ((C0142u0) this.f1360e).f1397a1;
                if (c0115n0 != null) {
                    C0109l2 c0109l2 = c0131r1.f1355v;
                    if (c0109l2 instanceof E0) {
                        ((E0) c0109l2).f805p.setTag(R.id.lb_parallax_source, c0115n0);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                InterfaceC0150w0 interfaceC0150w0 = c0131r1.f1355v;
                if (interfaceC0150w0 instanceof InterfaceC0069b2) {
                    ((InterfaceC0069b2) interfaceC0150w0).a(((C0085f2) this.f1360e).f1182b1);
                    return;
                }
                return;
            default:
                A2 a22 = (A2) this.f1360e;
                VerticalGridView verticalGridView = a22.f751n0;
                if (verticalGridView != null) {
                    verticalGridView.setClipChildren(false);
                }
                AbstractC0156x2 abstractC0156x2 = (AbstractC0156x2) c0131r1.f1354u;
                abstractC0156x2.getClass();
                C0109l2 c0109l22 = c0131r1.f1355v;
                C0152w2 l10 = AbstractC0156x2.l(c0109l22);
                if (l10 instanceof C0147v1) {
                    C0147v1 c0147v1 = (C0147v1) l10;
                    HorizontalGridView horizontalGridView = c0147v1.f1433o;
                    H2.X x2 = a22.f746G0;
                    if (x2 == null) {
                        a22.f746G0 = horizontalGridView.getRecycledViewPool();
                    } else {
                        horizontalGridView.setRecycledViewPool(x2);
                    }
                    B0 b02 = c0147v1.f1434p;
                    ArrayList arrayList = a22.f747H0;
                    if (arrayList == null) {
                        a22.f747H0 = b02.f1364h;
                    } else {
                        b02.f1364h = arrayList;
                    }
                }
                a22.f762y0 = true;
                c0131r1.f1357x = new C0164z2(a22, c0131r1);
                A2.z0(c0131r1, false, true);
                Q5.e eVar = a22.f748I0;
                if (eVar != null) {
                    eVar.G(c0131r1);
                }
                abstractC0156x2.getClass();
                C0152w2 l11 = AbstractC0156x2.l(c0109l22);
                l11.f1466m = a22.C0;
                l11.f1467n = a22.f743D0;
                return;
        }
    }

    @Override // Q5.e
    public void H(C0131r1 c0131r1) {
        switch (this.f1359d) {
            case 1:
                StringBuilder sb2 = new StringBuilder("onDetachedFromWindow ");
                C0109l2 c0109l2 = c0131r1.f1355v;
                sb2.append(c0109l2.f1271a);
                Log.v("PlaybackSupportFragment", sb2.toString());
                c0109l2.f1271a.setAlpha(1.0f);
                View view = c0109l2.f1271a;
                view.setTranslationY(0.0f);
                view.setAlpha(1.0f);
                return;
            case 2:
                A2 a22 = (A2) this.f1360e;
                C0131r1 c0131r12 = a22.f759v0;
                if (c0131r12 == c0131r1) {
                    A2.z0(c0131r12, false, true);
                    a22.f759v0 = null;
                }
                Q5.e eVar = a22.f748I0;
                if (eVar != null) {
                    eVar.H(c0131r1);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override // Q5.e
    public void I(C0131r1 c0131r1) {
        switch (this.f1359d) {
            case 2:
                A2.z0(c0131r1, false, true);
                Q5.e eVar = ((A2) this.f1360e).f748I0;
                if (eVar != null) {
                    eVar.I(c0131r1);
                    return;
                }
                return;
            default:
                return;
        }
    }
}
