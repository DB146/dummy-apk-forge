package com.google.ads.interactivemedia.v3.internal;

import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.ads.interactivemedia.v3.api.CompanionAdSlot;
import java.util.Iterator;

/* loaded from: classes.dex */
final class zzer extends WebViewClient {
    final /* synthetic */ zzes zza;

    public zzer(zzes zzesVar) {
        this.zza = zzesVar;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        this.zza.zzb.zza(str);
        Iterator it = this.zza.zzc.iterator();
        while (it.hasNext()) {
            ((CompanionAdSlot.ClickListener) it.next()).onCompanionAdClick();
        }
        return true;
    }
}
