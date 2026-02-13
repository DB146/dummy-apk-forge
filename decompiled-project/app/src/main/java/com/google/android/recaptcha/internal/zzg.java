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
final class zzg extends i implements e {
    int zza;
    final /* synthetic */ zze zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ long zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzg(zze zzeVar, String str, long j, d dVar) {
        super(2, dVar);
        this.zzb = zzeVar;
        this.zzc = str;
        this.zzd = j;
    }

    @Override // Jb.a
    public final d create(Object obj, d dVar) {
        return new zzg(this.zzb, this.zzc, this.zzd, dVar);
    }

    @Override // Rb.e
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzg) create((E) obj, (d) obj2)).invokeSuspend(q.f3365a);
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        Object zzc;
        a aVar = a.f5345a;
        int i7 = this.zza;
        c.c0(obj);
        if (i7 != 0) {
            zzc = ((m) obj).f3357a;
        } else {
            zze zzeVar = this.zzb;
            String str = this.zzc;
            long j = this.zzd;
            this.zza = 1;
            zzc = zzeVar.zzc(str, j, this);
            if (zzc == aVar) {
                return aVar;
            }
        }
        return new m(zzc);
    }
}
