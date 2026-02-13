package com.google.ads.interactivemedia.v3.api;

import com.google.ads.interactivemedia.v3.api.player.ContentProgressProvider;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public interface AdsRequest extends BaseRequest {
    String getAdTagUrl();

    String getAdsResponse();

    ContentProgressProvider getContentProgressProvider();

    String getExtraParameter(String str);

    Map<String, String> getExtraParameters();

    void setAdTagUrl(String str);

    void setAdWillAutoPlay(boolean z8);

    void setAdWillPlayMuted(boolean z8);

    void setAdsResponse(String str);

    void setContentDuration(float f4);

    void setContentKeywords(List<String> list);

    void setContentProgressProvider(ContentProgressProvider contentProgressProvider);

    void setContentTitle(String str);

    void setContinuousPlayback(boolean z8);

    void setExtraParameter(String str, String str2);

    void setLiveStreamPrefetchSeconds(float f4);

    void setVastLoadTimeout(float f4);
}
