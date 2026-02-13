package n5;

import A9.O;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.TextView;
import com.kt.apps.core.utils.ActivityUtilsKt;
import com.kt.apps.core.utils.AnimationUtilsKt;
import h4.RunnableC1250a;
import java.util.Iterator;
import y9.AbstractC2456A;
import y9.C2468k;

/* loaded from: classes.dex */
public final /* synthetic */ class h implements Handler.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21176a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f21177b;

    public /* synthetic */ h(Object obj, int i7) {
        this.f21176a = i7;
        this.f21177b = obj;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message msg) {
        View view;
        int i7 = 13;
        Object obj = this.f21177b;
        int i10 = 1;
        switch (this.f21176a) {
            case 0:
                l lVar = (l) obj;
                Iterator it = lVar.f21185d.iterator();
                while (it.hasNext()) {
                    k kVar = (k) it.next();
                    if (!kVar.f21181d && kVar.f21180c) {
                        f d10 = kVar.f21179b.d();
                        kVar.f21179b = new O(6);
                        kVar.f21180c = false;
                        lVar.f21184c.d(kVar.f21178a, d10);
                    }
                    if (lVar.f21183b.f21238a.hasMessages(0)) {
                        return true;
                    }
                }
                return true;
            default:
                Db.o oVar = AbstractC2456A.g2;
                kotlin.jvm.internal.l.e(msg, "msg");
                AbstractC2456A abstractC2456A = (AbstractC2456A) obj;
                switch (msg.what) {
                    case 100001:
                        O5.b.q().removeCallbacksAndMessages(null);
                        if (!abstractC2456A.e2) {
                            abstractC2456A.e2 = true;
                        }
                        String str = abstractC2456A.f27462f2 + msg.arg1;
                        abstractC2456A.f27462f2 = str;
                        TextView textView = abstractC2456A.K1;
                        if (textView != null) {
                            textView.setText(str);
                        }
                        View view2 = abstractC2456A.f27440J1;
                        if ((view2 == null || view2.getVisibility() != 0) && (view = abstractC2456A.f27440J1) != null) {
                            AnimationUtilsKt.fadeIn$default(view, false, null, 3, null);
                        }
                        if (abstractC2456A.f27462f2.length() > 0) {
                            if (Integer.parseInt(abstractC2456A.f27462f2) <= 300) {
                                O5.b.q().postDelayed(new RunnableC1250a(i10), 2000L);
                                break;
                            } else {
                                Message.obtain(O5.b.q(), 100004).sendToTarget();
                                break;
                            }
                        }
                        break;
                    case 100002:
                        O5.b.q().removeCallbacksAndMessages(null);
                        abstractC2456A.e2 = false;
                        abstractC2456A.f27462f2 = "";
                        View view3 = abstractC2456A.f27440J1;
                        if (view3 != null) {
                            AnimationUtilsKt.fadeOut$default(view3, false, new C2468k(abstractC2456A, i7), 1, null);
                            break;
                        }
                        break;
                    case 100003:
                        abstractC2456A.E0(abstractC2456A.f27462f2);
                        O5.b.q().removeCallbacksAndMessages(null);
                        abstractC2456A.e2 = false;
                        abstractC2456A.f27462f2 = "";
                        O5.b.q().postDelayed(new RunnableC1250a(2), 1000L);
                        break;
                    case 100004:
                        ActivityUtilsKt.showErrorDialog$default(abstractC2456A, null, X.c.t("Không tìm thấy kênh: ", abstractC2456A.f27462f2), "Oops!", null, null, false, false, null, null, 441, null);
                        abstractC2456A.e2 = false;
                        abstractC2456A.f27462f2 = "";
                        View view4 = abstractC2456A.f27440J1;
                        if (view4 != null) {
                            AnimationUtilsKt.fadeOut$default(view4, false, new C2468k(abstractC2456A, i7), 1, null);
                            break;
                        }
                        break;
                }
                return true;
        }
    }
}
