package okhttp3.internal.cache;

import java.io.IOException;
import rc.C1964h;
import rc.p;

/* loaded from: classes2.dex */
public class FaultHidingSink extends p {

    /* renamed from: b, reason: collision with root package name */
    public boolean f22506b;

    @Override // rc.p, rc.G, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            super.close();
        } catch (IOException unused) {
            this.f22506b = true;
            throw null;
        }
    }

    @Override // rc.p, rc.G, java.io.Flushable
    public final void flush() {
        if (this.f22506b) {
            return;
        }
        try {
            super.flush();
        } catch (IOException unused) {
            this.f22506b = true;
            throw null;
        }
    }

    @Override // rc.p, rc.G
    public final void m(long j, C1964h c1964h) {
        if (this.f22506b) {
            c1964h.f0(j);
            return;
        }
        try {
            this.f23982a.m(j, c1964h);
        } catch (IOException unused) {
            this.f22506b = true;
            throw null;
        }
    }
}
