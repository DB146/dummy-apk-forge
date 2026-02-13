package com.google.android.recaptcha.internal;

import Db.m;
import Db.q;
import Hb.d;
import Ib.a;
import Jb.i;
import Rb.e;
import cc.E;
import com.bumptech.glide.c;
import com.google.android.recaptcha.RecaptchaAction;

/* loaded from: classes.dex */
final class zzda extends i implements e {
    int zza;
    final /* synthetic */ zzdc zzb;
    final /* synthetic */ RecaptchaAction zzc;
    final /* synthetic */ long zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzda(zzdc zzdcVar, RecaptchaAction recaptchaAction, long j, d dVar) {
        super(2, dVar);
        this.zzb = zzdcVar;
        this.zzc = recaptchaAction;
        this.zzd = j;
    }

    @Override // Jb.a
    public final d create(Object obj, d dVar) {
        return new zzda(this.zzb, this.zzc, this.zzd, dVar);
    }

    @Override // Rb.e
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzda) create((E) obj, (d) obj2)).invokeSuspend(q.f3365a);
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        Object zzf;
        a aVar = a.f5345a;
        int i7 = this.zza;
        c.c0(obj);
        if (i7 != 0) {
            zzf = ((m) obj).f3357a;
        } else {
            zzdc zzdcVar = this.zzb;
            RecaptchaAction recaptchaAction = this.zzc;
            long j = this.zzd;
            this.zza = 1;
            zzf = zzdcVar.zzf(recaptchaAction, j, this);
            if (zzf == aVar) {
                return aVar;
            }
        }
        c.c0(zzf);
        return zzf;
    }
}
