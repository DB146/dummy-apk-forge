package okhttp3.internal.http2;

import Db.q;
import h3.o;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.l;
import okhttp3.Headers;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.concurrent.Lockable;
import okhttp3.internal.concurrent.Task;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.http2.FlowControlListener;
import okhttp3.internal.http2.Http2Connection;
import okhttp3.internal.http2.Http2Reader;
import okhttp3.internal.http2.Http2Stream;
import okhttp3.internal.http2.PushObserver;
import okhttp3.internal.http2.flowcontrol.WindowCounter;
import rc.B;
import rc.C;
import rc.C1964h;

/* loaded from: classes2.dex */
public final class Http2Connection implements Closeable, Lockable {

    /* renamed from: O, reason: collision with root package name */
    public static final Companion f22760O = new Companion(0);

    /* renamed from: P, reason: collision with root package name */
    public static final Settings f22761P;

    /* renamed from: A, reason: collision with root package name */
    public long f22762A;

    /* renamed from: B, reason: collision with root package name */
    public long f22763B;

    /* renamed from: C, reason: collision with root package name */
    public long f22764C;

    /* renamed from: D, reason: collision with root package name */
    public long f22765D;

    /* renamed from: E, reason: collision with root package name */
    public final FlowControlListener f22766E;

    /* renamed from: F, reason: collision with root package name */
    public final Settings f22767F;

    /* renamed from: G, reason: collision with root package name */
    public Settings f22768G;

    /* renamed from: H, reason: collision with root package name */
    public final WindowCounter f22769H;

    /* renamed from: I, reason: collision with root package name */
    public long f22770I;

    /* renamed from: J, reason: collision with root package name */
    public long f22771J;

    /* renamed from: K, reason: collision with root package name */
    public final Socket f22772K;
    public final Http2Writer L;

    /* renamed from: M, reason: collision with root package name */
    public final ReaderRunnable f22773M;

    /* renamed from: N, reason: collision with root package name */
    public final LinkedHashSet f22774N;

    /* renamed from: a, reason: collision with root package name */
    public final Listener f22775a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f22776b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final String f22777c;

    /* renamed from: d, reason: collision with root package name */
    public int f22778d;

    /* renamed from: e, reason: collision with root package name */
    public int f22779e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f22780f;

    /* renamed from: u, reason: collision with root package name */
    public final TaskRunner f22781u;

    /* renamed from: v, reason: collision with root package name */
    public final TaskQueue f22782v;

    /* renamed from: w, reason: collision with root package name */
    public final TaskQueue f22783w;

    /* renamed from: x, reason: collision with root package name */
    public final TaskQueue f22784x;

    /* renamed from: y, reason: collision with root package name */
    public final PushObserver f22785y;

    /* renamed from: z, reason: collision with root package name */
    public long f22786z;

    /* loaded from: classes2.dex */
    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        public final TaskRunner f22787a;

        /* renamed from: b, reason: collision with root package name */
        public Socket f22788b;

        /* renamed from: c, reason: collision with root package name */
        public String f22789c;

        /* renamed from: d, reason: collision with root package name */
        public C f22790d;

        /* renamed from: e, reason: collision with root package name */
        public B f22791e;

        /* renamed from: f, reason: collision with root package name */
        public Listener f22792f;
        public final PushObserver g;

        /* renamed from: h, reason: collision with root package name */
        public int f22793h;

        /* renamed from: i, reason: collision with root package name */
        public FlowControlListener f22794i;

