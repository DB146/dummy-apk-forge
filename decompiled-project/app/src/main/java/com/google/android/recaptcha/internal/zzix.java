package com.google.android.recaptcha.internal;

import Hb.d;
import Jb.c;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzix extends c {
    /* synthetic */ Object zza;
    final /* synthetic */ zzja zzb;
    int zzc;
    zzja zzd;
    String zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzix(zzja zzjaVar, d dVar) {
        super(dVar);
        this.zzb = zzjaVar;
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        Object zzG;
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        zzG = this.zzb.zzG(null, this);
        return zzG;
    }
}
