package y9;

import A9.AbstractC0132r2;
import A9.C0098j;
import A9.C0109l2;
import A9.C0152w2;
import A9.N1;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import com.kt.apps.core.utils.AnimationUtilsKt;
import m4.C1549C;

/* loaded from: classes2.dex */
public final /* synthetic */ class p implements N1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC2456A f27524a;

    public void a(boolean z8) {
        Db.o oVar = AbstractC2456A.g2;
        AbstractC2456A abstractC2456A = this.f27524a;
        if (abstractC2456A.R0()) {
            return;
        }
        View view = abstractC2456A.f10277U;
        View findFocus = view != null ? view.findFocus() : null;
        if (z8) {
            t tVar = abstractC2456A.f27459d2;
            if (tVar == t.f27534a || tVar == t.f27535b) {
                if (findFocus != null) {
                    abstractC2456A.N0(t.f27535b, true, findFocus);
                    return;
                } else {
                    abstractC2456A.N0(t.f27535b, true, null);
                    return;
                }
            }
            return;
        }
        t tVar2 = abstractC2456A.f27459d2;
        if (tVar2 == t.f27535b || tVar2 == t.f27534a) {
            ImageView imageView = abstractC2456A.f27438H1;
            if (imageView != null) {
                AnimationUtilsKt.fadeIn$default(imageView, false, new wa.f(15), 1, null);
            }
            ImageButton imageButton = abstractC2456A.f27472q1;
            if (imageButton != null) {
                AnimationUtilsKt.fadeIn$default(imageButton, false, new r(findFocus, abstractC2456A), 1, null);
            }
        }
        C1549C c1549c = abstractC2456A.H0().f3807c;
        if (c1549c == null || true != c1549c.s()) {
            return;
        }
        abstractC2456A.Q0();
    }

    @Override // A9.InterfaceC0149w
    public void b(C0109l2 c0109l2, Object obj, C0152w2 c0152w2, Object obj2) {
        AbstractC0132r2 abstractC0132r2 = (AbstractC0132r2) obj2;
        AbstractC2456A abstractC2456A = this.f27524a;
        C0098j c0098j = abstractC2456A.f27464h1;
        kotlin.jvm.internal.l.c(c0098j, "null cannot be cast to non-null type com.kt.apps.core.base.leanback.ArrayObjectAdapter");
        int indexOf = c0098j.f1233c.indexOf(obj);
        Integer valueOf = Integer.valueOf(indexOf);
        if (indexOf <= -1) {
            valueOf = null;
        }
        if (valueOf != null) {
            abstractC2456A.f27470n1 = valueOf.intValue();
        }
        N1 n12 = abstractC2456A.f27442M1;
        if (n12 != null) {
            n12.b(c0109l2, obj, c0152w2, abstractC0132r2);
        }
    }
}
