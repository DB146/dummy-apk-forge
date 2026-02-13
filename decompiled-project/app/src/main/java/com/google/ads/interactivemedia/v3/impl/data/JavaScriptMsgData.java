package com.google.ads.interactivemedia.v3.impl.data;

import android.util.Log;
import com.google.ads.interactivemedia.v3.internal.zzaie;
import com.google.ads.interactivemedia.v3.internal.zzaig;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;

/* loaded from: classes.dex */
public class JavaScriptMsgData {
    public double adBreakDuration;
    public String adBreakTime;
    public List<Float> adCuePoints;
    public AdImpl adData;
    public double adPeriodDuration;
    public AdPodInfoImpl adPodInfo;
    public int adPosition;
    public long adTimeUpdateMs;
    public long appSetIdTimeoutMs;
    public double bufferedTime;
    public Map<String, CompanionData> companions;
    public List<CuePointData> cuepoints;
    public double currentTime;
    public boolean disableAppSetId;
    public double duration;
    public boolean enableGks;
    public boolean enableInstrumentation;
    public boolean enableTrustlessGksBc;
    public boolean enableTrustlessGksDai;
    public int errorCode;
    public String errorMessage;
    public Integer espAdapterTimeoutMs;
    public List<String> espAdapters;
    public String eventId;
    public List<String> gksFirstPartyAdServers;
    public int gksTimeoutMs;
    public List<zzbb> iconClickFallbackImages;
    public String innerError;
    public SortedSet<Float> internalCuePoints;
    public String ln;
    public LogData logData;

    /* renamed from: m, reason: collision with root package name */
    public String f14706m;
    public boolean monitorAppLifecycle;

    /* renamed from: n, reason: collision with root package name */
    public String f14707n;
    public NetworkRequestData networkRequest;
    public Integer platformSignalCollectorTimeoutMs;
    public String queryId;
    public ResizeAndPositionVideoMsgData resizeAndPositionVideo;
    public double seekTime;
    public String streamId;
    public String streamUrl;
    public List<HashMap<String, String>> subtitles;
    public int totalAds;
    public String url;
    public boolean useAndroidAdshieldV2;
    public String vastEvent;
    public String videoUrl;

    /* loaded from: classes.dex */
    public static class LogData {
        public int errorCode;
        public String errorMessage;
        public String innerError;
        public String type;

        public Map<String, String> constructMap() {
            HashMap hashMap = new HashMap();
            hashMap.put("type", this.type);
            hashMap.put("errorCode", String.valueOf(this.errorCode));
            hashMap.put("errorMessage", this.errorMessage);
            String str = this.innerError;
            if (str != null) {
                hashMap.put("innerError", str);
            }
            return hashMap;
        }

        public boolean equals(Object obj) {
            if (obj == null) {
                return false;
            }
            return zzaie.zzf(this, obj, false, null, false, new String[0]);
        }

        public int hashCode() {
            return zzaig.zza(this, new String[0]);
        }

        public String toString() {
            return "Log[type=" + this.type + ", errorCode=" + this.errorCode + ", errorMessage=" + this.errorMessage + ", innerError=" + this.innerError + "]";
        }
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        return zzaie.zzf(this, obj, false, null, false, new String[0]);
    }

    public int hashCode() {
        return zzaig.zza(this, new String[0]);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("JavaScriptMsgData[");
        for (Field field : JavaScriptMsgData.class.getFields()) {
            try {
                Object obj = field.get(this);
                sb2.append(field.getName());
                sb2.append(":");
                sb2.append(obj);
                sb2.append(",");
            } catch (IllegalAccessException e2) {
                Log.e("IMASDK", "IllegalAccessException occurred", e2);
            } catch (IllegalArgumentException e10) {
                Log.e("IMASDK", "IllegalArgumentException occurred", e10);
            }
        }
        sb2.append("]");
        return sb2.toString();
    }
}
