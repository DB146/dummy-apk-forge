package com.google.android.gms.internal.measurement;

import X.c;
import java.util.List;

/* loaded from: classes.dex */
public final class zzbh extends zzav {
    public zzbh() {
        this.zza.add(zzbk.ADD);
        this.zza.add(zzbk.DIVIDE);
        this.zza.add(zzbk.MODULUS);
        this.zza.add(zzbk.MULTIPLY);
        this.zza.add(zzbk.NEGATE);
        this.zza.add(zzbk.POST_DECREMENT);
        this.zza.add(zzbk.POST_INCREMENT);
        this.zza.add(zzbk.PRE_DECREMENT);
        this.zza.add(zzbk.PRE_INCREMENT);
        this.zza.add(zzbk.SUBTRACT);
    }

    @Override // com.google.android.gms.internal.measurement.zzav
    public final zzao zza(String str, zzg zzgVar, List list) {
        zzbk zzbkVar = zzbk.ADD;
        int ordinal = zzh.zze(str).ordinal();
        if (ordinal == 0) {
            zzao zza = zzgVar.zza((zzao) c.d(zzbk.ADD, 2, list, 0));
            zzao zza2 = zzgVar.zza((zzao) list.get(1));
            if (!(zza instanceof zzak) && !(zza instanceof zzas) && !(zza2 instanceof zzak) && !(zza2 instanceof zzas)) {
                return new zzah(Double.valueOf(zza2.zzd().doubleValue() + zza.zzd().doubleValue()));
            }
            return new zzas(String.valueOf(zza.zzc()).concat(String.valueOf(zza2.zzc())));
        }
        if (ordinal == 21) {
            return new zzah(Double.valueOf(zzgVar.zza((zzao) c.d(zzbk.DIVIDE, 2, list, 0)).zzd().doubleValue() / zzgVar.zza((zzao) list.get(1)).zzd().doubleValue()));
        }
        if (ordinal == 59) {
            zzao zza3 = zzgVar.zza((zzao) c.d(zzbk.SUBTRACT, 2, list, 0));
            zzah zzahVar = new zzah(Double.valueOf(-zzgVar.zza((zzao) list.get(1)).zzd().doubleValue()));
            return new zzah(Double.valueOf(zzahVar.zzd().doubleValue() + zza3.zzd().doubleValue()));
        }
        if (ordinal == 52 || ordinal == 53) {
            zzh.zza(str, 2, list);
            zzao zza4 = zzgVar.zza((zzao) list.get(0));
            zzgVar.zza((zzao) list.get(1));
            return zza4;
        }
        if (ordinal == 55 || ordinal == 56) {
            zzh.zza(str, 1, list);
            return zzgVar.zza((zzao) list.get(0));
        }
        switch (ordinal) {
            case 44:
                return new zzah(Double.valueOf(zzgVar.zza((zzao) c.d(zzbk.MODULUS, 2, list, 0)).zzd().doubleValue() % zzgVar.zza((zzao) list.get(1)).zzd().doubleValue()));
            case 45:
                return new zzah(Double.valueOf(zzgVar.zza((zzao) list.get(1)).zzd().doubleValue() * zzgVar.zza((zzao) c.d(zzbk.MULTIPLY, 2, list, 0)).zzd().doubleValue()));
            case 46:
                return new zzah(Double.valueOf(-zzgVar.zza((zzao) c.d(zzbk.NEGATE, 1, list, 0)).zzd().doubleValue()));
            default:
                return zzb(str);
        }
    }
}
