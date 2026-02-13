package com.google.ads.interactivemedia.v3.internal;

import G3.C0283e;
import K6.c;
import android.app.Application;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.google.ads.interactivemedia.v3.api.Ad;
import com.google.ads.interactivemedia.v3.api.AdError;
import com.google.ads.interactivemedia.v3.api.AdErrorEvent;
import com.google.ads.interactivemedia.v3.api.AdEvent;
import com.google.ads.interactivemedia.v3.api.AdProgressInfo;
import com.google.ads.interactivemedia.v3.api.AdsRenderingSettings;
import com.google.ads.interactivemedia.v3.api.BaseDisplayContainer;
import com.google.ads.interactivemedia.v3.api.BaseManager;
import com.google.ads.interactivemedia.v3.api.CompanionAdSlot;
import com.google.ads.interactivemedia.v3.api.FriendlyObstruction;
import com.google.ads.interactivemedia.v3.api.player.VideoProgressUpdate;
import com.google.ads.interactivemedia.v3.impl.data.AdImpl;
import com.google.ads.interactivemedia.v3.impl.data.CompanionData;
import com.google.ads.interactivemedia.v3.impl.data.ResizeAndPositionVideoMsgData;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
abstract class zzep implements BaseManager, zzfk, zzgr {
    private final zzfm zza;
    private final String zzb;
    private final List zzc;
    private final zzex zzd;
    private final Context zze;
    private final zzdj zzf;
    private final zzge zzg;
    private final zzgn zzh;
    private AdImpl zzi;
    private AdProgressInfo zzj;
    private AdsRenderingSettings zzk;
    private boolean zzl;
    private final zzhy zzm;
    private zzgs zzn;

    public zzep(String str, zzfm zzfmVar, zzgn zzgnVar, BaseDisplayContainer baseDisplayContainer, zzdj zzdjVar, zzge zzgeVar, zzex zzexVar, Context context, boolean z8) {
        ArrayList arrayList = new ArrayList(1);
        this.zzc = arrayList;
        this.zzl = false;
        this.zzb = str;
        this.zza = zzfmVar;
        this.zzh = zzgnVar;
        this.zze = context;
        this.zzd = zzexVar;
        this.zzk = new com.google.ads.interactivemedia.v3.impl.data.zze();
        this.zzf = zzdjVar;
        zzdjVar.zzj(z8);
        if (zzgeVar == null) {
            zzgeVar = null;
        } else {
            zzgeVar.zzg(str);
            zzgeVar.zzd(baseDisplayContainer.getAdContainer());
            arrayList.add(zzgeVar);
            zzexVar.zza(zzgeVar);
            zzeo zzeoVar = (zzeo) baseDisplayContainer;
            Iterator it = zzeoVar.zzb().iterator();
            while (it.hasNext()) {
                zzgeVar.zzc((FriendlyObstruction) it.next());
            }
            zzeoVar.zzc(zzgeVar);
        }
        this.zzg = zzgeVar;
        this.zzm = new zzhy(context, this.zzk);
        zzfmVar.zzg(this, str);
        zzfmVar.zzi(this.zzh, str);
        zzdjVar.zzf();
        Application zza = zzgq.zza(context);
        if (zza != null) {
            zzgs zzgsVar = new zzgs(zza);
            this.zzn = zzgsVar;
            zzgsVar.zza(this);
        }
    }

    private final void zzo(String str) {
        if (zzgq.zzc(this.zze, this.zza.zzb())) {
            this.zza.zza().requestFocus();
            this.zza.zzp(new zzff(zzfd.userInteraction, zzfe.focusUiElement, str, null));
        }
    }

    private final boolean zzp() {
        return this.zzk.getFocusSkipButtonWhenAvailable();
    }

    @Override // com.google.ads.interactivemedia.v3.api.BaseManager
    public final void addAdErrorListener(AdErrorEvent.AdErrorListener adErrorListener) {
        this.zzd.zza(adErrorListener);
    }

    @Override // com.google.ads.interactivemedia.v3.api.BaseManager
    public final void addAdEventListener(AdEvent.AdEventListener adEventListener) {
        this.zzc.add(adEventListener);
    }

    @Override // com.google.ads.interactivemedia.v3.api.BaseManager
    public void destroy() {
        this.zzl = true;
        this.zzg.zzi();
        this.zzf.zzg();
        this.zzf.zzk();
        zzgs zzgsVar = this.zzn;
        if (zzgsVar != null) {
            zzgsVar.zzb();
        }
        this.zzh.zzc();
    }

    @Override // com.google.ads.interactivemedia.v3.api.BaseManager
    public final void focus() {
        zzo(this.zzb);
    }

    @Override // com.google.ads.interactivemedia.v3.api.player.AdProgressProvider
    public final VideoProgressUpdate getAdProgress() {
        return this.zzl ? VideoProgressUpdate.VIDEO_TIME_NOT_READY : this.zzh.getAdProgress();
    }

