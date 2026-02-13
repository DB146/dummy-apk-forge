package m3;

import Eb.o;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import h3.z;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class i extends ConnectivityManager.NetworkCallback {

    /* renamed from: a, reason: collision with root package name */
    public static final i f19791a = new ConnectivityManager.NetworkCallback();

    /* renamed from: b, reason: collision with root package name */
    public static final Object f19792b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static final LinkedHashMap f19793c = new LinkedHashMap();

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        List<Map.Entry> s02;
        boolean canBeSatisfiedBy;
        kotlin.jvm.internal.l.e(network, "network");
        kotlin.jvm.internal.l.e(networkCapabilities, "networkCapabilities");
        z.e().a(l.f19799a, "NetworkRequestConstraintController onCapabilitiesChanged callback");
        synchronized (f19792b) {
            s02 = o.s0(f19793c.entrySet());
        }
        for (Map.Entry entry : s02) {
            Rb.c cVar = (Rb.c) entry.getKey();
            canBeSatisfiedBy = ((NetworkRequest) entry.getValue()).canBeSatisfiedBy(networkCapabilities);
            cVar.invoke(canBeSatisfiedBy ? a.f19777a : new b(7));
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        List s02;
        kotlin.jvm.internal.l.e(network, "network");
        z.e().a(l.f19799a, "NetworkRequestConstraintController onLost callback");
        synchronized (f19792b) {
            s02 = o.s0(f19793c.keySet());
        }
        Iterator it = s02.iterator();
        while (it.hasNext()) {
            ((Rb.c) it.next()).invoke(new b(7));
        }
    }
}
