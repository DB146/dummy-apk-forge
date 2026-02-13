package okhttp3.internal.cache2;

import Y5.C0658x;
import kotlin.jvm.internal.l;
import okhttp3.internal.concurrent.Lockable;
import rc.C1964h;
import rc.C1967k;
import rc.H;
import rc.J;

/* loaded from: classes2.dex */
public final class Relay implements Lockable {

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(int i7) {
            this();
        }
    }

    /* loaded from: classes2.dex */
    public final class RelaySource implements H {
        @Override // rc.H
        public final long O(long j, C1964h sink) {
            l.e(sink, "sink");
            throw new IllegalStateException("Check failed.");
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
        }

        @Override // rc.H
        public final J e() {
            return null;
        }
    }

    static {
        new Companion(0);
        C1967k c1967k = C1967k.f23967d;
        C0658x.c("OkHttp cache v1\n");
        C0658x.c("OkHttp DIRTY :(\n");
    }
}
