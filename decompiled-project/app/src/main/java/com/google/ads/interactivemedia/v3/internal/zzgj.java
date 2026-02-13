package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import android.util.Log;
import com.google.ads.interactivemedia.v3.api.AdEvent;
import com.google.ads.interactivemedia.v3.api.CuePoint;
import com.google.ads.interactivemedia.v3.api.StreamDisplayContainer;
import com.google.ads.interactivemedia.v3.api.StreamManager;
import com.kt.apps.core.utils.blurry.BlurFactor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzgj extends zzep implements StreamManager {
    private final String zza;
    private List zzb;

    public zzgj(String str, zzfm zzfmVar, StreamDisplayContainer streamDisplayContainer, zzgm zzgmVar, zzdj zzdjVar, zzge zzgeVar, zzex zzexVar, Context context, String str2, boolean z8) {
        super(str, zzfmVar, zzgmVar, streamDisplayContainer, zzdjVar, zzgeVar, zzexVar, context, z8);
        this.zzb = new ArrayList();
        this.zza = str2;
        zzgmVar.zzk();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzep, com.google.ads.interactivemedia.v3.api.BaseManager
    public final void destroy() {
        super.destroy();
        zzn(zzfe.contentComplete);
        zzl();
    }

    @Override // com.google.ads.interactivemedia.v3.api.StreamManager
    public final double getContentTimeForStreamTime(double d10) {
        double d11 = d10;
        for (CuePoint cuePoint : this.zzb) {
            if (cuePoint.getStartTime() > cuePoint.getEndTime()) {
                return 0.0d;
            }
            if (d10 >= cuePoint.getEndTime()) {
                d11 -= cuePoint.getEndTime() - cuePoint.getStartTime();
            } else if (d10 < cuePoint.getEndTime() && d10 > cuePoint.getStartTime()) {
                d11 -= d10 - cuePoint.getStartTime();
            }
        }
        return d11;
    }

    @Override // com.google.ads.interactivemedia.v3.api.StreamManager
    public final long getContentTimeMsForStreamTimeMs(long j) {
        long j10 = j;
        for (CuePoint cuePoint : this.zzb) {
            if (cuePoint.getStartTimeMs() > cuePoint.getEndTimeMs()) {
                return 0L;
            }
            if (j >= cuePoint.getEndTimeMs()) {
                j10 -= cuePoint.getEndTimeMs() - cuePoint.getStartTimeMs();
            } else if (j < cuePoint.getEndTimeMs() && j > cuePoint.getStartTimeMs()) {
                j10 -= j - cuePoint.getStartTimeMs();
            }
        }
        return j10;
    }

    @Override // com.google.ads.interactivemedia.v3.api.StreamManager
    public final List<CuePoint> getCuePoints() {
        return Collections.unmodifiableList(this.zzb);
    }

    @Override // com.google.ads.interactivemedia.v3.api.StreamManager
    public final CuePoint getPreviousCuePointForStreamTime(double d10) {
        CuePoint cuePoint = null;
        for (CuePoint cuePoint2 : this.zzb) {
            if (cuePoint2.getStartTime() < d10) {
                cuePoint = cuePoint2;
            }
        }
        return cuePoint;
    }

    @Override // com.google.ads.interactivemedia.v3.api.StreamManager
    public final CuePoint getPreviousCuePointForStreamTimeMs(long j) {
        CuePoint cuePoint = null;
        for (CuePoint cuePoint2 : this.zzb) {
            if (cuePoint2.getStartTimeMs() < j) {
                cuePoint = cuePoint2;
            }
        }
        return cuePoint;
    }

    @Override // com.google.ads.interactivemedia.v3.api.StreamManager
    public final String getStreamId() {
        return this.zza;
    }

    @Override // com.google.ads.interactivemedia.v3.api.StreamManager
    public final double getStreamTimeForContentTime(double d10) {
        double d11 = d10;
        double d12 = 0.0d;
        double d13 = 0.0d;
        for (CuePoint cuePoint : this.zzb) {
            if (cuePoint.getStartTime() > cuePoint.getEndTime()) {
                return 0.0d;
            }
            d12 += cuePoint.getStartTime() - d13;
            if (d12 > d10) {
                return d11;
            }
            d11 += cuePoint.getEndTime() - cuePoint.getStartTime();
            d13 = cuePoint.getEndTime();
        }
        return d11;
    }

    @Override // com.google.ads.interactivemedia.v3.api.StreamManager
    public final long getStreamTimeMsForContentTimeMs(long j) {
        long j10 = j;
        long j11 = 0;
        long j12 = 0;
        for (CuePoint cuePoint : this.zzb) {
            if (cuePoint.getStartTimeMs() > cuePoint.getEndTimeMs()) {
                return 0L;
            }
            j11 += cuePoint.getStartTimeMs() - j12;
            if (j11 > j) {
                return j10;
            }
            j10 += cuePoint.getEndTimeMs() - cuePoint.getStartTimeMs();
            j12 = cuePoint.getEndTimeMs();
        }
        return j10;
    }

    @Override // com.google.ads.interactivemedia.v3.api.BaseManager
    public final boolean isCustomPlaybackUsed() {
        return true;
    }

    @Override // com.google.ads.interactivemedia.v3.api.StreamManager
    public final void replaceAdTagParameters(Map<String, String> map) {
        if (map == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("adTagParameters", map);
        zzm(zzfd.adsManager, zzfe.replaceAdTagParameters, hashMap);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzep, com.google.ads.interactivemedia.v3.internal.zzfk
    public final void zzb(zzfj zzfjVar) {
        zzgm zzgmVar = (zzgm) zzc();
        AdEvent.AdEventType adEventType = AdEvent.AdEventType.ALL_ADS_COMPLETED;
        int ordinal = zzfjVar.zza.ordinal();
        if (ordinal == 3) {
            zzgmVar.zzn();
        } else if (ordinal == 4) {
            this.zzb = zzfjVar.zzd;
        } else if (ordinal == 14) {
            Log.i("IMASDK", "Seek time when ad is skipped: " + zzfjVar.zzg);
            zzgmVar.zzl(Math.round(zzfjVar.zzg * 1000.0d));
        } else if (ordinal != 15) {
            switch (ordinal) {
                case 23:
                    zzgmVar.zze();
                    break;
                case 24:
                    zzgmVar.zzb();
                    break;
                case BlurFactor.DEFAULT_RADIUS /* 25 */:
                    zzgmVar.zzj();
                    break;
                case 26:
                    zzgmVar.zzi();
                    break;
            }
        } else {
            zzgmVar.zzm(zzfjVar.zzb);
        }
        super.zzb(zzfjVar);
    }
}
