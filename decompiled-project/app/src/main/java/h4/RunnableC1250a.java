package h4;

import Db.o;
import android.os.Message;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.AlarmManagerSchedulerBroadcastReceiver;
import y9.AbstractC2456A;

/* renamed from: h4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1250a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17725a;

    public /* synthetic */ RunnableC1250a(int i7) {
        this.f17725a = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f17725a) {
            case 0:
                int i7 = AlarmManagerSchedulerBroadcastReceiver.f14710a;
                return;
            case 1:
                o oVar = AbstractC2456A.g2;
                Message.obtain(O5.b.q(), 100003).sendToTarget();
                return;
            case 2:
                o oVar2 = AbstractC2456A.g2;
                Message.obtain(O5.b.q(), 100002).sendToTarget();
                return;
            case 3:
                o oVar3 = AbstractC2456A.g2;
                Message.obtain(O5.b.q(), 100003).sendToTarget();
                return;
            default:
                o oVar4 = AbstractC2456A.g2;
                Message.obtain(O5.b.q(), 100002).sendToTarget();
                return;
        }
    }
}
