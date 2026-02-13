package com.google.android.gms.internal.pal;

import X.c;
import com.google.android.gms.common.api.f;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes.dex */
final class zzacj extends zzabj implements RandomAccess, zzadf, zzaem {
    private static final zzacj zza;
    private double[] zzb;
    private int zzc;

    static {
        zzacj zzacjVar = new zzacj(new double[0], 0);
        zza = zzacjVar;
        zzacjVar.zzb();
    }

    public zzacj() {
        this(new double[10], 0);
    }

    private zzacj(double[] dArr, int i7) {
        this.zzb = dArr;
        this.zzc = i7;
    }

    private final String zzf(int i7) {
        return c.e(i7, this.zzc, "Index:", ", Size:");
    }

    private final void zzg(int i7) {
        if (i7 < 0 || i7 >= this.zzc) {
            throw new IndexOutOfBoundsException(zzf(i7));
        }
    }

    @Override // com.google.android.gms.internal.pal.zzabj, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i7, Object obj) {
        int i10;
        double doubleValue = ((Double) obj).doubleValue();
        zza();
        if (i7 < 0 || i7 > (i10 = this.zzc)) {
            throw new IndexOutOfBoundsException(zzf(i7));
        }
        double[] dArr = this.zzb;
        if (i10 < dArr.length) {
            System.arraycopy(dArr, i7, dArr, i7 + 1, i10 - i7);
        } else {
            double[] dArr2 = new double[c.b(i10, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i7);
            System.arraycopy(this.zzb, i7, dArr2, i7 + 1, this.zzc - i7);
            this.zzb = dArr2;
        }
        this.zzb[i7] = doubleValue;
        this.zzc++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.pal.zzabj, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zze(((Double) obj).doubleValue());
        return true;
    }

    @Override // com.google.android.gms.internal.pal.zzabj, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zza();
        zzadg.zze(collection);
        if (!(collection instanceof zzacj)) {
            return super.addAll(collection);
        }
        zzacj zzacjVar = (zzacj) collection;
        int i7 = zzacjVar.zzc;
        if (i7 == 0) {
            return false;
        }
        int i10 = this.zzc;
        if (f.API_PRIORITY_OTHER - i10 < i7) {
            throw new OutOfMemoryError();
        }
        int i11 = i10 + i7;
        double[] dArr = this.zzb;
        if (i11 > dArr.length) {
            this.zzb = Arrays.copyOf(dArr, i11);
        }
        System.arraycopy(zzacjVar.zzb, 0, this.zzb, this.zzc, zzacjVar.zzc);
        this.zzc = i11;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.android.gms.internal.pal.zzabj, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzacj)) {
            return super.equals(obj);
        }
        zzacj zzacjVar = (zzacj) obj;
        if (this.zzc != zzacjVar.zzc) {
            return false;
        }
        double[] dArr = zzacjVar.zzb;
        for (int i7 = 0; i7 < this.zzc; i7++) {
            if (Double.doubleToLongBits(this.zzb[i7]) != Double.doubleToLongBits(dArr[i7])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i7) {
        zzg(i7);
        return Double.valueOf(this.zzb[i7]);
    }

    @Override // com.google.android.gms.internal.pal.zzabj, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i7 = 1;
        for (int i10 = 0; i10 < this.zzc; i10++) {
            i7 = (i7 * 31) + zzadg.zzc(Double.doubleToLongBits(this.zzb[i10]));
        }
        return i7;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double doubleValue = ((Double) obj).doubleValue();
        int i7 = this.zzc;
        for (int i10 = 0; i10 < i7; i10++) {
            if (this.zzb[i10] == doubleValue) {
                return i10;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.pal.zzabj, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i7) {
        zza();
        zzg(i7);
        double[] dArr = this.zzb;
        double d10 = dArr[i7];
        if (i7 < this.zzc - 1) {
            System.arraycopy(dArr, i7 + 1, dArr, i7, (r3 - i7) - 1);
        }
        this.zzc--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d10);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i7, int i10) {
        zza();
        if (i10 < i7) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        double[] dArr = this.zzb;
        System.arraycopy(dArr, i10, dArr, i7, this.zzc - i10);
        this.zzc -= i10 - i7;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.pal.zzabj, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i7, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        zza();
        zzg(i7);
        double[] dArr = this.zzb;
        double d10 = dArr[i7];
        dArr[i7] = doubleValue;
        return Double.valueOf(d10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.pal.zzadf
    public final /* bridge */ /* synthetic */ zzadf zzd(int i7) {
        if (i7 >= this.zzc) {
            return new zzacj(Arrays.copyOf(this.zzb, i7), this.zzc);
        }
        throw new IllegalArgumentException();
    }

    public final void zze(double d10) {
        zza();
        int i7 = this.zzc;
        double[] dArr = this.zzb;
        if (i7 == dArr.length) {
            double[] dArr2 = new double[c.b(i7, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i7);
            this.zzb = dArr2;
        }
        double[] dArr3 = this.zzb;
        int i10 = this.zzc;
        this.zzc = i10 + 1;
        dArr3[i10] = d10;
    }
}
