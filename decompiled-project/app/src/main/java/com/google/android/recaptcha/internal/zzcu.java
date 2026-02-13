package com.google.android.recaptcha.internal;

import Hb.d;
import Jb.c;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzcu extends c {
    /* synthetic */ Object zza;
    final /* synthetic */ zzcv zzb;
    int zzc;
    zzen zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcu(zzcv zzcvVar, d dVar) {
        super(dVar);
        this.zzb = zzcvVar;
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        Object zzj;
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        zzj = this.zzb.zzj(null, 0, null, this);
        return zzj;
    }
}
