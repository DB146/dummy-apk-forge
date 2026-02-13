package com.google.ads.interactivemedia.v3.internal;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class zzrg {
    private final String zza;
    private final zzre zzb;
    private zzre zzc;

    public /* synthetic */ zzrg(String str, zzrf zzrfVar) {
        zzre zzreVar = new zzre(null);
        this.zzb = zzreVar;
        this.zzc = zzreVar;
        str.getClass();
        this.zza = str;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append(this.zza);
        sb2.append('{');
        zzre zzreVar = this.zzb.zzb;
        String str = "";
        while (zzreVar != null) {
            Object obj = zzreVar.zza;
            sb2.append(str);
            if (obj == null || !obj.getClass().isArray()) {
                sb2.append(obj);
            } else {
                sb2.append((CharSequence) Arrays.deepToString(new Object[]{obj}), 1, r2.length() - 1);
            }
            zzreVar = zzreVar.zzb;
            str = ", ";
        }
        sb2.append('}');
        return sb2.toString();
    }

    public final zzrg zza(Object obj) {
        zzre zzreVar = new zzre(null);
        this.zzc.zzb = zzreVar;
        this.zzc = zzreVar;
        zzreVar.zza = obj;
        return this;
    }
}
