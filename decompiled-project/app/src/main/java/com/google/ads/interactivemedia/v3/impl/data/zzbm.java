package com.google.ads.interactivemedia.v3.impl.data;

import com.google.ads.interactivemedia.v3.api.FriendlyObstructionPurpose;
import com.google.ads.interactivemedia.v3.internal.zzqy;

@zzqy(zza = zzai.class)
/* loaded from: classes.dex */
public abstract class zzbm {
    public static zzbl builder() {
        return new zzag();
    }

    public abstract boolean attached();

    public abstract zzau bounds();

    public abstract String detailedReason();

    public abstract boolean hidden();

    public abstract FriendlyObstructionPurpose purpose();

    public abstract String type();
}
