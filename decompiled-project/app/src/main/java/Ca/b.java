package Ca;

import A9.C0098j;
import A9.C0151w1;
import A9.J1;
import android.view.View;
import androidx.leanback.tab.LeanbackTabLayout;
import androidx.leanback.tab.LeanbackViewPager;
import y9.AbstractC2457B;

/* loaded from: classes2.dex */
public abstract class b extends AbstractC2457B {

    /* loaded from: classes2.dex */
    public static final class a extends AbstractC2457B {
        @Override // y9.AbstractC2457B
        public final void C0(View rootView) {
            kotlin.jvm.internal.l.e(rootView, "rootView");
            C0151w1 c0151w1 = new C0151w1();
            c0151w1.g = false;
            t0(new C0098j(c0151w1));
            J1 j12 = this.f750m0;
            kotlin.jvm.internal.l.c(j12, "null cannot be cast to non-null type com.kt.apps.core.base.leanback.ArrayObjectAdapter");
            android.support.v4.media.session.b.c((C0098j) j12);
        }

        @Override // y9.AbstractC2457B
        public final void D0(View view) {
        }
    }

    public abstract int E0();

    public abstract LeanbackTabLayout F0();

    public abstract LeanbackViewPager G0();
}
