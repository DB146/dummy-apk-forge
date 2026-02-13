package com.google.android.gms.internal.p002firebaseauthapi;

import java.lang.Enum;
import java.security.GeneralSecurityException;
import java.util.Map;

/* loaded from: classes.dex */
public final class zznk<E extends Enum<E>, O> {
    private final Map<E, O> zza;
    private final Map<O, E> zzb;

    private zznk(Map<E, O> map, Map<O, E> map2) {
        this.zza = map;
        this.zzb = map2;
    }

    public static <E extends Enum<E>, O> zznn<E, O> zza() {
        return new zznn<>();
    }

    public final E zza(O o10) {
        E e2 = this.zzb.get(o10);
        if (e2 != null) {
            return e2;
        }
        throw new GeneralSecurityException("Unable to convert object enum: ".concat(String.valueOf(o10)));
    }

    public final O zza(E e2) {
        O o10 = this.zza.get(e2);
        if (o10 != null) {
            return o10;
        }
        throw new GeneralSecurityException("Unable to convert proto enum: ".concat(String.valueOf(e2)));
    }
}
