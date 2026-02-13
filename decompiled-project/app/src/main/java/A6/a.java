package A6;

import C3.A;
import android.os.Handler;
import android.os.Message;

/* loaded from: classes.dex */
public final class a implements Handler.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f515a;

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (this.f515a) {
            case 0:
                int i7 = message.what;
                if (i7 == 0) {
                    message.obj.getClass();
                    throw new ClassCastException();
                }
                if (i7 != 1) {
                    return false;
                }
                message.obj.getClass();
                throw new ClassCastException();
            default:
                if (message.what != 1) {
                    return false;
                }
                ((A) message.obj).d();
                return true;
        }
    }
}
