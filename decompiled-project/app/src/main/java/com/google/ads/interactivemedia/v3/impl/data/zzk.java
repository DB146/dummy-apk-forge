package com.google.ads.interactivemedia.v3.impl.data;

import com.google.ads.interactivemedia.v3.api.UiElement;
import com.google.ads.interactivemedia.v3.internal.zzso;
import com.google.ads.interactivemedia.v3.internal.zzst;

/* loaded from: classes.dex */
final class zzk extends zzd {
    private final int bitrate;
    private final boolean disableUi;
    private final boolean enableFocusSkipButton;
    private final boolean enablePreloading;
    private final int loadVideoTimeout;
    private final zzso<String> mimeTypes;
    private final double playAdsAfterTime;
    private final zzst<UiElement> uiElements;

    private zzk(int i7, zzso<String> zzsoVar, zzst<UiElement> zzstVar, boolean z8, boolean z10, double d10, boolean z11, int i10) {
        this.bitrate = i7;
        this.mimeTypes = zzsoVar;
        this.uiElements = zzstVar;
        this.enablePreloading = z8;
        this.enableFocusSkipButton = z10;
        this.playAdsAfterTime = d10;
        this.disableUi = z11;
        this.loadVideoTimeout = i10;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzd
    public int bitrate() {
        return this.bitrate;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzd
    public boolean disableUi() {
        return this.disableUi;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzd
    public boolean enableFocusSkipButton() {
        return this.enableFocusSkipButton;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzd
    public boolean enablePreloading() {
        return this.enablePreloading;
    }

    public boolean equals(Object obj) {
        zzso<String> zzsoVar;
        zzst<UiElement> zzstVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzd) {
            zzd zzdVar = (zzd) obj;
            if (this.bitrate == zzdVar.bitrate() && ((zzsoVar = this.mimeTypes) != null ? zzsoVar.equals(zzdVar.mimeTypes()) : zzdVar.mimeTypes() == null) && ((zzstVar = this.uiElements) != null ? zzstVar.equals(zzdVar.uiElements()) : zzdVar.uiElements() == null) && this.enablePreloading == zzdVar.enablePreloading() && this.enableFocusSkipButton == zzdVar.enableFocusSkipButton() && Double.doubleToLongBits(this.playAdsAfterTime) == Double.doubleToLongBits(zzdVar.playAdsAfterTime()) && this.disableUi == zzdVar.disableUi() && this.loadVideoTimeout == zzdVar.loadVideoTimeout()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i7 = this.bitrate ^ 1000003;
        zzso<String> zzsoVar = this.mimeTypes;
        int hashCode = ((i7 * 1000003) ^ (zzsoVar == null ? 0 : zzsoVar.hashCode())) * 1000003;
        zzst<UiElement> zzstVar = this.uiElements;
        return ((((((((((hashCode ^ (zzstVar != null ? zzstVar.hashCode() : 0)) * 1000003) ^ (true != this.enablePreloading ? 1237 : 1231)) * 1000003) ^ (true != this.enableFocusSkipButton ? 1237 : 1231)) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.playAdsAfterTime) >>> 32) ^ Double.doubleToLongBits(this.playAdsAfterTime)))) * 1000003) ^ (true != this.disableUi ? 1237 : 1231)) * 1000003) ^ this.loadVideoTimeout;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzd
    public int loadVideoTimeout() {
        return this.loadVideoTimeout;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzd
    public zzso<String> mimeTypes() {
        return this.mimeTypes;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzd
    public double playAdsAfterTime() {
        return this.playAdsAfterTime;
    }

    public String toString() {
        return "AdsRenderingSettingsData{bitrate=" + this.bitrate + ", mimeTypes=" + String.valueOf(this.mimeTypes) + ", uiElements=" + String.valueOf(this.uiElements) + ", enablePreloading=" + this.enablePreloading + ", enableFocusSkipButton=" + this.enableFocusSkipButton + ", playAdsAfterTime=" + this.playAdsAfterTime + ", disableUi=" + this.disableUi + ", loadVideoTimeout=" + this.loadVideoTimeout + "}";
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzd
    public zzst<UiElement> uiElements() {
        return this.uiElements;
    }
}
