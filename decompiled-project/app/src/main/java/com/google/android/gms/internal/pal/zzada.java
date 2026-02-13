package com.google.android.gms.internal.pal;

import X.c;
import com.google.android.gms.common.api.f;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzada extends zzabj implements RandomAccess, zzade, zzaem {
    private static final zzada zza;
    private int[] zzb;
    private int zzc;

    static {
        zzada zzadaVar = new zzada(new int[0], 0);
        zza = zzadaVar;
        zzadaVar.zzb();
    }

    public zzada() {
        this(new int[10], 0);
    }

    private zzada(int[] iArr, int i7) {
        this.zzb = iArr;
        this.zzc = i7;
    }

    public static zzada zzf() {
        return zza;
    }

    private final String zzh(int i7) {
        return c.e(i7, this.zzc, "Index:", ", Size:");
    }

    private final void zzi(int i7) {
        if (i7 < 0 || i7 >= this.zzc) {
            throw new IndexOutOfBoundsException(zzh(i7));
        }
    }

    @Override // com.google.android.gms.internal.pal.zzabj, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i7, Object obj) {
        int i10;
        int intValue = ((Integer) obj).intValue();
        zza();
        if (i7 < 0 || i7 > (i10 = this.zzc)) {
            throw new IndexOutOfBoundsException(zzh(i7));
        }
        int[] iArr = this.zzb;
        if (i10 < iArr.length) {
            System.arraycopy(iArr, i7, iArr, i7 + 1, i10 - i7);
        } else {
            int[] iArr2 = new int[c.b(i10, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i7);
            System.arraycopy(this.zzb, i7, iArr2, i7 + 1, this.zzc - i7);
            this.zzb = iArr2;
        }
        this.zzb[i7] = intValue;
        this.zzc++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.pal.zzabj, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zzg(((Integer) obj).intValue());
        return true;
    }

    @Override // com.google.android.gms.internal.pal.zzabj, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zza();
        zzadg.zze(collection);
        if (!(collection instanceof zzada)) {
            return super.addAll(collection);
        }
        zzada zzadaVar = (zzada) collection;
        int i7 = zzadaVar.zzc;
        if (i7 == 0) {
            return false;
        }
        int i10 = this.zzc;
        if (f.API_PRIORITY_OTHER - i10 < i7) {
            throw new OutOfMemoryError();
        }
        int i11 = i10 + i7;
        int[] iArr = this.zzb;
        if (i11 > iArr.length) {
            this.zzb = Arrays.copyOf(iArr, i11);
        }
        System.arraycopy(zzadaVar.zzb, 0, this.zzb, this.zzc, zzadaVar.zzc);
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
        if (!(obj instanceof zzada)) {
            return super.equals(obj);
        }
        zzada zzadaVar = (zzada) obj;
        if (this.zzc != zzadaVar.zzc) {
            return false;
        }
        int[] iArr = zzadaVar.zzb;
        for (int i7 = 0; i7 < this.zzc; i7++) {
            if (this.zzb[i7] != iArr[i7]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i7) {
        zzi(i7);
        return Integer.valueOf(this.zzb[i7]);
    }

    @Override // com.google.android.gms.internal.pal.zzabj, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i7 = 1;
        for (int i10 = 0; i10 < this.zzc; i10++) {
            i7 = (i7 * 31) + this.zzb[i10];
        }
        return i7;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int i7 = this.zzc;
        for (int i10 = 0; i10 < i7; i10++) {
            if (this.zzb[i10] == intValue) {
                return i10;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.pal.zzabj, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i7) {
        zza();
        zzi(i7);
        int[] iArr = this.zzb;
        int i10 = iArr[i7];
        if (i7 < this.zzc - 1) {
            System.arraycopy(iArr, i7 + 1, iArr, i7, (r2 - i7) - 1);
        }
        this.zzc--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i10);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i7, int i10) {
        zza();
        if (i10 < i7) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.zzb;
        System.arraycopy(iArr, i10, iArr, i7, this.zzc - i10);
        this.zzc -= i10 - i7;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.pal.zzabj, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i7, Object obj) {
        int intValue = ((Integer) obj).intValue();
        zza();
        zzi(i7);
        int[] iArr = this.zzb;
        int i10 = iArr[i7];
        iArr[i7] = intValue;
        return Integer.valueOf(i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.pal.zzadf
    public final /* bridge */ /* synthetic */ zzadf zzd(int i7) {
        if (i7 >= this.zzc) {
            return new zzada(Arrays.copyOf(this.zzb, i7), this.zzc);
        }
        throw new IllegalArgumentException();
    }

    public final int zze(int i7) {
        zzi(i7);
        return this.zzb[i7];
    }

    public final void zzg(int i7) {
        zza();
        int i10 = this.zzc;
        int[] iArr = this.zzb;
        if (i10 == iArr.length) {
            int[] iArr2 = new int[c.b(i10, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i10);
            this.zzb = iArr2;
        }
        int[] iArr3 = this.zzb;
        int i11 = this.zzc;
        this.zzc = i11 + 1;
        iArr3[i11] = i7;
    }
}
