package y9;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;

/* loaded from: classes2.dex */
public final class v extends Handler {

    /* renamed from: a, reason: collision with root package name */
    public long f27541a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractC2456A f27542b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(AbstractC2456A abstractC2456A, Looper looper) {
        super(looper);
        this.f27542b = abstractC2456A;
        this.f27541a = SystemClock.uptimeMillis();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message msg) {
        kotlin.jvm.internal.l.e(msg, "msg");
        super.handleMessage(msg);
        String message = "{what: " + msg.what + ", when: " + msg.getWhen() + ",_cancelAtTime: " + this.f27541a + "}";
        AbstractC2456A abstractC2456A = this.f27542b;
        kotlin.jvm.internal.l.e(message, "message");
        if (msg.getWhen() < this.f27541a) {
            return;
        }
        int i7 = msg.what;
        Db.o oVar = abstractC2456A.f27453Y1;
        switch (i7) {
            case 1000:
                this.f27541a = msg.getWhen();
                return;
            case 1001:
                if (msg.getWhen() - 7000 >= this.f27541a) {
                    removeCallbacksAndMessages(null);
                    ((Runnable) oVar.getValue()).run();
                    this.f27541a = msg.getWhen();
                    return;
                }
                return;
            case 1002:
                removeCallbacksAndMessages(null);
                sendMessageAtTime(obtainMessage(msg.arg1, msg.obj), SystemClock.uptimeMillis() + 7000);
                return;
            case 1003:
                removeCallbacksAndMessages(null);
                ((Runnable) oVar.getValue()).run();
                this.f27541a = msg.getWhen();
                return;
            default:
                return;
        }
    }
}
