package A9;

import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import com.kt.apps.core.base.leanback.NavDrawerView;

/* loaded from: classes2.dex */
public final /* synthetic */ class B1 implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f768a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ NavDrawerView f769b;

    public /* synthetic */ B1(NavDrawerView navDrawerView, int i7) {
        this.f768a = i7;
        this.f769b = navDrawerView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        NavDrawerView navDrawerView = this.f769b;
        switch (this.f768a) {
            case 0:
                Db.o oVar = NavDrawerView.f15958z;
                long uptimeMillis = SystemClock.uptimeMillis();
                new BaseInputConnection(navDrawerView, true).sendKeyEvent(new KeyEvent(uptimeMillis, uptimeMillis, 0, 22, 0));
                return;
            default:
                Db.o oVar2 = NavDrawerView.f15958z;
                long uptimeMillis2 = SystemClock.uptimeMillis();
                new BaseInputConnection(navDrawerView, true).sendKeyEvent(new KeyEvent(uptimeMillis2, uptimeMillis2, 0, 22, 0));
                return;
        }
    }
}
