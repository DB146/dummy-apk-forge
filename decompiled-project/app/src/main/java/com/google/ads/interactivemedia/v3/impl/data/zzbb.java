package com.google.ads.interactivemedia.v3.impl.data;

import com.google.ads.interactivemedia.v3.internal.zzqy;
import h3.o;

@zzqy(zza = zzx.class)
/* loaded from: classes.dex */
public abstract class zzbb {
    public abstract String alternateText();

    public abstract String creativeType();

    public abstract int height();

    public abstract String imageUrl();

    public final String toString() {
        int width = width();
        int height = height();
        String imageUrl = imageUrl();
        String alternateText = alternateText();
        String creativeType = creativeType();
        StringBuilder q10 = o.q(width, height, "IconClickFallbackImageMsgData [width=", ", height=", ", imageUrl=");
        o.v(q10, imageUrl, ", alternateText=", alternateText, ", creativeType=");
        return o.p(q10, creativeType, "]");
    }

    public abstract int width();
}
