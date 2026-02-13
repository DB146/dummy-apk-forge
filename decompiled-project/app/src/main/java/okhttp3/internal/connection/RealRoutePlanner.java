package okhttp3.internal.connection;

import Eb.l;
import Eb.o;
import Fb.b;
import ac.e;
import java.io.IOException;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import okhttp3.Address;
import okhttp3.ConnectionSpec;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.Route;
import okhttp3.internal._HeadersCommonKt;
import okhttp3.internal._HostnamesCommonKt;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.connection.RoutePlanner;
import okhttp3.internal.connection.RouteSelector;
import okhttp3.internal.platform.Platform;
import y.S;
import y7.u0;

/* loaded from: classes2.dex */
public final class RealRoutePlanner implements RoutePlanner {

    /* renamed from: a, reason: collision with root package name */
    public final TaskRunner f22642a;

    /* renamed from: b, reason: collision with root package name */
    public final RealConnectionPool f22643b;

    /* renamed from: c, reason: collision with root package name */
    public final int f22644c;

    /* renamed from: d, reason: collision with root package name */
    public final int f22645d;

    /* renamed from: e, reason: collision with root package name */
    public final int f22646e;

    /* renamed from: f, reason: collision with root package name */
    public final int f22647f;
    public final int g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f22648h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f22649i;
    public final Address j;
    public final RouteDatabase k;

    /* renamed from: l, reason: collision with root package name */
    public final ConnectionUser f22650l;

    /* renamed from: m, reason: collision with root package name */
    public RouteSelector.Selection f22651m;

    /* renamed from: n, reason: collision with root package name */
    public RouteSelector f22652n;

    /* renamed from: o, reason: collision with root package name */
    public Route f22653o;

    /* renamed from: p, reason: collision with root package name */
    public final l f22654p;

    public RealRoutePlanner(TaskRunner taskRunner, RealConnectionPool connectionPool, int i7, int i10, int i11, int i12, int i13, boolean z8, boolean z10, Address address, RouteDatabase routeDatabase, ConnectionUser connectionUser) {
        kotlin.jvm.internal.l.e(taskRunner, "taskRunner");
        kotlin.jvm.internal.l.e(connectionPool, "connectionPool");
        kotlin.jvm.internal.l.e(address, "address");
        kotlin.jvm.internal.l.e(routeDatabase, "routeDatabase");
        this.f22642a = taskRunner;
        this.f22643b = connectionPool;
        this.f22644c = i7;
        this.f22645d = i10;
        this.f22646e = i11;
        this.f22647f = i12;
        this.g = i13;
        this.f22648h = z8;
        this.f22649i = z10;
        this.j = address;
        this.k = routeDatabase;
        this.f22650l = connectionUser;
        this.f22654p = new l();
    }

    @Override // okhttp3.internal.connection.RoutePlanner
    public final boolean a() {
        return this.f22650l.a();
    }

