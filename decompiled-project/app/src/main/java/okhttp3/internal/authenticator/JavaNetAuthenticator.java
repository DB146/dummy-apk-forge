package okhttp3.internal.authenticator;

import Eb.o;
import Eb.v;
import ac.AbstractC0796a;
import java.io.EOFException;
import java.net.Authenticator;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.net.SocketAddress;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.l;
import okhttp3.Address;
import okhttp3.Authenticator;
import okhttp3.Challenge;
import okhttp3.Credentials;
import okhttp3.Dns;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.Route;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.platform.Platform;
import rc.C1967k;

/* loaded from: classes2.dex */
public final class JavaNetAuthenticator implements Authenticator {

    /* renamed from: b, reason: collision with root package name */
    public final Dns f22499b;

    /* loaded from: classes2.dex */
    public static final /* synthetic */ class WhenMappings {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f22500a;

        static {
            int[] iArr = new int[Proxy.Type.values().length];
            try {
                iArr[Proxy.Type.DIRECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f22500a = iArr;
        }
    }

    public JavaNetAuthenticator() {
        this(0);
    }

    public JavaNetAuthenticator(int i7) {
        Dns defaultDns = Dns.f22318a;
        l.e(defaultDns, "defaultDns");
        this.f22499b = defaultDns;
    }

    public static InetAddress b(Proxy proxy, HttpUrl httpUrl, Dns dns) {
        Proxy.Type type = proxy.type();
        if ((type == null ? -1 : WhenMappings.f22500a[type.ordinal()]) == 1) {
            return (InetAddress) o.Y(dns.a(httpUrl.f22338d));
        }
        SocketAddress address = proxy.address();
        l.c(address, "null cannot be cast to non-null type java.net.InetSocketAddress");
        InetAddress address2 = ((InetSocketAddress) address).getAddress();
        l.d(address2, "getAddress(...)");
        return address2;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0062  */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, rc.h] */
    @Override // okhttp3.Authenticator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Request a(Route route, Response response) {
        String str;
        List<Challenge> list;
        PasswordAuthentication requestPasswordAuthentication;
        Charset charset;
        Address address;
        Dns dns;
        Headers headers = response.f22444f;
        int i7 = response.f22442d;
        if (i7 == 401) {
            str = "WWW-Authenticate";
        } else {
            if (i7 != 407) {
                list = v.f3891a;
                Request request = response.f22439a;
                HttpUrl httpUrl = request.f22424a;
                boolean z8 = response.f22442d == 407;
                Proxy proxy = route == null ? route.f22471b : Proxy.NO_PROXY;
                for (Challenge challenge : list) {
                    if ("Basic".equalsIgnoreCase(challenge.f22266a)) {
                        Dns dns2 = (route == null || (address = route.f22470a) == null || (dns = address.f22239a) == null) ? this.f22499b : dns;
                        if (z8) {
                            SocketAddress address2 = proxy.address();
                            l.c(address2, "null cannot be cast to non-null type java.net.InetSocketAddress");
                            InetSocketAddress inetSocketAddress = (InetSocketAddress) address2;
                            try {
                                requestPasswordAuthentication = java.net.Authenticator.requestPasswordAuthentication(inetSocketAddress.getHostName(), b(proxy, httpUrl, dns2), inetSocketAddress.getPort(), httpUrl.f22335a, (String) challenge.f22267b.get("realm"), challenge.f22266a, new URL(httpUrl.f22342i), Authenticator.RequestorType.PROXY);
                            } catch (MalformedURLException e2) {
                                throw new RuntimeException(e2);
                            }
                        } else {
                            String str2 = httpUrl.f22338d;
                            l.b(proxy);
                            try {
                                requestPasswordAuthentication = java.net.Authenticator.requestPasswordAuthentication(str2, b(proxy, httpUrl, dns2), httpUrl.f22339e, httpUrl.f22335a, (String) challenge.f22267b.get("realm"), challenge.f22266a, new URL(httpUrl.f22342i), Authenticator.RequestorType.SERVER);
                            } catch (MalformedURLException e10) {
                                throw new RuntimeException(e10);
                            }
                        }
                        if (requestPasswordAuthentication != null) {
                            String str3 = z8 ? "Proxy-Authorization" : "Authorization";
                            String userName = requestPasswordAuthentication.getUserName();
                            l.d(userName, "getUserName(...)");
                            char[] password = requestPasswordAuthentication.getPassword();
                            l.d(password, "getPassword(...)");
                            String str4 = new String(password);
                            String str5 = (String) challenge.f22267b.get("charset");
                            if (str5 != null) {
                                try {
                                    charset = Charset.forName(str5);
                                    l.d(charset, "forName(...)");
                                } catch (Exception unused) {
                                }
                                int i10 = Credentials.f22311a;
                                l.e(charset, "charset");
                                String str6 = userName + ':' + str4;
                                C1967k c1967k = C1967k.f23967d;
                                l.e(str6, "<this>");
                                byte[] bytes = str6.getBytes(charset);
                                l.d(bytes, "getBytes(...)");
                                String concat = "Basic ".concat(new C1967k(bytes).a());
                                Request.Builder a9 = request.a();
                                a9.b(str3, concat);
                                return new Request(a9);
                            }
                            charset = AbstractC0796a.f12818d;
                            int i102 = Credentials.f22311a;
                            l.e(charset, "charset");
                            String str62 = userName + ':' + str4;
                            C1967k c1967k2 = C1967k.f23967d;
                            l.e(str62, "<this>");
                            byte[] bytes2 = str62.getBytes(charset);
                            l.d(bytes2, "getBytes(...)");
                            String concat2 = "Basic ".concat(new C1967k(bytes2).a());
                            Request.Builder a92 = request.a();
                            a92.b(str3, concat2);
                            return new Request(a92);
                        }
                    }
                }
                return null;
            }
            str = "Proxy-Authenticate";
        }
        String str7 = str;
        C1967k c1967k3 = HttpHeaders.f22677a;
        ArrayList arrayList = new ArrayList();
        int size = headers.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (str7.equalsIgnoreCase(headers.o(i11))) {
                ?? obj = new Object();
                obj.r0(headers.y(i11));
                try {
                    HttpHeaders.b(obj, arrayList);
                } catch (EOFException e11) {
                    Platform.f22897a.getClass();
                    Platform.f22898b.h(5, "Unable to parse challenge", e11);
                }
            }
        }
        list = arrayList;
        Request request2 = response.f22439a;
        HttpUrl httpUrl2 = request2.f22424a;
        if (response.f22442d == 407) {
        }
        if (route == null) {
        }
        while (r0.hasNext()) {
        }
        return null;
    }
}
