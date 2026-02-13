package okhttp3;

import A3.c;
import h3.o;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import kotlin.jvm.internal.l;
import okhttp3.HttpUrl;
import okhttp3.internal._HostnamesCommonKt;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.url._UrlKt;

/* loaded from: classes2.dex */
public final class Address {

    /* renamed from: a, reason: collision with root package name */
    public final Dns f22239a;

    /* renamed from: b, reason: collision with root package name */
    public final SocketFactory f22240b;

    /* renamed from: c, reason: collision with root package name */
    public final SSLSocketFactory f22241c;

    /* renamed from: d, reason: collision with root package name */
    public final HostnameVerifier f22242d;

    /* renamed from: e, reason: collision with root package name */
    public final CertificatePinner f22243e;

    /* renamed from: f, reason: collision with root package name */
    public final Authenticator f22244f;
    public final ProxySelector g;

    /* renamed from: h, reason: collision with root package name */
    public final HttpUrl f22245h;

    /* renamed from: i, reason: collision with root package name */
    public final List f22246i;
    public final List j;

    public Address(String uriHost, int i7, Dns dns, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, CertificatePinner certificatePinner, Authenticator proxyAuthenticator, List protocols, List connectionSpecs, ProxySelector proxySelector) {
        l.e(uriHost, "uriHost");
        l.e(dns, "dns");
        l.e(socketFactory, "socketFactory");
        l.e(proxyAuthenticator, "proxyAuthenticator");
        l.e(protocols, "protocols");
        l.e(connectionSpecs, "connectionSpecs");
        l.e(proxySelector, "proxySelector");
        this.f22239a = dns;
        this.f22240b = socketFactory;
        this.f22241c = sSLSocketFactory;
        this.f22242d = hostnameVerifier;
        this.f22243e = certificatePinner;
        this.f22244f = proxyAuthenticator;
        this.g = proxySelector;
        HttpUrl.Builder builder = new HttpUrl.Builder();
        String str = sSLSocketFactory != null ? "https" : "http";
        if (str.equalsIgnoreCase("http")) {
            builder.f22343a = "http";
        } else {
            if (!str.equalsIgnoreCase("https")) {
                throw new IllegalArgumentException("unexpected scheme: ".concat(str));
            }
            builder.f22343a = "https";
        }
        String b2 = _HostnamesCommonKt.b(_UrlKt.d(0, 0, 7, uriHost));
        if (b2 == null) {
            throw new IllegalArgumentException("unexpected host: ".concat(uriHost));
        }
        builder.f22346d = b2;
        if (1 > i7 || i7 >= 65536) {
            throw new IllegalArgumentException(o.l(i7, "unexpected port: ").toString());
        }
        builder.f22347e = i7;
        this.f22245h = builder.b();
        this.f22246i = _UtilJvmKt.k(protocols);
        this.j = _UtilJvmKt.k(connectionSpecs);
    }

    public final boolean a(Address that) {
        l.e(that, "that");
        return l.a(this.f22239a, that.f22239a) && l.a(this.f22244f, that.f22244f) && l.a(this.f22246i, that.f22246i) && l.a(this.j, that.j) && l.a(this.g, that.g) && l.a(null, null) && l.a(this.f22241c, that.f22241c) && l.a(this.f22242d, that.f22242d) && l.a(this.f22243e, that.f22243e) && this.f22245h.f22339e == that.f22245h.f22339e;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Address) {
            Address address = (Address) obj;
            if (l.a(this.f22245h, address.f22245h) && a(address)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f22243e) + ((Objects.hashCode(this.f22242d) + ((Objects.hashCode(this.f22241c) + ((this.g.hashCode() + ((this.j.hashCode() + ((this.f22246i.hashCode() + ((this.f22244f.hashCode() + ((this.f22239a.hashCode() + c.d(527, 31, this.f22245h.f22342i)) * 31)) * 31)) * 31)) * 31)) * 961)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Address{");
        HttpUrl httpUrl = this.f22245h;
        sb2.append(httpUrl.f22338d);
        sb2.append(':');
        sb2.append(httpUrl.f22339e);
        sb2.append(", ");
        sb2.append("proxySelector=" + this.g);
        sb2.append('}');
        return sb2.toString();
    }
}
