package com.google.android.gms.internal.p002firebaseauthapi;

import X.c;
import Y6.i;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import u.T;

/* loaded from: classes.dex */
public final class zzagd {
    private static final Map<String, zzagc> zza = new T(0);
    private static final Map<String, List<WeakReference<zzagf>>> zzb = new T(0);

    public static String zza(String str) {
        zzagc zzagcVar;
        Map<String, zzagc> map = zza;
        synchronized (map) {
            zzagcVar = map.get(str);
        }
        if (zzagcVar != null) {
            return c.h(zza(zzagcVar.zzb(), zzagcVar.zza(), zzagcVar.zzb().contains(":")), "emulator/auth/handler");
        }
        throw new IllegalStateException("Tried to get the emulator widget endpoint, but no emulator endpoint overrides found.");
    }

    private static String zza(String str, int i7, boolean z8) {
        if (z8) {
            return "http://[" + str + "]:" + i7 + "/";
        }
        return "http://" + str + ":" + i7 + "/";
    }

    public static void zza(i iVar, String str, int i7) {
        iVar.b();
        String str2 = iVar.f12043c.f12054a;
        Map<String, zzagc> map = zza;
        synchronized (map) {
            map.put(str2, new zzagc(str, i7));
        }
        Map<String, List<WeakReference<zzagf>>> map2 = zzb;
        synchronized (map2) {
            try {
                if (map2.containsKey(str2)) {
                    Iterator<WeakReference<zzagf>> it = map2.get(str2).iterator();
                    boolean z8 = false;
                    while (it.hasNext()) {
                        zzagf zzagfVar = it.next().get();
                        if (zzagfVar != null) {
                            zzagfVar.zza();
                            z8 = true;
                        }
                    }
                    if (!z8) {
                        zza.remove(str2);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void zza(String str, zzagf zzagfVar) {
        Map<String, List<WeakReference<zzagf>>> map = zzb;
        synchronized (map) {
            try {
                if (map.containsKey(str)) {
                    map.get(str).add(new WeakReference<>(zzagfVar));
                } else {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(new WeakReference(zzagfVar));
                    map.put(str, arrayList);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static boolean zza(i iVar) {
        Map<String, zzagc> map = zza;
        iVar.b();
        return map.containsKey(iVar.f12043c.f12054a);
    }

    public static String zzb(String str) {
        zzagc zzagcVar;
        Map<String, zzagc> map = zza;
        synchronized (map) {
            zzagcVar = map.get(str);
        }
        return c.h(zzagcVar != null ? c.t("", zza(zzagcVar.zzb(), zzagcVar.zza(), zzagcVar.zzb().contains(":"))) : "https://", "www.googleapis.com/identitytoolkit/v3/relyingparty");
    }

    public static String zzc(String str) {
        zzagc zzagcVar;
        Map<String, zzagc> map = zza;
        synchronized (map) {
            zzagcVar = map.get(str);
        }
        return c.h(zzagcVar != null ? c.t("", zza(zzagcVar.zzb(), zzagcVar.zza(), zzagcVar.zzb().contains(":"))) : "https://", "identitytoolkit.googleapis.com/v2");
    }

    public static String zzd(String str) {
        zzagc zzagcVar;
        Map<String, zzagc> map = zza;
        synchronized (map) {
            zzagcVar = map.get(str);
        }
        return c.h(zzagcVar != null ? c.t("", zza(zzagcVar.zzb(), zzagcVar.zza(), zzagcVar.zzb().contains(":"))) : "https://", "securetoken.googleapis.com/v1");
    }
}
