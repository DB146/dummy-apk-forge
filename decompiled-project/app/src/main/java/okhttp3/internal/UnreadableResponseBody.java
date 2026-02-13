package okhttp3.internal;

import kotlin.jvm.internal.l;
import okhttp3.MediaType;
import okhttp3.ResponseBody;
import rc.AbstractC1958b;
import rc.C1964h;
import rc.H;
import rc.InterfaceC1966j;
import rc.J;

/* loaded from: classes2.dex */
public final class UnreadableResponseBody extends ResponseBody implements H {

    /* renamed from: c, reason: collision with root package name */
    public final MediaType f22492c;

    /* renamed from: d, reason: collision with root package name */
    public final long f22493d;

    public UnreadableResponseBody(MediaType mediaType, long j) {
        this.f22492c = mediaType;
        this.f22493d = j;
    }

    @Override // okhttp3.ResponseBody
    public final InterfaceC1966j F() {
        return AbstractC1958b.c(this);
    }

    @Override // rc.H
    public final long O(long j, C1964h sink) {
        l.e(sink, "sink");
        throw new IllegalStateException("Unreadable ResponseBody! These Response objects have bodies that are stripped:\n * Response.cacheResponse\n * Response.networkResponse\n * Response.priorResponse\n * EventSourceListener\n * WebSocketListener\n(It is safe to call contentType() and contentLength() on these response bodies.)");
    }

    @Override // okhttp3.ResponseBody, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // rc.H
    public final J e() {
        return J.f23942d;
    }

    @Override // okhttp3.ResponseBody
    public final long l() {
        return this.f22493d;
    }

    @Override // okhttp3.ResponseBody
    public final MediaType n() {
        return this.f22492c;
    }
}
