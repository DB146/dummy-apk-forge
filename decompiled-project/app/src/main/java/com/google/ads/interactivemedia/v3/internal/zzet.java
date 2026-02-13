package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import android.util.Base64;
import android.webkit.WebView;
import com.google.ads.interactivemedia.v3.impl.data.CompanionData;
import java.util.List;
import y.S;

/* loaded from: classes.dex */
public final class zzet extends WebView {
    public zzet(Context context, zzfm zzfmVar, CompanionData companionData, List list, zzhy zzhyVar) {
        super(context);
        getSettings().setJavaScriptEnabled(true);
        getSettings().setSupportMultipleWindows(true);
        setWebChromeClient(new zzes(this, context, zzhyVar, list));
        if (companionData.type() == com.google.ads.interactivemedia.v3.impl.data.zzav.Html) {
            loadData(Base64.encodeToString(companionData.src().getBytes(), 1), "text/html", "base64");
        } else {
            if (companionData.type() != com.google.ads.interactivemedia.v3.impl.data.zzav.IFrame) {
                throw new IllegalArgumentException(S.b("Companion type ", String.valueOf(companionData.type()), " is not valid for a CompanionWebView"));
            }
            loadUrl(companionData.src());
        }
    }
}
