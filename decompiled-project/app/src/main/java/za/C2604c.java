package za;

import A9.H;
import B6.m;
import W1.C;
import android.view.View;
import androidx.leanback.tab.LeanbackTabLayout;
import com.kt.apps.core.utils.leanback.ViewUtilsKt;
import va.r;

/* renamed from: za.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2604c implements H {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C2606e f28339a;

    public C2604c(C2606e c2606e) {
        this.f28339a = c2606e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x006c, code lost:
    
        if (kotlin.jvm.internal.l.a(r7 != null ? r7.getTag() : null, "AdsShopee") != false) goto L26;
     */
    @Override // A9.H
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View c(View view, int i7) {
        B6.j g;
        String message = "{direction:" + i7 + ", focused: " + view + "}";
        C2606e c2606e = this.f28339a;
        kotlin.jvm.internal.l.e(message, "message");
        C c10 = c2606e.f1000N0;
        if (c10 instanceof r) {
            try {
                kotlin.jvm.internal.l.c(c10, "null cannot be cast to non-null type com.kt.apps.media.xemtv.ui.extensions.FragmentDashboardExtensions");
                return ((r) c10).L0(view, i7);
            } catch (Throwable unused) {
            }
        }
        if ((c2606e.f1000N0 instanceof Ca.b) && (view instanceof m) && i7 == 33) {
            return view;
        }
        if (!(view instanceof sa.d)) {
            if (!kotlin.jvm.internal.l.a(view != null ? view.getTag() : null, "BannerAdPresenter") && !(view instanceof Lc.a)) {
            }
        }
        if (i7 == 33) {
            C c11 = c2606e.f1000N0;
            if (c11 instanceof Ca.b) {
                kotlin.jvm.internal.l.c(c11, "null cannot be cast to non-null type com.kt.apps.media.xemtv.ui.tv.BaseTabLayoutFragment");
                Ca.b bVar = (Ca.b) c11;
                LeanbackTabLayout F02 = bVar.F0();
                if (F02 == null || (g = F02.g(bVar.E0())) == null) {
                    return null;
                }
                return g.g;
            }
        }
        C c12 = c2606e.f1000N0;
        boolean z8 = c12 instanceof Ca.b;
        if (z8 && (view instanceof m) && i7 == 17) {
            kotlin.jvm.internal.l.c(c12, "null cannot be cast to non-null type com.kt.apps.media.xemtv.ui.tv.BaseTabLayoutFragment");
            LeanbackTabLayout F03 = ((Ca.b) c12).F0();
            int tabCount = F03 != null ? F03.getTabCount() : 0;
            C c13 = c2606e.f1000N0;
            kotlin.jvm.internal.l.c(c13, "null cannot be cast to non-null type com.kt.apps.media.xemtv.ui.tv.BaseTabLayoutFragment");
            LeanbackTabLayout F04 = ((Ca.b) c13).F0();
            kotlin.jvm.internal.l.b(F04);
            int findCurrentFocusedPosition = ViewUtilsKt.findCurrentFocusedPosition(F04);
            if (findCurrentFocusedPosition > 0) {
                C c14 = c2606e.f1000N0;
                kotlin.jvm.internal.l.c(c14, "null cannot be cast to non-null type com.kt.apps.media.xemtv.ui.tv.BaseTabLayoutFragment");
                LeanbackTabLayout F05 = ((Ca.b) c14).F0();
                kotlin.jvm.internal.l.b(F05);
                B6.j g2 = F05.g((findCurrentFocusedPosition - 1) % tabCount);
                kotlin.jvm.internal.l.b(g2);
                return g2.g;
            }
        } else if (z8 && (view instanceof m) && i7 == 66) {
            kotlin.jvm.internal.l.c(c12, "null cannot be cast to non-null type com.kt.apps.media.xemtv.ui.tv.BaseTabLayoutFragment");
            LeanbackTabLayout F06 = ((Ca.b) c12).F0();
            kotlin.jvm.internal.l.b(F06);
            int tabCount2 = F06.getTabCount();
            C c15 = c2606e.f1000N0;
            kotlin.jvm.internal.l.c(c15, "null cannot be cast to non-null type com.kt.apps.media.xemtv.ui.tv.BaseTabLayoutFragment");
            LeanbackTabLayout F07 = ((Ca.b) c15).F0();
            kotlin.jvm.internal.l.b(F07);
            if (ViewUtilsKt.findCurrentFocusedPosition(F07) == tabCount2 - 1) {
                return view;
            }
        }
        C c16 = c2606e.f1000N0;
        if (!(c16 instanceof Ca.b) || !(view instanceof m) || i7 != 130) {
            return c2606e.f1029r1.c(view, i7);
        }
        kotlin.jvm.internal.l.c(c16, "null cannot be cast to non-null type com.kt.apps.media.xemtv.ui.tv.BaseTabLayoutFragment");
        return ((Ca.b) c16).G0();
    }
}
