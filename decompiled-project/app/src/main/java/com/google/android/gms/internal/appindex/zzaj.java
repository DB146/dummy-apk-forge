package com.google.android.gms.internal.appindex;

import android.content.Context;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class zzaj {
    public static final /* synthetic */ int zza = 0;
    private static volatile zzai zzc = null;
    private static volatile boolean zzd = false;
    private static final Object zzb = new Object();
    private static final AtomicReference zze = new AtomicReference();
    private static final zzal zzf = new zzal(new Object() { // from class: com.google.android.gms.internal.appindex.zzah
    }, null);
    private static final AtomicInteger zzg = new AtomicInteger();

    /* JADX WARN: Code restructure failed: missing block: B:28:0x003f, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0044, code lost:
    
        throw r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void zza(final Context context) {
        if (zzc == null) {
            Object obj = zzb;
            synchronized (obj) {
                try {
                    if (zzc == null) {
                        synchronized (obj) {
                            zzai zzaiVar = zzc;
                            Context applicationContext = context.getApplicationContext();
                            if (applicationContext != null) {
                                context = applicationContext;
                            }
                            if (zzaiVar != null) {
                                if (zzaiVar.zza() != context) {
                                }
                            }
                            zzaf.zza();
                            zzak.zza();
                            zzc = new zzae(context, zzas.zza(new zzaq() { // from class: com.google.android.gms.internal.appindex.zzag
                            }));
                            zzg.incrementAndGet();
                        }
                    }
                } finally {
                }
            }
        }
    }
}
