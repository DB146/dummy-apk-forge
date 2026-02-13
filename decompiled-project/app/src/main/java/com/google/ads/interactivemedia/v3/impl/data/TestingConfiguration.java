package com.google.ads.interactivemedia.v3.impl.data;

import com.google.ads.interactivemedia.v3.internal.zzqy;

@zzqy(zza = zzan.class, zzb = {"extraParams", "isTv", "ignoreStrictModeFalsePositives"})
/* loaded from: classes.dex */
public abstract class TestingConfiguration {

    /* loaded from: classes.dex */
    public interface Builder {
    }

    public abstract boolean forceAndroidTvMode();

    public abstract boolean forceTvMode();

    public abstract boolean ignoreStrictModeFalsePositives();
}
