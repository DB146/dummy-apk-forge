package com.google.android.recaptcha.internal;

import Db.m;
import Hb.d;
import Ib.a;
import Jb.c;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzi extends c {
    /* synthetic */ Object zza;
    final /* synthetic */ zzl zzb;
    int zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzi(zzl zzlVar, d dVar) {
        super(dVar);
        this.zzb = zzlVar;
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        Object zzc = this.zzb.zzc(0L, null, null, this);
        return zzc == a.f5345a ? zzc : new m(zzc);
    }
}
