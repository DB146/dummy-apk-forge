package com.google.android.gms.internal.appindex;

import android.content.SharedPreferences;
import java.util.Iterator;
import java.util.Map;
import u.T;

/* loaded from: classes.dex */
public final class zzak {
    private static final Map zza = new T(0);
    private final SharedPreferences zzb;
    private final SharedPreferences.OnSharedPreferenceChangeListener zzc;

    public static synchronized void zza() {
        synchronized (zzak.class) {
            Map map = zza;
            Iterator it = map.values().iterator();
            if (it.hasNext()) {
                SharedPreferences sharedPreferences = ((zzak) it.next()).zzb;
                throw null;
            }
            map.clear();
        }
    }
}
