package okhttp3;

import A3.c;
import Y5.C0658x;
import java.io.Closeable;
import kotlin.jvm.internal.l;
import rc.AbstractC1958b;
import rc.C1964h;
import rc.C1967k;
import rc.H;
import rc.J;

/* loaded from: classes2.dex */
public final class MultipartReader implements Closeable {

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(int i7) {
            this();
        }
    }

    /* loaded from: classes2.dex */
    public static final class Part implements Closeable {
        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            throw null;
        }
    }

    /* loaded from: classes2.dex */
    public final class PartSource implements H {
        @Override // rc.H
        public final long O(long j, C1964h sink) {
            l.e(sink, "sink");
            if (j >= 0) {
                throw null;
            }
            throw new IllegalArgumentException(c.h("byteCount < 0: ", j).toString());
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            throw null;
        }

        @Override // rc.H
        public final J e() {
            return null;
        }
    }

    static {
        new Companion(0);
        C1967k c1967k = C1967k.f23967d;
        AbstractC1958b.f(C0658x.c("\r\n"), C0658x.c("--"), C0658x.c(" "), C0658x.c("\t"));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
