package okhttp3.internal.platform.android;

import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.l;
import okhttp3.internal.platform.Platform;
import okhttp3.internal.platform.android.BouncyCastleSocketAdapter;
import okhttp3.internal.platform.android.DeferredSocketAdapter;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;

/* loaded from: classes2.dex */
public final class BouncyCastleSocketAdapter implements SocketAdapter {

    /* renamed from: a, reason: collision with root package name */
    public static final Companion f22915a = new Companion(0 == true ? 1 : 0);

    /* renamed from: b, reason: collision with root package name */
    public static final BouncyCastleSocketAdapter$Companion$factory$1 f22916b = new DeferredSocketAdapter.Factory() { // from class: okhttp3.internal.platform.android.BouncyCastleSocketAdapter$Companion$factory$1
        @Override // okhttp3.internal.platform.android.DeferredSocketAdapter.Factory
        public final boolean a(SSLSocket sSLSocket) {
            BouncyCastleSocketAdapter.f22915a.getClass();
            BouncyCastleSocketAdapter.Companion.a();
            return false;
        }

        @Override // okhttp3.internal.platform.android.DeferredSocketAdapter.Factory
        public final SocketAdapter b(SSLSocket sSLSocket) {
            return new BouncyCastleSocketAdapter();
        }
    };

    /* renamed from: c, reason: collision with root package name */
    public static final boolean f22917c;

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(int i7) {
            this();
        }

        public static boolean a() {
            return BouncyCastleSocketAdapter.f22917c;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [okhttp3.internal.platform.android.BouncyCastleSocketAdapter$Companion$factory$1] */
    static {
        boolean z8 = false;
        try {
            Class.forName("org.bouncycastle.jsse.provider.BouncyCastleJsseProvider", false, Companion.class.getClassLoader());
            z8 = true;
        } catch (ClassNotFoundException unused) {
        }
        f22917c = z8;
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public final boolean a(SSLSocket sSLSocket) {
        return false;
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public final String b(SSLSocket sSLSocket) {
        String applicationProtocol = ((BCSSLSocket) sSLSocket).getApplicationProtocol();
        if (applicationProtocol == null || l.a(applicationProtocol, "")) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public final boolean c() {
        return f22917c;
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public final void d(SSLSocket sSLSocket, String str, List protocols) {
        l.e(protocols, "protocols");
        if (a(sSLSocket)) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sSLSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            Platform.f22897a.getClass();
            parameters.setApplicationProtocols((String[]) Platform.Companion.a(protocols).toArray(new String[0]));
            bCSSLSocket.setParameters(parameters);
        }
    }
}
