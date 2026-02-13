package com.google.android.recaptcha.internal;

import Hb.d;
import Jb.c;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzdw extends c {
    long zza;
    /* synthetic */ Object zzb;
    final /* synthetic */ zzec zzc;
    int zzd;
    zzec zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdw(zzec zzecVar, d dVar) {
        super(dVar);
        this.zzc = zzecVar;
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        Object zzm;
        this.zzb = obj;
        this.zzd |= Integer.MIN_VALUE;
        zzm = this.zzc.zzm(0L, this);
        return zzm;
    }
}
