package y9;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import com.kt.apps.core.base.leanback.SeekBar;
import m4.C1549C;
import m4.E0;
import m4.q0;
import m4.u0;
import m4.v0;

/* loaded from: classes2.dex */
public final class w implements v0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC2456A f27543a;

    public w(AbstractC2456A abstractC2456A) {
        this.f27543a = abstractC2456A;
    }

    @Override // m4.v0
    public final void J(o5.w videoSize) {
        kotlin.jvm.internal.l.e(videoSize, "videoSize");
        AbstractC2456A abstractC2456A = this.f27543a;
        C1549C c1549c = abstractC2456A.H0().f3807c;
        if (c1549c != null) {
            abstractC2456A.a1(c1549c);
        }
    }

    @Override // m4.v0
    public final void L(boolean z8) {
        ViewGroup viewGroup;
        AbstractC2456A abstractC2456A = this.f27543a;
        if (!z8) {
            ImageButton imageButton = abstractC2456A.f27472q1;
            if (imageButton != null) {
                imageButton.setActivated(true);
                return;
            }
            return;
        }
        ImageButton imageButton2 = abstractC2456A.f27472q1;
        if (imageButton2 != null) {
            imageButton2.setActivated(false);
        }
        t tVar = abstractC2456A.f27459d2;
        if (tVar != t.f27537d && tVar != t.f27536c && !abstractC2456A.R0() && ((viewGroup = abstractC2456A.f27436F1) == null || viewGroup.getVisibility() != 0)) {
            View view = abstractC2456A.f10277U;
            View findFocus = view != null ? view.findFocus() : null;
            if (findFocus != null) {
                abstractC2456A.N0(t.f27534a, true, findFocus);
            } else {
                abstractC2456A.N0(t.f27534a, true, null);
            }
        }
        C1549C c1549c = abstractC2456A.H0().f3807c;
        if (c1549c != null) {
            abstractC2456A.a1(c1549c);
        }
    }

    @Override // m4.v0
    public final void h(C1549C player, u0 u0Var) {
        kotlin.jvm.internal.l.e(player, "player");
        AbstractC2456A abstractC2456A = this.f27543a;
        C1549C c1549c = abstractC2456A.H0().f3807c;
        if (c1549c != null) {
            abstractC2456A.a1(c1549c);
        }
        if (u0Var.a(5, 4)) {
            if (player.d0() == 2) {
                if (abstractC2456A.M0().g) {
                    return;
                }
                abstractC2456A.M0().b();
            } else if (player.d0() != 1) {
                abstractC2456A.M0().a();
            }
        }
    }

    @Override // m4.v0
    public final void i(q0 error) {
        kotlin.jvm.internal.l.e(error, "error");
        this.f27543a.U0(error);
    }

    @Override // m4.v0
    public final void v(int i7) {
        AbstractC2456A abstractC2456A = this.f27543a;
        abstractC2456A.V0(i7);
        if (i7 == 3) {
            SeekBar seekBar = abstractC2456A.f27432A1;
            if (seekBar != null) {
                seekBar.setActivated(true);
            }
            abstractC2456A.D0();
            C1549C c1549c = abstractC2456A.H0().f3807c;
            if (c1549c == null) {
                return;
            }
            abstractC2456A.j1(c1549c);
            C1549C c1549c2 = abstractC2456A.H0().f3807c;
            if (c1549c2 != null) {
                c1549c2.s0(new E0(10000L, 10000L));
            }
        }
    }
}
