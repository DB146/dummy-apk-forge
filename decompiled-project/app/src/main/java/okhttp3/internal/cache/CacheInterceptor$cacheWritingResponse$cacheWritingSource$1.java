package okhttp3.internal.cache;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.l;
import okhttp3.internal._UtilJvmKt;
import rc.C1964h;
import rc.H;
import rc.J;

/* loaded from: classes2.dex */
public final class CacheInterceptor$cacheWritingResponse$cacheWritingSource$1 implements H {

    /* renamed from: a, reason: collision with root package name */
    public boolean f22502a;

    @Override // rc.H
    public final long O(long j, C1964h sink) {
        l.e(sink, "sink");
        throw null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f22502a) {
            throw null;
        }
        if (_UtilJvmKt.d(this, TimeUnit.MILLISECONDS)) {
            throw null;
        }
        this.f22502a = true;
        throw null;
    }

    @Override // rc.H
    public final J e() {
        throw null;
    }
}
