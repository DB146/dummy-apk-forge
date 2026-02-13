package okhttp3;

import java.io.Closeable;
import java.io.Flushable;
import okhttp3.internal.cache.CacheRequest;
import okhttp3.internal.platform.Platform;
import rc.InterfaceC1966j;
import rc.p;
import rc.q;

/* loaded from: classes2.dex */
public final class Cache implements Closeable, Flushable {

    /* loaded from: classes2.dex */
    public static final class CacheResponseBody extends ResponseBody {

        /* renamed from: okhttp3.Cache$CacheResponseBody$1, reason: invalid class name */
        /* loaded from: classes2.dex */
        public final class AnonymousClass1 extends q {
            @Override // rc.q, java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
                throw null;
            }
        }

        @Override // okhttp3.ResponseBody
        public final InterfaceC1966j F() {
            return null;
        }

        @Override // okhttp3.ResponseBody
        public final long l() {
            return -1L;
        }

        @Override // okhttp3.ResponseBody
        public final MediaType n() {
            return null;
        }
    }

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(int i7) {
            this();
        }
    }

    /* loaded from: classes2.dex */
    public static final class Entry {

        /* loaded from: classes2.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(int i7) {
                this();
            }
        }

        static {
            new Companion(0);
            Platform.f22897a.getClass();
            Platform.f22898b.getClass();
            Platform.f22898b.getClass();
        }
    }

    /* loaded from: classes2.dex */
    public final class RealCacheRequest implements CacheRequest {

        /* renamed from: okhttp3.Cache$RealCacheRequest$1, reason: invalid class name */
        /* loaded from: classes2.dex */
        public final class AnonymousClass1 extends p {
            @Override // rc.p, rc.G, java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
                throw null;
            }
        }
    }

    static {
        new Companion(0);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw null;
    }

    @Override // java.io.Flushable
    public final void flush() {
        throw null;
    }
}
