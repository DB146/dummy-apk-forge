package okhttp3.internal.platform;

import Eb.n;
import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.os.StrictMode;
import android.security.NetworkSecurityPolicy;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.l;
import okhttp3.OkHttpClient;
import okhttp3.internal.SuppressSignatureCheck;
import okhttp3.internal.platform.android.AndroidCertificateChainCleaner;
import okhttp3.internal.platform.android.AndroidLog;
import okhttp3.internal.platform.android.AndroidSocketAdapter;
import okhttp3.internal.platform.android.BouncyCastleSocketAdapter;
import okhttp3.internal.platform.android.ConscryptSocketAdapter;
import okhttp3.internal.platform.android.DeferredSocketAdapter;
import okhttp3.internal.platform.android.SocketAdapter;
import okhttp3.internal.platform.android.StandardAndroidSocketAdapter;
import okhttp3.internal.tls.BasicCertificateChainCleaner;
import okhttp3.internal.tls.CertificateChainCleaner;
import okhttp3.internal.tls.TrustRootIndex;

@SuppressSignatureCheck
/* loaded from: classes2.dex */
public final class AndroidPlatform extends Platform implements ContextAwarePlatform {

    /* renamed from: e, reason: collision with root package name */
    public static final Companion f22891e = new Companion(0 == true ? 1 : 0);

