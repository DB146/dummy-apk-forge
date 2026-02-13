package y9;

import android.view.View;
import android.widget.ImageButton;
import com.kt.apps.core.utils.AnimationUtilsKt;
import m4.C1549C;

/* loaded from: classes2.dex */
public final /* synthetic */ class q implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27525a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractC2456A f27526b;

    public /* synthetic */ q(AbstractC2456A abstractC2456A, int i7) {
        this.f27525a = i7;
        this.f27526b = abstractC2456A;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1549C c1549c;
        AbstractC2456A abstractC2456A = this.f27526b;
        switch (this.f27525a) {
            case 0:
                Db.o oVar = AbstractC2456A.g2;
                if (abstractC2456A.R0()) {
                    return;
                }
                ImageButton imageButton = abstractC2456A.f27472q1;
                if (imageButton != null) {
                    AnimationUtilsKt.visible(imageButton);
                }
                ImageButton imageButton2 = abstractC2456A.f27472q1;
                if (imageButton2 != null) {
                    imageButton2.requestFocus();
                }
                View view = abstractC2456A.f27474s1;
                if (view != null) {
                    AnimationUtilsKt.fadeOut(view, true, new C2468k(abstractC2456A, 14));
                    return;
                }
                return;
            default:
                C1549C c1549c2 = abstractC2456A.H0().f3807c;
                if (c1549c2 == null || !c1549c2.s()) {
                    return;
                }
                C1549C c1549c3 = abstractC2456A.H0().f3807c;
                if ((c1549c3 == null || c1549c3.d0() != 4) && (c1549c = abstractC2456A.H0().f3807c) != null) {
                    abstractC2456A.j1(c1549c);
                    return;
                }
                return;
        }
    }
}
