package com.google.android.recaptcha.internal;

import Db.q;
import Hb.d;
import Ib.a;
import Jb.i;
import Rb.e;
import com.bumptech.glide.c;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzct extends i implements e {
    Object zza;
    int zzb;
    /* synthetic */ Object zzc;
    final /* synthetic */ zzcv zzd;
    final /* synthetic */ String zze;
    final /* synthetic */ long zzf;
    final /* synthetic */ zzcn zzg;
    final /* synthetic */ zzch zzh;
    final /* synthetic */ zzbi zzi;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzct(zzcv zzcvVar, String str, long j, zzcn zzcnVar, zzbi zzbiVar, zzch zzchVar, d dVar) {
        super(2, dVar);
        this.zzd = zzcvVar;
        this.zze = str;
        this.zzf = j;
        this.zzg = zzcnVar;
        this.zzi = zzbiVar;
        this.zzh = zzchVar;
    }

    @Override // Jb.a
    public final d create(Object obj, d dVar) {
        zzct zzctVar = new zzct(this.zzd, this.zze, this.zzf, this.zzg, this.zzi, this.zzh, dVar);
        zzctVar.zzc = obj;
        return zzctVar;
    }

    @Override // Rb.e
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzct) create((zzek) obj, (d) obj2)).invokeSuspend(q.f3365a);
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        zzek zzekVar;
        zzcn zzcnVar;
        a aVar = a.f5345a;
        if (this.zzb != 0) {
            zzcnVar = (zzcn) this.zza;
            zzekVar = (zzek) this.zzc;
            c.c0(obj);
        } else {
            c.c0(obj);
            zzekVar = (zzek) this.zzc;
            zzdc zza = zzcv.zza(this.zzd, this.zze);
            if (zza != null) {
                return zza;
            }
            zzcv.zzc(this.zzd, this.zzf);
            zzcn zzcnVar2 = this.zzg;
            if (zzcnVar2 == null) {
                zzcnVar2 = zzcv.zze(this.zzd, this.zze, this.zzi, this.zzh, zzekVar);
            }
            long j = this.zzf;
            this.zzc = zzekVar;
            this.zza = zzcnVar2;
            this.zzb = 1;
            if (zzcnVar2.zzb(j, this) == aVar) {
                return aVar;
            }
            zzcnVar = zzcnVar2;
        }
        zzdc zzdcVar = new zzdc(zzcnVar, this.zze, this.zzi, zzekVar);
        this.zzd.zzc = zzdcVar;
        return zzdcVar;
    }
}
