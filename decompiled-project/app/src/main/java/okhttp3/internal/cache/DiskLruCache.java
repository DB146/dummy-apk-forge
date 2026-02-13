package okhttp3.internal.cache;

import java.io.Closeable;
import java.io.Flushable;
import java.util.regex.Pattern;
import kotlin.jvm.internal.l;
import okhttp3.internal.concurrent.Lockable;

/* loaded from: classes2.dex */
public final class DiskLruCache implements Closeable, Flushable, Lockable {

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(int i7) {
            this();
        }
    }

    /* loaded from: classes2.dex */
    public final class Editor {
    }

    /* loaded from: classes2.dex */
    public final class Entry {
    }

    /* loaded from: classes2.dex */
    public final class Snapshot implements Closeable {
        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            throw null;
        }
    }

    static {
        new Companion(0);
        l.d(Pattern.compile("[a-z0-9_-]{1,120}"), "compile(...)");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        throw null;
    }

    @Override // java.io.Flushable
    public final synchronized void flush() {
    }
}
