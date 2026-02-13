package com.google.android.recaptcha.internal;

import Hb.d;
import Jb.c;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzdv extends c {
    /* synthetic */ Object zza;
    final /* synthetic */ zzec zzb;
    int zzc;
    zzbn zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdv(zzec zzecVar, d dVar) {
        super(dVar);
        this.zzb = zzecVar;
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        Object zzl;
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        zzl = this.zzb.zzl(null, this);
        return zzl;
    }
}
