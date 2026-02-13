package A9;

import android.os.Build;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import com.kt.apps.core.base.leanback.SearchView;
import com.kt.apps.media.xemtv.ui.search.TVSearchActivity;
import va.C2165i;

/* loaded from: classes2.dex */
public final /* synthetic */ class O2 implements View.OnKeyListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f927a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f928b;

    public /* synthetic */ O2(Object obj, int i7) {
        this.f927a = i7;
        this.f928b = obj;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i7, KeyEvent keyEvent) {
        boolean isVisible;
        SearchView.SearchAutoComplete searchEdtAutoComplete;
        SearchView.SearchAutoComplete searchEdtAutoComplete2;
        SearchView.SearchAutoComplete searchEdtAutoComplete3;
        switch (this.f927a) {
            case 0:
                SearchView searchView = (SearchView) this.f928b;
                if (searchView.f16070v == null) {
                    return false;
                }
                String message = "mTextListener.onKey(" + i7 + "," + keyEvent + "), selection: ";
                kotlin.jvm.internal.l.e(message, "message");
                if (keyEvent.hasNoModifiers() && keyEvent.getAction() == 1 && i7 == 23) {
                    if (Build.VERSION.SDK_INT >= 30) {
                        isVisible = searchView.getRootWindowInsets().isVisible(8);
                        if (!isVisible) {
                            searchView.f();
                        }
                    } else {
                        searchView.f();
                    }
                }
                SearchView.SearchAutoComplete searchAutoComplete = searchView.f16068f;
                kotlin.jvm.internal.l.b(searchAutoComplete);
                if (searchAutoComplete.b() || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i7 != 66) {
                    return false;
                }
                view.cancelLongPress();
                searchView.c(searchAutoComplete.getText().toString());
                return true;
            case 1:
                Ba.s sVar = (Ba.s) this.f928b;
                r3 = null;
                Editable editable = null;
                if (i7 == 19 && keyEvent.getAction() == 0 && sVar.f753p0 == 0) {
                    SearchView searchView2 = sVar.f2284Y0;
                    if (searchView2 != null && (searchEdtAutoComplete3 = searchView2.getSearchEdtAutoComplete()) != null) {
                        editable = searchEdtAutoComplete3.getText();
                    }
                    if (editable == null || ac.g.h0(editable)) {
                        SearchView searchView3 = sVar.f2284Y0;
                        if (searchView3 != null && (searchEdtAutoComplete2 = searchView3.getSearchEdtAutoComplete()) != null) {
                            searchEdtAutoComplete2.requestFocus();
                        }
                    } else {
                        ImageView imageView = sVar.f2286a1;
                        if (imageView == null || imageView.isFocused()) {
                            return false;
                        }
                        ImageView imageView2 = sVar.f2286a1;
                        if (imageView2 != null) {
                            imageView2.requestFocus();
                        }
                    }
                } else {
                    if (i7 != 4 || keyEvent.getAction() != 0) {
                        return false;
                    }
                    View view2 = sVar.f10277U;
                    View findFocus = view2 != null ? view2.findFocus() : null;
                    if (findFocus instanceof sa.d) {
                        SearchView searchView4 = sVar.f2284Y0;
                        if (searchView4 != null && (searchEdtAutoComplete = searchView4.getSearchEdtAutoComplete()) != null) {
                            searchEdtAutoComplete.requestFocus();
                        }
                    } else {
                        SearchView searchView5 = sVar.f2284Y0;
                        if (!kotlin.jvm.internal.l.a(findFocus, searchView5 != null ? searchView5.getSearchEdtAutoComplete() : null) || !(sVar.A() instanceof TVSearchActivity)) {
                            return false;
                        }
                        sVar.G0();
                    }
                }
                return true;
            default:
                if (i7 == 4 && keyEvent.getAction() == 0) {
                    C2165i c2165i = (C2165i) this.f928b;
                    if (c2165i.B0().g) {
                        c2165i.B0().a();
                        c2165i.G0().a().j(c2165i.H());
                        c2165i.G0().f25325o = null;
                        return true;
                    }
                }
                return false;
        }
    }
}
