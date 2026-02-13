package okhttp3.internal.http2;

import Eb.n;
import h3.o;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.l;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal.concurrent.Lockable;
import okhttp3.internal.http2.Hpack;
import rc.B;
import rc.C1964h;

/* loaded from: classes2.dex */
public final class Http2Writer implements Closeable, Lockable {

    /* renamed from: f, reason: collision with root package name */
    public static final Logger f22842f;

    /* renamed from: a, reason: collision with root package name */
    public final B f22843a;

    /* renamed from: b, reason: collision with root package name */
    public final C1964h f22844b;

    /* renamed from: c, reason: collision with root package name */
    public int f22845c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f22846d;

    /* renamed from: e, reason: collision with root package name */
    public final Hpack.Writer f22847e;

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
        f22842f = Logger.getLogger(Http2.class.getName());
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, rc.h] */
    public Http2Writer(B sink) {
        l.e(sink, "sink");
        this.f22843a = sink;
        ?? obj = new Object();
        this.f22844b = obj;
        this.f22845c = 16384;
        this.f22847e = new Hpack.Writer(obj);
    }

    public final void F(int i7, int i10, int i11, int i12) {
        if (i11 != 8) {
            Level level = Level.FINE;
            Logger logger = f22842f;
            if (logger.isLoggable(level)) {
                Http2.f22755a.getClass();
                logger.fine(Http2.b(false, i7, i10, i11, i12));
            }
        }
        if (i10 > this.f22845c) {
            throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.f22845c + ": " + i10).toString());
        }
        if ((Integer.MIN_VALUE & i7) != 0) {
            throw new IllegalArgumentException(o.l(i7, "reserved bit set: ").toString());
        }
        byte[] bArr = _UtilCommonKt.f22495a;
        B b2 = this.f22843a;
        l.e(b2, "<this>");
        b2.n((i10 >>> 16) & 255);
        b2.n((i10 >>> 8) & 255);
        b2.n(i10 & 255);
        b2.n(i11 & 255);
        b2.n(i12 & 255);
        b2.F(i7 & com.google.android.gms.common.api.f.API_PRIORITY_OTHER);
    }

    public final void K(int i7, ErrorCode errorCode, byte[] bArr) {
        synchronized (this) {
            if (this.f22846d) {
                throw new IOException("closed");
            }
            if (errorCode.f22729a == -1) {
                throw new IllegalArgumentException("errorCode.httpCode == -1");
            }
            F(0, bArr.length + 8, 7, 0);
            this.f22843a.F(i7);
            this.f22843a.F(errorCode.f22729a);
            if (bArr.length != 0) {
                B b2 = this.f22843a;
                if (b2.f23927c) {
                    throw new IllegalStateException("closed");
                }
                b2.f23926b.j0(bArr, 0, bArr.length);
                b2.l();
            }
            this.f22843a.flush();
        }
    }

    public final void P(boolean z8, int i7, ArrayList arrayList) {
        synchronized (this) {
            if (this.f22846d) {
                throw new IOException("closed");
            }
            this.f22847e.d(arrayList);
            long j = this.f22844b.f23966b;
            long min = Math.min(this.f22845c, j);
            int i10 = j == min ? 4 : 0;
            if (z8) {
                i10 |= 1;
            }
            F(i7, (int) min, 1, i10);
            this.f22843a.m(min, this.f22844b);
            if (j > min) {
                long j10 = j - min;
                while (j10 > 0) {
                    long min2 = Math.min(this.f22845c, j10);
                    j10 -= min2;
                    F(i7, (int) min2, 9, j10 == 0 ? 4 : 0);
                    this.f22843a.m(min2, this.f22844b);
                }
            }
        }
    }

    public final void T(boolean z8, int i7, int i10) {
        synchronized (this) {
            if (this.f22846d) {
                throw new IOException("closed");
            }
            F(0, 8, 6, z8 ? 1 : 0);
            this.f22843a.F(i7);
            this.f22843a.F(i10);
            this.f22843a.flush();
        }
    }

    public final void U(int i7, ErrorCode errorCode) {
        synchronized (this) {
            if (this.f22846d) {
                throw new IOException("closed");
            }
            if (errorCode.f22729a == -1) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            F(i7, 4, 3, 0);
            this.f22843a.F(errorCode.f22729a);
            this.f22843a.flush();
        }
    }

    public final void V(int i7, long j) {
        synchronized (this) {
            try {
                if (this.f22846d) {
                    throw new IOException("closed");
                }
                if (j == 0 || j > 2147483647L) {
                    throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j).toString());
                }
                Logger logger = f22842f;
                if (logger.isLoggable(Level.FINE)) {
                    Http2.f22755a.getClass();
                    logger.fine(Http2.c(i7, 4, j, false));
                }
                F(i7, 4, 8, 0);
                this.f22843a.F((int) j);
                this.f22843a.flush();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this) {
            this.f22846d = true;
            this.f22843a.close();
        }
    }

    public final void flush() {
        synchronized (this) {
            if (this.f22846d) {
                throw new IOException("closed");
            }
            this.f22843a.flush();
        }
    }

    public final void l(Settings peerSettings) {
        l.e(peerSettings, "peerSettings");
        synchronized (this) {
            try {
                if (this.f22846d) {
                    throw new IOException("closed");
                }
                int i7 = this.f22845c;
                int i10 = peerSettings.f22857a;
                if ((i10 & 32) != 0) {
                    i7 = peerSettings.f22858b[5];
                }
                this.f22845c = i7;
                if (((i10 & 2) != 0 ? peerSettings.f22858b[1] : -1) != -1) {
                    Hpack.Writer writer = this.f22847e;
                    int i11 = (i10 & 2) != 0 ? peerSettings.f22858b[1] : -1;
                    writer.getClass();
                    int min = Math.min(i11, 16384);
                    int i12 = writer.f22751d;
                    if (i12 != min) {
                        if (min < i12) {
                            writer.f22749b = Math.min(writer.f22749b, min);
                        }
                        writer.f22750c = true;
                        writer.f22751d = min;
                        int i13 = writer.f22754h;
                        if (min < i13) {
                            if (min == 0) {
                                Header[] headerArr = writer.f22752e;
                                n.U(headerArr, null, 0, headerArr.length);
                                writer.f22753f = writer.f22752e.length - 1;
                                writer.g = 0;
                                writer.f22754h = 0;
                            } else {
                                writer.a(i13 - min);
                            }
                        }
                    }
                }
                F(0, 0, 4, 1);
                this.f22843a.flush();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void n(boolean z8, int i7, C1964h c1964h, int i10) {
        synchronized (this) {
            if (this.f22846d) {
                throw new IOException("closed");
            }
            F(i7, i10, 0, z8 ? 1 : 0);
            if (i10 > 0) {
                l.b(c1964h);
                this.f22843a.m(i10, c1964h);
            }
        }
    }
}
