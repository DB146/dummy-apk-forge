package com.google.android.recaptcha.internal;

import Db.q;
import Hb.d;
import Ib.a;
import Rb.c;
import cc.C0953t;
import cc.F;
import cc.InterfaceC0952s;
import com.google.android.recaptcha.RecaptchaAction;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public final class zzec implements zzcn {
    private final zzdt zza;
    private final zzek zzb;
    private InterfaceC0952s zzc = F.a();
    private zzbd zzd;
    private zzsc zze;
    private zzcm zzf;
    private final zzbi zzg;

    public zzec(zzdt zzdtVar, zzbi zzbiVar, zzek zzekVar, zzbo zzboVar) {
        zzcl zzclVar;
        this.zza = zzdtVar;
        this.zzg = zzbiVar;
        this.zzb = zzekVar;
        zzclVar = zzcm.zza;
        this.zzf = zzclVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzl(c cVar, d dVar) {
        zzdv zzdvVar;
        int i7;
        zzbn zzbnVar;
        if (dVar instanceof zzdv) {
            zzdvVar = (zzdv) dVar;
            int i10 = zzdvVar.zzc;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                zzdvVar.zzc = i10 - Integer.MIN_VALUE;
                Object obj = zzdvVar.zza;
                Object obj2 = a.f5345a;
                i7 = zzdvVar.zzc;
                if (i7 != 0) {
                    com.bumptech.glide.c.c0(obj);
                    zzbn zzbnVar2 = new zzbn();
                    zzdvVar.zzd = zzbnVar2;
                    zzdvVar.zzc = 1;
                    if (cVar.invoke(zzdvVar) == obj2) {
                        return obj2;
                    }
                    zzbnVar = zzbnVar2;
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zzbnVar = zzdvVar.zzd;
                    com.bumptech.glide.c.c0(obj);
                }
                zzbnVar.zzc();
                return new Long(zzbnVar.zza(TimeUnit.MILLISECONDS));
            }
        }
        zzdvVar = new zzdv(this, dVar);
        Object obj3 = zzdvVar.zza;
        Object obj22 = a.f5345a;
        i7 = zzdvVar.zzc;
        if (i7 != 0) {
        }
        zzbnVar.zzc();
        return new Long(zzbnVar.zza(TimeUnit.MILLISECONDS));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0076 A[Catch: Exception -> 0x002f, TRY_ENTER, TryCatch #1 {Exception -> 0x002f, blocks: (B:12:0x002b, B:13:0x0063, B:19:0x0076, B:20:0x007f), top: B:11:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzm(long j, d dVar) {
        zzdw zzdwVar;
        Object obj;
        a aVar;
        int i7;
        zzec zzecVar;
        zzec zzecVar2;
        zzbd zzbdVar;
        zzcm zzcmVar;
        zzci zzciVar;
        zzbd zzbdVar2;
        zzck zzckVar;
        long longValue;
        try {
            if (dVar instanceof zzdw) {
                zzdwVar = (zzdw) dVar;
                int i10 = zzdwVar.zzd;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    zzdwVar.zzd = i10 - Integer.MIN_VALUE;
                    obj = zzdwVar.zzb;
                    aVar = a.f5345a;
                    i7 = zzdwVar.zzd;
                    if (i7 != 0) {
                        com.bumptech.glide.c.c0(obj);
                        zzdwVar.zze = this;
                        zzdwVar.zza = j;
                        zzdwVar.zzd = 1;
                        if (zzn(j, zzdwVar) != aVar) {
                            zzecVar = this;
                        }
                        return aVar;
                    }
                    if (i7 == 1) {
                        j = zzdwVar.zza;
                        zzecVar = zzdwVar.zze;
                        com.bumptech.glide.c.c0(obj);
                    } else {
                        if (i7 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        j = zzdwVar.zza;
                        zzecVar2 = zzdwVar.zze;
                        try {
                            com.bumptech.glide.c.c0(obj);
                            longValue = j - ((Number) obj).longValue();
                            if (longValue < 500) {
                                return new Long(longValue);
                            }
                            throw new zzbd(zzbb.zzc, zzba.zzar, null);
                        } catch (Exception e2) {
                            e = e2;
                            if (e instanceof zzbd) {
                            }
                            if (zzbdVar == null) {
                            }
                            zzcmVar = zzecVar2.zzf;
                            zzciVar = zzcm.zzd;
                            if (!l.a(zzcmVar, zzciVar)) {
                            }
                            zzbdVar2 = zzecVar2.zzd;
                            if (zzbdVar2 == null) {
                            }
                        }
                    }
                    zzdy zzdyVar = new zzdy(j, zzecVar, null);
                    zzdwVar.zze = zzecVar;
                    zzdwVar.zza = j;
                    zzdwVar.zzd = 2;
                    obj = zzecVar.zzl(zzdyVar, zzdwVar);
                    if (obj != aVar) {
                        zzecVar2 = zzecVar;
                        longValue = j - ((Number) obj).longValue();
                        if (longValue < 500) {
                        }
                    }
                    return aVar;
                }
            }
            zzdy zzdyVar2 = new zzdy(j, zzecVar, null);
            zzdwVar.zze = zzecVar;
            zzdwVar.zza = j;
            zzdwVar.zzd = 2;
            obj = zzecVar.zzl(zzdyVar2, zzdwVar);
            if (obj != aVar) {
            }
            return aVar;
        } catch (Exception e10) {
            e = e10;
            zzecVar2 = zzecVar;
            zzbdVar = e instanceof zzbd ? (zzbd) e : null;
            if (zzbdVar == null) {
                zzbdVar = new zzbd(zzbb.zzc, zzba.zzar, e.getMessage());
            }
            zzcmVar = zzecVar2.zzf;
            zzciVar = zzcm.zzd;
            if (!l.a(zzcmVar, zzciVar)) {
                zzcm zzcmVar2 = zzecVar2.zzf;
                zzckVar = zzcm.zzc;
                if (!l.a(zzcmVar2, zzckVar)) {
                    throw zzbdVar;
                }
            }
            zzbdVar2 = zzecVar2.zzd;
            if (zzbdVar2 == null) {
                throw zzbdVar2;
            }
            throw zzbdVar;
        }
        zzdwVar = new zzdw(this, dVar);
        obj = zzdwVar.zzb;
        aVar = a.f5345a;
        i7 = zzdwVar.zzd;
        if (i7 != 0) {
        }
    }

    private final Object zzn(long j, d dVar) {
        zzcj zzcjVar;
        zzck zzckVar;
        zzci zzciVar;
        zzck zzckVar2;
        zzcm zzcmVar = this.zzf;
        zzcjVar = zzcm.zzb;
        boolean a9 = l.a(zzcmVar, zzcjVar);
        q qVar = q.f3365a;
        if (!a9) {
            zzcm zzcmVar2 = this.zzf;
            zzckVar = zzcm.zzc;
            if (!l.a(zzcmVar2, zzckVar)) {
                zzcm zzcmVar3 = this.zzf;
                zzciVar = zzcm.zzd;
                if (l.a(zzcmVar3, zzciVar) && !zzo(this.zzd)) {
                    return qVar;
                }
                zzckVar2 = zzcm.zzc;
                this.zzf = zzckVar2;
                C0953t a10 = F.a();
                this.zzc = a10;
                F.B(this.zzg.zza(), null, 0, new zzeb(this, a10, j, null), 3);
            }
        }
        return qVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean zzo(Exception exc) {
        if (!(exc instanceof zzbd)) {
            return true;
        }
        zzbd zzbdVar = (zzbd) exc;
        return (l.a(zzbdVar.zzb(), zzbb.zzd) || l.a(zzbdVar.zzb(), zzbb.zze) || l.a(zzbdVar.zzb(), zzbb.zzf)) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0061  */
    @Override // com.google.android.recaptcha.internal.zzcn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zza(String str, RecaptchaAction recaptchaAction, long j, d dVar) {
        zzdu zzduVar;
        a aVar;
        int i7;
        String str2;
        RecaptchaAction recaptchaAction2;
        Object zzm;
        zzec zzecVar;
        Object zzl;
        String str3;
        zzec zzecVar2;
        double d10;
        zzsc zzscVar;
        String str4;
        zzec zzecVar3;
        try {
            if (dVar instanceof zzdu) {
                zzduVar = (zzdu) dVar;
                int i10 = zzduVar.zzd;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    zzduVar.zzd = i10 - Integer.MIN_VALUE;
                    zzdu zzduVar2 = zzduVar;
                    Object obj = zzduVar2.zzb;
                    aVar = a.f5345a;
                    i7 = zzduVar2.zzd;
                    if (i7 != 0) {
                        com.bumptech.glide.c.c0(obj);
                        zzduVar2.zze = this;
                        str2 = str;
                        zzduVar2.zzf = str2;
                        recaptchaAction2 = recaptchaAction;
                        zzduVar2.zzg = recaptchaAction2;
                        zzduVar2.zzd = 1;
                        zzm = zzm(j, zzduVar2);
                        if (zzm == aVar) {
                            return aVar;
                        }
                        zzecVar = this;
                    } else {
                        if (i7 != 1) {
                            if (i7 != 2) {
                                if (i7 != 3) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                str4 = zzduVar2.zzf;
                                zzecVar3 = zzduVar2.zze;
                                com.bumptech.glide.c.c0(obj);
                                zzsr zzsrVar = (zzsr) obj;
                                zzecVar3.zza.zzq(str4, zzsrVar);
                                return zzsrVar.zzj();
                            }
                            d10 = zzduVar2.zza;
                            recaptchaAction2 = zzduVar2.zzg;
                            String str5 = zzduVar2.zzf;
                            zzec zzecVar4 = zzduVar2.zze;
                            com.bumptech.glide.c.c0(obj);
                            zzecVar2 = zzecVar4;
                            str3 = str5;
                            zzsi zzsiVar = (zzsi) obj;
                            zzdt zzdtVar = zzecVar2.zza;
                            zzscVar = zzecVar2.zze;
                            if (zzscVar == null) {
                                zzscVar = null;
                            }
                            zzsp zzi = zzdtVar.zzi(recaptchaAction2, zzsiVar, zzscVar);
                            zzduVar2.zze = zzecVar2;
                            zzduVar2.zzf = str3;
                            zzduVar2.zzg = null;
                            zzduVar2.zzd = 3;
                            obj = zzecVar2.zza.zzm(zzi, str3, (long) d10, zzduVar2);
                            if (obj != aVar) {
                                str4 = str3;
                                zzecVar3 = zzecVar2;
                                zzsr zzsrVar2 = (zzsr) obj;
                                zzecVar3.zza.zzq(str4, zzsrVar2);
                                return zzsrVar2.zzj();
                            }
                            return aVar;
                        }
                        recaptchaAction2 = zzduVar2.zzg;
                        String str6 = zzduVar2.zzf;
                        zzecVar = zzduVar2.zze;
                        com.bumptech.glide.c.c0(obj);
                        zzm = obj;
                        str2 = str6;
                    }
                    double longValue = ((Number) zzm).longValue();
                    zzdt zzdtVar2 = zzecVar.zza;
                    double d11 = 0.45d * longValue;
                    zzduVar2.zze = zzecVar;
                    zzduVar2.zzf = str2;
                    zzduVar2.zzg = recaptchaAction2;
                    double d12 = longValue * 0.55d;
                    zzduVar2.zza = d12;
                    zzduVar2.zzd = 2;
                    zzl = zzdtVar2.zzl(str2, (long) d11, zzduVar2);
                    if (zzl != aVar) {
                        str3 = str2;
                        obj = zzl;
                        zzecVar2 = zzecVar;
                        d10 = d12;
                        zzsi zzsiVar2 = (zzsi) obj;
                        zzdt zzdtVar3 = zzecVar2.zza;
                        zzscVar = zzecVar2.zze;
                        if (zzscVar == null) {
                        }
                        zzsp zzi2 = zzdtVar3.zzi(recaptchaAction2, zzsiVar2, zzscVar);
                        zzduVar2.zze = zzecVar2;
                        zzduVar2.zzf = str3;
                        zzduVar2.zzg = null;
                        zzduVar2.zzd = 3;
                        obj = zzecVar2.zza.zzm(zzi2, str3, (long) d10, zzduVar2);
                        if (obj != aVar) {
                        }
                    }
                    return aVar;
                }
            }
            if (i7 != 0) {
            }
            double longValue2 = ((Number) zzm).longValue();
            zzdt zzdtVar22 = zzecVar.zza;
            double d112 = 0.45d * longValue2;
            zzduVar2.zze = zzecVar;
            zzduVar2.zzf = str2;
            zzduVar2.zzg = recaptchaAction2;
            double d122 = longValue2 * 0.55d;
            zzduVar2.zza = d122;
            zzduVar2.zzd = 2;
            zzl = zzdtVar22.zzl(str2, (long) d112, zzduVar2);
            if (zzl != aVar) {
            }
            return aVar;
        } catch (zzbd e2) {
            throw e2;
        } catch (Exception e10) {
            throw new zzbd(zzbb.zzb, zzba.zzay, e10.getMessage());
        }
        zzduVar = new zzdu(this, dVar);
        zzdu zzduVar22 = zzduVar;
        Object obj2 = zzduVar22.zzb;
        aVar = a.f5345a;
        i7 = zzduVar22.zzd;
    }

    @Override // com.google.android.recaptcha.internal.zzcn
    public final Object zzb(long j, d dVar) {
        Object zzn = zzn(j, dVar);
        return zzn == a.f5345a ? zzn : q.f3365a;
    }
}