    @Override // com.google.ads.interactivemedia.v3.api.BaseManager
    public final AdProgressInfo getAdProgressInfo() {
        return this.zzj;
    }

    @Override // com.google.ads.interactivemedia.v3.api.BaseManager
    public final Ad getCurrentAd() {
        return this.zzi;
    }

    @Override // com.google.ads.interactivemedia.v3.api.BaseManager
    public final void init() {
        this.zza.zzp(new zzff(zzfd.adsManager, zzfe.init, this.zzb, zza(this.zzk)));
        this.zzh.zzd();
    }

    @Override // com.google.ads.interactivemedia.v3.api.BaseManager
    public final void init(AdsRenderingSettings adsRenderingSettings) {
        if (adsRenderingSettings != null) {
            this.zzk = adsRenderingSettings;
            this.zzm.zzb(adsRenderingSettings);
        }
        this.zza.zzp(new zzff(zzfd.adsManager, zzfe.init, this.zzb, zza(this.zzk)));
        this.zzh.zzd();
    }

    @Override // com.google.ads.interactivemedia.v3.api.BaseManager
    public final void removeAdErrorListener(AdErrorEvent.AdErrorListener adErrorListener) {
        this.zzd.zzd(adErrorListener);
    }

    @Override // com.google.ads.interactivemedia.v3.api.BaseManager
    public final void removeAdEventListener(AdEvent.AdEventListener adEventListener) {
        this.zzc.remove(adEventListener);
    }

