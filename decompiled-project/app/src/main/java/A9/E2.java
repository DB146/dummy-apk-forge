package A9;

import android.os.Handler;
import android.text.Editable;
import android.text.TextWatcher;
import com.kt.apps.core.base.leanback.SearchBar;

/* loaded from: classes2.dex */
public final class E2 implements TextWatcher {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ D2 f816a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SearchBar f817b;

    public E2(SearchBar searchBar, D2 d22) {
        this.f817b = searchBar;
        this.f816a = d22;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        SearchBar searchBar = this.f817b;
        if (searchBar.f16022J) {
            return;
        }
        Handler handler = searchBar.f16031v;
        D2 d22 = this.f816a;
        handler.removeCallbacks(d22);
        handler.post(d22);
    }
}
