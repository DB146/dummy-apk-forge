package okhttp3.internal.platform.android;

import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.l;

/* loaded from: classes2.dex */
public final class DeferredSocketAdapter implements SocketAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final Factory f22921a;

    /* renamed from: b, reason: collision with root package name */
    public SocketAdapter f22922b;

    /* loaded from: classes2.dex */
    public interface Factory {
        boolean a(SSLSocket sSLSocket);

        SocketAdapter b(SSLSocket sSLSocket);
    }

    public DeferredSocketAdapter(Factory socketAdapterFactory) {
        l.e(socketAdapterFactory, "socketAdapterFactory");
        this.f22921a = socketAdapterFactory;
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public final boolean a(SSLSocket sSLSocket) {
        return this.f22921a.a(sSLSocket);
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public final String b(SSLSocket sSLSocket) {
        SocketAdapter e2 = e(sSLSocket);
        if (e2 != null) {
            return e2.b(sSLSocket);
        }
        return null;
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public final boolean c() {
        return true;
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public final void d(SSLSocket sSLSocket, String str, List protocols) {
        l.e(protocols, "protocols");
        SocketAdapter e2 = e(sSLSocket);
        if (e2 != null) {
            e2.d(sSLSocket, str, protocols);
        }
    }

    public final synchronized SocketAdapter e(SSLSocket sSLSocket) {
        try {
            if (this.f22922b == null && this.f22921a.a(sSLSocket)) {
                this.f22922b = this.f22921a.b(sSLSocket);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f22922b;
    }
}
