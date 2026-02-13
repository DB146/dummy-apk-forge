package com.google.android.recaptcha.internal;

import Db.q;
import Hb.d;
import Ib.a;
import Jb.i;
import Rb.e;
import android.app.Application;
import cc.E;
import com.bumptech.glide.c;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzcp extends i implements e {
    int zza;
    final /* synthetic */ Application zzb;
    final /* synthetic */ String zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcp(Application application, String str, d dVar) {
        super(2, dVar);
        this.zzb = application;
        this.zzc = str;
    }

    @Override // Jb.a
    public final d create(Object obj, d dVar) {
        return new zzcp(this.zzb, this.zzc, dVar);
    }

    @Override // Rb.e
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzcp) create((E) obj, (d) obj2)).invokeSuspend(q.f3365a);
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f5345a;
        int i7 = this.zza;
        c.c0(obj);
        if (i7 == 0) {
            Application application = this.zzb;
            String str = this.zzc;
            this.zza = 1;
            obj = zzcq.zzd(application, str, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }
}
