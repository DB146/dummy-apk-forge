package okhttp3.internal.concurrent;

import X.c;
import java.util.Arrays;
import java.util.logging.Logger;

/* loaded from: classes2.dex */
public final class TaskLoggerKt {
    public static final void a(Logger logger, Task task, TaskQueue taskQueue, String str) {
        logger.fine(taskQueue.f22512b + ' ' + String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1)) + ": " + task.f22507a);
    }

    public static final String b(long j) {
        String f4;
        if (j <= -999500000) {
            f4 = c.f((j - 500000000) / 1000000000, " s ", new StringBuilder());
        } else if (j <= -999500) {
            f4 = c.f((j - 500000) / 1000000, " ms", new StringBuilder());
        } else if (j <= 0) {
            f4 = c.f((j - 500) / 1000, " µs", new StringBuilder());
        } else if (j < 999500) {
            f4 = c.f((j + 500) / 1000, " µs", new StringBuilder());
        } else if (j < 999500000) {
            f4 = c.f((j + 500000) / 1000000, " ms", new StringBuilder());
        } else {
            f4 = c.f((j + 500000000) / 1000000000, " s ", new StringBuilder());
        }
        return String.format("%6s", Arrays.copyOf(new Object[]{f4}, 1));
    }
}
