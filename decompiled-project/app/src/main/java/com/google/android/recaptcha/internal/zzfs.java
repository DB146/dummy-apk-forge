package com.google.android.recaptcha.internal;

import Db.q;
import Hb.d;
import Ib.a;
import Jb.i;
import Rb.e;
import cc.E;
import com.bumptech.glide.c;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
final class zzfs extends i implements e {
    Object zza;
    Object zzb;
    int zzc;
    final /* synthetic */ zzgd zzd;
    final /* synthetic */ zzft zze;
    final /* synthetic */ String zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfs(zzgd zzgdVar, zzft zzftVar, String str, d dVar) {
        super(2, dVar);
        this.zzd = zzgdVar;
        this.zze = zzftVar;
        this.zzf = str;
    }

    @Override // Jb.a
    public final d create(Object obj, d dVar) {
        return new zzfs(this.zzd, this.zze, this.zzf, dVar);
    }

    @Override // Rb.e
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzfs) create((E) obj, (d) obj2)).invokeSuspend(q.f3365a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x007f, code lost:
    
        if (r7 != r0) goto L20;
     */
    @Override // Jb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object zzh;
        zzhx zzhxVar;
        Object zzg;
        zzub zzubVar;
        zzjh zzjhVar;
        a aVar = a.f5345a;
        int i7 = this.zzc;
        try {
        } catch (Exception e2) {
            zzft zzftVar = this.zze;
            zzgd zzgdVar = this.zzd;
            this.zza = null;
            this.zzb = null;
            this.zzc = 2;
            zzh = zzftVar.zzh(e2, zzgdVar, this);
        }
        if (i7 == 0) {
            c.c0(obj);
            this.zzd.zza = new zzbn();
            zzub zzi = zzub.zzi(zzkh.zzh().zzj(this.zzf));
            zzi.zzf();
            zzhxVar = this.zze.zzc;
            zztz zza = zzhxVar.zza(zzi);
            zzjh zzb = zzjh.zzb();
            zzft zzftVar2 = this.zze;
            List zzi2 = zza.zzi();
            zzgd zzgdVar2 = this.zzd;
            this.zza = zzi;
            this.zzb = zzb;
            this.zzc = 1;
            zzg = zzftVar2.zzg(zzi2, zzgdVar2, this);
            if (zzg != aVar) {
                zzubVar = zzi;
                zzjhVar = zzb;
            }
            return aVar;
        }
        if (i7 != 1) {
            c.c0(obj);
            return q.f3365a;
        }
        zzjhVar = (zzjh) this.zzb;
        zzubVar = (zzub) this.zza;
        c.c0(obj);
        zzjhVar.zzf();
        new Long(zzjhVar.zza(TimeUnit.MICROSECONDS));
        zzubVar.zzf();
        return q.f3365a;
    }
}
