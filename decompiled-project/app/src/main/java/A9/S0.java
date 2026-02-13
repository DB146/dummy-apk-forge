package A9;

import android.view.KeyEvent;
import android.widget.TextView;
import com.kt.apps.core.base.leanback.SearchBar;

/* loaded from: classes2.dex */
public final class S0 implements TextView.OnEditorActionListener, InterfaceC0100j1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f956a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f957b;

    public /* synthetic */ S0(Object obj, int i7) {
        this.f956a = i7;
        this.f957b = obj;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i7, KeyEvent keyEvent) {
        switch (this.f956a) {
            case 0:
                V0 v02 = (V0) this.f957b;
                if (i7 == 5 || i7 == 6) {
                    v02.f983m.f(v02, textView);
                    return true;
                }
                if (i7 != 1) {
                    return false;
                }
                v02.f983m.g(v02, textView);
                return true;
            default:
                SearchBar searchBar = (SearchBar) this.f957b;
                if (2 != i7) {
                    return false;
                }
                searchBar.f16032w.hideSoftInputFromWindow(searchBar.f16024a.getWindowToken(), 0);
                searchBar.f16031v.postDelayed(new RunnableC0102k(this, 7), 500L);
                return true;
        }
    }
}
