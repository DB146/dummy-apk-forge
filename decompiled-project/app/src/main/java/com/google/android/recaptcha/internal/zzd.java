package com.google.android.recaptcha.internal;

import Db.m;
import Db.q;
import Hb.d;
import Ib.a;
import Jb.i;
import Rb.e;
import cc.E;
import com.bumptech.glide.c;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzd extends i implements e {
    int zza;
    final /* synthetic */ zze zzb;
    final /* synthetic */ zzsc zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzd(zze zzeVar, zzsc zzscVar, d dVar) {
        super(2, dVar);
        this.zzb = zzeVar;
        this.zzc = zzscVar;
    }

    @Override // Jb.a
    public final d create(Object obj, d dVar) {
        return new zzd(this.zzb, this.zzc, dVar);
    }

    @Override // Rb.e
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzd) create((E) obj, (d) obj2)).invokeSuspend(q.f3365a);
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        Object zzh;
        a aVar = a.f5345a;
        int i7 = this.zza;
        c.c0(obj);
        if (i7 != 0) {
            zzh = ((m) obj).f3357a;
        } else {
            zze zzeVar = this.zzb;
            zzsc zzscVar = this.zzc;
            this.zza = 1;
            zzh = zzeVar.zzh(zzscVar, this);
            if (zzh == aVar) {
                return aVar;
            }
        }
        return new m(zzh);
    }
}
