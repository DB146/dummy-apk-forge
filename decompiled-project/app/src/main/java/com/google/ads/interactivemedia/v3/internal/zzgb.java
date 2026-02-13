package com.google.ads.interactivemedia.v3.internal;

import F5.d;
import android.content.Context;
import com.google.ads.interactivemedia.v3.impl.data.NetworkRequestData;
import com.google.android.gms.common.api.internal.AbstractC0982x;
import com.google.android.gms.common.api.internal.C0981w;
import com.google.android.gms.common.api.internal.InterfaceC0978t;
import com.google.android.gms.common.api.j;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
final class zzgb implements zzga {
    private final zzok zza;
    private final com.google.ads.interactivemedia.v3.impl.data.zzbc zzb;

    public zzgb(Context context, com.google.ads.interactivemedia.v3.impl.data.zzbc zzbcVar) {
        this.zza = new zzor(context);
        this.zzb = zzbcVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzga
    public final com.google.ads.interactivemedia.v3.impl.data.zzbj zza(NetworkRequestData networkRequestData) {
        Task doRead;
        try {
            final int i7 = networkRequestData.requestType() == NetworkRequestData.RequestType.GET ? 0 : 1;
            zzok zzokVar = this.zza;
            final String url = networkRequestData.url();
            final String content = networkRequestData.content();
            if (this.zzb.isLimitedAdTracking()) {
                doRead = Tasks.forException(new zzol(8));
            } else {
                C0981w builder = AbstractC0982x.builder();
                builder.f15005c = new d[]{zzqt.zzb};
                builder.f15004b = false;
                final zzor zzorVar = (zzor) zzokVar;
                builder.f15003a = new InterfaceC0978t() { // from class: com.google.ads.interactivemedia.v3.internal.zzom
                    @Override // com.google.android.gms.common.api.internal.InterfaceC0978t
                    public final void accept(Object obj, Object obj2) {
                        zzor zzorVar2 = zzor.this;
                        String str = url;
                        int i10 = i7;
                        String str2 = content;
                        ((zzof) ((zzos) obj).getService()).zze(new zzog(str, i10, str2), new zzoq(zzorVar2, (TaskCompletionSource) obj2));
                    }
                };
                doRead = ((zzor) zzokVar).doRead(builder.a());
            }
            return com.google.ads.interactivemedia.v3.impl.data.zzbj.forResponse(networkRequestData.id(), (String) Tasks.await(doRead, networkRequestData.connectionTimeoutMs() + networkRequestData.readTimeoutMs(), TimeUnit.MILLISECONDS));
        } catch (InterruptedException | TimeoutException unused) {
            return com.google.ads.interactivemedia.v3.impl.data.zzbj.forError(networkRequestData.id(), 101);
        } catch (ExecutionException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof zzol) {
                return com.google.ads.interactivemedia.v3.impl.data.zzbj.forError(networkRequestData.id(), ((zzol) cause).zza());
            }
            return cause instanceof j ? com.google.ads.interactivemedia.v3.impl.data.zzbj.forError(networkRequestData.id(), 102) : com.google.ads.interactivemedia.v3.impl.data.zzbj.forError(networkRequestData.id(), 100);
        }
    }
}
