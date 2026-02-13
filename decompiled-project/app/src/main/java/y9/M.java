package y9;

import android.os.Handler;
import android.os.Message;

/* loaded from: classes2.dex */
public final class M extends Handler {

    /* renamed from: a, reason: collision with root package name */
    public Handler.Callback f27485a;

    @Override // android.os.Handler
    public final void handleMessage(Message msg) {
        kotlin.jvm.internal.l.e(msg, "msg");
        super.handleMessage(msg);
        Handler.Callback callback = this.f27485a;
        if (callback != null) {
            callback.handleMessage(msg);
        }
    }
}
