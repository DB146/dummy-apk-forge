package com.google.android.recaptcha.internal;

import Db.q;
import Hb.d;
import Ib.a;
import Jb.i;
import Rb.e;
import cc.E;
import com.bumptech.glide.c;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzfb extends i implements e {
    final /* synthetic */ zzff zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzto zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfb(zzff zzffVar, String str, zzto zztoVar, d dVar) {
        super(2, dVar);
        this.zza = zzffVar;
        this.zzb = str;
        this.zzc = zztoVar;
    }

    @Override // Jb.a
    public final d create(Object obj, d dVar) {
        return new zzfb(this.zza, this.zzb, this.zzc, dVar);
    }

    @Override // Rb.e
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzfb) create((E) obj, (d) obj2)).invokeSuspend(q.f3365a);
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        zzey zzg;
        a aVar = a.f5345a;
        c.c0(obj);
        try {
            if (!zzff.zzb(this.zza).zzb(this.zzb)) {
                throw new zzbd(zzbb.zzc, zzba.zzQ, null);
            }
            zzg = this.zza.zzg();
            return zzg.zza(this.zzb, this.zzc);
        } catch (zzbd e2) {
            throw e2;
        } catch (Exception e10) {
            throw new zzbd(zzbb.zzb, zzba.zzaw, e10.getMessage());
        }
    }
}
