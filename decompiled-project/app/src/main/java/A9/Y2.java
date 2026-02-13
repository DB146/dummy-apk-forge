package A9;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* loaded from: classes2.dex */
public final class Y2 extends ViewOutlineProvider {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1039a;

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        Outline outline2;
        switch (this.f1039a) {
            case 0:
                outline.setRect(0, 0, view.getWidth(), view.getHeight());
                outline.setAlpha(1.0f);
                return;
            case 1:
                kotlin.jvm.internal.l.c(view, "null cannot be cast to non-null type androidx.compose.ui.platform.ViewLayer");
                Outline b2 = ((B0.f1) view).f1898e.b();
                kotlin.jvm.internal.l.b(b2);
                outline.set(b2);
                return;
            case 2:
                outline.setRect(0, 0, view.getWidth(), view.getHeight());
                outline.setAlpha(0.0f);
                return;
            default:
                if (!(view instanceof m0.m) || (outline2 = ((m0.m) view).f19764e) == null) {
                    return;
                }
                outline.set(outline2);
                return;
        }
    }
}