    public Map zza(AdsRenderingSettings adsRenderingSettings) {
        HashMap hashMap = new HashMap();
        hashMap.put("adsRenderingSettings", com.google.ads.interactivemedia.v3.impl.data.zzd.builder(adsRenderingSettings).build());
        return hashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0134 A[LOOP:0: B:25:0x012e->B:27:0x0134, LOOP_END] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, K6.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void zzb(zzfj zzfjVar) {
        Iterator it;
        AdEvent.AdEventType adEventType = zzfjVar.zza;
        AdImpl adImpl = zzfjVar.zzb;
        com.google.ads.interactivemedia.v3.impl.data.zzav zzavVar = com.google.ads.interactivemedia.v3.impl.data.zzav.Html;
        AdEvent.AdEventType adEventType2 = AdEvent.AdEventType.ALL_ADS_COMPLETED;
        int ordinal = adEventType.ordinal();
        if (ordinal != 3) {
            if (ordinal != 17) {
                if (ordinal != 24) {
                    if (ordinal == 5) {
                        this.zzf.zzi();
                    } else if (ordinal == 6) {
                        this.zzf.zzk();
                    } else if (ordinal == 20) {
                        this.zzi = adImpl;
                    } else if (ordinal != 21) {
                        switch (ordinal) {
                            case 13:
                                if (zzp()) {
                                    zzo(this.zzb);
                                    break;
                                }
                                break;
                            case 15:
                                if (adImpl != null) {
                                    this.zzi = adImpl;
                                }
                                if (zzp()) {
                                    zzo(this.zzb);
                                    break;
                                }
                                break;
                        }
                    } else {
                        this.zzj = zzfjVar.zze;
                    }
                }
            } else if (zzfjVar.zzf == null || !zzgq.zzb(this.zze, null)) {
                zzhd.zzd("Received ICON_TAPPED event without icon click fallback image list.");
            } else {
                List<com.google.ads.interactivemedia.v3.impl.data.zzbb> list = zzfjVar.zzf;
                try {
                    C0283e c0283e = new C0283e(this.zze);
                    ArrayList arrayList = new ArrayList(1);
                    for (com.google.ads.interactivemedia.v3.impl.data.zzbb zzbbVar : list) {
                        ?? obj = new Object();
                        obj.f6184a = 0;
                        byte b2 = (byte) (obj.f6189f | 1);
                        obj.f6185b = 0;
                        obj.f6189f = (byte) (b2 | 2);
                        obj.f6186c = "";
                        obj.f6187d = "";
                        obj.f6188e = "";
                        obj.f6184a = zzbbVar.width();
                        obj.f6189f = (byte) (obj.f6189f | 1);
                        obj.f6185b = zzbbVar.height();
                        obj.f6189f = (byte) (obj.f6189f | 2);
                        String alternateText = zzbbVar.alternateText();
                        if (alternateText == null) {
                            throw new NullPointerException("Null altText");
                        }
                        obj.f6186c = alternateText;
                        String imageUrl = zzbbVar.imageUrl();
                        if (imageUrl == null) {
                            throw new NullPointerException("Null staticResourceUri");
                        }
                        obj.f6188e = imageUrl;
                        String creativeType = zzbbVar.creativeType();
                        if (creativeType == null) {
                            throw new NullPointerException("Null creativeType");
                        }
                        obj.f6187d = creativeType;
                        arrayList.add(obj.a());
                    }
                    com.google.android.gms.internal.atv_ads_framework.zzab zzk = com.google.android.gms.internal.atv_ads_framework.zzab.zzk(arrayList);
                    if (zzk == null) {
                        throw new NullPointerException("Null iconClickFallbackImageList");
                    }
                    c0283e.f(new c(zzk));
                } catch (RuntimeException e2) {
                    zzhd.zzb("Failed to handle icon fallback image click.", e2);
                }
            }
            zzdm zzdmVar = new zzdm(adEventType, this.zzi, zzfjVar.zzc);
            it = this.zzc.iterator();
            while (it.hasNext()) {
                ((AdEvent.AdEventListener) it.next()).onAdEvent(zzdmVar);
            }
            if (adEventType != AdEvent.AdEventType.COMPLETED || adEventType == AdEvent.AdEventType.SKIPPED) {
                this.zzi = null;
            }
            return;
        }
        this.zzj = null;
        zzdm zzdmVar2 = new zzdm(adEventType, this.zzi, zzfjVar.zzc);
        it = this.zzc.iterator();
        while (it.hasNext()) {
        }
        if (adEventType != AdEvent.AdEventType.COMPLETED) {
        }
        this.zzi = null;
    }

    public final zzgn zzc() {
        return this.zzh;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzfk
    public final void zzd(AdError.AdErrorType adErrorType, int i7, String str) {
        zze(adErrorType, AdError.AdErrorCode.getErrorCodeByNumber(i7), str);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzfk
    public final void zze(AdError.AdErrorType adErrorType, AdError.AdErrorCode adErrorCode, String str) {
        this.zzj = null;
        this.zzd.zzc(new zzdl(new AdError(adErrorType, adErrorCode, str)));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzgr
    public final void zzf() {
        this.zza.zzp(new zzff(zzfd.adsManager, zzfe.appBackgrounding, this.zzb, null));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzgr
    public final void zzg() {
        this.zza.zzp(new zzff(zzfd.adsManager, zzfe.appForegrounding, this.zzb, null));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzfk
    public final void zzh(String str) {
        this.zzm.zza(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x001c, code lost:
    
        if (r0 != 2) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0076  */
    @Override // com.google.ads.interactivemedia.v3.internal.zzfk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzi(ViewGroup viewGroup, CompanionData companionData, String str, CompanionAdSlot companionAdSlot, zzfm zzfmVar, zzha zzhaVar) {
        View zzetVar;
        viewGroup.removeAllViews();
        zzeq zzeqVar = (zzeq) companionAdSlot;
        List zza = zzeqVar.zza();
        com.google.ads.interactivemedia.v3.impl.data.zzav zzavVar = com.google.ads.interactivemedia.v3.impl.data.zzav.Html;
        AdEvent.AdEventType adEventType = AdEvent.AdEventType.ALL_ADS_COMPLETED;
        int ordinal = companionData.type().ordinal();
        if (ordinal != 0) {
            com.google.ads.interactivemedia.v3.impl.data.zzbd zzbdVar = null;
            zzetVar = null;
            if (ordinal == 1) {
                Context context = viewGroup.getContext();
                String src = companionData.src();
                String size = companionData.size();
                if (size != null) {
                    String[] split = size.split("x", -1);
                    zzbdVar = split.length != 2 ? new com.google.ads.interactivemedia.v3.impl.data.zzbd(0, 0) : new com.google.ads.interactivemedia.v3.impl.data.zzbd(Integer.parseInt(split[0]), Integer.parseInt(split[1]));
                }
                zzetVar = new zzfb(context, zzfmVar, companionData, zzhaVar.zzb(src, zzbdVar), str, zza, this.zzm);
            }
            if (zzetVar == null) {
                zzetVar.setTag(str);
                zzeqVar.zzb(str);
                viewGroup.addView(zzetVar);
                return;
            }
            return;
        }
        zzetVar = new zzet(viewGroup.getContext(), zzfmVar, companionData, zza, this.zzm);
        if (zzetVar == null) {
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzfk
    public final void zzj(ResizeAndPositionVideoMsgData resizeAndPositionVideoMsgData) {
        this.zzh.zzg(resizeAndPositionVideoMsgData);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzfk
    public final void zzk() {
        this.zzh.zzh();
    }

    public final void zzl() {
        this.zza.zzo(this.zzb);
        this.zzc.clear();
        this.zzd.zzb();
    }

    public final void zzm(zzfd zzfdVar, zzfe zzfeVar, Object obj) {
        this.zza.zzp(new zzff(zzfdVar, zzfeVar, this.zzb, obj));
    }

    public final void zzn(zzfe zzfeVar) {
        this.zza.zzp(new zzff(zzfd.adsManager, zzfeVar, this.zzb, null));
    }
}
