package okhttp3.internal.http2;

import java.io.IOException;
import okhttp3.internal.http2.Http2Connection;

/* loaded from: classes2.dex */
public final /* synthetic */ class b implements Rb.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Http2Connection f22864a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f22865b;

    public /* synthetic */ b(Http2Connection http2Connection, long j) {
        this.f22864a = http2Connection;
        this.f22865b = j;
    }

    @Override // Rb.a
    public final Object invoke() {
        boolean z8;
        Http2Connection http2Connection = this.f22864a;
        long j = this.f22865b;
        Http2Connection.Companion companion = Http2Connection.f22760O;
        synchronized (http2Connection) {
            long j10 = http2Connection.f22762A;
            long j11 = http2Connection.f22786z;
            if (j10 < j11) {
                z8 = true;
            } else {
                http2Connection.f22786z = j11 + 1;
                z8 = false;
            }
        }
        if (z8) {
            ErrorCode errorCode = ErrorCode.f22723d;
            http2Connection.l(errorCode, errorCode, null);
            j = -1;
        } else {
            try {
                http2Connection.L.T(false, 1, 0);
            } catch (IOException e2) {
                ErrorCode errorCode2 = ErrorCode.f22723d;
                http2Connection.l(errorCode2, errorCode2, e2);
            }
        }
        return Long.valueOf(j);
    }
}
