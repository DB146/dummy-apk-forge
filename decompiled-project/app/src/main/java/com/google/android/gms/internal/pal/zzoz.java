package com.google.android.gms.internal.pal;

import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class zzoz {
    private final Class zza;

    public zzoz(Class cls) {
        this.zza = cls;
    }

    public abstract zzaef zza(zzaef zzaefVar);

    public abstract zzaef zzb(zzaby zzabyVar);

    public Map zzc() {
        return Collections.emptyMap();
    }

    public abstract void zzd(zzaef zzaefVar);

    public final Class zzg() {
        return this.zza;
    }
}
