package okhttp3;

import ac.g;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import kotlin.jvm.internal.l;
import okhttp3.internal._HostnamesCommonKt;

/* loaded from: classes2.dex */
public final class Route {

    /* renamed from: a, reason: collision with root package name */
    public final Address f22470a;

    /* renamed from: b, reason: collision with root package name */
    public final Proxy f22471b;

    /* renamed from: c, reason: collision with root package name */
    public final InetSocketAddress f22472c;

    public Route(Address address, Proxy proxy, InetSocketAddress socketAddress) {
        l.e(address, "address");
        l.e(socketAddress, "socketAddress");
        this.f22470a = address;
        this.f22471b = proxy;
        this.f22472c = socketAddress;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Route) {
            Route route = (Route) obj;
            if (l.a(route.f22470a, this.f22470a) && l.a(route.f22471b, this.f22471b) && l.a(route.f22472c, this.f22472c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f22472c.hashCode() + ((this.f22471b.hashCode() + ((this.f22470a.hashCode() + 527) * 31)) * 31);
    }

    public final String toString() {
        String hostAddress;
        StringBuilder sb2 = new StringBuilder();
        Address address = this.f22470a;
        String str = address.f22245h.f22338d;
        InetSocketAddress inetSocketAddress = this.f22472c;
        InetAddress address2 = inetSocketAddress.getAddress();
        String b2 = (address2 == null || (hostAddress = address2.getHostAddress()) == null) ? null : _HostnamesCommonKt.b(hostAddress);
        if (g.a0(str, ':')) {
            sb2.append("[");
            sb2.append(str);
            sb2.append("]");
        } else {
            sb2.append(str);
        }
        HttpUrl httpUrl = address.f22245h;
        if (httpUrl.f22339e != inetSocketAddress.getPort() || str.equals(b2)) {
            sb2.append(":");
            sb2.append(httpUrl.f22339e);
        }
        if (!str.equals(b2)) {
            if (this.f22471b.equals(Proxy.NO_PROXY)) {
                sb2.append(" at ");
            } else {
                sb2.append(" via proxy ");
            }
            if (b2 == null) {
                sb2.append("<unresolved>");
            } else if (g.a0(b2, ':')) {
                sb2.append("[");
                sb2.append(b2);
                sb2.append("]");
            } else {
                sb2.append(b2);
            }
            sb2.append(":");
            sb2.append(inetSocketAddress.getPort());
        }
        return sb2.toString();
    }
}
