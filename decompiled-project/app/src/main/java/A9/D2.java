package A9;

import android.os.SystemClock;
import android.view.MotionEvent;
import com.kt.apps.core.base.leanback.SearchBar;

/* loaded from: classes2.dex */
public final class D2 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f797a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SearchBar f798b;

    public /* synthetic */ D2(SearchBar searchBar, int i7) {
        this.f797a = i7;
        this.f798b = searchBar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f797a) {
            case 0:
                SearchBar searchBar = this.f798b;
                searchBar.setSearchQueryInternal(searchBar.f16024a.getText().toString());
                return;
            default:
                SearchBar searchBar2 = this.f798b;
                searchBar2.f16024a.requestFocusFromTouch();
                searchBar2.f16024a.dispatchTouchEvent(MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 0, searchBar2.f16024a.getWidth(), searchBar2.f16024a.getHeight(), 0));
                searchBar2.f16024a.dispatchTouchEvent(MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 1, searchBar2.f16024a.getWidth(), searchBar2.f16024a.getHeight(), 0));
                return;
        }
    }
}
