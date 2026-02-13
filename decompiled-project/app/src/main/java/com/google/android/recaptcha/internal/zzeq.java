package com.google.android.recaptcha.internal;

import Db.q;
import Hb.d;
import Ib.a;
import Jb.i;
import Rb.e;
import cc.E;
import com.bumptech.glide.c;
import java.util.Timer;

/* loaded from: classes.dex */
final class zzeq extends i implements e {
    final /* synthetic */ zzes zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzeq(zzes zzesVar, d dVar) {
        super(2, dVar);
        this.zza = zzesVar;
    }

    @Override // Jb.a
    public final d create(Object obj, d dVar) {
        return new zzeq(this.zza, dVar);
    }

    @Override // Rb.e
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzeq) create((E) obj, (d) obj2)).invokeSuspend(q.f3365a);
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        zzei zzeiVar;
        Timer timer;
        a aVar = a.f5345a;
        c.c0(obj);
        zzes zzesVar = this.zza;
        synchronized (zzeo.class) {
            try {
                zzeiVar = zzesVar.zze;
                if (zzeiVar != null && zzeiVar.zzb() == 0) {
                    timer = zzes.zza;
                    if (timer != null) {
                        timer.cancel();
                    }
                    zzes.zza = null;
                }
                zzesVar.zzg();
            } catch (Throwable th) {
                throw th;
            }
        }
        return q.f3365a;
    }
}
