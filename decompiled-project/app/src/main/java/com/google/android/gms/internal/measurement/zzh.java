package com.google.android.gms.internal.measurement;

import X.c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzh {
    public static void zza(String str, int i7, List list) {
        if (list.size() == i7) {
            return;
        }
        throw new IllegalArgumentException(str + " operation requires " + i7 + " parameters found " + list.size());
    }

    public static void zzb(String str, int i7, List list) {
        if (list.size() >= i7) {
            return;
        }
        throw new IllegalArgumentException(str + " operation requires at least " + i7 + " parameters found " + list.size());
    }

    public static void zzc(String str, int i7, List list) {
        if (list.size() <= i7) {
            return;
        }
        throw new IllegalArgumentException(str + " operation requires at most " + i7 + " parameters found " + list.size());
    }

    public static boolean zzd(zzao zzaoVar) {
        if (zzaoVar == null) {
            return false;
        }
        Double zzd = zzaoVar.zzd();
        return !zzd.isNaN() && zzd.doubleValue() >= 0.0d && zzd.equals(Double.valueOf(Math.floor(zzd.doubleValue())));
    }

    public static zzbk zze(String str) {
        zzbk zzbkVar = null;
        if (str != null && !str.isEmpty()) {
            zzbkVar = zzbk.zza(Integer.parseInt(str));
        }
        if (zzbkVar != null) {
            return zzbkVar;
        }
        throw new IllegalArgumentException(c.t("Unsupported commandId ", str));
    }

    public static boolean zzf(zzao zzaoVar, zzao zzaoVar2) {
        if (!zzaoVar.getClass().equals(zzaoVar2.getClass())) {
            return false;
        }
        if ((zzaoVar instanceof zzat) || (zzaoVar instanceof zzam)) {
            return true;
        }
        if (!(zzaoVar instanceof zzah)) {
            return zzaoVar instanceof zzas ? zzaoVar.zzc().equals(zzaoVar2.zzc()) : zzaoVar instanceof zzaf ? zzaoVar.zze().equals(zzaoVar2.zze()) : zzaoVar == zzaoVar2;
        }
        if (Double.isNaN(zzaoVar.zzd().doubleValue()) || Double.isNaN(zzaoVar2.zzd().doubleValue())) {
            return false;
        }
        return zzaoVar.zzd().equals(zzaoVar2.zzd());
    }

    public static int zzg(double d10) {
        if (Double.isNaN(d10) || Double.isInfinite(d10) || d10 == 0.0d) {
            return 0;
        }
        return (int) (((d10 > 0.0d ? 1 : -1) * Math.floor(Math.abs(d10))) % 4.294967296E9d);
    }

    public static long zzh(double d10) {
        return zzg(d10) & 4294967295L;
    }

    public static double zzi(double d10) {
        if (Double.isNaN(d10)) {
            return 0.0d;
        }
        if (Double.isInfinite(d10) || d10 == 0.0d || d10 == 0.0d) {
            return d10;
        }
        return (d10 > 0.0d ? 1 : -1) * Math.floor(Math.abs(d10));
    }

    public static Object zzj(zzao zzaoVar) {
        if (zzao.zzg.equals(zzaoVar)) {
            return null;
        }
        if (zzao.zzf.equals(zzaoVar)) {
            return "";
        }
        if (zzaoVar instanceof zzal) {
            return zzk((zzal) zzaoVar);
        }
        if (!(zzaoVar instanceof zzae)) {
            return !zzaoVar.zzd().isNaN() ? zzaoVar.zzd() : zzaoVar.zzc();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = ((zzae) zzaoVar).iterator();
        while (it.hasNext()) {
            Object zzj = zzj((zzao) it.next());
            if (zzj != null) {
                arrayList.add(zzj);
            }
        }
        return arrayList;
    }

    public static Map zzk(zzal zzalVar) {
        HashMap hashMap = new HashMap();
        for (String str : zzalVar.zzb()) {
            Object zzj = zzj(zzalVar.zzk(str));
            if (zzj != null) {
                hashMap.put(str, zzj);
            }
        }
        return hashMap;
    }

    public static int zzl(zzg zzgVar) {
        int zzg = zzg(zzgVar.zzh("runtime.counter").zzd().doubleValue() + 1.0d);
        if (zzg > 1000000) {
            throw new IllegalStateException("Instructions allowed exceeded");
        }
        zzgVar.zze("runtime.counter", new zzah(Double.valueOf(zzg)));
        return zzg;
    }
}
