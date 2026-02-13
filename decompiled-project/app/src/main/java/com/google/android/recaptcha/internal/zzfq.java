package com.google.android.recaptcha.internal;

import Db.q;
import Eb.o;
import Hb.d;
import Ib.a;
import Jb.i;
import Rb.e;
import cc.E;
import cc.F;
import com.bumptech.glide.c;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzfq extends i implements e {
    int zza;
    final /* synthetic */ zzgd zzb;
    final /* synthetic */ List zzc;
    final /* synthetic */ zzft zzd;
    private /* synthetic */ Object zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfq(zzgd zzgdVar, List list, zzft zzftVar, d dVar) {
        super(2, dVar);
        this.zzb = zzgdVar;
        this.zzc = list;
        this.zzd = zzftVar;
    }

    @Override // Jb.a
    public final d create(Object obj, d dVar) {
        zzfq zzfqVar = new zzfq(this.zzb, this.zzc, this.zzd, dVar);
        zzfqVar.zze = obj;
        return zzfqVar;
    }

    @Override // Rb.e
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzfq) create((E) obj, (d) obj2)).invokeSuspend(q.f3365a);
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        Object zzh;
        a aVar = a.f5345a;
        int i7 = this.zza;
        q qVar = q.f3365a;
        c.c0(obj);
        if (i7 == 0) {
            E e2 = (E) this.zze;
            while (true) {
                zzgd zzgdVar = this.zzb;
                if (zzgdVar.zza() < 0) {
                    break;
                }
                if (zzgdVar.zza() >= this.zzc.size() || !F.w(e2)) {
                    break;
                }
                zzuf zzufVar = (zzuf) this.zzc.get(this.zzb.zza());
                try {
                    zzft.zzf(this.zzd, zzufVar, this.zzb);
                } catch (Exception e10) {
                    zzufVar.zzk();
                    new Integer(zzufVar.zzg());
                    o.d0(zzufVar.zzj(), null, null, null, new zzfp(this.zzd), 31);
                    zzft zzftVar = this.zzd;
                    zzgd zzgdVar2 = this.zzb;
                    this.zza = 1;
                    zzh = zzftVar.zzh(e10, zzgdVar2, this);
                    if (zzh == aVar) {
                        return aVar;
                    }
                }
            }
        }
        return qVar;
    }
}
