package com.google.android.gms.internal.pal;

import X.c;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzaet {
    private static final Class zza;
    private static final zzafi zzb;
    private static final zzafi zzc;
    private static final zzafi zzd;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        zza = cls;
        zzb = zzab(false);
        zzc = zzab(true);
        zzd = new zzafk();
    }

    public static zzafi zzA() {
        return zzc;
    }

    public static zzafi zzB() {
        return zzd;
    }

    public static Object zzC(int i7, List list, zzadd zzaddVar, Object obj, zzafi zzafiVar) {
        if (zzaddVar == null) {
            return obj;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i10 = 0;
            for (int i11 = 0; i11 < size; i11++) {
                Integer num = (Integer) list.get(i11);
                int intValue = num.intValue();
                if (zzaddVar.zza(intValue)) {
                    if (i11 != i10) {
                        list.set(i10, num);
                    }
                    i10++;
                } else {
                    obj = zzD(i7, intValue, obj, zzafiVar);
                }
            }
            if (i10 != size) {
                list.subList(i10, size).clear();
                return obj;
            }
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = ((Integer) it.next()).intValue();
                if (!zzaddVar.zza(intValue2)) {
                    obj = zzD(i7, intValue2, obj, zzafiVar);
                    it.remove();
                }
            }
        }
        return obj;
    }

    public static Object zzD(int i7, int i10, Object obj, zzafi zzafiVar) {
        if (obj == null) {
            obj = zzafiVar.zzf();
        }
        zzafiVar.zzl(obj, i7, i10);
        return obj;
    }

    public static void zzE(zzacn zzacnVar, Object obj, Object obj2) {
        zzacnVar.zza(obj2);
        throw null;
    }

    public static void zzF(zzafi zzafiVar, Object obj, Object obj2) {
        zzafiVar.zzo(obj, zzafiVar.zze(zzafiVar.zzd(obj), zzafiVar.zzd(obj2)));
    }

    public static void zzG(Class cls) {
        Class cls2;
        if (!zzacz.class.isAssignableFrom(cls) && (cls2 = zza) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    public static void zzH(int i7, List list, zzaga zzagaVar, boolean z8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzagaVar.zzc(i7, list, z8);
    }

    public static void zzI(int i7, List list, zzaga zzagaVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzagaVar.zze(i7, list);
    }

    public static void zzJ(int i7, List list, zzaga zzagaVar, boolean z8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzagaVar.zzg(i7, list, z8);
    }

    public static void zzK(int i7, List list, zzaga zzagaVar, boolean z8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzagaVar.zzj(i7, list, z8);
    }

    public static void zzL(int i7, List list, zzaga zzagaVar, boolean z8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzagaVar.zzl(i7, list, z8);
    }

    public static void zzM(int i7, List list, zzaga zzagaVar, boolean z8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzagaVar.zzn(i7, list, z8);
    }

    public static void zzN(int i7, List list, zzaga zzagaVar, boolean z8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzagaVar.zzp(i7, list, z8);
    }

    public static void zzO(int i7, List list, zzaga zzagaVar, zzaer zzaerVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            ((zzaci) zzagaVar).zzq(i7, list.get(i10), zzaerVar);
        }
    }

    public static void zzP(int i7, List list, zzaga zzagaVar, boolean z8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzagaVar.zzs(i7, list, z8);
    }

    public static void zzQ(int i7, List list, zzaga zzagaVar, boolean z8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzagaVar.zzu(i7, list, z8);
    }

    public static void zzR(int i7, List list, zzaga zzagaVar, zzaer zzaerVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            ((zzaci) zzagaVar).zzv(i7, list.get(i10), zzaerVar);
        }
    }

    public static void zzS(int i7, List list, zzaga zzagaVar, boolean z8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzagaVar.zzx(i7, list, z8);
    }

    public static void zzT(int i7, List list, zzaga zzagaVar, boolean z8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzagaVar.zzz(i7, list, z8);
    }

    public static void zzU(int i7, List list, zzaga zzagaVar, boolean z8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzagaVar.zzB(i7, list, z8);
    }

    public static void zzV(int i7, List list, zzaga zzagaVar, boolean z8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzagaVar.zzD(i7, list, z8);
    }

    public static void zzW(int i7, List list, zzaga zzagaVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzagaVar.zzG(i7, list);
    }

    public static void zzX(int i7, List list, zzaga zzagaVar, boolean z8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzagaVar.zzI(i7, list, z8);
    }

    public static void zzY(int i7, List list, zzaga zzagaVar, boolean z8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzagaVar.zzK(i7, list, z8);
    }

    public static boolean zzZ(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static int zza(int i7, List list, boolean z8) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzach.zzA(i7 << 3) + 1) * size;
    }

    public static void zzaa(zzaea zzaeaVar, Object obj, Object obj2, long j) {
        zzafs.zzs(obj, j, zzaea.zzc(zzafs.zzf(obj, j), zzafs.zzf(obj2, j)));
    }

    private static zzafi zzab(boolean z8) {
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
            return (zzafi) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z8));
        } catch (Throwable unused2) {
            return null;
        }
    }

    public static int zzb(List list) {
        return list.size();
    }

    public static int zzc(int i7, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzz = zzach.zzz(i7) * size;
        for (int i10 = 0; i10 < list.size(); i10++) {
            zzz += zzach.zzt((zzaby) list.get(i10));
        }
        return zzz;
    }

    public static int zzd(int i7, List list, boolean z8) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzach.zzz(i7) * size) + zze(list);
    }

    public static int zze(List list) {
        int i7;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzada) {
            zzada zzadaVar = (zzada) list;
            i7 = 0;
            while (i10 < size) {
                i7 += zzach.zzv(zzadaVar.zze(i10));
                i10++;
            }
        } else {
            i7 = 0;
            while (i10 < size) {
                i7 += zzach.zzv(((Integer) list.get(i10)).intValue());
                i10++;
            }
        }
        return i7;
    }

    public static int zzf(int i7, List list, boolean z8) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzach.zzA(i7 << 3) + 4) * size;
    }

    public static int zzg(List list) {
        return list.size() * 4;
    }

    public static int zzh(int i7, List list, boolean z8) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzach.zzA(i7 << 3) + 8) * size;
    }

    public static int zzi(List list) {
        return list.size() * 8;
    }

    public static int zzj(int i7, List list, zzaer zzaerVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            i10 += zzach.zzu(i7, (zzaef) list.get(i11), zzaerVar);
        }
        return i10;
    }

    public static int zzk(int i7, List list, boolean z8) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzach.zzz(i7) * size) + zzl(list);
    }

    public static int zzl(List list) {
        int i7;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzada) {
            zzada zzadaVar = (zzada) list;
            i7 = 0;
            while (i10 < size) {
                i7 += zzach.zzv(zzadaVar.zze(i10));
                i10++;
            }
        } else {
            i7 = 0;
            while (i10 < size) {
                i7 += zzach.zzv(((Integer) list.get(i10)).intValue());
                i10++;
            }
        }
        return i7;
    }

    public static int zzm(int i7, List list, boolean z8) {
        if (list.size() == 0) {
            return 0;
        }
        return (zzach.zzz(i7) * list.size()) + zzn(list);
    }

    public static int zzn(List list) {
        int i7;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzadu) {
            zzadu zzaduVar = (zzadu) list;
            i7 = 0;
            while (i10 < size) {
                i7 += zzach.zzB(zzaduVar.zze(i10));
                i10++;
            }
        } else {
            i7 = 0;
            while (i10 < size) {
                i7 += zzach.zzB(((Long) list.get(i10)).longValue());
                i10++;
            }
        }
        return i7;
    }

    public static int zzo(int i7, Object obj, zzaer zzaerVar) {
        if (!(obj instanceof zzadl)) {
            return zzach.zzx((zzaef) obj, zzaerVar) + zzach.zzA(i7 << 3);
        }
        int zzA = zzach.zzA(i7 << 3);
        int zza2 = ((zzadl) obj).zza();
        return c.w(zza2, zza2, zzA);
    }

    public static int zzp(int i7, List list, zzaer zzaerVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzz = zzach.zzz(i7) * size;
        for (int i10 = 0; i10 < size; i10++) {
            Object obj = list.get(i10);
            zzz = (obj instanceof zzadl ? zzach.zzw((zzadl) obj) : zzach.zzx((zzaef) obj, zzaerVar)) + zzz;
        }
        return zzz;
    }

    public static int zzq(int i7, List list, boolean z8) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzach.zzz(i7) * size) + zzr(list);
    }

    public static int zzr(List list) {
        int i7;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzada) {
            zzada zzadaVar = (zzada) list;
            i7 = 0;
            while (i10 < size) {
                int zze = zzadaVar.zze(i10);
                i7 += zzach.zzA((zze >> 31) ^ (zze + zze));
                i10++;
            }
        } else {
            i7 = 0;
            while (i10 < size) {
                int intValue = ((Integer) list.get(i10)).intValue();
                i7 += zzach.zzA((intValue >> 31) ^ (intValue + intValue));
                i10++;
            }
        }
        return i7;
    }

    public static int zzs(int i7, List list, boolean z8) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzach.zzz(i7) * size) + zzt(list);
    }

    public static int zzt(List list) {
        int i7;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzadu) {
            zzadu zzaduVar = (zzadu) list;
            i7 = 0;
            while (i10 < size) {
                long zze = zzaduVar.zze(i10);
                i7 += zzach.zzB((zze >> 63) ^ (zze + zze));
                i10++;
            }
        } else {
            i7 = 0;
            while (i10 < size) {
                long longValue = ((Long) list.get(i10)).longValue();
                i7 += zzach.zzB((longValue >> 63) ^ (longValue + longValue));
                i10++;
            }
        }
        return i7;
    }

    public static int zzu(int i7, List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        int zzz = zzach.zzz(i7) * size;
        if (list instanceof zzadn) {
            zzadn zzadnVar = (zzadn) list;
            while (i10 < size) {
                Object zzf = zzadnVar.zzf(i10);
                zzz = (zzf instanceof zzaby ? zzach.zzt((zzaby) zzf) : zzach.zzy((String) zzf)) + zzz;
                i10++;
            }
        } else {
            while (i10 < size) {
                Object obj = list.get(i10);
                zzz = (obj instanceof zzaby ? zzach.zzt((zzaby) obj) : zzach.zzy((String) obj)) + zzz;
                i10++;
            }
        }
        return zzz;
    }

    public static int zzv(int i7, List list, boolean z8) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzach.zzz(i7) * size) + zzw(list);
    }

    public static int zzw(List list) {
        int i7;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzada) {
            zzada zzadaVar = (zzada) list;
            i7 = 0;
            while (i10 < size) {
                i7 += zzach.zzA(zzadaVar.zze(i10));
                i10++;
            }
        } else {
            i7 = 0;
            while (i10 < size) {
                i7 += zzach.zzA(((Integer) list.get(i10)).intValue());
                i10++;
            }
        }
        return i7;
    }

    public static int zzx(int i7, List list, boolean z8) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzach.zzz(i7) * size) + zzy(list);
    }

    public static int zzy(List list) {
        int i7;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzadu) {
            zzadu zzaduVar = (zzadu) list;
            i7 = 0;
            while (i10 < size) {
                i7 += zzach.zzB(zzaduVar.zze(i10));
                i10++;
            }
        } else {
            i7 = 0;
            while (i10 < size) {
                i7 += zzach.zzB(((Long) list.get(i10)).longValue());
                i10++;
            }
        }
        return i7;
    }

    public static zzafi zzz() {
        return zzb;
    }
}
