package A9;

import android.view.View;
import com.kt.apps.core.base.leanback.SearchBar;

/* loaded from: classes2.dex */
public final class C2 implements View.OnFocusChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f780a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SearchBar f781b;

    public /* synthetic */ C2(SearchBar searchBar, int i7) {
        this.f780a = i7;
        this.f781b = searchBar;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z8) {
        switch (this.f780a) {
            case 0:
                SearchBar searchBar = this.f781b;
                if (z8) {
                    searchBar.f16031v.post(new D2(searchBar, 1));
                } else {
                    searchBar.f16032w.hideSoftInputFromWindow(searchBar.f16024a.getWindowToken(), 0);
                }
                searchBar.d(z8);
                return;
            default:
                SearchBar searchBar2 = this.f781b;
                if (z8) {
                    searchBar2.f16032w.hideSoftInputFromWindow(searchBar2.f16024a.getWindowToken(), 0);
                    if (searchBar2.f16033x) {
                        searchBar2.a();
                        searchBar2.f16033x = false;
                    }
                } else {
                    searchBar2.b();
                }
                searchBar2.d(z8);
                return;
        }
    }
}
