package com.google.android.recaptcha.internal;

import Db.m;
import Hb.d;
import Ib.a;
import ac.e;
import cc.F;
import com.bumptech.glide.c;
import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.android.recaptcha.RecaptchaClient;
import com.google.android.recaptcha.RecaptchaTasksClient;
import java.util.UUID;

/* loaded from: classes.dex */
public final class zzdc implements RecaptchaClient, RecaptchaTasksClient {
    private static final e zza = new e("^[a-zA-Z0-9/_]{0,100}$");
    private final zzcn zzb;
    private final String zzc;
    private final zzek zzd;
    private final zzbi zze;

    public zzdc(zzcn zzcnVar, String str, zzbi zzbiVar, zzek zzekVar) {
        this.zzb = zzcnVar;
        this.zzc = str;
        this.zze = zzbiVar;
        this.zzd = zzekVar;
    }

    public static final /* synthetic */ void zze(zzdc zzdcVar, long j, RecaptchaAction recaptchaAction) {
        zzbd zzbdVar = !zza.d(recaptchaAction.getAction()) ? new zzbd(zzbb.zzg, zzba.zzh, null) : null;
        if (j < 5000) {
            zzbdVar = new zzbd(zzbb.zzb, zzba.zzI, null);
        }
        if (zzbdVar != null) {
            throw zzbdVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzf(RecaptchaAction recaptchaAction, long j, d dVar) {
        zzcy zzcyVar;
        int i7;
        try {
            if (dVar instanceof zzcy) {
                zzcyVar = (zzcy) dVar;
                int i10 = zzcyVar.zzc;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    zzcyVar.zzc = i10 - Integer.MIN_VALUE;
                    Object obj = zzcyVar.zza;
                    Object obj2 = a.f5345a;
                    i7 = zzcyVar.zzc;
                    if (i7 != 0) {
                        c.c0(obj);
                        String uuid = UUID.randomUUID().toString();
                        Rb.e zzczVar = new zzcz(this, j, recaptchaAction, uuid, null);
                        zzcyVar.zzc = 1;
                        obj = zzg(uuid, zzczVar, zzcyVar);
                        if (obj == obj2) {
                            return obj2;
                        }
                    } else {
                        if (i7 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        c.c0(obj);
                    }
                    return ((m) obj).f3357a;
                }
            }
            if (i7 != 0) {
            }
            return ((m) obj).f3357a;
        } catch (zzbd e2) {
            return c.n(e2.zzc());
        }
        zzcyVar = new zzcy(this, dVar);
        Object obj3 = zzcyVar.zza;
        Object obj22 = a.f5345a;
        i7 = zzcyVar.zzc;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /* JADX WARN: Type inference failed for: r5v5, types: [com.google.android.recaptcha.internal.zzen] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzg(String str, Rb.e eVar, d dVar) {
        zzdb zzdbVar;
        int i7;
        try {
            if (dVar instanceof zzdb) {
                zzdbVar = (zzdb) dVar;
                int i10 = zzdbVar.zzc;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    zzdbVar.zzc = i10 - Integer.MIN_VALUE;
                    Object obj = zzdbVar.zza;
                    Object obj2 = a.f5345a;
                    i7 = zzdbVar.zzc;
                    if (i7 != 0) {
                        c.c0(obj);
                        zzek zza2 = this.zzd.zza();
                        zza2.zzc(str);
                        zzen zzf = zza2.zzf(9);
                        zzdbVar.zzd = zzf;
                        zzdbVar.zzc = 1;
                        obj = eVar.invoke(zza2, zzdbVar);
                        str = zzf;
                        if (obj == obj2) {
                            return obj2;
                        }
                    } else {
                        if (i7 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        zzen zzenVar = zzdbVar.zzd;
                        c.c0(obj);
                        str = zzenVar;
                    }
                    str.zza();
                    return obj;
                }
            }
            if (i7 != 0) {
            }
            str.zza();
            return obj;
        } catch (zzbd e2) {
            str.zzb(e2);
            throw e2;
        } catch (Exception e10) {
            zzbd zzbdVar = new zzbd(zzbb.zzb, zzba.zzX, e10.getMessage());
            str.zzb(zzbdVar);
            throw zzbdVar;
        }
        zzdbVar = new zzdb(this, dVar);
        Object obj3 = zzdbVar.zza;
        Object obj22 = a.f5345a;
        i7 = zzdbVar.zzc;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.google.android.recaptcha.RecaptchaClient
    /* renamed from: execute-0E7RQCE */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo8execute0E7RQCE(RecaptchaAction recaptchaAction, long j, d<? super m> dVar) {
        zzcw zzcwVar;
        int i7;
        if (dVar instanceof zzcw) {
            zzcwVar = (zzcw) dVar;
            int i10 = zzcwVar.zzc;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                zzcwVar.zzc = i10 - Integer.MIN_VALUE;
                Object obj = zzcwVar.zza;
                Object obj2 = a.f5345a;
                i7 = zzcwVar.zzc;
                if (i7 == 0) {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c.c0(obj);
                    return ((m) obj).f3357a;
                }
                c.c0(obj);
                zzcwVar.zzc = 1;
                Object zzf = zzf(recaptchaAction, j, zzcwVar);
                return zzf == obj2 ? obj2 : zzf;
            }
        }
        zzcwVar = new zzcw(this, dVar);
        Object obj3 = zzcwVar.zza;
        Object obj22 = a.f5345a;
        i7 = zzcwVar.zzc;
        if (i7 == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.google.android.recaptcha.RecaptchaClient
    /* renamed from: execute-gIAlu-s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo9executegIAlus(RecaptchaAction recaptchaAction, d<? super m> dVar) {
        zzcx zzcxVar;
        int i7;
        if (dVar instanceof zzcx) {
            zzcxVar = (zzcx) dVar;
            int i10 = zzcxVar.zzc;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                zzcxVar.zzc = i10 - Integer.MIN_VALUE;
                Object obj = zzcxVar.zza;
                Object obj2 = a.f5345a;
                i7 = zzcxVar.zzc;
                if (i7 == 0) {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c.c0(obj);
                    return ((m) obj).f3357a;
                }
                c.c0(obj);
                zzcxVar.zzc = 1;
                Object mo8execute0E7RQCE = mo8execute0E7RQCE(recaptchaAction, 10000L, zzcxVar);
                return mo8execute0E7RQCE == obj2 ? obj2 : mo8execute0E7RQCE;
            }
        }
        zzcxVar = new zzcx(this, dVar);
        Object obj3 = zzcxVar.zza;
        Object obj22 = a.f5345a;
        i7 = zzcxVar.zzc;
        if (i7 == 0) {
        }
    }

    @Override // com.google.android.recaptcha.RecaptchaTasksClient
    public final Task<String> executeTask(RecaptchaAction recaptchaAction) {
        return zzas.zza(F.e(this.zze.zzb(), null, new zzda(this, recaptchaAction, 10000L, null), 3));
    }

    @Override // com.google.android.recaptcha.RecaptchaTasksClient
    public final Task<String> executeTask(RecaptchaAction recaptchaAction, long j) {
        return zzas.zza(F.e(this.zze.zzb(), null, new zzda(this, recaptchaAction, j, null), 3));
    }

    public final String zzd() {
        return this.zzc;
    }
}
