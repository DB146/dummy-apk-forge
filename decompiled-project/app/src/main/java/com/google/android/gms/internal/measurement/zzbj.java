package com.google.android.gms.internal.measurement;

import X.c;
import h3.o;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class zzbj extends zzav {
    public zzbj() {
        this.zza.add(zzbk.ASSIGN);
        this.zza.add(zzbk.CONST);
        this.zza.add(zzbk.CREATE_ARRAY);
        this.zza.add(zzbk.CREATE_OBJECT);
        this.zza.add(zzbk.EXPRESSION_LIST);
        this.zza.add(zzbk.GET);
        this.zza.add(zzbk.GET_INDEX);
        this.zza.add(zzbk.GET_PROPERTY);
        this.zza.add(zzbk.NULL);
        this.zza.add(zzbk.SET_PROPERTY);
        this.zza.add(zzbk.TYPEOF);
        this.zza.add(zzbk.UNDEFINED);
        this.zza.add(zzbk.VAR);
    }

    @Override // com.google.android.gms.internal.measurement.zzav
    public final zzao zza(String str, zzg zzgVar, List list) {
        zzao zza;
        zzao zza2;
        String str2;
        zzbk zzbkVar = zzbk.ADD;
        int ordinal = zzh.zze(str).ordinal();
        int i7 = 0;
        if (ordinal != 3) {
            if (ordinal == 14) {
                zzh.zzb(zzbk.CONST.name(), 2, list);
                if (list.size() % 2 != 0) {
                    throw new IllegalArgumentException(o.l(list.size(), "CONST requires an even number of arguments, found "));
                }
                while (i7 < list.size() - 1) {
                    zzao zza3 = zzgVar.zza((zzao) list.get(i7));
                    if (!(zza3 instanceof zzas)) {
                        throw new IllegalArgumentException(c.t("Expected string for const name. got ", zza3.getClass().getCanonicalName()));
                    }
                    zzgVar.zzg(zza3.zzc(), zzgVar.zza((zzao) list.get(i7 + 1)));
                    i7 += 2;
                }
                return zzao.zzf;
            }
            if (ordinal == 24) {
                zzh.zzb(zzbk.EXPRESSION_LIST.name(), 1, list);
                zzao zzaoVar = zzao.zzf;
                while (i7 < list.size()) {
                    zzaoVar = zzgVar.zza((zzao) list.get(i7));
                    if (zzaoVar instanceof zzag) {
                        throw new IllegalStateException("ControlValue cannot be in an expression list");
                    }
                    i7++;
                }
                return zzaoVar;
            }
            if (ordinal == 33) {
                zzao zza4 = zzgVar.zza((zzao) c.d(zzbk.GET, 1, list, 0));
                if (zza4 instanceof zzas) {
                    return zzgVar.zzh(zza4.zzc());
                }
                throw new IllegalArgumentException(c.t("Expected string for get var. got ", zza4.getClass().getCanonicalName()));
            }
            if (ordinal == 49) {
                zzh.zza(zzbk.NULL.name(), 0, list);
                return zzao.zzg;
            }
            if (ordinal == 58) {
                zzao zza5 = zzgVar.zza((zzao) c.d(zzbk.SET_PROPERTY, 3, list, 0));
                zzao zza6 = zzgVar.zza((zzao) list.get(1));
                zza2 = zzgVar.zza((zzao) list.get(2));
                if (zza5 == zzao.zzf || zza5 == zzao.zzg) {
                    throw new IllegalStateException(A3.c.j("Can't set property ", zza6.zzc(), " of ", zza5.zzc()));
                }
                if ((zza5 instanceof zzae) && (zza6 instanceof zzah)) {
                    ((zzae) zza5).zzn(zza6.zzd().intValue(), zza2);
                } else if (zza5 instanceof zzak) {
                    ((zzak) zza5).zzm(zza6.zzc(), zza2);
                    return zza2;
                }
            } else {
                if (ordinal == 17) {
                    if (list.isEmpty()) {
                        return new zzae();
                    }
                    zzae zzaeVar = new zzae();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        zzao zza7 = zzgVar.zza((zzao) it.next());
                        if (zza7 instanceof zzag) {
                            throw new IllegalStateException("Failed to evaluate array element");
                        }
                        zzaeVar.zzn(i7, zza7);
                        i7++;
                    }
                    return zzaeVar;
                }
                if (ordinal == 18) {
                    if (list.isEmpty()) {
                        return new zzal();
                    }
                    if (list.size() % 2 != 0) {
                        throw new IllegalArgumentException(o.l(list.size(), "CREATE_OBJECT requires an even number of arguments, found "));
                    }
                    zzal zzalVar = new zzal();
                    while (i7 < list.size() - 1) {
                        zzao zza8 = zzgVar.zza((zzao) list.get(i7));
                        zzao zza9 = zzgVar.zza((zzao) list.get(i7 + 1));
                        if ((zza8 instanceof zzag) || (zza9 instanceof zzag)) {
                            throw new IllegalStateException("Failed to evaluate map entry");
                        }
                        zzalVar.zzm(zza8.zzc(), zza9);
                        i7 += 2;
                    }
                    return zzalVar;
                }
                if (ordinal == 35 || ordinal == 36) {
                    zzao zza10 = zzgVar.zza((zzao) c.d(zzbk.GET_PROPERTY, 2, list, 0));
                    zzao zza11 = zzgVar.zza((zzao) list.get(1));
                    if ((zza10 instanceof zzae) && zzh.zzd(zza11)) {
                        return ((zzae) zza10).zzl(zza11.zzd().intValue());
                    }
                    if (zza10 instanceof zzak) {
                        return ((zzak) zza10).zzk(zza11.zzc());
                    }
                    if (zza10 instanceof zzas) {
                        if ("length".equals(zza11.zzc())) {
                            zza2 = new zzah(Double.valueOf(zza10.zzc().length()));
                        } else if (zzh.zzd(zza11) && zza11.zzd().doubleValue() < zza10.zzc().length()) {
                            zza = new zzas(String.valueOf(zza10.zzc().charAt(zza11.zzd().intValue())));
                        }
                    }
                    return zzao.zzf;
                }
                switch (ordinal) {
                    case 62:
                        zzao zza12 = zzgVar.zza((zzao) c.d(zzbk.TYPEOF, 1, list, 0));
                        if (zza12 instanceof zzat) {
                            str2 = "undefined";
                        } else if (zza12 instanceof zzaf) {
                            str2 = "boolean";
                        } else if (zza12 instanceof zzah) {
                            str2 = "number";
                        } else if (zza12 instanceof zzas) {
                            str2 = "string";
                        } else if (zza12 instanceof zzan) {
                            str2 = "function";
                        } else {
                            if ((zza12 instanceof zzap) || (zza12 instanceof zzag)) {
                                throw new IllegalArgumentException(String.format("Unsupported value type %s in typeof", zza12));
                            }
                            str2 = "object";
                        }
                        zza2 = new zzas(str2);
                        break;
                    case 63:
                        zzh.zza(zzbk.UNDEFINED.name(), 0, list);
                        return zzao.zzf;
                    case 64:
                        zzh.zzb(zzbk.VAR.name(), 1, list);
                        Iterator it2 = list.iterator();
                        while (it2.hasNext()) {
                            zzao zza13 = zzgVar.zza((zzao) it2.next());
                            if (!(zza13 instanceof zzas)) {
                                throw new IllegalArgumentException(c.t("Expected string for var name. got ", zza13.getClass().getCanonicalName()));
                            }
                            zzgVar.zzf(zza13.zzc(), zzao.zzf);
                        }
                        return zzao.zzf;
                    default:
                        return zzb(str);
                }
            }
            return zza2;
        }
        zzao zza14 = zzgVar.zza((zzao) c.d(zzbk.ASSIGN, 2, list, 0));
        if (!(zza14 instanceof zzas)) {
            throw new IllegalArgumentException(c.t("Expected string for assign var. got ", zza14.getClass().getCanonicalName()));
        }
        if (!zzgVar.zzd(zza14.zzc())) {
            throw new IllegalArgumentException(c.t("Attempting to assign undefined value ", zza14.zzc()));
        }
        zza = zzgVar.zza((zzao) list.get(1));
        zzgVar.zze(zza14.zzc(), zza);
        return zza;
    }
}
