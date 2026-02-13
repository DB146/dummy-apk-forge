package com.google.android.recaptcha.internal;

import Db.m;
import Hb.d;
import Ib.a;
import Jb.c;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzcx extends c {
    /* synthetic */ Object zza;
    final /* synthetic */ zzdc zzb;
    int zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcx(zzdc zzdcVar, d dVar) {
        super(dVar);
        this.zzb = zzdcVar;
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        Object mo9executegIAlus = this.zzb.mo9executegIAlus(null, this);
        return mo9executegIAlus == a.f5345a ? mo9executegIAlus : new m(mo9executegIAlus);
    }
}
