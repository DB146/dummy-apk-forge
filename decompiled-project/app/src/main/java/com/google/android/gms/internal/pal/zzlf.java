package com.google.android.gms.internal.pal;

import A3.c;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;
import y.S;

/* loaded from: classes.dex */
public final class zzlf {
    private static final Logger zza = Logger.getLogger(zzlf.class.getName());
    private static final AtomicReference zzb = new AtomicReference(new zzki());
    private static final ConcurrentMap zzc = new ConcurrentHashMap();
    private static final ConcurrentMap zzd = new ConcurrentHashMap();
    private static final ConcurrentMap zze = new ConcurrentHashMap();
    private static final ConcurrentMap zzf = new ConcurrentHashMap();
    private static final ConcurrentMap zzg = new ConcurrentHashMap();

    private zzlf() {
    }

    @Deprecated
    public static zzju zza(String str) {
        if (str == null) {
            throw new IllegalArgumentException("catalogueName must be non-null.");
        }
        ConcurrentMap concurrentMap = zze;
        Locale locale = Locale.US;
        zzju zzjuVar = (zzju) concurrentMap.get(str.toLowerCase(locale));
        if (zzjuVar != null) {
            return zzjuVar;
        }
        String b2 = S.b("no catalogue found for ", str, ". ");
        if (str.toLowerCase(locale).startsWith("tinkaead")) {
            b2 = b2.concat("Maybe call AeadConfig.register().");
        }
        if (str.toLowerCase(locale).startsWith("tinkdeterministicaead")) {
            b2 = String.valueOf(b2).concat("Maybe call DeterministicAeadConfig.register().");
        } else if (str.toLowerCase(locale).startsWith("tinkstreamingaead")) {
            b2 = String.valueOf(b2).concat("Maybe call StreamingAeadConfig.register().");
        } else if (str.toLowerCase(locale).startsWith("tinkhybriddecrypt") || str.toLowerCase(locale).startsWith("tinkhybridencrypt")) {
            b2 = String.valueOf(b2).concat("Maybe call HybridConfig.register().");
        } else if (str.toLowerCase(locale).startsWith("tinkmac")) {
            b2 = String.valueOf(b2).concat("Maybe call MacConfig.register().");
        } else if (str.toLowerCase(locale).startsWith("tinkpublickeysign") || str.toLowerCase(locale).startsWith("tinkpublickeyverify")) {
            b2 = String.valueOf(b2).concat("Maybe call SignatureConfig.register().");
        } else if (str.toLowerCase(locale).startsWith("tink")) {
            b2 = String.valueOf(b2).concat("Maybe call TinkConfig.register().");
        }
        throw new GeneralSecurityException(b2);
    }

    public static zzkb zzb(String str) {
        return ((zzki) zzb.get()).zzb(str);
    }

    public static synchronized zzvo zzc(zzvt zzvtVar) {
        zzvo zza2;
        synchronized (zzlf.class) {
            zzkb zzb2 = zzb(zzvtVar.zzf());
            if (!((Boolean) zzd.get(zzvtVar.zzf())).booleanValue()) {
                throw new GeneralSecurityException("newKey-operation not permitted for key type ".concat(String.valueOf(zzvtVar.zzf())));
            }
            zza2 = zzb2.zza(zzvtVar.zze());
        }
        return zza2;
    }

    public static synchronized zzaef zzd(zzvt zzvtVar) {
        zzaef zzb2;
        synchronized (zzlf.class) {
            zzkb zzb3 = zzb(zzvtVar.zzf());
            if (!((Boolean) zzd.get(zzvtVar.zzf())).booleanValue()) {
                throw new GeneralSecurityException("newKey-operation not permitted for key type ".concat(String.valueOf(zzvtVar.zzf())));
            }
            zzb2 = zzb3.zzb(zzvtVar.zze());
        }
        return zzb2;
    }

    public static Class zze(Class cls) {
        zzlc zzlcVar = (zzlc) zzf.get(cls);
        if (zzlcVar == null) {
            return null;
        }
        return zzlcVar.zza();
    }

    public static Object zzf(zzvo zzvoVar, Class cls) {
        return zzg(zzvoVar.zzg(), zzvoVar.zzf(), cls);
    }

    public static Object zzg(String str, zzaby zzabyVar, Class cls) {
        return ((zzki) zzb.get()).zza(str, cls).zzd(zzabyVar);
    }

    public static Object zzh(String str, zzaef zzaefVar, Class cls) {
        return ((zzki) zzb.get()).zza(str, cls).zze(zzaefVar);
    }

    public static Object zzi(String str, byte[] bArr, Class cls) {
        return zzg(str, zzaby.zzn(bArr), cls);
    }

    public static Object zzj(zzlb zzlbVar, Class cls) {
        zzlc zzlcVar = (zzlc) zzf.get(cls);
        if (zzlcVar == null) {
            throw new GeneralSecurityException("No wrapper found for ".concat(zzlbVar.zzc().getName()));
        }
        if (zzlcVar.zza().equals(zzlbVar.zzc())) {
            return zzlcVar.zzc(zzlbVar);
        }
        throw new GeneralSecurityException(c.j("Wrong input primitive class, expected ", zzlcVar.zza().toString(), ", got ", zzlbVar.zzc().toString()));
    }

