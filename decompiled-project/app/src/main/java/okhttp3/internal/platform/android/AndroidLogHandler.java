package okhttp3.internal.platform.android;

import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import kotlin.jvm.internal.l;

/* loaded from: classes2.dex */
public final class AndroidLogHandler extends Handler {

    /* renamed from: a, reason: collision with root package name */
    public static final AndroidLogHandler f22908a = new AndroidLogHandler();

    private AndroidLogHandler() {
    }

    @Override // java.util.logging.Handler
    public final void close() {
    }

    @Override // java.util.logging.Handler
    public final void flush() {
    }

    @Override // java.util.logging.Handler
    public final void publish(LogRecord record) {
        l.e(record, "record");
        AndroidLog androidLog = AndroidLog.f22905a;
        String loggerName = record.getLoggerName();
        l.d(loggerName, "getLoggerName(...)");
        int intValue = record.getLevel().intValue();
        Level level = Level.INFO;
        int i7 = intValue > level.intValue() ? 5 : record.getLevel().intValue() == level.intValue() ? 4 : 3;
        String message = record.getMessage();
        l.d(message, "getMessage(...)");
        Throwable thrown = record.getThrown();
        androidLog.getClass();
        AndroidLog.a(loggerName, i7, message, thrown);
    }
}
