package com.google.android.gms.internal.auth;

import B5.a;
import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.api.internal.AbstractC0982x;
import com.google.android.gms.common.api.internal.C0981w;
import com.google.android.gms.common.api.internal.InterfaceC0978t;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.api.l;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import x5.b;
import x5.c;

/* loaded from: classes.dex */
public final class zzbo extends l {
    public zzbo(Activity activity, c cVar) {
        super(activity, activity, b.f26220a, cVar == null ? c.f26221b : cVar, k.f15009c);
    }

    public zzbo(Context context, c cVar) {
        super(context, null, b.f26220a, cVar == null ? c.f26221b : cVar, k.f15009c);
    }

    public final Task<String> getSpatulaHeader() {
        C0981w builder = AbstractC0982x.builder();
        builder.f15003a = new InterfaceC0978t() { // from class: com.google.android.gms.internal.auth.zzbk
            @Override // com.google.android.gms.common.api.internal.InterfaceC0978t
            public final void accept(Object obj, Object obj2) {
                ((zzbh) ((zzbe) obj).getService()).zzd(new zzbn(zzbo.this, (TaskCompletionSource) obj2));
            }
        };
        builder.f15006d = 1520;
        return doRead(builder.a());
    }

    public final Task<B5.b> performProxyRequest(final a aVar) {
        C0981w builder = AbstractC0982x.builder();
        builder.f15003a = new InterfaceC0978t() { // from class: com.google.android.gms.internal.auth.zzbl
            @Override // com.google.android.gms.common.api.internal.InterfaceC0978t
            public final void accept(Object obj, Object obj2) {
                zzbo zzboVar = zzbo.this;
                a aVar2 = aVar;
                ((zzbh) ((zzbe) obj).getService()).zze(new zzbm(zzboVar, (TaskCompletionSource) obj2), aVar2);
            }
        };
        builder.f15006d = 1518;
        return doWrite(builder.a());
    }
}