    public static synchronized Map zzk() {
        Map unmodifiableMap;
        synchronized (zzlf.class) {
            unmodifiableMap = Collections.unmodifiableMap(zzg);
        }
        return unmodifiableMap;
    }

    public static synchronized void zzl(zzpr zzprVar, zzpa zzpaVar, boolean z8) {
        synchronized (zzlf.class) {
            try {
                AtomicReference atomicReference = zzb;
                zzki zzkiVar = new zzki((zzki) atomicReference.get());
                zzkiVar.zzc(zzprVar, zzpaVar);
                String zzd2 = zzprVar.zzd();
                String zzd3 = zzpaVar.zzd();
                zzp(zzd2, zzprVar.zza().zzc(), true);
                zzp(zzd3, Collections.emptyMap(), false);
                if (!((zzki) atomicReference.get()).zzf(zzd2)) {
                    zzc.put(zzd2, new zzle(zzprVar));
                    zzq(zzprVar.zzd(), zzprVar.zza().zzc());
                }
                ConcurrentMap concurrentMap = zzd;
                concurrentMap.put(zzd2, Boolean.TRUE);
                concurrentMap.put(zzd3, Boolean.FALSE);
                atomicReference.set(zzkiVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static synchronized void zzm(zzkb zzkbVar, boolean z8) {
        synchronized (zzlf.class) {
            if (zzkbVar == null) {
                throw new IllegalArgumentException("key manager must be non-null.");
            }
            AtomicReference atomicReference = zzb;
            zzki zzkiVar = new zzki((zzki) atomicReference.get());
            zzkiVar.zzd(zzkbVar);
            if (!zzna.zza(1)) {
                throw new GeneralSecurityException("Registering key managers is not supported in FIPS mode");
            }
            String zzf2 = zzkbVar.zzf();
            zzp(zzf2, Collections.emptyMap(), z8);
            zzd.put(zzf2, Boolean.valueOf(z8));
            atomicReference.set(zzkiVar);
        }
    }

    public static synchronized void zzn(zzpa zzpaVar, boolean z8) {
        synchronized (zzlf.class) {
            try {
                AtomicReference atomicReference = zzb;
                zzki zzkiVar = new zzki((zzki) atomicReference.get());
                zzkiVar.zze(zzpaVar);
                String zzd2 = zzpaVar.zzd();
                zzp(zzd2, zzpaVar.zza().zzc(), true);
                if (!((zzki) atomicReference.get()).zzf(zzd2)) {
                    zzc.put(zzd2, new zzle(zzpaVar));
                    zzq(zzd2, zzpaVar.zza().zzc());
                }
                zzd.put(zzd2, Boolean.TRUE);
                atomicReference.set(zzkiVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static synchronized void zzo(zzlc zzlcVar) {
        synchronized (zzlf.class) {
            try {
                if (zzlcVar == null) {
                    throw new IllegalArgumentException("wrapper must be non-null");
                }
                Class zzb2 = zzlcVar.zzb();
                ConcurrentMap concurrentMap = zzf;
                if (concurrentMap.containsKey(zzb2)) {
                    zzlc zzlcVar2 = (zzlc) concurrentMap.get(zzb2);
                    if (!zzlcVar.getClass().getName().equals(zzlcVar2.getClass().getName())) {
                        zza.logp(Level.WARNING, "com.google.crypto.tink.Registry", "registerPrimitiveWrapper", "Attempted overwrite of a registered PrimitiveWrapper for type ".concat(zzb2.toString()));
                        throw new GeneralSecurityException("PrimitiveWrapper for primitive (" + zzb2.getName() + ") is already registered to be " + zzlcVar2.getClass().getName() + ", cannot be re-registered with " + zzlcVar.getClass().getName());
                    }
                }
                concurrentMap.put(zzb2, zzlcVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static synchronized void zzp(String str, Map map, boolean z8) {
        synchronized (zzlf.class) {
            if (z8) {
                try {
                    ConcurrentMap concurrentMap = zzd;
                    if (concurrentMap.containsKey(str) && !((Boolean) concurrentMap.get(str)).booleanValue()) {
                        throw new GeneralSecurityException("New keys are already disallowed for key type ".concat(str));
                    }
                    if (((zzki) zzb.get()).zzf(str)) {
                        for (Map.Entry entry : map.entrySet()) {
                            if (!zzg.containsKey(entry.getKey())) {
                                throw new GeneralSecurityException("Attempted to register a new key template " + ((String) entry.getKey()) + " from an existing key manager of type " + str);
                            }
                        }
                    } else {
                        for (Map.Entry entry2 : map.entrySet()) {
                            if (zzg.containsKey(entry2.getKey())) {
                                throw new GeneralSecurityException("Attempted overwrite of a registered key template ".concat(String.valueOf((String) entry2.getKey())));
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [com.google.android.gms.internal.pal.zzaef, java.lang.Object] */
    private static void zzq(String str, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            zzg.put((String) entry.getKey(), zzkk.zzd(str, ((zzoy) entry.getValue()).zza.zzas(), ((zzoy) entry.getValue()).zzb));
        }
    }
}
