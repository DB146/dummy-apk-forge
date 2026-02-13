package com.google.ads.interactivemedia.v3.internal;

import com.google.ads.interactivemedia.v3.api.AdProgressInfo;

/* loaded from: classes.dex */
public final class zzdp implements AdProgressInfo {
    private final double zza;
    private final double zzb;
    private final int zzc;
    private final int zzd;
    private final double zze;
    private final double zzf;

    public zzdp(double d10, double d11, int i7, int i10, double d12, double d13) {
        this.zza = d10;
        this.zzb = d11;
        this.zzc = i7;
        this.zzd = i10;
        this.zze = d12;
        this.zzf = d13;
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdProgressInfo
    public final double getAdBreakDuration() {
        return this.zze;
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdProgressInfo
    public final double getAdPeriodDuration() {
        return this.zzf;
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdProgressInfo
    public final int getAdPosition() {
        return this.zzc;
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdProgressInfo
    public final double getCurrentTime() {
        return this.zza;
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdProgressInfo
    public final double getDuration() {
        return this.zzb;
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdProgressInfo
    public final int getTotalAds() {
        return this.zzd;
    }
}
