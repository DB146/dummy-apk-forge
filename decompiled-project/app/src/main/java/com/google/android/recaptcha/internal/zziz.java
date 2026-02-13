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
public final class zziz extends i implements e {
    Object zza;
    int zzb;
    final /* synthetic */ zzja zzc;
    final /* synthetic */ zzen zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zziz(zzja zzjaVar, zzen zzenVar, d dVar) {
        super(2, dVar);
        this.zzc = zzjaVar;
        this.zzd = zzenVar;
    }

    @Override // Jb.a
    public final d create(Object obj, d dVar) {
        return new zziz(this.zzc, this.zzd, dVar);
    }

    @Override // Rb.e
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zziz) create((E) obj, (d) obj2)).invokeSuspend(q.f3365a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003d, code lost:
    
        if (cc.F.L(20000, r6, r5) == r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0029, code lost:
    
        if (r6.zzx(r5) != r0) goto L15;
     */
    @Override // Jb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        zzbd zzbdVar;
        a aVar = a.f5345a;
        int i7 = this.zzb;
        try {
        } catch (Exception e2) {
            e2.getMessage();
            zzbd zza = zzf.zza(e2, new zzbd(zzbb.zzb, zzba.zzV, e2.getMessage()));
            zzcb zzm = this.zzc.zzm();
            zzje zzjeVar = zzje.zza;
            this.zza = zza;
            this.zzb = 3;
            if (zzm.zzc(zzjeVar, this) != aVar) {
                zzbdVar = zza;
            }
            return aVar;
        }
        if (i7 == 0) {
            c.c0(obj);
            zzja zzjaVar = this.zzc;
            this.zzb = 1;
        } else {
            if (i7 != 1) {
                if (i7 == 2) {
                    c.c0(obj);
                    return q.f3365a;
                }
                zzbdVar = (zzbd) this.zza;
                c.c0(obj);
                this.zzd.zzb(zzbdVar);
                return q.f3365a;
            }
            c.c0(obj);
        }
        zziy zziyVar = new zziy(this.zzc, this.zzd, null);
        this.zzb = 2;
    }
}
