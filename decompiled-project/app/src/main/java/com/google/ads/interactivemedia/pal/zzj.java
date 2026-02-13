package com.google.ads.interactivemedia.pal;

import A3.c;
import com.google.android.gms.internal.pal.zzagc;
import h3.o;

/* loaded from: classes.dex */
final class zzj extends zzw {
    private final zzagc zza;
    private final zzagc zzb;
    private final zzagc zzc;
    private final zzagc zzd;
    private final zzagc zze;
    private final int zzf;

    public /* synthetic */ zzj(zzagc zzagcVar, zzagc zzagcVar2, zzagc zzagcVar3, zzagc zzagcVar4, zzagc zzagcVar5, int i7, zzi zziVar) {
        this.zza = zzagcVar;
        this.zzb = zzagcVar2;
        this.zzc = zzagcVar3;
        this.zzd = zzagcVar4;
        this.zze = zzagcVar5;
        this.zzf = i7;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzw) {
            zzw zzwVar = (zzw) obj;
            if (this.zza.equals(zzwVar.zzc()) && this.zzb.equals(zzwVar.zzd()) && this.zzc.equals(zzwVar.zzb()) && this.zzd.equals(zzwVar.zzf()) && this.zze.equals(zzwVar.zze()) && this.zzf == zzwVar.zza()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((this.zza.hashCode() ^ 1000003) * 1000003) ^ this.zzb.hashCode()) * 1000003) ^ this.zzc.hashCode()) * 1000003) ^ this.zzd.hashCode()) * 1000003) ^ this.zze.hashCode()) * 1000003) ^ this.zzf;
    }

    public final String toString() {
        String zzageVar = this.zza.toString();
        String zzageVar2 = this.zzb.toString();
        String zzageVar3 = this.zzc.toString();
        String zzageVar4 = this.zzd.toString();
        String zzageVar5 = this.zze.toString();
        int i7 = this.zzf;
        StringBuilder o10 = c.o("NonceTimingData{nonceLoaderInitTime=", zzageVar, ", nonceRequestTime=", zzageVar2, ", nonceLoadedTime=");
        o.v(o10, zzageVar3, ", resourceFetchStartTime=", zzageVar4, ", resourceFetchEndTime=");
        o10.append(zzageVar5);
        o10.append(", nonceLength=");
        o10.append(i7);
        o10.append("}");
        return o10.toString();
    }

    @Override // com.google.ads.interactivemedia.pal.zzw
    public final int zza() {
        return this.zzf;
    }

    @Override // com.google.ads.interactivemedia.pal.zzw
    public final zzagc zzb() {
        return this.zzc;
    }

    @Override // com.google.ads.interactivemedia.pal.zzw
    public final zzagc zzc() {
        return this.zza;
    }

    @Override // com.google.ads.interactivemedia.pal.zzw
    public final zzagc zzd() {
        return this.zzb;
    }

    @Override // com.google.ads.interactivemedia.pal.zzw
    public final zzagc zze() {
        return this.zze;
    }

    @Override // com.google.ads.interactivemedia.pal.zzw
    public final zzagc zzf() {
        return this.zzd;
    }
}
