package com.google.ads.interactivemedia.v3.impl.data;

import com.google.ads.interactivemedia.v3.internal.zzqy;

@zzqy(zza = zzab.class)
/* loaded from: classes.dex */
public abstract class NetworkRequestData {

    /* loaded from: classes.dex */
    public enum RequestType {
        GET,
        POST
    }

    public static NetworkRequestData create(RequestType requestType, String str, String str2, String str3, String str4, int i7, int i10) {
        return new zzab(requestType, str, str2, str4, str3, i7, i10);
    }

    public abstract int connectionTimeoutMs();

    public abstract String content();

    public abstract String id();

    public abstract int readTimeoutMs();

    public abstract RequestType requestType();

    public abstract String url();

    public abstract String userAgent();
}
