package com.google.android.recaptcha.internal;

import Db.m;
import Db.q;
import Hb.d;
import Ib.a;
import Jb.i;
import Rb.e;
import cc.E;
import com.bumptech.glide.c;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzu extends i implements e {
    Object zza;
    Object zzb;
    int zzc;
    final /* synthetic */ zzsc zzd;
    final /* synthetic */ zzv zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzu(zzsc zzscVar, zzv zzvVar, d dVar) {
        super(2, dVar);
        this.zzd = zzscVar;
        this.zze = zzvVar;
    }

    @Override // Jb.a
    public final d create(Object obj, d dVar) {
        return new zzu(this.zzd, this.zze, dVar);
    }

    @Override // Rb.e
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzu) create((E) obj, (d) obj2)).invokeSuspend(q.f3365a);
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        zzse zzj;
        List list;
        Iterator it;
        a aVar = a.f5345a;
        if (this.zzc != 0) {
            it = (Iterator) this.zzb;
            zzj = (zzse) this.zza;
            c.c0(obj);
        } else {
            c.c0(obj);
            if (!this.zzd.zzS()) {
                return new m(c.n(new zzbd(zzbb.zzb, zzba.zzab, null)));
            }
            zzj = this.zzd.zzj();
            if (zzj.zzi().zzd() == 0) {
                return new m(c.n(new zzbd(zzbb.zzb, zzba.zzab, null)));
            }
            this.zze.zzc = zzj.zzi();
            list = this.zze.zzb;
            it = list.iterator();
        }
        while (it.hasNext()) {
            zzy zzyVar = (zzy) it.next();
            this.zza = zzj;
            this.zzb = it;
            this.zzc = 1;
            if (zzyVar.zzd(zzj, this) == aVar) {
                return aVar;
            }
        }
        return new m(q.f3365a);
    }
}
