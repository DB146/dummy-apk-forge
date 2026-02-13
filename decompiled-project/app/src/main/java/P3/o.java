package P3;

import A9.J;
import B0.C0170c0;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Build;
import h3.z;

/* loaded from: classes.dex */
public final class o extends ConnectivityManager.NetworkCallback {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f7836c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7837a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f7838b;

    public o(C0170c0 c0170c0) {
        this.f7837a = 1;
        this.f7838b = c0170c0;
    }

    public /* synthetic */ o(Object obj, int i7) {
        this.f7837a = i7;
        this.f7838b = obj;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onAvailable(Network network) {
        switch (this.f7837a) {
            case 0:
                W3.o.f().post(new J(1, this, true));
                return;
            default:
                super.onAvailable(network);
                return;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        switch (this.f7837a) {
            case 1:
                kotlin.jvm.internal.l.e(network, "network");
                kotlin.jvm.internal.l.e(networkCapabilities, "networkCapabilities");
                z.e().a(m3.l.f19799a, "NetworkRequestConstraintController onCapabilitiesChanged callback");
                ((C0170c0) this.f7838b).invoke(m3.a.f19777a);
                return;
            case 2:
                kotlin.jvm.internal.l.e(network, "network");
                kotlin.jvm.internal.l.e(networkCapabilities, "capabilities");
                z.e().a(o3.h.f21677a, "Network capabilities changed: " + networkCapabilities);
                int i7 = Build.VERSION.SDK_INT;
                o3.g gVar = (o3.g) this.f7838b;
                gVar.d(i7 >= 28 ? new m3.g(networkCapabilities.hasCapability(12), networkCapabilities.hasCapability(16), !networkCapabilities.hasCapability(11), networkCapabilities.hasCapability(18)) : o3.h.a(gVar.f21676f));
                return;
            default:
                super.onCapabilitiesChanged(network, networkCapabilities);
                return;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        switch (this.f7837a) {
            case 0:
                W3.o.f().post(new J(1, this, false));
                return;
            case 1:
                kotlin.jvm.internal.l.e(network, "network");
                z.e().a(m3.l.f19799a, "NetworkRequestConstraintController onLost callback");
                ((C0170c0) this.f7838b).invoke(new m3.b(7));
                return;
            default:
                kotlin.jvm.internal.l.e(network, "network");
                z.e().a(o3.h.f21677a, "Network connection lost");
                o3.g gVar = (o3.g) this.f7838b;
                gVar.d(o3.h.a(gVar.f21676f));
                return;
        }
    }
}
