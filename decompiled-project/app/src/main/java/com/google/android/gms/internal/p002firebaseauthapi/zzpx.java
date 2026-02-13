package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzpx {
    private final Map<zzqa, zzpr<?, ?>> zza;
    private final Map<Class<?>, zzqc<?, ?>> zzb;

    private zzpx() {
        this.zza = new HashMap();
        this.zzb = new HashMap();
    }

    private zzpx(zzpv zzpvVar) {
        this.zza = new HashMap(zzpv.zzb(zzpvVar));
        this.zzb = new HashMap(zzpv.zzc(zzpvVar));
    }

    public final zzpv zza() {
        return new zzpv(this);
    }

    public final <KeyT extends zzbm, PrimitiveT> zzpx zza(zzpr<KeyT, PrimitiveT> zzprVar) {
        if (zzprVar == null) {
            throw new NullPointerException("primitive constructor must be non-null");
        }
        zzqa zzqaVar = new zzqa(zzprVar.zza(), zzprVar.zzb());
        if (this.zza.containsKey(zzqaVar)) {
            zzpr<?, ?> zzprVar2 = this.zza.get(zzqaVar);
            if (!zzprVar2.equals(zzprVar) || !zzprVar.equals(zzprVar2)) {
                throw new GeneralSecurityException("Attempt to register non-equal PrimitiveConstructor object for already existing object of type: ".concat(String.valueOf(zzqaVar)));
            }
        } else {
            this.zza.put(zzqaVar, zzprVar);
        }
        return this;
    }

    public final <InputPrimitiveT, WrapperPrimitiveT> zzpx zza(zzqc<InputPrimitiveT, WrapperPrimitiveT> zzqcVar) {
        if (zzqcVar == null) {
            throw new NullPointerException("wrapper must be non-null");
        }
        Class<WrapperPrimitiveT> zzb = zzqcVar.zzb();
        if (this.zzb.containsKey(zzb)) {
            zzqc<?, ?> zzqcVar2 = this.zzb.get(zzb);
            if (!zzqcVar2.equals(zzqcVar) || !zzqcVar.equals(zzqcVar2)) {
                throw new GeneralSecurityException("Attempt to register non-equal PrimitiveWrapper object or input class object for already existing object of type".concat(String.valueOf(zzb)));
            }
        } else {
            this.zzb.put(zzb, zzqcVar);
        }
        return this;
    }
}
