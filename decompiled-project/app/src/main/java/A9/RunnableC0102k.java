package A9;

import A0.C0016f0;
import android.R;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import com.kt.apps.core.base.leanback.ImageCardView;
import com.kt.apps.core.base.leanback.SearchBar;
import com.kt.apps.core.base.leanback.SearchEditText;
import java.lang.ref.WeakReference;

/* renamed from: A9.k, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC0102k implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1263a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f1264b;

    public RunnableC0102k(C0142u0 c0142u0) {
        this.f1263a = 3;
        this.f1264b = new WeakReference(c0142u0);
        c0142u0.f10277U.postDelayed(this, 200L);
    }

    public /* synthetic */ RunnableC0102k(Object obj, int i7) {
        this.f1263a = i7;
        this.f1264b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1263a) {
            case 0:
                ((ImageCardView) this.f1264b).a(true);
                return;
            case 1:
                ((C0016f0) this.f1264b).b(true, false);
                return;
            case 2:
                ((C0142u0) this.f1264b).f1398b1.w0(true);
                return;
            case 3:
                C0142u0 c0142u0 = (C0142u0) ((WeakReference) this.f1264b).get();
                if (c0142u0 != null) {
                    c0142u0.f785E0.g(c0142u0.f1389S0);
                    return;
                }
                return;
            case 4:
                E0 e02 = (E0) this.f1264b;
                AbstractC0132r2 abstractC0132r2 = e02.f1460d;
                if (abstractC0132r2 == null) {
                    return;
                }
                e02.f815z.f819f.c(e02.f809t, abstractC0132r2);
                return;
            case 5:
                ((N0) this.f1264b).F0();
                return;
            case 6:
                C0121o2 c0121o2 = (C0121o2) this.f1264b;
                if (c0121o2.f1332f && c0121o2.f1329c != null && c0121o2.g && c0121o2.f1330d == null) {
                    c0121o2.f1330d = new ProgressBar(c0121o2.f1329c.getContext(), null, R.attr.progressBarStyleLarge);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                    layoutParams.gravity = 17;
                    c0121o2.f1329c.addView(c0121o2.f1330d, layoutParams);
                    return;
                }
                return;
            case 7:
                SearchBar searchBar = (SearchBar) ((S0) this.f1264b).f957b;
                searchBar.f16033x = true;
                searchBar.f16025b.requestFocus();
                return;
            default:
                I2 i22 = ((SearchEditText) this.f1264b).f16036v;
                if (i22 != null) {
                    ((SearchBar) ((T) i22).f964a).getClass();
                    return;
                }
                return;
        }
    }
}
