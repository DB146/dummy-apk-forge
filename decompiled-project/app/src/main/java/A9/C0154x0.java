package A9;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import com.kt.apps.media.xemtv.beta.R;

/* renamed from: A9.x0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C0154x0 implements Q5.b {

    /* renamed from: a, reason: collision with root package name */
    public int f1468a;

    public C0158y0 a(View view) {
        float fraction;
        C0158y0 c0158y0 = (C0158y0) view.getTag(R.id.lb_focus_animator);
        if (c0158y0 == null) {
            Resources resources = view.getResources();
            int i7 = this.f1468a;
            if (i7 == 0) {
                fraction = 1.0f;
            } else {
                fraction = resources.getFraction(i7 != 1 ? i7 != 2 ? i7 != 3 ? i7 != 4 ? 0 : R.fraction.lb_focus_zoom_factor_xsmall : R.fraction.lb_focus_zoom_factor_large : R.fraction.lb_focus_zoom_factor_medium : R.fraction.lb_focus_zoom_factor_small, 1, 1);
            }
            c0158y0 = new C0158y0(view, fraction);
            view.setTag(R.id.lb_focus_animator, c0158y0);
        }
        return c0158y0;
    }

    @Override // Q5.b
    public int c(Context context, String str) {
        return this.f1468a;
    }

    @Override // Q5.b
    public int d(Context context, String str, boolean z8) {
        return 0;
    }
}
