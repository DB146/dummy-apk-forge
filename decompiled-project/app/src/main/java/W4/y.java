package W4;

import N6.t0;
import java.io.Closeable;
import java.net.Socket;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import m5.J;
import n5.AbstractC1705a;

/* loaded from: classes.dex */
public final class y implements Closeable {

    /* renamed from: u, reason: collision with root package name */
    public static final Charset f10800u = M6.e.f6799c;

    /* renamed from: a, reason: collision with root package name */
    public final q3.s f10801a;

    /* renamed from: b, reason: collision with root package name */
    public final J f10802b = new J("ExoPlayer:RtspMessageChannel:ReceiverLoader");

    /* renamed from: c, reason: collision with root package name */
    public final Map f10803c = Collections.synchronizedMap(new HashMap());

    /* renamed from: d, reason: collision with root package name */
    public x f10804d;

    /* renamed from: e, reason: collision with root package name */
    public Socket f10805e;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f10806f;

    public y(q3.s sVar) {
        this.f10801a = sVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f10806f) {
            return;
        }
        try {
            x xVar = this.f10804d;
            if (xVar != null) {
                xVar.close();
            }
            this.f10802b.e(null);
            Socket socket = this.f10805e;
            if (socket != null) {
                socket.close();
            }
            this.f10806f = true;
        } catch (Throwable th) {
            this.f10806f = true;
            throw th;
        }
    }

    public final void l(Socket socket) {
        this.f10805e = socket;
        this.f10804d = new x(this, socket.getOutputStream());
        this.f10802b.f(new w(this, socket.getInputStream()), new R7.a(this, 11), 0);
    }

    public final void n(t0 t0Var) {
        AbstractC1705a.n(this.f10804d);
        x xVar = this.f10804d;
        xVar.getClass();
        xVar.f10798c.post(new Aa.j(xVar, new D7.a(z.f10813h, 1).f(t0Var).getBytes(f10800u), t0Var, 11));
    }
}
