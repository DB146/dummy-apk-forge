package com.google.android.recaptcha.internal;

import Db.q;
import Hb.d;
import Ib.a;
import Jb.i;
import Rb.e;
import android.webkit.WebView;
import cc.E;
import com.bumptech.glide.c;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzil extends i implements e {
    Object zza;
    int zzb;
    final /* synthetic */ zzja zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzil(zzja zzjaVar, d dVar) {
        super(2, dVar);
        this.zzc = zzjaVar;
    }

    @Override // Jb.a
    public final d create(Object obj, d dVar) {
        return new zzil(this.zzc, dVar);
    }

    @Override // Rb.e
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzil) create((E) obj, (d) obj2)).invokeSuspend(q.f3365a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x006c, code lost:
    
        ((android.webkit.WebView) r7).setWebViewClient(new com.google.android.recaptcha.internal.zzik(r6.zzc));
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x007a, code lost:
    
        return Db.q.f3365a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0053, code lost:
    
        if (r7 != r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003d, code lost:
    
        if (r7 != r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x002c, code lost:
    
        if (r7 != r0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0012, code lost:
    
        if (r1 != 3) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0055, code lost:
    
        ((android.webkit.WebView) r7).addJavascriptInterface(r6.zzc.zzq(), "RN");
        r7 = r6.zzc;
        r6.zzb = 4;
        r7 = r7.zzw(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0069, code lost:
    
        if (r7 != r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x007b, code lost:
    
        return r0;
     */
    @Override // Jb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f5345a;
        int i7 = this.zzb;
        if (i7 == 0) {
            c.c0(obj);
            zzja zzjaVar = this.zzc;
            this.zzb = 1;
            obj = zzjaVar.zzw(this);
        } else if (i7 == 1) {
            c.c0(obj);
        } else if (i7 != 2) {
            c.c0(obj);
        } else {
            c.c0(obj);
            ((WebView) obj).getSettings().setJavaScriptEnabled(true);
            zzja zzjaVar2 = this.zzc;
            this.zza = null;
            this.zzb = 3;
            obj = zzjaVar2.zzw(this);
        }
        ((WebView) obj).removeJavascriptInterface("RN");
        zzja zzjaVar3 = this.zzc;
        this.zza = zzjaVar3;
        this.zzb = 2;
        obj = zzjaVar3.zzw(this);
    }
}
