package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzamx {
    private static final zzano<?, ?> zza = new zzanq();

    public static int zza(int i7, Object obj, zzamv<?> zzamvVar) {
        return obj instanceof zzalk ? zzakg.zzb(i7, (zzalk) obj) : zzakg.zzb(i7, (zzamc) obj, zzamvVar);
    }

    public static int zza(int i7, List<zzajp> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzi = zzakg.zzi(i7) * size;
        for (int i10 = 0; i10 < list.size(); i10++) {
            zzi += zzakg.zza(list.get(i10));
        }
        return zzi;
    }

    public static int zza(int i7, List<zzamc> list, zzamv<?> zzamvVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            i10 += zzakg.zza(i7, list.get(i11), zzamvVar);
        }
        return i10;
    }

    public static int zza(int i7, List<?> list, boolean z8) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzakg.zza(i7, true) * size;
    }

    public static int zza(List<?> list) {
        return list.size();
    }

    public static zzano<?, ?> zza() {
        return zza;
    }

    public static <UT, UB> UB zza(Object obj, int i7, int i10, UB ub2, zzano<UT, UB> zzanoVar) {
        if (ub2 == null) {
            ub2 = zzanoVar.zzc(obj);
        }
        zzanoVar.zzb(ub2, i7, i10);
        return ub2;
    }

    public static <UT, UB> UB zza(Object obj, int i7, List<Integer> list, zzald zzaldVar, UB ub2, zzano<UT, UB> zzanoVar) {
        if (zzaldVar == null) {
            return ub2;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i10 = 0;
            for (int i11 = 0; i11 < size; i11++) {
                Integer num = list.get(i11);
                int intValue = num.intValue();
                if (zzaldVar.zza(intValue)) {
                    if (i11 != i10) {
                        list.set(i10, num);
                    }
                    i10++;
                } else {
                    ub2 = (UB) zza(obj, i7, intValue, ub2, zzanoVar);
                }
            }
            if (i10 != size) {
                list.subList(i10, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = it.next().intValue();
                if (!zzaldVar.zza(intValue2)) {
                    ub2 = (UB) zza(obj, i7, intValue2, ub2, zzanoVar);
                    it.remove();
                }
            }
        }
        return ub2;
    }

    public static void zza(int i7, List<zzajp> list, zzaof zzaofVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzaofVar.zza(i7, list);
    }

    public static void zza(int i7, List<?> list, zzaof zzaofVar, zzamv<?> zzamvVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzaofVar.zza(i7, list, (zzamv) zzamvVar);
    }

    public static void zza(int i7, List<Boolean> list, zzaof zzaofVar, boolean z8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzaofVar.zza(i7, list, z8);
    }

    public static <T, FT extends zzakt<FT>> void zza(zzakm<FT> zzakmVar, T t5, T t10) {
        zzakr<FT> zza2 = zzakmVar.zza(t10);
        if (zza2.zza.isEmpty()) {
            return;
        }
        zzakmVar.zzb(t5).zza(zza2);
    }

    public static <T> void zza(zzalz zzalzVar, T t5, T t10, long j) {
        zzanp.zza(t5, j, zzalzVar.zza(zzanp.zze(t5, j), zzanp.zze(t10, j)));
    }

    public static <T, UT, UB> void zza(zzano<UT, UB> zzanoVar, T t5, T t10) {
        zzanoVar.zzc(t5, zzanoVar.zza(zzanoVar.zzd(t5), zzanoVar.zzd(t10)));
    }

    public static void zza(Class<?> cls) {
        zzaky.class.isAssignableFrom(cls);
    }

    public static boolean zza(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static int zzb(int i7, List<?> list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        int zzi = zzakg.zzi(i7) * size;
        if (list instanceof zzaln) {
            zzaln zzalnVar = (zzaln) list;
            while (i10 < size) {
                Object zza2 = zzalnVar.zza(i10);
                zzi = (zza2 instanceof zzajp ? zzakg.zza((zzajp) zza2) : zzakg.zza((String) zza2)) + zzi;
                i10++;
            }
        } else {
            while (i10 < size) {
                Object obj = list.get(i10);
                zzi = (obj instanceof zzajp ? zzakg.zza((zzajp) obj) : zzakg.zza((String) obj)) + zzi;
                i10++;
            }
        }
        return zzi;
    }

    public static int zzb(int i7, List<?> list, zzamv<?> zzamvVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzi = zzakg.zzi(i7) * size;
        for (int i10 = 0; i10 < size; i10++) {
            Object obj = list.get(i10);
            zzi = (obj instanceof zzalk ? zzakg.zza((zzalk) obj) : zzakg.zza((zzamc) obj, zzamvVar)) + zzi;
        }
        return zzi;
    }

    public static int zzb(int i7, List<Integer> list, boolean z8) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzakg.zzi(i7) * size) + zzb(list);
    }

    public static int zzb(List<Integer> list) {
        int i7;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzakz) {
            zzakz zzakzVar = (zzakz) list;
            i7 = 0;
            while (i10 < size) {
                i7 += zzakg.zzc(zzakzVar.zzb(i10));
                i10++;
            }
        } else {
            i7 = 0;
            while (i10 < size) {
                i7 += zzakg.zzc(list.get(i10).intValue());
                i10++;
            }
        }
        return i7;
    }

    public static void zzb(int i7, List<String> list, zzaof zzaofVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzaofVar.zzb(i7, list);
    }

    public static void zzb(int i7, List<?> list, zzaof zzaofVar, zzamv<?> zzamvVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzaofVar.zzb(i7, list, (zzamv) zzamvVar);
    }

    public static void zzb(int i7, List<Double> list, zzaof zzaofVar, boolean z8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzaofVar.zzb(i7, list, z8);
    }

    public static int zzc(int i7, List<?> list, boolean z8) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzakg.zzc(i7, 0) * size;
    }

    public static int zzc(List<?> list) {
        return list.size() << 2;
    }

    public static void zzc(int i7, List<Integer> list, zzaof zzaofVar, boolean z8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzaofVar.zzc(i7, list, z8);
    }

    public static int zzd(int i7, List<?> list, boolean z8) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzakg.zza(i7, 0L) * size;
    }

    public static int zzd(List<?> list) {
        return list.size() << 3;
    }

    public static void zzd(int i7, List<Integer> list, zzaof zzaofVar, boolean z8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzaofVar.zzd(i7, list, z8);
    }

    public static int zze(int i7, List<Integer> list, boolean z8) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzakg.zzi(i7) * size) + zze(list);
    }

    public static int zze(List<Integer> list) {
        int i7;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzakz) {
            zzakz zzakzVar = (zzakz) list;
            i7 = 0;
            while (i10 < size) {
                i7 += zzakg.zze(zzakzVar.zzb(i10));
                i10++;
            }
        } else {
            i7 = 0;
            while (i10 < size) {
                i7 += zzakg.zze(list.get(i10).intValue());
                i10++;
            }
        }
        return i7;
    }

    public static void zze(int i7, List<Long> list, zzaof zzaofVar, boolean z8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzaofVar.zze(i7, list, z8);
    }

    public static int zzf(int i7, List<Long> list, boolean z8) {
        if (list.size() == 0) {
            return 0;
        }
        return (zzakg.zzi(i7) * list.size()) + zzf(list);
    }

    public static int zzf(List<Long> list) {
        int i7;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzalr) {
            zzalr zzalrVar = (zzalr) list;
            i7 = 0;
            while (i10 < size) {
                i7 += zzakg.zzd(zzalrVar.zzb(i10));
                i10++;
            }
        } else {
            i7 = 0;
            while (i10 < size) {
                i7 += zzakg.zzd(list.get(i10).longValue());
                i10++;
            }
        }
        return i7;
    }

    public static void zzf(int i7, List<Float> list, zzaof zzaofVar, boolean z8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzaofVar.zzf(i7, list, z8);
    }

    public static int zzg(int i7, List<Integer> list, boolean z8) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzakg.zzi(i7) * size) + zzg(list);
    }

    public static int zzg(List<Integer> list) {
        int i7;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzakz) {
            zzakz zzakzVar = (zzakz) list;
            i7 = 0;
            while (i10 < size) {
                i7 += zzakg.zzh(zzakzVar.zzb(i10));
                i10++;
            }
        } else {
            i7 = 0;
            while (i10 < size) {
                i7 += zzakg.zzh(list.get(i10).intValue());
                i10++;
            }
        }
        return i7;
    }

    public static void zzg(int i7, List<Integer> list, zzaof zzaofVar, boolean z8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzaofVar.zzg(i7, list, z8);
    }

    public static int zzh(int i7, List<Long> list, boolean z8) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzakg.zzi(i7) * size) + zzh(list);
    }

    public static int zzh(List<Long> list) {
        int i7;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzalr) {
            zzalr zzalrVar = (zzalr) list;
            i7 = 0;
            while (i10 < size) {
                i7 += zzakg.zzf(zzalrVar.zzb(i10));
                i10++;
            }
        } else {
            i7 = 0;
            while (i10 < size) {
                i7 += zzakg.zzf(list.get(i10).longValue());
                i10++;
            }
        }
        return i7;
    }

    public static void zzh(int i7, List<Long> list, zzaof zzaofVar, boolean z8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzaofVar.zzh(i7, list, z8);
    }

    public static int zzi(int i7, List<Integer> list, boolean z8) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzakg.zzi(i7) * size) + zzi(list);
    }

    public static int zzi(List<Integer> list) {
        int i7;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzakz) {
            zzakz zzakzVar = (zzakz) list;
            i7 = 0;
            while (i10 < size) {
                i7 += zzakg.zzj(zzakzVar.zzb(i10));
                i10++;
            }
        } else {
            i7 = 0;
            while (i10 < size) {
                i7 += zzakg.zzj(list.get(i10).intValue());
                i10++;
            }
        }
        return i7;
    }

    public static void zzi(int i7, List<Integer> list, zzaof zzaofVar, boolean z8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzaofVar.zzi(i7, list, z8);
    }

    public static int zzj(int i7, List<Long> list, boolean z8) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzakg.zzi(i7) * size) + zzj(list);
    }

    public static int zzj(List<Long> list) {
        int i7;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzalr) {
            zzalr zzalrVar = (zzalr) list;
            i7 = 0;
            while (i10 < size) {
                i7 += zzakg.zzg(zzalrVar.zzb(i10));
                i10++;
            }
        } else {
            i7 = 0;
            while (i10 < size) {
                i7 += zzakg.zzg(list.get(i10).longValue());
                i10++;
            }
        }
        return i7;
    }

    public static void zzj(int i7, List<Long> list, zzaof zzaofVar, boolean z8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzaofVar.zzj(i7, list, z8);
    }

    public static void zzk(int i7, List<Integer> list, zzaof zzaofVar, boolean z8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzaofVar.zzk(i7, list, z8);
    }

    public static void zzl(int i7, List<Long> list, zzaof zzaofVar, boolean z8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzaofVar.zzl(i7, list, z8);
    }

    public static void zzm(int i7, List<Integer> list, zzaof zzaofVar, boolean z8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzaofVar.zzm(i7, list, z8);
    }

    public static void zzn(int i7, List<Long> list, zzaof zzaofVar, boolean z8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzaofVar.zzn(i7, list, z8);
    }
}
