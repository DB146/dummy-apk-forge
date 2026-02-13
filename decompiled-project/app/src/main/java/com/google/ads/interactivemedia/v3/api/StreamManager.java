package com.google.ads.interactivemedia.v3.api;

import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public interface StreamManager extends BaseManager {
    @Deprecated
    double getContentTimeForStreamTime(double d10);

    long getContentTimeMsForStreamTimeMs(long j);

    List<CuePoint> getCuePoints();

    @Deprecated
    CuePoint getPreviousCuePointForStreamTime(double d10);

    CuePoint getPreviousCuePointForStreamTimeMs(long j);

    String getStreamId();

    @Deprecated
    double getStreamTimeForContentTime(double d10);

    long getStreamTimeMsForContentTimeMs(long j);

    void replaceAdTagParameters(Map<String, String> map);
}
