package n5;

import android.os.Message;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public Message f21236a;

    public final void a() {
        this.f21236a = null;
        ArrayList arrayList = z.f21237b;
        synchronized (arrayList) {
            if (arrayList.size() < 50) {
                arrayList.add(this);
            }
        }
    }

    public final void b() {
        Message message = this.f21236a;
        message.getClass();
        message.sendToTarget();
        a();
    }
}
