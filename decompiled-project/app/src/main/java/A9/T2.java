package A9;

import android.view.KeyEvent;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import com.kt.apps.core.base.leanback.SearchView;

/* loaded from: classes2.dex */
public final /* synthetic */ class T2 implements TextView.OnEditorActionListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f968a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f969b;

    public /* synthetic */ T2(Object obj, int i7) {
        this.f968a = i7;
        this.f969b = obj;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i7, KeyEvent keyEvent) {
        Object obj = this.f969b;
        switch (this.f968a) {
            case 0:
                Db.o oVar = SearchView.f16055H;
                ((SearchView) obj).d();
                return true;
            default:
                if (i7 == 3) {
                    Ba.s sVar = (Ba.s) obj;
                    Object systemService = sVar.i0().getSystemService("input_method");
                    kotlin.jvm.internal.l.c(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                    ((InputMethodManager) systemService).hideSoftInputFromWindow(textView.getWindowToken(), 0);
                    sVar.f751n0.requestFocus();
                }
                return true;
        }
    }
}
