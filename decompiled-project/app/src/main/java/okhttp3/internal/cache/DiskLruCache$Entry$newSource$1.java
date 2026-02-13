package okhttp3.internal.cache;

import rc.q;

/* loaded from: classes2.dex */
public final class DiskLruCache$Entry$newSource$1 extends q {

    /* renamed from: b, reason: collision with root package name */
    public boolean f22505b;

    @Override // rc.q, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        super.close();
        if (this.f22505b) {
            return;
        }
        this.f22505b = true;
        throw null;
    }
}
