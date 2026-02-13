package com.google.ads.interactivemedia.v3.internal;

import P1.g;
import X.c;
import a.AbstractC0672a;
import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.google.ads.interactivemedia.v3.api.AdError;
import com.google.ads.interactivemedia.v3.api.AdEvent;
import com.google.ads.interactivemedia.v3.api.BaseDisplayContainer;
import com.google.ads.interactivemedia.v3.api.CompanionAdSlot;
import com.google.ads.interactivemedia.v3.api.ImaSdkSettings;
import com.google.ads.interactivemedia.v3.impl.data.AdImpl;
import com.google.ads.interactivemedia.v3.impl.data.CompanionData;
import com.google.ads.interactivemedia.v3.impl.data.CuePointData;
import com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData;
import com.google.ads.interactivemedia.v3.impl.data.TestingConfiguration;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class zzfm implements zzfq, zzfr {
    private final Context zzg;
    private final String zzh;
    private final zzft zzi;
    private final float zzk;
    private final ExecutorService zzl;
    private final TestingConfiguration zzm;
    private final TaskCompletionSource zzn;
    private final TaskCompletionSource zzo;
    private zzgc zzp;
    private zzfl zzq;
    private long zzr;
    private boolean zzs;
    private final Map zza = new HashMap();
    private final Set zzb = new HashSet();
    private final Map zzc = new HashMap();
    private final Map zzd = new HashMap();
    private final Map zze = new HashMap();
    private final Map zzf = new HashMap();
    private final Queue zzj = new ConcurrentLinkedQueue();

    public zzfm(zzft zzftVar, Context context, Uri uri, ImaSdkSettings imaSdkSettings, ExecutorService executorService) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.zzn = taskCompletionSource;
        TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
        this.zzo = taskCompletionSource2;
        this.zzs = false;
        this.zzg = context;
        this.zzk = context.getResources().getDisplayMetrics().density;
        boolean k = AbstractC0672a.k();
        Uri.Builder appendQueryParameter = uri.buildUpon().appendQueryParameter("sdk_version", "a.3.30.3").appendQueryParameter("hl", imaSdkSettings.getLanguage()).appendQueryParameter("omv", "1.3.37-google_20220829").appendQueryParameter("app", context.getApplicationContext().getPackageName());
        appendQueryParameter.appendQueryParameter("mt", true != k ? "0" : "4");
        if (imaSdkSettings.getTestingConfig() != null) {
            zzwn zzwnVar = new zzwn();
            zzwnVar.zzc(new zzra());
            zzwnVar.zzd(new zzqz());
            appendQueryParameter.appendQueryParameter("tcnfp", zzwnVar.zza().zzf(imaSdkSettings.getTestingConfig()));
        }
        this.zzh = appendQueryParameter.build().toString();
        this.zzm = imaSdkSettings.getTestingConfig();
        this.zzi = zzftVar;
        zzftVar.zzg(this);
        this.zzl = executorService;
        Tasks.whenAllComplete((Task<?>[]) new Task[]{taskCompletionSource2.getTask(), taskCompletionSource.getTask()}).addOnCompleteListener(new OnCompleteListener() { // from class: com.google.ads.interactivemedia.v3.internal.zzfg
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                zzfm.this.zzk(task);
            }
        });
    }

    private static String zzq(String str, String str2) {
        return (str2 == null || str2.length() == 0) ? str : c.i(str, " Caused by: ", str2);
    }

    private final void zzr(zzfd zzfdVar, zzfe zzfeVar, String str, JavaScriptMsgData javaScriptMsgData) {
        zzgn zzgnVar = (zzgn) this.zzf.get(str);
        if (zzgnVar != null) {
            zzgnVar.zzf(zzfdVar, zzfeVar, javaScriptMsgData);
            return;
        }
        StringBuilder o10 = A3.c.o("Received ", String.valueOf(zzfdVar), " message: ", String.valueOf(zzfeVar), " for invalid session id: ");
        o10.append(str);
        zzhd.zzd(o10.toString());
    }

    private static final void zzs(String str, zzfe zzfeVar) {
        zzhd.zzc("Illegal message type " + String.valueOf(zzfeVar) + " received for " + str + " channel");
    }

    public final WebView zza() {
        return this.zzi.zza();
    }

    public final TestingConfiguration zzb() {
        return this.zzm;
    }

    public final Task zzc() {
        this.zzr = SystemClock.elapsedRealtime();
        this.zzi.zze(this.zzh);
        return this.zzo.getTask();
    }

    public final void zzd(zzfh zzfhVar, String str) {
        this.zza.put(str, zzfhVar);
    }

    public final void zze(BaseDisplayContainer baseDisplayContainer, String str) {
        this.zzc.put(str, baseDisplayContainer);
    }

    public final void zzf(zzfi zzfiVar, String str) {
        this.zzd.put(str, zzfiVar);
    }

    public final void zzg(zzfk zzfkVar, String str) {
        this.zze.put(str, zzfkVar);
    }

    public final void zzh(zzfl zzflVar) {
        this.zzq = zzflVar;
    }

    public final void zzi(zzgn zzgnVar, String str) {
        this.zzf.put(str, zzgnVar);
    }

    public final void zzj(com.google.ads.interactivemedia.v3.impl.data.zzbc zzbcVar) {
        this.zzn.trySetResult(zzbcVar);
    }

    public final /* synthetic */ void zzk(Task task) {
        JavaScriptMsgData javaScriptMsgData = (JavaScriptMsgData) this.zzo.getTask().getResult();
        com.google.ads.interactivemedia.v3.impl.data.zzbc zzbcVar = (com.google.ads.interactivemedia.v3.impl.data.zzbc) this.zzn.getTask().getResult();
        Context context = this.zzg;
        this.zzp = new zzgc(context, this, this.zzl, javaScriptMsgData.enableGks ? new zzgb(context, zzbcVar) : new zzfz(null));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzfq
    public final void zzl(zzff zzffVar) {
        AdImpl adImpl;
        Map<String, CompanionData> map;
        String str;
        String str2;
        JavaScriptMsgData javaScriptMsgData = (JavaScriptMsgData) zzffVar.zze();
        String zzf = zzffVar.zzf();
        zzfe zzb = zzffVar.zzb();
        zzhd.zzc("Received js message: " + zzffVar.zza().name() + " [" + zzb.name() + "]");
        switch (zzffVar.zza().ordinal()) {
            case 0:
                if (this.zzb.contains(zzf)) {
                    return;
                }
                zzfh zzfhVar = (zzfh) this.zza.get(zzf);
                if (zzfhVar == null) {
                    zzhd.zzd("Received monitor message: " + String.valueOf(zzb) + " for invalid session id: " + zzf);
                    return;
                }
                if (javaScriptMsgData != null) {
                    if (zzb.ordinal() != 37) {
                        zzs(zzfd.activityMonitor.toString(), zzb);
                        return;
                    } else {
                        zzfhVar.zzh(javaScriptMsgData.queryId, javaScriptMsgData.eventId);
                        return;
                    }
                }
                zzhd.zzd("Received monitor message: " + String.valueOf(zzb) + " for session id: " + zzf + " with no data");
                return;
            case 1:
                zzfi zzfiVar = (zzfi) this.zzd.get(zzf);
                if (zzfiVar == null) {
                    zzhd.zza("Received request message: " + String.valueOf(zzb) + " for invalid session id: " + zzf);
                    return;
                }
                int ordinal = zzb.ordinal();
                if (ordinal == 11) {
                    if (javaScriptMsgData == null) {
                        zzfiVar.zzb(zzf, AdError.AdErrorType.LOAD, AdError.AdErrorCode.INTERNAL_ERROR, "adsLoaded message did not contain cue points.");
                        return;
                    } else {
                        zzfiVar.zzc(zzf, javaScriptMsgData.adCuePoints, javaScriptMsgData.internalCuePoints, javaScriptMsgData.monitorAppLifecycle);
                        return;
                    }
                }
                if (ordinal == 31) {
                    zzfiVar.zza(zzf, AdError.AdErrorType.LOAD, javaScriptMsgData.errorCode, zzq(javaScriptMsgData.errorMessage, javaScriptMsgData.innerError));
                    return;
                } else if (ordinal != 68) {
                    zzs(zzfd.adsLoader.toString(), zzb);
                    return;
                } else {
                    zzfiVar.zzd(zzf, javaScriptMsgData.streamId, javaScriptMsgData.monitorAppLifecycle);
                    zzhd.zzc("Stream initialized with streamId: ".concat(String.valueOf(javaScriptMsgData.streamId)));
                    return;
                }
            case 2:
                zzfk zzfkVar = (zzfk) this.zze.get(zzf);
                if (zzfkVar == null) {
                    zzhd.zzd("Received manager message: " + String.valueOf(zzb) + " for invalid session id: " + zzf);
                    return;
                }
                if (javaScriptMsgData == null || (adImpl = javaScriptMsgData.adData) == null) {
                    adImpl = null;
                }
                int ordinal2 = zzb.ordinal();
                if (ordinal2 == 12) {
                    zzfkVar.zzb(new zzfj(AdEvent.AdEventType.ALL_ADS_COMPLETED, null));
                    return;
                }
                if (ordinal2 == 16) {
                    zzfkVar.zzb(new zzfj(AdEvent.AdEventType.CLICKED, adImpl));
                    return;
                }
                if (ordinal2 == 18) {
                    zzfkVar.zzb(new zzfj(AdEvent.AdEventType.COMPLETED, adImpl));
                    return;
                }
                if (ordinal2 == 25) {
                    zzfj zzfjVar = new zzfj(AdEvent.AdEventType.CUEPOINTS_CHANGED, null);
                    zzfjVar.zzd = new ArrayList();
                    for (CuePointData cuePointData : javaScriptMsgData.cuepoints) {
                        zzfjVar.zzd.add(new zzew(cuePointData.start(), cuePointData.end(), cuePointData.played()));
                    }
                    zzfkVar.zzb(zzfjVar);
                    return;
                }
                if (ordinal2 == 44) {
                    if (adImpl != null) {
                        zzfkVar.zzb(new zzfj(AdEvent.AdEventType.LOADED, adImpl));
                        return;
                    } else {
                        zzhd.zza("Ad loaded message requires adData");
                        zzfkVar.zze(AdError.AdErrorType.LOAD, AdError.AdErrorCode.INTERNAL_ERROR, "Ad loaded message did not contain adData.");
                        return;
                    }
                }
                if (ordinal2 == 52) {
                    zzfkVar.zzb(new zzfj(AdEvent.AdEventType.PAUSED, adImpl));
                    return;
                }
                if (ordinal2 == 61) {
                    zzfkVar.zzb(new zzfj(AdEvent.AdEventType.RESUMED, adImpl));
                    return;
                }
                if (ordinal2 == 69) {
                    zzfkVar.zzb(new zzfj(AdEvent.AdEventType.THIRD_QUARTILE, adImpl));
                    return;
                }
                if (ordinal2 != 77) {
                    if (ordinal2 == 20) {
                        zzfkVar.zzb(new zzfj(AdEvent.AdEventType.CONTENT_PAUSE_REQUESTED, null));
                        return;
                    }
                    if (ordinal2 == 21) {
                        zzfkVar.zzb(new zzfj(AdEvent.AdEventType.CONTENT_RESUME_REQUESTED, null));
                        return;
                    }
                    if (ordinal2 == 31) {
                        zzfkVar.zzd(AdError.AdErrorType.PLAY, javaScriptMsgData.errorCode, zzq(javaScriptMsgData.errorMessage, javaScriptMsgData.innerError));
                        return;
                    }
                    if (ordinal2 == 32) {
                        zzfkVar.zzb(new zzfj(AdEvent.AdEventType.FIRST_QUARTILE, adImpl));
                        return;
                    }
                    if (ordinal2 == 39) {
                        zzfkVar.zzb(new zzfj(AdEvent.AdEventType.ICON_FALLBACK_IMAGE_CLOSED, null));
                        return;
                    }
                    if (ordinal2 != 40) {
                        switch (ordinal2) {
                            case 1:
                                zzfkVar.zzb(new zzfj(AdEvent.AdEventType.AD_BREAK_ENDED, adImpl));
                                return;
                            case 2:
                                zzfj zzfjVar2 = new zzfj(AdEvent.AdEventType.AD_BREAK_FETCH_ERROR, null);
                                zzfjVar2.zzc = zzsr.zzd("adBreakTime", javaScriptMsgData.adBreakTime);
                                zzfkVar.zzb(zzfjVar2);
                                return;
                            case 3:
                                zzfj zzfjVar3 = new zzfj(AdEvent.AdEventType.AD_BREAK_READY, null);
                                zzfjVar3.zzc = zzsr.zzd("adBreakTime", javaScriptMsgData.adBreakTime);
                                zzfkVar.zzb(zzfjVar3);
                                return;
                            case 4:
                                zzfkVar.zzb(new zzfj(AdEvent.AdEventType.AD_BREAK_STARTED, adImpl));
                                return;
                            case 5:
                                zzfkVar.zzb(new zzfj(AdEvent.AdEventType.AD_BUFFERING, null));
                                return;
                            case 6:
                            case 7:
                                return;
                            case g.BYTES_FIELD_NUMBER /* 8 */:
                                zzfkVar.zzb(new zzfj(AdEvent.AdEventType.AD_PERIOD_ENDED, null));
                                return;
                            case 9:
                                zzfkVar.zzb(new zzfj(AdEvent.AdEventType.AD_PERIOD_STARTED, null));
                                return;
                            case 10:
                                zzfj zzfjVar4 = new zzfj(AdEvent.AdEventType.AD_PROGRESS, adImpl);
                                zzfjVar4.zze = new zzdp(javaScriptMsgData.currentTime, javaScriptMsgData.duration, javaScriptMsgData.adPosition, javaScriptMsgData.totalAds, javaScriptMsgData.adBreakDuration, javaScriptMsgData.adPeriodDuration);
                                zzfkVar.zzb(zzfjVar4);
                                return;
                            default:
                                switch (ordinal2) {
                                    case 46:
                                        zzfj zzfjVar5 = new zzfj(AdEvent.AdEventType.LOG, adImpl);
                                        zzfjVar5.zzc = javaScriptMsgData.logData.constructMap();
                                        zzfkVar.zzb(zzfjVar5);
                                        return;
                                    case 47:
                                        zzfkVar.zzb(new zzfj(AdEvent.AdEventType.MIDPOINT, adImpl));
                                        return;
                                    case 48:
                                        return;
                                    case 49:
                                        zzfkVar.zzh(javaScriptMsgData.url);
                                        return;
                                    default:
                                        switch (ordinal2) {
                                            case 63:
                                                zzfj zzfjVar6 = new zzfj(AdEvent.AdEventType.SKIPPED, null);
                                                zzfjVar6.zzg = javaScriptMsgData.seekTime;
                                                zzfkVar.zzb(zzfjVar6);
                                                return;
                                            case 64:
                                                zzfkVar.zzb(new zzfj(AdEvent.AdEventType.SKIPPABLE_STATE_CHANGED, adImpl));
                                                return;
                                            case 65:
                                                zzfkVar.zzb(new zzfj(AdEvent.AdEventType.STARTED, adImpl));
                                                return;
                                            default:
                                                switch (ordinal2) {
                                                    case 73:
                                                        return;
                                                    case 74:
                                                        zzfkVar.zzb(new zzfj(AdEvent.AdEventType.TAPPED, adImpl));
                                                        return;
                                                    case 75:
                                                        zzfj zzfjVar7 = new zzfj(AdEvent.AdEventType.ICON_TAPPED, null);
                                                        if (javaScriptMsgData != null) {
                                                            zzfjVar7.zzf = javaScriptMsgData.iconClickFallbackImages;
                                                        }
                                                        zzfkVar.zzb(zzfjVar7);
                                                        return;
                                                    default:
                                                        zzs(zzfd.adsManager.toString(), zzb);
                                                        return;
                                                }
                                        }
                                }
                        }
                    }
                    return;
                }
                return;
            case 3:
            case g.BYTES_FIELD_NUMBER /* 8 */:
            default:
                zzhd.zza("Unknown message channel: ".concat(String.valueOf(zzffVar.zza())));
                return;
            case 4:
                zzeo zzeoVar = (zzeo) this.zzc.get(zzf);
                zzfk zzfkVar2 = (zzfk) this.zze.get(zzf);
                zzgn zzgnVar = (zzgn) this.zzf.get(zzf);
                if (zzeoVar == null || zzfkVar2 == null || zzgnVar == null) {
                    zzhd.zza("Received displayContainer message: " + String.valueOf(zzb) + " for invalid session id: " + zzf);
                    return;
                }
                int ordinal3 = zzb.ordinal();
                if (ordinal3 != 28) {
                    if (ordinal3 == 38 || ordinal3 == 62) {
                        return;
                    }
                    if (ordinal3 == 59) {
                        zzfkVar2.zzj(javaScriptMsgData.resizeAndPositionVideo);
                        return;
                    } else if (ordinal3 != 60) {
                        zzs(zzfd.displayContainer.toString(), zzb);
                        return;
                    } else {
                        zzfkVar2.zzk();
                        return;
                    }
                }
                if (javaScriptMsgData == null || (map = javaScriptMsgData.companions) == null) {
                    zzfkVar2.zze(AdError.AdErrorType.LOAD, AdError.AdErrorCode.INTERNAL_ERROR, "Display companions message requires companions in data.");
                    return;
                }
                Set<String> keySet = map.keySet();
                HashMap zzb2 = zztd.zzb(keySet.size());
                for (String str3 : keySet) {
                    CompanionAdSlot companionAdSlot = (CompanionAdSlot) zzeoVar.zza().get(str3);
                    ViewGroup container = companionAdSlot != null ? companionAdSlot.getContainer() : null;
                    if (container != null) {
                        zzb2.put(str3, container);
                    } else {
                        zzfkVar2.zze(AdError.AdErrorType.LOAD, AdError.AdErrorCode.INTERNAL_ERROR, "Display requested for invalid companion slot.");
                    }
                }
                for (String str4 : zzb2.keySet()) {
                    zzfkVar2.zzi((ViewGroup) zzb2.get(str4), javaScriptMsgData.companions.get(str4), zzf, (CompanionAdSlot) zzeoVar.zza().get(str4), this, new zzha(this.zzl, this.zzk));
                }
                return;
            case 5:
            case ModuleDescriptor.MODULE_VERSION /* 11 */:
                int ordinal4 = zzb.ordinal();
                if (ordinal4 == 42) {
                    this.zzo.trySetResult(javaScriptMsgData);
                    this.zzs = true;
                    long elapsedRealtime = SystemClock.elapsedRealtime() - this.zzr;
                    HashMap zzb3 = zztd.zzb(1);
                    zzb3.put("webViewLoadingTime", Long.valueOf(elapsedRealtime));
                    zzp(new zzff(zzfd.webViewLoaded, zzfe.csi, zzf, zzb3));
                    return;
                }
                if (ordinal4 != 46) {
                    zzs("other", zzb);
                    return;
                }
                if (javaScriptMsgData.ln == null || (str = javaScriptMsgData.f14707n) == null || (str2 = javaScriptMsgData.f14706m) == null) {
                    zzhd.zza("Invalid logging message data: ".concat(String.valueOf(javaScriptMsgData)));
                    return;
                }
                String j = A3.c.j("JsMessage (", str, "): ", str2);
                char charAt = javaScriptMsgData.ln.charAt(0);
                if (charAt != 'D') {
                    if (charAt != 'E') {
                        if (charAt != 'I') {
                            if (charAt != 'S') {
                                if (charAt != 'V') {
                                    if (charAt == 'W') {
                                        zzhd.zzd(j);
                                        return;
                                    } else {
                                        zzhd.zzd("Unrecognized log level: ".concat(String.valueOf(javaScriptMsgData.ln)));
                                        zzhd.zzd(j);
                                        return;
                                    }
                                }
                            }
                        }
                    }
                    zzhd.zza(j);
                    return;
                }
                zzhd.zzc(j);
                return;
            case 6:
                zzgc zzgcVar = this.zzp;
                if (zzgcVar != null) {
                    zzgcVar.zzc(zzb, zzf, javaScriptMsgData.networkRequest);
                    return;
                } else {
                    zzhd.zza("Native network handler not initialized.");
                    return;
                }
            case 7:
                if (this.zzq == null) {
                    zzhd.zza("Null 'omidManagerListener': cannot send 'onOmidMessage'.");
                    return;
                }
                int ordinal5 = zzb.ordinal();
                if (ordinal5 == 50) {
                    this.zzq.zza();
                    return;
                } else {
                    if (ordinal5 != 51) {
                        return;
                    }
                    this.zzq.zzb();
                    return;
                }
            case 9:
                zzr(zzfd.videoDisplay1, zzb, zzf, javaScriptMsgData);
                return;
            case 10:
                zzr(zzfd.videoDisplay2, zzb, zzf, javaScriptMsgData);
                return;
        }
    }

    public final void zzm() {
        this.zzi.zzb();
    }

    public final void zzn(String str) {
        this.zza.remove(str);
        this.zzb.add(str);
    }

    public final void zzo(String str) {
        this.zzd.remove(str);
        this.zze.remove(str);
        this.zzc.remove(str);
        this.zzf.remove(str);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzfr
    public final void zzp(zzff zzffVar) {
        zzhd.zzc("Sending js message: " + zzffVar.zza().name() + " [" + zzffVar.zzb().name() + "]");
        this.zzj.add(zzffVar);
        if (this.zzs) {
            zzff zzffVar2 = (zzff) this.zzj.poll();
            while (zzffVar2 != null) {
                this.zzi.zzh(zzffVar2);
                zzffVar2 = (zzff) this.zzj.poll();
            }
        }
    }
}
