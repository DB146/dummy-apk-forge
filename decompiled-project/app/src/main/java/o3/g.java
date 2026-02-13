package o3;

import P3.o;
import android.content.Context;
import android.net.ConnectivityManager;
import h3.z;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public final class g extends e {

    /* renamed from: f, reason: collision with root package name */
    public final ConnectivityManager f21676f;
    public final o g;

    public g(Context context, q3.i iVar) {
        super(context, iVar);
        Object systemService = ((Context) this.f21671b).getSystemService("connectivity");
        l.c(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        this.f21676f = (ConnectivityManager) systemService;
        this.g = new o(this, 2);
    }

    @Override // o3.e
    public final Object c() {
        return h.a(this.f21676f);
    }

    @Override // o3.e
    public final void e() {
        try {
            z.e().a(h.f21677a, "Registering network callback");
            ConnectivityManager connectivityManager = this.f21676f;
            o networkCallback = this.g;
            l.e(connectivityManager, "<this>");
            l.e(networkCallback, "networkCallback");
            connectivityManager.registerDefaultNetworkCallback(networkCallback);
        } catch (IllegalArgumentException e2) {
            z.e().d(h.f21677a, "Received exception while registering network callback", e2);
        } catch (SecurityException e10) {
            z.e().d(h.f21677a, "Received exception while registering network callback", e10);
        }
    }

    @Override // o3.e
    public final void f() {
        try {
            z.e().a(h.f21677a, "Unregistering network callback");
            ConnectivityManager connectivityManager = this.f21676f;
            o networkCallback = this.g;
            l.e(connectivityManager, "<this>");
            l.e(networkCallback, "networkCallback");
            connectivityManager.unregisterNetworkCallback(networkCallback);
        } catch (IllegalArgumentException e2) {
            z.e().d(h.f21677a, "Received exception while unregistering network callback", e2);
        } catch (SecurityException e10) {
            z.e().d(h.f21677a, "Received exception while unregistering network callback", e10);
        }
    }
}
