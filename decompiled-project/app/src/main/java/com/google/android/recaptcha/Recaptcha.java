package com.google.android.recaptcha;

import Db.a;
import Db.m;
import Hb.d;
import android.app.Application;
import com.bumptech.glide.c;
import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.internal.zzcq;
import com.google.android.recaptcha.internal.zzdc;

/* loaded from: classes.dex */
public final class Recaptcha {
    public static final Recaptcha INSTANCE = new Recaptcha();

    private Recaptcha() {
    }

    public static final Task<RecaptchaTasksClient> fetchTaskClient(Application application, String str) {
        return zzcq.zze(application, str);
    }

    /* renamed from: getClient-BWLJW6A$default, reason: not valid java name */
    public static /* synthetic */ Object m6getClientBWLJW6A$default(Recaptcha recaptcha, Application application, String str, long j, d dVar, int i7, Object obj) {
        if ((i7 & 4) != 0) {
            j = 10000;
        }
        return recaptcha.m7getClientBWLJW6A(application, str, j, dVar);
    }

    @a
    public static final Task<RecaptchaTasksClient> getTasksClient(Application application, String str) {
        return zzcq.zzc(application, str, 10000L);
    }

    @a
    public static final Task<RecaptchaTasksClient> getTasksClient(Application application, String str, long j) {
        return zzcq.zzc(application, str, j);
    }

    public final Object fetchClient(Application application, String str, d<? super RecaptchaClient> dVar) {
        return zzcq.zzd(application, str, dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    @a
    /* renamed from: getClient-BWLJW6A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m7getClientBWLJW6A(Application application, String str, long j, d<? super m> dVar) {
        Recaptcha$getClient$1 recaptcha$getClient$1;
        int i7;
        try {
            if (dVar instanceof Recaptcha$getClient$1) {
                recaptcha$getClient$1 = (Recaptcha$getClient$1) dVar;
                int i10 = recaptcha$getClient$1.zzc;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    recaptcha$getClient$1.zzc = i10 - Integer.MIN_VALUE;
                    Object obj = recaptcha$getClient$1.zza;
                    Ib.a aVar = Ib.a.f5345a;
                    i7 = recaptcha$getClient$1.zzc;
                    if (i7 != 0) {
                        c.c0(obj);
                        recaptcha$getClient$1.zzc = 1;
                        obj = zzcq.zzb(application, str, j, recaptcha$getClient$1);
                        if (obj == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i7 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        c.c0(obj);
                    }
                    return (zzdc) obj;
                }
            }
            if (i7 != 0) {
            }
            return (zzdc) obj;
        } catch (Throwable th) {
            return c.n(th);
        }
        recaptcha$getClient$1 = new Recaptcha$getClient$1(this, dVar);
        Object obj2 = recaptcha$getClient$1.zza;
        Ib.a aVar2 = Ib.a.f5345a;
        i7 = recaptcha$getClient$1.zzc;
    }
}
