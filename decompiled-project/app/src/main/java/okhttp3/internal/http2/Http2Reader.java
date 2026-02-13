package okhttp3.internal.http2;

import Eb.n;
import h3.o;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.l;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.http2.Hpack;
import okhttp3.internal.http2.Http2Connection;
import rc.C;
import rc.C1964h;
import rc.C1967k;
import rc.H;
import rc.J;

/* loaded from: classes2.dex */
public final class Http2Reader implements Closeable {

    /* renamed from: d, reason: collision with root package name */
    public static final Companion f22806d = new Companion(0);

    /* renamed from: e, reason: collision with root package name */
    public static final Logger f22807e;

    /* renamed from: a, reason: collision with root package name */
    public final C f22808a;

    /* renamed from: b, reason: collision with root package name */
    public final ContinuationSource f22809b;

    /* renamed from: c, reason: collision with root package name */
    public final Hpack.Reader f22810c;

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(int i7) {
            this();
        }

        public static int a(int i7, int i10, int i11) {
            if ((i10 & 8) != 0) {
                i7--;
            }
            if (i11 <= i7) {
                return i7 - i11;
            }
            throw new IOException(X.c.e(i11, i7, "PROTOCOL_ERROR padding ", " > remaining length "));
        }
    }

    /* loaded from: classes2.dex */
    public static final class ContinuationSource implements H {

        /* renamed from: a, reason: collision with root package name */
        public final C f22811a;

        /* renamed from: b, reason: collision with root package name */
        public int f22812b;

        /* renamed from: c, reason: collision with root package name */
        public int f22813c;

        /* renamed from: d, reason: collision with root package name */
        public int f22814d;

        /* renamed from: e, reason: collision with root package name */
        public int f22815e;

        /* renamed from: f, reason: collision with root package name */
        public int f22816f;

        public ContinuationSource(C source) {
            l.e(source, "source");
            this.f22811a = source;
        }

        @Override // rc.H
        public final long O(long j, C1964h sink) {
            int i7;
            int P10;
            l.e(sink, "sink");
            do {
                int i10 = this.f22815e;
                C c10 = this.f22811a;
                if (i10 != 0) {
                    long O10 = c10.O(Math.min(j, i10), sink);
                    if (O10 == -1) {
                        return -1L;
                    }
                    this.f22815e -= (int) O10;
                    return O10;
                }
                c10.a0(this.f22816f);
                this.f22816f = 0;
                if ((this.f22813c & 4) != 0) {
                    return -1L;
                }
                i7 = this.f22814d;
                int k = _UtilCommonKt.k(c10);
                this.f22815e = k;
                this.f22812b = k;
                int F10 = c10.F() & 255;
                this.f22813c = c10.F() & 255;
                Http2Reader.f22806d.getClass();
                Logger logger = Http2Reader.f22807e;
                if (logger.isLoggable(Level.FINE)) {
                    Http2 http2 = Http2.f22755a;
                    int i11 = this.f22814d;
                    int i12 = this.f22812b;
                    int i13 = this.f22813c;
                    http2.getClass();
                    logger.fine(Http2.b(true, i11, i12, F10, i13));
                }
                P10 = c10.P() & com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
                this.f22814d = P10;
                if (F10 != 9) {
                    throw new IOException(F10 + " != TYPE_CONTINUATION");
                }
            } while (P10 == i7);
            throw new IOException("TYPE_CONTINUATION streamId changed");
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
        }

        @Override // rc.H
        public final J e() {
            return this.f22811a.f23928a.e();
        }
    }

    /* loaded from: classes2.dex */
    public interface Handler {
    }

    static {
        Logger logger = Logger.getLogger(Http2.class.getName());
        l.d(logger, "getLogger(...)");
        f22807e = logger;
    }

    public Http2Reader(C source) {
        l.e(source, "source");
        this.f22808a = source;
        ContinuationSource continuationSource = new ContinuationSource(source);
        this.f22809b = continuationSource;
        this.f22810c = new Hpack.Reader(continuationSource);
    }

    public final void F(Http2Connection.ReaderRunnable readerRunnable, int i7) {
        C c10 = this.f22808a;
        c10.P();
        c10.F();
        byte[] bArr = _UtilCommonKt.f22495a;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f22808a.close();
    }

    /* JADX WARN: Code restructure failed: missing block: B:153:0x023f, code lost:
    
        throw new java.io.IOException(h3.o.l(r11, "PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: "));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean l(boolean z8, Http2Connection.ReaderRunnable readerRunnable) {
        ErrorCode errorCode;
        Object[] array;
        C c10 = this.f22808a;
        int i7 = 0;
        try {
            c10.Z(9L);
            int k = _UtilCommonKt.k(c10);
            if (k > 16384) {
                throw new IOException(o.l(k, "FRAME_SIZE_ERROR: "));
            }
            int F10 = c10.F() & 255;
            byte F11 = c10.F();
            int i10 = F11 & 255;
            int P10 = c10.P() & com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
            Logger logger = f22807e;
            if (F10 != 8 && logger.isLoggable(Level.FINE)) {
                Http2.f22755a.getClass();
                logger.fine(Http2.b(true, P10, k, F10, i10));
            }
            if (z8 && F10 != 4) {
                StringBuilder sb2 = new StringBuilder("Expected a SETTINGS frame but was ");
                Http2.f22755a.getClass();
                sb2.append(Http2.a(F10));
                throw new IOException(sb2.toString());
            }
            Companion companion = f22806d;
            ErrorCode errorCode2 = null;
            switch (F10) {
                case 0:
                    if (P10 == 0) {
                        throw new IOException("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
                    }
                    boolean z10 = (F11 & 1) != 0;
                    if ((F11 & 32) != 0) {
                        throw new IOException("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
                    }
                    int F12 = (8 & F11) != 0 ? c10.F() & 255 : 0;
                    companion.getClass();
                    readerRunnable.b(z10, P10, c10, Companion.a(k, i10, F12));
                    c10.a0(F12);
                    return true;
                case 1:
                    if (P10 == 0) {
                        throw new IOException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
                    }
                    boolean z11 = (F11 & 1) != 0;
                    int F13 = (8 & F11) != 0 ? c10.F() & 255 : 0;
                    if ((F11 & 32) != 0) {
                        F(readerRunnable, P10);
                        k -= 5;
                    }
                    companion.getClass();
                    readerRunnable.c(P10, n(Companion.a(k, i10, F13), F13, i10, P10), z11);
                    return true;
                case 2:
                    if (k != 5) {
                        throw new IOException(A3.c.f(k, "TYPE_PRIORITY length: ", " != 5"));
                    }
                    if (P10 == 0) {
                        throw new IOException("TYPE_PRIORITY streamId == 0");
                    }
                    F(readerRunnable, P10);
                    return true;
                case 3:
                    if (k != 4) {
                        throw new IOException(A3.c.f(k, "TYPE_RST_STREAM length: ", " != 4"));
                    }
                    if (P10 == 0) {
                        throw new IOException("TYPE_RST_STREAM streamId == 0");
                    }
                    int P11 = c10.P();
                    ErrorCode.f22721b.getClass();
                    ErrorCode[] values = ErrorCode.values();
                    int length = values.length;
                    while (true) {
                        if (i7 < length) {
                            errorCode = values[i7];
                            if (errorCode.f22729a != P11) {
                                i7++;
                            }
                        } else {
                            errorCode = null;
                        }
                    }
                    if (errorCode == null) {
                        throw new IOException(o.l(P11, "TYPE_RST_STREAM unexpected error code: "));
                    }
                    readerRunnable.g(P10, errorCode);
                    return true;
                case 4:
                    if (P10 != 0) {
                        throw new IOException("TYPE_SETTINGS streamId != 0");
                    }
                    if ((F11 & 1) == 0) {
                        if (k % 6 != 0) {
                            throw new IOException(o.l(k, "TYPE_SETTINGS length % 6 != 0: "));
                        }
                        Settings settings = new Settings();
                        Xb.e F14 = h3.H.F(h3.H.I(0, k), 6);
                        int i11 = F14.f11025a;
                        int i12 = F14.f11026b;
                        int i13 = F14.f11027c;
                        if ((i13 > 0 && i11 <= i12) || (i13 < 0 && i12 <= i11)) {
                            while (true) {
                                short V7 = c10.V();
                                byte[] bArr = _UtilCommonKt.f22495a;
                                int i14 = V7 & 65535;
                                int P12 = c10.P();
                                if (i14 != 2) {
                                    if (i14 != 4) {
                                        if (i14 == 5 && (P12 < 16384 || P12 > 16777215)) {
                                        }
                                    } else if (P12 < 0) {
                                        throw new IOException("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                                    }
                                } else if (P12 != 0 && P12 != 1) {
                                    throw new IOException("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                                }
                                settings.c(i14, P12);
                                if (i11 != i12) {
                                    i11 += i13;
                                }
                            }
                        }
                        Http2Connection http2Connection = Http2Connection.this;
                        TaskQueue.b(http2Connection.f22782v, o.p(new StringBuilder(), http2Connection.f22777c, " applyAndAckSettings"), new g(1, readerRunnable, settings), 6);
                    } else if (k != 0) {
                        throw new IOException("FRAME_SIZE_ERROR ack frame should be empty!");
                    }
                    return true;
                case 5:
                    if (P10 == 0) {
                        throw new IOException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
                    }
                    int F15 = (F11 & 8) != 0 ? c10.F() & 255 : 0;
                    int P13 = c10.P() & com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
                    companion.getClass();
                    readerRunnable.e(P13, n(Companion.a(k - 4, i10, F15), F15, i10, P10));
                    return true;
                case 6:
                    if (k != 8) {
                        throw new IOException(o.l(k, "TYPE_PING length != 8: "));
                    }
                    if (P10 != 0) {
                        throw new IOException("TYPE_PING streamId != 0");
                    }
                    readerRunnable.d((F11 & 1) != 0, c10.P(), c10.P());
                    return true;
                case 7:
                    if (k < 8) {
                        throw new IOException(o.l(k, "TYPE_GOAWAY length < 8: "));
                    }
                    if (P10 != 0) {
                        throw new IOException("TYPE_GOAWAY streamId != 0");
                    }
                    int P14 = c10.P();
                    int P15 = c10.P();
                    int i15 = k - 8;
                    ErrorCode.f22721b.getClass();
                    ErrorCode[] values2 = ErrorCode.values();
                    int length2 = values2.length;
                    int i16 = 0;
                    while (true) {
                        if (i16 < length2) {
                            ErrorCode errorCode3 = values2[i16];
                            if (errorCode3.f22729a == P15) {
                                errorCode2 = errorCode3;
                            } else {
                                i16++;
                            }
                        }
                    }
                    if (errorCode2 == null) {
                        throw new IOException(o.l(P15, "TYPE_GOAWAY unexpected error code: "));
                    }
                    C1967k debugData = C1967k.f23967d;
                    if (i15 > 0) {
                        debugData = c10.K(i15);
                    }
                    l.e(debugData, "debugData");
                    debugData.f();
                    Http2Connection http2Connection2 = Http2Connection.this;
                    synchronized (http2Connection2) {
                        array = http2Connection2.f22776b.values().toArray(new Http2Stream[0]);
                        http2Connection2.f22780f = true;
                    }
                    for (Http2Stream http2Stream : (Http2Stream[]) array) {
                        if (http2Stream.f22819a > P14 && http2Stream.g()) {
                            ErrorCode errorCode4 = ErrorCode.f22726u;
                            synchronized (http2Stream) {
                                if (http2Stream.f() == null) {
                                    http2Stream.f22830z = errorCode4;
                                    http2Stream.notifyAll();
                                }
                            }
                            Http2Connection.this.F(http2Stream.f22819a);
                        }
                    }
                    return true;
                case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                    try {
                        if (k != 4) {
                            throw new IOException("TYPE_WINDOW_UPDATE length !=4: " + k);
                        }
                        long P16 = c10.P() & 2147483647L;
                        if (P16 == 0) {
                            throw new IOException("windowSizeIncrement was 0");
                        }
                        if (logger.isLoggable(Level.FINE)) {
                            Http2.f22755a.getClass();
                            logger.fine(Http2.c(P10, k, P16, true));
                        }
                        if (P10 == 0) {
                            Http2Connection http2Connection3 = Http2Connection.this;
                            synchronized (http2Connection3) {
                                http2Connection3.f22771J += P16;
                                http2Connection3.notifyAll();
                            }
                        } else {
                            Http2Stream n6 = Http2Connection.this.n(P10);
                            if (n6 != null) {
                                synchronized (n6) {
                                    n6.f22823e += P16;
                                    if (P16 > 0) {
                                        n6.notifyAll();
                                    }
                                }
                            }
                        }
                        return true;
                    } catch (Exception e2) {
                        Http2.f22755a.getClass();
                        logger.fine(Http2.b(true, P10, k, 8, i10));
                        throw e2;
                    }
                default:
                    c10.a0(k);
                    return true;
            }
        } catch (EOFException unused) {
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00f4, code lost:
    
        throw new java.io.IOException("Invalid dynamic table size update " + r7.f22742a);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List n(int i7, int i10, int i11, int i12) {
        int e2;
        ContinuationSource continuationSource = this.f22809b;
        continuationSource.f22815e = i7;
        continuationSource.f22812b = i7;
        continuationSource.f22816f = i10;
        continuationSource.f22813c = i11;
        continuationSource.f22814d = i12;
        while (true) {
            Hpack.Reader reader = this.f22810c;
            C c10 = reader.f22744c;
            boolean l10 = c10.l();
            ArrayList arrayList = reader.f22743b;
            if (l10) {
                List s02 = Eb.o.s0(arrayList);
                arrayList.clear();
                return s02;
            }
            byte F10 = c10.F();
            byte[] bArr = _UtilCommonKt.f22495a;
            int i13 = F10 & 255;
            if (i13 == 128) {
                throw new IOException("index == 0");
            }
            if ((F10 & 128) == 128) {
                e2 = reader.e(i13, 127);
                int i14 = e2 - 1;
                if (i14 >= 0) {
                    Hpack hpack = Hpack.f22739a;
                    hpack.getClass();
                    Header[] headerArr = Hpack.f22740b;
                    if (i14 <= headerArr.length - 1) {
                        hpack.getClass();
                        arrayList.add(headerArr[i14]);
                    }
                }
                Hpack.f22739a.getClass();
                int length = reader.f22746e + 1 + (i14 - Hpack.f22740b.length);
                if (length < 0) {
                    break;
                }
                Header[] headerArr2 = reader.f22745d;
                if (length >= headerArr2.length) {
                    break;
                }
                Header header = headerArr2[length];
                l.b(header);
                arrayList.add(header);
            } else if (i13 == 64) {
                Hpack hpack2 = Hpack.f22739a;
                C1967k d10 = reader.d();
                hpack2.getClass();
                Hpack.a(d10);
                reader.c(new Header(d10, reader.d()));
            } else if ((F10 & 64) == 64) {
                reader.c(new Header(reader.b(reader.e(i13, 63) - 1), reader.d()));
            } else if ((F10 & 32) == 32) {
                int e10 = reader.e(i13, 31);
                reader.f22742a = e10;
                if (e10 < 0 || e10 > 4096) {
                    break;
                }
                int i15 = reader.g;
                if (e10 < i15) {
                    if (e10 == 0) {
                        n.U(r8, null, 0, reader.f22745d.length);
                        reader.f22746e = reader.f22745d.length - 1;
                        reader.f22747f = 0;
                        reader.g = 0;
                    } else {
                        reader.a(i15 - e10);
                    }
                }
            } else if (i13 == 16 || i13 == 0) {
                Hpack hpack3 = Hpack.f22739a;
                C1967k d11 = reader.d();
                hpack3.getClass();
                Hpack.a(d11);
                arrayList.add(new Header(d11, reader.d()));
            } else {
                arrayList.add(new Header(reader.b(reader.e(i13, 15) - 1), reader.d()));
            }
        }
        throw new IOException(o.l(e2, "Header index too large "));
    }
}
