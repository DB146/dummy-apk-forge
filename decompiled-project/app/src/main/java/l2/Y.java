package l2;

import java.io.Closeable;
import java.util.Iterator;
import q2.C1887d;

/* loaded from: classes.dex */
public abstract class Y {
    private final C1887d impl = new C1887d();

    @Db.a
    public /* synthetic */ void addCloseable(Closeable closeable) {
        kotlin.jvm.internal.l.e(closeable, "closeable");
        C1887d c1887d = this.impl;
        if (c1887d != null) {
            c1887d.a(closeable);
        }
    }

    public void addCloseable(AutoCloseable closeable) {
        kotlin.jvm.internal.l.e(closeable, "closeable");
        C1887d c1887d = this.impl;
        if (c1887d != null) {
            c1887d.a(closeable);
        }
    }

    public final void addCloseable(String key, AutoCloseable closeable) {
        AutoCloseable autoCloseable;
        kotlin.jvm.internal.l.e(key, "key");
        kotlin.jvm.internal.l.e(closeable, "closeable");
        C1887d c1887d = this.impl;
        if (c1887d != null) {
            if (c1887d.f23366d) {
                C1887d.b(closeable);
                return;
            }
            synchronized (c1887d.f23363a) {
                autoCloseable = (AutoCloseable) c1887d.f23364b.put(key, closeable);
            }
            C1887d.b(autoCloseable);
        }
    }

    public final void clear$lifecycle_viewmodel_release() {
        C1887d c1887d = this.impl;
        if (c1887d != null && !c1887d.f23366d) {
            c1887d.f23366d = true;
            synchronized (c1887d.f23363a) {
                try {
                    Iterator it = c1887d.f23364b.values().iterator();
                    while (it.hasNext()) {
                        C1887d.b((AutoCloseable) it.next());
                    }
                    Iterator it2 = c1887d.f23365c.iterator();
                    while (it2.hasNext()) {
                        C1887d.b((AutoCloseable) it2.next());
                    }
                    c1887d.f23365c.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        onCleared();
    }

    public final <T extends AutoCloseable> T getCloseable(String key) {
        T t5;
        kotlin.jvm.internal.l.e(key, "key");
        C1887d c1887d = this.impl;
        if (c1887d == null) {
            return null;
        }
        synchronized (c1887d.f23363a) {
            t5 = (T) c1887d.f23364b.get(key);
        }
        return t5;
    }

    public void onCleared() {
    }
}
