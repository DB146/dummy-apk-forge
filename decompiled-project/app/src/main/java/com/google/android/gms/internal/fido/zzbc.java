package com.google.android.gms.internal.fido;

import java.util.Arrays;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class zzbc extends zzav implements Set {
    private transient zzaz zza;

    private static zzbc zzf(int i7, Object... objArr) {
        if (i7 == 0) {
            return zzbt.zza;
        }
        if (i7 == 1) {
            Object obj = objArr[0];
            obj.getClass();
            return new zzby(obj);
        }
        int zzh = zzh(i7);
        Object[] objArr2 = new Object[zzh];
        int i10 = zzh - 1;
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < i7; i13++) {
            Object obj2 = objArr[i13];
            zzbq.zza(obj2, i13);
            int hashCode = obj2.hashCode();
            int zza = zzau.zza(hashCode);
            while (true) {
                int i14 = zza & i10;
                Object obj3 = objArr2[i14];
                if (obj3 == null) {
                    objArr[i12] = obj2;
                    objArr2[i14] = obj2;
                    i11 += hashCode;
                    i12++;
                    break;
                }
                if (!obj3.equals(obj2)) {
                    zza++;
                }
            }
        }
        Arrays.fill(objArr, i12, i7, (Object) null);
        if (i12 == 1) {
            Object obj4 = objArr[0];
            obj4.getClass();
            return new zzby(obj4);
        }
        if (zzh(i12) < zzh / 2) {
            return zzf(i12, objArr);
        }
        if (i12 <= 0) {
            objArr = Arrays.copyOf(objArr, i12);
        }
        return new zzbt(objArr, i11, objArr2, i10, i12);
    }

    public static int zzh(int i7) {
        int max = Math.max(i7, 2);
        if (max >= 751619276) {
            if (max < 1073741824) {
                return 1073741824;
            }
            throw new IllegalArgumentException("collection too large");
        }
        int highestOneBit = Integer.highestOneBit(max - 1);
        do {
            highestOneBit += highestOneBit;
        } while (highestOneBit * 0.7d < max);
        return highestOneBit;
    }

    public static zzbc zzk(Object obj, Object obj2) {
        return zzf(2, obj, obj2);
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof zzbc) && zzg() && ((zzbc) obj).zzg() && hashCode() != obj.hashCode()) {
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
        return zzbx.zza(this);
    }

    @Override // com.google.android.gms.internal.fido.zzav, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: zzd */
    public abstract zzcb iterator();

    public boolean zzg() {
        return false;
    }

    public zzaz zzi() {
        zzaz zzazVar = this.zza;
        if (zzazVar != null) {
            return zzazVar;
        }
        zzaz zzj = zzj();
        this.zza = zzj;
        return zzj;
    }

    public zzaz zzj() {
        Object[] array = toArray();
        int i7 = zzaz.zzd;
        return zzaz.zzh(array, array.length);
    }
}
