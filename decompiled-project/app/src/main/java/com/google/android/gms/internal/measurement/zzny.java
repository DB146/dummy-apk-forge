package com.google.android.gms.internal.measurement;

import X.c;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzny {
    public static final /* synthetic */ int zza = 0;
    private static final zzoh zzb;

    static {
        int i7 = zznt.zza;
        zzb = new zzoj();
    }

    public static zzoh zzA() {
        return zzb;
    }

    public static boolean zzB(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static void zzC(zzlr zzlrVar, Object obj, Object obj2) {
        if (((zzmb) obj2).zzb.zza.isEmpty()) {
            return;
        }
        throw null;
    }

    public static void zzD(zzoh zzohVar, Object obj, Object obj2) {
        zzme zzmeVar = (zzme) obj;
        zzoi zzoiVar = zzmeVar.zzc;
        zzoi zzoiVar2 = ((zzme) obj2).zzc;
        if (!zzoi.zza().equals(zzoiVar2)) {
            if (zzoi.zza().equals(zzoiVar)) {
                zzoiVar = zzoi.zzc(zzoiVar, zzoiVar2);
            } else {
                zzoiVar.zzl(zzoiVar2);
            }
        }
        zzmeVar.zzc = zzoiVar;
    }

    public static Object zzE(Object obj, int i7, int i10, Object obj2, zzoh zzohVar) {
        if (obj2 == null) {
            obj2 = zzohVar.zza(obj);
        }
        ((zzoi) obj2).zzk(i7 << 3, Long.valueOf(i10));
        return obj2;
    }

    public static void zza(int i7, List list, zzou zzouVar, boolean z8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzouVar.zzC(i7, list, z8);
    }

    public static void zzb(int i7, List list, zzou zzouVar, boolean z8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzouVar.zzB(i7, list, z8);
    }

    public static void zzc(int i7, List list, zzou zzouVar, boolean z8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzouVar.zzy(i7, list, z8);
    }

    public static void zzd(int i7, List list, zzou zzouVar, boolean z8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzouVar.zzz(i7, list, z8);
    }

    public static void zze(int i7, List list, zzou zzouVar, boolean z8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzouVar.zzL(i7, list, z8);
    }

    public static void zzf(int i7, List list, zzou zzouVar, boolean z8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzouVar.zzA(i7, list, z8);
    }

    public static void zzg(int i7, List list, zzou zzouVar, boolean z8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzouVar.zzJ(i7, list, z8);
    }

    public static void zzh(int i7, List list, zzou zzouVar, boolean z8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzouVar.zzw(i7, list, z8);
    }

    public static void zzi(int i7, List list, zzou zzouVar, boolean z8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzouVar.zzH(i7, list, z8);
    }

    public static void zzj(int i7, List list, zzou zzouVar, boolean z8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzouVar.zzK(i7, list, z8);
    }

    public static void zzk(int i7, List list, zzou zzouVar, boolean z8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzouVar.zzx(i7, list, z8);
    }

    public static void zzl(int i7, List list, zzou zzouVar, boolean z8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzouVar.zzI(i7, list, z8);
    }

    public static void zzm(int i7, List list, zzou zzouVar, boolean z8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzouVar.zzD(i7, list, z8);
    }

    public static void zzn(int i7, List list, zzou zzouVar, boolean z8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzouVar.zzE(i7, list, z8);
    }

    public static int zzo(List list) {
        int i7;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzmz) {
            zzmz zzmzVar = (zzmz) list;
            i7 = 0;
            while (i10 < size) {
                i7 += zzll.zzA(zzmzVar.zzc(i10));
                i10++;
            }
        } else {
            i7 = 0;
            while (i10 < size) {
                i7 += zzll.zzA(((Long) list.get(i10)).longValue());
                i10++;
            }
        }
        return i7;
    }

    public static int zzp(List list) {
        int i7;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzmz) {
            zzmz zzmzVar = (zzmz) list;
            i7 = 0;
            while (i10 < size) {
                i7 += zzll.zzA(zzmzVar.zzc(i10));
                i10++;
            }
        } else {
            i7 = 0;
            while (i10 < size) {
                i7 += zzll.zzA(((Long) list.get(i10)).longValue());
                i10++;
            }
        }
        return i7;
    }

    public static int zzq(List list) {
        int i7;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzmz) {
            zzmz zzmzVar = (zzmz) list;
            i7 = 0;
            while (i10 < size) {
                long zzc = zzmzVar.zzc(i10);
                i7 += zzll.zzA((zzc >> 63) ^ (zzc + zzc));
                i10++;
            }
        } else {
            i7 = 0;
            while (i10 < size) {
                long longValue = ((Long) list.get(i10)).longValue();
                i7 += zzll.zzA((longValue >> 63) ^ (longValue + longValue));
                i10++;
            }
        }
        return i7;
    }

    public static int zzr(List list) {
        int i7;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzmf) {
            zzmf zzmfVar = (zzmf) list;
            i7 = 0;
            while (i10 < size) {
                i7 += zzll.zzA(zzmfVar.zzf(i10));
                i10++;
            }
        } else {
            i7 = 0;
            while (i10 < size) {
                i7 += zzll.zzA(((Integer) list.get(i10)).intValue());
                i10++;
            }
        }
        return i7;
    }

    public static int zzs(List list) {
        int i7;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzmf) {
            zzmf zzmfVar = (zzmf) list;
            i7 = 0;
            while (i10 < size) {
                i7 += zzll.zzA(zzmfVar.zzf(i10));
                i10++;
            }
        } else {
            i7 = 0;
            while (i10 < size) {
                i7 += zzll.zzA(((Integer) list.get(i10)).intValue());
                i10++;
            }
        }
        return i7;
    }

    public static int zzt(List list) {
        int i7;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzmf) {
            zzmf zzmfVar = (zzmf) list;
            i7 = 0;
            while (i10 < size) {
                i7 += zzll.zzz(zzmfVar.zzf(i10));
                i10++;
            }
        } else {
            i7 = 0;
            while (i10 < size) {
                i7 += zzll.zzz(((Integer) list.get(i10)).intValue());
                i10++;
            }
        }
        return i7;
    }

    public static int zzu(List list) {
        int i7;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzmf) {
            zzmf zzmfVar = (zzmf) list;
            i7 = 0;
            while (i10 < size) {
                int zzf = zzmfVar.zzf(i10);
                i7 += zzll.zzz((zzf >> 31) ^ (zzf + zzf));
                i10++;
            }
        } else {
            i7 = 0;
            while (i10 < size) {
                int intValue = ((Integer) list.get(i10)).intValue();
                i7 += zzll.zzz((intValue >> 31) ^ (intValue + intValue));
                i10++;
            }
        }
        return i7;
    }

    public static int zzv(List list) {
        return list.size() * 4;
    }

    public static int zzw(int i7, List list, boolean z8) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzll.zzz(i7 << 3) + 4) * size;
    }

    public static int zzx(List list) {
        return list.size() * 8;
    }

    public static int zzy(int i7, List list, boolean z8) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzll.zzz(i7 << 3) + 8) * size;
    }

    public static int zzz(int i7, Object obj, zznw zznwVar) {
        int i10 = i7 << 3;
        if (!(obj instanceof zzmv)) {
            return zzll.zzD((zznl) obj, zznwVar) + zzll.zzz(i10);
        }
        int zzz = zzll.zzz(i10);
        int zzb2 = ((zzmv) obj).zzb();
        return c.u(zzb2, zzb2, zzz);
    }
}
