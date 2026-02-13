package com.google.android.recaptcha.internal;

import Db.j;
import Eb.B;
import Eb.x;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.os.Build;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public final class zzbe {
    public zzbe() {
        new ConcurrentHashMap();
        zzb();
    }

    public static final Set zza(Context context) {
        try {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Object systemService = context.getSystemService("connectivity");
            l.c(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
            ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
            if (networkCapabilities != null && networkCapabilities.hasTransport(1)) {
                linkedHashSet.add(zzqi.TRANSPORT_WIFI);
            }
            if (networkCapabilities != null && networkCapabilities.hasTransport(0)) {
                linkedHashSet.add(zzqi.TRANSPORT_CELLULAR);
            }
            if (networkCapabilities != null && networkCapabilities.hasTransport(4)) {
                linkedHashSet.add(zzqi.TRANSPORT_VPN);
            }
            if (networkCapabilities != null && networkCapabilities.hasTransport(3)) {
                linkedHashSet.add(zzqi.TRANSPORT_ETHERNET);
            }
            if (networkCapabilities != null && networkCapabilities.hasCapability(16)) {
                linkedHashSet.add(zzqi.NET_CAPABILITY_VALIDATED);
            }
            return linkedHashSet;
        } catch (Exception unused) {
            return x.f3893a;
        }
    }

    private static final Map zzb() {
        LinkedHashMap I6 = B.I(new j(0, zzqi.NET_CAPABILITY_MMS), new j(1, zzqi.NET_CAPABILITY_SUPL), new j(2, zzqi.NET_CAPABILITY_DUN), new j(3, zzqi.NET_CAPABILITY_FOTA), new j(4, zzqi.NET_CAPABILITY_IMS), new j(5, zzqi.NET_CAPABILITY_CBS), new j(6, zzqi.NET_CAPABILITY_WIFI_P2P), new j(7, zzqi.NET_CAPABILITY_IA), new j(8, zzqi.NET_CAPABILITY_RCS), new j(9, zzqi.NET_CAPABILITY_XCAP), new j(10, zzqi.NET_CAPABILITY_EIMS), new j(11, zzqi.NET_CAPABILITY_NOT_METERED), new j(12, zzqi.NET_CAPABILITY_INTERNET), new j(13, zzqi.NET_CAPABILITY_NOT_RESTRICTED), new j(14, zzqi.NET_CAPABILITY_TRUSTED), new j(15, zzqi.NET_CAPABILITY_NOT_VPN));
        int i7 = Build.VERSION.SDK_INT;
        I6.put(17, zzqi.NET_CAPABILITY_CAPTIVE_PORTAL);
        I6.put(16, zzqi.NET_CAPABILITY_VALIDATED);
        if (i7 >= 28) {
            I6.put(18, zzqi.NET_CAPABILITY_NOT_ROAMING);
            I6.put(19, zzqi.NET_CAPABILITY_FOREGROUND);
            I6.put(20, zzqi.NET_CAPABILITY_NOT_CONGESTED);
            I6.put(21, zzqi.NET_CAPABILITY_NOT_SUSPENDED);
        }
        if (i7 >= 29) {
            I6.put(23, zzqi.NET_CAPABILITY_MCX);
        }
        if (i7 >= 30) {
            I6.put(25, zzqi.NET_CAPABILITY_TEMPORARILY_NOT_METERED);
        }
        if (i7 >= 31) {
            I6.put(32, zzqi.NET_CAPABILITY_HEAD_UNIT);
            I6.put(29, zzqi.NET_CAPABILITY_ENTERPRISE);
        }
        if (i7 >= 33) {
            I6.put(35, zzqi.NET_CAPABILITY_PRIORITIZE_BANDWIDTH);
            I6.put(34, zzqi.NET_CAPABILITY_PRIORITIZE_LATENCY);
            I6.put(33, zzqi.NET_CAPABILITY_MMTEL);
        }
        return I6;
    }
}
