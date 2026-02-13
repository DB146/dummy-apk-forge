package com.google.android.recaptcha.internal;

import Eb.B;
import Rb.a;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.m;

/* loaded from: classes.dex */
final class zzat extends m implements a {
    public static final zzat zza = new zzat();

    public zzat() {
        super(0);
    }

    public static final Map zza() {
        Map map;
        map = zzav.zzc;
        LinkedHashMap linkedHashMap = new LinkedHashMap(B.F(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), ((zzaw) entry.getValue()).zzb());
        }
        return linkedHashMap;
    }

    @Override // Rb.a
    public final /* bridge */ /* synthetic */ Object invoke() {
        return zza();
    }
}
