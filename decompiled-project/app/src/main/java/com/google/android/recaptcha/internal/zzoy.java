package com.google.android.recaptcha.internal;

import X.c;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzoy {
    public static final /* synthetic */ int zza = 0;
    private static final zzpl zzb;

    static {
        int i7 = zzos.zza;
        zzb = new zzpn();
    }

    public static void zzA(int i7, List list, zzpy zzpyVar, boolean z8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzpyVar.zzA(i7, list, z8);
    }

    public static void zzB(int i7, List list, zzpy zzpyVar, boolean z8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzpyVar.zzC(i7, list, z8);
    }

    public static void zzC(int i7, List list, zzpy zzpyVar, boolean z8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzpyVar.zzE(i7, list, z8);
    }

    public static void zzD(int i7, List list, zzpy zzpyVar, boolean z8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzpyVar.zzJ(i7, list, z8);
    }

    public static void zzE(int i7, List list, zzpy zzpyVar, boolean z8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzpyVar.zzL(i7, list, z8);
    }

    public static boolean zzF(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static int zza(List list) {
        int i7;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzne) {
            zzne zzneVar = (zzne) list;
            i7 = 0;
            while (i10 < size) {
                i7 += zzln.zzB(zzneVar.zze(i10));
                i10++;
            }
        } else {
            i7 = 0;
            while (i10 < size) {
                i7 += zzln.zzB(((Integer) list.get(i10)).intValue());
                i10++;
            }
        }
        return i7;
    }

    public static int zzb(int i7, List list, boolean z8) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzln.zzA(i7 << 3) + 4) * size;
    }

    public static int zzc(List list) {
        return list.size() * 4;
    }

    public static int zzd(int i7, List list, boolean z8) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzln.zzA(i7 << 3) + 8) * size;
    }

    public static int zze(List list) {
        return list.size() * 8;
    }

    public static int zzf(List list) {
        int i7;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzne) {
            zzne zzneVar = (zzne) list;
            i7 = 0;
            while (i10 < size) {
                i7 += zzln.zzB(zzneVar.zze(i10));
                i10++;
            }
        } else {
            i7 = 0;
            while (i10 < size) {
                i7 += zzln.zzB(((Integer) list.get(i10)).intValue());
                i10++;
            }
        }
        return i7;
    }

    public static int zzg(List list) {
        int i7;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zznx) {
            zznx zznxVar = (zznx) list;
            i7 = 0;
            while (i10 < size) {
                i7 += zzln.zzB(zznxVar.zze(i10));
                i10++;
            }
        } else {
            i7 = 0;
            while (i10 < size) {
                i7 += zzln.zzB(((Long) list.get(i10)).longValue());
                i10++;
            }
        }
        return i7;
    }

    public static int zzh(int i7, Object obj, zzow zzowVar) {
        int i10 = i7 << 3;
        if (!(obj instanceof zznt)) {
            return zzln.zzy((zzoi) obj, zzowVar) + zzln.zzA(i10);
        }
        int zzA = zzln.zzA(i10);
        int zza2 = ((zznt) obj).zza();
        return c.y(zza2, zza2, zzA);
    }

    public static int zzi(List list) {
        int i7;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzne) {
            zzne zzneVar = (zzne) list;
            i7 = 0;
            while (i10 < size) {
                int zze = zzneVar.zze(i10);
                i7 += zzln.zzA((zze >> 31) ^ (zze + zze));
                i10++;
            }
        } else {
            i7 = 0;
            while (i10 < size) {
                int intValue = ((Integer) list.get(i10)).intValue();
                i7 += zzln.zzA((intValue >> 31) ^ (intValue + intValue));
                i10++;
            }
        }
        return i7;
    }

    public static int zzj(List list) {
        int i7;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zznx) {
            zznx zznxVar = (zznx) list;
            i7 = 0;
            while (i10 < size) {
                long zze = zznxVar.zze(i10);
                i7 += zzln.zzB((zze >> 63) ^ (zze + zze));
                i10++;
            }
        } else {
            i7 = 0;
            while (i10 < size) {
                long longValue = ((Long) list.get(i10)).longValue();
                i7 += zzln.zzB((longValue >> 63) ^ (longValue + longValue));
                i10++;
            }
        }
        return i7;
    }

    public static int zzk(List list) {
        int i7;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzne) {
            zzne zzneVar = (zzne) list;
            i7 = 0;
            while (i10 < size) {
                i7 += zzln.zzA(zzneVar.zze(i10));
                i10++;
            }
        } else {
            i7 = 0;
            while (i10 < size) {
                i7 += zzln.zzA(((Integer) list.get(i10)).intValue());
                i10++;
            }
        }
        return i7;
    }

    public static int zzl(List list) {
        int i7;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zznx) {
            zznx zznxVar = (zznx) list;
            i7 = 0;
            while (i10 < size) {
                i7 += zzln.zzB(zznxVar.zze(i10));
                i10++;
            }
        } else {
            i7 = 0;
            while (i10 < size) {
                i7 += zzln.zzB(((Long) list.get(i10)).longValue());
                i10++;
            }
        }
        return i7;
    }

    public static zzpl zzm() {
        return zzb;
    }

    public static Object zzn(Object obj, int i7, List list, zznh zznhVar, Object obj2, zzpl zzplVar) {
        if (zznhVar == null) {
            return obj2;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i10 = 0;
            for (int i11 = 0; i11 < size; i11++) {
                Integer num = (Integer) list.get(i11);
                int intValue = num.intValue();
                if (zznhVar.zza(intValue)) {
                    if (i11 != i10) {
                        list.set(i10, num);
                    }
                    i10++;
                } else {
                    obj2 = zzo(obj, i7, intValue, obj2, zzplVar);
                }
            }
            if (i10 != size) {
                list.subList(i10, size).clear();
                return obj2;
            }
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = ((Integer) it.next()).intValue();
                if (!zznhVar.zza(intValue2)) {
                    obj2 = zzo(obj, i7, intValue2, obj2, zzplVar);
                    it.remove();
                }
            }
        }
        return obj2;
    }

    public static Object zzo(Object obj, int i7, int i10, Object obj2, zzpl zzplVar) {
        if (obj2 == null) {
            obj2 = zzplVar.zza(obj);
        }
        zzplVar.zzh(obj2, i7, i10);
        return obj2;
    }

    public static void zzp(zzmp zzmpVar, Object obj, Object obj2) {
        zzmt zzmtVar = ((zzna) obj2).zzb;
        if (zzmtVar.zza.isEmpty()) {
            return;
        }
        ((zzna) obj).zzi().zzh(zzmtVar);
    }

    public static void zzq(zzpl zzplVar, Object obj, Object obj2) {
        zznd zzndVar = (zznd) obj;
        zzpm zzpmVar = zzndVar.zzc;
        zzpm zzpmVar2 = ((zznd) obj2).zzc;
        if (!zzpm.zzc().equals(zzpmVar2)) {
            if (zzpm.zzc().equals(zzpmVar)) {
                zzpmVar = zzpm.zze(zzpmVar, zzpmVar2);
            } else {
                zzpmVar.zzd(zzpmVar2);
            }
        }
        zzndVar.zzc = zzpmVar;
    }

    public static void zzr(int i7, List list, zzpy zzpyVar, boolean z8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzpyVar.zzc(i7, list, z8);
    }

    public static void zzs(int i7, List list, zzpy zzpyVar, boolean z8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzpyVar.zzg(i7, list, z8);
    }

    public static void zzt(int i7, List list, zzpy zzpyVar, boolean z8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzpyVar.zzj(i7, list, z8);
    }

    public static void zzu(int i7, List list, zzpy zzpyVar, boolean z8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzpyVar.zzl(i7, list, z8);
    }

    public static void zzv(int i7, List list, zzpy zzpyVar, boolean z8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzpyVar.zzn(i7, list, z8);
    }

    public static void zzw(int i7, List list, zzpy zzpyVar, boolean z8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzpyVar.zzp(i7, list, z8);
    }

    public static void zzx(int i7, List list, zzpy zzpyVar, boolean z8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzpyVar.zzs(i7, list, z8);
    }

    public static void zzy(int i7, List list, zzpy zzpyVar, boolean z8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzpyVar.zzu(i7, list, z8);
    }

    public static void zzz(int i7, List list, zzpy zzpyVar, boolean z8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzpyVar.zzy(i7, list, z8);
    }
}
