package com.google.android.gms.internal.appset;

import F5.d;
import F5.f;
import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.internal.AbstractC0982x;
import com.google.android.gms.common.api.internal.C0981w;
import com.google.android.gms.common.api.internal.InterfaceC0978t;
import com.google.android.gms.common.api.j;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.api.l;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import u5.AbstractC2113e;
import u5.C2110b;
import u5.C2111c;
import u5.InterfaceC2109a;

/* loaded from: classes.dex */
public final class zzp extends l implements InterfaceC2109a {
    private static final h zza;
    private static final a zzb;
    private static final i zzc;
    private final Context zzd;
    private final f zze;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.common.api.h, java.lang.Object] */
    static {
        ?? obj = new Object();
        zza = obj;
        zzn zznVar = new zzn();
        zzb = zznVar;
        zzc = new i("AppSet.API", zznVar, obj);
    }

    public zzp(Context context, f fVar) {
        super(context, null, zzc, e.f14901q, k.f15009c);
        this.zzd = context;
        this.zze = fVar;
    }

    @Override // u5.InterfaceC2109a
    public final Task<C2110b> getAppSetIdInfo() {
        if (this.zze.d(this.zzd, 212800000) != 0) {
            return Tasks.forException(new j(new Status(17, null, null, null)));
        }
        C0981w builder = AbstractC0982x.builder();
        builder.f15005c = new d[]{AbstractC2113e.f24875a};
        builder.f15003a = new InterfaceC0978t() { // from class: com.google.android.gms.internal.appset.zzm
            @Override // com.google.android.gms.common.api.internal.InterfaceC0978t
            public final void accept(Object obj, Object obj2) {
                ((zzg) ((zzd) obj).getService()).zzc(new C2111c(null, null), new zzo(zzp.this, (TaskCompletionSource) obj2));
            }
        };
        builder.f15004b = false;
        builder.f15006d = 27601;
        return doRead(builder.a());
    }
}
