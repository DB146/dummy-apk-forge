package androidx.leanback.transition;

import android.view.View;
import vc.i;

/* loaded from: classes.dex */
public final class d extends i {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f13514f;

    @Override // androidx.leanback.transition.f
    public final float a(View view) {
        switch (this.f13514f) {
            case 0:
                return view.getTranslationX() - view.getWidth();
            case 1:
                return view.getTranslationX() + view.getWidth();
            case 2:
                return view.getLayoutDirection() == 1 ? view.getTranslationX() + view.getWidth() : view.getTranslationX() - view.getWidth();
            default:
                return view.getLayoutDirection() == 1 ? view.getTranslationX() - view.getWidth() : view.getTranslationX() + view.getWidth();
        }
    }
}
