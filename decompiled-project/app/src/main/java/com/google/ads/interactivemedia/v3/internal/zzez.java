package com.google.ads.interactivemedia.v3.internal;

import com.google.ads.interactivemedia.v3.api.ImaSdkSettings;
import com.google.ads.interactivemedia.v3.impl.data.TestingConfiguration;
import h3.o;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzez implements ImaSdkSettings {
    private Map<String, String> featureFlags;
    private String playerType;
    private String playerVersion;
    private String ppid;
    private transient boolean restrictToCustomPlayer;
    private String sessionId;
    private TestingConfiguration testingConfig;
    private final boolean supportsMultipleVideoDisplayChannels = true;
    private int numRedirects = 4;
    private boolean autoPlayAdBreaks = true;
    private boolean debugMode = false;
    private transient String language = "en";

    @Override // com.google.ads.interactivemedia.v3.api.ImaSdkSettings
    public boolean doesRestrictToCustomPlayer() {
        return this.restrictToCustomPlayer;
    }

    @Override // com.google.ads.interactivemedia.v3.api.ImaSdkSettings
    public boolean getAutoPlayAdBreaks() {
        return this.autoPlayAdBreaks;
    }

    @Override // com.google.ads.interactivemedia.v3.api.ImaSdkSettings
    public Map<String, String> getFeatureFlags() {
        return this.featureFlags;
    }

    @Override // com.google.ads.interactivemedia.v3.api.ImaSdkSettings
    public String getLanguage() {
        return this.language;
    }

    @Override // com.google.ads.interactivemedia.v3.api.ImaSdkSettings
    public int getMaxRedirects() {
        return this.numRedirects;
    }

    @Override // com.google.ads.interactivemedia.v3.api.ImaSdkSettings
    public String getPlayerType() {
        return this.playerType;
    }

    @Override // com.google.ads.interactivemedia.v3.api.ImaSdkSettings
    public String getPlayerVersion() {
        return this.playerVersion;
    }

    @Override // com.google.ads.interactivemedia.v3.api.ImaSdkSettings
    public String getPpid() {
        return this.ppid;
    }

    @Override // com.google.ads.interactivemedia.v3.api.ImaSdkSettings
    public String getSessionId() {
        return this.sessionId;
    }

    @Override // com.google.ads.interactivemedia.v3.api.ImaSdkSettings
    public TestingConfiguration getTestingConfig() {
        return this.testingConfig;
    }

    @Override // com.google.ads.interactivemedia.v3.api.ImaSdkSettings
    public boolean isDebugMode() {
        return this.debugMode;
    }

    @Override // com.google.ads.interactivemedia.v3.api.ImaSdkSettings
    public void setAutoPlayAdBreaks(boolean z8) {
        this.autoPlayAdBreaks = z8;
    }

    @Override // com.google.ads.interactivemedia.v3.api.ImaSdkSettings
    public void setDebugMode(boolean z8) {
        this.debugMode = z8;
    }

    @Override // com.google.ads.interactivemedia.v3.api.ImaSdkSettings
    public void setFeatureFlags(Map<String, String> map) {
        this.featureFlags = map;
    }

    @Override // com.google.ads.interactivemedia.v3.api.ImaSdkSettings
    public void setLanguage(String str) {
        this.language = str;
    }

    @Override // com.google.ads.interactivemedia.v3.api.ImaSdkSettings
    public void setMaxRedirects(int i7) {
        this.numRedirects = i7;
    }

    @Override // com.google.ads.interactivemedia.v3.api.ImaSdkSettings
    public void setPlayerType(String str) {
        this.playerType = str;
    }

    @Override // com.google.ads.interactivemedia.v3.api.ImaSdkSettings
    public void setPlayerVersion(String str) {
        this.playerVersion = str;
    }

    @Override // com.google.ads.interactivemedia.v3.api.ImaSdkSettings
    public void setPpid(String str) {
        this.ppid = str;
    }

    @Override // com.google.ads.interactivemedia.v3.api.ImaSdkSettings
    public void setRestrictToCustomPlayer(boolean z8) {
        this.restrictToCustomPlayer = z8;
    }

    @Override // com.google.ads.interactivemedia.v3.api.ImaSdkSettings
    public void setSessionId(String str) {
        this.sessionId = str;
    }

    @Override // com.google.ads.interactivemedia.v3.api.ImaSdkSettings
    public void setTestingConfig(TestingConfiguration testingConfiguration) {
        this.testingConfig = testingConfiguration;
    }

    @Override // com.google.ads.interactivemedia.v3.api.ImaSdkSettings
    public String toString() {
        String str = this.ppid;
        int i7 = this.numRedirects;
        String str2 = this.playerType;
        String str3 = this.playerVersion;
        String str4 = this.language;
        boolean z8 = this.restrictToCustomPlayer;
        boolean z10 = this.autoPlayAdBreaks;
        String str5 = this.sessionId;
        StringBuilder sb2 = new StringBuilder("ImaSdkSettings [ppid=");
        sb2.append(str);
        sb2.append(", numRedirects=");
        sb2.append(i7);
        sb2.append(", playerType=");
        o.v(sb2, str2, ", playerVersion=", str3, ", language=");
        sb2.append(str4);
        sb2.append(", restrictToCustom=");
        sb2.append(z8);
        sb2.append(", autoPlayAdBreaks=");
        sb2.append(z10);
        sb2.append(", sessionId=");
        sb2.append(str5);
        sb2.append("]");
        return sb2.toString();
    }
}
