package Da;

import A9.H;
import W1.C;
import android.view.View;
import androidx.leanback.tab.LeanbackTabLayout;
import com.kt.apps.core.utils.leanback.ViewUtilsKt;

/* loaded from: classes2.dex */
public final class s implements H {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t f3342a;

    public s(t tVar) {
        this.f3342a = tVar;
    }

    @Override // A9.H
    public final View c(View view, int i7) {
        B6.j g;
        String message = "{direction:" + i7 + ", focused: " + view + "}";
        t tVar = this.f3342a;
        kotlin.jvm.internal.l.e(message, "message");
        C c10 = tVar.f1000N0;
        if (c10 instanceof va.r) {
            try {
                kotlin.jvm.internal.l.c(c10, "null cannot be cast to non-null type com.kt.apps.media.xemtv.ui.extensions.FragmentDashboardExtensions");
                return ((va.r) c10).L0(view, i7);
            } catch (Throwable unused) {
            }
        }
        C c11 = tVar.f1000N0;
        boolean z8 = c11 instanceof Ca.b;
        if (z8 && (view instanceof B6.m) && i7 == 33) {
            return view;
        }
        if ((view instanceof a) && i7 == 33 && z8) {
            kotlin.jvm.internal.l.c(c11, "null cannot be cast to non-null type com.kt.apps.media.xemtv.ui.tv.BaseTabLayoutFragment");
            Ca.b bVar = (Ca.b) c11;
            LeanbackTabLayout F02 = bVar.F0();
            if (F02 == null || (g = F02.g(bVar.E0())) == null) {
                return null;
            }
            return g.g;
        }
        if (z8 && (view instanceof B6.m) && i7 == 17) {
            kotlin.jvm.internal.l.c(c11, "null cannot be cast to non-null type com.kt.apps.media.xemtv.ui.tv.BaseTabLayoutFragment");
            LeanbackTabLayout F03 = ((Ca.b) c11).F0();
            int tabCount = F03 != null ? F03.getTabCount() : 0;
            C c12 = tVar.f1000N0;
            kotlin.jvm.internal.l.c(c12, "null cannot be cast to non-null type com.kt.apps.media.xemtv.ui.tv.BaseTabLayoutFragment");
            LeanbackTabLayout F04 = ((Ca.b) c12).F0();
            kotlin.jvm.internal.l.b(F04);
            int findCurrentFocusedPosition = ViewUtilsKt.findCurrentFocusedPosition(F04);
            if (findCurrentFocusedPosition > 0) {
                C c13 = tVar.f1000N0;
                kotlin.jvm.internal.l.c(c13, "null cannot be cast to non-null type com.kt.apps.media.xemtv.ui.tv.BaseTabLayoutFragment");
                LeanbackTabLayout F05 = ((Ca.b) c13).F0();
                kotlin.jvm.internal.l.b(F05);
                B6.j g2 = F05.g((findCurrentFocusedPosition - 1) % tabCount);
                kotlin.jvm.internal.l.b(g2);
                return g2.g;
            }
        } else if (z8 && (view instanceof B6.m) && i7 == 66) {
            kotlin.jvm.internal.l.c(c11, "null cannot be cast to non-null type com.kt.apps.media.xemtv.ui.tv.BaseTabLayoutFragment");
            LeanbackTabLayout F06 = ((Ca.b) c11).F0();
            kotlin.jvm.internal.l.b(F06);
            int tabCount2 = F06.getTabCount();
            C c14 = tVar.f1000N0;
            kotlin.jvm.internal.l.c(c14, "null cannot be cast to non-null type com.kt.apps.media.xemtv.ui.tv.BaseTabLayoutFragment");
            LeanbackTabLayout F07 = ((Ca.b) c14).F0();
            kotlin.jvm.internal.l.b(F07);
            if (ViewUtilsKt.findCurrentFocusedPosition(F07) == tabCount2 - 1) {
                return view;
            }
        }
        C c15 = tVar.f1000N0;
        if (!(c15 instanceof Ca.b) || !(view instanceof B6.m) || i7 != 130) {
            return tVar.f1029r1.c(view, i7);
        }
        kotlin.jvm.internal.l.c(c15, "null cannot be cast to non-null type com.kt.apps.media.xemtv.ui.tv.BaseTabLayoutFragment");
        return ((Ca.b) c15).G0();
    }
}
