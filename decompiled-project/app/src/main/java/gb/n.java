package gb;

import hb.InterfaceC1269b;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public abstract class n implements InterfaceC1269b {
    public InterfaceC1269b a(Runnable runnable) {
        return c(runnable, 0L, TimeUnit.NANOSECONDS);
    }

    public abstract InterfaceC1269b c(Runnable runnable, long j, TimeUnit timeUnit);
}
