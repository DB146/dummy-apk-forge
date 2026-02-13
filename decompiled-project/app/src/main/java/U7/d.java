package U7;

import B0.C;
import J7.v;
import J7.w;
import Q7.h;
import android.net.SSLCertificateSocketFactory;
import android.net.SSLSessionCache;
import android.util.Base64;
import h3.o;
import java.io.File;
import java.io.IOException;
import java.net.Socket;
import java.net.URI;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocket;
import o.Y0;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: l, reason: collision with root package name */
    public static final AtomicInteger f9823l = new AtomicInteger(0);

    /* renamed from: m, reason: collision with root package name */
    public static final Charset f9824m = Charset.forName("UTF-8");

    /* renamed from: n, reason: collision with root package name */
    public static final ThreadFactory f9825n = Executors.defaultThreadFactory();

    /* renamed from: o, reason: collision with root package name */
    public static final h8.e f9826o = new h8.e(15);

    /* renamed from: a, reason: collision with root package name */
    public volatile int f9827a = 1;

    /* renamed from: b, reason: collision with root package name */
    public volatile Socket f9828b = null;

    /* renamed from: c, reason: collision with root package name */
    public q3.c f9829c = null;

    /* renamed from: d, reason: collision with root package name */
    public final URI f9830d;

    /* renamed from: e, reason: collision with root package name */
    public final String f9831e;

    /* renamed from: f, reason: collision with root package name */
    public final f f9832f;
    public final g g;

    /* renamed from: h, reason: collision with root package name */
    public final h f9833h;

    /* renamed from: i, reason: collision with root package name */
    public final h f9834i;
    public final int j;
    public final Thread k;

    /* JADX WARN: Type inference failed for: r8v4, types: [java.lang.Object, U7.f] */
    public d(Y0 y02, URI uri, HashMap hashMap) {
        int incrementAndGet = f9823l.incrementAndGet();
        this.j = incrementAndGet;
        this.k = f9825n.newThread(new C(this, 11));
        this.f9830d = uri;
        this.f9831e = (String) y02.g;
        this.f9834i = new h((A7.a) y02.f21466d, "WebSocket", o.l(incrementAndGet, "sk_"), 4);
        h hVar = new h(5, (char) 0);
        hVar.f8696c = null;
        hVar.f8695b = uri;
        hVar.f8697d = hashMap;
        byte[] bArr = new byte[16];
        for (int i7 = 0; i7 < 16; i7++) {
            bArr[i7] = (byte) ((Math.random() * 255) + 0);
        }
        hVar.f8696c = Base64.encodeToString(bArr, 2);
        this.f9833h = hVar;
        ?? obj = new Object();
        obj.f9835a = null;
        obj.f9836b = null;
        obj.f9837c = null;
        obj.f9838d = new byte[112];
        obj.f9840f = false;
        obj.f9836b = this;
        this.f9832f = obj;
        this.g = new g(this, this.j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.RuntimeException, U7.e] */
    public final synchronized void a() {
        int b2 = P.c.b(this.f9827a);
        if (b2 == 0) {
            this.f9827a = 5;
            return;
        }
        if (b2 == 1) {
            b();
            return;
        }
        if (b2 != 2) {
            if (b2 != 3) {
                if (b2 != 4) {
                    return;
                } else {
                    return;
                }
            }
            return;
        }
        try {
            this.f9827a = 4;
            this.g.f9843c = true;
            this.g.b((byte) 8, new byte[0]);
        } catch (IOException e2) {
            this.f9829c.t(new RuntimeException("Failed to send close frame", e2));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.RuntimeException, U7.e] */
    public final synchronized void b() {
        if (this.f9827a == 5) {
            return;
        }
        this.f9832f.f9840f = true;
        this.g.f9843c = true;
        if (this.f9828b != null) {
            try {
                this.f9828b.close();
            } catch (Exception e2) {
                this.f9829c.t(new RuntimeException("Failed to close", e2));
            }
        }
        this.f9827a = 5;
        q3.c cVar = this.f9829c;
        ((w) cVar.f23372c).f5653i.execute(new v(cVar, 1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.RuntimeException, U7.e] */
    public final synchronized void c() {
        if (this.f9827a != 1) {
            this.f9829c.t(new RuntimeException("connect() already called"));
            a();
            return;
        }
        h8.e eVar = f9826o;
        Thread thread = this.k;
        String str = "TubeSockReader-" + this.j;
        eVar.getClass();
        thread.setName(str);
        this.f9827a = 2;
        this.k.start();
    }

    public final Socket d() {
        URI uri = this.f9830d;
        String scheme = uri.getScheme();
        String host = uri.getHost();
        int port = uri.getPort();
        if (scheme != null && scheme.equals("ws")) {
            if (port == -1) {
                port = 80;
            }
            try {
                return new Socket(host, port);
            } catch (UnknownHostException e2) {
                throw new RuntimeException(X.c.t("unknown host: ", host), e2);
            } catch (IOException e10) {
                throw new RuntimeException("error while creating socket to " + uri, e10);
            }
        }
        if (scheme == null || !scheme.equals("wss")) {
            throw new RuntimeException(X.c.t("unsupported protocol: ", scheme));
        }
        if (port == -1) {
            port = 443;
        }
        SSLSessionCache sSLSessionCache = null;
        String str = this.f9831e;
        if (str != null) {
            try {
                sSLSessionCache = new SSLSessionCache(new File(str));
            } catch (IOException e11) {
                this.f9834i.p("Failed to initialize SSL session cache", e11, new Object[0]);
            }
        }
        try {
            SSLSocket sSLSocket = (SSLSocket) SSLCertificateSocketFactory.getDefault(60000, sSLSessionCache).createSocket(host, port);
            if (HttpsURLConnection.getDefaultHostnameVerifier().verify(host, sSLSocket.getSession())) {
                return sSLSocket;
            }
            throw new RuntimeException("Error while verifying secure socket to " + uri);
        } catch (UnknownHostException e12) {
            throw new RuntimeException(X.c.t("unknown host: ", host), e12);
        } catch (IOException e13) {
            throw new RuntimeException("error while creating secure socket to " + uri, e13);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.RuntimeException, U7.e] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.RuntimeException, U7.e] */
    public final synchronized void e(byte b2, byte[] bArr) {
        if (this.f9827a != 3) {
            this.f9829c.t(new RuntimeException("error while sending data: not connected"));
        } else {
            try {
                this.g.b(b2, bArr);
            } catch (IOException e2) {
                this.f9829c.t(new RuntimeException("Failed to send frame", e2));
                a();
            }
        }
    }
}
