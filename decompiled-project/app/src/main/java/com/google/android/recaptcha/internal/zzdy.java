package com.google.android.recaptcha.internal;

import Db.q;
import Hb.d;
import Ib.a;
import Jb.i;
import Rb.c;
import cc.F;

/* loaded from: classes.dex */
final class zzdy extends i implements c {
    int zza;
    final /* synthetic */ long zzb;
    final /* synthetic */ zzec zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdy(long j, zzec zzecVar, d dVar) {
        super(1, dVar);
        this.zzb = j;
        this.zzc = zzecVar;
    }

    @Override // Jb.a
    public final d create(d dVar) {
        return new zzdy(this.zzb, this.zzc, dVar);
    }

    @Override // Rb.c
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((zzdy) create((d) obj)).invokeSuspend(q.f3365a);
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f5345a;
        int i7 = this.zza;
        com.bumptech.glide.c.c0(obj);
        if (i7 == 0) {
            long j = this.zzb;
            zzdx zzdxVar = new zzdx(this.zzc, null);
            this.zza = 1;
            if (F.L(j, zzdxVar, this) == aVar) {
                return aVar;
            }
        }
        return q.f3365a;
    }
}
