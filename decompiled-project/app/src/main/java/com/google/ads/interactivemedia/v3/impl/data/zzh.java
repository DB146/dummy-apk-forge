package com.google.ads.interactivemedia.v3.impl.data;

import A3.c;
import h3.o;

/* loaded from: classes.dex */
final class zzh extends zzb {
    private final String appState;
    private final String eventId;
    private final long nativeTime;
    private final zzau nativeViewBounds;
    private final boolean nativeViewHidden;
    private final zzau nativeViewVisibleBounds;
    private final double nativeVolume;
    private final String queryId;

    private zzh(String str, String str2, String str3, long j, double d10, boolean z8, zzau zzauVar, zzau zzauVar2) {
        this.queryId = str;
        this.eventId = str2;
        this.appState = str3;
        this.nativeTime = j;
        this.nativeVolume = d10;
        this.nativeViewHidden = z8;
        this.nativeViewBounds = zzauVar;
        this.nativeViewVisibleBounds = zzauVar2;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzb
    public String appState() {
        return this.appState;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzb) {
            zzb zzbVar = (zzb) obj;
            if (this.queryId.equals(zzbVar.queryId()) && this.eventId.equals(zzbVar.eventId()) && this.appState.equals(zzbVar.appState()) && this.nativeTime == zzbVar.nativeTime() && Double.doubleToLongBits(this.nativeVolume) == Double.doubleToLongBits(zzbVar.nativeVolume()) && this.nativeViewHidden == zzbVar.nativeViewHidden() && this.nativeViewBounds.equals(zzbVar.nativeViewBounds()) && this.nativeViewVisibleBounds.equals(zzbVar.nativeViewVisibleBounds())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzb
    public String eventId() {
        return this.eventId;
    }

    public int hashCode() {
        int hashCode = ((((this.queryId.hashCode() ^ 1000003) * 1000003) ^ this.eventId.hashCode()) * 1000003) ^ this.appState.hashCode();
        long j = this.nativeTime;
        return (((((((((hashCode * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.nativeVolume) >>> 32) ^ Double.doubleToLongBits(this.nativeVolume)))) * 1000003) ^ (true != this.nativeViewHidden ? 1237 : 1231)) * 1000003) ^ this.nativeViewBounds.hashCode()) * 1000003) ^ this.nativeViewVisibleBounds.hashCode();
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzb
    public long nativeTime() {
        return this.nativeTime;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzb
    public zzau nativeViewBounds() {
        return this.nativeViewBounds;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzb
    public boolean nativeViewHidden() {
        return this.nativeViewHidden;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzb
    public zzau nativeViewVisibleBounds() {
        return this.nativeViewVisibleBounds;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzb
    public double nativeVolume() {
        return this.nativeVolume;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzb
    public String queryId() {
        return this.queryId;
    }

    public String toString() {
        String str = this.queryId;
        String str2 = this.eventId;
        String str3 = this.appState;
        long j = this.nativeTime;
        double d10 = this.nativeVolume;
        boolean z8 = this.nativeViewHidden;
        String valueOf = String.valueOf(this.nativeViewBounds);
        String valueOf2 = String.valueOf(this.nativeViewVisibleBounds);
        StringBuilder o10 = c.o("ActivityMonitorData{queryId=", str, ", eventId=", str2, ", appState=");
        o10.append(str3);
        o10.append(", nativeTime=");
        o10.append(j);
        o10.append(", nativeVolume=");
        o10.append(d10);
        o10.append(", nativeViewHidden=");
        o10.append(z8);
        o10.append(", nativeViewBounds=");
        o10.append(valueOf);
        o10.append(", nativeViewVisibleBounds=");
        return o.p(o10, valueOf2, "}");
    }
}
