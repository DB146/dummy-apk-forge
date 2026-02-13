package okhttp3.internal.http2;

import Db.o;
import Db.q;
import android.os.Message;
import java.io.IOException;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.v;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.http2.Http2Connection;
import okhttp3.internal.platform.Platform;
import v2.C2133e;
import w2.r;
import y9.AbstractC2456A;
import y9.t;

/* loaded from: classes2.dex */
public final /* synthetic */ class g implements Rb.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22881a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f22882b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f22883c;

    public /* synthetic */ g(int i7, Object obj, Object obj2) {
        this.f22881a = i7;
        this.f22882b = obj;
        this.f22883c = obj2;
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [kotlin.jvm.internal.v, java.lang.Object] */
    @Override // Rb.a
    public final Object invoke() {
        long a9;
        Http2Stream[] http2StreamArr = null;
        switch (this.f22881a) {
            case 0:
                Http2Connection http2Connection = (Http2Connection) this.f22882b;
                Http2Stream http2Stream = (Http2Stream) this.f22883c;
                try {
                    http2Connection.f22775a.b(http2Stream);
                } catch (IOException e2) {
                    Platform.f22897a.getClass();
                    Platform.f22898b.h(4, "Http2Connection.Listener failure for " + http2Connection.f22777c, e2);
                    try {
                        http2Stream.c(ErrorCode.f22723d, e2);
                    } catch (IOException unused) {
                    }
                }
                return q.f3365a;
            case 1:
                Http2Connection.ReaderRunnable readerRunnable = (Http2Connection.ReaderRunnable) this.f22882b;
                Settings settings = (Settings) this.f22883c;
                readerRunnable.getClass();
                ?? obj = new Object();
                Http2Connection http2Connection2 = Http2Connection.this;
                synchronized (http2Connection2.L) {
                    synchronized (http2Connection2) {
                        try {
                            Settings settings2 = http2Connection2.f22768G;
                            Settings settings3 = new Settings();
                            settings3.b(settings2);
                            settings3.b(settings);
                            obj.f19134a = settings3;
                            a9 = settings3.a() - settings2.a();
                            if (a9 != 0 && !http2Connection2.f22776b.isEmpty()) {
                                http2StreamArr = (Http2Stream[]) http2Connection2.f22776b.values().toArray(new Http2Stream[0]);
                            }
                            Settings settings4 = (Settings) obj.f19134a;
                            l.e(settings4, "<set-?>");
                            http2Connection2.f22768G = settings4;
                            TaskQueue.b(http2Connection2.f22784x, http2Connection2.f22777c + " onSettings", new g(2, http2Connection2, obj), 6);
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    try {
                        http2Connection2.L.l((Settings) obj.f19134a);
                    } catch (IOException e10) {
                        ErrorCode errorCode = ErrorCode.f22723d;
                        http2Connection2.l(errorCode, errorCode, e10);
                    }
                }
                if (http2StreamArr != null) {
                    for (Http2Stream http2Stream2 : http2StreamArr) {
                        synchronized (http2Stream2) {
                            http2Stream2.f22823e += a9;
                            if (a9 > 0) {
                                http2Stream2.notifyAll();
                            }
                        }
                    }
                }
                return q.f3365a;
            case 2:
                Http2Connection http2Connection3 = (Http2Connection) this.f22882b;
                http2Connection3.f22775a.a(http2Connection3, (Settings) ((v) this.f22883c).f19134a);
                return q.f3365a;
            case 3:
                ((r) this.f22882b).e((C2133e) this.f22883c, false);
                return q.f3365a;
            default:
                o oVar = AbstractC2456A.g2;
                AbstractC2456A abstractC2456A = (AbstractC2456A) this.f22882b;
                abstractC2456A.M0().a();
                t tVar = abstractC2456A.f27459d2;
                if (tVar == t.f27537d || tVar == t.f27535b || tVar == t.f27534a) {
                    abstractC2456A.N0(t.f27534a, false, null);
                } else {
                    Message.obtain(abstractC2456A.K0(), 1000).sendToTarget();
                }
                ((Rb.a) this.f22883c).invoke();
                return q.f3365a;
        }
    }
}
