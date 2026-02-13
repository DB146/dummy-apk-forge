package com.google.android.recaptcha.internal;

import android.webkit.WebView;
import cc.E;
import cc.F;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class zzfw {
    private final WebView zza;
    private final E zzb;

    public zzfw(WebView webView, E e2) {
        this.zza = webView;
        this.zzb = e2;
    }

    public final void zzb(String str, String... strArr) {
        F.B(this.zzb, null, 0, new zzfv((String[]) Arrays.copyOf(strArr, strArr.length), this, str, null), 3);
    }
}
