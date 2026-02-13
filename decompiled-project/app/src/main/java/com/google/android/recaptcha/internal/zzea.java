package com.google.android.recaptcha.internal;

import Db.q;
import Hb.d;
import Ib.a;
import Jb.i;
import Rb.c;
import cc.C0953t;
import cc.InterfaceC0952s;

/* loaded from: classes.dex */
final class zzea extends i implements c {
    Object zza;
    int zzb;
    final /* synthetic */ zzec zzc;
    final /* synthetic */ long zzd;
    final /* synthetic */ InterfaceC0952s zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzea(zzec zzecVar, long j, InterfaceC0952s interfaceC0952s, d dVar) {
        super(1, dVar);
        this.zzc = zzecVar;
        this.zzd = j;
        this.zze = interfaceC0952s;
    }

    @Override // Jb.a
    public final d create(d dVar) {
        return new zzea(this.zzc, this.zzd, this.zze, dVar);
    }

    @Override // Rb.c
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((zzea) create((d) obj)).invokeSuspend(q.f3365a);
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        zzek zzekVar;
        zzen zzenVar;
        zzbd e2;
        zzdt zzdtVar;
        zzen zzenVar2;
        zzdt zzdtVar2;
        zzcj zzcjVar;
        a aVar = a.f5345a;
        int i7 = this.zzb;
        if (i7 == 0) {
            com.bumptech.glide.c.c0(obj);
            zzekVar = this.zzc.zzb;
            zzen zzf = zzekVar.zzf(41);
            try {
                zzdtVar = this.zzc.zza;
                long j = this.zzd;
                this.zza = zzf;
                this.zzb = 1;
                Object zzo = zzdtVar.zzo(j, this);
                if (zzo != aVar) {
                    zzenVar2 = zzf;
                    obj = zzo;
                }
                return aVar;
            } catch (zzbd e10) {
                zzenVar = zzf;
                e2 = e10;
                this.zzc.zzd = e2;
                zzenVar.zzb(e2);
                throw e2;
            }
        }
        if (i7 != 1) {
            zzenVar = (zzen) this.zza;
            try {
                com.bumptech.glide.c.c0(obj);
                zzenVar.zza();
                zzec zzecVar = this.zzc;
                zzcjVar = zzcm.zzb;
                zzecVar.zzf = zzcjVar;
                return Boolean.valueOf(((C0953t) this.zze).J(q.f3365a));
            } catch (zzbd e11) {
                e2 = e11;
                this.zzc.zzd = e2;
                zzenVar.zzb(e2);
                throw e2;
            }
        }
        zzenVar2 = (zzen) this.zza;
        try {
            com.bumptech.glide.c.c0(obj);
        } catch (zzbd e12) {
            e2 = e12;
            zzenVar = zzenVar2;
            this.zzc.zzd = e2;
            zzenVar.zzb(e2);
            throw e2;
        }
        zzsc zzscVar = (zzsc) obj;
        this.zzc.zze = zzscVar;
        zzdtVar2 = this.zzc.zza;
        long j10 = this.zzd;
        this.zza = zzenVar2;
        this.zzb = 2;
        if (zzdtVar2.zzn(zzscVar, j10, this) != aVar) {
            zzenVar = zzenVar2;
            zzenVar.zza();
            zzec zzecVar2 = this.zzc;
            zzcjVar = zzcm.zzb;
            zzecVar2.zzf = zzcjVar;
            return Boolean.valueOf(((C0953t) this.zze).J(q.f3365a));
        }
        return aVar;
    }
}
