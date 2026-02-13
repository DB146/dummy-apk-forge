package k6;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import com.google.android.material.carousel.CarouselLayoutManager;
import l5.B;
import l5.C;
import l5.G;

/* renamed from: k6.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class ViewOnLayoutChangeListenerC1430a implements View.OnLayoutChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19022a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f19023b;

    public /* synthetic */ ViewOnLayoutChangeListenerC1430a(Object obj, int i7) {
        this.f19022a = i7;
        this.f19023b = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i7, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        int height;
        int height2;
        switch (this.f19022a) {
            case 0:
                CarouselLayoutManager carouselLayoutManager = (CarouselLayoutManager) this.f19023b;
                if (i7 == i13 && i10 == i14 && i11 == i15 && i12 == i16) {
                    return;
                }
                view.post(new k1.a(carouselLayoutManager, 1));
                return;
            case 1:
                B b2 = (B) this.f19023b;
                b2.getClass();
                int i17 = i12 - i10;
                int i18 = i16 - i14;
                if (i11 - i7 == i15 - i13 && i17 == i18) {
                    return;
                }
                PopupWindow popupWindow = b2.f19327y;
                if (popupWindow.isShowing()) {
                    b2.q();
                    int width = b2.getWidth() - popupWindow.getWidth();
                    int i19 = b2.f19329z;
                    popupWindow.update(view, width - i19, (-popupWindow.getHeight()) - i19, -1, -1);
                    return;
                }
                return;
            default:
                G g = (G) this.f19023b;
                B b10 = g.f19343a;
                int width2 = (b10.getWidth() - b10.getPaddingLeft()) - b10.getPaddingRight();
                int height3 = (b10.getHeight() - b10.getPaddingBottom()) - b10.getPaddingTop();
                ViewGroup viewGroup = g.f19345c;
                int c10 = G.c(viewGroup) - (viewGroup != null ? viewGroup.getPaddingRight() + viewGroup.getPaddingLeft() : 0);
                if (viewGroup == null) {
                    height = 0;
                } else {
                    height = viewGroup.getHeight();
                    ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
                    if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                        height += marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
                    }
                }
                int paddingBottom = height - (viewGroup != null ? viewGroup.getPaddingBottom() + viewGroup.getPaddingTop() : 0);
                int max = Math.max(c10, G.c(g.k) + G.c(g.f19350i));
                ViewGroup viewGroup2 = g.f19346d;
                if (viewGroup2 == null) {
                    height2 = 0;
                } else {
                    height2 = viewGroup2.getHeight();
                    ViewGroup.LayoutParams layoutParams2 = viewGroup2.getLayoutParams();
                    if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                        height2 += marginLayoutParams2.topMargin + marginLayoutParams2.bottomMargin;
                    }
                }
                boolean z8 = width2 <= max || height3 <= (height2 * 2) + paddingBottom;
                if (g.f19340A != z8) {
                    g.f19340A = z8;
                    view.post(new C(g, 1));
                }
                boolean z10 = i11 - i7 != i15 - i13;
                if (g.f19340A || !z10) {
                    return;
                }
                view.post(new C(g, 2));
                return;
        }
    }
}
