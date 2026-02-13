package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import android.os.Message;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzes extends WebChromeClient {
    final /* synthetic */ Context zza;
    final /* synthetic */ zzhy zzb;
    final /* synthetic */ List zzc;

    public zzes(zzet zzetVar, Context context, zzhy zzhyVar, List list) {
        this.zza = context;
        this.zzb = zzhyVar;
        this.zzc = list;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onCreateWindow(WebView webView, boolean z8, boolean z10, Message message) {
        WebView.WebViewTransport webViewTransport = (WebView.WebViewTransport) message.obj;
        WebView webView2 = new WebView(this.zza);
        webViewTransport.setWebView(webView2);
        webView2.setWebViewClient(new zzer(this));
        message.sendToTarget();
        return true;
    }
}
