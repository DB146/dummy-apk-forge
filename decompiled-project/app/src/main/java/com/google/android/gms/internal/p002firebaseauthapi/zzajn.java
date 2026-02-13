package com.google.android.gms.internal.p002firebaseauthapi;

import X.c;
import com.google.android.gms.common.api.f;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes.dex */
final class zzajn extends zzajj<Boolean> implements zzalc<Boolean>, RandomAccess {
    private static final boolean[] zza;
    private boolean[] zzb;
    private int zzc;

    static {
        boolean[] zArr = new boolean[0];
        zza = zArr;
        new zzajn(zArr, 0, false);
    }

    public zzajn() {
        this(zza, 0, true);
    }

    private zzajn(boolean[] zArr, int i7, boolean z8) {
        super(z8);
        this.zzb = zArr;
        this.zzc = i7;
    }

    private static int zzc(int i7) {
        return Math.max(((i7 * 3) / 2) + 1, 10);
    }

    private final String zzd(int i7) {
        return c.e(i7, this.zzc, "Index:", ", Size:");
    }

    private final void zze(int i7) {
        if (i7 < 0 || i7 >= this.zzc) {
            throw new IndexOutOfBoundsException(zzd(i7));
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajj, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i7, Object obj) {
        int i10;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        zza();
        if (i7 < 0 || i7 > (i10 = this.zzc)) {
            throw new IndexOutOfBoundsException(zzd(i7));
        }
        boolean[] zArr = this.zzb;
        if (i10 < zArr.length) {
            System.arraycopy(zArr, i7, zArr, i7 + 1, i10 - i7);
        } else {
            boolean[] zArr2 = new boolean[zzc(zArr.length)];
            System.arraycopy(this.zzb, 0, zArr2, 0, i7);
            System.arraycopy(this.zzb, i7, zArr2, i7 + 1, this.zzc - i7);
            this.zzb = zArr2;
        }
        this.zzb[i7] = booleanValue;
        this.zzc++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajj, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(Object obj) {
        zza(((Boolean) obj).booleanValue());
        return true;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajj, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Boolean> collection) {
        zza();
        zzalb.zza(collection);
        if (!(collection instanceof zzajn)) {
            return super.addAll(collection);
        }
        zzajn zzajnVar = (zzajn) collection;
        int i7 = zzajnVar.zzc;
        if (i7 == 0) {
            return false;
        }
        int i10 = this.zzc;
        if (f.API_PRIORITY_OTHER - i10 < i7) {
            throw new OutOfMemoryError();
        }
        int i11 = i10 + i7;
        boolean[] zArr = this.zzb;
        if (i11 > zArr.length) {
            this.zzb = Arrays.copyOf(zArr, i11);
        }
        System.arraycopy(zzajnVar.zzb, 0, this.zzb, this.zzc, zzajnVar.zzc);
        this.zzc = i11;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajj, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzajn)) {
            return super.equals(obj);
        }
        zzajn zzajnVar = (zzajn) obj;
        if (this.zzc != zzajnVar.zzc) {
            return false;
        }
        boolean[] zArr = zzajnVar.zzb;
        for (int i7 = 0; i7 < this.zzc; i7++) {
            if (this.zzb[i7] != zArr[i7]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i7) {
        return Boolean.valueOf(zzb(i7));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajj, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i7 = 1;
        for (int i10 = 0; i10 < this.zzc; i10++) {
            i7 = (i7 * 31) + zzalb.zza(this.zzb[i10]);
        }
        return i7;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int size = size();
        for (int i7 = 0; i7 < size; i7++) {
            if (this.zzb[i7] == booleanValue) {
                return i7;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajj, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i7) {
        zza();
        zze(i7);
        boolean[] zArr = this.zzb;
        boolean z8 = zArr[i7];
        if (i7 < this.zzc - 1) {
            System.arraycopy(zArr, i7 + 1, zArr, i7, (r2 - i7) - 1);
        }
        this.zzc--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z8);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i7, int i10) {
        zza();
        if (i10 < i7) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        boolean[] zArr = this.zzb;
        System.arraycopy(zArr, i10, zArr, i7, this.zzc - i10);
        this.zzc -= i10 - i7;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajj, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i7, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        zza();
        zze(i7);
        boolean[] zArr = this.zzb;
        boolean z8 = zArr[i7];
        zArr[i7] = booleanValue;
        return Boolean.valueOf(z8);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalc
    public final /* synthetic */ zzalc<Boolean> zza(int i7) {
        if (i7 >= this.zzc) {
            return new zzajn(i7 == 0 ? zza : Arrays.copyOf(this.zzb, i7), this.zzc, true);
        }
        throw new IllegalArgumentException();
    }

    public final void zza(boolean z8) {
        zza();
        int i7 = this.zzc;
        boolean[] zArr = this.zzb;
        if (i7 == zArr.length) {
            boolean[] zArr2 = new boolean[zzc(zArr.length)];
            System.arraycopy(this.zzb, 0, zArr2, 0, this.zzc);
            this.zzb = zArr2;
        }
        boolean[] zArr3 = this.zzb;
        int i10 = this.zzc;
        this.zzc = i10 + 1;
        zArr3[i10] = z8;
    }

    public final boolean zzb(int i7) {
        zze(i7);
        return this.zzb[i7];
    }
}
