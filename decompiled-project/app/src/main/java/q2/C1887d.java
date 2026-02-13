package q2;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.l;

/* renamed from: q2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1887d {

    /* renamed from: a, reason: collision with root package name */
    public final C1886c f23363a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f23364b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashSet f23365c = new LinkedHashSet();

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f23366d;

    public static void b(AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                autoCloseable.close();
            } catch (Exception e2) {
                throw new RuntimeException(e2);
            }
        }
    }

    public final void a(AutoCloseable closeable) {
        l.e(closeable, "closeable");
        if (this.f23366d) {
            b(closeable);
            return;
        }
        synchronized (this.f23363a) {
            this.f23365c.add(closeable);
        }
    }
}
