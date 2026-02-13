package A9;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.kt.apps.core.base.leanback.SearchView;

/* loaded from: classes2.dex */
public final /* synthetic */ class R2 implements View.OnFocusChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f954a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f955b;

    public /* synthetic */ R2(Object obj, int i7) {
        this.f954a = i7;
        this.f955b = obj;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z8) {
        Object obj = this.f955b;
        switch (this.f954a) {
            case 0:
                Db.o oVar = SearchView.f16055H;
                ((SearchView) obj).getClass();
                return;
            case 1:
                View view2 = (View) obj;
                if (z8) {
                    view2.setAlpha(1.0f);
                    return;
                } else {
                    view2.setAlpha(0.8f);
                    return;
                }
            case 2:
                if (z8) {
                    Object systemService = ((Ba.s) obj).i0().getSystemService("input_method");
                    kotlin.jvm.internal.l.c(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                    ((InputMethodManager) systemService).showSoftInput(view, 0);
                    return;
                }
                return;
            case 3:
                C6.c cVar = (C6.c) obj;
                cVar.t(cVar.u());
                return;
            case 4:
                C6.i iVar = (C6.i) obj;
                iVar.f2937l = z8;
                iVar.q();
                if (z8) {
                    return;
                }
                iVar.t(false);
                iVar.f2938m = false;
                return;
            default:
                if (z8) {
                    ((Qa.g) obj).w0().I(3);
                    return;
                }
                return;
        }
    }
}
