package com.google.android.gms.internal.measurement;

import P1.g;
import X.c;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzlv {
    private static final zzlv zzd = new zzlv(true);
    final zzod zza = new zznz();
    private boolean zzb;
    private boolean zzc;

    private zzlv() {
    }

    private zzlv(boolean z8) {
        zzb();
        zzb();
    }

    public static zzlv zza() {
        return zzd;
    }

    public static void zzf(zzll zzllVar, zzos zzosVar, int i7, Object obj) {
        if (zzosVar == zzos.zzj) {
            zznl zznlVar = (zznl) obj;
            zzmo.zzd(zznlVar);
            zzllVar.zza(i7, 3);
            zznlVar.zzcB(zzllVar);
            zzllVar.zza(i7, 4);
            return;
        }
        zzllVar.zza(i7, zzosVar.zzb());
        zzot zzotVar = zzot.INT;
        switch (zzosVar.ordinal()) {
            case 0:
                zzllVar.zzu(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                return;
            case 1:
                zzllVar.zzs(Float.floatToRawIntBits(((Float) obj).floatValue()));
                return;
            case 2:
                zzllVar.zzt(((Long) obj).longValue());
                return;
            case 3:
                zzllVar.zzt(((Long) obj).longValue());
                return;
            case 4:
                zzllVar.zzq(((Integer) obj).intValue());
                return;
            case 5:
                zzllVar.zzu(((Long) obj).longValue());
                return;
            case 6:
                zzllVar.zzs(((Integer) obj).intValue());
                return;
            case 7:
                zzllVar.zzp(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                return;
            case g.BYTES_FIELD_NUMBER /* 8 */:
                if (obj instanceof zzlg) {
                    zzllVar.zzj((zzlg) obj);
                    return;
                } else {
                    zzllVar.zzx((String) obj);
                    return;
                }
            case 9:
                ((zznl) obj).zzcB(zzllVar);
                return;
            case 10:
                zzllVar.zzo((zznl) obj);
                return;
            case ModuleDescriptor.MODULE_VERSION /* 11 */:
                if (obj instanceof zzlg) {
                    zzllVar.zzj((zzlg) obj);
                    return;
                } else {
                    byte[] bArr = (byte[]) obj;
                    zzllVar.zzk(bArr, 0, bArr.length);
                    return;
                }
            case 12:
                zzllVar.zzr(((Integer) obj).intValue());
                return;
            case 13:
                if (obj instanceof zzmi) {
                    zzllVar.zzq(((zzmi) obj).zza());
                    return;
                } else {
                    zzllVar.zzq(((Integer) obj).intValue());
                    return;
                }
            case 14:
                zzllVar.zzs(((Integer) obj).intValue());
                return;
            case 15:
                zzllVar.zzu(((Long) obj).longValue());
                return;
            case 16:
                int intValue = ((Integer) obj).intValue();
                zzllVar.zzr((intValue >> 31) ^ (intValue + intValue));
                return;
            case 17:
                long longValue = ((Long) obj).longValue();
                zzllVar.zzt((longValue >> 63) ^ (longValue + longValue));
                return;
            default:
                return;
        }
    }

    public static int zzh(zzos zzosVar, int i7, Object obj) {
        int zzz = zzll.zzz(i7 << 3);
        if (zzosVar == zzos.zzj) {
            zzmo.zzd((zznl) obj);
            zzz += zzz;
        }
        return zzz + zzi(zzosVar, obj);
    }

    public static int zzi(zzos zzosVar, Object obj) {
        int zzc;
        int zzz;
        zzos zzosVar2 = zzos.zza;
        zzot zzotVar = zzot.INT;
        switch (zzosVar.ordinal()) {
            case 0:
                ((Double) obj).getClass();
                int i7 = zzll.zzb;
                return 8;
            case 1:
                ((Float) obj).getClass();
                int i10 = zzll.zzb;
                return 4;
            case 2:
                return zzll.zzA(((Long) obj).longValue());
            case 3:
                return zzll.zzA(((Long) obj).longValue());
            case 4:
                return zzll.zzA(((Integer) obj).intValue());
            case 5:
                ((Long) obj).getClass();
                int i11 = zzll.zzb;
                return 8;
            case 6:
                ((Integer) obj).getClass();
                int i12 = zzll.zzb;
                return 4;
            case 7:
                ((Boolean) obj).getClass();
                int i13 = zzll.zzb;
                return 1;
            case g.BYTES_FIELD_NUMBER /* 8 */:
                if (!(obj instanceof zzlg)) {
                    return zzll.zzB((String) obj);
                }
                int i14 = zzll.zzb;
                zzc = ((zzlg) obj).zzc();
                zzz = zzll.zzz(zzc);
                break;
            case 9:
                return ((zznl) obj).zzcn();
            case 10:
                if (!(obj instanceof zzmu)) {
                    return zzll.zzC((zznl) obj);
                }
                int i15 = zzll.zzb;
                zzc = ((zzmu) obj).zzb();
                zzz = zzll.zzz(zzc);
                break;
            case ModuleDescriptor.MODULE_VERSION /* 11 */:
                if (!(obj instanceof zzlg)) {
                    int i16 = zzll.zzb;
                    zzc = ((byte[]) obj).length;
                    zzz = zzll.zzz(zzc);
                    break;
                } else {
                    int i17 = zzll.zzb;
                    zzc = ((zzlg) obj).zzc();
                    zzz = zzll.zzz(zzc);
                    break;
                }
            case 12:
                return zzll.zzz(((Integer) obj).intValue());
            case 13:
                return obj instanceof zzmi ? zzll.zzA(((zzmi) obj).zza()) : zzll.zzA(((Integer) obj).intValue());
            case 14:
                ((Integer) obj).getClass();
                int i18 = zzll.zzb;
                return 4;
            case 15:
                ((Long) obj).getClass();
                int i19 = zzll.zzb;
                return 8;
            case 16:
                int intValue = ((Integer) obj).intValue();
                return zzll.zzz((intValue >> 31) ^ (intValue + intValue));
            case 17:
                long longValue = ((Long) obj).longValue();
                return zzll.zzA((longValue >> 63) ^ (longValue + longValue));
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
        return zzz + zzc;
    }

    public static int zzj(zzlu zzluVar, Object obj) {
        zzos zzb = zzluVar.zzb();
        int zza = zzluVar.zza();
        if (!zzluVar.zzd()) {
            return zzh(zzb, zza, obj);
        }
        List list = (List) obj;
        int size = list.size();
        int i7 = 0;
        if (!zzluVar.zze()) {
            int i10 = 0;
            while (i7 < size) {
                i10 += zzh(zzb, zza, list.get(i7));
                i7++;
            }
            return i10;
        }
        if (list.isEmpty()) {
            return 0;
        }
        int i11 = 0;
        while (i7 < size) {
            i11 += zzi(zzb, list.get(i7));
            i7++;
        }
        return zzll.zzz(i11) + zzll.zzz(zza << 3) + i11;
    }

    private static boolean zzk(Map.Entry entry) {
        zzlu zzluVar = (zzlu) entry.getKey();
        if (zzluVar.zzc() != zzot.MESSAGE) {
            return true;
        }
        if (!zzluVar.zzd()) {
            return zzl(entry.getValue());
        }
        List list = (List) entry.getValue();
        int size = list.size();
        for (int i7 = 0; i7 < size; i7++) {
            if (!zzl(list.get(i7))) {
                return false;
            }
        }
        return true;
    }

    private static boolean zzl(Object obj) {
        if (obj instanceof zznm) {
            return ((zznm) obj).zzcD();
        }
        if (obj instanceof zzmu) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    private static final int zzm(Map.Entry entry) {
        int i7;
        int zzz;
        int zzC;
        zzlu zzluVar = (zzlu) entry.getKey();
        Object value = entry.getValue();
        if (zzluVar.zzc() != zzot.MESSAGE || zzluVar.zzd() || zzluVar.zze()) {
            return zzj(zzluVar, value);
        }
        if (value instanceof zzmu) {
            int zza = ((zzlu) entry.getKey()).zza();
            int zzz2 = zzll.zzz(8);
            i7 = zzz2 + zzz2;
            zzz = zzll.zzz(zza) + zzll.zzz(16);
            int zzz3 = zzll.zzz(24);
            int zzb = ((zzmu) value).zzb();
            zzC = c.u(zzb, zzb, zzz3);
        } else {
            int zza2 = ((zzlu) entry.getKey()).zza();
            int zzz4 = zzll.zzz(8);
            i7 = zzz4 + zzz4;
            zzz = zzll.zzz(zza2) + zzll.zzz(16);
            zzC = zzll.zzC((zznl) value) + zzll.zzz(24);
        }
        return i7 + zzz + zzC;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0015. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void zzn(zzlu zzluVar, Object obj) {
        boolean z8;
        zzos zzb = zzluVar.zzb();
        byte[] bArr = zzmo.zzb;
        obj.getClass();
        zzos zzosVar = zzos.zza;
        zzot zzotVar = zzot.INT;
        switch (zzb.zza().ordinal()) {
            case 0:
                z8 = obj instanceof Integer;
                if (z8) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzluVar.zza()), zzluVar.zzb().zza(), obj.getClass().getName()));
            case 1:
                z8 = obj instanceof Long;
                if (z8) {
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzluVar.zza()), zzluVar.zzb().zza(), obj.getClass().getName()));
            case 2:
                z8 = obj instanceof Float;
                if (z8) {
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzluVar.zza()), zzluVar.zzb().zza(), obj.getClass().getName()));
            case 3:
                z8 = obj instanceof Double;
                if (z8) {
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzluVar.zza()), zzluVar.zzb().zza(), obj.getClass().getName()));
            case 4:
                z8 = obj instanceof Boolean;
                if (z8) {
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzluVar.zza()), zzluVar.zzb().zza(), obj.getClass().getName()));
            case 5:
                z8 = obj instanceof String;
                if (z8) {
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzluVar.zza()), zzluVar.zzb().zza(), obj.getClass().getName()));
            case 6:
                if ((obj instanceof zzlg) || (obj instanceof byte[])) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzluVar.zza()), zzluVar.zzb().zza(), obj.getClass().getName()));
            case 7:
                if ((obj instanceof Integer) || (obj instanceof zzmi)) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzluVar.zza()), zzluVar.zzb().zza(), obj.getClass().getName()));
            case g.BYTES_FIELD_NUMBER /* 8 */:
                if ((obj instanceof zznl) || (obj instanceof zzmu)) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzluVar.zza()), zzluVar.zzb().zza(), obj.getClass().getName()));
            default:
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzluVar.zza()), zzluVar.zzb().zza(), obj.getClass().getName()));
        }
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        zzlv zzlvVar = new zzlv();
        zzod zzodVar = this.zza;
        int zzc = zzodVar.zzc();
        for (int i7 = 0; i7 < zzc; i7++) {
            Map.Entry zzd2 = zzodVar.zzd(i7);
            zzlvVar.zzd((zzlu) ((zzoa) zzd2).zza(), zzd2.getValue());
        }
        for (Map.Entry entry : zzodVar.zze()) {
            zzlvVar.zzd((zzlu) entry.getKey(), entry.getValue());
        }
        zzlvVar.zzc = this.zzc;
        return zzlvVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzlv) {
            return this.zza.equals(((zzlv) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final void zzb() {
        if (this.zzb) {
            return;
        }
        zzod zzodVar = this.zza;
        int zzc = zzodVar.zzc();
        for (int i7 = 0; i7 < zzc; i7++) {
            Object value = zzodVar.zzd(i7).getValue();
            if (value instanceof zzme) {
                ((zzme) value).zzcj();
            }
        }
        Iterator it = zzodVar.zze().iterator();
        while (it.hasNext()) {
            Object value2 = ((Map.Entry) it.next()).getValue();
            if (value2 instanceof zzme) {
                ((zzme) value2).zzcj();
            }
        }
        zzodVar.zza();
        this.zzb = true;
    }

    public final Iterator zzc() {
        zzod zzodVar = this.zza;
        return zzodVar.isEmpty() ? Collections.emptyIterator() : this.zzc ? new zzmt(zzodVar.entrySet().iterator()) : zzodVar.entrySet().iterator();
    }

    public final void zzd(zzlu zzluVar, Object obj) {
        if (!zzluVar.zzd()) {
            zzn(zzluVar, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            List list = (List) obj;
            int size = list.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i7 = 0; i7 < size; i7++) {
                Object obj2 = list.get(i7);
                zzn(zzluVar, obj2);
                arrayList.add(obj2);
            }
            obj = arrayList;
        }
        if (obj instanceof zzmu) {
            this.zzc = true;
        }
        this.zza.put(zzluVar, obj);
    }

    public final boolean zze() {
        zzod zzodVar = this.zza;
        int zzc = zzodVar.zzc();
        for (int i7 = 0; i7 < zzc; i7++) {
            if (!zzk(zzodVar.zzd(i7))) {
                return false;
            }
        }
        Iterator it = zzodVar.zze().iterator();
        while (it.hasNext()) {
            if (!zzk((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    public final int zzg() {
        zzod zzodVar = this.zza;
        int zzc = zzodVar.zzc();
        int i7 = 0;
        for (int i10 = 0; i10 < zzc; i10++) {
            i7 += zzm(zzodVar.zzd(i10));
        }
        Iterator it = zzodVar.zze().iterator();
        while (it.hasNext()) {
            i7 += zzm((Map.Entry) it.next());
        }
        return i7;
    }
}
