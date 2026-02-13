package A9;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.ImageView;
import com.kt.apps.core.base.leanback.SearchView;

/* loaded from: classes2.dex */
public final class W2 implements TextWatcher {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SearchView f1033a;

    public W2(SearchView searchView) {
        this.f1033a = searchView;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable s3) {
        kotlin.jvm.internal.l.e(s3, "s");
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence s3, int i7, int i10, int i11) {
        kotlin.jvm.internal.l.e(s3, "s");
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence s3, int i7, int i10, int i11) {
        ImageView imageView;
        kotlin.jvm.internal.l.e(s3, "s");
        SearchView searchView = this.f1033a;
        SearchView.SearchAutoComplete searchAutoComplete = searchView.f16068f;
        kotlin.jvm.internal.l.b(searchAutoComplete);
        Editable text = searchAutoComplete.getText();
        kotlin.jvm.internal.l.d(text, "getText(...)");
        searchView.f16069u = text;
        TextUtils.isEmpty(text);
        ImageView imageView2 = searchView.f16072x;
        if (imageView2 != null) {
            imageView2.setVisibility(8);
        }
        searchView.g();
        if (searchView.f16057B && !searchView.f16059D && ((imageView2 == null || imageView2.getVisibility() != 0) && (imageView = searchView.f16074z) != null)) {
            imageView.getVisibility();
        }
        if (searchView.f16067e != null && !TextUtils.equals(s3, searchView.f16056A)) {
            U2 u22 = searchView.f16067e;
            kotlin.jvm.internal.l.b(u22);
            String obj = s3.toString();
            Ba.s sVar = (Ba.s) ((D5.i) u22).f3256b;
            Ba.h.e(sVar.H0(), obj, sVar.f2282W0, 4);
        }
        searchView.f16056A = s3.toString();
    }
}
