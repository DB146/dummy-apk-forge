package J7;

import h3.H;
import java.io.IOException;
import java.net.URI;
import java.util.HashMap;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import o.Y0;

/* loaded from: classes.dex */
public final class w {
    public static long k;

    /* renamed from: a, reason: collision with root package name */
    public q3.c f5646a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f5647b = false;

    /* renamed from: c, reason: collision with root package name */
    public boolean f5648c = false;

    /* renamed from: d, reason: collision with root package name */
    public long f5649d = 0;

    /* renamed from: e, reason: collision with root package name */
    public K7.b f5650e;

    /* renamed from: f, reason: collision with root package name */
    public final B4.j f5651f;
    public ScheduledFuture g;

    /* renamed from: h, reason: collision with root package name */
    public ScheduledFuture f5652h;

    /* renamed from: i, reason: collision with root package name */
    public final O7.b f5653i;
    public final Q7.h j;

    public w(Y0 y02, P3.p pVar, String str, String str2, B4.j jVar, String str3) {
        this.f5653i = (O7.b) y02.f21463a;
        this.f5651f = jVar;
        long j = k;
        k = 1 + j;
        this.j = new Q7.h((A7.a) y02.f21466d, "WebSocket", A3.c.h("ws_", j), 4);
        str = str == null ? (String) pVar.f7842c : str;
        String str4 = pVar.f7841b ? "wss" : "ws";
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str4);
        sb2.append("://");
        sb2.append(str);
        sb2.append("/.ws?ns=");
        String p10 = h3.o.p(sb2, (String) pVar.f7843d, "&v=5");
        URI create = URI.create(str3 != null ? X.c.i(p10, "&ls=", str3) : p10);
        HashMap hashMap = new HashMap();
        hashMap.put("User-Agent", (String) y02.f21467e);
        hashMap.put("X-Firebase-GMPID", (String) y02.f21468f);
        hashMap.put("X-Firebase-AppCheck", str2);
        this.f5646a = new q3.c(this, new U7.d(y02, create, hashMap));
    }

    public static void a(w wVar) {
        if (!wVar.f5648c) {
            Q7.h hVar = wVar.j;
            if (hVar.H()) {
                hVar.p("closing itself", null, new Object[0]);
            }
            wVar.f();
        }
        wVar.f5646a = null;
        ScheduledFuture scheduledFuture = wVar.g;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
    }

    public final void b(String str) {
        Q7.h hVar = this.j;
        K7.b bVar = this.f5650e;
        if (bVar.f6210u) {
            throw new IllegalStateException("Trying to add string after reading");
        }
        if (str.length() > 0) {
            bVar.f6204a.add(str);
        }
        long j = this.f5649d - 1;
        this.f5649d = j;
        if (j == 0) {
            try {
                K7.b bVar2 = this.f5650e;
                if (bVar2.f6210u) {
                    throw new IllegalStateException("Trying to freeze frozen StringListReader");
                }
                bVar2.f6210u = true;
                HashMap B10 = H.B(bVar2.toString());
                this.f5650e = null;
                if (hVar.H()) {
                    hVar.p("handleIncomingFrame complete frame: " + B10, null, new Object[0]);
                }
                this.f5651f.x(B10);
            } catch (IOException e2) {
                hVar.u("Error parsing frame: " + this.f5650e.toString(), e2);
                c();
                f();
            } catch (ClassCastException e10) {
                hVar.u("Error parsing frame (cast error): " + this.f5650e.toString(), e10);
                c();
                f();
            }
        }
    }

    public final void c() {
        Q7.h hVar = this.j;
        if (hVar.H()) {
            hVar.p("websocket is being closed", null, new Object[0]);
        }
        this.f5648c = true;
        ((U7.d) this.f5646a.f23371b).a();
        ScheduledFuture scheduledFuture = this.f5652h;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        ScheduledFuture scheduledFuture2 = this.g;
        if (scheduledFuture2 != null) {
            scheduledFuture2.cancel(true);
        }
    }

    public final void d(int i7) {
        this.f5649d = i7;
        this.f5650e = new K7.b();
        Q7.h hVar = this.j;
        if (hVar.H()) {
            hVar.p("HandleNewFrameCount: " + this.f5649d, null, new Object[0]);
        }
    }

    public final void e() {
        if (this.f5648c) {
            return;
        }
        ScheduledFuture scheduledFuture = this.g;
        Q7.h hVar = this.j;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            if (hVar.H()) {
                hVar.p("Reset keepAlive. Remaining: " + this.g.getDelay(TimeUnit.MILLISECONDS), null, new Object[0]);
            }
        } else if (hVar.H()) {
            hVar.p("Reset keepAlive", null, new Object[0]);
        }
        this.g = this.f5653i.schedule(new u(this, 1), 45000L, TimeUnit.MILLISECONDS);
    }

    public final void f() {
        this.f5648c = true;
        boolean z8 = this.f5647b;
        B4.j jVar = this.f5651f;
        jVar.f2091d = null;
        Q7.h hVar = (Q7.h) jVar.f2093f;
        if (z8 || jVar.f2089b != 1) {
            if (hVar.H()) {
                hVar.p("Realtime connection lost", null, new Object[0]);
            }
        } else if (hVar.H()) {
            hVar.p("Realtime connection failed", null, new Object[0]);
        }
        jVar.f(2);
    }
}
