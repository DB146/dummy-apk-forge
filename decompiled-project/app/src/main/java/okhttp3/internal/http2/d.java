package okhttp3.internal.http2;

import Db.q;
import java.io.IOException;
import java.util.List;
import okhttp3.internal.http2.Http2Connection;
import okhttp3.internal.http2.PushObserver;

/* loaded from: classes2.dex */
public final /* synthetic */ class d implements Rb.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22869a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Http2Connection f22870b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f22871c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f22872d;

    public /* synthetic */ d(Http2Connection http2Connection, int i7, Object obj, int i10) {
        this.f22869a = i10;
        this.f22870b = http2Connection;
        this.f22871c = i7;
        this.f22872d = obj;
    }

    public /* synthetic */ d(Http2Connection http2Connection, int i7, List list, boolean z8) {
        this.f22869a = 1;
        this.f22870b = http2Connection;
        this.f22871c = i7;
        this.f22872d = list;
    }

    @Override // Rb.a
    public final Object invoke() {
        switch (this.f22869a) {
            case 0:
                Http2Connection http2Connection = this.f22870b;
                int i7 = this.f22871c;
                ((PushObserver.Companion.PushObserverCancel) http2Connection.f22785y).getClass();
                try {
                    http2Connection.L.U(i7, ErrorCode.f22727v);
                    synchronized (http2Connection) {
                        http2Connection.f22774N.remove(Integer.valueOf(i7));
                    }
                } catch (IOException unused) {
                }
                return q.f3365a;
            case 1:
                Http2Connection http2Connection2 = this.f22870b;
                int i10 = this.f22871c;
                ((PushObserver.Companion.PushObserverCancel) http2Connection2.f22785y).getClass();
                try {
                    http2Connection2.L.U(i10, ErrorCode.f22727v);
                    synchronized (http2Connection2) {
                        http2Connection2.f22774N.remove(Integer.valueOf(i10));
                    }
                } catch (IOException unused2) {
                }
                return q.f3365a;
            default:
                Http2Connection http2Connection3 = this.f22870b;
                int i11 = this.f22871c;
                ErrorCode errorCode = (ErrorCode) this.f22872d;
                Http2Connection.Companion companion = Http2Connection.f22760O;
                try {
                    http2Connection3.L.U(i11, errorCode);
                } catch (IOException e2) {
                    http2Connection3.getClass();
                    ErrorCode errorCode2 = ErrorCode.f22723d;
                    http2Connection3.l(errorCode2, errorCode2, e2);
                }
                return q.f3365a;
        }
    }
}
