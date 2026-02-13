package com.google.ads.interactivemedia.v3.internal;

import com.google.android.gms.common.api.f;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class zztd {
    public static Object zza(Map.Entry entry) {
        if (entry == null) {
            return null;
        }
        return entry.getKey();
    }

    public static HashMap zzb(int i7) {
        int ceil;
        if (i7 < 3) {
            zzrv.zza(i7, "expectedSize");
            ceil = i7 + 1;
        } else {
            ceil = i7 < 1073741824 ? (int) Math.ceil(i7 / 0.75d) : f.API_PRIORITY_OTHER;
        }
        return new HashMap(ceil);
    }
}