        public Builder(TaskRunner taskRunner) {
            l.e(taskRunner, "taskRunner");
            this.f22787a = taskRunner;
            this.f22792f = Listener.f22795a;
            this.g = PushObserver.f22855a;
            this.f22794i = FlowControlListener.None.f22730a;
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
    public static abstract class Listener {

        /* renamed from: a, reason: collision with root package name */
        public static final Http2Connection$Listener$Companion$REFUSE_INCOMING_STREAMS$1 f22795a;

        /* loaded from: classes2.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(int i7) {
                this();
            }
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [okhttp3.internal.http2.Http2Connection$Listener$Companion$REFUSE_INCOMING_STREAMS$1] */
        static {
            new Companion(0);
            f22795a = new Listener() { // from class: okhttp3.internal.http2.Http2Connection$Listener$Companion$REFUSE_INCOMING_STREAMS$1
                @Override // okhttp3.internal.http2.Http2Connection.Listener
                public final void b(Http2Stream http2Stream) {
                    http2Stream.c(ErrorCode.f22726u, null);
                }
            };
        }

        public void a(Http2Connection connection, Settings settings) {
            l.e(connection, "connection");
            l.e(settings, "settings");
        }

        public abstract void b(Http2Stream http2Stream);
    }

    /* loaded from: classes2.dex */
    public final class ReaderRunnable implements Http2Reader.Handler, Rb.a {

        /* renamed from: a, reason: collision with root package name */
        public final Http2Reader f22796a;

        public ReaderRunnable(Http2Reader http2Reader) {
            this.f22796a = http2Reader;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, rc.h] */
        public final void b(final boolean z8, final int i7, C source, final int i10) {
            Http2Stream http2Stream;
            boolean z10;
            boolean z11;
            l.e(source, "source");
            Http2Connection.this.getClass();
            if (i7 != 0 && (i7 & 1) == 0) {
                final Http2Connection http2Connection = Http2Connection.this;
                http2Connection.getClass();
                final ?? obj = new Object();
                long j = i10;
                source.Z(j);
                source.O(j, obj);
                TaskQueue.b(http2Connection.f22783w, http2Connection.f22777c + '[' + i7 + "] onData", new Rb.a(i7, obj, i10, z8) { // from class: okhttp3.internal.http2.a

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ int f22861b;

                    /* renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ C1964h f22862c;

                    /* renamed from: d, reason: collision with root package name */
                    public final /* synthetic */ int f22863d;

                    @Override // Rb.a
                    public final Object invoke() {
                        Http2Connection http2Connection2 = Http2Connection.this;
                        int i11 = this.f22861b;
                        C1964h c1964h = this.f22862c;
                        int i12 = this.f22863d;
                        Http2Connection.Companion companion = Http2Connection.f22760O;
                        try {
                            ((PushObserver.Companion.PushObserverCancel) http2Connection2.f22785y).getClass();
                            c1964h.f0(i12);
                            http2Connection2.L.U(i11, ErrorCode.f22727v);
                            synchronized (http2Connection2) {
                                http2Connection2.f22774N.remove(Integer.valueOf(i11));
                            }
                        } catch (IOException unused) {
                        }
                        return q.f3365a;
                    }
                }, 6);
                return;
            }
            Http2Stream n6 = Http2Connection.this.n(i7);
            if (n6 == null) {
                Http2Connection.this.U(i7, ErrorCode.f22723d);
                long j10 = i10;
                Http2Connection.this.P(j10);
                source.a0(j10);
                return;
            }
            TimeZone timeZone = _UtilJvmKt.f22497a;
            Http2Stream.FramingSource framingSource = n6.f22826v;
            long j11 = i10;
            framingSource.getClass();
            long j12 = j11;
            while (true) {
                if (j12 <= 0) {
                    http2Stream = n6;
                    TimeZone timeZone2 = _UtilJvmKt.f22497a;
                    Http2Stream.this.f22820b.P(j11);
                    Http2Stream http2Stream2 = Http2Stream.this;
                    http2Stream2.f22820b.f22766E.a(http2Stream2.f22821c);
                    break;
                }
                synchronized (Http2Stream.this) {
                    z10 = framingSource.f22836b;
                    http2Stream = n6;
                    z11 = framingSource.f22838d.f23966b + j12 > framingSource.f22835a;
                }
                if (z11) {
                    source.a0(j12);
                    Http2Stream.this.e(ErrorCode.f22725f);
                    break;
                }
                if (z10) {
                    source.a0(j12);
                    break;
                }
                long O10 = source.O(j12, framingSource.f22837c);
                if (O10 == -1) {
                    throw new EOFException();
                }
                j12 -= O10;
                Http2Stream http2Stream3 = Http2Stream.this;
                synchronized (http2Stream3) {
                    try {
                        if (framingSource.f22839e) {
                            framingSource.f22837c.l();
                        } else {
                            C1964h c1964h = framingSource.f22838d;
                            boolean z12 = c1964h.f23966b == 0;
                            c1964h.k0(framingSource.f22837c);
                            if (z12) {
                                http2Stream3.notifyAll();
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                n6 = http2Stream;
            }
            if (z8) {
                http2Stream.i(Headers.f22332c, true);
            }
        }

        public final void c(int i7, List list, boolean z8) {
            Http2Connection.this.getClass();
            if (i7 != 0 && (i7 & 1) == 0) {
                Http2Connection http2Connection = Http2Connection.this;
                http2Connection.getClass();
                TaskQueue.b(http2Connection.f22783w, http2Connection.f22777c + '[' + i7 + "] onHeaders", new d(http2Connection, i7, list, z8), 6);
                return;
            }
            Http2Connection http2Connection2 = Http2Connection.this;
            synchronized (http2Connection2) {
                Http2Stream n6 = http2Connection2.n(i7);
                if (n6 != null) {
                    n6.i(_UtilJvmKt.i(list), z8);
                    return;
                }
                if (http2Connection2.f22780f) {
                    return;
                }
                if (i7 <= http2Connection2.f22778d) {
                    return;
                }
                if (i7 % 2 == http2Connection2.f22779e % 2) {
                    return;
                }
                Http2Stream http2Stream = new Http2Stream(i7, http2Connection2, false, z8, _UtilJvmKt.i(list));
                http2Connection2.f22778d = i7;
                http2Connection2.f22776b.put(Integer.valueOf(i7), http2Stream);
                TaskQueue.b(http2Connection2.f22781u.d(), http2Connection2.f22777c + '[' + i7 + "] onStream", new g(0, http2Connection2, http2Stream), 6);
            }
        }

        public final void d(boolean z8, final int i7, final int i10) {
            if (!z8) {
                TaskQueue taskQueue = Http2Connection.this.f22782v;
                String p10 = o.p(new StringBuilder(), Http2Connection.this.f22777c, " ping");
                final Http2Connection http2Connection = Http2Connection.this;
                TaskQueue.b(taskQueue, p10, new Rb.a() { // from class: okhttp3.internal.http2.f
                    @Override // Rb.a
                    public final Object invoke() {
                        int i11 = i7;
                        int i12 = i10;
                        Http2Connection http2Connection2 = Http2Connection.this;
                        http2Connection2.getClass();
                        try {
                            http2Connection2.L.T(true, i11, i12);
                        } catch (IOException e2) {
                            ErrorCode errorCode = ErrorCode.f22723d;
                            http2Connection2.l(errorCode, errorCode, e2);
                        }
                        return q.f3365a;
                    }
                }, 6);
                return;
            }
            Http2Connection http2Connection2 = Http2Connection.this;
            synchronized (http2Connection2) {
                try {
                    if (i7 == 1) {
                        http2Connection2.f22762A++;
                    } else if (i7 == 2) {
                        http2Connection2.f22764C++;
                    } else if (i7 == 3) {
                        http2Connection2.notifyAll();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final void e(int i7, List list) {
            Http2Connection http2Connection = Http2Connection.this;
            http2Connection.getClass();
            synchronized (http2Connection) {
                if (http2Connection.f22774N.contains(Integer.valueOf(i7))) {
                    http2Connection.U(i7, ErrorCode.f22723d);
                    return;
                }
                http2Connection.f22774N.add(Integer.valueOf(i7));
                TaskQueue.b(http2Connection.f22783w, http2Connection.f22777c + '[' + i7 + "] onRequest", new d(http2Connection, i7, list, 0), 6);
            }
        }

        public final void g(final int i7, final ErrorCode errorCode) {
            final Http2Connection http2Connection = Http2Connection.this;
            http2Connection.getClass();
            if (i7 == 0 || (i7 & 1) != 0) {
                Http2Stream F10 = http2Connection.F(i7);
                if (F10 != null) {
                    synchronized (F10) {
                        if (F10.f() == null) {
                            F10.f22830z = errorCode;
                            F10.notifyAll();
                        }
                    }
                    return;
                }
                return;
            }
            TaskQueue.b(http2Connection.f22783w, http2Connection.f22777c + '[' + i7 + "] onReset", new Rb.a(i7, errorCode) { // from class: okhttp3.internal.http2.e

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ int f22874b;

                @Override // Rb.a
                public final Object invoke() {
                    Http2Connection http2Connection2 = Http2Connection.this;
                    int i10 = this.f22874b;
                    ((PushObserver.Companion.PushObserverCancel) http2Connection2.f22785y).getClass();
                    synchronized (http2Connection2) {
                        http2Connection2.f22774N.remove(Integer.valueOf(i10));
                    }
                    return q.f3365a;
                }
            }, 6);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [okhttp3.internal.http2.Http2Connection] */
        /* JADX WARN: Type inference failed for: r3v0 */
        /* JADX WARN: Type inference failed for: r3v14 */
        /* JADX WARN: Type inference failed for: r3v15 */
        /* JADX WARN: Type inference failed for: r3v4 */
        /* JADX WARN: Type inference failed for: r3v5, types: [okhttp3.internal.http2.ErrorCode] */
        /* JADX WARN: Type inference failed for: r3v6 */
        /* JADX WARN: Type inference failed for: r3v8 */
        @Override // Rb.a
        public final Object invoke() {
            Throwable th;
            ErrorCode errorCode;
            ?? r02 = Http2Connection.this;
            Http2Reader http2Reader = this.f22796a;
            ErrorCode errorCode2 = ErrorCode.f22724e;
            ?? r32 = 1;
            IOException e2 = null;
            try {
                try {
                    try {
                        if (!http2Reader.l(true, this)) {
                            throw new IOException("Required SETTINGS preface not received");
                        }
                        do {
                            try {
                            } catch (Throwable th2) {
                                th = th2;
                                r32 = errorCode2;
                                r02.l(r32, errorCode2, e2);
                                _UtilCommonKt.a(http2Reader);
                                throw th;
                            }
                        } while (http2Reader.l(false, this));
                        errorCode = ErrorCode.f22722c;
                    } catch (Throwable th3) {
                        th = th3;
                        r02.l(r32, errorCode2, e2);
                        _UtilCommonKt.a(http2Reader);
                        throw th;
                    }
                } catch (IOException e10) {
                    e2 = e10;
                    errorCode = errorCode2;
                }
                try {
                    errorCode2 = ErrorCode.f22727v;
                    r02.l(errorCode, errorCode2, null);
                    r32 = errorCode;
                } catch (IOException e11) {
                    e2 = e11;
                    errorCode2 = ErrorCode.f22723d;
                    r02.l(errorCode2, errorCode2, e2);
                    r32 = errorCode;
                    _UtilCommonKt.a(http2Reader);
                    return q.f3365a;
                }
                _UtilCommonKt.a(http2Reader);
                return q.f3365a;
            } catch (Throwable th4) {
                th = th4;
            }
        }
    }

    static {
        Settings settings = new Settings();
        settings.c(4, 65535);
        settings.c(5, 16384);
        f22761P = settings;
    }

    public Http2Connection(Builder builder) {
        this.f22775a = builder.f22792f;
        String str = builder.f22789c;
        if (str == null) {
            l.j("connectionName");
            throw null;
        }
        this.f22777c = str;
        this.f22779e = 3;
        TaskRunner taskRunner = builder.f22787a;
        this.f22781u = taskRunner;
        TaskQueue d10 = taskRunner.d();
        this.f22782v = d10;
        this.f22783w = taskRunner.d();
        this.f22784x = taskRunner.d();
        this.f22785y = builder.g;
        this.f22766E = builder.f22794i;
        Settings settings = new Settings();
        settings.c(4, 16777216);
        this.f22767F = settings;
        this.f22768G = f22761P;
        this.f22769H = new WindowCounter(0);
        this.f22771J = r2.a();
        Socket socket = builder.f22788b;
        if (socket == null) {
            l.j("socket");
            throw null;
        }
        this.f22772K = socket;
        B b2 = builder.f22791e;
        if (b2 == null) {
            l.j("sink");
            throw null;
        }
        this.L = new Http2Writer(b2);
        C c10 = builder.f22790d;
        if (c10 == null) {
            l.j("source");
            throw null;
        }
        this.f22773M = new ReaderRunnable(new Http2Reader(c10));
        this.f22774N = new LinkedHashSet();
        int i7 = builder.f22793h;
        if (i7 != 0) {
            long nanos = TimeUnit.MILLISECONDS.toNanos(i7);
            final String name = str.concat(" ping");
            final b bVar = new b(this, nanos);
            l.e(name, "name");
            d10.c(new Task(name) { // from class: okhttp3.internal.concurrent.TaskQueue$schedule$2
                @Override // okhttp3.internal.concurrent.Task
                public final long a() {
                    return ((Number) bVar.invoke()).longValue();
                }
            }, nanos);
        }
    }

    public final Http2Stream F(int i7) {
        Http2Stream http2Stream;
        synchronized (this) {
            http2Stream = (Http2Stream) this.f22776b.remove(Integer.valueOf(i7));
            notifyAll();
        }
        return http2Stream;
    }

    public final void K(ErrorCode errorCode) {
        synchronized (this.L) {
            synchronized (this) {
                if (this.f22780f) {
                    return;
                }
                this.f22780f = true;
                this.L.K(this.f22778d, errorCode, _UtilCommonKt.f22495a);
            }
        }
    }

    public final void P(long j) {
        synchronized (this) {
            try {
                WindowCounter.b(this.f22769H, j, 0L, 2);
                long a9 = this.f22769H.a();
                if (a9 >= this.f22767F.a() / 2) {
                    V(0, a9);
                    WindowCounter.b(this.f22769H, 0L, a9, 1);
                }
                this.f22766E.b(this.f22769H);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0033, code lost:
    
        throw new java.io.IOException("stream closed");
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0035, code lost:
    
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, r6 - r4), r8.L.f22845c);
        r6 = r2;
        r8.f22770I += r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void T(int i7, boolean z8, C1964h c1964h, long j) {
        int min;
        long j10;
        if (j == 0) {
            this.L.n(z8, i7, c1964h, 0);
            return;
        }
        loop0: while (j > 0) {
            synchronized (this) {
                while (true) {
                    try {
                        try {
                            long j11 = this.f22770I;
                            long j12 = this.f22771J;
                            if (j11 < j12) {
                                break;
                            } else if (!this.f22776b.containsKey(Integer.valueOf(i7))) {
                                break loop0;
                            } else {
                                wait();
                            }
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                            throw new InterruptedIOException();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            j -= j10;
            this.L.n(z8 && j == 0, i7, c1964h, min);
        }
    }

    public final void U(int i7, ErrorCode errorCode) {
        TaskQueue.b(this.f22782v, this.f22777c + '[' + i7 + "] writeSynReset", new d(this, i7, errorCode, 2), 6);
    }

    public final void V(final int i7, final long j) {
        TaskQueue.b(this.f22782v, this.f22777c + '[' + i7 + "] windowUpdate", new Rb.a() { // from class: okhttp3.internal.http2.c
            @Override // Rb.a
            public final Object invoke() {
                Http2Connection http2Connection = Http2Connection.this;
                int i10 = i7;
                long j10 = j;
                Http2Connection.Companion companion = Http2Connection.f22760O;
                try {
                    http2Connection.L.V(i10, j10);
                } catch (IOException e2) {
                    http2Connection.getClass();
                    ErrorCode errorCode = ErrorCode.f22723d;
                    http2Connection.l(errorCode, errorCode, e2);
                }
                return q.f3365a;
            }
        }, 6);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        l(ErrorCode.f22722c, ErrorCode.f22727v, null);
    }

    public final void flush() {
        this.L.flush();
    }

    public final void l(ErrorCode errorCode, ErrorCode errorCode2, IOException iOException) {
        int i7;
        Object[] objArr;
        TimeZone timeZone = _UtilJvmKt.f22497a;
        try {
            K(errorCode);
        } catch (IOException unused) {
        }
        synchronized (this) {
            if (this.f22776b.isEmpty()) {
                objArr = null;
            } else {
                objArr = this.f22776b.values().toArray(new Http2Stream[0]);
                this.f22776b.clear();
            }
        }
        Http2Stream[] http2StreamArr = (Http2Stream[]) objArr;
        if (http2StreamArr != null) {
            for (Http2Stream http2Stream : http2StreamArr) {
                try {
                    http2Stream.c(errorCode2, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.L.close();
        } catch (IOException unused3) {
        }
        try {
            this.f22772K.close();
        } catch (IOException unused4) {
        }
        this.f22782v.f();
        this.f22783w.f();
        this.f22784x.f();
    }

    public final Http2Stream n(int i7) {
        Http2Stream http2Stream;
        synchronized (this) {
            http2Stream = (Http2Stream) this.f22776b.get(Integer.valueOf(i7));
        }
        return http2Stream;
    }
}
