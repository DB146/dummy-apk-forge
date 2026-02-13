package A9;

import android.animation.ValueAnimator;
import android.widget.ImageView;
import com.kt.apps.core.base.leanback.SearchView;
import l5.C1490d;

/* loaded from: classes2.dex */
public final /* synthetic */ class P2 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f933a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f934b;

    public /* synthetic */ P2(Object obj, int i7) {
        this.f933a = i7;
        this.f934b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator it) {
        Object obj = this.f934b;
        switch (this.f933a) {
            case 0:
                Db.o oVar = SearchView.f16055H;
                kotlin.jvm.internal.l.e(it, "it");
                SearchView searchView = (SearchView) obj;
                ImageView imageView = searchView.f16074z;
                if (imageView != null) {
                    Object animatedValue = it.getAnimatedValue();
                    kotlin.jvm.internal.l.c(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                    imageView.setScaleX((((Float) animatedValue).floatValue() * 0.2f) + 1);
                }
                ImageView imageView2 = searchView.f16074z;
                if (imageView2 != null) {
                    Object animatedValue2 = it.getAnimatedValue();
                    kotlin.jvm.internal.l.c(animatedValue2, "null cannot be cast to non-null type kotlin.Float");
                    imageView2.setScaleY((((Float) animatedValue2).floatValue() * 0.2f) + 1);
                    return;
                }
                return;
            case 1:
                C6.i iVar = (C6.i) obj;
                iVar.getClass();
                iVar.f2975d.setAlpha(((Float) it.getAnimatedValue()).floatValue());
                return;
            default:
                C1490d c1490d = (C1490d) obj;
                c1490d.getClass();
                c1490d.f19440T = ((Float) it.getAnimatedValue()).floatValue();
                c1490d.invalidate(c1490d.f19444a);
                return;
        }
    }
}
