package com.google.android.recaptcha.internal;

import Db.q;
import Hb.d;
import Ib.a;
import Jb.i;
import Rb.e;
import cc.E;
import com.bumptech.glide.c;

/* loaded from: classes.dex */
final class zzdf extends i implements e {
    int zza;
    final /* synthetic */ zzdt zzb;
    final /* synthetic */ zzsp zzc;
    final /* synthetic */ zzen zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdf(zzdt zzdtVar, zzsp zzspVar, zzen zzenVar, d dVar) {
        super(2, dVar);
        this.zzb = zzdtVar;
        this.zzc = zzspVar;
        this.zzd = zzenVar;
    }

    @Override // Jb.a
    public final d create(Object obj, d dVar) {
        return new zzdf(this.zzb, this.zzc, this.zzd, dVar);
    }

    @Override // Rb.e
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzdf) create((E) obj, (d) obj2)).invokeSuspend(q.f3365a);
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f5345a;
        int i7 = this.zza;
        c.c0(obj);
        if (i7 == 0) {
            zzdt zzdtVar = this.zzb;
            zzsp zzspVar = this.zzc;
            zzfj zzh = zzdt.zzh(zzdtVar);
            zzbr zzd = zzdt.zzd(zzdtVar);
            this.zza = 1;
            obj = zzh.zzb(zzd, zzspVar, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        zzsr zzsrVar = (zzsr) obj;
        this.zzd.zza();
        return zzsrVar;
    }
}
