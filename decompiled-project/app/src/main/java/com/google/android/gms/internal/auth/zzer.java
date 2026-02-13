package com.google.android.gms.internal.auth;

import X.c;
import com.google.android.gms.common.api.f;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes.dex */
final class zzer extends zzdr implements RandomAccess, zzez, zzge {
    private static final zzer zza = new zzer(new float[0], 0, false);
    private float[] zzb;
    private int zzc;

    public zzer() {
        this(new float[10], 0, true);
    }

    private zzer(float[] fArr, int i7, boolean z8) {
        super(z8);
        this.zzb = fArr;
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

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i7, Object obj) {
        int i10;
        float floatValue = ((Float) obj).floatValue();
        zza();
        if (i7 < 0 || i7 > (i10 = this.zzc)) {
            throw new IndexOutOfBoundsException(zzf(i7));
        }
        float[] fArr = this.zzb;
        if (i10 < fArr.length) {
            System.arraycopy(fArr, i7, fArr, i7 + 1, i10 - i7);
        } else {
            float[] fArr2 = new float[c.b(i10, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i7);
            System.arraycopy(this.zzb, i7, fArr2, i7 + 1, this.zzc - i7);
            this.zzb = fArr2;
        }
        this.zzb[i7] = floatValue;
        this.zzc++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zze(((Float) obj).floatValue());
        return true;
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zza();
        byte[] bArr = zzfa.zzd;
        collection.getClass();
        if (!(collection instanceof zzer)) {
            return super.addAll(collection);
        }
        zzer zzerVar = (zzer) collection;
        int i7 = zzerVar.zzc;
        if (i7 == 0) {
            return false;
        }
        int i10 = this.zzc;
        if (f.API_PRIORITY_OTHER - i10 < i7) {
            throw new OutOfMemoryError();
        }
        int i11 = i10 + i7;
        float[] fArr = this.zzb;
        if (i11 > fArr.length) {
            this.zzb = Arrays.copyOf(fArr, i11);
        }
        System.arraycopy(zzerVar.zzb, 0, this.zzb, this.zzc, zzerVar.zzc);
        this.zzc = i11;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzer)) {
            return super.equals(obj);
        }
        zzer zzerVar = (zzer) obj;
        if (this.zzc != zzerVar.zzc) {
            return false;
        }
        float[] fArr = zzerVar.zzb;
        for (int i7 = 0; i7 < this.zzc; i7++) {
            if (Float.floatToIntBits(this.zzb[i7]) != Float.floatToIntBits(fArr[i7])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i7) {
        zzg(i7);
        return Float.valueOf(this.zzb[i7]);
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i7 = 1;
        for (int i10 = 0; i10 < this.zzc; i10++) {
            i7 = (i7 * 31) + Float.floatToIntBits(this.zzb[i10]);
        }
        return i7;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float floatValue = ((Float) obj).floatValue();
        int i7 = this.zzc;
        for (int i10 = 0; i10 < i7; i10++) {
            if (this.zzb[i10] == floatValue) {
                return i10;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i7) {
        zza();
        zzg(i7);
        float[] fArr = this.zzb;
        float f4 = fArr[i7];
        if (i7 < this.zzc - 1) {
            System.arraycopy(fArr, i7 + 1, fArr, i7, (r2 - i7) - 1);
        }
        this.zzc--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f4);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i7, int i10) {
        zza();
        if (i10 < i7) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        float[] fArr = this.zzb;
        System.arraycopy(fArr, i10, fArr, i7, this.zzc - i10);
        this.zzc -= i10 - i7;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i7, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        zza();
        zzg(i7);
        float[] fArr = this.zzb;
        float f4 = fArr[i7];
        fArr[i7] = floatValue;
        return Float.valueOf(f4);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.auth.zzez
    public final /* bridge */ /* synthetic */ zzez zzd(int i7) {
        if (i7 >= this.zzc) {
            return new zzer(Arrays.copyOf(this.zzb, i7), this.zzc, true);
        }
        throw new IllegalArgumentException();
    }

    public final void zze(float f4) {
        zza();
        int i7 = this.zzc;
        float[] fArr = this.zzb;
        if (i7 == fArr.length) {
            float[] fArr2 = new float[c.b(i7, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i7);
            this.zzb = fArr2;
        }
        float[] fArr3 = this.zzb;
        int i10 = this.zzc;
        this.zzc = i10 + 1;
        fArr3[i10] = f4;
    }
}
