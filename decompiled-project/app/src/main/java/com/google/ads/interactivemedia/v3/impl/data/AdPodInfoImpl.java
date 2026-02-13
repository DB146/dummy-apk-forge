package com.google.ads.interactivemedia.v3.impl.data;

import com.google.ads.interactivemedia.v3.api.AdPodInfo;
import com.google.ads.interactivemedia.v3.internal.zzaie;
import com.google.ads.interactivemedia.v3.internal.zzaig;
import h3.o;

/* loaded from: classes.dex */
public class AdPodInfoImpl implements AdPodInfo {
    public int podIndex;
    public double timeOffset;
    public int totalAds = 1;
    public int adPosition = 1;
    public boolean isBumper = false;
    public double maxDuration = -1.0d;

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        return zzaie.zzf(this, obj, false, null, false, new String[0]);
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdPodInfo
    public int getAdPosition() {
        return this.adPosition;
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdPodInfo
    public double getMaxDuration() {
        return this.maxDuration;
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdPodInfo
    public int getPodIndex() {
        return this.podIndex;
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdPodInfo
    public double getTimeOffset() {
        return this.timeOffset;
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdPodInfo
    public int getTotalAds() {
        return this.totalAds;
    }

    public int hashCode() {
        return zzaig.zza(this, new String[0]);
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdPodInfo
    public boolean isBumper() {
        return this.isBumper;
    }

    public String toString() {
        int i7 = this.totalAds;
        int i10 = this.adPosition;
        boolean z8 = this.isBumper;
        double d10 = this.maxDuration;
        int i11 = this.podIndex;
        double d11 = this.timeOffset;
        StringBuilder q10 = o.q(i7, i10, "AdPodInfo [totalAds=", ", adPosition=", ", isBumper=");
        q10.append(z8);
        q10.append(", maxDuration=");
        q10.append(d10);
        q10.append(", podIndex=");
        q10.append(i11);
        q10.append(", timeOffset=");
        q10.append(d11);
        q10.append("]");
        return q10.toString();
    }
}
