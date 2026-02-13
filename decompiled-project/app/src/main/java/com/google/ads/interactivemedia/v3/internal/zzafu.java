package com.google.ads.interactivemedia.v3.internal;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
final class zzafu {
    public static final int zza(int i7, Object obj, Object obj2) {
        zzaft zzaftVar = (zzaft) obj;
        if (zzaftVar.isEmpty()) {
            return 0;
        }
        Iterator it = zzaftVar.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw null;
    }

    public static final boolean zzb(Object obj) {
        return !((zzaft) obj).zze();
    }

    public static final Object zzc(Object obj, Object obj2) {
        zzaft zzaftVar = (zzaft) obj;
        zzaft zzaftVar2 = (zzaft) obj2;
        if (!zzaftVar2.isEmpty()) {
            if (!zzaftVar.zze()) {
                zzaftVar = zzaftVar.zzb();
            }
            zzaftVar.zzd(zzaftVar2);
        }
        return zzaftVar;
    }
}
