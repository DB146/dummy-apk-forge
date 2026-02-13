package com.google.ads.interactivemedia.v3.internal;

import F5.d;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.api.internal.AbstractC0982x;
import com.google.android.gms.common.api.internal.C0981w;
import com.google.android.gms.common.api.internal.InterfaceC0978t;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public final class zzgp {
    private final zzok zza;
    private final zzhc zzb;
    private final int zzc;

    public zzgp(Context context, int i7, zzhc zzhcVar) {
        this.zza = new zzor(context);
        this.zzb = zzhcVar;
        this.zzc = i7;
    }

    public final String zza() {
        if (this.zzc <= 0) {
            zzhd.zzc("AdsIdentityTokenLoader: invalid parameter for gksTimeoutMs");
            return "";
        }
        try {
            final Bundle bundle = new Bundle();
            zzok zzokVar = this.zza;
            C0981w builder = AbstractC0982x.builder();
            builder.f15004b = false;
            builder.f15005c = new d[]{zzqt.zza};
            final zzor zzorVar = (zzor) zzokVar;
            builder.f15003a = new InterfaceC0978t() { // from class: com.google.ads.interactivemedia.v3.internal.zzon
                @Override // com.google.android.gms.common.api.internal.InterfaceC0978t
                public final void accept(Object obj, Object obj2) {
                    zzor zzorVar2 = zzor.this;
                    ((zzof) ((zzos) obj).getService()).zzf(bundle, new zzop(zzorVar2, (TaskCompletionSource) obj2));
                }
            };
            return (String) Tasks.await(((zzor) zzokVar).doRead(builder.a()), this.zzc, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e2) {
            this.zzb.zzb(com.google.ads.interactivemedia.v3.impl.data.zzbe.ADS_IDENTITY_TOKEN_LOADER, com.google.ads.interactivemedia.v3.impl.data.zzbf.GET_ADSIDENTITY_TOKEN, e2);
            return "";
        }
    }
}
