package okhttp3.internal.platform;

import Eb.p;
import android.os.Build;
import android.util.Log;
import h3.o;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.l;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.internal.platform.android.AndroidLog;
import okhttp3.internal.platform.android.AndroidLogHandler;
import okhttp3.internal.tls.BasicCertificateChainCleaner;
import okhttp3.internal.tls.BasicTrustRootIndex;
import okhttp3.internal.tls.CertificateChainCleaner;
import okhttp3.internal.tls.TrustRootIndex;

/* loaded from: classes2.dex */
public class Platform {

    /* renamed from: a, reason: collision with root package name */
    public static final Companion f22897a = new Companion(0);

    /* renamed from: b, reason: collision with root package name */
    public static volatile Platform f22898b;

    /* renamed from: c, reason: collision with root package name */
    public static final Logger f22899c;

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(int i7) {
            this();
        }

        public static ArrayList a(List protocols) {
            l.e(protocols, "protocols");
            ArrayList arrayList = new ArrayList();
            for (Object obj : protocols) {
                if (((Protocol) obj) != Protocol.f22415c) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(p.S(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((Protocol) it.next()).f22423a);
            }
            return arrayList2;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, rc.h] */
        public static byte[] b(List protocols) {
            l.e(protocols, "protocols");
            ?? obj = new Object();
            Iterator it = a(protocols).iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                obj.l0(str.length());
                obj.r0(str);
            }
            return obj.W(obj.f23966b);
        }
    }

    static {
        PlatformRegistry.f22900a.getClass();
        AndroidLog.f22905a.getClass();
        try {
            for (Map.Entry entry : AndroidLog.f22907c.entrySet()) {
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                Logger logger = Logger.getLogger(str);
                if (AndroidLog.f22906b.add(logger)) {
                    logger.setUseParentHandlers(false);
                    logger.setLevel(Log.isLoggable(str2, 3) ? Level.FINE : Log.isLoggable(str2, 4) ? Level.INFO : Level.WARNING);
                    logger.addHandler(AndroidLogHandler.f22908a);
                }
            }
        } catch (RuntimeException e2) {
            e2.printStackTrace();
        }
        Android10Platform.f22888e.getClass();
        Platform android10Platform = Android10Platform.f22889f ? new Android10Platform() : null;
        if (android10Platform == null) {
            AndroidPlatform.f22891e.getClass();
            android10Platform = AndroidPlatform.g ? new AndroidPlatform() : null;
        }
        if (android10Platform == null) {
            throw new IllegalStateException(o.l(Build.VERSION.SDK_INT, "Expected Android API level 21+ but was "));
        }
        f22898b = android10Platform;
        f22899c = Logger.getLogger(OkHttpClient.class.getName());
    }

    public CertificateChainCleaner a(X509TrustManager x509TrustManager) {
        return new BasicCertificateChainCleaner(b(x509TrustManager));
    }

    public TrustRootIndex b(X509TrustManager x509TrustManager) {
        X509Certificate[] acceptedIssuers = x509TrustManager.getAcceptedIssuers();
        return new BasicTrustRootIndex((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
    }

    public void c(SSLSocket sSLSocket, String str, List protocols) {
        l.e(protocols, "protocols");
    }

    public void d(Socket socket, InetSocketAddress address, int i7) {
        l.e(address, "address");
        socket.connect(address, i7);
    }

    public String e(SSLSocket sSLSocket) {
        return null;
    }

    public Object f() {
        if (f22899c.isLoggable(Level.FINE)) {
            return new Throwable("response.body().close()");
        }
        return null;
    }

    public boolean g(String hostname) {
        l.e(hostname, "hostname");
        return true;
    }

    public void h(int i7, String message, Throwable th) {
        l.e(message, "message");
        f22899c.log(i7 == 5 ? Level.WARNING : Level.INFO, message, th);
    }

    public void i(Object obj, String message) {
        l.e(message, "message");
        if (obj == null) {
            message = message.concat(" To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
        }
        h(5, message, (Throwable) obj);
    }

    public SSLContext j() {
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        l.d(sSLContext, "getInstance(...)");
        return sSLContext;
    }

    public final String toString() {
        return getClass().getSimpleName();
    }
}
