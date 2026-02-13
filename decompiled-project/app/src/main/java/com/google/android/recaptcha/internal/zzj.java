package com.google.android.recaptcha.internal;

import Db.m;
import Db.q;
import Hb.d;
import Ib.a;
import Jb.i;
import Rb.e;
import cc.E;
import com.bumptech.glide.c;

/* loaded from: classes.dex */
final class zzj extends i implements e {
    int zza;
    final /* synthetic */ zze zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ zzsc zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzj(zze zzeVar, long j, zzsc zzscVar, d dVar) {
        super(2, dVar);
        this.zzb = zzeVar;
        this.zzc = j;
        this.zzd = zzscVar;
    }

    @Override // Jb.a
    public final d create(Object obj, d dVar) {
        return new zzj(this.zzb, this.zzc, this.zzd, dVar);
    }

    @Override // Rb.e
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzj) create((E) obj, (d) obj2)).invokeSuspend(q.f3365a);
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        Object zze;
        a aVar = a.f5345a;
        int i7 = this.zza;
        c.c0(obj);
        if (i7 != 0) {
            zze = ((m) obj).f3357a;
        } else {
            zze zzeVar = this.zzb;
            long j = this.zzc;
            zzsc zzscVar = this.zzd;
            this.zza = 1;
            zze = zzeVar.zze(j, zzscVar, this);
            if (zze == aVar) {
                return aVar;
            }
        }
        return new m(zze);
    }
}
