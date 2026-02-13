package com.google.ads.interactivemedia.v3.impl.data;

import com.google.ads.interactivemedia.v3.api.AdsRenderingSettings;
import com.google.ads.interactivemedia.v3.api.UiElement;
import com.google.ads.interactivemedia.v3.internal.zzaie;
import com.google.ads.interactivemedia.v3.internal.zzaig;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public final class zze implements AdsRenderingSettings {
    private boolean enablePreloading;
    private Set<UiElement> uiElements;
    private int bitrate = -1;
    private List<String> mimeTypes = null;
    private boolean enableFocusSkipButton = true;
    private double playAdsAfterTime = -1.0d;
    private boolean disableUi = false;
    private boolean enableCustomTabs = false;
    private int loadVideoTimeout = -1;

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        return zzaie.zzf(this, obj, false, null, false, new String[0]);
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdsRenderingSettings
    public int getBitrateKbps() {
        return this.bitrate;
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdsRenderingSettings
    public boolean getDisableUi() {
        return this.disableUi;
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdsRenderingSettings
    public boolean getEnableCustomTabs() {
        return this.enableCustomTabs;
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdsRenderingSettings
    public boolean getEnablePreloading() {
        return this.enablePreloading;
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdsRenderingSettings
    public boolean getFocusSkipButtonWhenAvailable() {
        return this.enableFocusSkipButton;
    }

    public int getLoadVideoTimeout() {
        return this.loadVideoTimeout;
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdsRenderingSettings
    public List<String> getMimeTypes() {
        return this.mimeTypes;
    }

    public double getPlayAdsAfterTime() {
        return this.playAdsAfterTime;
    }

    public Set<UiElement> getUiElements() {
        return this.uiElements;
    }

    public int hashCode() {
        return zzaig.zza(this, new String[0]);
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdsRenderingSettings
    public void setBitrateKbps(int i7) {
        this.bitrate = i7;
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdsRenderingSettings
    public void setDisableUi(boolean z8) {
        this.disableUi = z8;
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdsRenderingSettings
    public void setEnableCustomTabs(boolean z8) {
        this.enableCustomTabs = z8;
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdsRenderingSettings
    public void setEnablePreloading(boolean z8) {
        this.enablePreloading = z8;
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdsRenderingSettings
    public void setFocusSkipButtonWhenAvailable(boolean z8) {
        this.enableFocusSkipButton = z8;
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdsRenderingSettings
    public void setLoadVideoTimeout(int i7) {
        this.loadVideoTimeout = i7;
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdsRenderingSettings
    public void setMimeTypes(List<String> list) {
        this.mimeTypes = list;
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdsRenderingSettings
    public void setPlayAdsAfterTime(double d10) {
        this.playAdsAfterTime = d10;
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdsRenderingSettings
    public void setUiElements(Set<UiElement> set) {
        this.uiElements = set;
    }
}
