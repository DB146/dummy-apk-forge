package A9;

import android.graphics.Rect;
import android.view.View;
import com.kt.apps.core.base.leanback.VerticalGridView;
import com.kt.apps.media.xemtv.beta.R;

/* renamed from: A9.p0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0123p0 implements F, H, InterfaceC0153x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0142u0 f1340a;

    public /* synthetic */ C0123p0(C0142u0 c0142u0) {
        this.f1340a = c0142u0;
    }

    @Override // A9.InterfaceC0153x
    public void a(C0109l2 c0109l2, Object obj, C0152w2 c0152w2, Object obj2) {
        View view;
        C0142u0 c0142u0 = this.f1340a;
        int selectedPosition = c0142u0.f1398b1.f751n0.getSelectedPosition();
        int selectedSubPosition = c0142u0.f1398b1.f751n0.getSelectedSubPosition();
        C0098j c0098j = c0142u0.f1399c1;
        A2 a22 = c0142u0.f1398b1;
        if (a22 == null || (view = a22.f10277U) == null || !view.hasFocus() || c0142u0.f1403g1 || !(c0098j == null || c0098j.f1233c.size() == 0 || (c0142u0.z0().getSelectedPosition() == 0 && c0142u0.z0().getSelectedSubPosition() == 0))) {
            c0142u0.r0(false);
        } else {
            c0142u0.r0(true);
        }
        if (c0098j == null || c0098j.f1233c.size() <= selectedPosition) {
            return;
        }
        VerticalGridView z02 = c0142u0.z0();
        int childCount = z02.getChildCount();
        if (childCount > 0) {
            c0142u0.f785E0.g(c0142u0.f1388R0);
        }
        for (int i7 = 0; i7 < childCount; i7++) {
            C0131r1 c0131r1 = (C0131r1) z02.L(z02.getChildAt(i7));
            AbstractC0156x2 abstractC0156x2 = (AbstractC0156x2) c0131r1.f1354u;
            abstractC0156x2.getClass();
            C0152w2 l10 = AbstractC0156x2.l(c0131r1.f1355v);
            int c10 = c0131r1.c();
            if (abstractC0156x2 instanceof F0) {
                F0 f02 = (F0) abstractC0156x2;
                E0 e02 = (E0) l10;
                if (selectedPosition > c10) {
                    f02.y(e02, 0);
                } else if (selectedPosition == c10 && selectedSubPosition == 1) {
                    f02.y(e02, 0);
                } else if (selectedPosition == c10 && selectedSubPosition == 0) {
                    f02.y(e02, 1);
                } else {
                    f02.y(e02, 2);
                }
            }
        }
    }

    @Override // A9.F
    public boolean b(int i7, Rect rect) {
        return false;
    }

    @Override // A9.H
    public View c(View view, int i7) {
        VerticalGridView verticalGridView;
        C0142u0 c0142u0 = this.f1340a;
        VerticalGridView verticalGridView2 = c0142u0.f1398b1.f751n0;
        if (verticalGridView2 == null || !verticalGridView2.hasFocus()) {
            View view2 = c0142u0.f801o0;
            if (view2 != null && view2.hasFocus() && i7 == 130 && (verticalGridView = c0142u0.f1398b1.f751n0) != null) {
                return verticalGridView;
            }
        } else if (i7 == 33) {
            C0146v0 c0146v0 = c0142u0.f1402f1;
            if (c0146v0 != null) {
                c0146v0.getClass();
            }
            View view3 = c0142u0.f801o0;
            if (view3 != null && view3.hasFocusable()) {
                return c0142u0.f801o0;
            }
        }
        return view;
    }

    @Override // A9.F
    public void e(View view) {
        C0142u0 c0142u0 = this.f1340a;
        if (view != c0142u0.f1393W0.getFocusedChild()) {
            if (view.getId() != R.id.details_fragment_root) {
                if (view.getId() != R.id.video_surface_container) {
                    c0142u0.r0(true);
                    return;
                } else {
                    c0142u0.A0();
                    c0142u0.r0(false);
                    return;
                }
            }
            if (c0142u0.f1403g1) {
                return;
            }
            if (c0142u0.z0() != null) {
                N0 n02 = c0142u0.z0().f1419Y0;
                int i7 = n02.f875B;
                if ((i7 & 64) != 0) {
                    n02.f875B = i7 & (-65);
                    int i10 = n02.f879F;
                    if (i10 >= 0) {
                        n02.z1(true, i10, n02.f880G);
                    } else {
                        n02.f875B = i7 & (-193);
                        n02.F0();
                    }
                    int i11 = n02.f875B;
                    if ((i11 & 128) != 0) {
                        n02.f875B = i11 & (-129);
                        AbstractC0145v abstractC0145v = n02.f909r;
                        if (abstractC0145v.getScrollState() != 0 || n02.V()) {
                            abstractC0145v.j(new C0(n02, 1));
                        } else {
                            n02.F0();
                        }
                    }
                }
            }
            c0142u0.r0(true);
        }
    }
}
