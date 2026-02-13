package rc;

import java.io.Closeable;

/* renamed from: rc.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1962f implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public C1964h f23962a;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f23962a == null) {
            throw new IllegalStateException("not attached to a buffer");
        }
        this.f23962a = null;
    }
}
