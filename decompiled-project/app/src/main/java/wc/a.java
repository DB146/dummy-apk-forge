package wc;

import java.io.FilterInputStream;
import java.net.SocketTimeoutException;

/* loaded from: classes2.dex */
public final class a extends FilterInputStream {

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ int f25859x = 0;

    /* renamed from: a, reason: collision with root package name */
    public final e f25860a;

    /* renamed from: b, reason: collision with root package name */
    public int f25861b;

    /* renamed from: c, reason: collision with root package name */
    public long f25862c;

    /* renamed from: d, reason: collision with root package name */
    public long f25863d;

    /* renamed from: e, reason: collision with root package name */
    public int f25864e;

    /* renamed from: f, reason: collision with root package name */
    public int f25865f;

    /* renamed from: u, reason: collision with root package name */
    public boolean f25866u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f25867v;

    /* renamed from: w, reason: collision with root package name */
    public int f25868w;

    public a(e eVar, int i7) {
        super(eVar);
        this.f25863d = 0L;
        this.f25867v = true;
        this.f25868w = 0;
        vc.i.y(i7 >= 0);
        this.f25860a = eVar;
        this.f25861b = i7;
        this.f25864e = i7;
        this.f25865f = -1;
        this.f25862c = System.nanoTime();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f25867v) {
            super.close();
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void mark(int i7) {
        super.mark(i7);
        this.f25865f = this.f25861b - this.f25864e;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i7, int i10) {
        int i11;
        boolean z8 = this.f25861b != 0;
        if (this.f25866u || (z8 && this.f25864e <= 0)) {
            return -1;
        }
        if (Thread.currentThread().isInterrupted()) {
            this.f25866u = true;
            return -1;
        }
        if (z8 && i10 > (i11 = this.f25864e)) {
            i10 = i11;
        }
        do {
            if (this.f25863d != 0 && System.nanoTime() - this.f25862c > this.f25863d) {
                throw new SocketTimeoutException("Read timeout");
            }
            try {
                int read = super.read(bArr, i7, i10);
                if (read != -1) {
                    this.f25864e -= read;
                    this.f25868w += read;
                }
                return read;
            } catch (SocketTimeoutException e2) {
                if (this.f25863d != 0 && System.nanoTime() - this.f25862c > this.f25863d) {
                    break;
                }
                throw e2;
            }
        } while (this.f25863d != 0);
        throw e2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void reset() {
        super.reset();
        int i7 = this.f25861b;
        int i10 = this.f25865f;
        this.f25864e = i7 - i10;
        this.f25868w = i10;
    }
}
