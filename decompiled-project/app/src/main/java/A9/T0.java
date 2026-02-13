package A9;

import android.view.View;
import android.widget.LinearLayout;
import androidx.leanback.tab.LeanbackTabLayout;
import com.kt.apps.core.base.leanback.VerticalGridView;
import e3.AbstractC1084i;

/* loaded from: classes2.dex */
public final class T0 implements View.OnFocusChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f965a = 1;

    /* renamed from: b, reason: collision with root package name */
    public View f966b;

    /* renamed from: c, reason: collision with root package name */
    public Object f967c;

    public /* synthetic */ T0() {
    }

    public T0(V0 v02, C0092h1 c0092h1) {
        this.f967c = v02;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z8) {
        AbstractC1084i abstractC1084i;
        switch (this.f965a) {
            case 0:
                V0 v02 = (V0) this.f967c;
                VerticalGridView verticalGridView = v02.f977d;
                if (verticalGridView.f13625H) {
                    C0080e1 c0080e1 = (C0080e1) verticalGridView.L(view);
                    C0084f1 c0084f1 = v02.f982l;
                    if (z8) {
                        this.f966b = view;
                        P0 p02 = c0080e1.f1118u;
                    } else if (this.f966b == view) {
                        c0084f1.getClass();
                        c0080e1.t(false);
                        this.f966b = null;
                    }
                    c0084f1.getClass();
                    return;
                }
                return;
            default:
                if (z8) {
                    LinearLayout linearLayout = (LinearLayout) ((LeanbackTabLayout) this.f966b).getChildAt(0);
                    for (int i7 = 0; i7 < linearLayout.getChildCount(); i7++) {
                        if (view == linearLayout.getChildAt(i7) && (abstractC1084i = (AbstractC1084i) this.f967c) != null) {
                            abstractC1084i.f16738J = false;
                            abstractC1084i.u(i7, 0, true, false);
                        }
                    }
                    return;
                }
                return;
        }
    }
}
