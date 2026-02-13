package C9;

import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public final class f extends Handler {
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        g gVar;
        if (message.what != 100 || (gVar = (g) ((WeakReference) message.obj).get()) == null) {
            return;
        }
        boolean s3 = gVar.f3072d.s();
        gVar.f3076v = s3;
        gVar.e(s3);
    }
}
