package com.google.android.gms.internal.p001authapiphone;

import A5.a;
import F5.d;
import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.api.internal.AbstractC0982x;
import com.google.android.gms.common.api.internal.C0981w;
import com.google.android.gms.common.api.internal.InterfaceC0978t;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes.dex */
public final class zzab extends a {
    public zzab(Activity activity) {
        super(activity);
    }

    public zzab(Context context) {
        super(context);
    }

    public final Task<Void> startSmsRetriever() {
        C0981w builder = AbstractC0982x.builder();
        builder.f15003a = new InterfaceC0978t() { // from class: com.google.android.gms.internal.auth-api-phone.zzx
            @Override // com.google.android.gms.common.api.internal.InterfaceC0978t
            public final void accept(Object obj, Object obj2) {
                ((zzh) ((zzw) obj).getService()).zzg(new zzz(zzab.this, (TaskCompletionSource) obj2));
            }
        };
        builder.f15005c = new d[]{zzac.zzc};
        builder.f15006d = 1567;
        return doWrite(builder.a());
    }

    public final Task<Void> startSmsUserConsent(final String str) {
        C0981w builder = AbstractC0982x.builder();
        builder.f15003a = new InterfaceC0978t() { // from class: com.google.android.gms.internal.auth-api-phone.zzy
            @Override // com.google.android.gms.common.api.internal.InterfaceC0978t
            public final void accept(Object obj, Object obj2) {
                ((zzh) ((zzw) obj).getService()).zzh(str, new zzaa(zzab.this, (TaskCompletionSource) obj2));
            }
        };
        builder.f15005c = new d[]{zzac.zzd};
        builder.f15006d = 1568;
        return doWrite(builder.a());
    }
}
