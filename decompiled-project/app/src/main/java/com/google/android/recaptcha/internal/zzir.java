package com.google.android.recaptcha.internal;

import Db.m;
import Hb.d;
import Ib.a;
import Jb.c;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzir extends c {
    /* synthetic */ Object zza;
    final /* synthetic */ zzja zzb;
    int zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzir(zzja zzjaVar, d dVar) {
        super(dVar);
        this.zzb = zzjaVar;
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        Object zzh = this.zzb.zzh(null, this);
        return zzh == a.f5345a ? zzh : new m(zzh);
    }
}
