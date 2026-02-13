package com.google.ads.interactivemedia.v3.internal;

import android.os.Handler;

/* loaded from: classes.dex */
final class zzcw implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        Handler handler;
        Handler handler2;
        Runnable runnable;
        Handler handler3;
        Runnable runnable2;
        handler = zzcz.zzc;
        if (handler != null) {
            handler2 = zzcz.zzc;
            runnable = zzcz.zzd;
            handler2.post(runnable);
            handler3 = zzcz.zzc;
            runnable2 = zzcz.zze;
            handler3.postDelayed(runnable2, 200L);
        }
    }
}
