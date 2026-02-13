package com.google.android.gms.internal.auth;

import android.content.Context;
import android.net.Uri;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public abstract class zzdc {
    public static final /* synthetic */ int zzd = 0;
    private static volatile zzda zze = null;
    private static volatile boolean zzf = false;
    final zzcz zzb;
    final String zzc;
    private final Object zzj;
    private volatile int zzk = -1;
    private volatile Object zzl;
    private static final Object zza = new Object();
    private static final AtomicReference zzg = new AtomicReference();
    private static final zzde zzh = new zzde(new Object() { // from class: com.google.android.gms.internal.auth.zzcu
    });
    private static final AtomicInteger zzi = new AtomicInteger();

    public /* synthetic */ zzdc(zzcz zzczVar, String str, Object obj, boolean z8, zzdb zzdbVar) {
        if (zzczVar.zza == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        }
        this.zzb = zzczVar;
        this.zzc = str;
        this.zzj = obj;
    }

    public static void zzc() {
        zzi.incrementAndGet();
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0045, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x004a, code lost:
    
        throw r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void zzd(final Context context) {
        if (zze != null || context == null) {
            return;
        }
        Object obj = zza;
        synchronized (obj) {
            try {
                if (zze == null) {
                    synchronized (obj) {
                        zzda zzdaVar = zze;
                        Context applicationContext = context.getApplicationContext();
                        if (applicationContext != null) {
                            context = applicationContext;
                        }
                        if (zzdaVar != null) {
                            if (zzdaVar.zza() != context) {
                            }
                        }
                        zzcg.zzd();
                        zzdd.zzc();
                        zzco.zze();
                        zze = new zzcd(context, zzdo.zza(new zzdj() { // from class: com.google.android.gms.internal.auth.zzct
                            @Override // com.google.android.gms.internal.auth.zzdj
                            public final Object zza() {
                                Context context2 = context;
                                int i7 = zzdc.zzd;
                                return zzcp.zza(context2);
                            }
                        }));
                        zzi.incrementAndGet();
                    }
                }
            } finally {
            }
        }
    }

    public abstract Object zza(Object obj);

    /* JADX WARN: Removed duplicated region for block: B:14:0x0043 A[Catch: all -> 0x003b, TryCatch #0 {all -> 0x003b, blocks: (B:5:0x000b, B:7:0x000f, B:9:0x0018, B:11:0x0028, B:14:0x0043, B:16:0x0049, B:18:0x0053, B:20:0x0074, B:22:0x007c, B:24:0x0084, B:26:0x008a, B:29:0x009c, B:31:0x00a2, B:32:0x009a, B:34:0x00a8, B:36:0x00ac, B:39:0x00b4, B:40:0x00b7, B:41:0x00bb, B:44:0x0068, B:45:0x00c0, B:46:0x00c5, B:49:0x00c6), top: B:4:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c0 A[Catch: all -> 0x003b, TryCatch #0 {all -> 0x003b, blocks: (B:5:0x000b, B:7:0x000f, B:9:0x0018, B:11:0x0028, B:14:0x0043, B:16:0x0049, B:18:0x0053, B:20:0x0074, B:22:0x007c, B:24:0x0084, B:26:0x008a, B:29:0x009c, B:31:0x00a2, B:32:0x009a, B:34:0x00a8, B:36:0x00ac, B:39:0x00b4, B:40:0x00b7, B:41:0x00bb, B:44:0x0068, B:45:0x00c0, B:46:0x00c5, B:49:0x00c6), top: B:4:0x000b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzb() {
        String str;
        Object zzb;
        int i7 = zzi.get();
        if (this.zzk < i7) {
            synchronized (this) {
                try {
                    if (this.zzk < i7) {
                        zzda zzdaVar = zze;
                        zzdh zzc = zzdh.zzc();
                        Object obj = null;
                        if (zzdaVar != null) {
                            zzc = (zzdh) zzdaVar.zzb().zza();
                            if (zzc.zzb()) {
                                zzci zzciVar = (zzci) zzc.zza();
                                zzcz zzczVar = this.zzb;
                                str = zzciVar.zza(zzczVar.zza, null, zzczVar.zzc, this.zzc);
                                if (zzdaVar != null) {
                                    throw new IllegalStateException("Must call PhenotypeFlag.init() first");
                                }
                                Uri uri = this.zzb.zza;
                                zzcl zza2 = uri != null ? zzcq.zza(zzdaVar.zza(), uri) ? zzcg.zza(zzdaVar.zza().getContentResolver(), this.zzb.zza, new Runnable() { // from class: com.google.android.gms.internal.auth.zzcs
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        zzdc.zzc();
                                    }
                                }) : null : zzdd.zza(zzdaVar.zza(), null, new Runnable() { // from class: com.google.android.gms.internal.auth.zzcs
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        zzdc.zzc();
                                    }
                                });
                                Object zza3 = (zza2 == null || (zzb = zza2.zzb(this.zzc)) == null) ? null : zza(zzb);
                                if (zza3 == null) {
                                    if (!this.zzb.zzd) {
                                        String zzb2 = zzco.zza(zzdaVar.zza()).zzb(this.zzb.zzd ? null : this.zzc);
                                        if (zzb2 != null) {
                                            obj = zza(zzb2);
                                        }
                                    }
                                    zza3 = obj == null ? this.zzj : obj;
                                }
                                if (zzc.zzb()) {
                                    zza3 = str == null ? this.zzj : zza(str);
                                }
                                this.zzl = zza3;
                                this.zzk = i7;
                            }
                        }
                        str = null;
                        if (zzdaVar != null) {
                        }
                    }
                } finally {
                }
            }
        }
        return this.zzl;
    }
}
