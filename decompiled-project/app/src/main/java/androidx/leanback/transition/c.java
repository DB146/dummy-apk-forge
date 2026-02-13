package androidx.leanback.transition;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class c extends tc.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FadeAndShortSlide f13513a;

    public c(FadeAndShortSlide fadeAndShortSlide) {
        this.f13513a = fadeAndShortSlide;
    }

    @Override // tc.b
    public final float y(FadeAndShortSlide fadeAndShortSlide, ViewGroup viewGroup, View view, int[] iArr) {
        int centerY;
        int height = (view.getHeight() / 2) + iArr[1];
        viewGroup.getLocationOnScreen(iArr);
        Rect epicenter = this.f13513a.getEpicenter();
        if (epicenter == null) {
            centerY = (viewGroup.getHeight() / 2) + iArr[1];
        } else {
            centerY = epicenter.centerY();
        }
        if (height < centerY) {
            return view.getTranslationY() - fadeAndShortSlide.b(viewGroup);
        }
        return fadeAndShortSlide.b(viewGroup) + view.getTranslationY();
    }
}
