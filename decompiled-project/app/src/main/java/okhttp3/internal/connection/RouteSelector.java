package okhttp3.internal.connection;

import Eb.v;
import java.net.Proxy;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.l;
import okhttp3.Address;
import okhttp3.HttpUrl;
import okhttp3.internal._UtilJvmKt;

/* loaded from: classes2.dex */
public final class RouteSelector {

    /* renamed from: i, reason: collision with root package name */
    public static final Companion f22660i = new Companion(0);

    /* renamed from: a, reason: collision with root package name */
    public final Address f22661a;

    /* renamed from: b, reason: collision with root package name */
    public final RouteDatabase f22662b;

    /* renamed from: c, reason: collision with root package name */
    public final ConnectionUser f22663c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f22664d;

    /* renamed from: e, reason: collision with root package name */
    public final List f22665e;

    /* renamed from: f, reason: collision with root package name */
    public int f22666f;
    public Object g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f22667h;

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(int i7) {
            this();
        }
    }

    /* loaded from: classes2.dex */
    public static final class Selection {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f22668a;

        /* renamed from: b, reason: collision with root package name */
        public int f22669b;

        public Selection(ArrayList arrayList) {
            this.f22668a = arrayList;
        }
    }

    public RouteSelector(Address address, RouteDatabase routeDatabase, ConnectionUser connectionUser, boolean z8) {
        List l10;
        l.e(address, "address");
        l.e(routeDatabase, "routeDatabase");
        this.f22661a = address;
        this.f22662b = routeDatabase;
        this.f22663c = connectionUser;
        this.f22664d = z8;
        v vVar = v.f3891a;
        this.f22665e = vVar;
        this.g = vVar;
        this.f22667h = new ArrayList();
        HttpUrl httpUrl = address.f22245h;
        connectionUser.c(httpUrl);
        URI h10 = httpUrl.h();
        if (h10.getHost() == null) {
            l10 = _UtilJvmKt.l(new Proxy[]{Proxy.NO_PROXY});
        } else {
            List<Proxy> select = address.g.select(h10);
            l10 = (select == null || select.isEmpty()) ? _UtilJvmKt.l(new Proxy[]{Proxy.NO_PROXY}) : _UtilJvmKt.k(select);
        }
        this.f22665e = l10;
        this.f22666f = 0;
        connectionUser.d(httpUrl, l10);
    }

    public final boolean a() {
        return this.f22666f < this.f22665e.size() || !this.f22667h.isEmpty();
    }
}
