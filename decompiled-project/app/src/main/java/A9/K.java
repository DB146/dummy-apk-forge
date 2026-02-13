package A9;

import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import com.kt.apps.media.xemtv.beta.R;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public final class K implements H, F {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ W f855a;

    public /* synthetic */ K(W w10) {
        this.f855a = w10;
    }

    @Override // A9.F
    public boolean b(int i7, Rect rect) {
        View view;
        W w10 = this.f855a;
        if (w10.B().f10349J) {
            return true;
        }
        if (w10.f1012Z0 && w10.f1011Y0 && w10.f1010X0.requestFocus(i7, rect)) {
            return true;
        }
        W1.C c10 = w10.f1000N0;
        if (c10 != null && (view = c10.f10277U) != null && view.requestFocus(i7, rect)) {
            return true;
        }
        View view2 = w10.f801o0;
        return view2 != null && view2.requestFocus(i7, rect);
    }

    @Override // A9.H
    public View c(View view, int i7) {
        C0098j c0098j;
        StringBuilder sb2 = new StringBuilder("OnFocusSearch ");
        sb2.append(i7);
        sb2.append(",");
        sb2.append(view);
        sb2.append("mCanShowHeaders: ");
        W w10 = this.f855a;
        sb2.append(w10.f1012Z0);
        sb2.append(",isInHeadersTransition: ");
        sb2.append(w10.f1027o1 != null);
        Log.d("BrowseSupportFragment", sb2.toString());
        if (w10.f1012Z0 && w10.f1027o1 != null) {
            return view;
        }
        Log.v("BrowseSupportFragment", "onFocusSearch focused " + view + " + direction " + i7);
        View view2 = w10.f801o0;
        if (view2 != null && view != view2 && i7 == 33) {
            Log.d("BrowseSupportFragment", "Focused search FOCUS_UP: " + view);
            return w10.f801o0;
        }
        if (view2 != null && view2.hasFocus() && i7 == 130) {
            Log.d("BrowseSupportFragment", "Focused search FOCUS_DOWN: " + view);
            return (w10.f1012Z0 && w10.f1011Y0) ? w10.f1010X0.focusSearch(view, i7) : w10.f1000N0.f10277U;
        }
        WeakHashMap weakHashMap = y1.K.f26642a;
        boolean z8 = view.getLayoutDirection() == 1;
        int i10 = z8 ? 66 : 17;
        int i11 = z8 ? 17 : 66;
        if (!w10.f1012Z0 || i7 != i10) {
            if (i7 == i11) {
                if (!w10.f1010X0.e() && !w10.f999M0.a()) {
                    W1.C c10 = w10.f1000N0;
                    if (c10 == null || c10.f10277U == null) {
                        Log.d("BrowseSupportFragment", "onFocusSearch: return focused view");
                        return view;
                    }
                    Log.d("BrowseSupportFragment", "onFocusSearch: return mMainFragment.getView()");
                    return w10.f1000N0.f10277U.findFocus();
                }
                Log.d("BrowseSupportFragment", "Focused search isVerticalScrolling: " + view);
            }
            return view;
        }
        if (w10.f1010X0.e() || w10.f999M0.a() || w10.f1011Y0 || (c0098j = w10.f1003Q0) == null || c0098j.f1233c.size() == 0) {
            Log.d("BrowseSupportFragment", "Focused search focused: " + view);
            return view;
        }
        Log.d("BrowseSupportFragment", "navDrawerView.focusSearch( " + view + ", direction)" + i7);
        return w10.f1010X0.focusSearch(view, i7);
    }

    @Override // A9.F
    public void e(View view) {
        W w10 = this.f855a;
        if (!w10.B().f10349J && w10.f1012Z0 && w10.f1027o1 == null) {
            int id = view.getId();
            if (id == R.id.browse_container_dock && w10.f1011Y0) {
                w10.L0(false);
            } else {
                if (id != R.id.nav_drawer || w10.f1011Y0) {
                    return;
                }
                w10.L0(true);
            }
        }
    }
}
