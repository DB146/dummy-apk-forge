package com.google.ads.interactivemedia.pal;

import com.google.ads.interactivemedia.pal.NonceRequest;
import h3.o;
import java.util.Set;

/* loaded from: classes.dex */
final class zzn extends NonceRequest {
    private final Boolean zza;
    private final Boolean zzb;
    private final Integer zzc;
    private final Integer zzd;
    private final Integer zze;
    private final Boolean zzf;
    private final Boolean zzg;
    private final String zzh;
    private final String zzi;
    private final String zzj;
    private final String zzk;
    private final String zzl;
    private final String zzm;
    private final String zzn;
    private final PlatformSignalCollector zzo;
    private final Set zzp;
    private final String zzq;

    public /* synthetic */ zzn(Boolean bool, Boolean bool2, Integer num, Integer num2, Integer num3, Boolean bool3, Boolean bool4, String str, String str2, String str3, String str4, String str5, String str6, String str7, PlatformSignalCollector platformSignalCollector, Set set, String str8, zzm zzmVar) {
        this.zza = bool;
        this.zzb = bool2;
        this.zzc = num;
        this.zzd = num2;
        this.zze = num3;
        this.zzf = bool3;
        this.zzg = bool4;
        this.zzh = str;
        this.zzi = str2;
        this.zzj = str3;
        this.zzk = str4;
        this.zzl = str5;
        this.zzm = str6;
        this.zzn = str7;
        this.zzo = platformSignalCollector;
        this.zzp = set;
        this.zzq = str8;
    }

