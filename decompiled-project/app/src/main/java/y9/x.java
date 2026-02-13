package y9;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;

/* loaded from: classes2.dex */
public final class x implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC2456A f27544a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f27545b;

    public x(AbstractC2456A abstractC2456A, ViewGroup viewGroup) {
        this.f27544a = abstractC2456A;
        this.f27545b = viewGroup;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        AbstractC2456A abstractC2456A = this.f27544a;
        String message = "Height: " + abstractC2456A.f27471o1;
        kotlin.jvm.internal.l.e(message, "message");
        ViewGroup viewGroup = this.f27545b;
        float height = viewGroup.getHeight() - ((Number) AbstractC2456A.g2.getValue()).floatValue();
        abstractC2456A.f27471o1 = height;
        FrameLayout frameLayout = abstractC2456A.p1;
        if (frameLayout != null) {
            frameLayout.setTranslationY(height);
        }
        viewGroup.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }
}
