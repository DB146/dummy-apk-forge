package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzlq {
    static final zzlq zza = new zzlq(true);
    public static final /* synthetic */ int zzb = 0;
    private static volatile boolean zzc = false;
    private static volatile zzlq zzd;
    private final Map zze;

    public zzlq() {
        this.zze = new HashMap();
    }

    public zzlq(boolean z8) {
        this.zze = Collections.emptyMap();
    }

    public static zzlq zza() {
        zzlq zzlqVar = zzd;
        if (zzlqVar != null) {
            return zzlqVar;
        }
        synchronized (zzlq.class) {
            try {
                zzlq zzlqVar2 = zzd;
                if (zzlqVar2 != null) {
                    return zzlqVar2;
                }
                int i7 = zznt.zza;
                zzlq zzb2 = zzly.zzb(zzlq.class);
                zzd = zzb2;
                return zzb2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final zzmd zzb(zznl zznlVar, int i7) {
        return (zzmd) this.zze.get(new zzlp(zznlVar, i7));
    }
}
