package com.google.android.gms.internal.measurement;

import P5.a;
import android.content.Intent;
import android.os.Bundle;
import android.os.IInterface;
import java.util.Map;

/* loaded from: classes.dex */
public interface zzcr extends IInterface {
    void beginAdUnitExposure(String str, long j);

    void clearConditionalUserProperty(String str, String str2, Bundle bundle);

    void clearMeasurementEnabled(long j);

    void endAdUnitExposure(String str, long j);

    void generateEventId(zzcu zzcuVar);

    void getAppInstanceId(zzcu zzcuVar);

    void getCachedAppInstanceId(zzcu zzcuVar);

    void getConditionalUserProperties(String str, String str2, zzcu zzcuVar);

    void getCurrentScreenClass(zzcu zzcuVar);

    void getCurrentScreenName(zzcu zzcuVar);

    void getGmpAppId(zzcu zzcuVar);

    void getMaxUserProperties(String str, zzcu zzcuVar);

    void getSessionId(zzcu zzcuVar);

    void getTestFlag(zzcu zzcuVar, int i7);

    void getUserProperties(String str, String str2, boolean z8, zzcu zzcuVar);

    void initForTests(Map map);

    void initialize(a aVar, zzdd zzddVar, long j);

    void isDataCollectionEnabled(zzcu zzcuVar);

    void logEvent(String str, String str2, Bundle bundle, boolean z8, boolean z10, long j);

    void logEventAndBundle(String str, String str2, Bundle bundle, zzcu zzcuVar, long j);

    void logHealthData(int i7, String str, a aVar, a aVar2, a aVar3);

    void onActivityCreated(a aVar, Bundle bundle, long j);

    void onActivityCreatedByScionActivityInfo(zzdf zzdfVar, Bundle bundle, long j);

    void onActivityDestroyed(a aVar, long j);

    void onActivityDestroyedByScionActivityInfo(zzdf zzdfVar, long j);

    void onActivityPaused(a aVar, long j);

    void onActivityPausedByScionActivityInfo(zzdf zzdfVar, long j);

    void onActivityResumed(a aVar, long j);

    void onActivityResumedByScionActivityInfo(zzdf zzdfVar, long j);

    void onActivitySaveInstanceState(a aVar, zzcu zzcuVar, long j);

    void onActivitySaveInstanceStateByScionActivityInfo(zzdf zzdfVar, zzcu zzcuVar, long j);

    void onActivityStarted(a aVar, long j);

    void onActivityStartedByScionActivityInfo(zzdf zzdfVar, long j);

    void onActivityStopped(a aVar, long j);

    void onActivityStoppedByScionActivityInfo(zzdf zzdfVar, long j);

    void performAction(Bundle bundle, zzcu zzcuVar, long j);

    void registerOnMeasurementEventListener(zzda zzdaVar);

    void resetAnalyticsData(long j);

    void retrieveAndUploadBatches(zzcx zzcxVar);

    void setConditionalUserProperty(Bundle bundle, long j);

    void setConsent(Bundle bundle, long j);

    void setConsentThirdParty(Bundle bundle, long j);

    void setCurrentScreen(a aVar, String str, String str2, long j);

    void setCurrentScreenByScionActivityInfo(zzdf zzdfVar, String str, String str2, long j);

    void setDataCollectionEnabled(boolean z8);

    void setDefaultEventParameters(Bundle bundle);

    void setEventInterceptor(zzda zzdaVar);

    void setInstanceIdProvider(zzdc zzdcVar);

    void setMeasurementEnabled(boolean z8, long j);

    void setMinimumSessionDuration(long j);

    void setSessionTimeoutDuration(long j);

    void setSgtmDebugInfo(Intent intent);

    void setUserId(String str, long j);

    void setUserProperty(String str, String str2, a aVar, boolean z8, long j);

    void unregisterOnMeasurementEventListener(zzda zzdaVar);
}
