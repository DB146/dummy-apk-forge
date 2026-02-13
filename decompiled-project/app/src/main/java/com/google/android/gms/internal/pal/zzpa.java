package com.google.android.gms.internal.pal;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import y.S;

/* loaded from: classes.dex */
public abstract class zzpa {
    private final Class zza;
    private final Map zzb;
    private final Class zzc;

    @SafeVarargs
    public zzpa(Class cls, zzpq... zzpqVarArr) {
        this.zza = cls;
        HashMap hashMap = new HashMap();
        for (int i7 = 0; i7 <= 0; i7++) {
            zzpq zzpqVar = zzpqVarArr[i7];
            if (hashMap.containsKey(zzpqVar.zzb())) {
                throw new IllegalArgumentException("KeyTypeManager constructed with duplicate factories for primitive ".concat(String.valueOf(zzpqVar.zzb().getCanonicalName())));
            }
            hashMap.put(zzpqVar.zzb(), zzpqVar);
        }
        this.zzc = zzpqVarArr[0].zzb();
        this.zzb = Collections.unmodifiableMap(hashMap);
    }

    public zzoz zza() {
        throw new UnsupportedOperationException("Creating keys is not supported.");
    }

    public abstract zzvn zzb();

    public abstract zzaef zzc(zzaby zzabyVar);

    public abstract String zzd();

    public abstract void zze(zzaef zzaefVar);

    public int zzf() {
        return 1;
    }

    public final Class zzi() {
        return this.zzc;
    }

    public final Class zzj() {
        return this.zza;
    }

    public final Object zzk(zzaef zzaefVar, Class cls) {
        zzpq zzpqVar = (zzpq) this.zzb.get(cls);
        if (zzpqVar != null) {
            return zzpqVar.zza(zzaefVar);
        }
        throw new IllegalArgumentException(S.b("Requested primitive class ", cls.getCanonicalName(), " not supported."));
    }

    public final Set zzl() {
        return this.zzb.keySet();
    }
}
