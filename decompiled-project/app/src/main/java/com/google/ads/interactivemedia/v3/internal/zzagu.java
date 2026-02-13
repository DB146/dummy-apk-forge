package com.google.ads.interactivemedia.v3.internal;

import X.c;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzagu {
    public static final /* synthetic */ int zza = 0;
    private static final Class zzb;
    private static final zzahj zzc;
    private static final zzahj zzd;
    private static final zzahj zze;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        zzb = cls;
        zzc = zzY(false);
        zzd = zzY(true);
        zze = new zzahl();
    }

    public static zzahj zzA() {
        return zze;
    }

    public static Object zzB(Object obj, int i7, List list, zzaex zzaexVar, Object obj2, zzahj zzahjVar) {
        if (zzaexVar == null) {
            return obj2;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i10 = 0;
            for (int i11 = 0; i11 < size; i11++) {
                Integer num = (Integer) list.get(i11);
                int intValue = num.intValue();
                if (zzaexVar.zza(intValue)) {
                    if (i11 != i10) {
                        list.set(i10, num);
                    }
                    i10++;
                } else {
                    obj2 = zzC(obj, i7, intValue, obj2, zzahjVar);
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
                if (!zzaexVar.zza(intValue2)) {
                    obj2 = zzC(obj, i7, intValue2, obj2, zzahjVar);
                    it.remove();
                }
            }
        }
        return obj2;
    }

    public static Object zzC(Object obj, int i7, int i10, Object obj2, zzahj zzahjVar) {
        if (obj2 == null) {
            obj2 = zzahjVar.zzc(obj);
        }
        zzahjVar.zzl(obj2, i7, i10);
        return obj2;
    }

    public static void zzD(zzahj zzahjVar, Object obj, Object obj2) {
        zzahjVar.zzo(obj, zzahjVar.zze(zzahjVar.zzd(obj), zzahjVar.zzd(obj2)));
    }

    public static void zzE(Class cls) {
        Class cls2;
        if (!zzaet.class.isAssignableFrom(cls) && (cls2 = zzb) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    public static void zzF(int i7, List list, zzaib zzaibVar, boolean z8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzaibVar.zzc(i7, list, z8);
    }

    public static void zzG(int i7, List list, zzaib zzaibVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzaibVar.zze(i7, list);
    }

    public static void zzH(int i7, List list, zzaib zzaibVar, boolean z8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzaibVar.zzg(i7, list, z8);
    }

    public static void zzI(int i7, List list, zzaib zzaibVar, boolean z8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzaibVar.zzj(i7, list, z8);
    }

    public static void zzJ(int i7, List list, zzaib zzaibVar, boolean z8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzaibVar.zzl(i7, list, z8);
    }

    public static void zzK(int i7, List list, zzaib zzaibVar, boolean z8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzaibVar.zzn(i7, list, z8);
    }

    public static void zzL(int i7, List list, zzaib zzaibVar, boolean z8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzaibVar.zzp(i7, list, z8);
    }

    public static void zzM(int i7, List list, zzaib zzaibVar, zzags zzagsVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            ((zzaeb) zzaibVar).zzq(i7, list.get(i10), zzagsVar);
        }
    }

    public static void zzN(int i7, List list, zzaib zzaibVar, boolean z8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzaibVar.zzs(i7, list, z8);
    }

    public static void zzO(int i7, List list, zzaib zzaibVar, boolean z8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzaibVar.zzu(i7, list, z8);
    }

    public static void zzP(int i7, List list, zzaib zzaibVar, zzags zzagsVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            ((zzaeb) zzaibVar).zzv(i7, list.get(i10), zzagsVar);
        }
    }

    public static void zzQ(int i7, List list, zzaib zzaibVar, boolean z8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzaibVar.zzx(i7, list, z8);
    }

    public static void zzR(int i7, List list, zzaib zzaibVar, boolean z8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzaibVar.zzz(i7, list, z8);
    }

    public static void zzS(int i7, List list, zzaib zzaibVar, boolean z8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzaibVar.zzB(i7, list, z8);
    }

    public static void zzT(int i7, List list, zzaib zzaibVar, boolean z8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzaibVar.zzD(i7, list, z8);
    }

    public static void zzU(int i7, List list, zzaib zzaibVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzaibVar.zzG(i7, list);
    }

    public static void zzV(int i7, List list, zzaib zzaibVar, boolean z8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzaibVar.zzI(i7, list, z8);
    }

    public static void zzW(int i7, List list, zzaib zzaibVar, boolean z8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzaibVar.zzK(i7, list, z8);
    }

    public static boolean zzX(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    private static zzahj zzY(boolean z8) {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        try {
            return (zzahj) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z8));
        } catch (Throwable unused2) {
            return null;
        }
    }

    public static int zza(int i7, List list, boolean z8) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzaea.zzx(i7 << 3) + 1) * size;
    }

    public static int zzb(int i7, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzx = zzaea.zzx(i7 << 3) * size;
        for (int i10 = 0; i10 < list.size(); i10++) {
            int zzd2 = ((zzadr) list.get(i10)).zzd();
            zzx = c.r(zzd2, zzd2, zzx);
        }
        return zzx;
    }

    public static int zzc(int i7, List list, boolean z8) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzaea.zzx(i7 << 3) * size) + zzd(list);
    }

    public static int zzd(List list) {
        int i7;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzaeu) {
            zzaeu zzaeuVar = (zzaeu) list;
            i7 = 0;
            while (i10 < size) {
                i7 += zzaea.zzu(zzaeuVar.zze(i10));
                i10++;
            }
        } else {
            i7 = 0;
            while (i10 < size) {
                i7 += zzaea.zzu(((Integer) list.get(i10)).intValue());
                i10++;
            }
        }
        return i7;
    }

    public static int zze(int i7, List list, boolean z8) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzaea.zzx(i7 << 3) + 4) * size;
    }

    public static int zzf(List list) {
        return list.size() * 4;
    }

    public static int zzg(int i7, List list, boolean z8) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzaea.zzx(i7 << 3) + 8) * size;
    }

    public static int zzh(List list) {
        return list.size() * 8;
    }

    public static int zzi(int i7, List list, zzags zzagsVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            i10 += zzaea.zzt(i7, (zzafz) list.get(i11), zzagsVar);
        }
        return i10;
    }

    public static int zzj(int i7, List list, boolean z8) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzaea.zzx(i7 << 3) * size) + zzk(list);
    }

    public static int zzk(List list) {
        int i7;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzaeu) {
            zzaeu zzaeuVar = (zzaeu) list;
            i7 = 0;
            while (i10 < size) {
                i7 += zzaea.zzu(zzaeuVar.zze(i10));
                i10++;
            }
        } else {
            i7 = 0;
            while (i10 < size) {
                i7 += zzaea.zzu(((Integer) list.get(i10)).intValue());
                i10++;
            }
        }
        return i7;
    }

    public static int zzl(int i7, List list, boolean z8) {
        if (list.size() == 0) {
            return 0;
        }
        return (zzaea.zzx(i7 << 3) * list.size()) + zzm(list);
    }

    public static int zzm(List list) {
        int i7;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzafo) {
            zzafo zzafoVar = (zzafo) list;
            i7 = 0;
            while (i10 < size) {
                i7 += zzaea.zzy(zzafoVar.zze(i10));
                i10++;
            }
        } else {
            i7 = 0;
            while (i10 < size) {
                i7 += zzaea.zzy(((Long) list.get(i10)).longValue());
                i10++;
            }
        }
        return i7;
    }

    public static int zzn(int i7, Object obj, zzags zzagsVar) {
        if (!(obj instanceof zzaff)) {
            return zzaea.zzx(i7 << 3) + zzaea.zzv((zzafz) obj, zzagsVar);
        }
        int i10 = zzaea.zzb;
        int zza2 = ((zzaff) obj).zza();
        return zzaea.zzx(i7 << 3) + zzaea.zzx(zza2) + zza2;
    }

    public static int zzo(int i7, List list, zzags zzagsVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzx = zzaea.zzx(i7 << 3) * size;
        for (int i10 = 0; i10 < size; i10++) {
            Object obj = list.get(i10);
            if (obj instanceof zzaff) {
                int zza2 = ((zzaff) obj).zza();
                zzx = c.r(zza2, zza2, zzx);
            } else {
                zzx = zzaea.zzv((zzafz) obj, zzagsVar) + zzx;
            }
        }
        return zzx;
    }

    public static int zzp(int i7, List list, boolean z8) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzaea.zzx(i7 << 3) * size) + zzq(list);
    }

    public static int zzq(List list) {
        int i7;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzaeu) {
            zzaeu zzaeuVar = (zzaeu) list;
            i7 = 0;
            while (i10 < size) {
                int zze2 = zzaeuVar.zze(i10);
                i7 += zzaea.zzx((zze2 >> 31) ^ (zze2 + zze2));
                i10++;
            }
        } else {
            i7 = 0;
            while (i10 < size) {
                int intValue = ((Integer) list.get(i10)).intValue();
                i7 += zzaea.zzx((intValue >> 31) ^ (intValue + intValue));
                i10++;
            }
        }
        return i7;
    }

    public static int zzr(int i7, List list, boolean z8) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzaea.zzx(i7 << 3) * size) + zzs(list);
    }

    public static int zzs(List list) {
        int i7;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzafo) {
            zzafo zzafoVar = (zzafo) list;
            i7 = 0;
            while (i10 < size) {
                long zze2 = zzafoVar.zze(i10);
                i7 += zzaea.zzy((zze2 >> 63) ^ (zze2 + zze2));
                i10++;
            }
        } else {
            i7 = 0;
            while (i10 < size) {
                long longValue = ((Long) list.get(i10)).longValue();
                i7 += zzaea.zzy((longValue >> 63) ^ (longValue + longValue));
                i10++;
            }
        }
        return i7;
    }

    public static int zzt(int i7, List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        int i11 = zzaea.zzb;
        boolean z8 = list instanceof zzafh;
        int zzx = zzaea.zzx(i7 << 3) * size;
        if (z8) {
            zzafh zzafhVar = (zzafh) list;
            while (i10 < size) {
                Object zzf = zzafhVar.zzf(i10);
                if (zzf instanceof zzadr) {
                    int zzd2 = ((zzadr) zzf).zzd();
                    zzx = c.r(zzd2, zzd2, zzx);
                } else {
                    zzx = zzaea.zzw((String) zzf) + zzx;
                }
                i10++;
            }
        } else {
            while (i10 < size) {
                Object obj = list.get(i10);
                if (obj instanceof zzadr) {
                    int zzd3 = ((zzadr) obj).zzd();
                    zzx = c.r(zzd3, zzd3, zzx);
                } else {
                    zzx = zzaea.zzw((String) obj) + zzx;
                }
                i10++;
            }
        }
        return zzx;
    }

    public static int zzu(int i7, List list, boolean z8) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzaea.zzx(i7 << 3) * size) + zzv(list);
    }

    public static int zzv(List list) {
        int i7;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzaeu) {
            zzaeu zzaeuVar = (zzaeu) list;
            i7 = 0;
            while (i10 < size) {
                i7 += zzaea.zzx(zzaeuVar.zze(i10));
                i10++;
            }
        } else {
            i7 = 0;
            while (i10 < size) {
                i7 += zzaea.zzx(((Integer) list.get(i10)).intValue());
                i10++;
            }
        }
        return i7;
    }

    public static int zzw(int i7, List list, boolean z8) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzaea.zzx(i7 << 3) * size) + zzx(list);
    }

    public static int zzx(List list) {
        int i7;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzafo) {
            zzafo zzafoVar = (zzafo) list;
            i7 = 0;
            while (i10 < size) {
                i7 += zzaea.zzy(zzafoVar.zze(i10));
                i10++;
            }
        } else {
            i7 = 0;
            while (i10 < size) {
                i7 += zzaea.zzy(((Long) list.get(i10)).longValue());
                i10++;
            }
        }
        return i7;
    }

    public static zzahj zzy() {
        return zzc;
    }

    public static zzahj zzz() {
        return zzd;
    }
}
