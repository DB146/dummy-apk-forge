package gb;

import hb.InterfaceC1269b;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public abstract class o {
    static {
        Boolean.getBoolean("rx3.scheduler.use-nanotime");
        long longValue = Long.getLong("rx3.scheduler.drift-tolerance", 15L).longValue();
        String property = System.getProperty("rx3.scheduler.drift-tolerance-unit", "minutes");
        if ("seconds".equalsIgnoreCase(property)) {
            TimeUnit.SECONDS.toNanos(longValue);
        } else if ("milliseconds".equalsIgnoreCase(property)) {
            TimeUnit.MILLISECONDS.toNanos(longValue);
        } else {
            TimeUnit.MINUTES.toNanos(longValue);
        }
    }

    public abstract n a();

    public InterfaceC1269b b(Runnable runnable) {
        return c(runnable, 0L, TimeUnit.NANOSECONDS);
    }

    public InterfaceC1269b c(Runnable runnable, long j, TimeUnit timeUnit) {
        n a9 = a();
        m mVar = new m(runnable, a9);
        a9.c(mVar, j, timeUnit);
        return mVar;
    }
}