    public final boolean equals(Object obj) {
        Integer num;
        Integer num2;
        Integer num3;
        Boolean bool;
        Boolean bool2;
        PlatformSignalCollector platformSignalCollector;
        if (obj == this) {
            return true;
        }
        if (obj instanceof NonceRequest) {
            NonceRequest nonceRequest = (NonceRequest) obj;
            Boolean bool3 = this.zza;
            if (bool3 != null ? bool3.equals(nonceRequest.zzb()) : nonceRequest.zzb() == null) {
                if (this.zzb.equals(nonceRequest.zzc()) && ((num = this.zzc) != null ? num.equals(nonceRequest.zzf()) : nonceRequest.zzf() == null) && ((num2 = this.zzd) != null ? num2.equals(nonceRequest.zzg()) : nonceRequest.zzg() == null) && ((num3 = this.zze) != null ? num3.equals(nonceRequest.zzh()) : nonceRequest.zzh() == null) && ((bool = this.zzf) != null ? bool.equals(nonceRequest.zze()) : nonceRequest.zze() == null) && ((bool2 = this.zzg) != null ? bool2.equals(nonceRequest.zzd()) : nonceRequest.zzd() == null) && this.zzh.equals(nonceRequest.zzi()) && this.zzi.equals(nonceRequest.zzj()) && this.zzj.equals(nonceRequest.zzk()) && this.zzk.equals(nonceRequest.zzl()) && this.zzl.equals(nonceRequest.zzm()) && this.zzm.equals(nonceRequest.zzn()) && this.zzn.equals(nonceRequest.zzo()) && ((platformSignalCollector = this.zzo) != null ? platformSignalCollector.equals(nonceRequest.zza()) : nonceRequest.zza() == null) && this.zzp.equals(nonceRequest.zzq()) && this.zzq.equals(nonceRequest.zzp())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Boolean bool = this.zza;
        int hashCode = ((((bool == null ? 0 : bool.hashCode()) ^ 1000003) * 1000003) ^ this.zzb.hashCode()) * 1000003;
        Integer num = this.zzc;
        int hashCode2 = (hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        Integer num2 = this.zzd;
        int hashCode3 = (hashCode2 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
        Integer num3 = this.zze;
        int hashCode4 = (hashCode3 ^ (num3 == null ? 0 : num3.hashCode())) * 1000003;
        Boolean bool2 = this.zzf;
        int hashCode5 = (hashCode4 ^ (bool2 == null ? 0 : bool2.hashCode())) * 1000003;
        Boolean bool3 = this.zzg;
        int hashCode6 = (((((((((((((((hashCode5 ^ (bool3 == null ? 0 : bool3.hashCode())) * 1000003) ^ this.zzh.hashCode()) * 1000003) ^ this.zzi.hashCode()) * 1000003) ^ this.zzj.hashCode()) * 1000003) ^ this.zzk.hashCode()) * 1000003) ^ this.zzl.hashCode()) * 1000003) ^ this.zzm.hashCode()) * 1000003) ^ this.zzn.hashCode()) * 1000003;
        PlatformSignalCollector platformSignalCollector = this.zzo;
        return ((((hashCode6 ^ (platformSignalCollector != null ? platformSignalCollector.hashCode() : 0)) * 1000003) ^ this.zzp.hashCode()) * 1000003) ^ this.zzq.hashCode();
    }

    @Override // com.google.ads.interactivemedia.pal.NonceRequest
    public final NonceRequest.Builder toBuilder() {
        return new zzl(this, null);
    }

    public final String toString() {
        Boolean bool = this.zza;
        Boolean bool2 = this.zzb;
        Integer num = this.zzc;
        Integer num2 = this.zzd;
        Integer num3 = this.zze;
        Boolean bool3 = this.zzf;
        Boolean bool4 = this.zzg;
        String str = this.zzh;
        String str2 = this.zzi;
        String str3 = this.zzj;
        String str4 = this.zzk;
        String str5 = this.zzl;
        String str6 = this.zzm;
        String str7 = this.zzn;
        String valueOf = String.valueOf(this.zzo);
        String obj = this.zzp.toString();
        String str8 = this.zzq;
        StringBuilder sb2 = new StringBuilder("NonceRequest{continuousPlayback=");
        sb2.append(bool);
        sb2.append(", iconsSupported=");
        sb2.append(bool2);
        sb2.append(", nonceLengthLimit=");
        sb2.append(num);
        sb2.append(", videoPlayerHeight=");
        sb2.append(num2);
        sb2.append(", videoPlayerWidth=");
        sb2.append(num3);
        sb2.append(", willAdPlayMuted=");
        sb2.append(bool3);
        sb2.append(", willAdAutoPlay=");
        sb2.append(bool4);
        sb2.append(", descriptionURL=");
        sb2.append(str);
        sb2.append(", omidPartnerName=");
        o.v(sb2, str2, ", omidPartnerVersion=", str3, ", omidVersion=");
        o.v(sb2, str4, ", playerType=", str5, ", playerVersion=");
        o.v(sb2, str6, ", ppid=", str7, ", platformSignalCollector=");
        o.v(sb2, valueOf, ", supportedApiFrameworks=", obj, ", sessionId=");
        return o.p(sb2, str8, "}");
    }

    @Override // com.google.ads.interactivemedia.pal.NonceRequest
    public final PlatformSignalCollector zza() {
        return this.zzo;
    }

    @Override // com.google.ads.interactivemedia.pal.NonceRequest
    public final Boolean zzb() {
        return this.zza;
    }

    @Override // com.google.ads.interactivemedia.pal.NonceRequest
    public final Boolean zzc() {
        return this.zzb;
    }

    @Override // com.google.ads.interactivemedia.pal.NonceRequest
    public final Boolean zzd() {
        return this.zzg;
    }

    @Override // com.google.ads.interactivemedia.pal.NonceRequest
    public final Boolean zze() {
        return this.zzf;
    }

    @Override // com.google.ads.interactivemedia.pal.NonceRequest
    public final Integer zzf() {
        return this.zzc;
    }

    @Override // com.google.ads.interactivemedia.pal.NonceRequest
    public final Integer zzg() {
        return this.zzd;
    }

    @Override // com.google.ads.interactivemedia.pal.NonceRequest
    public final Integer zzh() {
        return this.zze;
    }

    @Override // com.google.ads.interactivemedia.pal.NonceRequest
    public final String zzi() {
        return this.zzh;
    }

    @Override // com.google.ads.interactivemedia.pal.NonceRequest
    public final String zzj() {
        return this.zzi;
    }

    @Override // com.google.ads.interactivemedia.pal.NonceRequest
    public final String zzk() {
        return this.zzj;
    }

    @Override // com.google.ads.interactivemedia.pal.NonceRequest
    public final String zzl() {
        return this.zzk;
    }

    @Override // com.google.ads.interactivemedia.pal.NonceRequest
    public final String zzm() {
        return this.zzl;
    }

    @Override // com.google.ads.interactivemedia.pal.NonceRequest
    public final String zzn() {
        return this.zzm;
    }

    @Override // com.google.ads.interactivemedia.pal.NonceRequest
    public final String zzo() {
        return this.zzn;
    }

    @Override // com.google.ads.interactivemedia.pal.NonceRequest
    public final String zzp() {
        return this.zzq;
    }

    @Override // com.google.ads.interactivemedia.pal.NonceRequest
    public final Set zzq() {
        return this.zzp;
    }
}
