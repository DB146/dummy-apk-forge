package U2;

import java.io.Closeable;

/* loaded from: classes.dex */
public interface d extends Closeable {
    a N();

    String getDatabaseName();

    void setWriteAheadLoggingEnabled(boolean z8);
}
