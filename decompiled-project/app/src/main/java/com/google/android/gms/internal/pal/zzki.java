package com.google.android.gms.internal.pal;

import A3.c;
import java.security.GeneralSecurityException;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
final class zzki {
    private static final Logger zza = Logger.getLogger(zzki.class.getName());
    private final ConcurrentMap zzb;

    public zzki() {
        this.zzb = new ConcurrentHashMap();
    }

    public zzki(zzki zzkiVar) {
        this.zzb = new ConcurrentHashMap(zzkiVar.zzb);
    }

    private final synchronized zzkh zzg(String str) {
        if (!this.zzb.containsKey(str)) {
            throw new GeneralSecurityException("No key manager found for key type ".concat(String.valueOf(str)));
        }
        return (zzkh) this.zzb.get(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x006b, code lost:
    
        r7.zzb.putIfAbsent(r1, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0071, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final synchronized void zzh(zzkh zzkhVar, boolean z8) {
        try {
            String zzf = zzkhVar.zzb().zzf();
            zzkh zzkhVar2 = (zzkh) this.zzb.get(zzf);
            if (zzkhVar2 != null && !zzkhVar2.zzc().equals(zzkhVar.zzc())) {
                zza.logp(Level.WARNING, "com.google.crypto.tink.KeyManagerRegistry", "registerKeyManagerContainer", "Attempted overwrite of a registered key manager for key type ".concat(zzf));
                throw new GeneralSecurityException("typeUrl (" + zzf + ") is already registered with " + zzkhVar2.zzc().getName() + ", cannot be re-registered with " + zzkhVar.zzc().getName());
            }
            this.zzb.put(zzf, zzkhVar);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final zzkb zza(String str, Class cls) {
        zzkh zzg = zzg(str);
        if (zzg.zze().contains(cls)) {
            return zzg.zza(cls);
        }
        String name = cls.getName();
        String valueOf = String.valueOf(zzg.zzc());
        Set<Class> zze = zzg.zze();
        StringBuilder sb2 = new StringBuilder();
        boolean z8 = true;
        for (Class cls2 : zze) {
            if (!z8) {
                sb2.append(", ");
            }
            sb2.append(cls2.getCanonicalName());
            z8 = false;
        }
        String sb3 = sb2.toString();
        StringBuilder o10 = c.o("Primitive type ", name, " not supported by key manager of type ", valueOf, ", supported primitives: ");
        o10.append(sb3);
        throw new GeneralSecurityException(o10.toString());
    }

    public final zzkb zzb(String str) {
        return zzg(str).zzb();
    }

    public final synchronized void zzc(zzpr zzprVar, zzpa zzpaVar) {
        Class zzd;
        try {
            int zzf = zzpaVar.zzf();
            if (!zzna.zza(1)) {
                throw new GeneralSecurityException("failed to register key manager " + String.valueOf(zzprVar.getClass()) + " as it is not FIPS compatible.");
            }
            if (!zzna.zza(zzf)) {
                throw new GeneralSecurityException("failed to register key manager " + String.valueOf(zzpaVar.getClass()) + " as it is not FIPS compatible.");
            }
            String zzd2 = zzprVar.zzd();
            String zzd3 = zzpaVar.zzd();
            if (this.zzb.containsKey(zzd2) && ((zzkh) this.zzb.get(zzd2)).zzd() != null && (zzd = ((zzkh) this.zzb.get(zzd2)).zzd()) != null && !zzd.getName().equals(zzpaVar.getClass().getName())) {
                zza.logp(Level.WARNING, "com.google.crypto.tink.KeyManagerRegistry", "registerAsymmetricKeyManagers", "Attempted overwrite of a registered key manager for key type " + zzd2 + " with inconsistent public key type " + zzd3);
                throw new GeneralSecurityException("public key manager corresponding to " + zzprVar.getClass().getName() + " is already registered with " + zzd.getName() + ", cannot be re-registered with " + zzpaVar.getClass().getName());
            }
            zzh(new zzkg(zzprVar, zzpaVar), true);
            zzh(new zzkf(zzpaVar), false);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void zzd(zzkb zzkbVar) {
        if (!zzna.zza(1)) {
            throw new GeneralSecurityException("Registering key managers is not supported in FIPS mode");
        }
        zzh(new zzke(zzkbVar), false);
    }

    public final synchronized void zze(zzpa zzpaVar) {
        if (!zzna.zza(zzpaVar.zzf())) {
            throw new GeneralSecurityException("failed to register key manager " + String.valueOf(zzpaVar.getClass()) + " as it is not FIPS compatible.");
        }
        zzh(new zzkf(zzpaVar), false);
    }

    public final boolean zzf(String str) {
        return this.zzb.containsKey(str);
    }
}
