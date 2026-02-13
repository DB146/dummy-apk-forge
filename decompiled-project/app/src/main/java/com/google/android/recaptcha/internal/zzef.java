package com.google.android.recaptcha.internal;

import Db.q;
import Hb.d;
import Ib.a;
import com.bumptech.glide.c;
import com.google.android.recaptcha.RecaptchaAction;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public final class zzef implements zzcn {
    private final zzdt zza;
    private zzcm zzb;
    private zzsc zzc;

    public zzef(zzdt zzdtVar) {
        zzcl zzclVar;
        this.zza = zzdtVar;
        zzclVar = zzcm.zza;
        this.zzb = zzclVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0059  */
    @Override // com.google.android.recaptcha.internal.zzcn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zza(String str, RecaptchaAction recaptchaAction, long j, d dVar) {
        zzed zzedVar;
        Object obj;
        a aVar;
        int i7;
        zzcj zzcjVar;
        RecaptchaAction recaptchaAction2;
        double d10;
        zzef zzefVar;
        zzsc zzscVar;
        zzef zzefVar2;
        String str2 = str;
        try {
            if (dVar instanceof zzed) {
                zzedVar = (zzed) dVar;
                int i10 = zzedVar.zzd;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    zzedVar.zzd = i10 - Integer.MIN_VALUE;
                    zzed zzedVar2 = zzedVar;
                    obj = zzedVar2.zzb;
                    aVar = a.f5345a;
                    i7 = zzedVar2.zzd;
                    if (i7 != 0) {
                        c.c0(obj);
                        zzcm zzcmVar = this.zzb;
                        zzcjVar = zzcm.zzb;
                        if (!l.a(zzcmVar, zzcjVar)) {
                            throw new zzbd(zzbb.zzb, zzba.zzar, null);
                        }
                        double d11 = j;
                        zzdt zzdtVar = this.zza;
                        double d12 = 0.45d * d11;
                        zzedVar2.zze = this;
                        zzedVar2.zzf = str2;
                        recaptchaAction2 = recaptchaAction;
                        zzedVar2.zzg = recaptchaAction2;
                        double d13 = d11 * 0.55d;
                        zzedVar2.zza = d13;
                        zzedVar2.zzd = 1;
                        obj = zzdtVar.zzl(str2, (long) d12, zzedVar2);
                        if (obj != aVar) {
                            d10 = d13;
                            zzefVar = this;
                        }
                        return aVar;
                    }
                    if (i7 != 1) {
                        if (i7 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        str2 = zzedVar2.zzf;
                        zzefVar2 = zzedVar2.zze;
                        c.c0(obj);
                        zzsr zzsrVar = (zzsr) obj;
                        zzefVar2.zza.zzq(str2, zzsrVar);
                        return zzsrVar.zzj();
                    }
                    double d14 = zzedVar2.zza;
                    RecaptchaAction recaptchaAction3 = zzedVar2.zzg;
                    String str3 = zzedVar2.zzf;
                    zzef zzefVar3 = zzedVar2.zze;
                    c.c0(obj);
                    d10 = d14;
                    zzefVar = zzefVar3;
                    recaptchaAction2 = recaptchaAction3;
                    str2 = str3;
                    zzsi zzsiVar = (zzsi) obj;
                    zzdt zzdtVar2 = zzefVar.zza;
                    zzscVar = zzefVar.zzc;
                    if (zzscVar == null) {
                        zzscVar = null;
                    }
                    zzsp zzi = zzdtVar2.zzi(recaptchaAction2, zzsiVar, zzscVar);
                    zzedVar2.zze = zzefVar;
                    zzedVar2.zzf = str2;
                    zzedVar2.zzg = null;
                    zzedVar2.zzd = 2;
                    obj = zzefVar.zza.zzm(zzi, str2, (long) d10, zzedVar2);
                    if (obj != aVar) {
                        zzefVar2 = zzefVar;
                        zzsr zzsrVar2 = (zzsr) obj;
                        zzefVar2.zza.zzq(str2, zzsrVar2);
                        return zzsrVar2.zzj();
                    }
                    return aVar;
                }
            }
            if (i7 != 0) {
            }
            zzsi zzsiVar2 = (zzsi) obj;
            zzdt zzdtVar22 = zzefVar.zza;
            zzscVar = zzefVar.zzc;
            if (zzscVar == null) {
            }
            zzsp zzi2 = zzdtVar22.zzi(recaptchaAction2, zzsiVar2, zzscVar);
            zzedVar2.zze = zzefVar;
            zzedVar2.zzf = str2;
            zzedVar2.zzg = null;
            zzedVar2.zzd = 2;
            obj = zzefVar.zza.zzm(zzi2, str2, (long) d10, zzedVar2);
            if (obj != aVar) {
            }
            return aVar;
        } catch (zzbd e2) {
            throw e2;
        } catch (Exception e10) {
            throw new zzbd(zzbb.zzb, zzba.zzaz, e10.getMessage());
        }
        zzedVar = new zzed(this, dVar);
        zzed zzedVar22 = zzedVar;
        obj = zzedVar22.zzb;
        aVar = a.f5345a;
        i7 = zzedVar22.zzd;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0099, code lost:
    
        if (r13 == r1) goto L37;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r12v16 */
    /* JADX WARN: Type inference failed for: r12v9, types: [com.google.android.recaptcha.internal.zzef] */
    @Override // com.google.android.recaptcha.internal.zzcn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzb(long j, d dVar) {
        zzee zzeeVar;
        int i7;
        zzci zzciVar;
        zzcj zzcjVar;
        zzci zzciVar2;
        zzck zzckVar;
        Object obj;
        double d10;
        zzef zzefVar;
        zzcj zzcjVar2;
        try {
            if (dVar instanceof zzee) {
                zzeeVar = (zzee) dVar;
                int i10 = zzeeVar.zzd;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    zzeeVar.zzd = i10 - Integer.MIN_VALUE;
                    Object obj2 = zzeeVar.zzb;
                    a aVar = a.f5345a;
                    i7 = zzeeVar.zzd;
                    q qVar = q.f3365a;
                    if (i7 != 0) {
                        c.c0(obj2);
                        zzcm zzcmVar = this.zzb;
                        zzcjVar = zzcm.zzb;
                        if (!l.a(zzcmVar, zzcjVar)) {
                            zzcm zzcmVar2 = this.zzb;
                            zzciVar2 = zzcm.zzd;
                            if (!l.a(zzcmVar2, zzciVar2)) {
                                zzckVar = zzcm.zzc;
                                this.zzb = zzckVar;
                                double d11 = j;
                                try {
                                    zzdt zzdtVar = this.zza;
                                    double d12 = 0.6d * d11;
                                    zzeeVar.zze = this;
                                    double d13 = d11 * 0.4d;
                                    zzeeVar.zza = d13;
                                    zzeeVar.zzd = 1;
                                    Object zzo = zzdtVar.zzo((long) d12, zzeeVar);
                                    if (zzo != aVar) {
                                        obj = zzo;
                                        d10 = d13;
                                        zzefVar = this;
                                    }
                                    return aVar;
                                } catch (zzbd e2) {
                                    e = e2;
                                    j = this;
                                    zzciVar = zzcm.zzd;
                                    j.zzb = zzciVar;
                                    throw e;
                                }
                            }
                        }
                        return qVar;
                    }
                    if (i7 != 1) {
                        if (i7 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        zzef zzefVar2 = zzeeVar.zze;
                        c.c0(obj2);
                        j = zzefVar2;
                        zzcjVar2 = zzcm.zzb;
                        j.zzb = zzcjVar2;
                        return qVar;
                    }
                    double d14 = zzeeVar.zza;
                    zzef zzefVar3 = zzeeVar.zze;
                    try {
                        c.c0(obj2);
                        obj = obj2;
                        d10 = d14;
                        zzefVar = zzefVar3;
                    } catch (zzbd e10) {
                        e = e10;
                        j = zzefVar3;
                        zzciVar = zzcm.zzd;
                        j.zzb = zzciVar;
                        throw e;
                    }
                    zzsc zzscVar = (zzsc) obj;
                    zzefVar.zzc = zzscVar;
                    zzeeVar.zze = zzefVar;
                    zzeeVar.zzd = 2;
                    Object zzn = zzefVar.zza.zzn(zzscVar, (long) d10, zzeeVar);
                    j = zzefVar;
                }
            }
            if (i7 != 0) {
            }
            zzsc zzscVar2 = (zzsc) obj;
            zzefVar.zzc = zzscVar2;
            zzeeVar.zze = zzefVar;
            zzeeVar.zzd = 2;
            Object zzn2 = zzefVar.zza.zzn(zzscVar2, (long) d10, zzeeVar);
            j = zzefVar;
        } catch (zzbd e11) {
            e = e11;
        }
        zzeeVar = new zzee(this, dVar);
        Object obj22 = zzeeVar.zzb;
        a aVar2 = a.f5345a;
        i7 = zzeeVar.zzd;
        q qVar2 = q.f3365a;
    }
}
