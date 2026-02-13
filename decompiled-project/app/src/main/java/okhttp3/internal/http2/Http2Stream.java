package okhttp3.internal.http2;

import A9.N2;
import h3.o;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.TimeZone;
import kotlin.jvm.internal.l;
import okhttp3.Headers;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.concurrent.Lockable;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.http2.flowcontrol.WindowCounter;
import rc.C1961e;
import rc.C1964h;
import rc.G;
import rc.H;
import rc.J;

/* loaded from: classes2.dex */
public final class Http2Stream implements Lockable {

    /* renamed from: B, reason: collision with root package name */
    public static final /* synthetic */ int f22817B = 0;

    /* renamed from: A, reason: collision with root package name */
    public IOException f22818A;

    /* renamed from: a, reason: collision with root package name */
    public final int f22819a;

    /* renamed from: b, reason: collision with root package name */
    public final Http2Connection f22820b;

    /* renamed from: c, reason: collision with root package name */
    public final WindowCounter f22821c;

    /* renamed from: d, reason: collision with root package name */
    public long f22822d;

    /* renamed from: e, reason: collision with root package name */
    public long f22823e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayDeque f22824f;

    /* renamed from: u, reason: collision with root package name */
    public boolean f22825u;

    /* renamed from: v, reason: collision with root package name */
    public final FramingSource f22826v;

    /* renamed from: w, reason: collision with root package name */
    public final FramingSink f22827w;

    /* renamed from: x, reason: collision with root package name */
    public final StreamTimeout f22828x;

    /* renamed from: y, reason: collision with root package name */
    public final StreamTimeout f22829y;

