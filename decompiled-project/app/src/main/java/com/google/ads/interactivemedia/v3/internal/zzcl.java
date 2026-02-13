package com.google.ads.interactivemedia.v3.internal;

import android.webkit.WebView;

/* loaded from: classes.dex */
final class zzcl implements Runnable {
    final /* synthetic */ zzcm zza;
    private final WebView zzb;

    public zzcl(zzcm zzcmVar) {
        WebView webView;
        this.zza = zzcmVar;
        webView = zzcmVar.zza;
        this.zzb = webView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.destroy();
    }
}
