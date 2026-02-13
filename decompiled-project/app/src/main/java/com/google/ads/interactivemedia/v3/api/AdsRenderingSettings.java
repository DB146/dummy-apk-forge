package com.google.ads.interactivemedia.v3.api;

import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public interface AdsRenderingSettings {
    int getBitrateKbps();

    boolean getDisableUi();

    boolean getEnableCustomTabs();

    boolean getEnablePreloading();

    boolean getFocusSkipButtonWhenAvailable();

    List<String> getMimeTypes();

    void setBitrateKbps(int i7);

    void setDisableUi(boolean z8);

    void setEnableCustomTabs(boolean z8);

    void setEnablePreloading(boolean z8);

    void setFocusSkipButtonWhenAvailable(boolean z8);

    void setLoadVideoTimeout(int i7);

    void setMimeTypes(List<String> list);

    void setPlayAdsAfterTime(double d10);

    void setUiElements(Set<UiElement> set);
}
