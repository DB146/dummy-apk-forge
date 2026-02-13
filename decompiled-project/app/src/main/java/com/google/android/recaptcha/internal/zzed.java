package com.google.android.recaptcha.internal;

import Hb.d;
import Jb.c;
import com.google.android.recaptcha.RecaptchaAction;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzed extends c {
    double zza;
    /* synthetic */ Object zzb;
    final /* synthetic */ zzef zzc;
    int zzd;
    zzef zze;
    String zzf;
    RecaptchaAction zzg;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzed(zzef zzefVar, d dVar) {
        super(dVar);
        this.zzc = zzefVar;
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        this.zzb = obj;
        this.zzd |= Integer.MIN_VALUE;
        return this.zzc.zza(null, null, 0L, this);
    }
}
