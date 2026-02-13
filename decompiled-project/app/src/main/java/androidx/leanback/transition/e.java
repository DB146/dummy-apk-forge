package androidx.leanback.transition;

import android.view.View;
import y7.u0;

/* loaded from: classes.dex */
public final class e extends u0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f13515b;

    @Override // androidx.leanback.transition.f
    public final float a(View view) {
        switch (this.f13515b) {
            case 0:
                return view.getTranslationY() - view.getHeight();
            default:
                return view.getTranslationY() + view.getHeight();
        }
    }
}
