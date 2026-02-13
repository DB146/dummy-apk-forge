package A9;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import com.kt.apps.core.base.leanback.SearchView;
import va.C2165i;

/* loaded from: classes2.dex */
public final /* synthetic */ class Q2 implements View.OnFocusChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f941a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f942b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f943c;

    public /* synthetic */ Q2(int i7, Object obj, Object obj2) {
        this.f941a = i7;
        this.f942b = obj;
        this.f943c = obj2;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z8) {
        Object obj = this.f943c;
        Object obj2 = this.f942b;
        switch (this.f941a) {
            case 0:
                Db.o oVar = SearchView.f16055H;
                ValueAnimator valueAnimator = (ValueAnimator) obj2;
                SearchView searchView = (SearchView) obj;
                if (z8) {
                    valueAnimator.start();
                    SearchView.SearchAutoComplete searchAutoComplete = searchView.f16068f;
                    if (searchAutoComplete != null) {
                        searchAutoComplete.setHint("Nói để tìm kiếm nội dung");
                        return;
                    }
                    return;
                }
                valueAnimator.reverse();
                SearchView.SearchAutoComplete searchAutoComplete2 = searchView.f16068f;
                if (searchAutoComplete2 != null) {
                    searchAutoComplete2.setHint(searchView.f16063a);
                    return;
                }
                return;
            case 1:
                ((FrameLayout) obj2).setSelected(z8);
                ((View.OnFocusChangeListener) obj).onFocusChange(view, z8);
                return;
            default:
                if (z8) {
                    InputMethodManager inputMethodManager = (InputMethodManager) ((C2165i) obj2).i0().getSystemService(InputMethodManager.class);
                    kotlin.jvm.internal.l.d(inputMethodManager, "getInputMethodManager(...)");
                    if (inputMethodManager.isActive(view)) {
                        inputMethodManager.showSoftInput(view, 0);
                    }
                }
                View.OnFocusChangeListener onFocusChangeListener = (View.OnFocusChangeListener) obj;
                if (onFocusChangeListener != null) {
                    onFocusChangeListener.onFocusChange(view, z8);
                    return;
                }
                return;
        }
    }
}
