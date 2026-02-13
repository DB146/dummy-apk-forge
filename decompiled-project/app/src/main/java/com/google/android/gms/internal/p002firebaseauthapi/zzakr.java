package com.google.android.gms.internal.p002firebaseauthapi;

import P1.g;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.google.android.gms.internal.p002firebaseauthapi.zzakt;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzakr<T extends zzakt<T>> {
    private static final zzakr<?> zzb = new zzakr<>(true);
    final zzamw<T, Object> zza;
    private boolean zzc;
    private boolean zzd;

    private zzakr() {
        this.zza = new zzamz();
    }

    private zzakr(zzamw<T, Object> zzamwVar) {
        this.zza = zzamwVar;
        zze();
    }

    private zzakr(boolean z8) {
        this(new zzamz());
        zze();
    }

    public static int zza(zzakt<?> zzaktVar, Object obj) {
        zzanw zzb2 = zzaktVar.zzb();
        int zza = zzaktVar.zza();
        if (!zzaktVar.zze()) {
            return zza(zzb2, zza, obj);
        }
        List list = (List) obj;
        int size = list.size();
        int i7 = 0;
        if (!zzaktVar.zzd()) {
            int i10 = 0;
            while (i7 < size) {
                i10 += zza(zzb2, zza, list.get(i7));
                i7++;
            }
            return i10;
        }
        if (list.isEmpty()) {
            return 0;
        }
        int i11 = 0;
        while (i7 < size) {
            i11 += zza(zzb2, list.get(i7));
            i7++;
        }
        return zzakg.zzj(i11) + zzakg.zzi(zza) + i11;
    }

    public static int zza(zzanw zzanwVar, int i7, Object obj) {
        int zzi = zzakg.zzi(i7);
        if (zzanwVar == zzanw.zzj) {
            zzalb.zza((zzamc) obj);
            zzi <<= 1;
        }
        return zzi + zza(zzanwVar, obj);
    }

    private static int zza(zzanw zzanwVar, Object obj) {
        switch (zzakq.zzb[zzanwVar.ordinal()]) {
            case 1:
                return zzakg.zza(((Double) obj).doubleValue());
            case 2:
                return zzakg.zza(((Float) obj).floatValue());
            case 3:
                return zzakg.zzd(((Long) obj).longValue());
            case 4:
                return zzakg.zzg(((Long) obj).longValue());
            case 5:
                return zzakg.zze(((Integer) obj).intValue());
            case 6:
                return zzakg.zzc(((Long) obj).longValue());
            case 7:
                return zzakg.zzd(((Integer) obj).intValue());
            case g.BYTES_FIELD_NUMBER /* 8 */:
                return zzakg.zza(((Boolean) obj).booleanValue());
            case 9:
                return zzakg.zza((zzamc) obj);
            case 10:
                return obj instanceof zzalg ? zzakg.zza((zzalg) obj) : zzakg.zzb((zzamc) obj);
            case ModuleDescriptor.MODULE_VERSION /* 11 */:
                return obj instanceof zzajp ? zzakg.zza((zzajp) obj) : zzakg.zza((String) obj);
            case 12:
                return obj instanceof zzajp ? zzakg.zza((zzajp) obj) : zzakg.zza((byte[]) obj);
            case 13:
                return zzakg.zzj(((Integer) obj).intValue());
            case 14:
                return zzakg.zzg(((Integer) obj).intValue());
            case 15:
                return zzakg.zze(((Long) obj).longValue());
            case 16:
                return zzakg.zzh(((Integer) obj).intValue());
            case 17:
                return zzakg.zzf(((Long) obj).longValue());
            case 18:
                return obj instanceof zzala ? zzakg.zzc(((zzala) obj).zza()) : zzakg.zzc(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    private static int zza(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        return (key.zzc() != zzaod.MESSAGE || key.zze() || key.zzd()) ? zza((zzakt<?>) key, value) : value instanceof zzalg ? zzakg.zza(entry.getKey().zza(), (zzalg) value) : zzakg.zza(entry.getKey().zza(), (zzamc) value);
    }

    private final Object zza(T t5) {
        Object obj = this.zza.get(t5);
        if (obj instanceof zzalg) {
            throw new NoSuchMethodError();
        }
        return obj;
    }

    private static Object zza(Object obj) {
        if (obj instanceof zzaml) {
            return ((zzaml) obj).clone();
        }
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    public static void zza(zzakg zzakgVar, zzanw zzanwVar, int i7, Object obj) {
        if (zzanwVar == zzanw.zzj) {
            zzamc zzamcVar = (zzamc) obj;
            zzalb.zza(zzamcVar);
            zzakgVar.zzk(i7, 3);
            zzamcVar.zza(zzakgVar);
            zzakgVar.zzk(i7, 4);
            return;
        }
        zzakgVar.zzk(i7, zzanwVar.zza());
        switch (zzakq.zzb[zzanwVar.ordinal()]) {
            case 1:
                zzakgVar.zzb(((Double) obj).doubleValue());
                return;
            case 2:
                zzakgVar.zzb(((Float) obj).floatValue());
                return;
            case 3:
                zzakgVar.zzj(((Long) obj).longValue());
                return;
            case 4:
                zzakgVar.zzj(((Long) obj).longValue());
                return;
            case 5:
                zzakgVar.zzl(((Integer) obj).intValue());
                return;
            case 6:
                zzakgVar.zzh(((Long) obj).longValue());
                return;
            case 7:
                zzakgVar.zzk(((Integer) obj).intValue());
                return;
            case g.BYTES_FIELD_NUMBER /* 8 */:
                zzakgVar.zzb(((Boolean) obj).booleanValue());
                return;
            case 9:
                ((zzamc) obj).zza(zzakgVar);
                return;
            case 10:
                zzakgVar.zzc((zzamc) obj);
                return;
            case ModuleDescriptor.MODULE_VERSION /* 11 */:
                if (obj instanceof zzajp) {
                    zzakgVar.zzb((zzajp) obj);
                    return;
                } else {
                    zzakgVar.zzb((String) obj);
                    return;
                }
            case 12:
                if (obj instanceof zzajp) {
                    zzakgVar.zzb((zzajp) obj);
                    return;
                } else {
                    byte[] bArr = (byte[]) obj;
                    zzakgVar.zzb(bArr, 0, bArr.length);
                    return;
                }
            case 13:
                zzakgVar.zzn(((Integer) obj).intValue());
                return;
            case 14:
                zzakgVar.zzk(((Integer) obj).intValue());
                return;
            case 15:
                zzakgVar.zzh(((Long) obj).longValue());
                return;
            case 16:
                zzakgVar.zzm(((Integer) obj).intValue());
                return;
            case 17:
                zzakgVar.zzi(((Long) obj).longValue());
                return;
            case 18:
                if (obj instanceof zzala) {
                    zzakgVar.zzl(((zzala) obj).zza());
                    return;
                } else {
                    zzakgVar.zzl(((Integer) obj).intValue());
                    return;
                }
            default:
                return;
        }
    }

    public static <T extends zzakt<T>> zzakr<T> zzb() {
        return (zzakr<T>) zzb;
    }

    private final void zzb(T t5, Object obj) {
        if (!t5.zze()) {
            zzc(t5, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            List list = (List) obj;
            int size = list.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i7 = 0; i7 < size; i7++) {
                Object obj2 = list.get(i7);
                zzc(t5, obj2);
                arrayList.add(obj2);
            }
            obj = arrayList;
        }
        if (obj instanceof zzalg) {
            this.zzd = true;
        }
        this.zza.zza((zzamw<T, Object>) t5, (T) obj);
    }

    private final void zzb(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        boolean z8 = value instanceof zzalg;
        if (key.zze()) {
            if (z8) {
                throw new IllegalStateException("Lazy fields can not be repeated");
            }
            Object zza = zza((zzakr<T>) key);
            List list = (List) value;
            int size = list.size();
            if (zza == null) {
                zza = new ArrayList(size);
            }
            List list2 = (List) zza;
            for (int i7 = 0; i7 < size; i7++) {
                list2.add(zza(list.get(i7)));
            }
            this.zza.zza((zzamw<T, Object>) key, (T) zza);
            return;
        }
        if (key.zzc() != zzaod.MESSAGE) {
            if (z8) {
                throw new IllegalStateException("Lazy fields must be message-valued");
            }
            this.zza.zza((zzamw<T, Object>) key, (T) zza(value));
            return;
        }
        Object zza2 = zza((zzakr<T>) key);
        if (zza2 != null) {
            if (z8) {
                throw new NoSuchMethodError();
            }
            this.zza.zza((zzamw<T, Object>) key, (T) (zza2 instanceof zzaml ? key.zza((zzaml) zza2, (zzaml) value) : key.zza(((zzamc) zza2).zzr(), (zzamc) value).zze()));
        } else {
            this.zza.zza((zzamw<T, Object>) key, (T) zza(value));
            if (z8) {
                this.zzd = true;
            }
        }
    }

    private static boolean zzb(Object obj) {
        if (obj instanceof zzame) {
            return ((zzame) obj).zzj();
        }
        if (obj instanceof zzalg) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0020, code lost:
    
        if ((r4 instanceof com.google.android.gms.internal.p002firebaseauthapi.zzalg) == false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0029, code lost:
    
        if ((r4 instanceof com.google.android.gms.internal.p002firebaseauthapi.zzala) == false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0032, code lost:
    
        if ((r4 instanceof byte[]) == false) goto L4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void zzc(T t5, Object obj) {
        zzanw zzb2 = t5.zzb();
        zzalb.zza(obj);
        boolean z8 = true;
        switch (zzakq.zza[zzb2.zzb().ordinal()]) {
            case 1:
                z8 = obj instanceof Integer;
                break;
            case 2:
                z8 = obj instanceof Long;
                break;
            case 3:
                z8 = obj instanceof Float;
                break;
            case 4:
                z8 = obj instanceof Double;
                break;
            case 5:
                z8 = obj instanceof Boolean;
                break;
            case 6:
                z8 = obj instanceof String;
                break;
            case 7:
                if (!(obj instanceof zzajp)) {
                    break;
                }
                break;
            case g.BYTES_FIELD_NUMBER /* 8 */:
                if (!(obj instanceof Integer)) {
                    break;
                }
                break;
            case 9:
                if (!(obj instanceof zzamc)) {
                    break;
                }
                break;
            default:
                z8 = false;
                break;
        }
        if (!z8) {
            throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(t5.zza()), t5.zzb().zzb(), obj.getClass().getName()));
        }
    }

    private static <T extends zzakt<T>> boolean zzc(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        if (key.zzc() != zzaod.MESSAGE) {
            return true;
        }
        if (!key.zze()) {
            return zzb(entry.getValue());
        }
        List list = (List) entry.getValue();
        int size = list.size();
        for (int i7 = 0; i7 < size; i7++) {
            if (!zzb(list.get(i7))) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object clone() {
        zzakr zzakrVar = new zzakr();
        int zza = this.zza.zza();
        for (int i7 = 0; i7 < zza; i7++) {
            Map.Entry<T, Object> zza2 = this.zza.zza(i7);
            zzakrVar.zzb(zza2.getKey(), zza2.getValue());
        }
        for (Map.Entry<T, Object> entry : this.zza.zzb()) {
            zzakrVar.zzb(entry.getKey(), entry.getValue());
        }
        zzakrVar.zzd = this.zzd;
        return zzakrVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzakr) {
            return this.zza.equals(((zzakr) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final int zza() {
        int zza = this.zza.zza();
        int i7 = 0;
        for (int i10 = 0; i10 < zza; i10++) {
            i7 += zza((Map.Entry) this.zza.zza(i10));
        }
        Iterator<Map.Entry<T, Object>> it = this.zza.zzb().iterator();
        while (it.hasNext()) {
            i7 += zza((Map.Entry) it.next());
        }
        return i7;
    }

    public final void zza(zzakr<T> zzakrVar) {
        int zza = zzakrVar.zza.zza();
        for (int i7 = 0; i7 < zza; i7++) {
            zzb((Map.Entry) zzakrVar.zza.zza(i7));
        }
        Iterator<Map.Entry<T, Object>> it = zzakrVar.zza.zzb().iterator();
        while (it.hasNext()) {
            zzb((Map.Entry) it.next());
        }
    }

    public final Iterator<Map.Entry<T, Object>> zzc() {
        return this.zza.isEmpty() ? Collections.emptyIterator() : this.zzd ? new zzali(this.zza.zzc().iterator()) : this.zza.zzc().iterator();
    }

    public final Iterator<Map.Entry<T, Object>> zzd() {
        return this.zza.isEmpty() ? Collections.emptyIterator() : this.zzd ? new zzali(this.zza.entrySet().iterator()) : this.zza.entrySet().iterator();
    }

    public final void zze() {
        if (this.zzc) {
            return;
        }
        int zza = this.zza.zza();
        for (int i7 = 0; i7 < zza; i7++) {
            Object value = this.zza.zza(i7).getValue();
            if (value instanceof zzaky) {
                ((zzaky) value).zzs();
            }
        }
        Iterator<Map.Entry<T, Object>> it = this.zza.zzb().iterator();
        while (it.hasNext()) {
            Object value2 = it.next().getValue();
            if (value2 instanceof zzaky) {
                ((zzaky) value2).zzs();
            }
        }
        this.zza.zzd();
        this.zzc = true;
    }

    public final boolean zzf() {
        return this.zzc;
    }

    public final boolean zzg() {
        int zza = this.zza.zza();
        for (int i7 = 0; i7 < zza; i7++) {
            if (!zzc(this.zza.zza(i7))) {
                return false;
            }
        }
        Iterator<Map.Entry<T, Object>> it = this.zza.zzb().iterator();
        while (it.hasNext()) {
            if (!zzc(it.next())) {
                return false;
            }
        }
        return true;
    }
}
