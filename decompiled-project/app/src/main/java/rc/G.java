package rc;

import java.io.Closeable;
import java.io.Flushable;

/* loaded from: classes2.dex */
public interface G extends Closeable, Flushable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    J e();

    void flush();

    void m(long j, C1964h c1964h);
}
