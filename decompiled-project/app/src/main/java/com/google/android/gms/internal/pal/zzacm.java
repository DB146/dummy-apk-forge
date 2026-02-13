package com.google.android.gms.internal.pal;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzacm {
    static final zzacm zza = new zzacm(true);
    private static volatile boolean zzb = false;
    private static volatile zzacm zzc;
    private final Map zzd;

    public zzacm() {
        this.zzd = new HashMap();
    }

    public zzacm(boolean z8) {
        this.zzd = Collections.emptyMap();
    }

    public static zzacm zza() {
        zzacm zzacmVar = zzc;
        if (zzacmVar == null) {
            synchronized (zzacm.class) {
                try {
                    zzacmVar = zzc;
                    if (zzacmVar == null) {
                        zzacmVar = zza;
                        zzc = zzacmVar;
                    }
                } finally {
                }
            }
        }
        return zzacmVar;
    }

    public final zzacx zzb(zzaef zzaefVar, int i7) {
        return (zzacx) this.zzd.get(new zzacl(zzaefVar, i7));
    }
}
