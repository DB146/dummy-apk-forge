package com.google.android.gms.internal.pal;

import F5.d;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import com.google.android.gms.common.api.internal.AbstractC0982x;
import com.google.android.gms.common.api.internal.C0981w;
import com.google.android.gms.common.api.internal.InterfaceC0978t;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public final class zzbh extends zzbg {
    private final zzgx zza;
    private final com.google.ads.interactivemedia.pal.zzx zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbh(Handler handler, ExecutorService executorService, Context context, com.google.ads.interactivemedia.pal.zzx zzxVar) {
        super(handler, executorService, zzagc.zzb(2L));
        zzhc zzhcVar = new zzhc(context);
        this.zza = zzhcVar;
        this.zzb = zzxVar;
    }

    @Override // com.google.android.gms.internal.pal.zzbg
    public final zzil zza() {
        final Bundle bundle = new Bundle();
        try {
            zzgx zzgxVar = this.zza;
            C0981w builder = AbstractC0982x.builder();
            builder.f15004b = false;
            builder.f15005c = new d[]{zzie.zza};
            final zzhc zzhcVar = (zzhc) zzgxVar;
            builder.f15003a = new InterfaceC0978t() { // from class: com.google.android.gms.internal.pal.zzgz
                @Override // com.google.android.gms.common.api.internal.InterfaceC0978t
                public final void accept(Object obj, Object obj2) {
                    zzhc zzhcVar2 = zzhc.this;
                    ((zzgw) ((zzhd) obj).getService()).zze(bundle, new zzhb(zzhcVar2, (TaskCompletionSource) obj2));
                }
            };
            return zzil.zzf((String) Tasks.await(((zzhc) zzgxVar).doRead(builder.a()), 5L, TimeUnit.SECONDS));
        } catch (InterruptedException | TimeoutException unused) {
            this.zzb.zza(2);
            return zzil.zze();
        } catch (ExecutionException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof zzgy) {
                Log.d("NonceGenerator", "SignalSdk Error code: " + ((zzgy) cause).zza());
                this.zzb.zza(3);
            }
            return zzil.zze();
        }
    }
}
