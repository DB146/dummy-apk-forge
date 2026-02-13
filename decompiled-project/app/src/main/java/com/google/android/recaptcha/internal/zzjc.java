package com.google.android.recaptcha.internal;

import Db.q;
import Hb.d;
import Ib.a;
import Jb.i;
import Rb.e;
import android.content.Context;
import android.webkit.WebView;
import cc.E;
import com.bumptech.glide.c;

/* loaded from: classes.dex */
final class zzjc extends i implements e {
    final /* synthetic */ zzjd zza;
    final /* synthetic */ Context zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzjc(zzjd zzjdVar, Context context, d dVar) {
        super(2, dVar);
        this.zza = zzjdVar;
        this.zzb = context;
    }

    @Override // Jb.a
    public final d create(Object obj, d dVar) {
        return new zzjc(this.zza, this.zzb, dVar);
    }

    @Override // Rb.e
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzjc) create((E) obj, (d) obj2)).invokeSuspend(q.f3365a);
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        WebView webView;
        a aVar = a.f5345a;
        c.c0(obj);
        webView = this.zza.zza;
        if (webView == null) {
            webView = new WebView(this.zzb);
        }
        this.zza.zza = webView;
        return webView;
    }
}
