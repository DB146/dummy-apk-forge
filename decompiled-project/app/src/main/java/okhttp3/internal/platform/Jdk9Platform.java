package okhttp3.internal.platform;

import ac.n;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.l;
import okhttp3.internal.platform.Platform;

/* loaded from: classes2.dex */
public class Jdk9Platform extends Platform {

    /* renamed from: d, reason: collision with root package name */
    public static final Integer f22896d;

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(int i7) {
            this();
        }
    }

    static {
        new Companion(0);
        String property = System.getProperty("java.specification.version");
        Integer Z7 = property != null ? n.Z(property) : null;
        f22896d = Z7;
        if (Z7 == null) {
            try {
                SSLSocket.class.getMethod("getApplicationProtocol", null);
            } catch (NoSuchMethodException unused) {
            }
        }
    }

    @Override // okhttp3.internal.platform.Platform
    public final void c(SSLSocket sSLSocket, String str, List protocols) {
        l.e(protocols, "protocols");
        SSLParameters sSLParameters = sSLSocket.getSSLParameters();
        Platform.f22897a.getClass();
        sSLParameters.setApplicationProtocols((String[]) Platform.Companion.a(protocols).toArray(new String[0]));
        sSLSocket.setSSLParameters(sSLParameters);
    }

    @Override // okhttp3.internal.platform.Platform
    public final String e(SSLSocket sSLSocket) {
        String applicationProtocol;
        try {
            applicationProtocol = sSLSocket.getApplicationProtocol();
            if (applicationProtocol == null) {
                return null;
            }
            if (applicationProtocol.equals("")) {
                return null;
            }
            return applicationProtocol;
        } catch (UnsupportedOperationException unused) {
            return null;
        }
    }

    @Override // okhttp3.internal.platform.Platform
    public final SSLContext j() {
        SSLContext sSLContext;
        Integer num = f22896d;
        if (num != null && num.intValue() >= 9) {
            SSLContext sSLContext2 = SSLContext.getInstance("TLS");
            l.d(sSLContext2, "getInstance(...)");
            return sSLContext2;
        }
        try {
            sSLContext = SSLContext.getInstance("TLSv1.3");
        } catch (NoSuchAlgorithmException unused) {
            sSLContext = SSLContext.getInstance("TLS");
        }
        l.b(sSLContext);
        return sSLContext;
    }
}
