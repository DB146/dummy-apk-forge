package com.kt.apps.core.base.leanback;

import a2.AbstractC0708a;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.kt.apps.media.xemtv.beta.R;

/* loaded from: classes2.dex */
public class GuidanceStylingRelativeLayout extends RelativeLayout {

    /* renamed from: a, reason: collision with root package name */
    public final float f15921a;

    public GuidanceStylingRelativeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f15921a = a(context);
    }

    public static float a(Context context) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(AbstractC0708a.f12483a);
        float f4 = obtainStyledAttributes.getFloat(46, 40.0f);
        obtainStyledAttributes.recycle();
        return f4;
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z8, int i7, int i10, int i11, int i12) {
        super.onLayout(z8, i7, i10, i11, i12);
        View findViewById = getRootView().findViewById(R.id.guidance_title);
        View findViewById2 = getRootView().findViewById(R.id.guidance_breadcrumb);
        View findViewById3 = getRootView().findViewById(R.id.guidance_description);
        ImageView imageView = (ImageView) getRootView().findViewById(R.id.guidance_icon);
        int measuredHeight = (int) ((getMeasuredHeight() * this.f15921a) / 100.0f);
        if (findViewById != null && findViewById.getParent() == this) {
            int baseline = (((measuredHeight - findViewById.getBaseline()) - findViewById2.getMeasuredHeight()) - findViewById.getPaddingTop()) - findViewById2.getTop();
            if (findViewById2.getParent() == this) {
                findViewById2.offsetTopAndBottom(baseline);
            }
            findViewById.offsetTopAndBottom(baseline);
            if (findViewById3 != null && findViewById3.getParent() == this) {
                findViewById3.offsetTopAndBottom(baseline);
            }
        }
        if (imageView == null || imageView.getParent() != this || imageView.getDrawable() == null) {
            return;
        }
        imageView.offsetTopAndBottom(measuredHeight - (imageView.getMeasuredHeight() / 2));
    }
}
