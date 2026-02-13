package com.google.android.recaptcha.internal;

import Db.q;
import F5.f;
import Hb.d;
import Ib.a;
import Jb.i;
import Rb.e;
import android.app.Application;
import android.os.Build;
import cc.E;
import com.bumptech.glide.c;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzdh extends i implements e {
    int zza;
    final /* synthetic */ zzdt zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdh(zzdt zzdtVar, d dVar) {
        super(2, dVar);
        this.zzb = zzdtVar;
    }

    @Override // Jb.a
    public final d create(Object obj, d dVar) {
        return new zzdh(this.zzb, dVar);
    }

    @Override // Rb.e
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzdh) create((E) obj, (d) obj2)).invokeSuspend(q.f3365a);
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        Application zzr;
        String str;
        Application zzr2;
        zzek zzekVar;
        zzbf zzt;
        a aVar = a.f5345a;
        int i7 = this.zza;
        c.c0(obj);
        if (i7 == 0) {
            zzbs zzbsVar = new zzbs(f.f4100b);
            zzr = this.zzb.zzr();
            int zza = zzbsVar.zza(zzr);
            zzdt zzdtVar = this.zzb;
            str = zzdtVar.zza;
            zzr2 = zzdtVar.zzr();
            String packageName = zzr2.getPackageName();
            zzekVar = this.zzb.zzb;
            String zzd = zzekVar.zzd();
            zzt = this.zzb.zzt();
            int i10 = Build.VERSION.SDK_INT;
            String zza2 = zzt.zza();
            zztn zzf = zzto.zzf();
            zzf.zzt(str);
            zzf.zzq(packageName);
            zzf.zzu(zza);
            zzf.zzr("18.6.1");
            zzf.zzs(zzd);
            zzf.zzf(String.valueOf(i10));
            zzf.zze(zza2);
            zzto zztoVar = (zzto) zzf.zzk();
            zzdt zzdtVar2 = this.zzb;
            zzff zzg = zzdt.zzg(zzdtVar2);
            String zzb = zzdt.zzd(zzdtVar2).zzb();
            this.zza = 1;
            obj = zzg.zzc(zzb, zztoVar, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }
}
