package com.google.ads.interactivemedia.v3.impl.data;

import com.google.ads.interactivemedia.v3.api.UiElement;
import com.google.ads.interactivemedia.v3.internal.zzso;
import com.google.ads.interactivemedia.v3.internal.zzst;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
final class zzi extends zzc {
    private int bitrate;
    private boolean disableUi;
    private boolean enableFocusSkipButton;
    private boolean enablePreloading;
    private int loadVideoTimeout;
    private zzso<String> mimeTypes;
    private double playAdsAfterTime;
    private byte set$0;
    private zzst<UiElement> uiElements;

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzc
    public zzd build() {
        if (this.set$0 == 63) {
            return new zzk(this.bitrate, this.mimeTypes, this.uiElements, this.enablePreloading, this.enableFocusSkipButton, this.playAdsAfterTime, this.disableUi, this.loadVideoTimeout);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((this.set$0 & 1) == 0) {
            sb2.append(" bitrate");
        }
        if ((this.set$0 & 2) == 0) {
            sb2.append(" enablePreloading");
        }
        if ((this.set$0 & 4) == 0) {
            sb2.append(" enableFocusSkipButton");
        }
        if ((this.set$0 & 8) == 0) {
            sb2.append(" playAdsAfterTime");
        }
        if ((this.set$0 & 16) == 0) {
            sb2.append(" disableUi");
        }
        if ((this.set$0 & 32) == 0) {
            sb2.append(" loadVideoTimeout");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }

    public zzc setBitrate(int i7) {
        this.bitrate = i7;
        this.set$0 = (byte) (this.set$0 | 1);
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzc
    public zzc setDisableUi(boolean z8) {
        this.disableUi = z8;
        this.set$0 = (byte) (this.set$0 | 16);
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzc
    public zzc setEnableFocusSkipButton(boolean z8) {
        this.enableFocusSkipButton = z8;
        this.set$0 = (byte) (this.set$0 | 4);
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzc
    public zzc setEnablePreloading(boolean z8) {
        this.enablePreloading = z8;
        this.set$0 = (byte) (this.set$0 | 2);
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzc
    public zzc setLoadVideoTimeout(int i7) {
        this.loadVideoTimeout = i7;
        this.set$0 = (byte) (this.set$0 | 32);
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzc
    public zzc setMimeTypes(List<String> list) {
        this.mimeTypes = list == null ? null : zzso.zzk(list);
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzc
    public zzc setPlayAdsAfterTime(double d10) {
        this.playAdsAfterTime = d10;
        this.set$0 = (byte) (this.set$0 | 8);
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzc
    public zzc setUiElements(Set<UiElement> set) {
        this.uiElements = set == null ? null : zzst.zzl(set);
        return this;
    }
}