    /* renamed from: f, reason: collision with root package name */
    public static final String f22892f = "OkHttp";
    public static final boolean g;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f22893d;

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(int i7) {
            this();
        }
    }

    /* loaded from: classes2.dex */
    public static final class CustomTrustRootIndex implements TrustRootIndex {

        /* renamed from: a, reason: collision with root package name */
        public final X509TrustManager f22894a;

        /* renamed from: b, reason: collision with root package name */
        public final Method f22895b;

        public CustomTrustRootIndex(X509TrustManager x509TrustManager, Method method) {
            this.f22894a = x509TrustManager;
            this.f22895b = method;
        }

        @Override // okhttp3.internal.tls.TrustRootIndex
        public final X509Certificate a(X509Certificate x509Certificate) {
            try {
                Object invoke = this.f22895b.invoke(this.f22894a, x509Certificate);
                l.c(invoke, "null cannot be cast to non-null type java.security.cert.TrustAnchor");
                return ((TrustAnchor) invoke).getTrustedCert();
            } catch (IllegalAccessException e2) {
                throw new AssertionError("unable to get issues and signature", e2);
            } catch (InvocationTargetException unused) {
                return null;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CustomTrustRootIndex)) {
                return false;
            }
            CustomTrustRootIndex customTrustRootIndex = (CustomTrustRootIndex) obj;
            return l.a(this.f22894a, customTrustRootIndex.f22894a) && l.a(this.f22895b, customTrustRootIndex.f22895b);
        }

        public final int hashCode() {
            return this.f22895b.hashCode() + (this.f22894a.hashCode() * 31);
        }

        public final String toString() {
            return "CustomTrustRootIndex(trustManager=" + this.f22894a + ", findByIssuerAndSignatureMethod=" + this.f22895b + ')';
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Platform.f22897a.getClass();
        PlatformRegistry.f22900a.getClass();
        g = Build.VERSION.SDK_INT < 29;
    }

    public AndroidPlatform() {
        AndroidSocketAdapter androidSocketAdapter;
        StandardAndroidSocketAdapter.g.getClass();
        try {
            Class<?> cls = Class.forName("com.android.org.conscrypt".concat(".OpenSSLSocketImpl"));
            Class.forName("com.android.org.conscrypt".concat(".OpenSSLSocketFactoryImpl"));
            Class.forName("com.android.org.conscrypt".concat(".SSLParametersImpl"));
            androidSocketAdapter = new AndroidSocketAdapter(cls);
        } catch (Exception e2) {
            AndroidLog androidLog = AndroidLog.f22905a;
            String name = OkHttpClient.class.getName();
            androidLog.getClass();
            AndroidLog.a(name, 5, "unable to load android socket classes", e2);
            androidSocketAdapter = null;
        }
        AndroidSocketAdapter.f22909e.getClass();
        DeferredSocketAdapter deferredSocketAdapter = new DeferredSocketAdapter(AndroidSocketAdapter.f22910f);
        ConscryptSocketAdapter.f22918a.getClass();
        DeferredSocketAdapter deferredSocketAdapter2 = new DeferredSocketAdapter(ConscryptSocketAdapter.f22919b);
        BouncyCastleSocketAdapter.f22915a.getClass();
        ArrayList X10 = n.X(new SocketAdapter[]{androidSocketAdapter, deferredSocketAdapter, deferredSocketAdapter2, new DeferredSocketAdapter(BouncyCastleSocketAdapter.f22916b)});
        ArrayList arrayList = new ArrayList();
        Iterator it = X10.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((SocketAdapter) next).c()) {
                arrayList.add(next);
            }
        }
        this.f22893d = arrayList;
    }

    @Override // okhttp3.internal.platform.Platform
    public final CertificateChainCleaner a(X509TrustManager x509TrustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        AndroidCertificateChainCleaner.f22902d.getClass();
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        AndroidCertificateChainCleaner androidCertificateChainCleaner = x509TrustManagerExtensions != null ? new AndroidCertificateChainCleaner(x509TrustManager, x509TrustManagerExtensions) : null;
        return androidCertificateChainCleaner != null ? androidCertificateChainCleaner : new BasicCertificateChainCleaner(b(x509TrustManager));
    }

    @Override // okhttp3.internal.platform.Platform
    public final TrustRootIndex b(X509TrustManager x509TrustManager) {
        try {
            StrictMode.noteSlowCall("buildTrustRootIndex");
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            declaredMethod.setAccessible(true);
            return new CustomTrustRootIndex(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.b(x509TrustManager);
        }
    }

    @Override // okhttp3.internal.platform.Platform
    public final void c(SSLSocket sSLSocket, String str, List protocols) {
        Object obj;
        l.e(protocols, "protocols");
        Iterator it = this.f22893d.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((SocketAdapter) obj).a(sSLSocket)) {
                    break;
                }
            }
        }
        SocketAdapter socketAdapter = (SocketAdapter) obj;
        if (socketAdapter != null) {
            socketAdapter.d(sSLSocket, str, protocols);
        }
    }

    @Override // okhttp3.internal.platform.Platform
    public final void d(Socket socket, InetSocketAddress address, int i7) {
        l.e(address, "address");
        try {
            socket.connect(address, i7);
        } catch (ClassCastException e2) {
            if (Build.VERSION.SDK_INT != 26) {
                throw e2;
            }
            throw new IOException("Exception in connect", e2);
        }
    }

    @Override // okhttp3.internal.platform.Platform
    public final String e(SSLSocket sSLSocket) {
        Object obj;
        Iterator it = this.f22893d.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((SocketAdapter) obj).a(sSLSocket)) {
                break;
            }
        }
        SocketAdapter socketAdapter = (SocketAdapter) obj;
        if (socketAdapter != null) {
            return socketAdapter.b(sSLSocket);
        }
        return null;
    }

    @Override // okhttp3.internal.platform.Platform
    public final boolean g(String hostname) {
        l.e(hostname, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(hostname);
    }

    @Override // okhttp3.internal.platform.Platform
    public final void h(int i7, String message, Throwable th) {
        l.e(message, "message");
        String str = f22892f;
        if (i7 == 5) {
            Log.w(str, message, th);
        } else {
            Log.i(str, message, th);
        }
    }

    @Override // okhttp3.internal.platform.Platform
    public final SSLContext j() {
        StrictMode.noteSlowCall("newSSLContext");
        return super.j();
    }
}
