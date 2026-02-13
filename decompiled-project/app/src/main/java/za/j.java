package za;

import A9.O0;
import Db.o;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.TextView;
import cc.F;
import com.kt.apps.core.tv.model.TVChannel;
import com.kt.apps.core.tv.viewmodels.BaseTVChannelViewModel;
import com.kt.apps.core.utils.ActivityUtilsKt;
import com.kt.apps.core.utils.AnimationUtilsKt;
import com.kt.apps.media.xemtv.ui.main.MainActivity;
import h4.RunnableC1250a;
import l2.Q;
import v2.C2132d;
import y9.AbstractC2456A;

/* loaded from: classes2.dex */
public final class j implements Handler.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final MainActivity f28361a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f28362b;

    /* renamed from: c, reason: collision with root package name */
    public String f28363c = "";

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ MainActivity f28364d;

    public j(MainActivity mainActivity) {
        this.f28364d = mainActivity;
        this.f28361a = mainActivity;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message msg) {
        View view;
        boolean z8;
        boolean z10;
        int i7 = 7;
        kotlin.jvm.internal.l.e(msg, "msg");
        int i10 = msg.what;
        MainActivity mainActivity = this.f28364d;
        int i11 = 3;
        switch (i10) {
            case 100001:
                o oVar = AbstractC2456A.g2;
                O5.b.q().removeCallbacksAndMessages(null);
                if (!this.f28362b) {
                    this.f28362b = true;
                }
                String number = this.f28363c + msg.arg1;
                this.f28363c = number;
                kotlin.jvm.internal.l.e(number, "number");
                TextView textView = mainActivity.f16204d0;
                if (textView != null) {
                    textView.setText(number);
                }
                View view2 = mainActivity.f16203c0;
                if ((view2 == null || view2.getVisibility() != 0) && (view = mainActivity.f16203c0) != null) {
                    AnimationUtilsKt.fadeIn$default(view, false, null, 3, null);
                }
                if (this.f28363c.length() <= 0) {
                    return true;
                }
                if (Integer.parseInt(this.f28363c) > 300) {
                    Message.obtain(O5.b.q(), 100004).sendToTarget();
                    return true;
                }
                O5.b.q().postDelayed(new RunnableC1250a(i11), 2000L);
                return true;
            case 100002:
                o oVar2 = AbstractC2456A.g2;
                O5.b.q().removeCallbacksAndMessages(null);
                View view3 = mainActivity.f16203c0;
                if (view3 == null) {
                    return true;
                }
                AnimationUtilsKt.fadeOut$default(view3, false, new C2132d(mainActivity, i7), 1, null);
                return true;
            case 100003:
                String number2 = this.f28363c;
                kotlin.jvm.internal.l.e(number2, "number");
                int i12 = MainActivity.f16195f0;
                O0 o02 = mainActivity.f16201a0;
                TVChannel findChannelByNumber = ((ta.c) o02.getValue()).findChannelByNumber(number2);
                if (findChannelByNumber != null) {
                    ((ta.c) o02.getValue()).markLastWatchedChannel(findChannelByNumber);
                    BaseTVChannelViewModel.getLinkStreamForChannel$default((ta.c) o02.getValue(), findChannelByNumber, false, 2, null);
                    F.B(Q.f(mainActivity), null, 0, new i(mainActivity, null), 3);
                    z8 = false;
                    z10 = true;
                } else {
                    z8 = false;
                    z10 = true;
                    ActivityUtilsKt.showErrorDialog$default(mainActivity, null, "Không tìm thấy kênh phù hợp cho: ".concat(number2), "Oops!", null, null, false, false, false, null, null, 889, null);
                }
                o oVar3 = AbstractC2456A.g2;
                O5.b.q().removeCallbacksAndMessages(null);
                this.f28362b = z8;
                this.f28363c = "";
                O5.b.q().postDelayed(new RunnableC1250a(4), 1000L);
                return z10;
            case 100004:
                ActivityUtilsKt.showErrorDialog$default(this.f28361a, null, X.c.t("Không tìm thấy kênh: ", this.f28363c), "Oops!", null, null, false, false, false, null, null, 889, null);
                View view4 = mainActivity.f16203c0;
                if (view4 != null) {
                    AnimationUtilsKt.fadeOut$default(view4, false, new C2132d(mainActivity, i7), 1, null);
                    break;
                }
                break;
        }
        return true;
    }
}
