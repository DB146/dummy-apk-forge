package com.google.ads.interactivemedia.v3.api;

/* loaded from: classes.dex */
public final class VersionInfo {
    private final int zza;
    private final int zzb;
    private final int zzc;

    public VersionInfo(int i7, int i10, int i11) {
        this.zza = i7;
        this.zzb = i10;
        this.zzc = i11;
    }

    public int getMajorVersion() {
        return this.zza;
    }

    public int getMicroVersion() {
        return this.zzc;
    }

    public int getMinorVersion() {
        return this.zzb;
    }

    public String toString() {
        return this.zza + "." + this.zzb + "." + this.zzc;
    }
}
