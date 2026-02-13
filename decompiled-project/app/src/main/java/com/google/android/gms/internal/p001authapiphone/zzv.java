package com.google.android.gms.internal.p001authapiphone;

import F5.d;
import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.internal.AbstractC0982x;
import com.google.android.gms.common.api.internal.C0981w;
import com.google.android.gms.common.api.internal.InterfaceC0978t;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.api.l;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes.dex */
public final class zzv extends l {
    private static final h zza;
    private static final a zzb;
    private static final i zzc;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.common.api.h, java.lang.Object] */
    static {
        ?? obj = new Object();
        zza = obj;
        zzt zztVar = new zzt();
        zzb = zztVar;
        zzc = new i("SmsCodeBrowser.API", zztVar, obj);
    }

    public zzv(Activity activity) {
        super(activity, activity, zzc, e.f14901q, k.f15009c);
    }

    public zzv(Context context) {
        super(context, null, zzc, e.f14901q, k.f15009c);
    }

    public final Task<Void> startSmsCodeRetriever() {
        C0981w builder = AbstractC0982x.builder();
        builder.f15005c = new d[]{zzac.zzb};
        builder.f15003a = new InterfaceC0978t() { // from class: com.google.android.gms.internal.auth-api-phone.zzs
            @Override // com.google.android.gms.common.api.internal.InterfaceC0978t
            public final void accept(Object obj, Object obj2) {
                ((zzh) ((zzw) obj).getService()).zzf(new zzu(zzv.this, (TaskCompletionSource) obj2));
            }
        };
        builder.f15006d = 1566;
        return doWrite(builder.a());
    }
}
