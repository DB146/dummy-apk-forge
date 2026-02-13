package okhttp3.internal.platform;

import A9.M2;
import Eb.n;
import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.os.StrictMode;
import android.security.NetworkSecurityPolicy;
import android.util.CloseGuard;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.l;
import okhttp3.internal.SuppressSignatureCheck;
import okhttp3.internal.platform.android.Android10SocketAdapter;
import okhttp3.internal.platform.android.AndroidCertificateChainCleaner;
import okhttp3.internal.platform.android.AndroidSocketAdapter;
import okhttp3.internal.platform.android.BouncyCastleSocketAdapter;
import okhttp3.internal.platform.android.ConscryptSocketAdapter;
import okhttp3.internal.platform.android.DeferredSocketAdapter;
import okhttp3.internal.platform.android.SocketAdapter;
import okhttp3.internal.tls.BasicCertificateChainCleaner;
import okhttp3.internal.tls.CertificateChainCleaner;
import okhttp3.internal.tls.TrustRootIndex;

@SuppressSignatureCheck
/* loaded from: classes2.dex */
public final class Android10Platform extends Platform implements ContextAwarePlatform {

    /* renamed from: e, reason: collision with root package name */
    public static final Companion f22888e = new Companion(0 == true ? 1 : 0);

    /* renamed from: f, reason: collision with root package name */
    public static final boolean f22889f;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f22890d;

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(int i7) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Platform.f22897a.getClass();
        PlatformRegistry.f22900a.getClass();
        f22889f = Build.VERSION.SDK_INT >= 29;
    }

    public Android10Platform() {
        Android10SocketAdapter.f22901a.getClass();
        Platform.f22897a.getClass();
        PlatformRegistry.f22900a.getClass();
        Android10SocketAdapter android10SocketAdapter = Build.VERSION.SDK_INT >= 29 ? new Android10SocketAdapter() : null;
        AndroidSocketAdapter.f22909e.getClass();
        DeferredSocketAdapter deferredSocketAdapter = new DeferredSocketAdapter(AndroidSocketAdapter.f22910f);
        ConscryptSocketAdapter.f22918a.getClass();
        DeferredSocketAdapter deferredSocketAdapter2 = new DeferredSocketAdapter(ConscryptSocketAdapter.f22919b);
        BouncyCastleSocketAdapter.f22915a.getClass();
        ArrayList X10 = n.X(new SocketAdapter[]{android10SocketAdapter, deferredSocketAdapter, deferredSocketAdapter2, new DeferredSocketAdapter(BouncyCastleSocketAdapter.f22916b)});
        ArrayList arrayList = new ArrayList();
        Iterator it = X10.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((SocketAdapter) next).c()) {
                arrayList.add(next);
            }
        }
        this.f22890d = arrayList;
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
        StrictMode.noteSlowCall("buildTrustRootIndex");
        return super.b(x509TrustManager);
    }

    @Override // okhttp3.internal.platform.Platform
    public final void c(SSLSocket sSLSocket, String str, List protocols) {
        Object obj;
        l.e(protocols, "protocols");
        Iterator it = this.f22890d.iterator();
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
    public final String e(SSLSocket sSLSocket) {
        Object obj;
        Iterator it = this.f22890d.iterator();
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
    public final Object f() {
        if (Build.VERSION.SDK_INT < 30) {
            return super.f();
        }
        CloseGuard f4 = M2.f();
        f4.open("response.body().close()");
        return f4;
    }

    @Override // okhttp3.internal.platform.Platform
    public final boolean g(String hostname) {
        l.e(hostname, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(hostname);
    }

    @Override // okhttp3.internal.platform.Platform
    public final void i(Object obj, String message) {
        l.e(message, "message");
        if (Build.VERSION.SDK_INT < 30) {
            super.i(obj, message);
        } else {
            l.c(obj, "null cannot be cast to non-null type android.util.CloseGuard");
            M2.g(obj).warnIfOpen();
        }
    }

    @Override // okhttp3.internal.platform.Platform
    public final SSLContext j() {
        StrictMode.noteSlowCall("newSSLContext");
        return super.j();
    }
}
