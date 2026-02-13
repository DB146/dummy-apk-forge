package com.google.ads.interactivemedia.v3.impl.data;

import com.google.ads.interactivemedia.v3.internal.zzqy;

@zzqy(zza = zzac.class)
/* loaded from: classes.dex */
public abstract class zzbj {
    private static zzbj create(String str, String str2, String str3, int i7) {
        return new zzac(str, str2, str3, i7);
    }

    public static zzbj forError(String str, int i7) {
        return create(str, "", "unknown", i7);
    }

    public static zzbj forResponse(String str, String str2) {
        return forResponse(str, str2, "unknown");
    }

    public static zzbj forResponse(String str, String str2, String str3) {
        return create(str, str2, str3, 0);
    }

    public abstract String content();

    public abstract String contentType();

    public abstract int errorCode();

    public abstract String id();
}
