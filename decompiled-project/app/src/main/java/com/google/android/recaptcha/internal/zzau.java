package com.google.android.recaptcha.internal;

import Rb.a;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzau {
    public static final zzav zza() {
        zzav zzavVar;
        a aVar;
        Map map;
        zzavVar = zzav.zzb;
        if (zzavVar != null) {
            return zzavVar;
        }
        aVar = zzav.zzd;
        zzav zzavVar2 = new zzav((Map) aVar.invoke(), null);
        map = zzav.zzc;
        map.clear();
        zzav.zzb = zzavVar2;
        return zzavVar2;
    }
}
