package t6;

import android.content.res.Resources;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import com.kt.apps.media.xemtv.beta.R;
import d6.AbstractC1053a;
import java.util.WeakHashMap;
import y1.K;

/* loaded from: classes.dex */
public final class h extends AbstractC2029a {
    public final float g;

    /* renamed from: h, reason: collision with root package name */
    public final float f24505h;

    /* renamed from: i, reason: collision with root package name */
    public final float f24506i;

    public h(View view) {
        super(view);
        Resources resources = view.getResources();
        this.g = resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_x_distance_shrink);
        this.f24505h = resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_x_distance_grow);
        this.f24506i = resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_y_distance);
    }

    public final void a(float f4, boolean z8, int i7) {
        float interpolation = this.f24492a.getInterpolation(f4);
        WeakHashMap weakHashMap = K.f26642a;
        View view = this.f24493b;
        boolean z10 = (Gravity.getAbsoluteGravity(i7, view.getLayoutDirection()) & 3) == 3;
        boolean z11 = z8 == z10;
        int width = view.getWidth();
        int height = view.getHeight();
        float f10 = width;
        if (f10 > 0.0f) {
            float f11 = height;
            if (f11 <= 0.0f) {
                return;
            }
            float f12 = this.g / f10;
            float f13 = this.f24505h / f10;
            float f14 = this.f24506i / f11;
            if (z10) {
                f10 = 0.0f;
            }
            view.setPivotX(f10);
            if (!z11) {
                f13 = -f12;
            }
            float a9 = AbstractC1053a.a(0.0f, f13, interpolation);
            float f15 = a9 + 1.0f;
            view.setScaleX(f15);
            float a10 = 1.0f - AbstractC1053a.a(0.0f, f14, interpolation);
            view.setScaleY(a10);
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                    View childAt = viewGroup.getChildAt(i10);
                    childAt.setPivotX(z10 ? childAt.getWidth() + (width - childAt.getRight()) : -childAt.getLeft());
                    childAt.setPivotY(-childAt.getTop());
                    float f16 = z11 ? 1.0f - a9 : 1.0f;
                    float f17 = a10 != 0.0f ? (f15 / a10) * f16 : 1.0f;
                    childAt.setScaleX(f16);
                    childAt.setScaleY(f17);
                }
            }
        }
    }
}