    @Override // okhttp3.internal.connection.RoutePlanner
    public final l b() {
        return this.f22654p;
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0081 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0082  */
    @Override // okhttp3.internal.connection.RoutePlanner
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final RoutePlanner.Plan c() {
        Socket h10;
        boolean z8;
        ReusePlan reusePlan;
        RealConnection l10 = this.f22650l.l();
        if (l10 != null) {
            boolean g = l10.g(this.f22650l.i());
            synchronized (l10) {
                try {
                    if (g) {
                        if (!l10.f22613B && f(l10.f22623d.f22470a.f22245h)) {
                            z8 = false;
                            h10 = null;
                        }
                        h10 = this.f22650l.h();
                        z8 = false;
                    } else {
                        z8 = !l10.f22613B;
                        l10.f22613B = true;
                        h10 = this.f22650l.h();
                    }
                } finally {
                }
            }
            if (this.f22650l.l() != null) {
                if (h10 != null) {
                    throw new IllegalStateException("Check failed.");
                }
                reusePlan = new ReusePlan(l10);
                if (reusePlan == null) {
                    return reusePlan;
                }
                ReusePlan i7 = i(null, null);
                if (i7 != null) {
                    return i7;
                }
                if (!this.f22654p.isEmpty()) {
                    return (RoutePlanner.Plan) this.f22654p.removeFirst();
                }
                ConnectPlan g2 = g();
                ReusePlan i10 = i(g2, g2.f22561z);
                return i10 != null ? i10 : g2;
            }
            if (h10 != null) {
                _UtilJvmKt.c(h10);
            }
            this.f22650l.m(l10);
            this.f22650l.g(l10);
            if (h10 != null) {
                this.f22650l.k(l10);
            } else if (z8) {
                this.f22650l.t(l10);
            }
        }
        reusePlan = null;
        if (reusePlan == null) {
        }
    }

    @Override // okhttp3.internal.connection.RoutePlanner
    public final boolean d(RealConnection realConnection) {
        RouteSelector routeSelector;
        Route route;
        if (!this.f22654p.isEmpty() || this.f22653o != null) {
            return true;
        }
        if (realConnection != null) {
            synchronized (realConnection) {
                route = null;
                if (realConnection.f22615D == 0 && realConnection.f22613B && _UtilJvmKt.a(realConnection.f22623d.f22470a.f22245h, this.j.f22245h)) {
                    route = realConnection.f22623d;
                }
            }
            if (route != null) {
                this.f22653o = route;
                return true;
            }
        }
        RouteSelector.Selection selection = this.f22651m;
        if ((selection == null || selection.f22669b >= selection.f22668a.size()) && (routeSelector = this.f22652n) != null) {
            return routeSelector.a();
        }
        return true;
    }

    @Override // okhttp3.internal.connection.RoutePlanner
    public final Address e() {
        return this.j;
    }

    @Override // okhttp3.internal.connection.RoutePlanner
    public final boolean f(HttpUrl url) {
        kotlin.jvm.internal.l.e(url, "url");
        HttpUrl httpUrl = this.j.f22245h;
        return url.f22339e == httpUrl.f22339e && kotlin.jvm.internal.l.a(url.f22338d, httpUrl.f22338d);
    }

    /* JADX WARN: Type inference failed for: r4v20, types: [java.util.List, java.lang.Object] */
    public final ConnectPlan g() {
        String str;
        int i7;
        List list;
        boolean contains;
        Route route = this.f22653o;
        if (route != null) {
            this.f22653o = null;
            return h(route, null);
        }
        RouteSelector.Selection selection = this.f22651m;
        if (selection != null && selection.f22669b < selection.f22668a.size()) {
            int i10 = selection.f22669b;
            ArrayList arrayList = selection.f22668a;
            if (i10 >= arrayList.size()) {
                throw new NoSuchElementException();
            }
            int i11 = selection.f22669b;
            selection.f22669b = 1 + i11;
            return h((Route) arrayList.get(i11), null);
        }
        RouteSelector routeSelector = this.f22652n;
        if (routeSelector == null) {
            routeSelector = new RouteSelector(this.j, this.k, this.f22650l, this.f22649i);
            this.f22652n = routeSelector;
        }
        if (!routeSelector.a()) {
            throw new IOException("exhausted all routes");
        }
        if (!routeSelector.a()) {
            throw new NoSuchElementException();
        }
        ArrayList arrayList2 = new ArrayList();
        while (routeSelector.f22666f < routeSelector.f22665e.size()) {
            boolean z8 = routeSelector.f22666f < routeSelector.f22665e.size();
            Address address = routeSelector.f22661a;
            if (!z8) {
                throw new SocketException("No route to " + address.f22245h.f22338d + "; exhausted proxy configurations: " + routeSelector.f22665e);
            }
            List list2 = routeSelector.f22665e;
            int i12 = routeSelector.f22666f;
            routeSelector.f22666f = i12 + 1;
            Proxy proxy = (Proxy) list2.get(i12);
            ArrayList arrayList3 = new ArrayList();
            routeSelector.g = arrayList3;
            if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
                HttpUrl httpUrl = address.f22245h;
                str = httpUrl.f22338d;
                i7 = httpUrl.f22339e;
            } else {
                SocketAddress address2 = proxy.address();
                if (!(address2 instanceof InetSocketAddress)) {
                    throw new IllegalArgumentException(("Proxy.address() is not an InetSocketAddress: " + address2.getClass()).toString());
                }
                InetSocketAddress inetSocketAddress = (InetSocketAddress) address2;
                RouteSelector.f22660i.getClass();
                kotlin.jvm.internal.l.e(inetSocketAddress, "<this>");
                InetAddress address3 = inetSocketAddress.getAddress();
                if (address3 == null) {
                    str = inetSocketAddress.getHostName();
                    kotlin.jvm.internal.l.d(str, "getHostName(...)");
                } else {
                    str = address3.getHostAddress();
                    kotlin.jvm.internal.l.d(str, "getHostAddress(...)");
                }
                i7 = inetSocketAddress.getPort();
            }
            if (1 > i7 || i7 >= 65536) {
                throw new SocketException("No route to " + str + ':' + i7 + "; port is out of range");
            }
            if (proxy.type() == Proxy.Type.SOCKS) {
                arrayList3.add(InetSocketAddress.createUnresolved(str, i7));
            } else {
                e eVar = _HostnamesCommonKt.f22494a;
                kotlin.jvm.internal.l.e(str, "<this>");
                if (_HostnamesCommonKt.f22494a.d(str)) {
                    list = u0.x(InetAddress.getByName(str));
                } else {
                    ConnectionUser connectionUser = routeSelector.f22663c;
                    connectionUser.s(str);
                    List a9 = address.f22239a.a(str);
                    if (a9.isEmpty()) {
                        throw new UnknownHostException(address.f22239a + " returned no addresses for " + str);
                    }
                    connectionUser.u(str, a9);
                    list = a9;
                }
                if (routeSelector.f22664d && list.size() >= 2) {
                    ArrayList arrayList4 = new ArrayList();
                    ArrayList arrayList5 = new ArrayList();
                    for (Object obj : list) {
                        if (((InetAddress) obj) instanceof Inet6Address) {
                            arrayList4.add(obj);
                        } else {
                            arrayList5.add(obj);
                        }
                    }
                    if (!arrayList4.isEmpty() && !arrayList5.isEmpty()) {
                        byte[] bArr = _UtilCommonKt.f22495a;
                        Iterator it = arrayList4.iterator();
                        Iterator it2 = arrayList5.iterator();
                        b m10 = u0.m();
                        while (true) {
                            if (!it.hasNext() && !it2.hasNext()) {
                                break;
                            }
                            if (it.hasNext()) {
                                m10.add(it.next());
                            }
                            if (it2.hasNext()) {
                                m10.add(it2.next());
                            }
                        }
                        list = u0.i(m10);
                    }
                }
                Iterator it3 = list.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(new InetSocketAddress((InetAddress) it3.next(), i7));
                }
            }
            Iterator it4 = routeSelector.g.iterator();
            while (it4.hasNext()) {
                Route route2 = new Route(routeSelector.f22661a, proxy, (InetSocketAddress) it4.next());
                RouteDatabase routeDatabase = routeSelector.f22662b;
                synchronized (routeDatabase) {
                    contains = routeDatabase.f22656a.contains(route2);
                }
                if (contains) {
                    routeSelector.f22667h.add(route2);
                } else {
                    arrayList2.add(route2);
                }
            }
            if (!arrayList2.isEmpty()) {
                break;
            }
        }
        if (arrayList2.isEmpty()) {
            o.U(arrayList2, routeSelector.f22667h);
            routeSelector.f22667h.clear();
        }
        RouteSelector.Selection selection2 = new RouteSelector.Selection(arrayList2);
        this.f22651m = selection2;
        if (this.f22650l.a()) {
            throw new IOException("Canceled");
        }
        if (selection2.f22669b >= arrayList2.size()) {
            throw new NoSuchElementException();
        }
        int i13 = selection2.f22669b;
        selection2.f22669b = 1 + i13;
        return h((Route) arrayList2.get(i13), arrayList2);
    }

    public final ConnectPlan h(Route route, ArrayList arrayList) {
        kotlin.jvm.internal.l.e(route, "route");
        Address address = route.f22470a;
        if (address.f22241c == null) {
            if (!address.j.contains(ConnectionSpec.f22288h)) {
                throw new UnknownServiceException("CLEARTEXT communication not enabled for client");
            }
            String str = route.f22470a.f22245h.f22338d;
            Platform.f22897a.getClass();
            if (!Platform.f22898b.g(str)) {
                throw new UnknownServiceException(S.b("CLEARTEXT communication to ", str, " not permitted by network security policy"));
            }
        } else if (address.f22246i.contains(Protocol.f22419u)) {
            throw new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS");
        }
        Request request = null;
        if (route.f22471b.type() == Proxy.Type.HTTP) {
            Address address2 = route.f22470a;
            if (address2.f22241c != null || address2.f22246i.contains(Protocol.f22419u)) {
                Request.Builder builder = new Request.Builder();
                HttpUrl url = route.f22470a.f22245h;
                kotlin.jvm.internal.l.e(url, "url");
                builder.f22430a = url;
                builder.c("CONNECT", null);
                Address address3 = route.f22470a;
                builder.b("Host", _UtilJvmKt.j(address3.f22245h, true));
                builder.b("Proxy-Connection", "Keep-Alive");
                builder.b("User-Agent", "okhttp/5.1.0");
                request = new Request(builder);
                Response.Builder builder2 = new Response.Builder();
                builder2.f22451a = request;
                builder2.f22452b = Protocol.f22416d;
                builder2.f22453c = 407;
                builder2.f22454d = "Preemptive Authenticate";
                builder2.k = -1L;
                builder2.f22459l = -1L;
                Headers.Builder builder3 = builder2.f22456f;
                builder3.getClass();
                _HeadersCommonKt.b("Proxy-Authenticate");
                _HeadersCommonKt.c("OkHttp-Preemptive", "Proxy-Authenticate");
                builder3.b("Proxy-Authenticate");
                _HeadersCommonKt.a(builder3, "Proxy-Authenticate", "OkHttp-Preemptive");
                Request a9 = address3.f22244f.a(route, builder2.a());
                if (a9 != null) {
                    request = a9;
                }
            }
        }
        return new ConnectPlan(this.f22642a, this.f22643b, this.f22644c, this.f22645d, this.f22646e, this.f22647f, this.g, this.f22648h, this.f22650l, this, route, arrayList, 0, request, -1, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0046, code lost:
    
        if ((r7.f22612A != null) == false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ReusePlan i(ConnectPlan connectPlan, ArrayList arrayList) {
        RealConnection realConnection;
        boolean z8;
        Socket h10;
        RealConnectionPool realConnectionPool = this.f22643b;
        boolean i7 = this.f22650l.i();
        Address address = this.j;
        ConnectionUser connectionUser = this.f22650l;
        boolean z10 = connectPlan != null && connectPlan.b();
        realConnectionPool.getClass();
        kotlin.jvm.internal.l.e(address, "address");
        Iterator it = realConnectionPool.g.iterator();
        kotlin.jvm.internal.l.d(it, "iterator(...)");
        while (true) {
            if (!it.hasNext()) {
                realConnection = null;
                break;
            }
            realConnection = (RealConnection) it.next();
            kotlin.jvm.internal.l.b(realConnection);
            synchronized (realConnection) {
                if (z10) {
                }
                if (realConnection.e(address, arrayList)) {
                    connectionUser.e(realConnection);
                    z8 = true;
                } else {
                    z8 = false;
                }
            }
            if (z8) {
                if (realConnection.g(i7)) {
                    break;
                }
                synchronized (realConnection) {
                    realConnection.f22613B = true;
                    h10 = connectionUser.h();
                }
                if (h10 != null) {
                    _UtilJvmKt.c(h10);
                }
            }
        }
        if (realConnection == null) {
            return null;
        }
        if (connectPlan != null) {
            this.f22653o = connectPlan.f22560y;
            Socket socket = connectPlan.f22545G;
            if (socket != null) {
                _UtilJvmKt.c(socket);
            }
        }
        this.f22650l.p(realConnection);
        this.f22650l.j(realConnection);
        return new ReusePlan(realConnection);
    }
}
