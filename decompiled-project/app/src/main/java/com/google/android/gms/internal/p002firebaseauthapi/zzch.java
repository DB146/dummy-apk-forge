package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Logger;
import y.S;

/* loaded from: classes.dex */
public final class zzch {
    static {
        Logger.getLogger(zzch.class.getName());
        new ConcurrentHashMap();
        HashSet hashSet = new HashSet();
        hashSet.add(zzbe.class);
        hashSet.add(zzbi.class);
        hashSet.add(zzcj.class);
        hashSet.add(zzbk.class);
        hashSet.add(zzbh.class);
        hashSet.add(zzcb.class);
        hashSet.add(zzso.class);
        hashSet.add(zzcf.class);
        hashSet.add(zzci.class);
        Collections.unmodifiableSet(hashSet);
    }

    private zzch() {
    }

    @Deprecated
    public static zzws zza(String str, zzajp zzajpVar) {
        zzbl<?> zza = zznt.zza().zza(str);
        if (zza instanceof zzcg) {
            return ((zzcg) zza).zzc(zzajpVar);
        }
        throw new GeneralSecurityException(S.b("manager for key type ", str, " is not a PrivateKeyManager"));
    }
}
