package com.google.android.gms.internal.pal;

import android.content.Context;
import android.os.Handler;
import android.util.Log;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import u5.C2110b;
import u5.InterfaceC2109a;

/* loaded from: classes.dex */
public final class zzay extends zzbg {
    private final InterfaceC2109a zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzay(Handler handler, ExecutorService executorService, Context context) {
        super(handler, executorService, zzagc.zzb(2L));
        InterfaceC2109a zzf = zzf(context);
        this.zza = zzf;
    }

    private static InterfaceC2109a zzf(Context context) {
        try {
            return new com.google.android.gms.internal.appset.zzr(context);
        } catch (NoClassDefFoundError | NoSuchMethodError e2) {
            Log.e("NonceGenerator", "Failed to contact the App Set SDK.", e2);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.pal.zzbg
    public final zzil zza() {
        InterfaceC2109a interfaceC2109a = this.zza;
        if (interfaceC2109a == null) {
            return zzil.zze();
        }
        try {
            return zzil.zzf((C2110b) Tasks.await(interfaceC2109a.getAppSetIdInfo(), com.google.ads.interactivemedia.pal.zzat.zzd.zzd(), TimeUnit.MILLISECONDS));
        } catch (InterruptedException | NoClassDefFoundError | NoSuchMethodError | ExecutionException | TimeoutException e2) {
            Log.e("NonceGenerator", "Failed to get the App Set ID.", e2);
            return zzil.zze();
        }
    }
}
