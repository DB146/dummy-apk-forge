package okhttp3.internal.platform.android;

import ac.AbstractC0796a;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.l;
import okhttp3.internal.platform.AndroidPlatform;
import okhttp3.internal.platform.Platform;

/* loaded from: classes2.dex */
public class AndroidSocketAdapter implements SocketAdapter {

    /* renamed from: e, reason: collision with root package name */
    public static final Companion f22909e = new Companion(0);

    /* renamed from: f, reason: collision with root package name */
    public static final AndroidSocketAdapter$Companion$factory$1 f22910f = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final Class f22911a;

    /* renamed from: b, reason: collision with root package name */
    public final Method f22912b;

    /* renamed from: c, reason: collision with root package name */
    public final Method f22913c;

    /* renamed from: d, reason: collision with root package name */
    public final Method f22914d;

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(int i7) {
            this();
        }
    }

    public AndroidSocketAdapter(Class cls) {
        this.f22911a = cls;
        Method declaredMethod = cls.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        l.d(declaredMethod, "getDeclaredMethod(...)");
        this.f22912b = declaredMethod;
        cls.getMethod("setHostname", String.class);
        this.f22913c = cls.getMethod("getAlpnSelectedProtocol", null);
        this.f22914d = cls.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public final boolean a(SSLSocket sSLSocket) {
        return this.f22911a.isInstance(sSLSocket);
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public final String b(SSLSocket sSLSocket) {
        if (!this.f22911a.isInstance(sSLSocket)) {
            return null;
        }
        try {
            byte[] bArr = (byte[]) this.f22913c.invoke(sSLSocket, null);
            if (bArr != null) {
                return new String(bArr, AbstractC0796a.f12815a);
            }
            return null;
        } catch (IllegalAccessException e2) {
            throw new AssertionError(e2);
        } catch (InvocationTargetException e10) {
            Throwable cause = e10.getCause();
            if ((cause instanceof NullPointerException) && l.a(((NullPointerException) cause).getMessage(), "ssl == null")) {
                return null;
            }
            throw new AssertionError(e10);
        }
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public final boolean c() {
        AndroidPlatform.f22891e.getClass();
        return AndroidPlatform.g;
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public final void d(SSLSocket sSLSocket, String str, List protocols) {
        l.e(protocols, "protocols");
        if (this.f22911a.isInstance(sSLSocket)) {
            try {
                this.f22912b.invoke(sSLSocket, Boolean.TRUE);
                Method method = this.f22914d;
                Platform.f22897a.getClass();
                method.invoke(sSLSocket, Platform.Companion.b(protocols));
            } catch (IllegalAccessException e2) {
                throw new AssertionError(e2);
            } catch (InvocationTargetException e10) {
                throw new AssertionError(e10);
            }
        }
    }
}
