package com.google.android.recaptcha.internal;

import Db.m;
import Hb.d;
import Ib.a;
import Jb.c;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zza extends c {
    Object zza;
    long zzb;
    /* synthetic */ Object zzc;
    final /* synthetic */ zze zzd;
    int zze;
    String zzf;
    zzen zzg;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zza(zze zzeVar, d dVar) {
        super(dVar);
        this.zzd = zzeVar;
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        this.zzc = obj;
        this.zze |= Integer.MIN_VALUE;
        Object zzc = this.zzd.zzc(null, 0L, this);
        return zzc == a.f5345a ? zzc : new m(zzc);
    }
}
