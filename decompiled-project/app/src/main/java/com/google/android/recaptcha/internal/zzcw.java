package com.google.android.recaptcha.internal;

import Db.m;
import Hb.d;
import Ib.a;
import Jb.c;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzcw extends c {
    /* synthetic */ Object zza;
    final /* synthetic */ zzdc zzb;
    int zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcw(zzdc zzdcVar, d dVar) {
        super(dVar);
        this.zzb = zzdcVar;
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        Object mo8execute0E7RQCE = this.zzb.mo8execute0E7RQCE(null, 0L, this);
        return mo8execute0E7RQCE == a.f5345a ? mo8execute0E7RQCE : new m(mo8execute0E7RQCE);
    }
}
