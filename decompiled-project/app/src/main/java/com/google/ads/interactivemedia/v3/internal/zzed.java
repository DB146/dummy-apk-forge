package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import com.google.ads.interactivemedia.v3.api.AdDisplayContainer;
import com.google.ads.interactivemedia.v3.api.AdErrorEvent;
import com.google.ads.interactivemedia.v3.api.AdEvent;
import com.google.ads.interactivemedia.v3.api.AdsManager;
import com.google.ads.interactivemedia.v3.api.AdsRenderingSettings;
import com.google.ads.interactivemedia.v3.api.player.VideoProgressUpdate;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;

/* loaded from: classes.dex */
public final class zzed extends zzep implements AdsManager, AdErrorEvent.AdErrorListener {
    private final List zza;
    private final zzgo zzb;
    private zzeu zzc;
    private zzev zzd;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzed(String str, zzfm zzfmVar, AdDisplayContainer adDisplayContainer, zzev zzevVar, List list, SortedSet sortedSet, zzge zzgeVar, zzex zzexVar, Context context, boolean z8) {
        super(str, zzfmVar, r6, adDisplayContainer, r5, zzgeVar, zzexVar, context, z8);
        zzfu zzfuVar = new zzfu(str, zzfmVar, zzexVar, adDisplayContainer, context);
        zzdj zzdjVar = new zzdj(str, zzfmVar, adDisplayContainer.getAdContainer());
        zzgo zzgoVar = new zzgo(zzfmVar.zza(), adDisplayContainer.getAdContainer());
        this.zza = list;
        this.zzd = zzevVar;
        this.zzb = zzgoVar;
        if (zzevVar != null) {
            zzeu zzeuVar = new zzeu(zzfmVar, sortedSet, str);
            this.zzc = zzeuVar;
            zzevVar.zzc(zzeuVar);
            zzevVar.zze();
        }
        addAdErrorListener(this);
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdsManager
    public final void clicked() {
        zzn(zzfe.click);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzep, com.google.ads.interactivemedia.v3.api.BaseManager
    public final void destroy() {
        super.destroy();
        zzev zzevVar = this.zzd;
        if (zzevVar != null) {
            zzevVar.zzf();
            this.zzd = null;
        }
        this.zzb.zza();
        zzn(zzfe.destroy);
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdsManager
    public final void discardAdBreak() {
        zzn(zzfe.discardAdBreak);
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdsManager
    public final List<Float> getAdCuePoints() {
        return this.zza;
    }

    @Override // com.google.ads.interactivemedia.v3.api.BaseManager
    public final boolean isCustomPlaybackUsed() {
        return true;
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdErrorEvent.AdErrorListener
    public final void onAdError(AdErrorEvent adErrorEvent) {
        this.zzb.zza();
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdsManager
    public final void pause() {
        zzn(zzfe.pause);
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdsManager
    public final void requestNextAdBreak() {
        zzev zzevVar = this.zzd;
        if (zzevVar != null) {
            zzm(zzfd.contentTimeUpdate, zzfe.contentTimeUpdate, com.google.ads.interactivemedia.v3.impl.data.zzbr.create(zzevVar.zza()));
            zzn(zzfe.requestNextAdBreak);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdsManager
    public final void resume() {
        zzn(zzfe.resume);
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdsManager
    public final void skip() {
        zzn(zzfe.skip);
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdsManager
    public final void start() {
        zzn(zzfe.start);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzep
    public final Map zza(AdsRenderingSettings adsRenderingSettings) {
        Map zza = super.zza(adsRenderingSettings);
        zzev zzevVar = this.zzd;
        if (zzevVar != null) {
            VideoProgressUpdate zza2 = zzevVar.zza();
            if (!zza2.equals(VideoProgressUpdate.VIDEO_TIME_NOT_READY)) {
                float currentTimeMs = (float) zza2.getCurrentTimeMs();
                StringBuilder sb2 = new StringBuilder("AdsManager.init -> Setting contentStartTime ");
                double d10 = currentTimeMs / 1000.0f;
                sb2.append(d10);
                zzhd.zzc(sb2.toString());
                zza.put("contentStartTime", Double.valueOf(d10));
            }
        }
        return zza;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzep, com.google.ads.interactivemedia.v3.internal.zzfk
    public final void zzb(zzfj zzfjVar) {
        zzfu zzfuVar = (zzfu) zzc();
        AdEvent.AdEventType adEventType = zzfjVar.zza;
        AdEvent.AdEventType adEventType2 = AdEvent.AdEventType.ALL_ADS_COMPLETED;
        int ordinal = adEventType.ordinal();
        if (ordinal == 0) {
            super.destroy();
            zzev zzevVar = this.zzd;
            if (zzevVar != null) {
                zzevVar.zzf();
                this.zzd = null;
            }
            this.zzb.zza();
            zzn(zzfe.destroy);
            super.zzb(zzfjVar);
            zzl();
            return;
        }
        if (ordinal == 5) {
            zzev zzevVar2 = this.zzd;
            if (zzevVar2 != null) {
                zzevVar2.zzf();
            }
        } else if (ordinal == 6) {
            this.zzb.zza();
            zzfuVar.zze();
            zzev zzevVar3 = this.zzd;
            if (zzevVar3 != null) {
                zzevVar3.zze();
            }
        } else if (ordinal == 14) {
            this.zzb.zza();
        } else if (ordinal == 15) {
            this.zzb.zzb();
        }
        super.zzb(zzfjVar);
    }
}
