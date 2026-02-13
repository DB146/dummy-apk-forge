package A9;

import android.view.KeyEvent;
import android.view.View;
import com.kt.apps.core.base.leanback.VerticalGridView;

/* loaded from: classes2.dex */
public final class U0 implements View.OnKeyListener {

    /* renamed from: a, reason: collision with root package name */
    public boolean f972a = false;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ V0 f973b;

    public U0(V0 v02) {
        this.f973b = v02;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i7, KeyEvent keyEvent) {
        if (view != null && keyEvent != null) {
            V0 v02 = this.f973b;
            VerticalGridView verticalGridView = v02.f977d;
            if (verticalGridView.f13625H) {
                if (i7 == 23 || i7 == 66 || i7 == 160 || i7 == 99 || i7 == 100) {
                    C0080e1 c0080e1 = (C0080e1) verticalGridView.L(view);
                    P0 p02 = c0080e1.f1118u;
                    if (!p02.a() || (p02.f929f & 8) == 8) {
                        keyEvent.getAction();
                        return true;
                    }
                    int action = keyEvent.getAction();
                    C0084f1 c0084f1 = v02.f982l;
                    if (action != 0) {
                        if (action == 1 && this.f972a) {
                            this.f972a = false;
                            c0084f1.getClass();
                            c0080e1.t(false);
                        }
                    } else if (!this.f972a) {
                        this.f972a = true;
                        c0084f1.getClass();
                        c0080e1.t(true);
                    }
                }
                return false;
            }
        }
        return false;
    }
}
