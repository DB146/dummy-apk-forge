package com.google.android.gms.internal.measurement;

import X.c;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class zzbg extends zzav {
    public zzbg() {
        this.zza.add(zzbk.FOR_IN);
        this.zza.add(zzbk.FOR_IN_CONST);
        this.zza.add(zzbk.FOR_IN_LET);
        this.zza.add(zzbk.FOR_LET);
        this.zza.add(zzbk.FOR_OF);
        this.zza.add(zzbk.FOR_OF_CONST);
        this.zza.add(zzbk.FOR_OF_LET);
        this.zza.add(zzbk.WHILE);
    }

    private static zzao zzc(zzbe zzbeVar, zzao zzaoVar, zzao zzaoVar2) {
        return zze(zzbeVar, zzaoVar.zzf(), zzaoVar2);
    }

    private static zzao zzd(zzbe zzbeVar, zzao zzaoVar, zzao zzaoVar2) {
        if (zzaoVar instanceof Iterable) {
            return zze(zzbeVar, ((Iterable) zzaoVar).iterator(), zzaoVar2);
        }
        throw new IllegalArgumentException("Non-iterable type in for...of loop.");
    }

    private static zzao zze(zzbe zzbeVar, Iterator it, zzao zzaoVar) {
        if (it != null) {
            while (it.hasNext()) {
                zzao zzb = zzbeVar.zza((zzao) it.next()).zzb((zzae) zzaoVar);
                if (zzb instanceof zzag) {
                    zzag zzagVar = (zzag) zzb;
                    if ("break".equals(zzagVar.zzg())) {
                        return zzao.zzf;
                    }
                    if ("return".equals(zzagVar.zzg())) {
                        return zzagVar;
                    }
                }
            }
        }
        return zzao.zzf;
    }

    /* JADX WARN: Code restructure failed: missing block: B:84:0x0278, code lost:
    
        if ("return".equals(r1.zzg()) != false) goto L70;
     */
    @Override // com.google.android.gms.internal.measurement.zzav
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzao zza(String str, zzg zzgVar, List list) {
        zzag zzagVar;
        zzbk zzbkVar = zzbk.ADD;
        int ordinal = zzh.zze(str).ordinal();
        if (ordinal == 65) {
            zzao zzaoVar = (zzao) c.d(zzbk.WHILE, 4, list, 0);
            zzao zzaoVar2 = (zzao) list.get(1);
            zzao zzaoVar3 = (zzao) list.get(2);
            zzao zza = zzgVar.zza((zzao) list.get(3));
            if (zzgVar.zza(zzaoVar3).zze().booleanValue()) {
                zzao zzb = zzgVar.zzb((zzae) zza);
                if (zzb instanceof zzag) {
                    zzagVar = (zzag) zzb;
                    if ("break".equals(zzagVar.zzg())) {
                        return zzao.zzf;
                    }
                }
            }
            while (zzgVar.zza(zzaoVar).zze().booleanValue()) {
                zzao zzb2 = zzgVar.zzb((zzae) zza);
                if (zzb2 instanceof zzag) {
                    zzagVar = (zzag) zzb2;
                    if ("break".equals(zzagVar.zzg())) {
                        return zzao.zzf;
                    }
                    if ("return".equals(zzagVar.zzg())) {
                        return zzagVar;
                    }
                }
                zzgVar.zza(zzaoVar2);
            }
            return zzao.zzf;
        }
        switch (ordinal) {
            case 26:
                if (!(c.d(zzbk.FOR_IN, 3, list, 0) instanceof zzas)) {
                    throw new IllegalArgumentException("Variable name in FOR_IN must be a string");
                }
                return zzc(new zzbf(zzgVar, ((zzao) list.get(0)).zzc()), zzgVar.zza((zzao) list.get(1)), zzgVar.zza((zzao) list.get(2)));
            case 27:
                if (!(c.d(zzbk.FOR_IN_CONST, 3, list, 0) instanceof zzas)) {
                    throw new IllegalArgumentException("Variable name in FOR_IN_CONST must be a string");
                }
                return zzc(new zzbc(zzgVar, ((zzao) list.get(0)).zzc()), zzgVar.zza((zzao) list.get(1)), zzgVar.zza((zzao) list.get(2)));
            case 28:
                if (!(c.d(zzbk.FOR_IN_LET, 3, list, 0) instanceof zzas)) {
                    throw new IllegalArgumentException("Variable name in FOR_IN_LET must be a string");
                }
                return zzc(new zzbd(zzgVar, ((zzao) list.get(0)).zzc()), zzgVar.zza((zzao) list.get(1)), zzgVar.zza((zzao) list.get(2)));
            case 29:
                zzao zza2 = zzgVar.zza((zzao) c.d(zzbk.FOR_LET, 4, list, 0));
                if (!(zza2 instanceof zzae)) {
                    throw new IllegalArgumentException("Initializer variables in FOR_LET must be an ArrayList");
                }
                zzae zzaeVar = (zzae) zza2;
                zzao zzaoVar4 = (zzao) list.get(1);
                zzao zzaoVar5 = (zzao) list.get(2);
                zzao zza3 = zzgVar.zza((zzao) list.get(3));
                zzg zzc = zzgVar.zzc();
                for (int i7 = 0; i7 < zzaeVar.zzh(); i7++) {
                    String zzc2 = zzaeVar.zzl(i7).zzc();
                    zzc.zze(zzc2, zzgVar.zzh(zzc2));
                }
                while (zzgVar.zza(zzaoVar4).zze().booleanValue()) {
                    zzao zzb3 = zzgVar.zzb((zzae) zza3);
                    if (zzb3 instanceof zzag) {
                        zzag zzagVar2 = (zzag) zzb3;
                        if ("break".equals(zzagVar2.zzg())) {
                            return zzao.zzf;
                        }
                        if ("return".equals(zzagVar2.zzg())) {
                            return zzagVar2;
                        }
                    }
                    zzg zzc3 = zzgVar.zzc();
                    for (int i10 = 0; i10 < zzaeVar.zzh(); i10++) {
                        String zzc4 = zzaeVar.zzl(i10).zzc();
                        zzc3.zze(zzc4, zzc.zzh(zzc4));
                    }
                    zzc3.zza(zzaoVar5);
                    zzc = zzc3;
                }
                return zzao.zzf;
            case 30:
                if (!(c.d(zzbk.FOR_OF, 3, list, 0) instanceof zzas)) {
                    throw new IllegalArgumentException("Variable name in FOR_OF must be a string");
                }
                return zzd(new zzbf(zzgVar, ((zzao) list.get(0)).zzc()), zzgVar.zza((zzao) list.get(1)), zzgVar.zza((zzao) list.get(2)));
            case 31:
                if (!(c.d(zzbk.FOR_OF_CONST, 3, list, 0) instanceof zzas)) {
                    throw new IllegalArgumentException("Variable name in FOR_OF_CONST must be a string");
                }
                return zzd(new zzbc(zzgVar, ((zzao) list.get(0)).zzc()), zzgVar.zza((zzao) list.get(1)), zzgVar.zza((zzao) list.get(2)));
            case 32:
                if (!(c.d(zzbk.FOR_OF_LET, 3, list, 0) instanceof zzas)) {
                    throw new IllegalArgumentException("Variable name in FOR_OF_LET must be a string");
                }
                return zzd(new zzbd(zzgVar, ((zzao) list.get(0)).zzc()), zzgVar.zza((zzao) list.get(1)), zzgVar.zza((zzao) list.get(2)));
            default:
                return zzb(str);
        }
    }
}
