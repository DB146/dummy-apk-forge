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
import com.google.android.gms.common.internal.G;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes.dex */
public final class zzr extends l {
    private static final h zza;
    private static final a zzb;
    private static final i zzc;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.common.api.h, java.lang.Object] */
    static {
        ?? obj = new Object();
        zza = obj;
        zzn zznVar = new zzn();
        zzb = zznVar;
        zzc = new i("SmsCodeAutofill.API", zznVar, obj);
    }

    public zzr(Activity activity) {
        super(activity, activity, zzc, e.f14901q, k.f15009c);
    }

    public zzr(Context context) {
        super(context, null, zzc, e.f14901q, k.f15009c);
    }

    public final Task<Integer> checkPermissionState() {
        C0981w builder = AbstractC0982x.builder();
        builder.f15005c = new d[]{zzac.zza};
        builder.f15003a = new InterfaceC0978t() { // from class: com.google.android.gms.internal.auth-api-phone.zzk
            @Override // com.google.android.gms.common.api.internal.InterfaceC0978t
            public final void accept(Object obj, Object obj2) {
                ((zzh) ((zzw) obj).getService()).zzc(new zzp(zzr.this, (TaskCompletionSource) obj2));
            }
        };
        builder.f15006d = 1564;
        return doRead(builder.a());
    }

    public final Task<Boolean> hasOngoingSmsRequest(final String str) {
        G.g(str);
        G.a("The package name cannot be empty.", !str.isEmpty());
        C0981w builder = AbstractC0982x.builder();
        builder.f15005c = new d[]{zzac.zza};
        builder.f15003a = new InterfaceC0978t() { // from class: com.google.android.gms.internal.auth-api-phone.zzl
            @Override // com.google.android.gms.common.api.internal.InterfaceC0978t
            public final void accept(Object obj, Object obj2) {
                ((zzh) ((zzw) obj).getService()).zzd(str, new zzq(zzr.this, (TaskCompletionSource) obj2));
            }
        };
        builder.f15006d = 1565;
        return doRead(builder.a());
    }

    public final Task<Void> startSmsCodeRetriever() {
        C0981w builder = AbstractC0982x.builder();
        builder.f15005c = new d[]{zzac.zza};
        builder.f15003a = new InterfaceC0978t() { // from class: com.google.android.gms.internal.auth-api-phone.zzm
            @Override // com.google.android.gms.common.api.internal.InterfaceC0978t
            public final void accept(Object obj, Object obj2) {
                ((zzh) ((zzw) obj).getService()).zze(new zzo(zzr.this, (TaskCompletionSource) obj2));
            }
        };
        builder.f15006d = 1563;
        return doWrite(builder.a());
    }
}
