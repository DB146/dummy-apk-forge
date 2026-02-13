package com.google.ads.interactivemedia.v3.impl.data;

import A3.c;
import com.google.ads.interactivemedia.v3.api.CompanionAd;
import com.google.ads.interactivemedia.v3.internal.zzaie;
import com.google.ads.interactivemedia.v3.internal.zzaig;

/* loaded from: classes.dex */
public class CompanionAdImpl implements CompanionAd {
    private String apiFramework;
    private String resourceValue;
    private zzbq size = zzbq.create(0, 0);

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        return zzaie.zzf(this, obj, false, null, false, new String[0]);
    }

    @Override // com.google.ads.interactivemedia.v3.api.CompanionAd
    public String getApiFramework() {
        return this.apiFramework;
    }

    @Override // com.google.ads.interactivemedia.v3.api.CompanionAd
    public int getHeight() {
        return this.size.height().intValue();
    }

    @Override // com.google.ads.interactivemedia.v3.api.CompanionAd
    public String getResourceValue() {
        return this.resourceValue;
    }

    @Override // com.google.ads.interactivemedia.v3.api.CompanionAd
    public int getWidth() {
        return this.size.width().intValue();
    }

    public int hashCode() {
        return zzaig.zza(this, new String[0]);
    }

    public void setApiFramework(String str) {
        this.apiFramework = str;
    }

    public void setResourceValue(String str) {
        this.resourceValue = str;
    }

    public void setSize(zzbq zzbqVar) {
        this.size = zzbqVar;
    }

    public String toString() {
        String str = this.apiFramework;
        String str2 = this.resourceValue;
        Integer width = this.size.width();
        Integer height = this.size.height();
        StringBuilder o10 = c.o("CompanionAd [apiFramework=", str, ", resourceUrl=", str2, ", width=");
        o10.append(width);
        o10.append(", height=");
        o10.append(height);
        o10.append("]");
        return o10.toString();
    }
}
