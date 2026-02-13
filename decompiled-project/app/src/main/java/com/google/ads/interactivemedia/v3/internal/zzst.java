package com.google.ads.interactivemedia.v3.internal;

import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import java.util.SortedSet;

/* loaded from: classes.dex */
public abstract class zzst<E> extends zzsk<E> implements Set<E> {
    private transient zzso zza;

    private static zzst zzh(int i7, Object... objArr) {
        if (i7 == 0) {
            return zzto.zza;
        }
        if (i7 == 1) {
            Object obj = objArr[0];
            obj.getClass();
            return new zztt(obj);
        }
        int zzj = zzj(i7);
        Object[] objArr2 = new Object[zzj];
        int i10 = zzj - 1;
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < i7; i13++) {
            Object obj2 = objArr[i13];
            zztg.zza(obj2, i13);
            int hashCode = obj2.hashCode();
            int zzb = zzsi.zzb(hashCode);
            while (true) {
                int i14 = zzb & i10;
                Object obj3 = objArr2[i14];
                if (obj3 == null) {
                    objArr[i12] = obj2;
                    objArr2[i14] = obj2;
                    i11 += hashCode;
                    i12++;
                    break;
                }
                if (!obj3.equals(obj2)) {
                    zzb++;
                }
            }
        }
        Arrays.fill(objArr, i12, i7, (Object) null);
        if (i12 == 1) {
            Object obj4 = objArr[0];
            obj4.getClass();
            return new zztt(obj4);
        }
        if (zzj(i12) < zzj / 2) {
            return zzh(i12, objArr);
        }
        int length = objArr.length;
        if (i12 < (length >> 1) + (length >> 2)) {
            objArr = Arrays.copyOf(objArr, i12);
        }
        return new zzto(objArr, i11, objArr2, i10, i12);
    }

    public static int zzj(int i7) {
        int max = Math.max(i7, 2);
        if (max >= 751619276) {
            zzrm.zze(max < 1073741824, "collection too large");
            return 1073741824;
        }
        int highestOneBit = Integer.highestOneBit(max - 1);
        do {
            highestOneBit += highestOneBit;
        } while (highestOneBit * 0.7d < max);
        return highestOneBit;
    }

    public static zzst zzl(Collection collection) {
        if ((collection instanceof zzst) && !(collection instanceof SortedSet)) {
            zzst zzstVar = (zzst) collection;
            if (!zzstVar.zzf()) {
                return zzstVar;
            }
        }
        Object[] array = collection.toArray();
        return zzh(array.length, array);
    }

    public static zzst zzm(Object obj) {
        return new zztt(obj);
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof zzst) && zzi() && ((zzst) obj).zzi() && hashCode() != obj.hashCode()) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() == set.size()) {
                    if (containsAll(set)) {
                        return true;
                    }
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return zzts.zza(this);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzsk
    public zzso zzd() {
        zzso zzsoVar = this.zza;
        if (zzsoVar != null) {
            return zzsoVar;
        }
        zzso zzk = zzk();
        this.zza = zzk;
        return zzk;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzsk, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: zze */
    public abstract zztw iterator();

    public boolean zzi() {
        return false;
    }

    public zzso zzk() {
        Object[] array = toArray();
        int i7 = zzso.zzd;
        return zzso.zzj(array, array.length);
    }
}
