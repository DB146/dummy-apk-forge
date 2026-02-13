package com.google.ads.interactivemedia.v3.impl.data;

import com.google.ads.interactivemedia.v3.internal.zzqy;

@zzqy(zza = zzy.class)
/* loaded from: classes.dex */
public abstract class zzbc {
    public static zzbc create(String str, String str2, boolean z8, String str3, int i7, String str4) {
        return new zzy(str, str2, z8, str3, i7, str4);
    }

    public abstract String adsIdentityToken();

    public abstract String appSetId();

    public abstract int appSetIdScope();

    public abstract String deviceId();

    public abstract String idType();

    public abstract boolean isLimitedAdTracking();
}
