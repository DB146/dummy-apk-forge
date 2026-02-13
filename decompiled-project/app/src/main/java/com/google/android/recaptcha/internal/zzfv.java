package com.google.android.recaptcha.internal;

import Db.q;
import Eb.o;
import Hb.d;
import Ib.a;
import Jb.i;
import Rb.e;
import android.webkit.WebView;
import cc.E;
import com.bumptech.glide.c;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzfv extends i implements e {
    final /* synthetic */ String[] zza;
    final /* synthetic */ zzfw zzb;
    final /* synthetic */ String zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfv(String[] strArr, zzfw zzfwVar, String str, d dVar) {
        super(2, dVar);
        this.zza = strArr;
        this.zzb = zzfwVar;
        this.zzc = str;
    }

    @Override // Jb.a
    public final d create(Object obj, d dVar) {
        return new zzfv(this.zza, this.zzb, this.zzc, dVar);
    }

    @Override // Rb.e
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzfv) create((E) obj, (d) obj2)).invokeSuspend(q.f3365a);
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        WebView webView;
        a aVar = a.f5345a;
        c.c0(obj);
        String[] strArr = this.zza;
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add("\"" + str + "\"");
        }
        zzfw zzfwVar = this.zzb;
        String str2 = this.zzc;
        webView = zzfwVar.zza;
        webView.evaluateJavascript(X.c.j(str2, "(", o.d0(arrayList, ",", null, null, null, 62), ")"), null);
        return q.f3365a;
    }
}
