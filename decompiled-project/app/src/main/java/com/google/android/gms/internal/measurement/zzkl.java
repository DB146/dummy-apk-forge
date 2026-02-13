package com.google.android.gms.internal.measurement;

import M6.a;
import M6.k;
import M6.q;
import M6.r;
import Q5.e;
import android.content.Context;
import android.net.Uri;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public abstract class zzkl {
    public static final /* synthetic */ int zzc = 0;
    private static final Object zzd = new Object();
    private static volatile zzkg zze = null;
    private static volatile boolean zzf = false;
    private static final AtomicInteger zzh;
    final zzkf zza;
    final String zzb;
    private Object zzg;
    private volatile int zzi = -1;
    private volatile Object zzj;
    private volatile boolean zzk;

    static {
        new AtomicReference();
        e.m(zzkj.zza, "BuildInfo must be non-null");
        zzh = new AtomicInteger();
    }

    public /* synthetic */ zzkl(zzkf zzkfVar, String str, Object obj, boolean z8, byte[] bArr) {
        if (zzkfVar.zza == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        }
        this.zza = zzkfVar;
        this.zzb = str;
        this.zzg = obj;
        this.zzk = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0054, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0059, code lost:
    
        throw r3;
     */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, M6.t] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void zzb(final Context context) {
        r rVar;
        if (zze != null || context == null) {
            return;
        }
        Object obj = zzd;
        synchronized (obj) {
            try {
                if (zze == null) {
                    synchronized (obj) {
                        zzkg zzkgVar = zze;
                        Context applicationContext = context.getApplicationContext();
                        if (applicationContext != null) {
                            context = applicationContext;
                        }
                        if (zzkgVar != null) {
                            if (zzkgVar.zza() != context) {
                            }
                        }
                        if (zzkgVar != null) {
                            zzjq.zzd();
                            zzkn.zzb();
                            zzjx.zzc();
                        }
                        q qVar = new q() { // from class: com.google.android.gms.internal.measurement.zzkk
                            @Override // M6.q
                            public final /* synthetic */ Object get() {
                                int i7 = zzkl.zzc;
                                return zzjy.zza(context);
                            }
                        };
                        if (qVar instanceof Serializable) {
                            rVar = new r(qVar);
                        } else {
                            ?? obj2 = new Object();
                            obj2.f6820a = qVar;
                            rVar = obj2;
                        }
                        zze = new zzjn(context, rVar);
                        zzh.incrementAndGet();
                    }
                }
            } finally {
            }
        }
    }

    public static void zzc() {
        zzh.incrementAndGet();
    }

    public abstract Object zza(Object obj);

    /* JADX WARN: Removed duplicated region for block: B:15:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0056 A[Catch: all -> 0x0042, TryCatch #0 {all -> 0x0042, blocks: (B:5:0x000b, B:7:0x000f, B:9:0x0016, B:11:0x001c, B:13:0x002f, B:16:0x004b, B:18:0x0056, B:20:0x0060, B:22:0x0072, B:24:0x007a, B:27:0x00a1, B:30:0x00a9, B:31:0x00ac, B:32:0x00b0, B:33:0x0083, B:35:0x0087, B:37:0x0097, B:39:0x009d, B:43:0x00b5, B:44:0x00b8, B:48:0x00b9), top: B:4:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b5 A[Catch: all -> 0x0042, TryCatch #0 {all -> 0x0042, blocks: (B:5:0x000b, B:7:0x000f, B:9:0x0016, B:11:0x001c, B:13:0x002f, B:16:0x004b, B:18:0x0056, B:20:0x0060, B:22:0x0072, B:24:0x007a, B:27:0x00a1, B:30:0x00a9, B:31:0x00ac, B:32:0x00b0, B:33:0x0083, B:35:0x0087, B:37:0x0097, B:39:0x009d, B:43:0x00b5, B:44:0x00b8, B:48:0x00b9), top: B:4:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzd() {
        String str;
        Uri uri;
        String zze2;
        Object zze3;
        int i7 = zzh.get();
        if (this.zzi < i7) {
            synchronized (this) {
                try {
                    if (this.zzi < i7) {
                        zzkg zzkgVar = zze;
                        k kVar = a.f6794a;
                        Object obj = null;
                        if (zzkgVar != null && zzkgVar.zzb() != null) {
                            q zzb = zzkgVar.zzb();
                            zzb.getClass();
                            kVar = (k) zzb.get();
                            if (kVar.b()) {
                                zzjs zzjsVar = (zzjs) kVar.a();
                                zzkf zzkfVar = this.zza;
                                str = zzjsVar.zza(zzkfVar.zza, null, zzkfVar.zzc, this.zzb);
                                e.p("Must call PhenotypeFlagInitializer.maybeInit() first", zzkgVar == null);
                                zzkf zzkfVar2 = this.zza;
                                uri = zzkfVar2.zza;
                                if (uri != null) {
                                    zzkgVar.zza();
                                    throw null;
                                }
                                zzjq zza = zzjz.zza(zzkgVar.zza(), uri) ? zzjq.zza(zzkgVar.zza().getContentResolver(), uri, zzki.zza) : null;
                                Object zza2 = (zza == null || (zze3 = zza.zze(this.zzb)) == null) ? null : zza(zze3);
                                if (zza2 == null) {
                                    if (!zzkfVar2.zzd && (zze2 = zzjx.zza(zzkgVar.zza()).zze(this.zzb)) != null) {
                                        obj = zza(zze2);
                                    }
                                    zza2 = obj == null ? this.zzg : obj;
                                }
                                if (kVar.b()) {
                                    zza2 = str == null ? this.zzg : zza(str);
                                }
                                this.zzj = zza2;
                                this.zzi = i7;
                            }
                        }
                        str = null;
                        e.p("Must call PhenotypeFlagInitializer.maybeInit() first", zzkgVar == null);
                        zzkf zzkfVar22 = this.zza;
                        uri = zzkfVar22.zza;
                        if (uri != null) {
                        }
                    }
                } finally {
                }
            }
        }
        return this.zzj;
    }
}
