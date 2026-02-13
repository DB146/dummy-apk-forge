package com.google.ads.interactivemedia.v3.impl.data;

import com.google.ads.interactivemedia.v3.api.VersionInfo;
import com.google.ads.interactivemedia.v3.internal.zzqy;

@zzqy(zza = zzal.class)
/* loaded from: classes.dex */
public abstract class zzbp {
    public static zzbp create(int i7, int i10, int i11) {
        return new zzal(i7, i10, i11);
    }

    public static zzbp create(VersionInfo versionInfo) {
        return create(versionInfo.getMajorVersion(), versionInfo.getMinorVersion(), versionInfo.getMicroVersion());
    }

    public abstract int major();

    public abstract int micro();

    public abstract int minor();
}
