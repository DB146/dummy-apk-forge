package com.google.android.gms.internal.measurement;

import X.c;
import java.util.List;

/* loaded from: classes.dex */
public final class zzbb extends zzav {
    public zzbb() {
        this.zza.add(zzbk.AND);
        this.zza.add(zzbk.NOT);
        this.zza.add(zzbk.OR);
    }

    @Override // com.google.android.gms.internal.measurement.zzav
    public final zzao zza(String str, zzg zzgVar, List list) {
        zzbk zzbkVar = zzbk.ADD;
        int ordinal = zzh.zze(str).ordinal();
        if (ordinal == 1) {
            zzao zza = zzgVar.zza((zzao) c.d(zzbk.AND, 2, list, 0));
            return zza.zze().booleanValue() ? zzgVar.zza((zzao) list.get(1)) : zza;
        }
        if (ordinal == 47) {
            return new zzaf(Boolean.valueOf(!zzgVar.zza((zzao) c.d(zzbk.NOT, 1, list, 0)).zze().booleanValue()));
        }
        if (ordinal != 50) {
            return zzb(str);
        }
        zzao zza2 = zzgVar.zza((zzao) c.d(zzbk.OR, 2, list, 0));
        return !zza2.zze().booleanValue() ? zzgVar.zza((zzao) list.get(1)) : zza2;
    }
}
