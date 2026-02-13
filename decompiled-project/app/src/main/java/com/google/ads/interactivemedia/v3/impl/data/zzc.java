package com.google.ads.interactivemedia.v3.impl.data;

import com.google.ads.interactivemedia.v3.api.UiElement;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class zzc {
    public abstract zzd build();

    public abstract zzc setDisableUi(boolean z8);

    public abstract zzc setEnableFocusSkipButton(boolean z8);

    public abstract zzc setEnablePreloading(boolean z8);

    public abstract zzc setLoadVideoTimeout(int i7);

    public abstract zzc setMimeTypes(List<String> list);

    public abstract zzc setPlayAdsAfterTime(double d10);

    public abstract zzc setUiElements(Set<UiElement> set);
}
