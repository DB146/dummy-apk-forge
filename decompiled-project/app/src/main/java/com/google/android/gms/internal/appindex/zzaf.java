package com.google.android.gms.internal.appindex;

import android.content.ContentResolver;
import android.database.ContentObserver;
import java.util.Iterator;
import java.util.Map;
import u.T;

/* loaded from: classes.dex */
public final class zzaf {
    private final ContentResolver zzc;
    private final ContentObserver zzd;
    private static final Map zzb = new T(0);
    public static final String[] zza = {"key", "value"};

    public static synchronized void zza() {
        synchronized (zzaf.class) {
            Map map = zzb;
            Iterator it = map.values().iterator();
            if (it.hasNext()) {
                ContentResolver contentResolver = ((zzaf) it.next()).zzc;
                throw null;
            }
            map.clear();
        }
    }
}
