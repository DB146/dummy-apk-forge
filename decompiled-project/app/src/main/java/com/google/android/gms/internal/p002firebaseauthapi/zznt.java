package com.google.android.gms.internal.p002firebaseauthapi;

import A3.c;
import com.google.android.gms.internal.p002firebaseauthapi.zzix;
import java.security.GeneralSecurityException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class zznt {
    private static final Logger zza = Logger.getLogger(zznt.class.getName());
    private static final zznt zzb = new zznt();
    private ConcurrentMap<String, zzbl<?>> zzc = new ConcurrentHashMap();
    private ConcurrentMap<String, Boolean> zzd = new ConcurrentHashMap();

    public static zznt zza() {
        return zzb;
    }

    private final synchronized void zza(zzbl<?> zzblVar, boolean z8, boolean z10) {
        try {
            String zzb2 = zzblVar.zzb();
            if (z10 && this.zzd.containsKey(zzb2) && !this.zzd.get(zzb2).booleanValue()) {
                throw new GeneralSecurityException("New keys are already disallowed for key type " + zzb2);
            }
            zzbl<?> zzblVar2 = this.zzc.get(zzb2);
            if (zzblVar2 != null && !zzblVar2.getClass().equals(zzblVar.getClass())) {
                zza.logp(Level.WARNING, "com.google.crypto.tink.internal.KeyManagerRegistry", "insertKeyManager", "Attempted overwrite of a registered key manager for key type " + zzb2);
                throw new GeneralSecurityException("typeUrl (" + zzb2 + ") is already registered with " + zzblVar2.getClass().getName() + ", cannot be re-registered with " + zzblVar.getClass().getName());
            }
            this.zzc.putIfAbsent(zzb2, zzblVar);
            this.zzd.put(zzb2, Boolean.valueOf(z10));
        } catch (Throwable th) {
            throw th;
        }
    }

    private final synchronized zzbl<?> zzc(String str) {
        if (!this.zzc.containsKey(str)) {
            throw new GeneralSecurityException("No key manager found for key type " + str + ", see https://developers.google.com/tink/faq/registration_errors");
        }
        return this.zzc.get(str);
    }

    public final zzbl<?> zza(String str) {
        return zzc(str);
    }

    public final <P> zzbl<P> zza(String str, Class<P> cls) {
        zzbl<P> zzblVar = (zzbl<P>) zzc(str);
        if (zzblVar.zza().equals(cls)) {
            return zzblVar;
        }
        String name = cls.getName();
        String valueOf = String.valueOf(zzblVar.getClass());
        String valueOf2 = String.valueOf(zzblVar.zza());
        StringBuilder o10 = c.o("Primitive type ", name, " not supported by key manager of type ", valueOf, ", which only supports: ");
        o10.append(valueOf2);
        throw new GeneralSecurityException(o10.toString());
    }

    public final synchronized <P> void zza(zzbl<P> zzblVar, zzix.zza zzaVar, boolean z8) {
        if (!zzaVar.zza()) {
            throw new GeneralSecurityException("Cannot register key manager: FIPS compatibility insufficient");
        }
        zza((zzbl<?>) zzblVar, false, z8);
    }

    public final synchronized <P> void zza(zzbl<P> zzblVar, boolean z8) {
        zza(zzblVar, zzix.zza.zza, z8);
    }

    public final boolean zzb(String str) {
        return this.zzd.get(str).booleanValue();
    }
}
