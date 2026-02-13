package l5;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import com.kt.apps.media.xemtv.beta.R;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final /* synthetic */ class C implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19331a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ G f19332b;

    public /* synthetic */ C(G g, int i7) {
        this.f19331a = i7;
        this.f19332b = g;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        ViewGroup viewGroup;
        switch (this.f19331a) {
            case 0:
                this.f19332b.k();
                return;
            case 1:
                G g = this.f19332b;
                ViewGroup viewGroup2 = g.f19347e;
                if (viewGroup2 != null) {
                    viewGroup2.setVisibility(g.f19340A ? 0 : 4);
                }
                View view = g.j;
                if (view != null) {
                    int dimensionPixelSize = g.f19343a.getResources().getDimensionPixelSize(R.dimen.exo_styled_progress_margin_bottom);
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                    if (marginLayoutParams != null) {
                        if (g.f19340A) {
                            dimensionPixelSize = 0;
                        }
                        marginLayoutParams.bottomMargin = dimensionPixelSize;
                        view.setLayoutParams(marginLayoutParams);
                    }
                    if (view instanceof C1490d) {
                        C1490d c1490d = (C1490d) view;
                        boolean z8 = g.f19340A;
                        Rect rect = c1490d.f19444a;
                        if (z8) {
                            ValueAnimator valueAnimator = c1490d.f19439S;
                            if (valueAnimator.isStarted()) {
                                valueAnimator.cancel();
                            }
                            c1490d.f19441U = true;
                            c1490d.f19440T = 0.0f;
                            c1490d.invalidate(rect);
                        } else {
                            int i7 = g.f19365z;
                            if (i7 == 1) {
                                ValueAnimator valueAnimator2 = c1490d.f19439S;
                                if (valueAnimator2.isStarted()) {
                                    valueAnimator2.cancel();
                                }
                                c1490d.f19441U = false;
                                c1490d.f19440T = 0.0f;
                                c1490d.invalidate(rect);
                            } else if (i7 != 3) {
                                ValueAnimator valueAnimator3 = c1490d.f19439S;
                                if (valueAnimator3.isStarted()) {
                                    valueAnimator3.cancel();
                                }
                                c1490d.f19441U = false;
                                c1490d.f19440T = 1.0f;
                                c1490d.invalidate(rect);
                            }
                        }
                    }
                }
                Iterator it = g.f19364y.iterator();
                while (it.hasNext()) {
                    View view2 = (View) it.next();
                    view2.setVisibility((g.f19340A && G.j(view2)) ? 4 : 0);
                }
                return;
            case 2:
                G g2 = this.f19332b;
                ViewGroup viewGroup3 = g2.f19348f;
                if (viewGroup3 == null || (viewGroup = g2.g) == null) {
                    return;
                }
                B b2 = g2.f19343a;
                int width = (b2.getWidth() - b2.getPaddingLeft()) - b2.getPaddingRight();
                while (true) {
                    if (viewGroup.getChildCount() > 1) {
                        int childCount = viewGroup.getChildCount() - 2;
                        View childAt = viewGroup.getChildAt(childCount);
                        viewGroup.removeViewAt(childCount);
                        viewGroup3.addView(childAt, 0);
                    } else {
                        View view3 = g2.k;
                        if (view3 != null) {
                            view3.setVisibility(8);
                        }
                        int c10 = G.c(g2.f19350i);
                        int childCount2 = viewGroup3.getChildCount() - 1;
                        for (int i10 = 0; i10 < childCount2; i10++) {
                            c10 += G.c(viewGroup3.getChildAt(i10));
                        }
                        if (c10 <= width) {
                            ViewGroup viewGroup4 = g2.f19349h;
                            if (viewGroup4 == null || viewGroup4.getVisibility() != 0) {
                                return;
                            }
                            ValueAnimator valueAnimator4 = g2.f19357r;
                            if (valueAnimator4.isStarted()) {
                                return;
                            }
                            g2.f19356q.cancel();
                            valueAnimator4.start();
                            return;
                        }
                        if (view3 != null) {
                            view3.setVisibility(0);
                            c10 += G.c(view3);
                        }
                        ArrayList arrayList = new ArrayList();
                        for (int i11 = 0; i11 < childCount2; i11++) {
                            View childAt2 = viewGroup3.getChildAt(i11);
                            c10 -= G.c(childAt2);
                            arrayList.add(childAt2);
                            if (c10 <= width) {
                                if (arrayList.isEmpty()) {
                                    viewGroup3.removeViews(0, arrayList.size());
                                    for (int i12 = 0; i12 < arrayList.size(); i12++) {
                                        viewGroup.addView((View) arrayList.get(i12), viewGroup.getChildCount() - 1);
                                    }
                                    return;
                                }
                                return;
                            }
                        }
                        if (arrayList.isEmpty()) {
                        }
                    }
                }
                break;
            case 3:
                this.f19332b.f19353n.start();
                return;
            case 4:
                this.f19332b.f19352m.start();
                return;
            case 5:
                G g10 = this.f19332b;
                g10.f19351l.start();
                g10.e(g10.f19360u, 2000L);
                return;
            default:
                this.f19332b.i(2);
                return;
        }
    }
}