    /* renamed from: z, reason: collision with root package name */
    public ErrorCode f22830z;

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(int i7) {
            this();
        }
    }

    /* loaded from: classes2.dex */
    public final class FramingSink implements G {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f22831a;

        /* renamed from: b, reason: collision with root package name */
        public final C1964h f22832b = new Object();

        /* renamed from: c, reason: collision with root package name */
        public boolean f22833c;

        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, rc.h] */
        public FramingSink(boolean z8) {
            this.f22831a = z8;
        }

        @Override // rc.G, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            Http2Stream http2Stream = Http2Stream.this;
            TimeZone timeZone = _UtilJvmKt.f22497a;
            synchronized (http2Stream) {
                if (this.f22833c) {
                    return;
                }
                boolean z8 = http2Stream.f() == null;
                Http2Stream http2Stream2 = Http2Stream.this;
                if (!http2Stream2.f22827w.f22831a) {
                    if (this.f22832b.f23966b > 0) {
                        while (this.f22832b.f23966b > 0) {
                            l(true);
                        }
                    } else if (z8) {
                        http2Stream2.f22820b.T(http2Stream2.f22819a, true, null, 0L);
                    }
                }
                Http2Stream http2Stream3 = Http2Stream.this;
                synchronized (http2Stream3) {
                    this.f22833c = true;
                    http2Stream3.notifyAll();
                }
                Http2Stream.this.f22820b.flush();
                Http2Stream.this.a();
            }
        }

        @Override // rc.G
        public final J e() {
            return Http2Stream.this.f22829y;
        }

        @Override // rc.G, java.io.Flushable
        public final void flush() {
            Http2Stream http2Stream = Http2Stream.this;
            TimeZone timeZone = _UtilJvmKt.f22497a;
            synchronized (http2Stream) {
                http2Stream.b();
            }
            while (this.f22832b.f23966b > 0) {
                l(false);
                Http2Stream.this.f22820b.flush();
            }
        }

        public final void l(boolean z8) {
            long min;
            boolean z10;
            Http2Stream http2Stream = Http2Stream.this;
            synchronized (http2Stream) {
                http2Stream.f22829y.h();
                while (http2Stream.f22822d >= http2Stream.f22823e && !this.f22831a && !this.f22833c && http2Stream.f() == null) {
                    try {
                        http2Stream.j();
                    } finally {
                        http2Stream.f22829y.k();
                    }
                }
                http2Stream.f22829y.k();
                http2Stream.b();
                min = Math.min(http2Stream.f22823e - http2Stream.f22822d, this.f22832b.f23966b);
                http2Stream.f22822d += min;
                z10 = z8 && min == this.f22832b.f23966b;
            }
            Http2Stream.this.f22829y.h();
            try {
                Http2Stream http2Stream2 = Http2Stream.this;
                http2Stream2.f22820b.T(http2Stream2.f22819a, z10, this.f22832b, min);
            } finally {
                http2Stream = Http2Stream.this;
            }
        }

        @Override // rc.G
        public final void m(long j, C1964h c1964h) {
            TimeZone timeZone = _UtilJvmKt.f22497a;
            C1964h c1964h2 = this.f22832b;
            c1964h2.m(j, c1964h);
            while (c1964h2.f23966b >= 16384) {
                l(false);
            }
        }
    }

    /* loaded from: classes2.dex */
    public final class FramingSource implements H {

        /* renamed from: a, reason: collision with root package name */
        public final long f22835a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f22836b;

        /* renamed from: c, reason: collision with root package name */
        public final C1964h f22837c = new Object();

        /* renamed from: d, reason: collision with root package name */
        public final C1964h f22838d = new Object();

        /* renamed from: e, reason: collision with root package name */
        public boolean f22839e;

        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, rc.h] */
        /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, rc.h] */
        public FramingSource(long j, boolean z8) {
            this.f22835a = j;
            this.f22836b = z8;
        }

        /* JADX WARN: Code restructure failed: missing block: B:54:0x00db, code lost:
        
            throw new java.io.IOException("stream closed");
         */
        /* JADX WARN: Removed duplicated region for block: B:13:0x002d A[Catch: all -> 0x0033, TRY_LEAVE, TryCatch #1 {, blocks: (B:6:0x0014, B:8:0x0023, B:13:0x002d, B:33:0x00b4, B:60:0x00de, B:61:0x00e3, B:15:0x0036, B:17:0x003c, B:19:0x0040, B:21:0x0044, B:22:0x0055, B:24:0x0059, B:26:0x0063, B:28:0x0080, B:30:0x008f, B:46:0x00a5, B:49:0x00ab, B:53:0x00d4, B:54:0x00db), top: B:5:0x0014, inners: #0 }] */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0059 A[Catch: all -> 0x0051, TryCatch #0 {all -> 0x0051, blocks: (B:15:0x0036, B:17:0x003c, B:19:0x0040, B:21:0x0044, B:22:0x0055, B:24:0x0059, B:26:0x0063, B:28:0x0080, B:30:0x008f, B:46:0x00a5, B:49:0x00ab, B:53:0x00d4, B:54:0x00db), top: B:14:0x0036, outer: #1 }] */
        /* JADX WARN: Removed duplicated region for block: B:52:0x00d4 A[EDGE_INSN: B:52:0x00d4->B:53:0x00d4 BREAK  A[LOOP:0: B:3:0x0011->B:37:0x00c7], SYNTHETIC] */
        @Override // rc.H
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final long O(long j, C1964h sink) {
            boolean z8;
            boolean z10;
            Throwable th;
            long j10;
            l.e(sink, "sink");
            long j11 = 0;
            if (j < 0) {
                throw new IllegalArgumentException(A3.c.h("byteCount < 0: ", j).toString());
            }
            while (true) {
                Http2Stream http2Stream = Http2Stream.this;
                synchronized (http2Stream) {
                    int i7 = Http2Stream.f22817B;
                    http2Stream.f22820b.getClass();
                    FramingSink framingSink = http2Stream.f22827w;
                    z8 = true;
                    try {
                        if (!framingSink.f22833c && !framingSink.f22831a) {
                            z10 = false;
                            if (z10) {
                                http2Stream.f22828x.h();
                            }
                            if (http2Stream.f() != null || this.f22836b) {
                                th = null;
                            } else {
                                th = http2Stream.f22818A;
                                if (th == null) {
                                    ErrorCode f4 = http2Stream.f();
                                    l.b(f4);
                                    th = new StreamResetException(f4);
                                }
                            }
                            if (!this.f22839e) {
                                break;
                            }
                            C1964h c1964h = this.f22838d;
                            long j12 = c1964h.f23966b;
                            if (j12 > j11) {
                                j10 = c1964h.O(Math.min(j, j12), sink);
                                WindowCounter.b(http2Stream.f22821c, j10, 0L, 2);
                                long a9 = http2Stream.f22821c.a();
                                if (th == null && a9 >= http2Stream.f22820b.f22767F.a() / 2) {
                                    http2Stream.f22820b.V(http2Stream.f22819a, a9);
                                    WindowCounter.b(http2Stream.f22821c, 0L, a9, 1);
                                }
                                z8 = false;
                            } else {
                                if (this.f22836b || th != null) {
                                    z8 = false;
                                } else {
                                    http2Stream.j();
                                }
                                j10 = -1;
                            }
                        }
                        if (http2Stream.f() != null) {
                        }
                        th = null;
                        if (!this.f22839e) {
                        }
                    } finally {
                        if (z10) {
                            http2Stream.f22828x.k();
                        }
                    }
                    z10 = true;
                    if (z10) {
                    }
                }
                Http2Stream http2Stream2 = Http2Stream.this;
                http2Stream2.f22820b.f22766E.a(http2Stream2.f22821c);
                if (!z8) {
                    if (j10 != -1) {
                        return j10;
                    }
                    if (th == null) {
                        return -1L;
                    }
                    throw th;
                }
                j11 = 0;
            }
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            long j;
            Http2Stream http2Stream = Http2Stream.this;
            synchronized (http2Stream) {
                this.f22839e = true;
                C1964h c1964h = this.f22838d;
                j = c1964h.f23966b;
                c1964h.l();
                http2Stream.notifyAll();
            }
            if (j > 0) {
                TimeZone timeZone = _UtilJvmKt.f22497a;
                Http2Stream.this.f22820b.P(j);
            }
            Http2Stream.this.a();
        }

        @Override // rc.H
        public final J e() {
            return Http2Stream.this.f22828x;
        }
    }

    /* loaded from: classes2.dex */
    public final class StreamTimeout extends C1961e {
        public StreamTimeout() {
        }

        @Override // rc.C1961e
        public final void j() {
            Http2Stream.this.e(ErrorCode.f22727v);
            Http2Connection http2Connection = Http2Stream.this.f22820b;
            synchronized (http2Connection) {
                long j = http2Connection.f22764C;
                long j10 = http2Connection.f22763B;
                if (j < j10) {
                    return;
                }
                http2Connection.f22763B = j10 + 1;
                http2Connection.f22765D = System.nanoTime() + 1000000000;
                TaskQueue.b(http2Connection.f22782v, o.p(new StringBuilder(), http2Connection.f22777c, " ping"), new N2(http2Connection, 28), 6);
            }
        }

        public final void k() {
            if (i()) {
                throw new SocketTimeoutException("timeout");
            }
        }
    }

    static {
        new Companion(0);
    }

    public Http2Stream(int i7, Http2Connection connection, boolean z8, boolean z10, Headers headers) {
        l.e(connection, "connection");
        this.f22819a = i7;
        this.f22820b = connection;
        this.f22821c = new WindowCounter(i7);
        this.f22823e = connection.f22768G.a();
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f22824f = arrayDeque;
        this.f22826v = new FramingSource(connection.f22767F.a(), z10);
        this.f22827w = new FramingSink(z8);
        this.f22828x = new StreamTimeout();
        this.f22829y = new StreamTimeout();
        if (headers == null) {
            if (!g()) {
                throw new IllegalStateException("remotely-initiated streams should have headers");
            }
        } else {
            if (g()) {
                throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
            }
            arrayDeque.add(headers);
        }
    }

    public final void a() {
        boolean z8;
        boolean h10;
        TimeZone timeZone = _UtilJvmKt.f22497a;
        synchronized (this) {
            FramingSource framingSource = this.f22826v;
            if (!framingSource.f22836b && framingSource.f22839e) {
                FramingSink framingSink = this.f22827w;
                if (framingSink.f22831a || framingSink.f22833c) {
                    z8 = true;
                    h10 = h();
                }
            }
            z8 = false;
            h10 = h();
        }
        if (z8) {
            c(ErrorCode.f22727v, null);
        } else {
            if (h10) {
                return;
            }
            this.f22820b.F(this.f22819a);
        }
    }

    public final void b() {
        FramingSink framingSink = this.f22827w;
        if (framingSink.f22833c) {
            throw new IOException("stream closed");
        }
        if (framingSink.f22831a) {
            throw new IOException("stream finished");
        }
        if (f() != null) {
            IOException iOException = this.f22818A;
            if (iOException != null) {
                throw iOException;
            }
            ErrorCode f4 = f();
            l.b(f4);
            throw new StreamResetException(f4);
        }
    }

    public final void c(ErrorCode errorCode, IOException iOException) {
        if (d(errorCode, iOException)) {
            this.f22820b.L.U(this.f22819a, errorCode);
        }
    }

    public final boolean d(ErrorCode errorCode, IOException iOException) {
        TimeZone timeZone = _UtilJvmKt.f22497a;
        synchronized (this) {
            if (f() != null) {
                return false;
            }
            this.f22830z = errorCode;
            this.f22818A = iOException;
            notifyAll();
            if (this.f22826v.f22836b) {
                if (this.f22827w.f22831a) {
                    return false;
                }
            }
            this.f22820b.F(this.f22819a);
            return true;
        }
    }

    public final void e(ErrorCode errorCode) {
        if (d(errorCode, null)) {
            this.f22820b.U(this.f22819a, errorCode);
        }
    }

    public final ErrorCode f() {
        ErrorCode errorCode;
        synchronized (this) {
            errorCode = this.f22830z;
        }
        return errorCode;
    }

    public final boolean g() {
        boolean z8 = (this.f22819a & 1) == 1;
        this.f22820b.getClass();
        return true == z8;
    }

    public final boolean h() {
        synchronized (this) {
            if (f() != null) {
                return false;
            }
            FramingSource framingSource = this.f22826v;
            if (framingSource.f22836b || framingSource.f22839e) {
                FramingSink framingSink = this.f22827w;
                if (framingSink.f22831a || framingSink.f22833c) {
                    if (this.f22825u) {
                        return false;
                    }
                }
            }
            return true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002f A[Catch: all -> 0x0024, TryCatch #0 {all -> 0x0024, blocks: (B:4:0x0008, B:6:0x000d, B:8:0x0015, B:11:0x001e, B:13:0x002f, B:14:0x0033, B:22:0x0026), top: B:3:0x0008 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(Headers headers, boolean z8) {
        boolean h10;
        l.e(headers, "headers");
        TimeZone timeZone = _UtilJvmKt.f22497a;
        synchronized (this) {
            try {
                if (this.f22825u && headers.b(":status") == null && headers.b(":method") == null) {
                    this.f22826v.getClass();
                    if (z8) {
                        this.f22826v.f22836b = true;
                    }
                    h10 = h();
                    notifyAll();
                }
                this.f22825u = true;
                this.f22824f.add(headers);
                if (z8) {
                }
                h10 = h();
                notifyAll();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (h10) {
            return;
        }
        this.f22820b.F(this.f22819a);
    }

    public final void j() {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }
}
