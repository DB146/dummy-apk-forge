package okhttp3.internal.platform.android;

import java.util.List;
import javax.net.ssl.SSLSocket;

/* loaded from: classes2.dex */
public interface SocketAdapter {

    /* loaded from: classes2.dex */
    public static final class DefaultImpls {
    }

    boolean a(SSLSocket sSLSocket);

    String b(SSLSocket sSLSocket);

    boolean c();

    void d(SSLSocket sSLSocket, String str, List list);
}
