package B6;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import androidx.leanback.tab.LeanbackTabLayout;
import java.util.WeakHashMap;
import y1.K;

/* loaded from: classes.dex */
public final class i extends LinearLayout {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f2125c = 0;

    /* renamed from: a, reason: collision with root package name */
    public ValueAnimator f2126a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LeanbackTabLayout f2127b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(LeanbackTabLayout leanbackTabLayout, Context context) {
        super(context);
        this.f2127b = leanbackTabLayout;
        setWillNotDraw(false);
    }

    public final void a(int i7) {
        LeanbackTabLayout leanbackTabLayout = this.f2127b;
        if (leanbackTabLayout.f2192l0 == 0 || (leanbackTabLayout.getTabSelectedIndicator().getBounds().left == -1 && leanbackTabLayout.getTabSelectedIndicator().getBounds().right == -1)) {
            View childAt = getChildAt(i7);
            U9.i iVar = leanbackTabLayout.f2174W;
            Drawable drawable = leanbackTabLayout.f2155C;
            iVar.getClass();
            RectF g = U9.i.g(leanbackTabLayout, childAt);
            drawable.setBounds((int) g.left, drawable.getBounds().top, (int) g.right, drawable.getBounds().bottom);
            leanbackTabLayout.f2175a = i7;
        }
    }

    public final void b(int i7) {
        LeanbackTabLayout leanbackTabLayout = this.f2127b;
        Rect bounds = leanbackTabLayout.f2155C.getBounds();
        leanbackTabLayout.f2155C.setBounds(bounds.left, 0, bounds.right, i7);
        requestLayout();
    }

    public final void c(View view, View view2, float f4) {
        LeanbackTabLayout leanbackTabLayout = this.f2127b;
        if (view == null || view.getWidth() <= 0) {
            Drawable drawable = leanbackTabLayout.f2155C;
            drawable.setBounds(-1, drawable.getBounds().top, -1, leanbackTabLayout.f2155C.getBounds().bottom);
        } else {
            leanbackTabLayout.f2174W.l(leanbackTabLayout, view, view2, f4, leanbackTabLayout.f2155C);
        }
        WeakHashMap weakHashMap = K.f26642a;
        postInvalidateOnAnimation();
    }

    public final void d(boolean z8, int i7, int i10) {
        LeanbackTabLayout leanbackTabLayout = this.f2127b;
        if (leanbackTabLayout.f2175a == i7) {
            return;
        }
        View childAt = getChildAt(leanbackTabLayout.getSelectedTabPosition());
        View childAt2 = getChildAt(i7);
        if (childAt2 == null) {
            a(leanbackTabLayout.getSelectedTabPosition());
            return;
        }
        leanbackTabLayout.f2175a = i7;
        h hVar = new h(this, childAt, childAt2);
        if (!z8) {
            this.f2126a.removeAllUpdateListeners();
            this.f2126a.addUpdateListener(hVar);
            return;
        }
        ValueAnimator valueAnimator = new ValueAnimator();
        this.f2126a = valueAnimator;
        valueAnimator.setInterpolator(leanbackTabLayout.f2176a0);
        valueAnimator.setDuration(i10);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        valueAnimator.addUpdateListener(hVar);
        valueAnimator.start();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int height;
        LeanbackTabLayout leanbackTabLayout = this.f2127b;
        int height2 = leanbackTabLayout.f2155C.getBounds().height();
        if (height2 < 0) {
            height2 = leanbackTabLayout.f2155C.getIntrinsicHeight();
        }
        int i7 = leanbackTabLayout.f2167P;
        if (i7 == 0) {
            height = getHeight() - height2;
            height2 = getHeight();
        } else if (i7 != 1) {
            height = 0;
            if (i7 != 2) {
                height2 = i7 != 3 ? 0 : getHeight();
            }
        } else {
            height = (getHeight() - height2) / 2;
            height2 = (getHeight() + height2) / 2;
        }
        if (leanbackTabLayout.f2155C.getBounds().width() > 0) {
            Rect bounds = leanbackTabLayout.f2155C.getBounds();
            leanbackTabLayout.f2155C.setBounds(bounds.left, height, bounds.right, height2);
            leanbackTabLayout.f2155C.draw(canvas);
        }
        super.draw(canvas);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z8, int i7, int i10, int i11, int i12) {
        super.onLayout(z8, i7, i10, i11, i12);
        ValueAnimator valueAnimator = this.f2126a;
        LeanbackTabLayout leanbackTabLayout = this.f2127b;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            d(false, leanbackTabLayout.getSelectedTabPosition(), -1);
            return;
        }
        if (leanbackTabLayout.f2175a == -1) {
            leanbackTabLayout.f2175a = leanbackTabLayout.getSelectedTabPosition();
        }
        a(leanbackTabLayout.f2175a);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        if (View.MeasureSpec.getMode(i7) != 1073741824) {
            return;
        }
        LeanbackTabLayout leanbackTabLayout = this.f2127b;
        boolean z8 = true;
        if (leanbackTabLayout.f2165N == 1 || leanbackTabLayout.f2168Q == 2) {
            int childCount = getChildCount();
            int i11 = 0;
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = getChildAt(i12);
                if (childAt.getVisibility() == 0) {
                    i11 = Math.max(i11, childAt.getMeasuredWidth());
                }
            }
            if (i11 <= 0) {
                return;
            }
            if (i11 * childCount <= getMeasuredWidth() - (((int) s6.o.d(getContext(), 16)) * 2)) {
                boolean z10 = false;
                for (int i13 = 0; i13 < childCount; i13++) {
                    LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildAt(i13).getLayoutParams();
                    if (layoutParams.width != i11 || layoutParams.weight != 0.0f) {
                        layoutParams.width = i11;
                        layoutParams.weight = 0.0f;
                        z10 = true;
                    }
                }
                z8 = z10;
            } else {
                leanbackTabLayout.f2165N = 0;
                leanbackTabLayout.n(false);
            }
            if (z8) {
                super.onMeasure(i7, i10);
            }
        }
    }
}
