package com.google.android.gms.internal.measurement;

import X.c;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class zzay extends zzav {
    public zzay() {
        this.zza.add(zzbk.APPLY);
        this.zza.add(zzbk.BLOCK);
        this.zza.add(zzbk.BREAK);
        this.zza.add(zzbk.CASE);
        this.zza.add(zzbk.DEFAULT);
        this.zza.add(zzbk.CONTINUE);
        this.zza.add(zzbk.DEFINE_FUNCTION);
        this.zza.add(zzbk.FN);
        this.zza.add(zzbk.IF);
        this.zza.add(zzbk.QUOTE);
        this.zza.add(zzbk.RETURN);
        this.zza.add(zzbk.SWITCH);
        this.zza.add(zzbk.TERNARY);
    }

    private static zzao zzc(zzg zzgVar, List list) {
        zzh.zzb(zzbk.FN.name(), 2, list);
        zzao zza = zzgVar.zza((zzao) list.get(0));
        zzao zza2 = zzgVar.zza((zzao) list.get(1));
        if (!(zza2 instanceof zzae)) {
            throw new IllegalArgumentException(c.t("FN requires an ArrayValue of parameter names found ", zza2.getClass().getCanonicalName()));
        }
        List zzb = ((zzae) zza2).zzb();
        List arrayList = new ArrayList();
        if (list.size() > 2) {
            arrayList = list.subList(2, list.size());
        }
        return new zzan(zza.zzc(), zzb, arrayList, zzgVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzav
    public final zzao zza(String str, zzg zzgVar, List list) {
        zzbk zzbkVar = zzbk.ADD;
        int ordinal = zzh.zze(str).ordinal();
        if (ordinal == 2) {
            zzao zza = zzgVar.zza((zzao) c.d(zzbk.APPLY, 3, list, 0));
            String zzc = zzgVar.zza((zzao) list.get(1)).zzc();
            zzao zza2 = zzgVar.zza((zzao) list.get(2));
            if (!(zza2 instanceof zzae)) {
                throw new IllegalArgumentException(c.t("Function arguments for Apply are not a list found ", zza2.getClass().getCanonicalName()));
            }
            if (zzc.isEmpty()) {
                throw new IllegalArgumentException("Function name for apply is undefined");
            }
            return zza.zzcA(zzc, zzgVar, ((zzae) zza2).zzb());
        }
        if (ordinal == 15) {
            zzh.zza(zzbk.BREAK.name(), 0, list);
            return zzao.zzh;
        }
        if (ordinal == 25) {
            return zzc(zzgVar, list);
        }
        if (ordinal == 41) {
            zzh.zzb(zzbk.IF.name(), 2, list);
            zzao zza3 = zzgVar.zza((zzao) list.get(0));
            zzao zza4 = zzgVar.zza((zzao) list.get(1));
            zzao zza5 = list.size() > 2 ? zzgVar.zza((zzao) list.get(2)) : null;
            zzao zzaoVar = zzao.zzf;
            zzao zzb = zza3.zze().booleanValue() ? zzgVar.zzb((zzae) zza4) : zza5 != null ? zzgVar.zzb((zzae) zza5) : zzaoVar;
            return true != (zzb instanceof zzag) ? zzaoVar : zzb;
        }
        if (ordinal == 54) {
            return new zzae(list);
        }
        if (ordinal == 57) {
            return list.isEmpty() ? zzao.zzj : new zzag("return", zzgVar.zza((zzao) c.d(zzbk.RETURN, 1, list, 0)));
        }
        if (ordinal != 19) {
            if (ordinal == 20) {
                zzh.zzb(zzbk.DEFINE_FUNCTION.name(), 2, list);
                zzan zzanVar = (zzan) zzc(zzgVar, list);
                if (zzanVar.zzg() == null) {
                    zzgVar.zze("", zzanVar);
                    return zzanVar;
                }
                zzgVar.zze(zzanVar.zzg(), zzanVar);
                return zzanVar;
            }
            if (ordinal == 60) {
                zzao zza6 = zzgVar.zza((zzao) c.d(zzbk.SWITCH, 3, list, 0));
                zzao zza7 = zzgVar.zza((zzao) list.get(1));
                zzao zza8 = zzgVar.zza((zzao) list.get(2));
                if (!(zza7 instanceof zzae)) {
                    throw new IllegalArgumentException("Malformed SWITCH statement, cases are not a list");
                }
                if (!(zza8 instanceof zzae)) {
                    throw new IllegalArgumentException("Malformed SWITCH statement, case statements are not a list");
                }
                zzae zzaeVar = (zzae) zza7;
                zzae zzaeVar2 = (zzae) zza8;
                boolean z8 = false;
                for (int i7 = 0; i7 < zzaeVar.zzh(); i7++) {
                    if (z8 || zza6.equals(zzgVar.zza(zzaeVar.zzl(i7)))) {
                        zzao zza9 = zzgVar.zza(zzaeVar2.zzl(i7));
                        if (zza9 instanceof zzag) {
                            return ((zzag) zza9).zzg().equals("break") ? zzao.zzf : zza9;
                        }
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                }
                if (zzaeVar.zzh() + 1 == zzaeVar2.zzh()) {
                    zzao zza10 = zzgVar.zza(zzaeVar2.zzl(zzaeVar.zzh()));
                    if (zza10 instanceof zzag) {
                        String zzg = ((zzag) zza10).zzg();
                        if (zzg.equals("return") || zzg.equals("continue")) {
                            return zza10;
                        }
                    }
                }
                return zzao.zzf;
            }
            if (ordinal == 61) {
                return zzgVar.zza((zzao) c.d(zzbk.TERNARY, 3, list, 0)).zze().booleanValue() ? zzgVar.zza((zzao) list.get(1)) : zzgVar.zza((zzao) list.get(2));
            }
            switch (ordinal) {
                case ModuleDescriptor.MODULE_VERSION /* 11 */:
                    return zzgVar.zzc().zzb(new zzae(list));
                case 12:
                    zzh.zza(zzbk.BREAK.name(), 0, list);
                    return zzao.zzi;
                case 13:
                    break;
                default:
                    return zzb(str);
            }
        }
        if (list.isEmpty()) {
            return zzao.zzf;
        }
        zzao zza11 = zzgVar.zza((zzao) list.get(0));
        return zza11 instanceof zzae ? zzgVar.zzb((zzae) zza11) : zzao.zzf;
    }
}
