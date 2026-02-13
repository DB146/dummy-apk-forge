package o3;

import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import h3.z;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final String f21677a;

    static {
        String g = z.g("NetworkStateTracker");
        l.d(g, "tagWithPrefix(\"NetworkStateTracker\")");
        f21677a = g;
    }

    public static final m3.g a(ConnectivityManager connectivityManager) {
        boolean z8;
        NetworkCapabilities networkCapabilities;
        l.e(connectivityManager, "<this>");
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        boolean z10 = activeNetworkInfo != null && activeNetworkInfo.isConnected();
        try {
            networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
        } catch (SecurityException e2) {
            z.e().d(f21677a, "Unable to validate active network", e2);
        }
        if (networkCapabilities != null) {
            z8 = networkCapabilities.hasCapability(16);
            return new m3.g(z10, z8, connectivityManager.isActiveNetworkMetered(), activeNetworkInfo == null && !activeNetworkInfo.isRoaming());
        }
        z8 = false;
        return new m3.g(z10, z8, connectivityManager.isActiveNetworkMetered(), activeNetworkInfo == null && !activeNetworkInfo.isRoaming());
    }
}
