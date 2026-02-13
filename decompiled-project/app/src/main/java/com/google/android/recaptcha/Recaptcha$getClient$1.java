package com.google.android.recaptcha;

import Db.m;
import Hb.d;
import Ib.a;
import Jb.c;

/* loaded from: classes.dex */
public final class Recaptcha$getClient$1 extends c {
    /* synthetic */ Object zza;
    final /* synthetic */ Recaptcha zzb;
    int zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Recaptcha$getClient$1(Recaptcha recaptcha, d dVar) {
        super(dVar);
        this.zzb = recaptcha;
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        Object m7getClientBWLJW6A = this.zzb.m7getClientBWLJW6A(null, null, 0L, this);
        return m7getClientBWLJW6A == a.f5345a ? m7getClientBWLJW6A : new m(m7getClientBWLJW6A);
    }
}
