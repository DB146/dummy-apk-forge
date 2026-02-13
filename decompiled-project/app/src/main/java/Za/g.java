package Za;

import android.os.Looper;
import c2.q;
import h3.o;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final HashSet f12335a = new HashSet();

    public final void a() {
        if (q.f14203c == null) {
            q.f14203c = Looper.getMainLooper().getThread();
        }
        if (Thread.currentThread() != q.f14203c) {
            throw new IllegalStateException("Must be called on the Main thread.");
        }
        Iterator it = this.f12335a.iterator();
        if (it.hasNext()) {
            throw o.j(it);
        }
    }
}
