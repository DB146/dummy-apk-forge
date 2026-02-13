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
public final class zzb extends i implements e {
    int zza;
    final /* synthetic */ zze zzb;
    final /* synthetic */ String zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzb(zze zzeVar, String str, d dVar) {
        super(2, dVar);
        this.zzb = zzeVar;
        this.zzc = str;
    }

    @Override // Jb.a
    public final d create(Object obj, d dVar) {
        return new zzb(this.zzb, this.zzc, dVar);
    }

    @Override // Rb.e
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzb) create((E) obj, (d) obj2)).invokeSuspend(q.f3365a);
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        Object zzf;
        a aVar = a.f5345a;
        int i7 = this.zza;
        c.c0(obj);
        if (i7 != 0) {
            zzf = ((m) obj).f3357a;
        } else {
            zze zzeVar = this.zzb;
            String str = this.zzc;
            this.zza = 1;
            zzf = zzeVar.zzf(str, this);
            if (zzf == aVar) {
                return aVar;
            }
        }
        return new m(zzf);
    }
}
