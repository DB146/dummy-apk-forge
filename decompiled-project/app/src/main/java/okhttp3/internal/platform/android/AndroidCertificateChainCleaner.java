package okhttp3.internal.platform.android;

import android.net.http.X509TrustManagerExtensions;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.l;
import okhttp3.internal.tls.CertificateChainCleaner;

/* loaded from: classes2.dex */
public final class AndroidCertificateChainCleaner extends CertificateChainCleaner {

    /* renamed from: d, reason: collision with root package name */
    public static final Companion f22902d = new Companion(0);

    /* renamed from: b, reason: collision with root package name */
    public final X509TrustManager f22903b;

    /* renamed from: c, reason: collision with root package name */
    public final X509TrustManagerExtensions f22904c;

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(int i7) {
            this();
        }
    }

    public AndroidCertificateChainCleaner(X509TrustManager x509TrustManager, X509TrustManagerExtensions x509TrustManagerExtensions) {
        this.f22903b = x509TrustManager;
        this.f22904c = x509TrustManagerExtensions;
    }

    @Override // okhttp3.internal.tls.CertificateChainCleaner
    public final List a(String hostname, List chain) {
        l.e(chain, "chain");
        l.e(hostname, "hostname");
        try {
            List<X509Certificate> checkServerTrusted = this.f22904c.checkServerTrusted((X509Certificate[]) chain.toArray(new X509Certificate[0]), "RSA", hostname);
            l.d(checkServerTrusted, "checkServerTrusted(...)");
            return checkServerTrusted;
        } catch (CertificateException e2) {
            SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e2.getMessage());
            sSLPeerUnverifiedException.initCause(e2);
            throw sSLPeerUnverifiedException;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof AndroidCertificateChainCleaner) && ((AndroidCertificateChainCleaner) obj).f22903b == this.f22903b;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f22903b);
    }
}
