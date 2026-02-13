package com.google.android.gms.internal.p002firebaseauthapi;

import android.app.Activity;
import java.util.Map;
import java.util.concurrent.Executor;
import n7.t;
import u.T;

/* loaded from: classes.dex */
public final class zzaft {
    private static final Map<String, zzafv> zza = new T(0);

    public static t zza(String str, t tVar, zzaex zzaexVar) {
        zza(str, zzaexVar);
        return new zzafs(tVar, str);
    }

    public static void zza() {
        zza.clear();
    }

    private static void zza(String str, zzaex zzaexVar) {
        zza.put(str, new zzafv(zzaexVar, System.currentTimeMillis()));
    }

    public static boolean zza(String str, t tVar, Activity activity, Executor executor) {
        Map<String, zzafv> map = zza;
        if (!map.containsKey(str)) {
            zza(str, null);
            return false;
        }
        zzafv zzafvVar = map.get(str);
        if (System.currentTimeMillis() - zzafvVar.zzb >= 120000) {
            zza(str, null);
            return false;
        }
        zzaex zzaexVar = zzafvVar.zza;
        if (zzaexVar == null) {
            return true;
        }
        zzaexVar.zza(tVar, activity, executor, str);
        return true;
    }
}
